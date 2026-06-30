package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface p10 extends hx {
    static void Y(sl0 sl0Var, f6 f6Var, long j, float f, wl wlVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        int i2 = (i & 32) != 0 ? 3 : 0;
        ej ejVar = sl0Var.e;
        ejVar.e.c.g(f6Var, j, ejVar.c(null, i60.a, f2, wlVar, i2, 1));
    }

    static void Z(p10 p10Var, f6 f6Var, long j, long j2, float f, wl wlVar, int i, int i2) {
        p10Var.Q(f6Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, wlVar, (i2 & 512) != 0 ? 1 : i);
    }

    static /* synthetic */ void c0(p10 p10Var, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = p10Var.S();
        }
        p10Var.q(f, j, j2);
    }

    static /* synthetic */ void e0(p10 p10Var, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = x0(p10Var.d(), j4);
        }
        p10Var.L(j, j4, j3, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void j0(p10 p10Var, lh lhVar, long j, long j2, long j3, float f, q10 q10Var, wl wlVar, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        p10Var.W(lhVar, j4, (i & 4) != 0 ? x0(p10Var.d(), j4) : j2, j3, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? i60.a : q10Var, (i & 64) != 0 ? null : wlVar, (i & 128) != 0 ? 3 : 0);
    }

    static /* synthetic */ void l0(p10 p10Var, w6 w6Var, long j, q10 q10Var, int i) {
        if ((i & 8) != 0) {
            q10Var = i60.a;
        }
        p10Var.T(w6Var, j, q10Var);
    }

    static /* synthetic */ void x(p10 p10Var, lh lhVar, long j, long j2, float f, q10 q10Var, wl wlVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        p10Var.p0(lhVar, j3, (i & 4) != 0 ? x0(p10Var.d(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? i60.a : q10Var, (i & 32) != 0 ? null : wlVar, (i & 64) != 0 ? 3 : 0);
    }

    static long x0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void y0(p10 p10Var, w6 w6Var, lh lhVar, float f, kt1 kt1Var, wl wlVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        q10 q10Var = kt1Var;
        if ((i & 8) != 0) {
            q10Var = i60.a;
        }
        q10 q10Var2 = q10Var;
        if ((i & 16) != 0) {
            wlVar = null;
        }
        p10Var.A(w6Var, lhVar, f2, q10Var2, wlVar, (i & 32) != 0 ? 3 : 0);
    }

    void A(w6 w6Var, lh lhVar, float f, q10 q10Var, wl wlVar, int i);

    oc E();

    default void H(nc0 nc0Var, long j, sa0 sa0Var) {
        nc0Var.e(this, getLayoutDirection(), j, new b7(7, this, sa0Var));
    }

    void L(long j, long j2, long j3, int i);

    void Q(f6 f6Var, long j, long j2, long j3, float f, wl wlVar, int i);

    default long S() {
        return ef1.j(E().q());
    }

    void T(w6 w6Var, long j, q10 q10Var);

    void W(lh lhVar, long j, long j2, long j3, float f, q10 q10Var, wl wlVar, int i);

    default long d() {
        return E().q();
    }

    al0 getLayoutDirection();

    void p0(lh lhVar, long j, long j2, float f, q10 q10Var, wl wlVar, int i);

    void q(float f, long j, long j2);

    void w0(long j, float f, float f2, long j2, long j3, q10 q10Var);
}
