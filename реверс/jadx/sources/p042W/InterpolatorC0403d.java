package p042W;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: W.d */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC0403d implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1089a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f1089a) {
            case 0:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            default:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }
}
