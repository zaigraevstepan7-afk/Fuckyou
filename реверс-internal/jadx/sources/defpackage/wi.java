package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wi implements xa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wi(uy0 uy0Var, ty0 ty0Var) {
        this.e = 6;
        this.f = uy0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0348  */
    @Override // defpackage.xa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        qv0 qv0Var = qv0.a;
        g40 g40Var = g40.e;
        boolean z = true;
        t32 t32Var = t32.a;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((n) obj4).i((Throwable) obj);
                break;
            case 1:
                rd rdVar = (rd) obj4;
                ob0 ob0Var = (ob0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ug1) obj).getClass();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ob0Var.Q();
                } else {
                    ye0 ye0VarB = wi0.J;
                    if (ye0VarB == null) {
                        xe0 xe0Var = new xe0("Rounded.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = a52.a;
                        uq1 uq1Var = new uq1(vl.b);
                        y41 y41Var = new y41(0);
                        y41Var.y(18.0f, 13.0f);
                        y41Var.v(-5.0f);
                        y41Var.F(5.0f);
                        y41Var.r(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        y41Var.A(-1.0f, -0.45f, -1.0f, -1.0f);
                        y41Var.F(-5.0f);
                        y41Var.u(6.0f);
                        y41Var.r(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        y41Var.A(0.45f, -1.0f, 1.0f, -1.0f);
                        y41Var.v(5.0f);
                        y41Var.E(6.0f);
                        y41Var.r(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        y41Var.A(1.0f, 0.45f, 1.0f, 1.0f);
                        y41Var.F(5.0f);
                        y41Var.v(5.0f);
                        y41Var.r(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        y41Var.A(-0.45f, 1.0f, -1.0f, 1.0f);
                        y41Var.m();
                        xe0.a(xe0Var, (ArrayList) y41Var.f, uq1Var);
                        ye0VarB = xe0Var.b();
                        wi0.J = ye0VarB;
                    }
                    ue0.a(ye0VarB, null, null, 0L, ob0Var, 48, 12);
                    qc1.b(ob0Var, ko1.h(qv0Var, 8.0f));
                    mz1.b("Import ".concat(rdVar.g), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var, 0, 0, 262142);
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                et etVar = (et) obj4;
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue2 = etVar.y.e(iIntValue2);
                }
                if (!zBooleanValue) {
                    iIntValue3 = etVar.y.e(iIntValue3);
                }
                if (etVar.x) {
                    long j = etVar.v.b;
                    int i3 = wz1.c;
                    if (iIntValue2 != ((int) (j >> 32)) || iIntValue3 != ((int) (j & 4294967295L))) {
                        int iMin = Math.min(iIntValue2, iIntValue3);
                        cd0 cd0Var = cd0.e;
                        if (iMin < 0 || Math.max(iIntValue2, iIntValue3) > etVar.v.a.f.length()) {
                            ry1 ry1Var = etVar.z;
                            ry1Var.t(false);
                            ry1Var.q(cd0Var);
                            z = false;
                        } else {
                            if (zBooleanValue || iIntValue2 == iIntValue3) {
                                ry1 ry1Var2 = etVar.z;
                                ry1Var2.t(false);
                                ry1Var2.q(cd0Var);
                            } else {
                                etVar.z.h(true);
                            }
                            etVar.w.v.i(new az1(etVar.v.a, af1.g(iIntValue2, iIntValue3), (wz1) null));
                        }
                    }
                } else {
                    z = false;
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((ns0) obj4).f.d(((l81) obj2).c, l91.l);
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                z61 z61VarE = ((pu0) obj2).e(((kr) obj3).a);
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                l32 l32Var = (l32) obj4;
                ob0 ob0Var2 = (ob0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ug1) obj).getClass();
                if (!ob0Var2.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ob0Var2.Q();
                } else if (!l32Var.f) {
                    ob0Var2.W(291912570);
                    ue0.a(bk.G(), null, null, 0L, ob0Var2, 48, 12);
                    qc1.b(ob0Var2, ko1.h(qv0Var, 8.0f));
                    mz1.b("START", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((ju0) ob0Var2.j(mu0.b)).b.h, ob0Var2, 6, 0, 131070);
                    ob0Var2.p(false);
                } else {
                    ob0Var2.W(291491683);
                    tv0 tv0VarE = ko1.e(qv0Var, 22.0f);
                    ys1 ys1Var = mu0.b;
                    ib1.a(tv0VarE, ((ju0) ob0Var2.j(ys1Var)).a.b, 2.0f, 0L, 0, 0.0f, ob0Var2, 390, 56);
                    qc1.b(ob0Var2, ko1.h(qv0Var, 10.0f));
                    mz1.b("Starting…", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((ju0) ob0Var2.j(ys1Var)).b.h, ob0Var2, 6, 0, 131070);
                    ob0Var2.p(false);
                }
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                uy0 uy0Var = (uy0) obj4;
                uy0.i.set(uy0Var, null);
                uy0Var.h(null);
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ((fm1) obj4).b();
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                hp1 hp1Var = (hp1) obj4;
                xu0 xu0Var = (xu0) obj;
                z61 z61VarE2 = ((pu0) obj2).e(((kr) obj3).a);
                int iN = tz.b(Float.NaN, Float.NaN) ? hp1Var.m == k31.e ? z61VarE2.e / 2 : z61VarE2.f / 2 : xu0Var.N(Float.NaN);
                int i4 = z61VarE2.e;
                int i5 = z61VarE2.f;
                Map mapSingletonMap = Collections.singletonMap(fp1.f, Integer.valueOf(iN));
                mapSingletonMap.getClass();
                break;
            case el.a /* 9 */:
                xu0 xu0Var2 = (xu0) obj;
                pu0 pu0Var = (pu0) obj2;
                kr krVar = (kr) obj3;
                float f = ((tz) ((ha0) obj4).a()).e;
                z61 z61VarE3 = pu0Var.e(kr.a(krVar.a, 0, 0, lr.f(tz.b(f, Float.NaN) ? 0 : xu0Var2.N(f), krVar.a), 0, 11));
                break;
            case el.b /* 10 */:
                ry1 ry1Var3 = (ry1) obj4;
                tv0 tv0Var = (tv0) obj;
                ob0 ob0Var3 = (ob0) obj2;
                ((Integer) obj3).getClass();
                ob0Var3.W(1980580247);
                hx hxVar = (hx) ob0Var3.j(aq.h);
                Object objK = ob0Var3.K();
                l91 l91Var = kp.a;
                Object obj5 = objK;
                if (objK == l91Var) {
                    v41 v41VarB = xc.B(new vh0(0L));
                    ob0Var3.f0(v41VarB);
                    obj5 = v41VarB;
                }
                fy0 fy0Var = (fy0) obj5;
                boolean zH = ob0Var3.h(ry1Var3);
                Object objK2 = ob0Var3.K();
                Object obj6 = objK2;
                if (zH || objK2 == l91Var) {
                    f8 f8Var = new f8(17, ry1Var3, fy0Var);
                    ob0Var3.f0(f8Var);
                    obj6 = f8Var;
                }
                ha0 ha0Var = (ha0) obj6;
                boolean zF = ob0Var3.f(hxVar);
                Object objK3 = ob0Var3.K();
                Object obj7 = objK3;
                if (zF || objK3 == l91Var) {
                    uy1 uy1Var = new uy1(hxVar, fy0Var, i);
                    ob0Var3.f0(uy1Var);
                    obj7 = uy1Var;
                }
                za zaVar = kl1.a;
                tv0 tv0VarQ = bk.q(tv0Var, new fs(ha0Var, (sa0) obj7));
                ob0Var3.p(false);
                break;
            case 11:
                String str = (String) obj4;
                ob0 ob0Var4 = (ob0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ug1) obj).getClass();
                if (!ob0Var4.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ob0Var4.Q();
                } else {
                    mz1.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var4, 0, 0, 262142);
                }
                break;
            default:
                v2 v2Var = (v2) obj4;
                ob0 ob0Var5 = (ob0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ug1) obj).getClass();
                if (!ob0Var5.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    ob0Var5.Q();
                } else {
                    mz1.b(v2Var.a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var5, 0, 0, 262142);
                }
                break;
        }
        return t32Var;
    }

    public /* synthetic */ wi(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }
}
