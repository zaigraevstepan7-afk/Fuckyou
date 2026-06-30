package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class iv1 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final rp1 f;

    static {
        float f2 = xi0.P;
        a = f2;
        b = xi0.Y;
        c = xi0.V;
        float f3 = xi0.S;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new rp1();
    }

    public static final void a(boolean z, sa0 sa0Var, tv0 tv0Var, wa0 wa0Var, gv1 gv1Var, ob0 ob0Var, int i) {
        tv0 tv0Var2;
        tv0 tv0Var3;
        ob0Var.X(-263339167);
        int i2 = i | (ob0Var.g(z) ? 4 : 2) | (ob0Var.h(sa0Var) ? 32 : 16) | 384 | (ob0Var.g(true) ? 16384 : 8192) | (ob0Var.f(gv1Var) ? 131072 : 65536) | 1572864;
        if (ob0Var.N(i2 & 1, (599187 & i2) != 599186)) {
            ob0Var.S();
            int i3 = i & 1;
            tv0 tv0VarM = qv0.a;
            if (i3 == 0 || ob0Var.x()) {
                tv0Var3 = tv0VarM;
            } else {
                ob0Var.Q();
                tv0Var3 = tv0Var;
            }
            ob0Var.q();
            ob0Var.W(1768510810);
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new jx0();
                ob0Var.f0(objK);
            }
            jx0 jx0Var = (jx0) objK;
            ob0Var.p(false);
            if (sa0Var != null) {
                ud0 ud0Var = bi0.a;
                tv0VarM = nu0.M(z, jx0Var, new yf1(2), sa0Var);
            }
            tv0 tv0VarK = ko1.k(tv0Var3.c(tv0VarM));
            float f2 = c;
            float f3 = d;
            int i4 = (i2 << 3) & 112;
            int i5 = i2 >> 6;
            b(tv0VarK.c(new jo1(f2, f3, f2, f3, false)), z, gv1Var, wa0Var, jx0Var, qn1.b(xi0.M, ob0Var), ob0Var, (i5 & 7168) | i4 | (i5 & 896) | 24576);
            tv0Var2 = tv0Var3;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hv1(z, sa0Var, tv0Var2, wa0Var, gv1Var, i);
        }
    }

    public static final void b(tv0 tv0Var, boolean z, gv1 gv1Var, wa0 wa0Var, jx0 jx0Var, ym1 ym1Var, ob0 ob0Var, int i) {
        int i2;
        wa0 wa0Var2;
        gv1 gv1Var2 = gv1Var;
        ob0Var.X(-670917213);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.g(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ob0Var.f(gv1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ob0Var.h(wa0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ob0Var.f(jx0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ob0Var.f(ym1Var) ? 1048576 : 524288;
        }
        if (ob0Var.N(i2 & 1, (599187 & i2) != 599186)) {
            long j = z ? gv1Var2.b : gv1Var2.f;
            long j2 = z ? gv1Var2.a : gv1Var2.e;
            ym1 ym1VarB = qn1.b(xi0.U, ob0Var);
            bq bqVar = jf1.a;
            wf1 wf1Var = ((xf1) ob0Var.j(bqVar)).a;
            int i3 = i2;
            tv0 tv0VarC = xi0.p(tv0Var.c(new jg(xi0.T, new uq1(z ? gv1Var2.c : gv1Var2.g), ym1VarB)), j, ym1VarB).c(qv0.a);
            uu0 uu0VarD = sg.d(v20.f, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0VarC);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            r9 r9Var = dp.f;
            xc.E(r9Var, ob0Var, uu0VarD);
            r9 r9Var2 = dp.e;
            xc.E(r9Var2, ob0Var, b61VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            r9 r9Var3 = dp.g;
            xc.E(r9Var3, ob0Var, numValueOf);
            a4 a4Var = dp.h;
            xc.C(ob0Var, a4Var);
            r9 r9Var4 = dp.d;
            xc.E(r9Var4, ob0Var, tv0VarP);
            tv0 tv0VarC2 = nu0.j(v20.i).c(new t02(jx0Var, z, bl.W(jw0.e, ob0Var)));
            float f2 = xi0.R / 2.0f;
            wf1 wf1Var2 = ((xf1) ob0Var.j(bqVar)).a;
            tv0 tv0VarP2 = xi0.p(mf0.a(tv0VarC2, jx0Var, jf1.a(f2, null, 220)), j2, ym1Var);
            uu0 uu0VarD2 = sg.d(v20.j, false);
            int iHashCode2 = Long.hashCode(ob0Var.T);
            b61 b61VarL2 = ob0Var.l();
            tv0 tv0VarP3 = bk.P(ob0Var, tv0VarP2);
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(r9Var, ob0Var, uu0VarD2);
            xc.E(r9Var2, ob0Var, b61VarL2);
            s91.q(iHashCode2, ob0Var, r9Var3, ob0Var, a4Var);
            xc.E(r9Var4, ob0Var, tv0VarP3);
            if (wa0Var != null) {
                ob0Var.W(1235836927);
                gv1Var2 = gv1Var;
                wa0Var2 = wa0Var;
                lk.i(rr.a.a(new vl(z ? gv1Var2.d : gv1Var2.h)), wa0Var2, ob0Var, ((i3 >> 9) & 112) | 8);
                ob0Var.p(false);
            } else {
                gv1Var2 = gv1Var;
                wa0Var2 = wa0Var;
                ob0Var.W(1236071411);
                ob0Var.p(false);
            }
            ob0Var.p(true);
            ob0Var.p(true);
        } else {
            wa0Var2 = wa0Var;
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hs(tv0Var, z, gv1Var2, wa0Var2, jx0Var, ym1Var, i);
        }
    }
}
