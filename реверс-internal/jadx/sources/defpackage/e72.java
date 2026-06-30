package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e72 {
    public static final q22 a = pv.G(500, 2, kw0.d);
    public static final q22 b = pv.G(500, 2, kw0.a);

    public static final void a(final ha0 ha0Var, final tv0 tv0Var, long j, long j2, kt1 kt1Var, kt1 kt1Var2, float f, float f2, sa0 sa0Var, float f3, float f4, ob0 ob0Var, final int i) {
        final long j3;
        final long j4;
        final kt1 kt1Var3;
        final kt1 kt1Var4;
        final float f5;
        final float f6;
        final sa0 sa0Var2;
        final float f7;
        final float f8;
        long jC;
        kt1 kt1Var5;
        kt1 kt1Var6;
        float f9;
        sa0 sa0Var3;
        float f10;
        int i2;
        float f11;
        ob0Var.X(2019304030);
        int i3 = i | (ob0Var.h(ha0Var) ? 4 : 2) | 306783360;
        if (ob0Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                float f12 = c72.a;
                jC = dm.c(u4.f0, ob0Var);
                long jC2 = dm.c(u4.g0, ob0Var);
                ys1 ys1Var = aq.h;
                kt1Var5 = new kt1(((hx) ob0Var.j(ys1Var)).y(4.0f), 0.0f, 1, 0, 26);
                kt1Var6 = new kt1(((hx) ob0Var.j(ys1Var)).y(4.0f), 0.0f, 1, 0, 26);
                f9 = c72.e;
                float f13 = c72.d;
                sa0Var3 = c72.f;
                f10 = c72.a;
                i2 = i3 & (-2147483521);
                j4 = jC2;
                f6 = f13;
                f11 = f10;
            } else {
                ob0Var.Q();
                i2 = i3 & (-2147483521);
                jC = j;
                kt1Var5 = kt1Var;
                kt1Var6 = kt1Var2;
                f9 = f;
                f6 = f2;
                sa0Var3 = sa0Var;
                f11 = f3;
                f10 = f4;
                j4 = j2;
            }
            ob0Var.q();
            tv0 tv0VarC = tv0Var.c(q1.b);
            boolean z = (i2 & 14) == 4;
            Object objK = ob0Var.K();
            if (z || objK == kp.a) {
                objK = new uq(ha0Var, 2);
                ob0Var.f0(objK);
            }
            tv0 tv0VarI = xk.i(ko1.f(ol1.a(tv0VarC, true, (sa0) objK), c72.c, c72.b));
            long j5 = jC;
            kt1Var4 = kt1Var6;
            j3 = j5;
            kt1Var3 = kt1Var5;
            f5 = f9;
            sa0 sa0Var4 = sa0Var3;
            float f14 = f10;
            qc1.b(ob0Var, nu0.B(tv0VarI, ha0Var, sa0Var4, j3, j4, kt1Var3, kt1Var4, f5, f6, f11, f14));
            f8 = f14;
            f7 = f11;
            sa0Var2 = sa0Var4;
        } else {
            ob0Var.Q();
            j3 = j;
            j4 = j2;
            kt1Var3 = kt1Var;
            kt1Var4 = kt1Var2;
            f5 = f;
            f6 = f2;
            sa0Var2 = sa0Var;
            f7 = f3;
            f8 = f4;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(tv0Var, j3, j4, kt1Var3, kt1Var4, f5, f6, sa0Var2, f7, f8, i) { // from class: d72
                public final /* synthetic */ tv0 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ kt1 i;
                public final /* synthetic */ kt1 j;
                public final /* synthetic */ float k;
                public final /* synthetic */ float l;
                public final /* synthetic */ sa0 m;
                public final /* synthetic */ float n;
                public final /* synthetic */ float o;

                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = al.V(49);
                    e72.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (ob0) obj, iV);
                    return t32.a;
                }
            };
        }
    }
}
