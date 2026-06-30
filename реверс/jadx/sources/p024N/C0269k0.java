package p024N;

import android.os.Build;
import android.view.animation.Interpolator;
import p001A0.AbstractC0014c;

/* JADX INFO: renamed from: N.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0269k0 {

    /* JADX INFO: renamed from: a */
    public AbstractC0267j0 f834a;

    public C0269k0(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f834a = new C0265i0(AbstractC0014c.m133i(i2, interpolator, j2));
        } else {
            this.f834a = new C0261g0(i2, interpolator, j2);
        }
    }
}
