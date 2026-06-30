package p015I0;

/* JADX INFO: renamed from: I0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0110f extends C0109e {

    /* JADX INFO: renamed from: j */
    public final float f327j;

    public C0110f(float f) {
        super(0);
        this.f327j = f - 0.001f;
    }

    @Override // p015I0.C0109e
    /* JADX INFO: renamed from: d */
    public final void mo460d(float f, float f2, float f3, C0127w c0127w) {
        double d2 = this.f327j;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d2) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d2, 2.0d) - Math.pow(fSqrt, 2.0d));
        c0127w.m504d(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d2) - d2))) + fSqrt2, 270.0f, 0.0f);
        c0127w.m503c(f2, (float) (-((Math.sqrt(2.0d) * d2) - d2)));
        c0127w.m503c(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d2) - d2))) + fSqrt2);
    }
}
