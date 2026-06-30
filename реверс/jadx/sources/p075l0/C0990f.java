package p075l0;

import android.animation.TypeEvaluator;
import p001A0.AbstractC0016e;
import p009F.C0079f;

/* JADX INFO: renamed from: l0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0990f implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public C0079f[] f3916a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C0079f[] c0079fArr = (C0079f[]) obj;
        C0079f[] c0079fArr2 = (C0079f[]) obj2;
        if (!AbstractC0016e.m176g(c0079fArr, c0079fArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC0016e.m176g(this.f3916a, c0079fArr)) {
            this.f3916a = AbstractC0016e.m153B(c0079fArr);
        }
        for (int i2 = 0; i2 < c0079fArr.length; i2++) {
            C0079f c0079f = this.f3916a[i2];
            C0079f c0079f2 = c0079fArr[i2];
            C0079f c0079f3 = c0079fArr2[i2];
            c0079f.getClass();
            c0079f.f243a = c0079f2.f243a;
            int i3 = 0;
            while (true) {
                float[] fArr = c0079f2.f244b;
                if (i3 < fArr.length) {
                    c0079f.f244b[i3] = (c0079f3.f244b[i3] * f) + ((1.0f - f) * fArr[i3]);
                    i3++;
                }
            }
        }
        return this.f3916a;
    }
}
