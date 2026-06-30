package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zd1 implements Runnable {
    public n90 e;
    public o90 f;
    public Handler g;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.e.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.g.post(new pi(2, this.f, objCall));
    }
}
