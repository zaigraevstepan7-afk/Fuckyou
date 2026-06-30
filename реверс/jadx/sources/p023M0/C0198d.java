package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: M0.d */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0198d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final int f643a;

    /* JADX INFO: renamed from: b */
    public final C0199e f644b;

    static {
        ZLoader.registerNativesForClass(30, C0198d.class);
        Hidden0.special_clinit_30_00(C0198d.class);
    }

    public /* synthetic */ C0198d(C0199e c0199e, int i2) {
        this.f643a = i2;
        this.f644b = c0199e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public native void onAnimationEnd(Animator animator);

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public native void onAnimationStart(Animator animator);
}
