package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vs implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ry1 f;

    public /* synthetic */ vs(ry1 ry1Var, int i) {
        this.e = i;
        this.f = ry1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        pc1 pc1Var;
        zk0 zk0VarC;
        char c;
        long j;
        float fIntBitsToFloat;
        zk0 zk0VarC2;
        zk0 zk0VarC3;
        zk0 zk0VarC4;
        zk0 zk0VarC5;
        int i = this.e;
        ry1 ry1Var = this.f;
        switch (i) {
            case 0:
                return new j2(7, ry1Var);
            case 1:
                ry1Var.r();
                return t32.a;
            default:
                zk0 zk0Var = (zk0) obj;
                jo0 jo0Var = ry1Var.d;
                pc1 pc1Var2 = pc1.e;
                if (jo0Var == null) {
                    pc1Var = pc1Var2;
                } else {
                    if (jo0Var.p) {
                        jo0Var = null;
                    }
                    if (jo0Var != null) {
                        z01 z01Var = ry1Var.b;
                        long j2 = ry1Var.n().b;
                        int i2 = wz1.c;
                        int iG = z01Var.g((int) (j2 >> 32));
                        int iG2 = ry1Var.b.g((int) (ry1Var.n().b & 4294967295L));
                        jo0 jo0Var2 = ry1Var.d;
                        long jM = 0;
                        long jM2 = (jo0Var2 == null || (zk0VarC5 = jo0Var2.c()) == null) ? 0L : zk0VarC5.M(ry1Var.l(true));
                        jo0 jo0Var3 = ry1Var.d;
                        if (jo0Var3 != null && (zk0VarC4 = jo0Var3.c()) != null) {
                            jM = zk0VarC4.M(ry1Var.l(false));
                        }
                        jo0 jo0Var4 = ry1Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (jo0Var4 == null || (zk0VarC3 = jo0Var4.c()) == null) {
                            c = ' ';
                            j = jM;
                            fIntBitsToFloat = 0.0f;
                        } else {
                            qz1 qz1VarD = jo0Var.d();
                            c = ' ';
                            j = jM;
                            fIntBitsToFloat = Float.intBitsToFloat((int) (zk0VarC3.M((((long) Float.floatToRawIntBits(qz1VarD != null ? qz1VarD.a.c(iG).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        jo0 jo0Var5 = ry1Var.d;
                        if (jo0Var5 != null && (zk0VarC2 = jo0Var5.c()) != null) {
                            qz1 qz1VarD2 = jo0Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (zk0VarC2.M((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(qz1VarD2 != null ? qz1VarD2.a.c(iG2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jM2 >> c);
                        int i4 = (int) (j >> c);
                        pc1Var = new pc1(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (jo0Var.a.g.b() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jM2 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                    }
                }
                jo0 jo0Var6 = ry1Var.d;
                if (jo0Var6 == null || (zk0VarC = jo0Var6.c()) == null) {
                    return null;
                }
                return (zk0VarC.B() && zk0Var.B()) ? qc1.a(zk0Var.t(al.w(zk0VarC).c(pc1Var.d())), pc1Var.c()) : pc1Var2;
        }
    }
}
