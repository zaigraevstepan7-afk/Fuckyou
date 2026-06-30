package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh1 implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ zh1(int i) {
        this.e = i;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        gb gbVar;
        int i = 0;
        u30Var = null;
        u30 u30Var = null;
        um1Var = null;
        um1 um1Var = null;
        uz1Var = null;
        uz1 uz1Var = null;
        vp0Var = null;
        vp0 vp0Var = null;
        wp0Var = null;
        wp0 wp0Var = null;
        m42Var = null;
        m42 m42Var = null;
        t52Var = null;
        t52 t52Var = null;
        zq1Var = null;
        zq1 zq1Var = null;
        p41Var = null;
        p41 p41Var = null;
        sz1Var = null;
        sz1 sz1Var = null;
        sz1Var = null;
        sz1 sz1Var2 = null;
        switch (this.e) {
            case 0:
                obj.getClass();
                return new ax1(((Integer) obj).intValue());
            case 1:
                obj.getClass();
                List list = (List) obj;
                return new dz1(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                h02[] h02VarArr = g02.b;
                sa0 sa0Var = ei1.v.b;
                Boolean bool = Boolean.FALSE;
                xi0.o(obj2, bool);
                g02 g02Var = obj2 != null ? (g02) sa0Var.i(obj2) : null;
                g02Var.getClass();
                long j = g02Var.a;
                Object obj3 = list2.get(1);
                xi0.o(obj3, bool);
                g02 g02Var2 = obj3 != null ? (g02) sa0Var.i(obj3) : null;
                g02Var2.getClass();
                return new fz1(j, g02Var2.a);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                obj.getClass();
                return new aa0(((Integer) obj).intValue());
            case t91.LONG_FIELD_NUMBER /* 4 */:
                obj.getClass();
                return new df(((Float) obj).floatValue());
            case t91.STRING_FIELD_NUMBER /* 5 */:
                obj.getClass();
                List list3 = (List) obj;
                Object obj4 = list3.get(0);
                Integer num = obj4 != null ? (Integer) obj4 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj5 = list3.get(1);
                Integer num2 = obj5 != null ? (Integer) obj5 : null;
                num2.getClass();
                return new wz1(af1.g(iIntValue, num2.intValue()));
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                obj.getClass();
                List list4 = (List) obj;
                Object obj6 = list4.get(0);
                int i2 = vl.h;
                Boolean bool2 = Boolean.FALSE;
                xi0.o(obj6, bool2);
                vl vlVar = obj6 != null ? xi0.o(obj6, Boolean.FALSE) ? new vl(vl.g) : new vl(lk.f(((Integer) obj6).intValue())) : null;
                vlVar.getClass();
                long j2 = vlVar.a;
                Object obj7 = list4.get(1);
                di1 di1Var = ei1.x;
                xi0.o(obj7, bool2);
                w01 w01Var = obj7 != null ? (w01) di1Var.b.i(obj7) : null;
                w01Var.getClass();
                long j3 = w01Var.a;
                Object obj8 = list4.get(2);
                Float f = obj8 != null ? (Float) obj8 : null;
                f.getClass();
                return new um1(f.floatValue(), j2, j3);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                obj.getClass();
                return new dw1(((Integer) obj).intValue());
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                obj.getClass();
                List list5 = (List) obj;
                Object obj9 = list5.get(0);
                String str = obj9 != null ? (String) obj9 : null;
                str.getClass();
                Object obj10 = list5.get(1);
                n81 n81Var = ei1.i;
                if (!xi0.o(obj10, Boolean.FALSE) && obj10 != null) {
                    sz1Var2 = (sz1) ((sa0) n81Var.c).i(obj10);
                }
                return new wp0(str, sz1Var2);
            case el.a /* 9 */:
                obj.getClass();
                return new dx1(((Integer) obj).intValue());
            case el.b /* 10 */:
                obj.getClass();
                return new le0(((Integer) obj).intValue());
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                ArrayList arrayList = new ArrayList(list6.size());
                int size = list6.size();
                while (i < size) {
                    Object obj11 = list6.get(i);
                    gb gbVar2 = (xi0.o(obj11, Boolean.FALSE) || obj11 == null) ? null : (gb) ((sa0) ei1.b.c).i(obj11);
                    gbVar2.getClass();
                    arrayList.add(gbVar2);
                    i++;
                }
                return arrayList;
            case el.c /* 12 */:
                obj.getClass();
                return new y90(((Integer) obj).intValue());
            case 13:
                obj.getClass();
                return new z90(((Integer) obj).intValue());
            case 14:
                Boolean bool3 = Boolean.FALSE;
                if (xi0.o(obj, bool3)) {
                    return new g02(g02.c);
                }
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                Float f2 = obj12 != null ? (Float) obj12 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj13 = list7.get(1);
                di1 di1Var2 = ei1.w;
                xi0.o(obj13, bool3);
                h02 h02Var = obj13 != null ? (h02) di1Var2.b.i(obj13) : null;
                h02Var.getClass();
                return new g02(uc1.y(fFloatValue, h02Var.a));
            case 15:
                return xi0.o(obj, 0) ? new h02(8589934592L) : xi0.o(obj, 1) ? new h02(4294967296L) : new h02(0L);
            case 16:
                if (xi0.o(obj, Boolean.FALSE)) {
                    return new w01(9205357640488583168L);
                }
                obj.getClass();
                List list8 = (List) obj;
                Object obj14 = list8.get(0);
                Float f3 = obj14 != null ? (Float) obj14 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj15 = list8.get(1);
                Float f4 = obj15 != null ? (Float) obj15 : null;
                f4.getClass();
                return new w01((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    Object obj16 = list9.get(i);
                    zr0 zr0Var = (xi0.o(obj16, Boolean.FALSE) || obj16 == null) ? null : (zr0) ((sa0) ei1.z.c).i(obj16);
                    zr0Var.getClass();
                    arrayList2.add(zr0Var);
                    i++;
                }
                return new as0(arrayList2);
            case 18:
                obj.getClass();
                String str2 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                if (xi0.o(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new zr0(localeForLanguageTag);
            case 19:
                obj.getClass();
                List list10 = (List) obj;
                Object obj17 = list10.get(0);
                String str3 = obj17 != null ? (String) obj17 : null;
                str3.getClass();
                Object obj18 = list10.get(1);
                n81 n81Var2 = ei1.i;
                if (!xi0.o(obj18, Boolean.FALSE) && obj18 != null) {
                    sz1Var = (sz1) ((sa0) n81Var2.c).i(obj18);
                }
                return new vp0(str3, sz1Var);
            case 20:
                obj.getClass();
                List list11 = (List) obj;
                Object obj19 = list11.get(0);
                float f5 = jp0.b;
                di1 di1Var3 = ei1.B;
                Boolean bool4 = Boolean.FALSE;
                xi0.o(obj19, bool4);
                jp0 jp0Var = obj19 != null ? (jp0) di1Var3.b.i(obj19) : null;
                jp0Var.getClass();
                float f6 = jp0Var.a;
                Object obj20 = list11.get(1);
                di1 di1Var4 = ei1.C;
                xi0.o(obj20, bool4);
                lp0 lp0Var = obj20 != null ? (lp0) di1Var4.b.i(obj20) : null;
                lp0Var.getClass();
                int i3 = lp0Var.a;
                Object obj21 = list11.get(2);
                di1 di1Var5 = ei1.D;
                xi0.o(obj21, bool4);
                kp0 kp0Var = obj21 != null ? (kp0) di1Var5.b.i(obj21) : null;
                kp0Var.getClass();
                return new mp0(f6, i3, kp0Var.a);
            case 21:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                jp0.a(fFloatValue3);
                return new jp0(fFloatValue3);
            case 22:
                obj.getClass();
                return new lp0(((Integer) obj).intValue());
            case 23:
                obj.getClass();
                List list12 = (List) obj;
                Object obj22 = list12.get(0);
                jb jbVar = obj22 != null ? (jb) obj22 : null;
                jbVar.getClass();
                Object obj23 = list12.get(2);
                Integer num3 = obj23 != null ? (Integer) obj23 : null;
                num3.getClass();
                int iIntValue2 = num3.intValue();
                Object obj24 = list12.get(3);
                Integer num4 = obj24 != null ? (Integer) obj24 : null;
                num4.getClass();
                int iIntValue3 = num4.intValue();
                Object obj25 = list12.get(4);
                String str4 = obj25 != null ? (String) obj25 : null;
                str4.getClass();
                switch (jbVar.ordinal()) {
                    case 0:
                        Object obj26 = list12.get(1);
                        n81 n81Var3 = ei1.g;
                        if (!xi0.o(obj26, Boolean.FALSE) && obj26 != null) {
                            p41Var = (p41) ((sa0) n81Var3.c).i(obj26);
                        }
                        p41Var.getClass();
                        gbVar = new gb(p41Var, iIntValue2, iIntValue3, str4);
                        break;
                    case 1:
                        Object obj27 = list12.get(1);
                        n81 n81Var4 = ei1.h;
                        if (!xi0.o(obj27, Boolean.FALSE) && obj27 != null) {
                            zq1Var = (zq1) ((sa0) n81Var4.c).i(obj27);
                        }
                        zq1Var.getClass();
                        gbVar = new gb(zq1Var, iIntValue2, iIntValue3, str4);
                        break;
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        Object obj28 = list12.get(1);
                        n81 n81Var5 = ei1.c;
                        if (!xi0.o(obj28, Boolean.FALSE) && obj28 != null) {
                            t52Var = (t52) ((sa0) n81Var5.c).i(obj28);
                        }
                        t52Var.getClass();
                        gbVar = new gb(t52Var, iIntValue2, iIntValue3, str4);
                        break;
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        Object obj29 = list12.get(1);
                        n81 n81Var6 = ei1.d;
                        if (!xi0.o(obj29, Boolean.FALSE) && obj29 != null) {
                            m42Var = (m42) ((sa0) n81Var6.c).i(obj29);
                        }
                        m42Var.getClass();
                        gbVar = new gb(m42Var, iIntValue2, iIntValue3, str4);
                        break;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        Object obj30 = list12.get(1);
                        n81 n81Var7 = ei1.e;
                        if (!xi0.o(obj30, Boolean.FALSE) && obj30 != null) {
                            wp0Var = (wp0) ((sa0) n81Var7.c).i(obj30);
                        }
                        wp0Var.getClass();
                        gbVar = new gb(wp0Var, iIntValue2, iIntValue3, str4);
                        break;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        Object obj31 = list12.get(1);
                        n81 n81Var8 = ei1.f;
                        if (!xi0.o(obj31, Boolean.FALSE) && obj31 != null) {
                            vp0Var = (vp0) ((sa0) n81Var8.c).i(obj31);
                        }
                        vp0Var.getClass();
                        gbVar = new gb(vp0Var, iIntValue2, iIntValue3, str4);
                        break;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        Object obj32 = list12.get(1);
                        String str5 = obj32 != null ? (String) obj32 : null;
                        str5.getClass();
                        gbVar = new gb(new bt1(str5), iIntValue2, iIntValue3, str4);
                        break;
                    default:
                        ez1.a();
                        return null;
                }
                return gbVar;
            case 24:
                obj.getClass();
                return new kp0(((Integer) obj).intValue());
            case 25:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new t52(str6);
            case 26:
                String str7 = obj != null ? (String) obj : null;
                str7.getClass();
                return new m42(str7);
            case 27:
                obj.getClass();
                List list13 = (List) obj;
                Object obj33 = list13.get(0);
                di1 di1Var6 = ei1.q;
                Boolean bool5 = Boolean.FALSE;
                xi0.o(obj33, bool5);
                dw1 dw1Var = obj33 != null ? (dw1) di1Var6.b.i(obj33) : null;
                dw1Var.getClass();
                int i4 = dw1Var.a;
                Object obj34 = list13.get(1);
                di1 di1Var7 = ei1.r;
                xi0.o(obj34, bool5);
                dx1 dx1Var = obj34 != null ? (dx1) di1Var7.b.i(obj34) : null;
                dx1Var.getClass();
                int i5 = dx1Var.a;
                Object obj35 = list13.get(2);
                h02[] h02VarArr2 = g02.b;
                di1 di1Var8 = ei1.v;
                xi0.o(obj35, bool5);
                g02 g02Var3 = obj35 != null ? (g02) di1Var8.b.i(obj35) : null;
                g02Var3.getClass();
                long j4 = g02Var3.a;
                Object obj36 = list13.get(3);
                fz1 fz1Var = fz1.c;
                fz1 fz1Var2 = (xi0.o(obj36, bool5) || obj36 == null) ? null : (fz1) ((sa0) ei1.l.c).i(obj36);
                Object obj37 = list13.get(4);
                m71 m71Var = (xi0.o(obj37, bool5) || obj37 == null) ? null : (m71) ((sa0) c2.C.c).i(obj37);
                Object obj38 = list13.get(5);
                mp0 mp0Var = mp0.d;
                mp0 mp0Var2 = (xi0.o(obj38, bool5) || obj38 == null) ? null : (mp0) ((sa0) ei1.A.c).i(obj38);
                Object obj39 = list13.get(6);
                hp0 hp0Var = (xi0.o(obj39, bool5) || obj39 == null) ? null : (hp0) ((sa0) c2.E.c).i(obj39);
                hp0Var.getClass();
                int i6 = hp0Var.a;
                Object obj40 = list13.get(7);
                di1 di1Var9 = ei1.s;
                xi0.o(obj40, bool5);
                le0 le0Var = obj40 != null ? (le0) di1Var9.b.i(obj40) : null;
                le0Var.getClass();
                int i7 = le0Var.a;
                Object obj41 = list13.get(8);
                n81 n81Var9 = c2.F;
                if (!xi0.o(obj41, bool5) && obj41 != null) {
                    uz1Var = (uz1) ((sa0) n81Var9.c).i(obj41);
                }
                return new p41(i4, i5, j4, fz1Var2, m71Var, mp0Var2, i6, i7, uz1Var);
            case 28:
                obj.getClass();
                List list14 = (List) obj;
                Object obj42 = list14.get(0);
                int i8 = vl.h;
                Boolean bool6 = Boolean.FALSE;
                xi0.o(obj42, bool6);
                vl vlVar2 = obj42 != null ? obj42.equals(bool6) ? new vl(vl.g) : new vl(lk.f(((Integer) obj42).intValue())) : null;
                vlVar2.getClass();
                long j5 = vlVar2.a;
                Object obj43 = list14.get(1);
                h02[] h02VarArr3 = g02.b;
                sa0 sa0Var2 = ei1.v.b;
                xi0.o(obj43, bool6);
                g02 g02Var4 = obj43 != null ? (g02) sa0Var2.i(obj43) : null;
                g02Var4.getClass();
                long j6 = g02Var4.a;
                Object obj44 = list14.get(2);
                aa0 aa0Var = aa0.f;
                aa0 aa0Var2 = (xi0.o(obj44, bool6) || obj44 == null) ? null : (aa0) ((sa0) ei1.m.c).i(obj44);
                Object obj45 = list14.get(3);
                y90 y90Var = (xi0.o(obj45, bool6) || obj45 == null) ? null : (y90) ((sa0) ei1.t.c).i(obj45);
                Object obj46 = list14.get(4);
                z90 z90Var = (xi0.o(obj46, bool6) || obj46 == null) ? null : (z90) ((sa0) ei1.u.c).i(obj46);
                Object obj47 = list14.get(6);
                String str8 = obj47 != null ? (String) obj47 : null;
                Object obj48 = list14.get(7);
                xi0.o(obj48, bool6);
                g02 g02Var5 = obj48 != null ? (g02) sa0Var2.i(obj48) : null;
                g02Var5.getClass();
                long j7 = g02Var5.a;
                Object obj49 = list14.get(8);
                df dfVar = (xi0.o(obj49, bool6) || obj49 == null) ? null : (df) ((sa0) ei1.n.c).i(obj49);
                Object obj50 = list14.get(9);
                dz1 dz1Var = (xi0.o(obj50, bool6) || obj50 == null) ? null : (dz1) ((sa0) ei1.k.c).i(obj50);
                Object obj51 = list14.get(10);
                as0 as0Var = as0.g;
                as0 as0Var2 = (xi0.o(obj51, bool6) || obj51 == null) ? null : (as0) ((sa0) ei1.y.c).i(obj51);
                Object obj52 = list14.get(11);
                xi0.o(obj52, bool6);
                vl vlVar3 = obj52 != null ? obj52.equals(bool6) ? new vl(vl.g) : new vl(lk.f(((Integer) obj52).intValue())) : null;
                vlVar3.getClass();
                long j8 = vlVar3.a;
                Object obj53 = list14.get(12);
                ax1 ax1Var = (xi0.o(obj53, bool6) || obj53 == null) ? null : (ax1) ((sa0) ei1.j.c).i(obj53);
                Object obj54 = list14.get(13);
                um1 um1Var2 = um1.d;
                n81 n81Var10 = ei1.o;
                if (!xi0.o(obj54, bool6) && obj54 != null) {
                    um1Var = (um1) ((sa0) n81Var10.c).i(obj54);
                }
                return new zq1(j5, j6, aa0Var2, y90Var, z90Var, null, str8, j7, dfVar, dz1Var, as0Var2, j8, ax1Var, um1Var, 49184);
            default:
                obj.getClass();
                List list15 = (List) obj;
                Object obj55 = list15.get(0);
                Boolean bool7 = obj55 != null ? (Boolean) obj55 : null;
                bool7.getClass();
                boolean zBooleanValue = bool7.booleanValue();
                Object obj56 = list15.get(1);
                n81 n81Var11 = c2.D;
                if (!xi0.o(obj56, Boolean.FALSE) && obj56 != null) {
                    u30Var = (u30) ((sa0) n81Var11.c).i(obj56);
                }
                u30Var.getClass();
                return new m71(u30Var.a, zBooleanValue);
        }
    }
}
