package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ws implements uu0 {
    public final /* synthetic */ jo0 a;
    public final /* synthetic */ ry1 b;
    public final /* synthetic */ i72 c;
    public final /* synthetic */ vt d;
    public final /* synthetic */ sa0 e;
    public final /* synthetic */ az1 f;
    public final /* synthetic */ z01 g;
    public final /* synthetic */ hx h;
    public final /* synthetic */ zg i;
    public final /* synthetic */ int j;

    public ws(jo0 jo0Var, ry1 ry1Var, i72 i72Var, vt vtVar, sa0 sa0Var, az1 az1Var, z01 z01Var, hx hxVar, zg zgVar, int i) {
        this.a = jo0Var;
        this.b = ry1Var;
        this.c = i72Var;
        this.d = vtVar;
        this.e = sa0Var;
        this.f = az1Var;
        this.g = z01Var;
        this.h = hxVar;
        this.i = zgVar;
        this.j = i;
    }

    @Override // defpackage.uu0
    public final int d(pi0 pi0Var, List list, int i) {
        jo0 jo0Var = this.a;
        jo0Var.a.a(pi0Var.getLayoutDirection());
        me meVar = jo0Var.a.j;
        if (meVar != null) {
            return qc1.f(meVar.c());
        }
        yc.l("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ab A[LOOP:0: B:109:0x02a9->B:110:0x02ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    @Override // defpackage.uu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vu0 g(xu0 xu0Var, List list, long j) {
        long j2;
        pz1 pz1Var;
        al0 al0Var;
        int i;
        pz1 pz1Var2;
        pz1 pz1Var3;
        ws wsVar;
        int i2;
        int iF;
        int i3;
        int i4;
        oz1 oz1Var;
        int i5;
        int iJ;
        int iH;
        me meVar;
        jo0 jo0Var = this.a;
        sp1 sp1VarL = uc1.l();
        sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
        sp1 sp1VarU = uc1.u(sp1VarL);
        try {
            qz1 qz1VarD = jo0Var.d();
            pz1 pz1Var4 = qz1VarD != null ? qz1VarD.a : null;
            cx1 cx1Var = jo0Var.a;
            al0 layoutDirection = xu0Var.getLayoutDirection();
            int i6 = cx1Var.f;
            boolean z = cx1Var.e;
            int i7 = cx1Var.c;
            if (pz1Var4 != null) {
                vw0 vw0Var = pz1Var4.b;
                oz1 oz1Var2 = pz1Var4.a;
                hb hbVar = cx1Var.a;
                d02 d02Var = cx1Var.b;
                List list2 = cx1Var.i;
                hx hxVar = cx1Var.g;
                c90 c90Var = cx1Var.h;
                pz1 pz1Var5 = pz1Var4;
                if (vw0Var.a.b()) {
                    j2 = j;
                    al0Var = layoutDirection;
                } else {
                    hb hbVar2 = oz1Var2.a;
                    long j3 = oz1Var2.j;
                    if (xi0.o(hbVar2, hbVar) && oz1Var2.b.c(d02Var) && xi0.o(oz1Var2.c, list2) && oz1Var2.d == i7 && oz1Var2.e == z && oz1Var2.f == i6 && xi0.o(oz1Var2.g, hxVar)) {
                        al0Var = layoutDirection;
                        if (oz1Var2.h == al0Var && xi0.o(oz1Var2.i, c90Var) && kr.j(j) == kr.j(j3)) {
                            if ((!z && i6 != 2) || (kr.h(j) == kr.h(j3) && kr.g(j) == kr.g(j3))) {
                                i = 2;
                                pz1Var = pz1Var5;
                                pz1Var2 = new pz1(new oz1(oz1Var2.a, cx1Var.b, oz1Var2.c, oz1Var2.d, oz1Var2.e, oz1Var2.f, oz1Var2.g, oz1Var2.h, oz1Var2.i, j), vw0Var, lr.d(j, (((long) qc1.f(vw0Var.e)) & 4294967295L) | (((long) qc1.f(vw0Var.d)) << 32)));
                                long j4 = pz1Var2.c;
                                Integer numValueOf = Integer.valueOf((int) (j4 >> 32));
                                Integer numValueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                                int iIntValue = numValueOf.intValue();
                                int iIntValue2 = numValueOf2.intValue();
                                pz1Var3 = pz1Var;
                                if (xi0.o(pz1Var3, pz1Var2)) {
                                }
                                if (wsVar.j == 1) {
                                }
                                jo0Var.g.setValue(new tz(wsVar.h.s0(iF)));
                                j41[] j41VarArr = {new j41(f3.a, Integer.valueOf(Math.round(pz1Var2.d))), new j41(f3.b, Integer.valueOf(Math.round(pz1Var2.e)))};
                                LinkedHashMap linkedHashMap = new LinkedHashMap(bl.I(i));
                                i4 = i;
                                while (i3 < i4) {
                                }
                                return xu0Var.f0(iIntValue, iIntValue2, linkedHashMap, new mt(9));
                            }
                            j2 = j;
                            i5 = 2;
                            pz1Var = pz1Var5;
                            cx1Var.a(al0Var);
                            iJ = kr.j(j2);
                            iH = ((z || i6 == i5) && kr.d(j2)) ? kr.h(j2) : Integer.MAX_VALUE;
                            int i8 = (z || i6 != i5) ? i7 : 1;
                            if (iJ != iH) {
                                me meVar2 = cx1Var.j;
                                if (meVar2 == null) {
                                    yc.l("layoutIntrinsics must be called first");
                                    return null;
                                }
                                iH = lk.A(qc1.f(meVar2.c()), iJ, iH);
                            }
                            meVar = cx1Var.j;
                            if (meVar != null) {
                                yc.l("layoutIntrinsics must be called first");
                                return null;
                            }
                            vw0 vw0Var2 = new vw0(meVar, bl.x(0, iH, 0, kr.g(j2)), i8, cx1Var.f);
                            i = i5;
                            pz1Var2 = new pz1(new oz1(cx1Var.a, cx1Var.b, cx1Var.i, cx1Var.c, cx1Var.e, cx1Var.f, cx1Var.g, al0Var, cx1Var.h, j2), vw0Var2, lr.d(j2, (((long) qc1.f(vw0Var2.d)) << 32) | (((long) qc1.f(vw0Var2.e)) & 4294967295L)));
                            long j42 = pz1Var2.c;
                            Integer numValueOf3 = Integer.valueOf((int) (j42 >> 32));
                            Integer numValueOf22 = Integer.valueOf((int) (j42 & 4294967295L));
                            int iIntValue3 = numValueOf3.intValue();
                            int iIntValue22 = numValueOf22.intValue();
                            pz1Var3 = pz1Var;
                            if (xi0.o(pz1Var3, pz1Var2)) {
                                wsVar = this;
                            } else {
                                jo0Var.i.setValue(new qz1(pz1Var2, qz1VarD != null ? qz1VarD.c : null));
                                jo0Var.p = false;
                                wsVar = this;
                                ry1 ry1Var = wsVar.b;
                                if (ry1Var.k() && ry1Var.j() && ((co0) wsVar.c).a() && wz1.c(((wz1) jo0Var.A.getValue()).a) && wz1.c(((wz1) jo0Var.B.getValue()).a) && jo0Var.b()) {
                                    if (!xi0.o((pz1Var3 == null || (oz1Var = pz1Var3.a) == null) ? null : oz1Var.a, pz1Var2.a.a)) {
                                        nu0.A(wsVar.d, null, null, new e(ry1Var, wsVar.i, null, 11), 3);
                                    }
                                }
                                wsVar.e.i(pz1Var2);
                                bl.J(jo0Var, wsVar.f, wsVar.g);
                            }
                            if (wsVar.j == 1) {
                                i2 = 0;
                                iF = qc1.f(pz1Var2.b.b(0));
                            } else {
                                i2 = 0;
                                iF = 0;
                            }
                            jo0Var.g.setValue(new tz(wsVar.h.s0(iF)));
                            j41[] j41VarArr2 = {new j41(f3.a, Integer.valueOf(Math.round(pz1Var2.d))), new j41(f3.b, Integer.valueOf(Math.round(pz1Var2.e)))};
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(bl.I(i));
                            i4 = i;
                            for (i3 = i2; i3 < i4; i3++) {
                                j41 j41Var = j41VarArr2[i3];
                                linkedHashMap2.put(j41Var.e, j41Var.f);
                            }
                            return xu0Var.f0(iIntValue3, iIntValue22, linkedHashMap2, new mt(9));
                        }
                        j2 = j;
                    } else {
                        j2 = j;
                        pz1Var = pz1Var5;
                        al0Var = layoutDirection;
                    }
                }
                pz1Var = pz1Var5;
            } else {
                j2 = j;
                pz1Var = pz1Var4;
                al0Var = layoutDirection;
            }
            i5 = 2;
            cx1Var.a(al0Var);
            iJ = kr.j(j2);
            if (z) {
                if (z) {
                }
            } else if (z) {
                if (iJ != iH) {
                }
                meVar = cx1Var.j;
                if (meVar != null) {
                }
            }
            long j422 = pz1Var2.c;
            Integer numValueOf32 = Integer.valueOf((int) (j422 >> 32));
            Integer numValueOf222 = Integer.valueOf((int) (j422 & 4294967295L));
            int iIntValue32 = numValueOf32.intValue();
            int iIntValue222 = numValueOf222.intValue();
            pz1Var3 = pz1Var;
            if (xi0.o(pz1Var3, pz1Var2)) {
            }
            if (wsVar.j == 1) {
            }
            jo0Var.g.setValue(new tz(wsVar.h.s0(iF)));
            j41[] j41VarArr22 = {new j41(f3.a, Integer.valueOf(Math.round(pz1Var2.d))), new j41(f3.b, Integer.valueOf(Math.round(pz1Var2.e)))};
            LinkedHashMap linkedHashMap22 = new LinkedHashMap(bl.I(i));
            i4 = i;
            while (i3 < i4) {
            }
            return xu0Var.f0(iIntValue32, iIntValue222, linkedHashMap22, new mt(9));
        } finally {
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
        }
    }
}
