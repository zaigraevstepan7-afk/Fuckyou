package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.StreamGobbler;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
class JobImpl extends Shell.Job implements Shell.Task, Closeable {
    static final int UUID_LEN = 36;
    protected List<String> out;
    protected ShellImpl shell;
    private static final List<String> UNSET_ERR = new ArrayList(0);
    static final String END_UUID = UUID.randomUUID().toString();
    static final byte[] END_CMD = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", END_UUID).getBytes(StandardCharsets.UTF_8);
    private final List<ShellInputSource> sources = new ArrayList();
    private final ResultImpl result = new ResultImpl();
    protected List<String> err = UNSET_ERR;

    JobImpl() {
    }

    JobImpl(ShellImpl s) {
        this.shell = s;
    }

    @Override // com.topjohnwu.superuser.Shell.Task
    public void run(OutputStream stdin, InputStream stdout, InputStream stderr) throws IOException {
        Future<Integer> outGobbler = Shell.EXECUTOR.submit(new StreamGobbler.OUT(stdout, this.result.out));
        Future<Void> errGobbler = Shell.EXECUTOR.submit(new StreamGobbler.ERR(stderr, this.result.err));
        for (ShellInputSource src : this.sources) {
            src.serve(stdin);
        }
        stdin.write(END_CMD);
        stdin.flush();
        try {
            this.result.code = outGobbler.get().intValue();
            errGobbler.get();
        } catch (InterruptedException | ExecutionException e) {
            throw ((InterruptedIOException) new InterruptedIOException().initCause(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResultImpl exec0() {
        boolean noErr = this.err == UNSET_ERR;
        this.result.out = this.out;
        this.result.err = noErr ? null : this.err;
        if (noErr && this.shell.redirect) {
            this.result.err = this.out;
        }
        if (this.result.out != null && this.result.out == this.result.err && !Utils.isSynchronized(this.result.out)) {
            List<String> list = Collections.synchronizedList(this.result.out);
            this.result.out = list;
            this.result.err = list;
        }
        try {
            try {
                this.shell.execTask(this);
                close();
                this.result.out = this.out;
                this.result.err = noErr ? null : this.err;
                return this.result;
            } catch (IOException e) {
                if (e instanceof ShellTerminatedException) {
                    ResultImpl resultImpl = ResultImpl.SHELL_ERR;
                    close();
                    this.result.out = this.out;
                    this.result.err = noErr ? null : this.err;
                    return resultImpl;
                }
                Utils.err(e);
                ResultImpl resultImpl2 = ResultImpl.INSTANCE;
                close();
                this.result.out = this.out;
                this.result.err = noErr ? null : this.err;
                return resultImpl2;
            }
        } catch (Throwable th) {
            close();
            this.result.out = this.out;
            this.result.err = noErr ? null : this.err;
            throw th;
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Result exec() {
        return exec0();
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Future<Shell.Result> enqueue() {
        FutureTask<Shell.Result> future = new FutureTask<>(new Callable() { // from class: com.topjohnwu.superuser.internal.JobImpl$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.exec0();
            }
        });
        this.shell.executor.execute(future);
        return future;
    }

    /* JADX INFO: renamed from: lambda$submit$0$com-topjohnwu-superuser-internal-JobImpl, reason: not valid java name */
    /* synthetic */ void m67lambda$submit$0$comtopjohnwusuperuserinternalJobImpl(Executor executor, Shell.ResultCallback cb) {
        exec0().callback(executor, cb);
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public void submit(final Executor executor, final Shell.ResultCallback cb) {
        this.shell.executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.JobImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m67lambda$submit$0$comtopjohnwusuperuserinternalJobImpl(executor, cb);
            }
        });
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job to(List<String> output) {
        this.out = output;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job to(List<String> stdout, List<String> stderr) {
        this.out = stdout;
        this.err = stderr;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job add(InputStream in) {
        if (in != null) {
            this.sources.add(new InputStreamSource(in));
        }
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job add(String... cmds) {
        if (cmds != null && cmds.length > 0) {
            this.sources.add(new CommandSource(cmds));
        }
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (ShellInputSource src : this.sources) {
            src.close();
        }
    }
}
