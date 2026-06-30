package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vm extends om {
    @Override // defpackage.om
    public final f20 A() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary_fixed";
        e20Var.b = new sm(10);
        e20Var.c = new pm(this, 28);
        e20Var.d = true;
        e20Var.f = new pm(this, 29);
        e20Var.h = new sm(12);
        return super.A().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 B() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary_fixed_dim";
        e20Var.b = new nm(29);
        e20Var.c = new pm(this, 0);
        e20Var.d = true;
        e20Var.i = new pm(this, 1);
        return super.B().b().b(e20Var.a()).a();
    }

    public final f20 C() {
        e20 e20Var = new e20();
        e20Var.a = "error_dim";
        e20Var.b = new rm(11);
        e20Var.c = new rm(12);
        e20Var.d = true;
        e20Var.f = new pm(this, 16);
        e20Var.h = new rm(14);
        e20Var.i = new pm(this, 17);
        return e20Var.a();
    }

    public final f20 D() {
        e20 e20Var = new e20();
        e20Var.a = "on_surface";
        e20Var.b = new rm(29);
        e20Var.c = new pm(this, 25);
        e20Var.e = new sm(0);
        e20Var.f = new pm(this, 26);
        e20Var.h = new sm(1);
        f20 f20VarA = e20Var.a();
        e20 e20Var2 = new e20();
        e20Var2.a = "on_surface";
        int i = 11;
        e20Var2.b = new nm(i);
        e20Var2.c = new p1(10);
        e20Var2.f = new f(1, this, om.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 11);
        e20Var2.h = new p1(i);
        return e20Var2.a().b().b(f20VarA).a();
    }

    public final f20 E() {
        e20 e20Var = new e20();
        e20Var.a = "primary_dim";
        e20Var.b = new rm(8);
        e20Var.c = new rm(9);
        e20Var.d = true;
        e20Var.f = new pm(this, 14);
        e20Var.h = new rm(10);
        e20Var.i = new pm(this, 15);
        return e20Var.a();
    }

    public final f20 F() {
        e20 e20Var = new e20();
        e20Var.a = "secondary_dim";
        e20Var.b = new rm(1);
        e20Var.c = new rm(2);
        e20Var.d = true;
        e20Var.f = new pm(this, 10);
        e20Var.h = new rm(3);
        e20Var.i = new pm(this, 11);
        return e20Var.a();
    }

    public final f20 G() {
        e20 e20Var = new e20();
        e20Var.a = "surface";
        e20Var.b = new rm(18);
        e20Var.c = new rm(19);
        e20Var.d = true;
        f20 f20VarA = e20Var.a();
        e20 e20Var2 = new e20();
        e20Var2.a = "surface";
        e20Var2.b = new jm(5);
        e20Var2.c = new jm(6);
        e20Var2.d = true;
        return e20Var2.a().b().b(f20VarA).a();
    }

    public final f20 H() {
        e20 e20Var = new e20();
        e20Var.a = "surface_container_high";
        e20Var.b = new um(8);
        e20Var.c = new um(9);
        e20Var.d = true;
        e20Var.e = new um(10);
        f20 f20VarA = e20Var.a();
        e20 e20Var2 = new e20();
        e20Var2.a = "surface_container_high";
        e20Var2.b = new lm(26);
        e20Var2.c = new lm(27);
        e20Var2.d = true;
        return e20Var2.a().b().b(f20VarA).a();
    }

    public final f20 I() {
        e20 e20Var = new e20();
        e20Var.a = "surface_container_highest";
        e20Var.b = new sm(26);
        e20Var.c = new sm(27);
        e20Var.d = true;
        e20Var.e = new sm(28);
        f20 f20VarA = e20Var.a();
        e20 e20Var2 = new e20();
        e20Var2.a = "surface_container_highest";
        e20Var2.b = new nm(6);
        e20Var2.c = new nm(7);
        e20Var2.d = true;
        return e20Var2.a().b().b(f20VarA).a();
    }

    public final f20 J() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary_dim";
        e20Var.b = new rm(4);
        e20Var.c = new rm(5);
        e20Var.d = true;
        e20Var.f = new pm(this, 12);
        e20Var.h = new rm(7);
        e20Var.i = new pm(this, 13);
        return e20Var.a();
    }

    @Override // defpackage.om
    public final f20 a() {
        e20 e20VarB = G().b();
        e20VarB.a = "background";
        return super.a().b().b(e20VarB.a()).a();
    }

    @Override // defpackage.om
    public final f20 b() {
        e20 e20Var = new e20();
        e20Var.a = "error";
        int i = 20;
        e20Var.b = new rm(i);
        int i2 = 21;
        e20Var.c = new rm(i2);
        e20Var.d = true;
        e20Var.f = new pm(this, i);
        e20Var.h = new rm(22);
        e20Var.i = new pm(this, i2);
        return super.b().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 c() {
        e20 e20Var = new e20();
        e20Var.a = "error_container";
        e20Var.b = new nm(13);
        e20Var.c = new rm(17);
        e20Var.d = true;
        e20Var.f = new pm(this, 22);
        e20Var.i = new pm(this, 27);
        e20Var.h = new sm(11);
        return super.c().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final g12 d(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        g20Var.getClass();
        double[] dArr = {0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d};
        double[] dArr2 = {12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d};
        int iMin = Math.min(8, 8);
        double d2 = ld0Var.b;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            if (d2 < dArr[i] || d2 >= dArr[i + 1]) {
                i++;
            } else {
                double d3 = dArr2[i] % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                d2 = d3;
            }
        }
        int iOrdinal = u42Var.ordinal();
        g20 g20Var2 = g20.g;
        if (iOrdinal == 1) {
            return ef1.h(d2, g20Var == g20Var2 ? 50.0d : 40.0d);
        }
        if (iOrdinal == 2) {
            return ef1.h(d2, g20Var == g20Var2 ? 60.0d : 48.0d);
        }
        if (iOrdinal == 3) {
            return ef1.h(d2, g20Var == g20Var2 ? 80.0d : 60.0d);
        }
        if (iOrdinal == 4) {
            return ef1.h(d2, g20Var == g20Var2 ? 64.0d : 48.0d);
        }
        super.d(u42Var, ld0Var, z, g20Var, d);
        return null;
    }

    @Override // defpackage.om
    public final ld0 e(f20 f20Var, h20 h20Var) {
        Number number;
        h20Var.getClass();
        g12 g12Var = (g12) f20Var.b.i(h20Var);
        double dK = k(f20Var, h20Var);
        double d = g12Var.a;
        sa0 sa0Var = f20Var.e;
        if (sa0Var == null || (number = (Double) sa0Var.i(h20Var)) == null) {
            number = 1;
        }
        return hk.u(d, number.doubleValue() * g12Var.b, dK);
    }

    @Override // defpackage.om
    public final g12 f(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double d2 = ld0Var.b;
        g20Var.getClass();
        int iOrdinal = u42Var.ordinal();
        g20 g20Var2 = g20.g;
        if (iOrdinal == 1) {
            return ef1.h(d2, g20Var == g20Var2 ? 1.4d : 6.0d);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? super.f(u42Var, ld0Var, z, g20Var, d) : ef1.h(l91.q(ld0Var), l91.j(ld0Var, z, g20Var)) : ef1.h(l91.s(ld0Var), l91.k(ld0Var, g20Var));
        }
        return ef1.h(d2, g20Var == g20Var2 ? 5.0d : 10.0d);
    }

    @Override // defpackage.om
    public final g12 g(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double d2 = ld0Var.b;
        g20Var.getClass();
        int iOrdinal = u42Var.ordinal();
        g20 g20Var2 = g20.g;
        if (iOrdinal == 1) {
            return ef1.h(d2, (g20Var == g20Var2 ? 1.4d : 6.0d) * 2.2d);
        }
        if (iOrdinal == 2) {
            return ef1.h(d2, (g20Var == g20Var2 ? 5.0d : 10.0d) * 1.7d);
        }
        if (iOrdinal == 3) {
            return ef1.h(l91.s(ld0Var), l91.k(ld0Var, g20Var) * 1.29d);
        }
        if (iOrdinal != 4) {
            return super.g(u42Var, ld0Var, z, g20Var, d);
        }
        double dQ = l91.q(ld0Var);
        return ef1.h(dQ, l91.j(ld0Var, z, g20Var) * ((dQ < 105.0d || dQ >= 125.0d) ? 2.3d : 1.6d));
    }

    @Override // defpackage.om
    public final g12 h(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double d2 = ld0Var.b;
        g20Var.getClass();
        int iOrdinal = u42Var.ordinal();
        g20 g20Var2 = g20.g;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return ef1.h(d2, (g20Var == g20Var2 && z) ? 26.0d : 32.0d);
            }
            if (iOrdinal == 3) {
                return ef1.h(d2, g20Var == g20Var2 ? 74.0d : 56.0d);
            }
            if (iOrdinal != 4) {
                return super.h(u42Var, ld0Var, z, g20Var, d);
            }
            return ef1.h(d2, g20Var == g20Var2 ? z ? 36.0d : 48.0d : 40.0d);
        }
        double d3 = 12.0d;
        if (g20Var == g20Var2) {
            if (d2 < 250.0d || d2 >= 270.0d) {
                d3 = 8.0d;
            }
        } else if (d2 >= 250.0d && d2 < 270.0d) {
            d3 = 16.0d;
        }
        return ef1.h(d2, d3);
    }

    @Override // defpackage.om
    public final g12 i(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        double d2 = ld0Var.b;
        g20Var.getClass();
        int iOrdinal = u42Var.ordinal();
        g20 g20Var2 = g20.g;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return ef1.h(d2, 16.0d);
            }
            if (iOrdinal == 3) {
                return ef1.h(lk.S(ld0Var, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d}), g20Var == g20Var2 ? 56.0d : 36.0d);
            }
            if (iOrdinal != 4) {
                return super.i(u42Var, ld0Var, z, g20Var, d);
            }
            return ef1.h(lk.S(ld0Var, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-160.0d, 155.0d, -100.0d, 96.0d, -96.0d, -156.0d, -165.0d, -160.0d}), (g20Var == g20Var2 && z) ? 16.0d : 24.0d);
        }
        double d3 = 6.0d;
        if (g20Var == g20Var2) {
            if (d2 < 250.0d || d2 >= 270.0d) {
                d3 = 4.0d;
            }
        } else if (d2 >= 250.0d && d2 < 270.0d) {
            d3 = 10.0d;
        }
        return ef1.h(d2, d3);
    }

    @Override // defpackage.om
    public final g12 j(u42 u42Var, ld0 ld0Var, boolean z, g20 g20Var, double d) {
        g20Var.getClass();
        int iOrdinal = u42Var.ordinal();
        g20 g20Var2 = g20.g;
        if (iOrdinal == 1) {
            return ef1.h(lk.S(ld0Var, new double[]{0.0d, 38.0d, 105.0d, 161.0d, 204.0d, 278.0d, 333.0d, 360.0d}, new double[]{-32.0d, 26.0d, 10.0d, -39.0d, 24.0d, -15.0d, -32.0d}), g20Var == g20Var2 ? 20.0d : 36.0d);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? super.j(u42Var, ld0Var, z, g20Var, d) : ef1.h(lk.S(ld0Var, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-165.0d, 160.0d, -105.0d, 101.0d, -101.0d, -160.0d, -170.0d, -165.0d}), 48.0d) : ef1.h(lk.S(ld0Var, new double[]{0.0d, 38.0d, 71.0d, 105.0d, 140.0d, 161.0d, 253.0d, 333.0d, 360.0d}, new double[]{-72.0d, 35.0d, 24.0d, -24.0d, 62.0d, 50.0d, 62.0d, -72.0d}), 56.0d);
        }
        return ef1.h(lk.S(ld0Var, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d}), g20Var == g20Var2 ? 28.0d : 32.0d);
    }

    @Override // defpackage.om
    public final double k(f20 f20Var, h20 h20Var) {
        f20 f20Var2;
        ms msVar;
        f20 f20Var3;
        double dY;
        h20Var.getClass();
        boolean z = h20Var.c;
        double d = h20Var.d;
        boolean z2 = f20Var.d;
        sa0 sa0Var = f20Var.f;
        sa0 sa0Var2 = f20Var.h;
        String str = f20Var.a;
        sa0 sa0Var3 = f20Var.i;
        Double dValueOf = null;
        i12 i12Var = sa0Var3 != null ? (i12) sa0Var3.i(h20Var) : null;
        if (i12Var != null) {
            double d2 = i12Var.c;
            f20 f20Var4 = i12Var.a;
            f20 f20Var5 = i12Var.b;
            j12 j12Var = i12Var.d;
            h12 h12Var = i12Var.f;
            if (j12Var == j12.e || ((j12Var == j12.h && z) || (j12Var == j12.g && !z))) {
                d2 = -d2;
            }
            boolean zO = xi0.o(str, f20Var4.a);
            f20 f20Var6 = zO ? f20Var4 : f20Var5;
            if (zO) {
                f20Var4 = f20Var5;
            }
            double dDoubleValue = ((Number) f20Var6.c.i(h20Var)).doubleValue();
            double dA = f20Var4.a(h20Var);
            double d3 = d2 * ((double) (zO ? 1 : -1));
            int iOrdinal = h12Var.ordinal();
            if (iOrdinal == 0) {
                dY = lk.y(dA + d3, 0.0d, 100.0d);
            } else if (iOrdinal == 1) {
                dY = d3 > 0.0d ? lk.y(lk.y(dDoubleValue, dA, dA + d3), 0.0d, 100.0d) : lk.y(lk.y(dDoubleValue, dA + d3, dA), 0.0d, 100.0d);
            } else {
                if (iOrdinal != 2) {
                    ez1.a();
                    return 0.0d;
                }
                dY = d3 > 0.0d ? lk.y(dDoubleValue, dA + d3, 100.0d) : lk.y(dDoubleValue, 0.0d, dA + d3);
            }
            if (sa0Var != null && sa0Var2 != null) {
                f20 f20Var7 = (f20) sa0Var.i(h20Var);
                ms msVar2 = (ms) sa0Var2.i(h20Var);
                if (f20Var7 != null && msVar2 != null) {
                    double dA2 = f20Var7.a(h20Var);
                    double dA3 = msVar2.a(d);
                    if (xk.G(dA2, dY) < dA3 || d < 0.0d) {
                        dY = bk.y(dA2, dA3);
                    }
                }
            }
            double d4 = dY;
            return (!z2 || jt1.H(str, "_fixed_dim", false)) ? d4 : d4 >= 57.0d ? lk.y(d4, 65.0d, 100.0d) : lk.y(d4, 0.0d, 49.0d);
        }
        double dDoubleValue2 = ((Number) f20Var.c.i(h20Var)).doubleValue();
        Double dValueOf2 = (sa0Var == null || (f20Var3 = (f20) sa0Var.i(h20Var)) == null) ? null : Double.valueOf(f20Var3.a(h20Var));
        if (sa0Var2 != null && (msVar = (ms) sa0Var2.i(h20Var)) != null) {
            dValueOf = Double.valueOf(msVar.a(d));
        }
        if (dValueOf2 == null || dValueOf == null) {
            return dDoubleValue2;
        }
        if (xk.G(dValueOf2.doubleValue(), dDoubleValue2) < dValueOf.doubleValue() || d < 0.0d) {
            dDoubleValue2 = bk.y(dValueOf2.doubleValue(), dValueOf.doubleValue());
        }
        double dY2 = dDoubleValue2;
        if (z2 && !jt1.H(str, "_fixed_dim", false)) {
            dY2 = dY2 >= 57.0d ? lk.y(dY2, 65.0d, 100.0d) : lk.y(dY2, 0.0d, 49.0d);
        }
        double d5 = dY2;
        sa0 sa0Var4 = f20Var.g;
        if (sa0Var4 != null && (f20Var2 = (f20) sa0Var4.i(h20Var)) != null) {
            double dA4 = f20Var2.a(h20Var);
            double dMax = Math.max(dValueOf2.doubleValue(), dA4);
            double dMin = Math.min(dValueOf2.doubleValue(), dA4);
            if (xk.G(dMax, d5) < dValueOf.doubleValue() || xk.G(dMin, d5) < dValueOf.doubleValue()) {
                double dC = xk.C(dMax, dValueOf.doubleValue());
                double dM = xk.m(dMin, dValueOf.doubleValue());
                ArrayList arrayList = new ArrayList();
                if (dC != -1.0d) {
                    arrayList.add(Double.valueOf(dC));
                }
                if (dM != -1.0d) {
                    arrayList.add(Double.valueOf(dM));
                }
                if (Math.rint(dValueOf2.doubleValue()) < 60.0d || Math.rint(dA4) < 60.0d) {
                    if (dC < 0.0d) {
                        return 100.0d;
                    }
                    return dC;
                }
                if (arrayList.size() == 1) {
                    return ((Number) pl.c0(arrayList)).doubleValue();
                }
                if (dM < 0.0d) {
                    return 0.0d;
                }
                return dM;
            }
        }
        return d5;
    }

    @Override // defpackage.om
    public final f20 m() {
        e20 e20Var = new e20();
        e20Var.a = "inverse_surface";
        e20Var.b = new um(6);
        e20Var.c = new um(7);
        e20Var.d = true;
        return super.m().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 o() {
        e20 e20Var = new e20();
        e20Var.a = "primary";
        e20Var.b = new rm(13);
        e20Var.c = new rm(15);
        e20Var.d = true;
        e20Var.f = new pm(this, 18);
        e20Var.h = new rm(16);
        e20Var.i = new pm(this, 19);
        return super.o().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 p() {
        e20 e20Var = new e20();
        e20Var.a = "primary_container";
        e20Var.b = new sm(16);
        e20Var.c = new sm(17);
        e20Var.d = true;
        e20Var.f = new tm(this, 0);
        e20Var.i = new tm(this, 1);
        e20Var.h = new sm(19);
        return super.p().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 q() {
        e20 e20Var = new e20();
        e20Var.a = "primary_fixed";
        e20Var.b = new rm(27);
        e20Var.c = new pm(this, 23);
        e20Var.d = true;
        e20Var.f = new pm(this, 24);
        e20Var.h = new rm(28);
        return super.q().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 r() {
        e20 e20Var = new e20();
        e20Var.a = "primary_fixed_dim";
        e20Var.b = new qm(9);
        e20Var.c = new pm(this, 6);
        e20Var.d = true;
        e20Var.i = new pm(this, 7);
        return super.r().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 s() {
        e20 e20Var = new e20();
        e20Var.a = "secondary";
        e20Var.b = new sm(18);
        e20Var.c = new sm(29);
        e20Var.d = true;
        e20Var.f = new tm(this, 2);
        e20Var.h = new um(19);
        e20Var.i = new tm(this, 7);
        return super.s().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 t() {
        e20 e20Var = new e20();
        e20Var.a = "secondary_container";
        e20Var.b = new um(17);
        e20Var.c = new um(18);
        e20Var.d = true;
        e20Var.f = new tm(this, 3);
        e20Var.i = new tm(this, 4);
        e20Var.h = new um(20);
        return super.t().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 u() {
        e20 e20Var = new e20();
        e20Var.a = "secondary_fixed";
        e20Var.b = new qm(11);
        e20Var.c = new pm(this, 8);
        e20Var.d = true;
        e20Var.f = new pm(this, 9);
        e20Var.h = new qm(12);
        return super.u().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 v() {
        e20 e20Var = new e20();
        e20Var.a = "secondary_fixed_dim";
        e20Var.b = new qm(8);
        e20Var.c = new pm(this, 4);
        e20Var.d = true;
        e20Var.i = new pm(this, 5);
        return super.v().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 w() {
        e20 e20Var = new e20();
        e20Var.a = "surface_bright";
        e20Var.b = new qm(21);
        e20Var.c = new qm(22);
        e20Var.d = true;
        e20Var.e = new qm(23);
        return super.w().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 x() {
        e20 e20Var = new e20();
        e20Var.a = "surface_dim";
        e20Var.b = new sm(20);
        e20Var.c = new sm(21);
        e20Var.d = true;
        e20Var.e = new sm(22);
        return super.x().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 y() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary";
        e20Var.b = new qm(5);
        e20Var.c = new qm(6);
        e20Var.d = true;
        e20Var.f = new pm(this, 2);
        e20Var.h = new qm(7);
        e20Var.i = new pm(this, 3);
        return super.y().b().b(e20Var.a()).a();
    }

    @Override // defpackage.om
    public final f20 z() {
        e20 e20Var = new e20();
        e20Var.a = "tertiary_container";
        e20Var.b = new um(25);
        e20Var.c = new um(26);
        e20Var.d = true;
        e20Var.f = new tm(this, 5);
        e20Var.i = new tm(this, 6);
        e20Var.h = new nm(14);
        return super.z().b().b(e20Var.a()).a();
    }
}
