package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u60 {
    public final float a;
    public final float b;

    public u60(float f, hx hxVar) {
        this.a = f;
        float fB = hxVar.b();
        float f2 = v60.a;
        this.b = fB * 386.0878f * 160.0f * 0.84f;
    }

    public final t60 a(float f) {
        double dB = b(f);
        double d = v60.a;
        double d2 = d - 1.0d;
        return new t60(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = a6.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }
}
