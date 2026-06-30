package p073k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.reddit.frontpage.R;
import p015I0.C0109e;

/* JADX INFO: renamed from: k0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0843g extends AnimatorListenerAdapter implements InterfaceC0847k {

    /* JADX INFO: renamed from: a */
    public final View f3438a;

    /* JADX INFO: renamed from: b */
    public boolean f3439b = false;

    public C0843g(View view) {
        this.f3438a = view;
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: a */
    public final void mo2210a() {
        View view = this.f3438a;
        view.setTag(R.id.resc, Float.valueOf(view.getVisibility() == 0 ? AbstractC0859w.f3492a.mo462g(view) : 0.0f));
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: b */
    public final void mo2211b(AbstractC0849m abstractC0849m) {
        throw null;
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: c */
    public final void mo2212c() {
        this.f3438a.setTag(R.id.resc, null);
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: d */
    public final void mo2213d(AbstractC0849m abstractC0849m) {
        throw null;
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: e */
    public final void mo2214e(AbstractC0849m abstractC0849m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0859w.f3492a.mo466p(this.f3438a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3438a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3439b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3439b;
        View view = this.f3438a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0109e c0109e = AbstractC0859w.f3492a;
        c0109e.mo466p(view, 1.0f);
        c0109e.getClass();
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: f */
    public final void mo2215f(AbstractC0849m abstractC0849m) {
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: g */
    public final void mo2216g(AbstractC0849m abstractC0849m) {
    }
}
