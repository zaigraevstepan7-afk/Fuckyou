package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class PendingJob extends JobImpl {
    private final boolean isSU;
    private boolean retry = true;

    PendingJob(boolean su) {
        this.isSU = su;
        to(NOPList.getInstance());
    }

    @Override // com.topjohnwu.superuser.internal.JobImpl, com.topjohnwu.superuser.Shell.Job
    public Shell.Result exec() {
        try {
            this.shell = MainShell.get();
            if (this.isSU && !this.shell.isRoot()) {
                close();
                return ResultImpl.INSTANCE;
            }
            if (this.out instanceof NOPList) {
                this.out = new ArrayList();
            }
            Shell.Result res = super.exec();
            if (this.retry && res == ResultImpl.SHELL_ERR) {
                this.retry = false;
                return exec();
            }
            return res;
        } catch (NoShellException e) {
            close();
            return ResultImpl.INSTANCE;
        }
    }

    @Override // com.topjohnwu.superuser.internal.JobImpl, com.topjohnwu.superuser.Shell.Job
    public void submit(final Executor executor, final Shell.ResultCallback cb) {
        MainShell.get(null, new Shell.GetShellCallback() { // from class: com.topjohnwu.superuser.internal.PendingJob$$ExternalSyntheticLambda0
            @Override // com.topjohnwu.superuser.Shell.GetShellCallback
            public final void onShell(Shell shell) {
                this.f$0.m69lambda$submit$1$comtopjohnwusuperuserinternalPendingJob(executor, cb, shell);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$submit$1$com-topjohnwu-superuser-internal-PendingJob, reason: not valid java name */
    /* synthetic */ void m69lambda$submit$1$comtopjohnwusuperuserinternalPendingJob(final Executor executor, final Shell.ResultCallback cb, Shell s) {
        if (this.isSU && !s.isRoot()) {
            close();
            ResultImpl.INSTANCE.callback(executor, cb);
        } else {
            if (this.out instanceof NOPList) {
                this.out = cb == null ? null : new ArrayList();
            }
            this.shell = (ShellImpl) s;
            super.submit(executor, new Shell.ResultCallback() { // from class: com.topjohnwu.superuser.internal.PendingJob$$ExternalSyntheticLambda1
                @Override // com.topjohnwu.superuser.Shell.ResultCallback
                public final void onResult(Shell.Result result) {
                    this.f$0.m68lambda$submit$0$comtopjohnwusuperuserinternalPendingJob(executor, cb, result);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$submit$0$com-topjohnwu-superuser-internal-PendingJob, reason: not valid java name */
    /* synthetic */ void m68lambda$submit$0$comtopjohnwusuperuserinternalPendingJob(Executor executor, Shell.ResultCallback cb, Shell.Result res) {
        if (this.retry && res == ResultImpl.SHELL_ERR) {
            this.retry = false;
            submit(executor, cb);
        } else if (cb != null) {
            cb.onResult(res);
        }
    }
}
