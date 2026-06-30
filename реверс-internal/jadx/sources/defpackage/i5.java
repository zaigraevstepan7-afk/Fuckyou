package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i5 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(a11 a11Var, tv0 tv0Var, long j, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(1776202187);
        int i3 = (ob0Var.f(a11Var) ? 4 : 2) | i | (ob0Var.f(tv0Var) ? 32 : 16) | 128;
        if (ob0Var.N(i3 & 1, (i3 & 147) != 146)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                ob0Var.Q();
                i2 = i3 & (-897);
            }
            ob0Var.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objK = ob0Var.K();
            if (z || objK == kp.a) {
                objK = new n(3, a11Var);
                ob0Var.f0(objK);
            }
            xi0.e(a11Var, v20.g, lk.d0(-1653527038, new d5(j, ol1.a(tv0Var, false, (sa0) objK)), ob0Var), ob0Var, i4 | 432);
        } else {
            ob0Var.Q();
        }
        long j2 = j;
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new e5(a11Var, tv0Var, j2, i);
        }
    }

    public static final void b(tv0 tv0Var, ob0 ob0Var, int i, int i2) {
        int i3;
        ob0Var.X(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (ob0Var.N(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                tv0Var = qv0.a;
            }
            qc1.b(ob0Var, pv.k(ko1.f(tv0Var, a, 25.0f), new g5(i5, ((xz1) ob0Var.j(yz1.a)).a)));
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new f5(tv0Var, i, i2);
        }
    }
}
