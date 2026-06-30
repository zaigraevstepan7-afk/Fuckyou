package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai1 implements wa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ ai1(int i) {
        this.e = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        jb jbVar;
        Object objA;
        switch (this.e) {
            case 0:
                gh1 gh1Var = (gh1) obj;
                fz1 fz1Var = (fz1) obj2;
                g02 g02Var = new g02(fz1Var.a);
                di1 di1Var = ei1.v;
                return hk.j(ei1.a(g02Var, di1Var, gh1Var), ei1.a(new g02(fz1Var.b), di1Var, gh1Var));
            case 1:
                return Integer.valueOf(((aa0) obj2).e);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                wp0 wp0Var = (wp0) obj2;
                return hk.j(wp0Var.a, ei1.a(wp0Var.b, ei1.i, (gh1) obj));
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return Float.valueOf(((df) obj2).a);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                gh1 gh1Var2 = (gh1) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(ei1.a((gb) list.get(i), ei1.b, gh1Var2));
                }
                return arrayList;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                wz1 wz1Var = (wz1) obj2;
                return hk.j(Integer.valueOf((int) (wz1Var.a >> 32)), Integer.valueOf((int) (wz1Var.a & 4294967295L)));
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                gh1 gh1Var3 = (gh1) obj;
                um1 um1Var = (um1) obj2;
                return hk.j(ei1.a(new vl(um1Var.a), ei1.p, gh1Var3), ei1.a(new w01(um1Var.b), ei1.x, gh1Var3), Float.valueOf(um1Var.c));
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(((dw1) obj2).a);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return Integer.valueOf(((dx1) obj2).a);
            case el.a /* 9 */:
                return Integer.valueOf(((le0) obj2).a);
            case el.b /* 10 */:
                return Integer.valueOf(((y90) obj2).a);
            case 11:
                return Integer.valueOf(((z90) obj2).a);
            case el.c /* 12 */:
                g02 g02Var2 = (g02) obj2;
                return g02Var2 != null ? g02.a(g02Var2.a, g02.c) : false ? Boolean.FALSE : hk.j(Float.valueOf(g02.c(g02Var2.a)), ei1.a(new h02(g02.b(g02Var2.a)), ei1.w, (gh1) obj));
            case 13:
                vp0 vp0Var = (vp0) obj2;
                return hk.j(vp0Var.a, ei1.a(vp0Var.b, ei1.i, (gh1) obj));
            case 14:
                long j = ((h02) obj2).a;
                if (h02.a(j, 8589934592L)) {
                    return 0;
                }
                if (h02.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 15:
                w01 w01Var = (w01) obj2;
                return w01Var != null ? w01.b(w01Var.a, 9205357640488583168L) : false ? Boolean.FALSE : hk.j(Float.valueOf(Float.intBitsToFloat((int) (w01Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (w01Var.a & 4294967295L))));
            case 16:
                gh1 gh1Var4 = (gh1) obj;
                gb gbVar = (gb) obj2;
                Object obj3 = gbVar.a;
                if (obj3 instanceof p41) {
                    jbVar = jb.e;
                } else if (obj3 instanceof zq1) {
                    jbVar = jb.f;
                } else if (obj3 instanceof t52) {
                    jbVar = jb.g;
                } else if (obj3 instanceof m42) {
                    jbVar = jb.h;
                } else if (obj3 instanceof wp0) {
                    jbVar = jb.i;
                } else if (obj3 instanceof vp0) {
                    jbVar = jb.j;
                } else {
                    if (!(obj3 instanceof bt1)) {
                        throw new UnsupportedOperationException();
                    }
                    jbVar = jb.k;
                }
                switch (jbVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = ei1.a((p41) obj3, ei1.g, gh1Var4);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = ei1.a((zq1) obj3, ei1.h, gh1Var4);
                        break;
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        obj3.getClass();
                        objA = ei1.a((t52) obj3, ei1.c, gh1Var4);
                        break;
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        obj3.getClass();
                        objA = ei1.a((m42) obj3, ei1.d, gh1Var4);
                        break;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        obj3.getClass();
                        objA = ei1.a((wp0) obj3, ei1.e, gh1Var4);
                        break;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        obj3.getClass();
                        objA = ei1.a((vp0) obj3, ei1.f, gh1Var4);
                        break;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj3.getClass();
                        objA = ((bt1) obj3).a;
                        break;
                    default:
                        ez1.a();
                        return null;
                }
                return hk.j(jbVar, objA, Integer.valueOf(gbVar.b), Integer.valueOf(gbVar.c), gbVar.d);
            case 17:
                gh1 gh1Var5 = (gh1) obj;
                List list2 = ((as0) obj2).e;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(ei1.a((zr0) list2.get(i2), ei1.z, gh1Var5));
                }
                return arrayList2;
            case 18:
                return ((zr0) obj2).a.toLanguageTag();
            case 19:
                gh1 gh1Var6 = (gh1) obj;
                mp0 mp0Var = (mp0) obj2;
                return hk.j(ei1.a(new jp0(mp0Var.a), ei1.B, gh1Var6), ei1.a(new lp0(mp0Var.b), ei1.C, gh1Var6), ei1.a(new kp0(mp0Var.c), ei1.D, gh1Var6));
            case 20:
                return Float.valueOf(((jp0) obj2).a);
            case 21:
                return Integer.valueOf(((lp0) obj2).a);
            case 22:
                return Integer.valueOf(((kp0) obj2).a);
            case 23:
                return ((t52) obj2).a;
            case 24:
                gh1 gh1Var7 = (gh1) obj;
                p41 p41Var = (p41) obj2;
                Object objA2 = ei1.a(new dw1(p41Var.a), ei1.q, gh1Var7);
                Object objA3 = ei1.a(new dx1(p41Var.b), ei1.r, gh1Var7);
                Object objA4 = ei1.a(new g02(p41Var.c), ei1.v, gh1Var7);
                fz1 fz1Var2 = p41Var.d;
                fz1 fz1Var3 = fz1.c;
                Object objA5 = ei1.a(fz1Var2, ei1.l, gh1Var7);
                Object objA6 = ei1.a(p41Var.e, c2.C, gh1Var7);
                mp0 mp0Var2 = p41Var.f;
                mp0 mp0Var3 = mp0.d;
                return hk.j(objA2, objA3, objA4, objA5, objA6, ei1.a(mp0Var2, ei1.A, gh1Var7), ei1.a(new hp0(p41Var.g), c2.E, gh1Var7), ei1.a(new le0(p41Var.h), ei1.s, gh1Var7), ei1.a(p41Var.i, c2.F, gh1Var7));
            case 25:
                return ((m42) obj2).a;
            case 26:
                gh1 gh1Var8 = (gh1) obj;
                zq1 zq1Var = (zq1) obj2;
                vl vlVar = new vl(zq1Var.a.b());
                di1 di1Var2 = ei1.p;
                Object objA7 = ei1.a(vlVar, di1Var2, gh1Var8);
                g02 g02Var3 = new g02(zq1Var.b);
                di1 di1Var3 = ei1.v;
                Object objA8 = ei1.a(g02Var3, di1Var3, gh1Var8);
                aa0 aa0Var = zq1Var.c;
                aa0 aa0Var2 = aa0.f;
                Object objA9 = ei1.a(aa0Var, ei1.m, gh1Var8);
                Object objA10 = ei1.a(zq1Var.d, ei1.t, gh1Var8);
                Object objA11 = ei1.a(zq1Var.e, ei1.u, gh1Var8);
                String str = zq1Var.g;
                Object objA12 = ei1.a(new g02(zq1Var.h), di1Var3, gh1Var8);
                Object objA13 = ei1.a(zq1Var.i, ei1.n, gh1Var8);
                Object objA14 = ei1.a(zq1Var.j, ei1.k, gh1Var8);
                as0 as0Var = zq1Var.k;
                as0 as0Var2 = as0.g;
                Object objA15 = ei1.a(as0Var, ei1.y, gh1Var8);
                Object objA16 = ei1.a(new vl(zq1Var.l), di1Var2, gh1Var8);
                Object objA17 = ei1.a(zq1Var.m, ei1.j, gh1Var8);
                um1 um1Var2 = zq1Var.n;
                um1 um1Var3 = um1.d;
                return hk.j(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, ei1.a(um1Var2, ei1.o, gh1Var8));
            case 27:
                gh1 gh1Var9 = (gh1) obj;
                sz1 sz1Var = (sz1) obj2;
                zq1 zq1Var2 = sz1Var.a;
                n81 n81Var = ei1.h;
                return hk.j(ei1.a(zq1Var2, n81Var, gh1Var9), ei1.a(sz1Var.b, n81Var, gh1Var9), ei1.a(sz1Var.c, n81Var, gh1Var9), ei1.a(sz1Var.d, n81Var, gh1Var9));
            case 28:
                m71 m71Var = (m71) obj2;
                Boolean boolValueOf = Boolean.valueOf(m71Var.a);
                n81 n81Var2 = ei1.a;
                return hk.j(boolValueOf, ei1.a(new u30(m71Var.b), c2.D, (gh1) obj));
            default:
                return Integer.valueOf(((u30) obj2).a);
        }
    }
}
