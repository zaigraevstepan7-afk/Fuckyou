package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gr extends hr {
    public final cf1 e;
    public final cf1 f;
    public final float[] g;

    public gr(cf1 cf1Var, cf1 cf1Var2) {
        float[] fArrH;
        super(cf1Var2, cf1Var, cf1Var2, null);
        this.e = cf1Var;
        this.f = cf1Var2;
        float[] fArr = l2.c.b;
        h72 h72Var = cf1Var.d;
        float[] fArr2 = cf1Var.i;
        h72 h72Var2 = cf1Var2.d;
        float[] fArr3 = cf1Var2.j;
        if (al.o(h72Var, h72Var2)) {
            fArrH = al.H(fArr3, fArr2);
        } else {
            float[] fArrA = h72Var.a();
            float[] fArrA2 = h72Var2.a();
            h72 h72Var3 = xi0.r;
            fArrH = al.H(al.o(h72Var2, h72Var3) ? fArr3 : al.D(al.H(al.n(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), cf1Var2.i)), al.o(h72Var, h72Var3) ? fArr2 : al.H(al.n(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrH;
    }

    @Override // defpackage.hr
    public final long a(long j) {
        float fH = vl.h(j);
        float fG = vl.g(j);
        float fE = vl.e(j);
        float fD = vl.d(j);
        xe1 xe1Var = this.e.p;
        float fC = (float) xe1Var.c(fH);
        float fC2 = (float) xe1Var.c(fG);
        float fC3 = (float) xe1Var.c(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        float f2 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
        float f3 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
        cf1 cf1Var = this.f;
        float fC4 = (float) cf1Var.m.c(f);
        xe1 xe1Var2 = cf1Var.m;
        return lk.c(fC4, (float) xe1Var2.c(f2), (float) xe1Var2.c(f3), fD, cf1Var);
    }
}
