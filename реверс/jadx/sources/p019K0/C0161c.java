package p019K0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p024N.InterfaceC0251b0;

/* JADX INFO: renamed from: K0.c */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0161c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final int f499a;

    /* JADX INFO: renamed from: b */
    public final Object f500b;

    static {
        ZLoader.registerNativesForClass(14, C0161c.class);
        Hidden0.special_clinit_14_00(C0161c.class);
    }

    public /* synthetic */ C0161c(int i2, Object obj) {
        this.f499a = i2;
        this.f500b = obj;
    }

    public C0161c(InterfaceC0251b0 interfaceC0251b0, View view) {
        this.f499a = 2;
        this.f500b = interfaceC0251b0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public native void onAnimationCancel(Animator animator);

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final native void onAnimationEnd(Animator animator);

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public native void onAnimationStart(Animator animator);
}
