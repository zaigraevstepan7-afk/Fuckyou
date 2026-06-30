package p066g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: g0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0748f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0741b0 f2969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f2971c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2972d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f2973e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0756j f2974f;

    public C0748f(C0756j c0756j, AbstractC0741b0 abstractC0741b0, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2974f = c0756j;
        this.f2969a = abstractC0741b0;
        this.f2970b = i2;
        this.f2971c = view;
        this.f2972d = i3;
        this.f2973e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i2 = this.f2970b;
        View view = this.f2971c;
        if (i2 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2972d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2973e.setListener(null);
        C0756j c0756j = this.f2974f;
        AbstractC0741b0 abstractC0741b0 = this.f2969a;
        c0756j.m1979c(abstractC0741b0);
        c0756j.f3023p.remove(abstractC0741b0);
        c0756j.m2076i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2974f.getClass();
    }
}
