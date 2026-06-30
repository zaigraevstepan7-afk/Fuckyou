package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ng1 extends bk {
    @Override // defpackage.bk
    public final void B(nn1 nn1Var, float f, float f2) {
        float f3 = f2 * f;
        nn1Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        jn1 jn1Var = new jn1(0.0f, 0.0f, f4, f4);
        jn1Var.f = 180.0f;
        jn1Var.g = 90.0f;
        nn1Var.f.add(jn1Var);
        hn1 hn1Var = new hn1(jn1Var);
        nn1Var.a(180.0f);
        nn1Var.g.add(hn1Var);
        nn1Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        nn1Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        nn1Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
