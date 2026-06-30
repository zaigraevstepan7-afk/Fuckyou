package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n72 implements Runnable {
    public final /* synthetic */ View e;
    public final /* synthetic */ t72 f;
    public final /* synthetic */ n81 g;
    public final /* synthetic */ ValueAnimator h;

    public n72(View view, t72 t72Var, n81 n81Var, ValueAnimator valueAnimator) {
        this.e = view;
        this.f = t72Var;
        this.g = n81Var;
        this.h = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p72.h(this.e, this.f, this.g);
        this.h.start();
    }
}
