package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class ResultImpl extends Shell.Result {
    static ResultImpl INSTANCE = new ResultImpl();
    static ResultImpl SHELL_ERR = new ResultImpl();
    int code = -1;
    List<String> err;
    List<String> out;

    ResultImpl() {
    }

    @Override // com.topjohnwu.superuser.Shell.Result
    public List<String> getOut() {
        return this.out == null ? Collections.emptyList() : this.out;
    }

    @Override // com.topjohnwu.superuser.Shell.Result
    public List<String> getErr() {
        return this.err == null ? Collections.emptyList() : this.err;
    }

    @Override // com.topjohnwu.superuser.Shell.Result
    public int getCode() {
        return this.code;
    }

    void callback(Executor executor, final Shell.ResultCallback cb) {
        if (cb != null) {
            if (executor == null) {
                cb.onResult(this);
            } else {
                executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.ResultImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m70lambda$callback$0$comtopjohnwusuperuserinternalResultImpl(cb);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: lambda$callback$0$com-topjohnwu-superuser-internal-ResultImpl, reason: not valid java name */
    /* synthetic */ void m70lambda$callback$0$comtopjohnwusuperuserinternalResultImpl(Shell.ResultCallback cb) {
        cb.onResult(this);
    }
}
