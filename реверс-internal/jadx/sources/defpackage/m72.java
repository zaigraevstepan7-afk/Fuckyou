package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m72 extends AnimatorListenerAdapter {
    public final /* synthetic */ t72 a;
    public final /* synthetic */ View b;

    public m72(t72 t72Var, View view) {
        this.a = t72Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t72 t72Var = this.a;
        t72Var.a.d(1.0f);
        p72.e(t72Var, this.b);
    }
}
