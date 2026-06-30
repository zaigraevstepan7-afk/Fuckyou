package p007E;

/* JADX INFO: renamed from: E.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0072r {

    /* JADX INFO: renamed from: k */
    public static final C0072r f222k;

    /* JADX INFO: renamed from: a */
    public final float f223a;

    /* JADX INFO: renamed from: b */
    public final float f224b;

    /* JADX INFO: renamed from: c */
    public final float f225c;

    /* JADX INFO: renamed from: d */
    public final float f226d;

    /* JADX INFO: renamed from: e */
    public final float f227e;

    /* JADX INFO: renamed from: f */
    public final float f228f;

    /* JADX INFO: renamed from: g */
    public final float[] f229g;

    /* JADX INFO: renamed from: h */
    public final float f230h;

    /* JADX INFO: renamed from: i */
    public final float f231i;

    /* JADX INFO: renamed from: j */
    public final float f232j;

    static {
        float[] fArr = AbstractC0056b.f188c;
        float fM335n = (float) ((((double) AbstractC0056b.m335n()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0056b.f186a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM335n) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f10 = 1.0f / ((5.0f * fM335n) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(((double) fM335n) * 5.0d))) + (f11 * fM335n);
        float fM335n2 = AbstractC0056b.m335n() / fArr[1];
        double d3 = fM335n2;
        float fSqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f222k = new C0072r(fM335n2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f9, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C0072r(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f228f = f;
        this.f223a = f2;
        this.f224b = f3;
        this.f225c = f4;
        this.f226d = f5;
        this.f227e = f6;
        this.f229g = fArr;
        this.f230h = f7;
        this.f231i = f8;
        this.f232j = f9;
    }
}
