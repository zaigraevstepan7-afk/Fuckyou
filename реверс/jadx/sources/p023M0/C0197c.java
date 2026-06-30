package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: M0.c */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0197c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final int f641a;

    /* JADX INFO: renamed from: b */
    public final C0199e f642b;

    static {
        ZLoader.registerNativesForClass(29, C0197c.class);
        Hidden0.special_clinit_29_00(C0197c.class);
    }

    public /* synthetic */ C0197c(C0199e c0199e, int i2) {
        this.f641a = i2;
        this.f642b = c0199e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final native void onAnimationUpdate(ValueAnimator valueAnimator);
}
