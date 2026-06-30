package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0534d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f1709a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1710b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f1711c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0528S f1712d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0536f f1713e;

    public C0534d(ViewGroup viewGroup, View view, boolean z2, C0528S c0528s, C0536f c0536f) {
        this.f1709a = viewGroup;
        this.f1710b = view;
        this.f1711c = z2;
        this.f1712d = c0528s;
        this.f1713e = c0536f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1709a;
        View view = this.f1710b;
        viewGroup.endViewTransition(view);
        C0528S c0528s = this.f1712d;
        if (this.f1711c) {
            AbstractC0529T.m1412a(view, c0528s.f1667a);
        }
        this.f1713e.m1427d();
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Animator from operation " + c0528s + " has ended.");
        }
    }
}
