package p019K0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: K0.b */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0160b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final int f497a;

    /* JADX INFO: renamed from: b */
    public final Object f498b;

    static {
        ZLoader.registerNativesForClass(13, C0160b.class);
        Hidden0.special_clinit_13_00(C0160b.class);
    }

    public /* synthetic */ C0160b(int i2, Object obj) {
        this.f497a = i2;
        this.f498b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final native void onAnimationUpdate(ValueAnimator valueAnimator);
}
