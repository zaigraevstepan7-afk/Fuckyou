package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.ValueAnimator;
import android.view.View;
import p000A.C0001b;

/* JADX INFO: renamed from: M0.i */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0203i implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final int f658a;

    /* JADX INFO: renamed from: b */
    public final Object f659b;

    static {
        ZLoader.registerNativesForClass(36, C0203i.class);
        Hidden0.special_clinit_36_00(C0203i.class);
    }

    public /* synthetic */ C0203i(int i2, Object obj) {
        this.f658a = i2;
        this.f659b = obj;
    }

    public /* synthetic */ C0203i(C0001b c0001b, View view) {
        this.f658a = 1;
        this.f659b = c0001b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final native void onAnimationUpdate(ValueAnimator valueAnimator);
}
