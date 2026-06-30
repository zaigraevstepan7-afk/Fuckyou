package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class vu1 {
    public static final bq a = new bq(new lh1(4));

    public static final void a(tv0 tv0Var, ym1 ym1Var, final long j, long j2, final jo joVar, ob0 ob0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            tv0Var = qv0.a;
        }
        final tv0 tv0Var2 = tv0Var;
        if ((i2 & 2) != 0) {
            ym1Var = pv.w;
        }
        final ym1 ym1Var2 = ym1Var;
        long jA = (i2 & 8) != 0 ? dm.a(j, ob0Var) : j2;
        bq bqVar = a;
        final float f = ((tz) ob0Var.j(bqVar)).e + 0.0f;
        lk.j(new pb1[]{rr.a.a(new vl(jA)), bqVar.a(new tz(f))}, lk.d0(421772006, new wa0() { // from class: su1
            @Override // defpackage.wa0
            public final Object h(Object obj, Object obj2) {
                ob0 ob0Var2 = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean zN = ob0Var2.N(iIntValue & 1, (iIntValue & 3) != 2);
                t32 t32Var = t32.a;
                if (!zN) {
                    ob0Var2.Q();
                    return t32Var;
                }
                tv0 tv0VarC = vu1.c(tv0Var2, ym1Var2, vu1.d(j, f, ob0Var2), null, ((hx) ob0Var2.j(aq.h)).y(0.0f));
                Object objK = ob0Var2.K();
                l91 l91Var = kp.a;
                if (objK == l91Var) {
                    objK = new fi1(11);
                    ob0Var2.f0(objK);
                }
                tv0 tv0VarA = ol1.a(tv0VarC, false, (sa0) objK);
                Object objK2 = ob0Var2.K();
                if (objK2 == l91Var) {
                    objK2 = uu1.a;
                    ob0Var2.f0(objK2);
                }
                tv0 tv0VarA2 = bv1.a(tv0VarA, t32Var, (PointerInputEventHandler) objK2);
                uu0 uu0VarD = sg.d(v20.f, true);
                int iHashCode = Long.hashCode(ob0Var2.T);
                b61 b61VarL = ob0Var2.l();
                tv0 tv0VarP = bk.P(ob0Var2, tv0VarA2);
                ep.c.getClass();
                zp zpVar = dp.b;
                ob0Var2.Z();
                if (ob0Var2.S) {
                    ob0Var2.k(zpVar);
                } else {
                    ob0Var2.i0();
                }
                xc.E(dp.f, ob0Var2, uu0VarD);
                xc.E(dp.e, ob0Var2, b61VarL);
                xc.E(dp.g, ob0Var2, Integer.valueOf(iHashCode));
                xc.C(ob0Var2, dp.h);
                xc.E(dp.d, ob0Var2, tv0VarP);
                joVar.h(ob0Var2, 0);
                ob0Var2.p(true);
                return t32Var;
            }
        }, ob0Var), ob0Var, 56);
    }

    public static final void b(final ha0 ha0Var, final tv0 tv0Var, final boolean z, final ym1 ym1Var, final long j, long j2, float f, jx0 jx0Var, final jo joVar, ob0 ob0Var, int i, int i2) {
        if ((i2 & 128) != 0) {
            f = 0.0f;
        }
        if (jx0Var == null) {
            ob0Var.W(-1701074900);
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new jx0();
                ob0Var.f0(objK);
            }
            jx0Var = (jx0) objK;
        } else {
            ob0Var.W(2023335947);
        }
        ob0Var.p(false);
        bq bqVar = a;
        final float f2 = ((tz) ob0Var.j(bqVar)).e + 0.0f;
        final jx0 jx0Var2 = jx0Var;
        final float f3 = f;
        lk.j(new pb1[]{rr.a.a(new vl(j2)), bqVar.a(new tz(f2))}, lk.d0(849208527, new wa0() { // from class: tu1
            @Override // defpackage.wa0
            public final Object h(Object obj, Object obj2) {
                ob0 ob0Var2 = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ob0Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ud0 ud0Var = bi0.a;
                    tv0 tv0VarC = tv0Var.c(nv0.a);
                    bq bqVar2 = jf1.a;
                    wf1 wf1Var = ((xf1) ob0Var2.j(bqVar2)).a;
                    tv0 tv0VarC2 = tv0VarC.c(qv0.a);
                    long jD = vu1.d(j, f2, ob0Var2);
                    float fY = ((hx) ob0Var2.j(aq.h)).y(f3);
                    ym1 ym1Var2 = ym1Var;
                    tv0 tv0VarC3 = vu1.c(tv0VarC2, ym1Var2, jD, null, fY);
                    wf1 wf1Var2 = ((xf1) ob0Var2.j(bqVar2)).a;
                    tv0 tv0VarL = hk.l(s22.l(tv0VarC3, jx0Var2, jf1.a(0.0f, ym1Var2, 215), z, null, ha0Var, 24));
                    uu0 uu0VarD = sg.d(v20.f, true);
                    int iHashCode = Long.hashCode(ob0Var2.T);
                    b61 b61VarL = ob0Var2.l();
                    tv0 tv0VarP = bk.P(ob0Var2, tv0VarL);
                    ep.c.getClass();
                    zp zpVar = dp.b;
                    ob0Var2.Z();
                    if (ob0Var2.S) {
                        ob0Var2.k(zpVar);
                    } else {
                        ob0Var2.i0();
                    }
                    xc.E(dp.f, ob0Var2, uu0VarD);
                    xc.E(dp.e, ob0Var2, b61VarL);
                    xc.E(dp.g, ob0Var2, Integer.valueOf(iHashCode));
                    xc.C(ob0Var2, dp.h);
                    xc.E(dp.d, ob0Var2, tv0VarP);
                    joVar.h(ob0Var2, 0);
                    ob0Var2.p(true);
                } else {
                    ob0Var2.Q();
                }
                return t32.a;
            }
        }, ob0Var), ob0Var, 56);
    }

    public static final tv0 c(tv0 tv0Var, ym1 ym1Var, long j, kg kgVar, float f) {
        ym1 ym1Var2;
        tv0 tv0VarN;
        tv0 jgVar = qv0.a;
        if (f > 0.0f) {
            ym1Var2 = ym1Var;
            tv0VarN = c2.n(jgVar, 0.0f, f, ym1Var2, false, 1042399);
        } else {
            ym1Var2 = ym1Var;
            tv0VarN = jgVar;
        }
        tv0 tv0VarC = tv0Var.c(tv0VarN);
        if (kgVar != null) {
            jgVar = new jg(kgVar.a, kgVar.b, ym1Var2);
        }
        return xk.h(xi0.p(tv0VarC.c(jgVar), j, ym1Var2), ym1Var2);
    }

    public static final long d(long j, float f, ob0 ob0Var) {
        bm bmVar = ((ju0) ob0Var.j(mu0.b)).a;
        boolean zBooleanValue = ((Boolean) ob0Var.j(dm.a)).booleanValue();
        long j2 = bmVar.p;
        return (vl.c(j, j2) && zBooleanValue) ? tz.b(f, 0.0f) ? j2 : lk.E(vl.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, bmVar.t), j2) : j;
    }
}
