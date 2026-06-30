package p024N;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p073k0.AbstractC0849m;
import p084q.C1027f;

/* JADX INFO: renamed from: N.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0257e0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f807a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f809c;

    public C0257e0(C0269k0 c0269k0, View view) {
        this.f808b = c0269k0;
        this.f809c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f807a) {
            case 0:
                ((C0269k0) this.f808b).f834a.mo836d(1.0f);
                C0261g0.m820e((View) this.f809c);
                break;
            default:
                ((C1027f) this.f808b).remove(animator);
                ((AbstractC0849m) this.f809c).f3470n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f807a) {
            case 1:
                ((AbstractC0849m) this.f809c).f3470n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0257e0(AbstractC0849m abstractC0849m, C1027f c1027f) {
        this.f809c = abstractC0849m;
        this.f808b = c1027f;
    }
}
