package p066g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: g0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0760l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f3039a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0762m f3040b;

    public C0760l(C0762m c0762m) {
        this.f3040b = c0762m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3039a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3039a) {
            this.f3039a = false;
            return;
        }
        C0762m c0762m = this.f3040b;
        if (((Float) c0762m.f3074z.getAnimatedValue()).floatValue() == 0.0f) {
            c0762m.f3047A = 0;
            c0762m.m2096f(0);
        } else {
            c0762m.f3047A = 2;
            c0762m.f3067s.invalidate();
        }
    }
}
