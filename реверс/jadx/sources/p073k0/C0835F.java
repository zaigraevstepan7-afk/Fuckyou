package p073k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.reddit.frontpage.R;

/* JADX INFO: renamed from: k0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0835F extends AnimatorListenerAdapter implements InterfaceC0847k {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f3406a;

    /* JADX INFO: renamed from: b */
    public final View f3407b;

    /* JADX INFO: renamed from: c */
    public final View f3408c;

    /* JADX INFO: renamed from: d */
    public boolean f3409d = true;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0844h f3410e;

    public C0835F(C0844h c0844h, FrameLayout frameLayout, View view, View view2) {
        this.f3410e = c0844h;
        this.f3406a = frameLayout;
        this.f3407b = view;
        this.f3408c = view2;
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: b */
    public final void mo2211b(AbstractC0849m abstractC0849m) {
        abstractC0849m.mo2234x(this);
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
    /* JADX INFO: renamed from: f */
    public final void mo2215f(AbstractC0849m abstractC0849m) {
        if (this.f3409d) {
            m2218h();
        }
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: g */
    public final void mo2216g(AbstractC0849m abstractC0849m) {
    }

    /* JADX INFO: renamed from: h */
    public final void m2218h() {
        this.f3408c.setTag(R.id.resc, null);
        this.f3406a.getOverlay().remove(this.f3407b);
        this.f3409d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2218h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3406a.getOverlay().remove(this.f3407b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3407b;
        if (view.getParent() == null) {
            this.f3406a.getOverlay().add(view);
        } else {
            this.f3410e.mo2227c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3408c;
            View view2 = this.f3407b;
            view.setTag(R.id.resc, view2);
            this.f3406a.getOverlay().add(view2);
            this.f3409d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        m2218h();
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: a */
    public final void mo2210a() {
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: c */
    public final void mo2212c() {
    }
}
