package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class is {
    public static final cs a;

    static {
        bq bqVar = l7.a;
        long j = vl.c;
        long j2 = vl.b;
        a = new cs(j, j2, j2, vl.b(0.38f, j2), vl.b(0.38f, j2));
    }

    public static final void a(cs csVar, tv0 tv0Var, jo joVar, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(-527864079);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(csVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.f(tv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.h(joVar) ? 256 : 128;
        }
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            tf tfVar = es.a;
            kg1 kg1VarA = mg1.a(4.0f);
            boolean z = tz.a(3.0f, 0.0f) > 0;
            long j = rc0.a;
            tv0 tv0VarH = pv.H(xi0.E(nu0.O(xi0.p((tz.a(3.0f, 0.0f) > 0 || z) ? tv0Var.c(new vm1(kg1VarA, z, j, j)) : tv0Var, csVar.a, pv.w), ri0.f), 0.0f, es.d, 1), pv.B(ob0Var));
            int i3 = (i2 << 3) & 7168;
            bn bnVarA = zm.a(pv.d, v20.q, ob0Var, 0);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0VarH);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, bnVarA);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            joVar.f(cn.a, ob0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(csVar, tv0Var, joVar, i, 5);
        }
    }

    public static final void b(tv0 tv0Var, cs csVar, sa0 sa0Var, ob0 ob0Var, int i, int i2) {
        int i3;
        int i4;
        ob0Var.X(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (ob0Var.f(csVar) ? 32 : 16);
        }
        int i7 = i4 | (ob0Var.h(sa0Var) ? 256 : 128);
        int i8 = 0;
        if (ob0Var.N(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                tv0Var = qv0.a;
            }
            if (i6 != 0) {
                csVar = a;
            }
            a(csVar, tv0Var, lk.d0(-250345048, new fs(i8, sa0Var, csVar), ob0Var), ob0Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            ob0Var.Q();
        }
        tv0 tv0Var2 = tv0Var;
        cs csVar2 = csVar;
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(tv0Var2, csVar2, sa0Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, cs csVar, tv0 tv0Var, xa0 xa0Var, ha0 ha0Var, ob0 ob0Var, int i) {
        int i2;
        int i3;
        ob0Var.X(-2001167027);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.f(csVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ob0Var.f(tv0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ob0Var.h(xa0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ob0Var.h(ha0Var) ? 131072 : 65536;
        }
        int i4 = 0;
        if (ob0Var.N(i2 & 1, (74899 & i2) != 74898)) {
            tf tfVar = es.a;
            float f = es.c;
            cd cdVar = new cd(f, new yc(0));
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objK = ob0Var.K();
            if (z2 || objK == kp.a) {
                objK = new gs(i4, ha0Var, z);
                ob0Var.f0(objK);
            }
            tv0 tv0VarE = xi0.E(ko1.g(s22.m(tv0Var, z, str, (ha0) objK).c(ko1.a), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            tg1 tg1VarA = sg1.a(cdVar, tfVar, ob0Var, 54);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0VarE);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            r9 r9Var = dp.f;
            xc.E(r9Var, ob0Var, tg1VarA);
            r9 r9Var2 = dp.e;
            xc.E(r9Var2, ob0Var, b61VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            r9 r9Var3 = dp.g;
            xc.E(r9Var3, ob0Var, numValueOf);
            a4 a4Var = dp.h;
            xc.C(ob0Var, a4Var);
            r9 r9Var4 = dp.d;
            xc.E(r9Var4, ob0Var, tv0VarP);
            if (xa0Var == null) {
                ob0Var.W(-1597947094);
                ob0Var.p(false);
                i3 = i2;
            } else {
                ob0Var.W(-1597947093);
                float f2 = es.e;
                tv0 tv0VarD = ko1.d(qv0.a, f2, 0.0f, f2, f2, 2);
                i3 = i2;
                uu0 uu0VarD = sg.d(v20.f, false);
                int iHashCode2 = Long.hashCode(ob0Var.T);
                b61 b61VarL2 = ob0Var.l();
                tv0 tv0VarP2 = bk.P(ob0Var, tv0VarD);
                ob0Var.Z();
                if (ob0Var.S) {
                    ob0Var.k(zpVar);
                } else {
                    ob0Var.i0();
                }
                xc.E(r9Var, ob0Var, uu0VarD);
                xc.E(r9Var2, ob0Var, b61VarL2);
                s91.q(iHashCode2, ob0Var, r9Var3, ob0Var, a4Var);
                xc.E(r9Var4, ob0Var, tv0VarP2);
                xa0Var.f(new vl(z ? csVar.c : csVar.e), ob0Var, 0);
                ob0Var.p(true);
                ob0Var.p(false);
            }
            long j = z ? csVar.b : csVar.d;
            wi0.b(str, new fm0(1.0f, true), new d02(j, es.h, es.i, es.k, es.b, es.j, 16613240), 0, false, 1, 0, ob0Var, (i3 & 14) | 1572864, 952);
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hs(str, z, csVar, tv0Var, xa0Var, ha0Var, i);
        }
    }
}
