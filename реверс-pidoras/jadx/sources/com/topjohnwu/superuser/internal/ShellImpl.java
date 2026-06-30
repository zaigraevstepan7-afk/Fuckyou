package com.topjohnwu.superuser.internal;

import android.text.TextUtils;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.ShellUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class ShellImpl extends Shell {
    private final NoCloseInputStream STDERR;
    private final NoCloseOutputStream STDIN;
    private final NoCloseInputStream STDOUT;
    final ExecutorService executor = new SerialExecutorService();
    private final Process proc;
    final boolean redirect;
    private int status;

    private static class NoCloseInputStream extends FilterInputStream {
        NoCloseInputStream(InputStream in) {
            super(in);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        void close0() throws IOException {
            this.in.close();
        }
    }

    private static class NoCloseOutputStream extends FilterOutputStream {
        NoCloseOutputStream(OutputStream out) {
            super(out instanceof BufferedOutputStream ? out : new BufferedOutputStream(out));
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] b, int off, int len) throws IOException {
            this.out.write(b, off, len);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.out.flush();
        }

        void close0() throws IOException {
            super.close();
        }
    }

    ShellImpl(BuilderImpl builder, Process process) throws IOException {
        this.status = -1;
        this.redirect = builder.hasFlags(8);
        this.proc = process;
        this.STDIN = new NoCloseOutputStream(process.getOutputStream());
        this.STDOUT = new NoCloseInputStream(process.getInputStream());
        this.STDERR = new NoCloseInputStream(process.getErrorStream());
        Future<Integer> check = this.executor.submit(new Callable() { // from class: com.topjohnwu.superuser.internal.ShellImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.shellCheck();
            }
        });
        try {
            try {
                try {
                    try {
                        this.status = check.get(builder.timeout, TimeUnit.SECONDS).intValue();
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        throw new IOException("Unknown ExecutionException", cause);
                    }
                } catch (TimeoutException e2) {
                    throw new IOException("Shell check timeout", e2);
                }
            } catch (InterruptedException e3) {
                throw new IOException("Shell check interrupted", e3);
            }
        } catch (IOException e4) {
            this.executor.shutdownNow();
            release();
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer shellCheck() throws IOException {
        try {
            this.proc.exitValue();
            throw new IOException("Created process has terminated");
        } catch (IllegalThreadStateException e) {
            ShellUtils.cleanInputStream(this.STDOUT);
            ShellUtils.cleanInputStream(this.STDERR);
            int status = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(this.STDOUT));
            try {
                this.STDIN.write("echo SHELL_TEST\n".getBytes(StandardCharsets.UTF_8));
                this.STDIN.flush();
                String s = br.readLine();
                if (TextUtils.isEmpty(s) || !s.contains("SHELL_TEST")) {
                    throw new IOException("Created process is not a shell");
                }
                this.STDIN.write("id\n".getBytes(StandardCharsets.UTF_8));
                this.STDIN.flush();
                String s2 = br.readLine();
                if (!TextUtils.isEmpty(s2) && s2.contains("uid=0")) {
                    status = 1;
                    Utils.setConfirmedRootState(true);
                    String cwd = ShellUtils.escapedString(System.getProperty("user.dir"));
                    this.STDIN.write(("cd " + cwd + "\n").getBytes(StandardCharsets.UTF_8));
                    this.STDIN.flush();
                }
                br.close();
                return Integer.valueOf(status);
            } catch (Throwable th) {
                try {
                    br.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void release() {
        this.status = -1;
        try {
            this.STDIN.close0();
        } catch (IOException e) {
        }
        try {
            this.STDERR.close0();
        } catch (IOException e2) {
        }
        try {
            this.STDOUT.close0();
        } catch (IOException e3) {
        }
        this.proc.destroy();
    }

    @Override // com.topjohnwu.superuser.Shell
    public boolean waitAndClose(long timeout, TimeUnit unit) throws InterruptedException {
        if (this.status < 0) {
            return true;
        }
        this.executor.shutdown();
        if (this.executor.awaitTermination(timeout, unit)) {
            release();
            return true;
        }
        this.status = -1;
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.status < 0) {
            return;
        }
        this.executor.shutdownNow();
        release();
    }

    @Override // com.topjohnwu.superuser.Shell
    public int getStatus() {
        return this.status;
    }

    @Override // com.topjohnwu.superuser.Shell
    public boolean isAlive() {
        if (this.status < 0) {
            return false;
        }
        try {
            this.proc.exitValue();
            return false;
        } catch (IllegalThreadStateException e) {
            return true;
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public synchronized void execTask(Shell.Task task) throws IOException {
        if (this.status < 0) {
            throw new ShellTerminatedException();
        }
        ShellUtils.cleanInputStream(this.STDOUT);
        ShellUtils.cleanInputStream(this.STDERR);
        try {
            this.STDIN.write(10);
            this.STDIN.flush();
            task.run(this.STDIN, this.STDOUT, this.STDERR);
        } catch (IOException e) {
            release();
            throw new ShellTerminatedException();
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public Shell.Job newJob() {
        return new JobImpl(this);
    }
}
