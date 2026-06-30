package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o8 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ o8(iq iqVar, wa0 wa0Var, tv0 tv0Var, int i) {
        this.e = 1;
        this.g = iqVar;
        this.h = wa0Var;
        this.f = tv0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        qv0 qv0Var = qv0.a;
        l91 l91Var = kp.a;
        t32 t32Var = t32.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                tv0 tv0Var = (tv0) obj5;
                fy0 fy0Var = (fy0) obj4;
                jo joVar = (jo) obj3;
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    Object objK = ob0Var.K();
                    if (objK == l91Var) {
                        objK = new p8(fy0Var, 0);
                        ob0Var.f0(objK);
                    }
                    tv0 tv0VarO = u4.o(tv0Var, (sa0) objK);
                    uu0 uu0VarD = sg.d(v20.f, true);
                    int iHashCode = Long.hashCode(ob0Var.T);
                    b61 b61VarL = ob0Var.l();
                    tv0 tv0VarP = bk.P(ob0Var, tv0VarO);
                    ep.c.getClass();
                    zp zpVar = dp.b;
                    ob0Var.Z();
                    if (ob0Var.S) {
                        ob0Var.k(zpVar);
                    } else {
                        ob0Var.i0();
                    }
                    xc.E(dp.f, ob0Var, uu0VarD);
                    xc.E(dp.e, ob0Var, b61VarL);
                    xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
                    xc.C(ob0Var, dp.h);
                    xc.E(dp.d, ob0Var, tv0VarP);
                    joVar.h(ob0Var, 0);
                    ob0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                xi0.k((iq) obj4, (wa0) obj3, (tv0) obj5, (ob0) obj, al.V(1));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ha0 ha0Var = (ha0) obj5;
                ha0 ha0Var2 = (ha0) obj4;
                ha0 ha0Var3 = (ha0) obj3;
                ob0 ob0Var2 = (ob0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ob0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ob0Var2.Q();
                } else {
                    tg1 tg1VarA = sg1.a(pv.b, v20.o, ob0Var2, 0);
                    int iHashCode2 = Long.hashCode(ob0Var2.T);
                    b61 b61VarL2 = ob0Var2.l();
                    tv0 tv0VarP2 = bk.P(ob0Var2, qv0Var);
                    ep.c.getClass();
                    zp zpVar2 = dp.b;
                    ob0Var2.Z();
                    if (ob0Var2.S) {
                        ob0Var2.k(zpVar2);
                    } else {
                        ob0Var2.i0();
                    }
                    xc.E(dp.f, ob0Var2, tg1VarA);
                    xc.E(dp.e, ob0Var2, b61VarL2);
                    xc.E(dp.g, ob0Var2, Integer.valueOf(iHashCode2));
                    xc.C(ob0Var2, dp.h);
                    xc.E(dp.d, ob0Var2, tv0VarP2);
                    wi0.f(1572864, xi0.i, ha0Var, ob0Var2, null, null, null, false);
                    wi0.f(1572864, xi0.j, ha0Var2, ob0Var2, null, null, null, false);
                    wi0.f(1572864, xi0.k, ha0Var3, ob0Var2, null, null, null, false);
                    ob0Var2.p(true);
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                bl.c((tv0) obj5, (ry1) obj4, (jo) obj3, (ob0) obj, al.V(385));
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                hk.b((g41) obj4, (tv0) obj5, (wr) obj3, (ob0) obj, al.V(25017));
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                g32 g32Var = (g32) obj5;
                wa0 wa0Var = (wa0) obj4;
                ns1 ns1Var = (ns1) obj3;
                ob0 ob0Var3 = (ob0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ob0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ob0Var3.Q();
                } else {
                    sq0.h(((vl) ns1Var.getValue()).a, g32Var, wa0Var, ob0Var3, 48);
                }
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                g32 g32Var2 = (g32) obj5;
                jo joVar2 = (jo) obj3;
                c22 c22Var = (c22) obj4;
                ob0 ob0Var4 = (ob0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ob0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ob0Var4.Q();
                } else {
                    sq0.b(((vl) c22Var.l.getValue()).a, g32Var2, joVar2, ob0Var4, 48);
                }
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                pd1.a((iq) obj5, (sa0) obj4, (ha0) obj3, (ob0) obj, al.V(385));
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                r41 r41Var = (r41) obj5;
                fl flVar = (fl) obj4;
                sa0 sa0Var = (sa0) obj3;
                ob0 ob0Var5 = (ob0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ob0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ob0Var5.Q();
                } else {
                    tv0 tv0VarD = xi0.D(qv0Var, 20.0f, 14.0f);
                    bn bnVarA = zm.a(pv.d, v20.q, ob0Var5, 0);
                    int iHashCode3 = Long.hashCode(ob0Var5.T);
                    b61 b61VarL3 = ob0Var5.l();
                    tv0 tv0VarP3 = bk.P(ob0Var5, tv0VarD);
                    ep.c.getClass();
                    zp zpVar3 = dp.b;
                    ob0Var5.Z();
                    if (ob0Var5.S) {
                        ob0Var5.k(zpVar3);
                    } else {
                        ob0Var5.i0();
                    }
                    r9 r9Var = dp.f;
                    xc.E(r9Var, ob0Var5, bnVarA);
                    r9 r9Var2 = dp.e;
                    xc.E(r9Var2, ob0Var5, b61VarL3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    r9 r9Var3 = dp.g;
                    xc.E(r9Var3, ob0Var5, numValueOf);
                    a4 a4Var = dp.h;
                    xc.C(ob0Var5, a4Var);
                    r9 r9Var4 = dp.d;
                    xc.E(r9Var4, ob0Var5, tv0VarP3);
                    tg1 tg1VarA2 = sg1.a(pv.b, v20.p, ob0Var5, 48);
                    int iHashCode4 = Long.hashCode(ob0Var5.T);
                    b61 b61VarL4 = ob0Var5.l();
                    tv0 tv0VarP4 = bk.P(ob0Var5, qv0Var);
                    ob0Var5.Z();
                    if (ob0Var5.S) {
                        ob0Var5.k(zpVar3);
                    } else {
                        ob0Var5.i0();
                    }
                    xc.E(r9Var, ob0Var5, tg1VarA2);
                    xc.E(r9Var2, ob0Var5, b61VarL4);
                    s91.q(iHashCode4, ob0Var5, r9Var3, ob0Var5, a4Var);
                    xc.E(r9Var4, ob0Var5, tv0VarP4);
                    ys1 ys1Var = mu0.b;
                    mz1.b("Menu scale", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((ju0) ob0Var5.j(ys1Var)).b.h, ob0Var5, 0, 0, 131070);
                    qc1.b(ob0Var5, new fm0(1.0f, true));
                    mz1.b(String.format("%.2fx", Arrays.copyOf(new Object[]{Float.valueOf(r41Var.g())}, 1)), null, ((ju0) ob0Var5.j(ys1Var)).a.a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((ju0) ob0Var5.j(ys1Var)).b.h, ob0Var5, 0, 0, 131066);
                    ob0Var5.p(true);
                    float fG = r41Var.g();
                    boolean zF = ob0Var5.f(r41Var);
                    Object objK2 = ob0Var5.K();
                    if (zF || objK2 == l91Var) {
                        objK2 = new n(22, r41Var);
                        ob0Var5.f0(objK2);
                    }
                    sa0 sa0Var2 = (sa0) objK2;
                    boolean zF2 = ob0Var5.f(sa0Var) | ob0Var5.f(r41Var);
                    Object objK3 = ob0Var5.K();
                    if (zF2 || objK3 == l91Var) {
                        objK3 = new f8(14, sa0Var, r41Var);
                        ob0Var5.f0(objK3);
                    }
                    fp1.a(fG, sa0Var2, null, false, flVar, (ha0) objK3, null, null, ob0Var5, 0);
                    ob0Var5.p(true);
                }
                break;
            case el.a /* 9 */:
                wc1 wc1Var = (wc1) obj5;
                bk1 bk1Var = (bk1) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = bk1Var.i(bk1Var.e(fFloatValue - wc1Var.e));
                bk1 bk1Var2 = ((zj1) obj3).a;
                wc1Var.e += bk1Var.e(bk1Var.h(bk1Var2.d(bk1Var2.k, jI, 1)));
                break;
            case el.b /* 10 */:
                wa0 wa0Var2 = (wa0) obj5;
                jo joVar3 = (jo) obj3;
                p60 p60Var = (p60) obj4;
                ob0 ob0Var6 = (ob0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ob0Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ob0Var6.Q();
                } else {
                    Object objK4 = ob0Var6.K();
                    if (objK4 == l91Var) {
                        objK4 = wi0.v(ob0Var6);
                        ob0Var6.f0(objK4);
                    }
                    vt vtVar = (vt) objK4;
                    Object objK5 = ob0Var6.K();
                    if (objK5 == l91Var) {
                        objK5 = new jk1(vtVar, p60Var);
                        ob0Var6.f0(objK5);
                    }
                    jk1 jk1Var = (jk1) objK5;
                    tv0 tv0VarX = nu0.x();
                    jo joVar4 = new jo(1271844412, true, new q(7, hk.H(wa0Var2, joVar3)));
                    Object objK6 = ob0Var6.K();
                    if (objK6 == l91Var) {
                        objK6 = new uw0(jk1Var);
                        ob0Var6.f0(objK6);
                    }
                    uu0 uu0Var = (uu0) objK6;
                    int iHashCode5 = Long.hashCode(ob0Var6.T);
                    b61 b61VarL5 = ob0Var6.l();
                    tv0 tv0VarP5 = bk.P(ob0Var6, tv0VarX);
                    ep.c.getClass();
                    zp zpVar4 = dp.b;
                    ob0Var6.Z();
                    if (ob0Var6.S) {
                        ob0Var6.k(zpVar4);
                    } else {
                        ob0Var6.i0();
                    }
                    xc.E(dp.f, ob0Var6, uu0Var);
                    xc.E(dp.e, ob0Var6, b61VarL5);
                    xc.E(dp.g, ob0Var6, Integer.valueOf(iHashCode5));
                    xc.C(ob0Var6, dp.h);
                    xc.E(dp.d, ob0Var6, tv0VarP5);
                    joVar4.h(ob0Var6, 0);
                    ob0Var6.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                uc1.c((z2) obj5, (ha0) obj4, (ha0) obj3, (ob0) obj, al.V(1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ o8(int i, jo joVar, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.h = joVar;
        this.g = obj2;
    }

    public /* synthetic */ o8(g41 g41Var, tv0 tv0Var, wr wrVar, int i) {
        this.e = 4;
        this.g = g41Var;
        this.f = tv0Var;
        this.h = wrVar;
    }

    public /* synthetic */ o8(Object obj, Object obj2, eb0 eb0Var, int i, int i2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
        this.h = eb0Var;
    }

    public /* synthetic */ o8(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
