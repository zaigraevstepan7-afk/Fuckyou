package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zs0 implements zk0 {
    public final ys0 e;

    public zs0(ys0 ys0Var) {
        this.e = ys0Var;
    }

    @Override // defpackage.zk0
    public final boolean B() {
        return this.e.w.W0().r;
    }

    @Override // defpackage.zk0
    public final void C(float[] fArr) {
        this.e.w.C(fArr);
    }

    @Override // defpackage.zk0
    public final long D(zk0 zk0Var, long j) {
        boolean z = zk0Var instanceof zs0;
        ys0 ys0Var = this.e;
        if (!z) {
            ys0 ys0VarA = al.A(ys0Var);
            c01 c01Var = ys0VarA.w;
            long jD = w01.d(D(ys0VarA.z, j), (4294967295L & ((long) Float.floatToRawIntBits((int) (ys0VarA.x & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!c01Var.W0().r) {
                ng0.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            c01Var.f1();
            c01 c01Var2 = c01Var.y;
            if (c01Var2 != null) {
                c01Var = c01Var2;
            }
            return w01.e(jD, c01Var.D(zk0Var, 0L));
        }
        ys0 ys0Var2 = ((zs0) zk0Var).e;
        c01 c01Var3 = ys0Var2.w;
        c01Var3.f1();
        ys0 ys0VarU0 = ys0Var.w.S0(c01Var3).U0();
        if (ys0VarU0 != null) {
            long jB = oh0.b(oh0.c(ys0Var2.O0(ys0VarU0, false), hk.S(j)), ys0Var.O0(ys0VarU0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        ys0 ys0VarA2 = al.A(ys0Var2);
        long jC = oh0.c(oh0.c(ys0Var2.O0(ys0VarA2, false), ys0VarA2.x), hk.S(j));
        ys0 ys0VarA3 = al.A(ys0Var);
        long jB2 = oh0.b(jC, oh0.c(ys0Var.O0(ys0VarA3, false), ys0VarA3.x));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        c01 c01Var4 = ys0VarA3.w.y;
        c01Var4.getClass();
        c01 c01Var5 = ys0VarA2.w.y;
        c01Var5.getClass();
        return c01Var4.D(c01Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.zk0
    public final void F(zk0 zk0Var, float[] fArr) {
        this.e.w.F(zk0Var, fArr);
    }

    @Override // defpackage.zk0
    public final pc1 I(zk0 zk0Var, boolean z) {
        return this.e.w.I(zk0Var, z);
    }

    @Override // defpackage.zk0
    public final long K() {
        ys0 ys0Var = this.e;
        return (((long) ys0Var.e) << 32) | (((long) ys0Var.f) & 4294967295L);
    }

    @Override // defpackage.zk0
    public final long M(long j) {
        return this.e.w.M(w01.e(j, a()));
    }

    public final long a() {
        ys0 ys0Var = this.e;
        ys0 ys0VarA = al.A(ys0Var);
        return w01.d(D(ys0VarA.z, 0L), ys0Var.w.D(ys0VarA.w, 0L));
    }

    @Override // defpackage.zk0
    public final long c(long j) {
        return this.e.w.c(w01.e(j, a()));
    }

    @Override // defpackage.zk0
    public final long g(long j) {
        return w01.e(this.e.w.g(j), a());
    }

    @Override // defpackage.zk0
    public final long h(long j) {
        return this.e.w.h(w01.e(j, a()));
    }

    @Override // defpackage.zk0
    public final zk0 j() {
        ys0 ys0VarU0;
        if (!B()) {
            ng0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        c01 c01Var = this.e.w.w.I.d.y;
        if (c01Var == null || (ys0VarU0 = c01Var.U0()) == null) {
            return null;
        }
        return ys0VarU0.z;
    }

    @Override // defpackage.zk0
    public final long r(zk0 zk0Var, long j) {
        return D(zk0Var, j);
    }

    @Override // defpackage.zk0
    public final long t(long j) {
        return w01.e(this.e.w.t(j), a());
    }
}
