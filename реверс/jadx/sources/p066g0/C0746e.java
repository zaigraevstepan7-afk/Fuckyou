package p066g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: g0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0746e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2962a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0741b0 f2963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f2964c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f2965d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0756j f2966e;

    public C0746e(C0756j c0756j, AbstractC0741b0 abstractC0741b0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2966e = c0756j;
        this.f2963b = abstractC0741b0;
        this.f2965d = viewPropertyAnimator;
        this.f2964c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2962a) {
            case 1:
                this.f2964c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2962a) {
            case 0:
                this.f2965d.setListener(null);
                this.f2964c.setAlpha(1.0f);
                C0756j c0756j = this.f2966e;
                AbstractC0741b0 abstractC0741b0 = this.f2963b;
                c0756j.m1979c(abstractC0741b0);
                c0756j.f3024q.remove(abstractC0741b0);
                c0756j.m2076i();
                break;
            default:
                this.f2965d.setListener(null);
                C0756j c0756j2 = this.f2966e;
                AbstractC0741b0 abstractC0741b02 = this.f2963b;
                c0756j2.m1979c(abstractC0741b02);
                c0756j2.f3022o.remove(abstractC0741b02);
                c0756j2.m2076i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2962a) {
            case 0:
                this.f2966e.getClass();
                break;
            default:
                this.f2966e.getClass();
                break;
        }
    }

    public C0746e(C0756j c0756j, AbstractC0741b0 abstractC0741b0, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2966e = c0756j;
        this.f2963b = abstractC0741b0;
        this.f2964c = view;
        this.f2965d = viewPropertyAnimator;
    }
}
