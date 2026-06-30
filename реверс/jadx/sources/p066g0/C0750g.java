package p066g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: g0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0750g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0752h f2983b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f2984c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f2985d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0756j f2986e;

    public /* synthetic */ C0750g(C0756j c0756j, C0752h c0752h, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f2982a = i2;
        this.f2986e = c0756j;
        this.f2983b = c0752h;
        this.f2984c = viewPropertyAnimator;
        this.f2985d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2982a) {
            case 0:
                this.f2984c.setListener(null);
                View view = this.f2985d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0752h c0752h = this.f2983b;
                AbstractC0741b0 abstractC0741b0 = c0752h.f2988a;
                C0756j c0756j = this.f2986e;
                c0756j.m1979c(abstractC0741b0);
                c0756j.f3025r.remove(c0752h.f2988a);
                c0756j.m2076i();
                break;
            default:
                this.f2984c.setListener(null);
                View view2 = this.f2985d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0752h c0752h2 = this.f2983b;
                AbstractC0741b0 abstractC0741b02 = c0752h2.f2989b;
                C0756j c0756j2 = this.f2986e;
                c0756j2.m1979c(abstractC0741b02);
                c0756j2.f3025r.remove(c0752h2.f2989b);
                c0756j2.m2076i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2982a) {
            case 0:
                AbstractC0741b0 abstractC0741b0 = this.f2983b.f2988a;
                this.f2986e.getClass();
                break;
            default:
                AbstractC0741b0 abstractC0741b02 = this.f2983b.f2989b;
                this.f2986e.getClass();
                break;
        }
    }
}
