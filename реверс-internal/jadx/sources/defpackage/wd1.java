package defpackage;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wd1 extends Thread {
    public final int e;

    public wd1(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.e = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.e);
        super.run();
    }
}
