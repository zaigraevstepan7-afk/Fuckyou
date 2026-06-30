package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class om {
    public static boolean n(h20 h20Var) {
        u42 u42Var = h20Var.b;
        return u42Var == u42.j || u42Var == u42.k;
    }

    public f20 A() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary_fixed";
        e20Var.b = new p1(26);
        e20Var.c = new p1(27);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 25);
        e20Var.h = new p1(28);
        e20Var.i = new im(this, 1);
        return e20Var.a();
    }

    public f20 B() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary_fixed_dim";
        e20Var.b = new p1(12);
        e20Var.c = new p1(13);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 26);
        e20Var.h = new p1(14);
        e20Var.i = new im(this, 0);
        return e20Var.a();
    }

    public f20 a() {
        e20 e20Var = new e20();
        e20Var.a = "background";
        e20Var.b = new lm(1);
        e20Var.c = new lm(12);
        e20Var.d = true;
        return e20Var.a();
    }

    public f20 b() {
        e20 e20Var = new e20();
        e20Var.a = "error";
        e20Var.b = new km(27);
        e20Var.c = new km(28);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 9);
        e20Var.h = new km(29);
        e20Var.i = new im(this, 7);
        return e20Var.a();
    }

    public f20 c() {
        e20 e20Var = new e20();
        e20Var.a = "error_container";
        e20Var.b = new lm(14);
        e20Var.c = new lm(15);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 10);
        e20Var.h = new lm(16);
        e20Var.i = new im(this, 9);
        return e20Var.a();
    }

    public g12 d(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        g20Var.getClass();
        switch (u42Var.ordinal()) {
            default:
                ez1.a();
            case 0:
            case 1:
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
            case t91.LONG_FIELD_NUMBER /* 4 */:
            case t91.STRING_FIELD_NUMBER /* 5 */:
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return null;
        }
    }

    public ld0 e(f20 f20Var, h20 h20Var) {
        h20Var.getClass();
        double dK = k(f20Var, h20Var);
        g12 g12Var = (g12) f20Var.b.i(h20Var);
        return hk.u(g12Var.a, g12Var.b, dK);
    }

    public g12 f(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double d2 = ld0Var.b;
        g20Var.getClass();
        switch (u42Var.ordinal()) {
            case 0:
                return ef1.h(d2, 0.0d);
            case 1:
                return ef1.h(d2, 2.0d);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ef1.h(d2, 6.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ef1.h(d2, 10.0d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return ef1.h(d3, 8.0d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ef1.h(d2, ld0Var.c / 8.0d);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ef1.h(d2, 0.0d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return ef1.h(d2, 10.0d);
            default:
                ez1.a();
                return null;
        }
    }

    public g12 g(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double d2 = ld0Var.c;
        double d3 = ld0Var.b;
        g20Var.getClass();
        switch (u42Var.ordinal()) {
            case 0:
                return ef1.h(d3, 0.0d);
            case 1:
                return ef1.h(d3, 2.0d);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ef1.h(d3, 8.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ef1.h(d3, 12.0d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                double d4 = (d3 + 15.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return ef1.h(d4, 12.0d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ef1.h(d3, (d2 / 8.0d) + 4.0d);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ef1.h(d3, (d2 / 8.0d) + 4.0d);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ef1.h(d3, 0.0d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return ef1.h(d3, 16.0d);
            default:
                ez1.a();
                return null;
        }
    }

    public g12 h(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double d2 = ld0Var.b;
        g20Var.getClass();
        switch (u42Var.ordinal()) {
            case 0:
                return ef1.h(d2, 0.0d);
            case 1:
                return ef1.h(d2, 12.0d);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ef1.h(d2, 36.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ef1.h(d2, 200.0d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                double d3 = (d2 + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return ef1.h(d3, 40.0d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ef1.h(d2, ld0Var.c);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ef1.h(d2, 48.0d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return ef1.h(d4, 48.0d);
            default:
                ez1.a();
                return null;
        }
    }

    public g12 i(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double d2 = ld0Var.b;
        g20Var.getClass();
        switch (u42Var.ordinal()) {
            case 0:
                return ef1.h(d2, 0.0d);
            case 1:
                return ef1.h(d2, 8.0d);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ef1.h(d2, 16.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ef1.h(lk.S(ld0Var, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ef1.h(lk.S(ld0Var, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                double d3 = ld0Var.c;
                return ef1.h(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ef1.h(d2, 16.0d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return ef1.h(d4, 36.0d);
            default:
                ez1.a();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g12 j(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double dAbs;
        double d2 = ld0Var.b;
        g20Var.getClass();
        boolean z2 = false;
        double d3 = 0.0d;
        switch (u42Var.ordinal()) {
            case 0:
                return ef1.h(d2, 0.0d);
            case 1:
                return ef1.h(d2, 16.0d);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                double d4 = (d2 + 60.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return ef1.h(d4, 24.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ef1.h(lk.S(ld0Var, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d}), 32.0d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ef1.h(lk.S(ld0Var, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d}), 32.0d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                cw1 cw1Var = new cw1(ld0Var);
                ld0 ld0Var2 = cw1Var.b;
                if (ld0Var2 == null) {
                    double d5 = cw1Var.a().b;
                    Object obj = ((HashMap) cw1Var.e()).get(cw1Var.a());
                    obj.getClass();
                    double dDoubleValue = ((Number) obj).doubleValue();
                    double d6 = cw1Var.f().b;
                    Object obj2 = ((HashMap) cw1Var.e()).get(cw1Var.f());
                    obj2.getClass();
                    double dDoubleValue2 = ((Number) obj2).doubleValue() - dDoubleValue;
                    if (d5 >= d6 ? d5 <= d2 || d2 <= d6 : d5 <= d2 && d2 <= d6) {
                        z2 = true;
                    }
                    double d7 = z2 ? d6 : d5;
                    if (!z2) {
                        d5 = d6;
                    }
                    ld0 ld0Var3 = (ld0) ((ArrayList) cw1Var.b()).get((int) Math.rint(d2));
                    double d8 = 1.0d - cw1Var.d(ld0Var);
                    double d9 = 1000.0d;
                    double d10 = 0.0d;
                    while (d10 <= 360.0d) {
                        double d11 = ((1.0d * d10) + d7) % 360.0d;
                        if (d11 < d3) {
                            d11 += 360.0d;
                        }
                        if (d7 < d5) {
                            if (d7 > d11 || d11 > d5) {
                                d10 += 1.0d;
                            } else {
                                double d12 = d3;
                                ld0 ld0Var4 = (ld0) ((ArrayList) cw1Var.b()).get((int) Math.rint(d11));
                                Object obj3 = ((HashMap) cw1Var.e()).get(ld0Var4);
                                obj3.getClass();
                                dAbs = Math.abs(d8 - ((((Number) obj3).doubleValue() - dDoubleValue) / dDoubleValue2));
                                if (dAbs < d9) {
                                    ld0Var3 = ld0Var4;
                                    d9 = dAbs;
                                }
                                d10 += 1.0d;
                                d3 = d12;
                            }
                        } else if (d7 <= d11 || d11 <= d5) {
                            double d122 = d3;
                            ld0 ld0Var42 = (ld0) ((ArrayList) cw1Var.b()).get((int) Math.rint(d11));
                            Object obj32 = ((HashMap) cw1Var.e()).get(ld0Var42);
                            obj32.getClass();
                            dAbs = Math.abs(d8 - ((((Number) obj32).doubleValue() - dDoubleValue) / dDoubleValue2));
                            if (dAbs < d9) {
                            }
                            d10 += 1.0d;
                            d3 = d122;
                        } else {
                            d10 += 1.0d;
                        }
                    }
                    cw1Var.b = ld0Var3;
                    ld0Var3.getClass();
                    ld0Var2 = ld0Var3;
                }
                ld0 ld0VarT = xk.t(ld0Var2);
                return new g12(ld0VarT.b, ld0VarT.c, ld0VarT);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                cw1 cw1Var2 = new cw1(ld0Var);
                int iRint = (int) Math.rint(d2);
                ld0 ld0Var5 = (ld0) ((ArrayList) cw1Var2.b()).get(iRint);
                double d13 = cw1Var2.d(ld0Var5);
                ArrayList arrayList = new ArrayList();
                arrayList.add(ld0Var5);
                int i = 0;
                double dAbs2 = 0.0d;
                while (i < 360) {
                    int i2 = (iRint + i) % 360;
                    if (i2 < 0) {
                        i2 += 360;
                    }
                    double d14 = cw1Var2.d((ld0) ((ArrayList) cw1Var2.b()).get(i2));
                    dAbs2 += Math.abs(d14 - d13);
                    i++;
                    d13 = d14;
                }
                double d15 = dAbs2 / 6.0d;
                double d16 = cw1Var2.d(ld0Var5);
                int i3 = 1;
                while (true) {
                    if (arrayList.size() < 6) {
                        int i4 = (iRint + i3) % 360;
                        if (i4 < 0) {
                            i4 += 360;
                        }
                        ld0 ld0Var6 = (ld0) ((ArrayList) cw1Var2.b()).get(i4);
                        double d17 = cw1Var2.d(ld0Var6);
                        double dAbs3 = d3 + Math.abs(d17 - d16);
                        boolean z3 = dAbs3 >= ((double) arrayList.size()) * d15;
                        int i5 = 1;
                        while (z3 && arrayList.size() < 6) {
                            arrayList.add(ld0Var6);
                            double d18 = dAbs3;
                            z3 = d18 >= ((double) (arrayList.size() + i5)) * d15;
                            i5++;
                            dAbs3 = d18;
                        }
                        double d19 = dAbs3;
                        i3++;
                        if (i3 > 360) {
                            while (arrayList.size() < 6) {
                                arrayList.add(ld0Var6);
                            }
                        } else {
                            d3 = d19;
                            d16 = d17;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ld0Var);
                int iFloor = (int) Math.floor(1.0d);
                int i6 = iFloor + 1;
                for (int i7 = 1; i7 < i6; i7++) {
                    int size = 0 - i7;
                    while (size < 0) {
                        size += arrayList.size();
                    }
                    if (size >= arrayList.size()) {
                        size %= arrayList.size();
                    }
                    arrayList2.add(0, arrayList.get(size));
                }
                int i8 = 3 - iFloor;
                for (int i9 = 1; i9 < i8; i9++) {
                    int size2 = i9;
                    while (size2 < 0) {
                        size2 += arrayList.size();
                    }
                    if (size2 >= arrayList.size()) {
                        size2 %= arrayList.size();
                    }
                    arrayList2.add(arrayList.get(size2));
                }
                ld0 ld0VarT2 = xk.t((ld0) arrayList2.get(2));
                return new g12(ld0VarT2.b, ld0VarT2.c, ld0VarT2);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return ef1.h(d2, 36.0d);
            default:
                ez1.a();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double k(f20 f20Var, h20 h20Var) {
        f20 f20Var2;
        boolean z;
        h20Var.getClass();
        boolean z2 = h20Var.c;
        sa0 sa0Var = f20Var.h;
        sa0 sa0Var2 = f20Var.f;
        double d = h20Var.d;
        boolean z3 = d < 0.0d;
        sa0 sa0Var3 = f20Var.i;
        Double dValueOf = null;
        i12 i12Var = sa0Var3 == null ? null : (i12) sa0Var3.i(h20Var);
        double d2 = 60.0d;
        if (i12Var == null) {
            double dDoubleValue = ((Number) f20Var.c.i(h20Var)).doubleValue();
            if (sa0Var2 == null || sa0Var == null) {
                return dDoubleValue;
            }
            f20 f20Var3 = (f20) sa0Var2.i(h20Var);
            double dA = f20Var3 != null ? f20Var3.a(h20Var) : 0.0d;
            ms msVar = (ms) sa0Var.i(h20Var);
            double dA2 = msVar != null ? msVar.a(d) : 0.0d;
            if (xk.G(dA, dDoubleValue) < dA2) {
                dDoubleValue = bk.y(dA, dA2);
            }
            if (z3) {
                dDoubleValue = bk.y(dA, dA2);
            }
            if (f20Var.d && 50.0d <= dDoubleValue && dDoubleValue < 60.0d) {
                dDoubleValue = xk.G(49.0d, dA) >= dA2 ? 49.0d : 60.0d;
            }
            sa0 sa0Var4 = f20Var.g;
            if (sa0Var4 != null && (f20Var2 = (f20) sa0Var4.i(h20Var)) != null) {
                dValueOf = Double.valueOf(f20Var2.a(h20Var));
            }
            if (dValueOf != null) {
                f20 f20Var4 = (f20) sa0Var2.i(h20Var);
                double dA3 = f20Var4 != null ? f20Var4.a(h20Var) : 0.0d;
                double dMax = Math.max(dA3, dValueOf.doubleValue());
                double dMin = Math.min(dA3, dValueOf.doubleValue());
                if (xk.G(dMax, dDoubleValue) < dA2 || xk.G(dMin, dDoubleValue) < dA2) {
                    double dC = xk.C(dMax, dA2);
                    double dM = xk.m(dMin, dA2);
                    ArrayList arrayList = new ArrayList();
                    if (dC != -1.0d) {
                        arrayList.add(Double.valueOf(dC));
                    }
                    if (dM != -1.0d) {
                        arrayList.add(Double.valueOf(dM));
                    }
                    if (Math.rint(dA3) < 60.0d || Math.rint(dValueOf.doubleValue()) < 60.0d) {
                        if (dC == -1.0d) {
                            return 100.0d;
                        }
                        return dC;
                    }
                    if (arrayList.size() == 1) {
                        return ((Number) pl.c0(arrayList)).doubleValue();
                    }
                    if (dM == -1.0d) {
                        return 0.0d;
                    }
                    return dM;
                }
            }
            return dDoubleValue;
        }
        f20 f20Var5 = i12Var.a;
        f20 f20Var6 = i12Var.b;
        double d3 = i12Var.c;
        j12 j12Var = i12Var.d;
        boolean z4 = i12Var.e;
        boolean z5 = j12Var == j12.i || (j12Var == j12.f && !z2) || (j12Var == j12.e && !z2);
        f20 f20Var7 = z5 ? f20Var5 : f20Var6;
        if (z5) {
            f20Var5 = f20Var6;
        }
        String str = f20Var.a;
        String str2 = f20Var7.a;
        sa0 sa0Var5 = f20Var7.h;
        boolean zO = xi0.o(str, str2);
        double d4 = z2 ? 1 : -1;
        double dDoubleValue2 = ((Number) f20Var7.c.i(h20Var)).doubleValue();
        sa0 sa0Var6 = f20Var5.c;
        sa0 sa0Var7 = f20Var5.h;
        double dDoubleValue3 = ((Number) sa0Var6.i(h20Var)).doubleValue();
        if (sa0Var2 == null || sa0Var5 == null || sa0Var7 == null) {
            z = z4;
        } else {
            f20 f20Var8 = (f20) sa0Var2.i(h20Var);
            ms msVar2 = (ms) sa0Var5.i(h20Var);
            ms msVar3 = (ms) sa0Var7.i(h20Var);
            if (f20Var8 != null && msVar2 != null && msVar3 != null) {
                z = z4;
                double dA4 = msVar2.a(d);
                double dA5 = msVar3.a(d);
                double dA6 = f20Var8.a(h20Var);
                if (xk.G(dA6, dDoubleValue2) < dA4) {
                    dDoubleValue2 = bk.y(dA6, dA4);
                }
                if (xk.G(dA6, dDoubleValue3) < dA5) {
                    dDoubleValue3 = bk.y(dA6, dA5);
                }
                if (z3) {
                    dDoubleValue2 = bk.y(dA6, dA4);
                    dDoubleValue3 = bk.y(dA6, dA5);
                }
            }
        }
        if ((dDoubleValue3 - dDoubleValue2) * d4 < d3) {
            double d5 = d3 * d4;
            double dY = lk.y(dDoubleValue2 + d5, 0.0d, 100.0d);
            if ((dY - dDoubleValue2) * d4 < d3) {
                dDoubleValue2 = lk.y(dY - d5, 0.0d, 100.0d);
            }
            dDoubleValue3 = dY;
        }
        if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
            if (50.0d > dDoubleValue3 || dDoubleValue3 >= 60.0d) {
                d2 = dDoubleValue2;
            } else if (!z) {
                dDoubleValue3 = d4 > 0.0d ? 60.0d : 49.0d;
                d2 = dDoubleValue2;
            } else if (d4 > 0.0d) {
                dDoubleValue3 = Math.max(dDoubleValue3, (d3 * d4) + 60.0d);
            } else {
                dDoubleValue3 = Math.min(dDoubleValue3, (d3 * d4) + 49.0d);
                d2 = 49.0d;
            }
        } else if (d4 > 0.0d) {
            dDoubleValue3 = Math.max(dDoubleValue3, (d3 * d4) + 60.0d);
        } else {
            dDoubleValue3 = Math.min(dDoubleValue3, (d3 * d4) + 49.0d);
            d2 = 49.0d;
        }
        return zO ? d2 : dDoubleValue3;
    }

    public final f20 l(h20 h20Var) {
        h20Var.getClass();
        return h20Var.c ? w() : x();
    }

    public f20 m() {
        e20 e20Var = new e20();
        e20Var.a = "inverse_surface";
        e20Var.b = new nm(2);
        e20Var.c = new nm(12);
        e20Var.d = true;
        return e20Var.a();
    }

    public f20 o() {
        e20 e20Var = new e20();
        e20Var.a = "primary";
        e20Var.b = new jm(0);
        e20Var.c = new jm(1);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 15);
        int i = 2;
        e20Var.h = new jm(i);
        e20Var.i = new im(this, i);
        return e20Var.a();
    }

    public f20 p() {
        e20 e20Var = new e20();
        e20Var.a = "primary_container";
        e20Var.b = new p1(19);
        e20Var.c = new p1(this);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 16);
        e20Var.h = new jm(9);
        e20Var.i = new im(this, 4);
        return e20Var.a();
    }

    public f20 q() {
        e20 e20Var = new e20();
        e20Var.a = "primary_fixed";
        e20Var.b = new jm(7);
        e20Var.c = new jm(8);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 17);
        e20Var.h = new jm(10);
        e20Var.i = new im(this, 3);
        return e20Var.a();
    }

    public f20 r() {
        e20 e20Var = new e20();
        e20Var.a = "primary_fixed_dim";
        e20Var.b = new mm(16);
        e20Var.c = new mm(17);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 18);
        e20Var.h = new mm(18);
        e20Var.i = new im(this, 11);
        return e20Var.a();
    }

    public f20 s() {
        e20 e20Var = new e20();
        e20Var.a = "secondary";
        e20Var.b = new jm(29);
        e20Var.c = new km(10);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 19);
        e20Var.h = new km(18);
        e20Var.i = new im(this, 6);
        return e20Var.a();
    }

    public f20 t() {
        e20 e20Var = new e20();
        e20Var.a = "secondary_container";
        e20Var.b = new nm(8);
        e20Var.c = new nm(this);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 20);
        e20Var.h = new nm(10);
        e20Var.i = new im(this, 13);
        return e20Var.a();
    }

    public f20 u() {
        e20 e20Var = new e20();
        e20Var.a = "secondary_fixed";
        e20Var.b = new mm(3);
        e20Var.c = new mm(4);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 21);
        e20Var.h = new mm(5);
        e20Var.i = new im(this, 10);
        return e20Var.a();
    }

    public f20 v() {
        e20 e20Var = new e20();
        e20Var.a = "secondary_fixed_dim";
        e20Var.b = new mm(19);
        e20Var.c = new mm(20);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 22);
        e20Var.h = new mm(21);
        e20Var.i = new im(this, 12);
        return e20Var.a();
    }

    public f20 w() {
        e20 e20Var = new e20();
        e20Var.a = "surface_bright";
        e20Var.b = new jm(24);
        e20Var.c = new jm(25);
        e20Var.d = true;
        return e20Var.a();
    }

    public f20 x() {
        e20 e20Var = new e20();
        e20Var.a = "surface_dim";
        e20Var.b = new km(25);
        e20Var.c = new km(26);
        e20Var.d = true;
        return e20Var.a();
    }

    public f20 y() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary";
        e20Var.b = new lm(10);
        e20Var.c = new lm(11);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 23);
        e20Var.h = new lm(13);
        e20Var.i = new im(this, 8);
        return e20Var.a();
    }

    public f20 z() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary_container";
        e20Var.b = new km(15);
        e20Var.c = new km(this);
        e20Var.d = true;
        e20Var.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 24);
        e20Var.h = new km(17);
        e20Var.i = new im(this, 5);
        return e20Var.a();
    }
}
