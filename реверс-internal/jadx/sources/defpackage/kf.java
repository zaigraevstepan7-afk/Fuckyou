package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ kf(xg0 xg0Var, qs qsVar, zc1 zc1Var) {
        this.e = 15;
        this.g = xg0Var;
        this.f = qsVar;
        this.h = zc1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object d(Object obj) {
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        pz1 pz1Var;
        pz1 pz1Var2;
        qz1 qz1Var;
        qz1 qz1Var2;
        pz1 pz1Var3;
        pz1 pz1Var4;
        qz1 qz1Var3;
        qz1 qz1Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        n81 n81Var;
        fk0 fk0Var = (fk0) this.f;
        sx1 sx1Var = (sx1) this.g;
        vc1 vc1Var = (vc1) this.h;
        ey1 ey1Var = (ey1) obj;
        int iOrdinal = fk0Var.ordinal();
        int i = 9;
        t32 t32Var = t32.a;
        az1 az1Var = null;
        switch (iOrdinal) {
            case 0:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    if (wz1.c(ey1Var.f)) {
                        ey1Var.i();
                        return t32Var;
                    }
                    boolean zF = ey1Var.f();
                    long j = ey1Var.f;
                    if (zF) {
                        int iF = wz1.f(j);
                        ey1Var.q(iF, iF);
                        return t32Var;
                    }
                    int iE = wz1.e(j);
                    ey1Var.q(iE, iE);
                }
                return t32Var;
            case 1:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    if (wz1.c(ey1Var.f)) {
                        ey1Var.m();
                        return t32Var;
                    }
                    boolean zF2 = ey1Var.f();
                    long j2 = ey1Var.f;
                    if (zF2) {
                        int iE2 = wz1.e(j2);
                        ey1Var.q(iE2, iE2);
                        return t32Var;
                    }
                    int iF2 = wz1.f(j2);
                    ey1Var.q(iF2, iF2);
                    return t32Var;
                }
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                vz1 vz1Var = ey1Var.e;
                vz1Var.a = null;
                hb hbVar = ey1Var.g;
                String str = hbVar.f;
                String str2 = hbVar.f;
                if (str.length() > 0) {
                    if (ey1Var.f()) {
                        vz1Var.a = null;
                        if (str2.length() > 0 && (numD = ey1Var.d()) != null) {
                            int iIntValue = numD.intValue();
                            ey1Var.q(iIntValue, iIntValue);
                            return t32Var;
                        }
                    } else {
                        vz1Var.a = null;
                        if (str2.length() > 0 && (numE = ey1Var.e()) != null) {
                            int iIntValue2 = numE.intValue();
                            ey1Var.q(iIntValue2, iIntValue2);
                            return t32Var;
                        }
                    }
                }
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                vz1 vz1Var2 = ey1Var.e;
                vz1Var2.a = null;
                hb hbVar2 = ey1Var.g;
                String str3 = hbVar2.f;
                String str4 = hbVar2.f;
                if (str3.length() > 0) {
                    if (ey1Var.f()) {
                        vz1Var2.a = null;
                        if (str4.length() > 0 && (numE2 = ey1Var.e()) != null) {
                            int iIntValue3 = numE2.intValue();
                            ey1Var.q(iIntValue3, iIntValue3);
                            return t32Var;
                        }
                    } else {
                        vz1Var2.a = null;
                        if (str4.length() > 0 && (numD2 = ey1Var.d()) != null) {
                            int iIntValue4 = numD2.intValue();
                            ey1Var.q(iIntValue4, iIntValue4);
                            return t32Var;
                        }
                    }
                }
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ey1Var.j();
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ey1Var.l();
                return t32Var;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ey1Var.o();
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ey1Var.n();
                return t32Var;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    if (ey1Var.f()) {
                        ey1Var.o();
                        return t32Var;
                    }
                    ey1Var.n();
                    return t32Var;
                }
                return t32Var;
            case el.a /* 9 */:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    if (ey1Var.f()) {
                        ey1Var.n();
                        return t32Var;
                    }
                    ey1Var.o();
                    return t32Var;
                }
                return t32Var;
            case el.b /* 10 */:
                if (ey1Var.g.f.length() > 0 && (pz1Var = ey1Var.c) != null) {
                    int iG = ey1Var.g(pz1Var, -1);
                    ey1Var.q(iG, iG);
                    return t32Var;
                }
                return t32Var;
            case 11:
                if (ey1Var.g.f.length() > 0 && (pz1Var2 = ey1Var.c) != null) {
                    int iG2 = ey1Var.g(pz1Var2, 1);
                    ey1Var.q(iG2, iG2);
                    return t32Var;
                }
                return t32Var;
            case el.c /* 12 */:
            case 48:
                return t32Var;
            case 13:
                if (ey1Var.g.f.length() > 0 && (qz1Var = ey1Var.i) != null) {
                    int iH = ey1Var.h(qz1Var, -1);
                    ey1Var.q(iH, iH);
                    return t32Var;
                }
                return t32Var;
            case 14:
                if (ey1Var.g.f.length() > 0 && (qz1Var2 = ey1Var.i) != null) {
                    int iH2 = ey1Var.h(qz1Var2, 1);
                    ey1Var.q(iH2, iH2);
                    return t32Var;
                }
                return t32Var;
            case 15:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    ey1Var.q(0, 0);
                    return t32Var;
                }
                return t32Var;
            case 16:
                ey1Var.e.a = null;
                hb hbVar3 = ey1Var.g;
                if (hbVar3.f.length() > 0) {
                    int length = hbVar3.f.length();
                    ey1Var.q(length, length);
                    return t32Var;
                }
                return t32Var;
            case 17:
                sx1Var.b.d(false);
                return t32Var;
            case 18:
                sx1Var.b.p();
                return t32Var;
            case 19:
                sx1Var.b.f();
                return t32Var;
            case 20:
                List listA = ey1Var.a(new fi1(15));
                if (listA != null) {
                    sx1Var.a(listA);
                    return t32Var;
                }
                return t32Var;
            case 21:
                List listA2 = ey1Var.a(new fi1(16));
                if (listA2 != null) {
                    sx1Var.a(listA2);
                    return t32Var;
                }
                return t32Var;
            case 22:
                List listA3 = ey1Var.a(new fi1(17));
                if (listA3 != null) {
                    sx1Var.a(listA3);
                    return t32Var;
                }
                return t32Var;
            case 23:
                List listA4 = ey1Var.a(new fi1(18));
                if (listA4 != null) {
                    sx1Var.a(listA4);
                    return t32Var;
                }
                return t32Var;
            case 24:
                List listA5 = ey1Var.a(new fi1(19));
                if (listA5 != null) {
                    sx1Var.a(listA5);
                    return t32Var;
                }
                return t32Var;
            case 25:
                List listA6 = ey1Var.a(new fi1(20));
                if (listA6 != null) {
                    sx1Var.a(listA6);
                    return t32Var;
                }
                return t32Var;
            case 26:
                ey1Var.e.a = null;
                hb hbVar4 = ey1Var.g;
                if (hbVar4.f.length() > 0) {
                    ey1Var.q(0, hbVar4.f.length());
                    return t32Var;
                }
                return t32Var;
            case 27:
                ey1Var.i();
                ey1Var.p();
                return t32Var;
            case 28:
                ey1Var.m();
                ey1Var.p();
                return t32Var;
            case 29:
                if (ey1Var.g.f.length() > 0 && (pz1Var3 = ey1Var.c) != null) {
                    int iG3 = ey1Var.g(pz1Var3, -1);
                    ey1Var.q(iG3, iG3);
                }
                ey1Var.p();
                return t32Var;
            case 30:
                if (ey1Var.g.f.length() > 0 && (pz1Var4 = ey1Var.c) != null) {
                    int iG4 = ey1Var.g(pz1Var4, 1);
                    ey1Var.q(iG4, iG4);
                }
                ey1Var.p();
                return t32Var;
            case 31:
                if (ey1Var.g.f.length() > 0 && (qz1Var3 = ey1Var.i) != null) {
                    int iH3 = ey1Var.h(qz1Var3, -1);
                    ey1Var.q(iH3, iH3);
                }
                ey1Var.p();
                return t32Var;
            case 32:
                if (ey1Var.g.f.length() > 0 && (qz1Var4 = ey1Var.i) != null) {
                    int iH4 = ey1Var.h(qz1Var4, 1);
                    ey1Var.q(iH4, iH4);
                }
                ey1Var.p();
                return t32Var;
            case 33:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    ey1Var.q(0, 0);
                }
                ey1Var.p();
                return t32Var;
            case 34:
                ey1Var.e.a = null;
                hb hbVar5 = ey1Var.g;
                if (hbVar5.f.length() > 0) {
                    int length2 = hbVar5.f.length();
                    ey1Var.q(length2, length2);
                }
                ey1Var.p();
                return t32Var;
            case 35:
                vz1 vz1Var3 = ey1Var.e;
                vz1Var3.a = null;
                hb hbVar6 = ey1Var.g;
                String str5 = hbVar6.f;
                String str6 = hbVar6.f;
                if (str5.length() > 0) {
                    if (ey1Var.f()) {
                        vz1Var3.a = null;
                        if (str6.length() > 0 && (numE3 = ey1Var.e()) != null) {
                            int iIntValue5 = numE3.intValue();
                            ey1Var.q(iIntValue5, iIntValue5);
                        }
                    } else {
                        vz1Var3.a = null;
                        if (str6.length() > 0 && (numD3 = ey1Var.d()) != null) {
                            int iIntValue6 = numD3.intValue();
                            ey1Var.q(iIntValue6, iIntValue6);
                        }
                    }
                }
                ey1Var.p();
                return t32Var;
            case 36:
                vz1 vz1Var4 = ey1Var.e;
                vz1Var4.a = null;
                hb hbVar7 = ey1Var.g;
                String str7 = hbVar7.f;
                String str8 = hbVar7.f;
                if (str7.length() > 0) {
                    if (ey1Var.f()) {
                        vz1Var4.a = null;
                        if (str8.length() > 0 && (numD4 = ey1Var.d()) != null) {
                            int iIntValue7 = numD4.intValue();
                            ey1Var.q(iIntValue7, iIntValue7);
                        }
                    } else {
                        vz1Var4.a = null;
                        if (str8.length() > 0 && (numE4 = ey1Var.e()) != null) {
                            int iIntValue8 = numE4.intValue();
                            ey1Var.q(iIntValue8, iIntValue8);
                        }
                    }
                }
                ey1Var.p();
                return t32Var;
            case 37:
                ey1Var.j();
                ey1Var.p();
                return t32Var;
            case 38:
                ey1Var.l();
                ey1Var.p();
                return t32Var;
            case 39:
                ey1Var.o();
                ey1Var.p();
                return t32Var;
            case 40:
                ey1Var.n();
                ey1Var.p();
                return t32Var;
            case 41:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    if (ey1Var.f()) {
                        ey1Var.o();
                    } else {
                        ey1Var.n();
                    }
                }
                ey1Var.p();
                return t32Var;
            case 42:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    if (ey1Var.f()) {
                        ey1Var.n();
                    } else {
                        ey1Var.o();
                    }
                }
                ey1Var.p();
                return t32Var;
            case 43:
                ey1Var.e.a = null;
                if (ey1Var.g.f.length() > 0) {
                    long j3 = ey1Var.f;
                    int i2 = wz1.c;
                    int i3 = (int) (j3 & 4294967295L);
                    ey1Var.q(i3, i3);
                    return t32Var;
                }
                return t32Var;
            case 44:
                if (!sx1Var.e) {
                    sx1Var.a(hk.G(new in("\n", 1)));
                    return t32Var;
                }
                vc1Var.e = sx1Var.a.x.f.r.w(sx1Var.l);
                return t32Var;
            case 45:
                if (sx1Var.e) {
                    vc1Var.e = false;
                    return t32Var;
                }
                sx1Var.a(hk.G(new in("\t", 1)));
                return t32Var;
            case 46:
                q32 q32Var = sx1Var.h;
                if (q32Var != null) {
                    q32Var.a(az1.a(ey1Var.h, ey1Var.g, ey1Var.f, 4));
                }
                q32 q32Var2 = sx1Var.h;
                if (q32Var2 != null) {
                    n81 n81Var2 = q32Var2.a;
                    if (n81Var2 != null && (n81Var = (n81) n81Var2.b) != null) {
                        q32Var2.a = n81Var;
                        q32Var2.c -= ((az1) n81Var2.c).a.f.length();
                        q32Var2.b = new n81(i, q32Var2.b, (az1) n81Var2.c);
                        az1Var = (az1) n81Var.c;
                    }
                    if (az1Var != null) {
                        sx1Var.k.i(az1Var);
                        return t32Var;
                    }
                }
                return t32Var;
            case 47:
                q32 q32Var3 = sx1Var.h;
                if (q32Var3 != null) {
                    n81 n81Var3 = q32Var3.b;
                    if (n81Var3 != null) {
                        q32Var3.b = (n81) n81Var3.b;
                        az1 az1Var2 = (az1) n81Var3.c;
                        q32Var3.a = new n81(i, q32Var3.a, az1Var2);
                        q32Var3.c = az1Var2.a.f.length() + q32Var3.c;
                        az1Var = (az1) n81Var3.c;
                    }
                    if (az1Var != null) {
                        sx1Var.k.i(az1Var);
                        return t32Var;
                    }
                }
                return t32Var;
            default:
                ez1.a();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x0575: MOVE (r3 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]) (LINE:1398), block:B:232:0x0575 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) throws Throwable {
        long jFloatToRawIntBits;
        oz1 oz1Var;
        cj cjVar;
        cj cjVar2;
        Object objG;
        jo0 jo0Var;
        int i = this.e;
        i60 i60Var = i60.a;
        int i2 = 7;
        int i3 = 8;
        int i4 = 3;
        final int i5 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        t32 t32Var = t32.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        final int i6 = 0;
        int i7 = 1;
        switch (i) {
            case 0:
                sa0 sa0Var = (sa0) obj4;
                fy0 fy0Var = (fy0) obj2;
                az1 az1Var = (az1) obj;
                ((fy0) obj3).setValue(az1Var);
                boolean zO = xi0.o((String) fy0Var.getValue(), az1Var.a.f);
                hb hbVar = az1Var.a;
                fy0Var.setValue(hbVar.f);
                if (!zO) {
                    sa0Var.i(hbVar.f);
                }
                return t32Var;
            case 1:
                hg1 hg1Var = (hg1) obj3;
                lh lhVar = (lh) obj2;
                p10 p10Var = (p10) obj;
                tt1 tt1Var = (tt1) ((me) obj4).b;
                tt1Var.getClass();
                float fFloatValue = Float.valueOf(tt1Var.e).floatValue();
                float f = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                float f2 = f / 2.0f;
                float f3 = f * 2.0f;
                float fMin = Math.min(Math.abs(hg1Var.b()), Math.abs(hg1Var.a()));
                float f4 = hg1Var.a;
                float f5 = hg1Var.b;
                boolean z = f3 > fMin;
                long j = hg1Var.e;
                kt1 kt1Var = new kt1(f, 0.0f, 0, 0, 30);
                if (z) {
                    p10.j0(p10Var, lhVar, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(hg1Var.b())) << 32) | (((long) Float.floatToRawIntBits(hg1Var.a())) & 4294967295L), j, 0.0f, null, null, 240);
                } else if (Float.intBitsToFloat((int) (j >> 32)) < f2) {
                    float f6 = f4 + f;
                    float f7 = f5 + f;
                    float f8 = hg1Var.c - f;
                    float f9 = hg1Var.d - f;
                    oc ocVarE = p10Var.E();
                    long jQ = ocVarE.q();
                    ocVarE.i().l();
                    try {
                        ((oc) ((qt0) ocVarE.a).f).i().e(f6, f7, f8, f9, 0);
                        p10.j0(p10Var, lhVar, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(hg1Var.b())) << 32) | (((long) Float.floatToRawIntBits(hg1Var.a())) & 4294967295L), j, 0.0f, null, null, 240);
                    } finally {
                        s91.r(ocVarE, jQ);
                    }
                } else {
                    p10.j0(p10Var, lhVar, (((long) Float.floatToRawIntBits(f4 + f2)) << 32) | (((long) Float.floatToRawIntBits(f5 + f2)) & 4294967295L), (((long) Float.floatToRawIntBits(hg1Var.b() - f)) << 32) | (((long) Float.floatToRawIntBits(hg1Var.a() - f)) & 4294967295L), pv.C(f2, j), 0.0f, kt1Var, null, 208);
                }
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                pc1 pc1Var = (pc1) obj3;
                float f10 = pc1Var.b;
                float f11 = pc1Var.d;
                float f12 = pc1Var.a;
                float f13 = pc1Var.c;
                lh lhVar2 = (lh) obj2;
                p10 p10Var2 = (p10) obj;
                tt1 tt1Var2 = (tt1) ((me) obj4).b;
                tt1Var2.getClass();
                float fFloatValue2 = Float.valueOf(tt1Var2.e).floatValue();
                float f14 = fFloatValue2 < 0.0f ? 0.0f : fFloatValue2;
                boolean z2 = f14 * 2.0f > Math.min(Math.abs(f13 - f12), Math.abs(f11 - f10));
                if (z2) {
                    jFloatToRawIntBits = pc1Var.d();
                } else {
                    float f15 = f14 / 2.0f;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12 + f15)) << 32) | (((long) Float.floatToRawIntBits(f15 + f10)) & 4294967295L);
                }
                p10.x(p10Var2, lhVar2, jFloatToRawIntBits, z2 ? pc1Var.c() : (((long) Float.floatToRawIntBits((f13 - f12) - f14)) << 32) | (((long) Float.floatToRawIntBits((f11 - f10) - f14)) & 4294967295L), 0.0f, z2 ? i60Var : new kt1(f14, 0.0f, 0, 0, 30), null, 104);
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                String str = (String) obj;
                str.getClass();
                ((wa0) obj4).h((iq) obj2, str);
                ((fy0) obj3).setValue(null);
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                vr vrVar = (vr) obj4;
                oj0 oj0Var = (oj0) obj3;
                zj1 zj1Var = (zj1) obj2;
                float fFloatValue3 = ((Float) obj).floatValue();
                float f16 = vrVar.u ? 1.0f : -1.0f;
                bk1 bk1Var = vrVar.t;
                long jF = bk1Var.f(bk1Var.i(f16 * fFloatValue3));
                bk1 bk1Var2 = zj1Var.a;
                float fH = bk1Var.h(bk1Var.f(bk1Var2.d(bk1Var2.k, jF, 1))) * f16;
                if (Math.abs(fH) < Math.abs(fFloatValue3)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fH + " < " + fFloatValue3 + ")");
                    cancellationException.initCause(null);
                    oj0Var.a(cancellationException);
                }
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                jo0 jo0Var2 = (jo0) obj4;
                long j2 = ((az1) obj3).b;
                z01 z01Var = (z01) obj2;
                p10 p10Var3 = (p10) obj;
                qz1 qz1VarD = jo0Var2.d();
                if (qz1VarD != null) {
                    cj cjVarI = p10Var3.E().i();
                    long j3 = ((wz1) jo0Var2.A.getValue()).a;
                    long j4 = ((wz1) jo0Var2.B.getValue()).a;
                    pz1 pz1Var = qz1VarD.a;
                    vw0 vw0Var = pz1Var.b;
                    oz1 oz1Var2 = pz1Var.a;
                    p6 p6Var = jo0Var2.y;
                    long j5 = jo0Var2.z;
                    if (!wz1.c(j3)) {
                        p6Var.f(j5);
                        int iG = z01Var.g(wz1.f(j3));
                        int iG2 = z01Var.g(wz1.e(j3));
                        if (iG != iG2) {
                            cjVarI.h(pz1Var.h(iG, iG2), p6Var);
                        }
                        oz1Var = oz1Var2;
                    } else if (wz1.c(j4)) {
                        oz1Var = oz1Var2;
                        if (!wz1.c(j2)) {
                            p6Var.f(j5);
                            int iG3 = z01Var.g(wz1.f(j2));
                            int iG4 = z01Var.g(wz1.e(j2));
                            if (iG3 != iG4) {
                                cjVarI.h(pz1Var.h(iG3, iG4), p6Var);
                            }
                        }
                    } else {
                        oz1Var = oz1Var2;
                        long jB = oz1Var.b.b();
                        vl vlVar = jB != 16 ? new vl(jB) : null;
                        long j6 = vlVar != null ? vlVar.a : vl.b;
                        p6Var.f(vl.b(vl.d(j6) * 0.2f, j6));
                        int iG5 = z01Var.g(wz1.f(j4));
                        int iG6 = z01Var.g(wz1.e(j4));
                        if (iG5 != iG6) {
                            cjVarI.h(pz1Var.h(iG5, iG6), p6Var);
                        }
                    }
                    long j7 = pz1Var.c;
                    float f17 = (int) (j7 >> 32);
                    vw0 vw0Var2 = pz1Var.b;
                    boolean z3 = ((f17 > vw0Var2.d ? 1 : (f17 == vw0Var2.d ? 0 : -1)) < 0 || vw0Var2.c || (((float) ((int) (j7 & 4294967295L))) > vw0Var2.e ? 1 : (((float) ((int) (j7 & 4294967295L))) == vw0Var2.e ? 0 : -1)) < 0) && oz1Var.f != 3;
                    if (z3) {
                        long j8 = pz1Var.c;
                        pc1 pc1VarA = qc1.a(0L, (((long) Float.floatToRawIntBits((int) (j8 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j8 & 4294967295L))) & 4294967295L));
                        cjVarI.l();
                        cj.k(cjVarI, pc1VarA);
                    }
                    zq1 zq1Var = oz1Var.b.a;
                    ax1 ax1Var = zq1Var.m;
                    cz1 cz1Var = zq1Var.a;
                    if (ax1Var == null) {
                        ax1Var = ax1.b;
                    }
                    ax1 ax1Var2 = ax1Var;
                    um1 um1Var = zq1Var.n;
                    if (um1Var == null) {
                        um1Var = um1.d;
                    }
                    um1 um1Var2 = um1Var;
                    q10 q10Var = zq1Var.p;
                    q10 q10Var2 = q10Var == null ? i60Var : q10Var;
                    try {
                        lh lhVarC = cz1Var.c();
                        bz1 bz1Var = bz1.a;
                        try {
                            if (lhVarC == null) {
                                cj cjVar3 = cjVarI;
                                long jB2 = cz1Var != bz1Var ? cz1Var.b() : vl.b;
                                cjVar3.l();
                                ArrayList arrayList = vw0Var.h;
                                int size = arrayList.size();
                                int i8 = 0;
                                while (i8 < size) {
                                    l41 l41Var = (l41) arrayList.get(i8);
                                    l41Var.a.f(cjVar3, jB2, um1Var2, ax1Var2, q10Var2);
                                    cjVar = cjVar3;
                                    try {
                                        cjVar.f(0.0f, l41Var.a.b());
                                        i8++;
                                        cjVar3 = cjVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (z3) {
                                            cjVar.i();
                                        }
                                        throw th;
                                    }
                                }
                                cjVar = cjVar3;
                                cjVar.i();
                            } else {
                                vw0.i(vw0Var, cjVarI, lhVarC, cz1Var != bz1Var ? cz1Var.a() : 1.0f, um1Var2, ax1Var2, q10Var2);
                                cjVar = cjVarI;
                            }
                            if (z3) {
                                cjVar.i();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cjVar = cjVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cjVar = cjVarI;
                    }
                    break;
                }
                return t32Var;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = (Context) obj3;
                ww1 ww1Var = (ww1) obj2;
                ds dsVar = (ds) obj;
                List list = ((kw1) obj4).a;
                int size2 = list.size();
                int i9 = 0;
                while (i9 < size2) {
                    jw1 jw1Var = (jw1) list.get(i9);
                    if (jw1Var instanceof rw1) {
                        rw1 rw1Var = (rw1) jw1Var;
                        ds.b(dsVar, new ud(i2, rw1Var), rw1Var.c == 0 ? null : new jo(-1930700965, true, new qw1(i5, rw1Var)), new f8(i3, rw1Var, ww1Var), 6);
                    } else if (jw1Var instanceof xw1) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            xw1 xw1Var = (xw1) jw1Var;
                            if (context != null) {
                                int i10 = xw1Var.c;
                                TextClassification textClassification = xw1Var.b;
                                Drawable drawable = xw1Var.d;
                                if (i10 < 0) {
                                    ds.b(dsVar, new ud(19, textClassification), drawable != null ? new jo(-1123224187, true, new qw1(i6, drawable)) : null, new f8(15, context, textClassification), 6);
                                } else {
                                    RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i10);
                                    ds.b(dsVar, new ud(20, remoteAction), drawable != null ? new jo(1106162332, true, new qw1(1, drawable)) : null, new p7(24, remoteAction), 6);
                                }
                            }
                        }
                    } else if (jw1Var instanceof vw1) {
                        dsVar.a.add(s22.b);
                    }
                    i9++;
                    i2 = 7;
                    i5 = 2;
                }
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                gp1 gp1Var = (gp1) obj4;
                k31 k31Var = (k31) obj2;
                long j9 = ((h00) obj).a;
                long jF2 = ((i10) obj3).R ? w01.f(-1.0f, j9) : w01.f(1.0f, j9);
                f10 f10Var = g10.a;
                gp1Var.a.a(Float.intBitsToFloat((int) (k31Var == k31.e ? jF2 & 4294967295L : jF2 >> 32)));
                return t32Var;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                fy0 fy0Var2 = (fy0) obj3;
                ArrayList arrayList2 = (ArrayList) obj4;
                List list2 = (List) obj2;
                y61 y61Var = (y61) obj;
                y61Var.e = true;
                int size3 = arrayList2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((qn0) arrayList2.get(i11)).c(y61Var);
                }
                int size4 = list2.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ((qn0) list2.get(i12)).c(y61Var);
                }
                y61Var.e = false;
                fy0Var2.getValue();
                return t32Var;
            case el.a /* 9 */:
                xo0 xo0Var = (xo0) obj3;
                final dp0 dp0Var = (dp0) obj2;
                final sa0 sa0Var2 = (sa0) obj4;
                final zc1 zc1Var = new zc1();
                vo0 vo0Var = new vo0() { // from class: to0
                    @Override // defpackage.vo0
                    public final void e(xo0 xo0Var2, po0 po0Var) {
                        int i13 = uo0.a[po0Var.ordinal()];
                        zc1 zc1Var2 = zc1Var;
                        if (i13 == 1) {
                            zc1Var2.e = sa0Var2.i(dp0Var);
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            te teVar = (te) zc1Var2.e;
                            if (teVar != null) {
                                teVar.a();
                            }
                            zc1Var2.e = null;
                        }
                    }
                };
                xo0Var.g().a(vo0Var);
                return new n9(xo0Var, vo0Var, zc1Var, 1);
            case el.b /* 10 */:
                ue1 ue1Var = (ue1) obj;
                ue1Var.n(((hx) obj4).y(((tz) ((ns1) obj2).getValue()).e));
                ue1Var.o((ym1) obj3);
                ue1Var.f(false);
                return t32Var;
            case 11:
                ax0 ax0Var = (ax0) obj3;
                zc1 zc1Var2 = (zc1) obj2;
                if (((Set) obj4).contains(obj) && (objG = ax0Var.b.g(obj)) != null) {
                    if (objG instanceof ay0) {
                        ay0 ay0Var = (ay0) objG;
                        Object[] objArr8 = ay0Var.b;
                        long[] jArr = ay0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j10 = jArr[i13];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((255 & j10) < 128) {
                                            im1 im1Var = (im1) objArr8[(i13 << 3) + i15];
                                            if (zc1Var2.e == null) {
                                                zc1Var2.e = new ArrayList();
                                            }
                                            ((List) zc1Var2.e).add(im1Var);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i14 == 8) {
                                        if (i13 != length) {
                                            i13++;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        im1 im1Var2 = (im1) objG;
                        if (zc1Var2.e == null) {
                            zc1Var2.e = new ArrayList();
                        }
                        ((List) zc1Var2.e).add(im1Var2);
                    }
                }
                return t32Var;
            case el.c /* 12 */:
                ih1 ih1Var = (ih1) obj4;
                nh1 nh1Var = (nh1) obj2;
                zx0 zx0Var = ih1Var.f;
                if (zx0Var.b(obj3)) {
                    yc.f(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                ih1Var.e.remove(obj3);
                zx0Var.m(obj3, nh1Var);
                return new n9(ih1Var, obj3, nh1Var, i5);
            case 13:
                go1 go1Var = (go1) obj4;
                yc ycVar = (yc) obj3;
                vc1 vc1Var = (vc1) obj2;
                l81 l81Var = (l81) obj;
                long j11 = l81Var.c;
                ry1 ry1Var = (ry1) go1Var.d;
                if (ry1Var.k() && ry1Var.n().a.f.length() != 0 && (jo0Var = ry1Var.d) != null && jo0Var.d() != null) {
                    go1Var.c(ry1Var.n(), j11, false, ycVar);
                    i6 = 1;
                }
                if (i6 != 0) {
                    l81Var.a();
                    vc1Var.e = true;
                }
                return t32Var;
            case 14:
                pc pcVar = (pc) obj2;
                Throwable th4 = (Throwable) obj;
                ((n) obj4).i(th4);
                rh rhVar = (rh) ((vu) obj3).g;
                rhVar.g(th4, false);
                while (true) {
                    Object objV = nu0.v(rhVar.r());
                    if (objV == null) {
                        return t32Var;
                    }
                    pcVar.h(objV, th4);
                }
                break;
            case 15:
                sa0 sa0Var3 = (sa0) obj4;
                kz1 kz1Var = (kz1) ((zc1) obj2).e;
                az1 az1VarQ = ((xg0) obj3).q((List) obj);
                if (kz1Var != null) {
                    kz1Var.a(null, az1VarQ);
                }
                sa0Var3.i(az1VarQ);
                return t32Var;
            case 16:
                return d(obj);
            default:
                final ry1 ry1Var2 = (ry1) obj4;
                vt vtVar = (vt) obj3;
                Context context2 = (Context) obj2;
                iw1 iw1Var = (iw1) obj;
                sx0 sx0Var = iw1Var.a;
                sx0 sx0Var2 = iw1Var.a;
                vw1 vw1Var = vw1.b;
                sx0Var.a(vw1Var);
                sw1 sw1Var = sw1.Autofill;
                Object[] objArr9 = (wz1.c(ry1Var2.n().b) || !ry1Var2.j() || ry1Var2.g == null) ? false : true;
                int i16 = 16;
                f8 f8Var = new f8(i16, vtVar, new my1(ry1Var2, objArr7 == true ? 1 : 0, i7));
                Resources resources = context2.getResources();
                int i17 = 22;
                d dVar = new d(i17, f8Var, objArr6 == true ? 1 : 0);
                if (objArr9 != false) {
                    sx0Var2.a(new rw1(c2.K, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, dVar));
                }
                sw1 sw1Var2 = sw1.Autofill;
                boolean z4 = (wz1.c(ry1Var2.n().b) || ry1Var2.g == null) ? false : true;
                f8 f8Var2 = new f8(i16, vtVar, new my1(ry1Var2, objArr5 == true ? 1 : 0, i5));
                Resources resources2 = context2.getResources();
                d dVar2 = new d(i17, f8Var2, objArr4 == true ? 1 : 0);
                if (z4) {
                    sx0Var2.a(new rw1(c2.L, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, dVar2));
                }
                sw1 sw1Var3 = sw1.Autofill;
                boolean z5 = ry1Var2.j() && ((Boolean) ry1Var2.w.getValue()).booleanValue() && ry1Var2.g != null;
                f8 f8Var3 = new f8(i16, vtVar, new my1(ry1Var2, objArr3 == true ? 1 : 0, i4));
                Resources resources3 = context2.getResources();
                d dVar3 = new d(i17, f8Var3, objArr2 == true ? 1 : 0);
                if (z5) {
                    sx0Var2.a(new rw1(c2.M, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, dVar3));
                }
                sw1 sw1Var4 = sw1.Autofill;
                boolean z6 = wz1.d(ry1Var2.n().b) != ry1Var2.n().a.f.length();
                ha0 ha0Var = new ha0() { // from class: vy1
                    @Override // defpackage.ha0
                    public final Object a() {
                        int i18 = i6;
                        t32 t32Var2 = t32.a;
                        ry1 ry1Var3 = ry1Var2;
                        switch (i18) {
                            case 0:
                                break;
                            case 1:
                                az1 az1VarE = ry1.e(ry1Var3.n().a, af1.g(0, ry1Var3.n().a.f.length()));
                                ry1Var3.c.i(az1VarE);
                                long j12 = az1VarE.b;
                                ry1Var3.v = new wz1(j12);
                                ry1Var3.t = az1.a(ry1Var3.t, null, j12, 5);
                                ry1Var3.h(true);
                                break;
                            default:
                                ha0 ha0Var2 = ry1Var3.f;
                                if (ha0Var2 != null) {
                                    ha0Var2.a();
                                }
                                break;
                        }
                        return t32Var2;
                    }
                };
                final int i18 = 1;
                ha0 ha0Var2 = new ha0() { // from class: vy1
                    @Override // defpackage.ha0
                    public final Object a() {
                        int i182 = i18;
                        t32 t32Var2 = t32.a;
                        ry1 ry1Var3 = ry1Var2;
                        switch (i182) {
                            case 0:
                                break;
                            case 1:
                                az1 az1VarE = ry1.e(ry1Var3.n().a, af1.g(0, ry1Var3.n().a.f.length()));
                                ry1Var3.c.i(az1VarE);
                                long j12 = az1VarE.b;
                                ry1Var3.v = new wz1(j12);
                                ry1Var3.t = az1.a(ry1Var3.t, null, j12, 5);
                                ry1Var3.h(true);
                                break;
                            default:
                                ha0 ha0Var22 = ry1Var3.f;
                                if (ha0Var22 != null) {
                                    ha0Var22.a();
                                }
                                break;
                        }
                        return t32Var2;
                    }
                };
                Resources resources4 = context2.getResources();
                d dVar4 = new d(i17, ha0Var2, ha0Var);
                if (z6) {
                    sx0Var2.a(new rw1(c2.N, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, dVar4));
                }
                sw1 sw1Var5 = sw1.Autofill;
                if (ry1Var2.j() && wz1.c(ry1Var2.n().b)) {
                    i6 = 1;
                }
                ha0 ha0Var3 = new ha0() { // from class: vy1
                    @Override // defpackage.ha0
                    public final Object a() {
                        int i182 = i5;
                        t32 t32Var2 = t32.a;
                        ry1 ry1Var3 = ry1Var2;
                        switch (i182) {
                            case 0:
                                break;
                            case 1:
                                az1 az1VarE = ry1.e(ry1Var3.n().a, af1.g(0, ry1Var3.n().a.f.length()));
                                ry1Var3.c.i(az1VarE);
                                long j12 = az1VarE.b;
                                ry1Var3.v = new wz1(j12);
                                ry1Var3.t = az1.a(ry1Var3.t, null, j12, 5);
                                ry1Var3.h(true);
                                break;
                            default:
                                ha0 ha0Var22 = ry1Var3.f;
                                if (ha0Var22 != null) {
                                    ha0Var22.a();
                                }
                                break;
                        }
                        return t32Var2;
                    }
                };
                Resources resources5 = context2.getResources();
                d dVar5 = new d(i17, ha0Var3, objArr == true ? 1 : 0);
                if (i6 != 0) {
                    sx0Var2.a(new rw1(sw1Var5.e, resources5.getString(sw1Var5.f), sw1Var5.g, dVar5));
                }
                sx0Var2.a(vw1Var);
                return t32Var;
        }
    }

    public /* synthetic */ kf(wa0 wa0Var, iq iqVar, fy0 fy0Var) {
        this.e = 3;
        this.f = wa0Var;
        this.h = iqVar;
        this.g = fy0Var;
    }

    public /* synthetic */ kf(vr vrVar, k42 k42Var, oj0 oj0Var, zj1 zj1Var) {
        this.e = 4;
        this.f = vrVar;
        this.g = oj0Var;
        this.h = zj1Var;
    }

    public /* synthetic */ kf(xo0 xo0Var, dp0 dp0Var, sa0 sa0Var) {
        this.e = 9;
        this.g = xo0Var;
        this.h = dp0Var;
        this.f = sa0Var;
    }

    public /* synthetic */ kf(fy0 fy0Var, ArrayList arrayList, List list, boolean z) {
        this.e = 8;
        this.g = fy0Var;
        this.f = arrayList;
        this.h = list;
    }

    public /* synthetic */ kf(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
