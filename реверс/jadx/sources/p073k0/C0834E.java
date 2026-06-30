package p073k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: k0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0834E extends AnimatorListenerAdapter implements InterfaceC0847k {

    /* JADX INFO: renamed from: a */
    public final View f3400a;

    /* JADX INFO: renamed from: b */
    public final int f3401b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f3402c;

    /* JADX INFO: renamed from: e */
    public boolean f3404e;

    /* JADX INFO: renamed from: f */
    public boolean f3405f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f3403d = true;

    public C0834E(View view, int i2) {
        this.f3400a = view;
        this.f3401b = i2;
        this.f3402c = (ViewGroup) view.getParent();
        m2217h(true);
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: a */
    public final void mo2210a() {
        m2217h(false);
        if (this.f3405f) {
            return;
        }
        AbstractC0859w.m2266b(this.f3400a, this.f3401b);
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: b */
    public final void mo2211b(AbstractC0849m abstractC0849m) {
        abstractC0849m.mo2234x(this);
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: c */
    public final void mo2212c() {
        m2217h(true);
        if (this.f3405f) {
            return;
        }
        AbstractC0859w.m2266b(this.f3400a, 0);
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: d */
    public final void mo2213d(AbstractC0849m abstractC0849m) {
        throw null;
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: e */
    public final void mo2214e(AbstractC0849m abstractC0849m) {
        abstractC0849m.mo2234x(this);
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: g */
    public final void mo2216g(AbstractC0849m abstractC0849m) {
    }

    /* JADX INFO: renamed from: h */
    public final void m2217h(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f3403d || this.f3404e == z2 || (viewGroup = this.f3402c) == null) {
            return;
        }
        this.f3404e = z2;
        AbstractC0383m.m1045k0(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3405f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3405f) {
            AbstractC0859w.m2266b(this.f3400a, this.f3401b);
            ViewGroup viewGroup = this.f3402c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2217h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            AbstractC0859w.m2266b(this.f3400a, 0);
            ViewGroup viewGroup = this.f3402c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f3405f) {
            AbstractC0859w.m2266b(this.f3400a, this.f3401b);
            ViewGroup viewGroup = this.f3402c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2217h(false);
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: f */
    public final void mo2215f(AbstractC0849m abstractC0849m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
