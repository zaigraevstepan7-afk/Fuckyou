package com.topjohnwu.superuser;

import android.content.Context;
import com.topjohnwu.superuser.internal.BuilderImpl;
import com.topjohnwu.superuser.internal.MainShell;
import com.topjohnwu.superuser.internal.UiThreadHandler;
import com.topjohnwu.superuser.internal.Utils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class Shell implements Closeable {
    public static final int FLAG_MOUNT_MASTER = 2;
    public static final int FLAG_NON_ROOT_SHELL = 1;
    public static final int FLAG_REDIRECT_STDERR = 8;
    public static final int NON_ROOT_SHELL = 0;

    @Deprecated
    public static final int ROOT_MOUNT_MASTER = 2;
    public static final int ROOT_SHELL = 1;
    public static final int UNKNOWN = -1;
    public static ExecutorService EXECUTOR = Executors.newCachedThreadPool();
    public static boolean enableVerboseLogging = false;

    public interface GetShellCallback {
        void onShell(Shell shell);
    }

    public interface ResultCallback {
        void onResult(Result result);
    }

    public interface Task {
        void run(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) throws IOException;
    }

    public abstract void execTask(Task task) throws IOException;

    public abstract int getStatus();

    public abstract boolean isAlive();

    public abstract Job newJob();

    public abstract boolean waitAndClose(long j, TimeUnit timeUnit) throws InterruptedException, IOException;

    public static void setDefaultBuilder(Builder builder) {
        MainShell.setBuilder(builder);
    }

    public static Shell getShell() {
        return MainShell.get();
    }

    public static void getShell(GetShellCallback callback) {
        MainShell.get(UiThreadHandler.executor, callback);
    }

    public static void getShell(Executor executor, GetShellCallback callback) {
        MainShell.get(executor, callback);
    }

    public static Shell getCachedShell() {
        return MainShell.getCached();
    }

    public static Boolean isAppGrantedRoot() {
        return Utils.isAppGrantedRoot();
    }

    public static Job cmd(String... commands) {
        return MainShell.newJob(false, commands);
    }

    public static Job cmd(InputStream in) {
        return MainShell.newJob(false, in);
    }

    public boolean isRoot() {
        return getStatus() >= 1;
    }

    public void waitAndClose() throws IOException {
        while (!waitAndClose(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
        }
    }

    public static abstract class Builder {
        public abstract Shell build();

        public abstract Shell build(Process process);

        public abstract Shell build(String... strArr);

        public abstract Builder setFlags(int i);

        public abstract Builder setTimeout(long j);

        public static Builder create() {
            return new BuilderImpl();
        }

        @SafeVarargs
        public final Builder setInitializers(Class<? extends Initializer>... classes) {
            ((BuilderImpl) this).setInitializersImpl(classes);
            return this;
        }

        public final Builder setContext(Context context) {
            Utils.setContext(context);
            return this;
        }
    }

    public static abstract class Result {
        public static final int JOB_NOT_EXECUTED = -1;

        public abstract int getCode();

        public abstract List<String> getErr();

        public abstract List<String> getOut();

        public boolean isSuccess() {
            return getCode() == 0;
        }
    }

    public static abstract class Job {
        public abstract Job add(InputStream inputStream);

        public abstract Job add(String... strArr);

        public abstract Future<Result> enqueue();

        public abstract Result exec();

        public abstract void submit(Executor executor, ResultCallback resultCallback);

        public abstract Job to(List<String> list);

        public abstract Job to(List<String> list, List<String> list2);

        public final void submit() {
            submit(null);
        }

        public final void submit(ResultCallback cb) {
            submit(UiThreadHandler.executor, cb);
        }
    }

    public static class Initializer {
        public boolean onInit(Context context, Shell shell) {
            return true;
        }
    }

    @Deprecated
    public static Job su(String... commands) {
        return MainShell.newJob(true, commands);
    }

    @Deprecated
    public static Job sh(String... commands) {
        return MainShell.newJob(false, commands);
    }

    @Deprecated
    public static Job su(InputStream in) {
        return MainShell.newJob(true, in);
    }

    @Deprecated
    public static Job sh(InputStream in) {
        return MainShell.newJob(false, in);
    }

    @Deprecated
    public static boolean rootAccess() {
        return Objects.equals(isAppGrantedRoot(), Boolean.TRUE);
    }
}
