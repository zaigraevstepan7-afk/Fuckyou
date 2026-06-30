package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: M0.t */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0214t extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final int f711a;

    /* JADX INFO: renamed from: b */
    public final TextView f712b;

    /* JADX INFO: renamed from: c */
    public final int f713c;

    /* JADX INFO: renamed from: d */
    public final TextView f714d;

    /* JADX INFO: renamed from: e */
    public final C0216v f715e;

    static {
        ZLoader.registerNativesForClass(46, C0214t.class);
        Hidden0.special_clinit_46_00(C0214t.class);
    }

    public C0214t(C0216v c0216v, int i2, TextView textView, int i3, TextView textView2) {
        this.f715e = c0216v;
        this.f711a = i2;
        this.f712b = textView;
        this.f713c = i3;
        this.f714d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final native void onAnimationEnd(Animator animator);

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final native void onAnimationStart(Animator animator);
}
