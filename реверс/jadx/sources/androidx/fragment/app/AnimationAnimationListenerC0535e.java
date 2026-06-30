package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p023M0.RunnableC0191D;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0535e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0528S f1714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f1715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f1716c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0536f f1717d;

    public AnimationAnimationListenerC0535e(View view, ViewGroup viewGroup, C0536f c0536f, C0528S c0528s) {
        this.f1714a = c0528s;
        this.f1715b = viewGroup;
        this.f1716c = view;
        this.f1717d = c0536f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1715b.post(new RunnableC0191D(4, this));
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1714a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1714a + " has reached onAnimationStart.");
        }
    }
}
