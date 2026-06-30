package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p000A.C0001b;
import p061e0.AbstractC0690f;
import p061e0.ExecutorC0688d;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0690f.m1941t(context, new ExecutorC0688d(), new C0001b(21, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C0001b c0001b = new C0001b(21, this);
                try {
                    AbstractC0690f.m1926e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c0001b.mo50o(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e2) {
                    c0001b.mo50o(7, e2);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C0001b c0001b2 = new C0001b(21, this);
            if (Build.VERSION.SDK_INT < 24) {
                c0001b2.mo50o(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                c0001b2.mo50o(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C0001b c0001b3 = new C0001b(21, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            c0001b3.mo50o(16, null);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (AbstractC0690f.m1924c(i2 >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : i2 >= 24 ? context.createDeviceProtectedStorageContext().getCodeCacheDir() : i2 == 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            c0001b3.mo50o(14, null);
        } else {
            c0001b3.mo50o(15, null);
        }
    }
}
