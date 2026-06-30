package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n11 {
    public final Runnable a;
    public final jv1 b = new jv1(new p7(12, this));

    public n11(Runnable runnable) {
        this.a = runnable;
    }

    public final wy0 a() {
        return ((l11) this.b.getValue()).c;
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().c(new d11(onBackInvokedDispatcher, 0), 1);
        a().c(new h11(onBackInvokedDispatcher, 1000000), 0);
    }
}
