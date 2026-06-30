package p065g;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0708d implements TimeInterpolator {

    /* JADX INFO: renamed from: a */
    public int[] f2819a;

    /* JADX INFO: renamed from: b */
    public int f2820b;

    /* JADX INFO: renamed from: c */
    public int f2821c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i2 = (int) ((f * this.f2821c) + 0.5f);
        int i3 = this.f2820b;
        int[] iArr = this.f2819a;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = iArr[i4];
            if (i2 < i5) {
                break;
            }
            i2 -= i5;
            i4++;
        }
        return (i4 / i3) + (i4 < i3 ? i2 / this.f2821c : 0.0f);
    }
}
