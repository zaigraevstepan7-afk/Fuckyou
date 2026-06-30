package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import p004C.RunnableC0020a;
import p060e.AbstractActivityC0669k;

/* JADX INFO: renamed from: androidx.activity.j */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0465j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: b */
    public Runnable f1175b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractActivityC0669k f1177d;

    /* JADX INFO: renamed from: a */
    public final long f1174a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: c */
    public boolean f1176c = false;

    public ExecutorC0465j(AbstractActivityC0669k abstractActivityC0669k) {
        this.f1177d = abstractActivityC0669k;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1175b = runnable;
        View decorView = this.f1177d.getWindow().getDecorView();
        if (!this.f1176c) {
            decorView.postOnAnimation(new RunnableC0020a(7, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1175b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1174a) {
                this.f1176c = false;
                this.f1177d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1175b = null;
        C0468m c0468m = this.f1177d.f1185i;
        synchronized (c0468m.f1199b) {
            z2 = c0468m.f1198a;
        }
        if (z2) {
            this.f1176c = false;
            this.f1177d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1177d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
