package p018K;

import android.os.Process;

/* JADX INFO: renamed from: K.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0156l extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f491a;

    public C0156l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f491a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f491a);
        super.run();
    }
}
