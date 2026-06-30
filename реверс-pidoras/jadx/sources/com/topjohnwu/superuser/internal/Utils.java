package com.topjohnwu.superuser.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Process;
import android.util.ArraySet;
import android.util.Log;
import com.topjohnwu.superuser.Shell;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Utils {
    private static final String TAG = "LIBSU";
    public static Context context;
    private static int currentRootState = -1;
    private static Class<?> synchronizedCollectionClass;

    public static void log(Object log) {
        log(TAG, log);
    }

    public static void log(String tag, Object log) {
        if (vLog()) {
            Log.d(tag, log.toString());
        }
    }

    public static void ex(Throwable t) {
        if (vLog()) {
            Log.d(TAG, "", t);
        }
    }

    public static void err(Throwable t) {
        err(TAG, t);
    }

    public static void err(String tag, Throwable t) {
        Log.d(tag, "", t);
    }

    public static boolean vLog() {
        return Shell.enableVerboseLogging;
    }

    public static void setContext(Context c) {
        Context c2 = getContextImpl(c);
        Context app = c2.getApplicationContext();
        if (app != null) {
            c2 = app;
        }
        context = getContextImpl(c2);
    }

    public static Context getContext() {
        if (context == null) {
            try {
                Context c = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                context = getContextImpl(c);
            } catch (Exception e) {
                err(e);
            }
        }
        return context;
    }

    public static Context getDeContext() {
        Context ctx = getContext();
        return ctx.createDeviceProtectedStorageContext();
    }

    public static Context getContextImpl(Context context2) {
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        return context2;
    }

    public static boolean hasStartupAgents(Context context2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        File agents = new File(context2.getCodeCacheDir(), "startup_agents");
        return agents.isDirectory();
    }

    public static boolean isSynchronized(Collection<?> collection) {
        if (synchronizedCollectionClass == null) {
            synchronizedCollectionClass = Collections.synchronizedCollection(NOPList.getInstance()).getClass();
        }
        return synchronizedCollectionClass.isInstance(collection);
    }

    public static long pump(InputStream in, OutputStream out) throws IOException {
        long total = 0;
        byte[] buf = new byte[65536];
        while (true) {
            int read = in.read(buf);
            if (read > 0) {
                out.write(buf, 0, read);
                total += (long) read;
            } else {
                return total;
            }
        }
    }

    static <E> Set<E> newArraySet() {
        return new ArraySet();
    }

    public static synchronized Boolean isAppGrantedRoot() {
        if (currentRootState < 0) {
            if (Process.myUid() == 0) {
                currentRootState = 2;
                return true;
            }
            for (String path : System.getenv("PATH").split(":")) {
                File su = new File(path, "su");
                if (su.canExecute()) {
                    currentRootState = 1;
                    return null;
                }
            }
            currentRootState = 0;
            return false;
        }
        switch (currentRootState) {
            case 0:
                return false;
            case 1:
            default:
                return null;
            case 2:
                return true;
        }
    }

    static synchronized void setConfirmedRootState(boolean value) {
        currentRootState = value ? 2 : 0;
    }

    public static boolean isRootImpossible() {
        return Objects.equals(isAppGrantedRoot(), Boolean.FALSE);
    }

    public static boolean isMainShellRoot() {
        return MainShell.get().isRoot();
    }

    public static boolean isProcess64Bit() {
        return Process.is64Bit();
    }
}
