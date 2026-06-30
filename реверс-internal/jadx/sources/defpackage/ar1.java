package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ar1 {
    public static final long a = uc1.p(14);
    public static final long b = uc1.p(0);
    public static final long c = vl.f;
    public static final cz1 d;

    static {
        long j = vl.b;
        d = j != 16 ? new xm(j) : bz1.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zq1 a(zq1 zq1Var, long j, lh lhVar, float f, long j2, aa0 aa0Var, y90 y90Var, z90 z90Var, lv1 lv1Var, String str, long j3, df dfVar, dz1 dz1Var, as0 as0Var, long j4, ax1 ax1Var, um1 um1Var, v71 v71Var, q10 q10Var) {
        df dfVar2;
        um1 um1Var2;
        v71 v71Var2;
        q10 q10Var2;
        cz1 xmVar;
        cz1 cz1Var;
        boolean z;
        as0 as0Var2;
        long j5;
        v71 v71Var3;
        z90 z90Var2 = z90Var;
        lv1 lv1Var2 = lv1Var;
        String str2 = str;
        long j6 = j3;
        h02[] h02VarArr = g02.b;
        long j7 = j2 & 1095216660480L;
        if ((j7 == 0 || g02.a(j2, zq1Var.b)) && ((lhVar != null || j == 16 || vl.c(j, zq1Var.a.b())) && ((y90Var == null || y90Var.equals(zq1Var.d)) && ((aa0Var == null || aa0Var.equals(zq1Var.c)) && ((lv1Var2 == null || lv1Var2 == zq1Var.f) && (((j6 & 1095216660480L) == 0 || g02.a(j6, zq1Var.h)) && ((ax1Var == null || ax1Var.equals(zq1Var.m)) && xi0.o(lhVar, zq1Var.a.c()) && ((lhVar == null || f == zq1Var.a.a()) && ((z90Var2 == null || z90Var2.equals(zq1Var.e)) && (str2 == null || str2.equals(zq1Var.g))))))))))) {
            if (dfVar != null) {
                dfVar2 = dfVar;
                if (dfVar2.equals(zq1Var.i)) {
                }
                bz1 bz1Var = bz1.a;
                if (lhVar != null) {
                    if (lhVar instanceof uq1) {
                        long jW = uc1.w(f, ((uq1) lhVar).a);
                        xmVar = jW != 16 ? new xm(jW) : bz1Var;
                    } else {
                        if (!(lhVar instanceof mh)) {
                            ez1.a();
                            return null;
                        }
                        xmVar = new nh((mh) lhVar, f);
                    }
                } else if (j != 16) {
                    xmVar = new xm(j);
                }
                cz1Var = zq1Var.a;
                cz1Var.getClass();
                z = xmVar instanceof nh;
                if (z && (cz1Var instanceof nh)) {
                    nh nhVar = (nh) xmVar;
                    mh mhVar = nhVar.a;
                    float f2 = nhVar.b;
                    if (Float.isNaN(f2)) {
                        f2 = ((nh) cz1Var).b;
                    }
                    xmVar = new nh(mhVar, f2);
                } else if ((z || (cz1Var instanceof nh)) && ((!z && (cz1Var instanceof nh)) || xmVar.equals(bz1Var))) {
                }
                if (lv1Var2 == null) {
                    lv1Var2 = zq1Var.f;
                }
                long j8 = j7 == 0 ? zq1Var.b : j2;
                aa0 aa0Var2 = aa0Var == null ? zq1Var.c : aa0Var;
                y90 y90Var2 = y90Var == null ? zq1Var.d : y90Var;
                if (z90Var2 == null) {
                    z90Var2 = zq1Var.e;
                }
                if (str2 == null) {
                    str2 = zq1Var.g;
                }
                if ((j6 & 1095216660480L) == 0) {
                    j6 = zq1Var.h;
                }
                if (dfVar2 == null) {
                    dfVar2 = zq1Var.i;
                }
                dz1 dz1Var2 = dz1Var == null ? zq1Var.j : dz1Var;
                long j9 = j8;
                as0 as0Var3 = as0Var == null ? zq1Var.k : as0Var;
                if (j4 != 16) {
                    as0Var2 = as0Var3;
                    j5 = j4;
                } else {
                    as0Var2 = as0Var3;
                    j5 = zq1Var.l;
                }
                long j10 = j5;
                ax1 ax1Var2 = ax1Var == null ? zq1Var.m : ax1Var;
                um1 um1Var3 = um1Var2 == null ? zq1Var.n : um1Var2;
                v71Var3 = zq1Var.o;
                if (v71Var3 == null) {
                    v71Var3 = v71Var2;
                }
                if (q10Var2 == null) {
                    q10Var2 = zq1Var.p;
                }
                return new zq1(xmVar, j9, aa0Var2, y90Var2, z90Var2, lv1Var2, str2, j6, dfVar2, dz1Var2, as0Var2, j10, ax1Var2, um1Var3, v71Var3, q10Var2);
            }
            dfVar2 = dfVar;
            if (dz1Var == null || dz1Var.equals(zq1Var.j)) {
                if (as0Var == null || as0Var.equals(zq1Var.k)) {
                    if (j4 == 16 || vl.c(j4, zq1Var.l)) {
                        um1Var2 = um1Var;
                        if (um1Var2 == null || um1Var2.equals(zq1Var.n)) {
                            v71Var2 = v71Var;
                            if (v71Var2 == null || v71Var2.equals(zq1Var.o)) {
                                q10Var2 = q10Var;
                                if (q10Var2 == null || q10Var2.equals(zq1Var.p)) {
                                    return zq1Var;
                                }
                            }
                        }
                        q10Var2 = q10Var;
                    }
                    v71Var2 = v71Var;
                    q10Var2 = q10Var;
                }
            }
            bz1 bz1Var2 = bz1.a;
            if (lhVar != null) {
            }
            cz1Var = zq1Var.a;
            cz1Var.getClass();
            z = xmVar instanceof nh;
            if (z) {
                xmVar = z ? cz1Var : cz1Var;
            }
            if (lv1Var2 == null) {
            }
            if (j7 == 0) {
            }
            if (aa0Var == null) {
            }
            if (y90Var == null) {
            }
            if (z90Var2 == null) {
            }
            if (str2 == null) {
            }
            if ((j6 & 1095216660480L) == 0) {
            }
            if (dfVar2 == null) {
            }
            if (dz1Var == null) {
            }
            long j92 = j8;
            if (as0Var == null) {
            }
            if (j4 != 16) {
            }
            long j102 = j5;
            if (ax1Var == null) {
            }
            if (um1Var2 == null) {
            }
            v71Var3 = zq1Var.o;
            if (v71Var3 == null) {
            }
            if (q10Var2 == null) {
            }
            return new zq1(xmVar, j92, aa0Var2, y90Var2, z90Var2, lv1Var2, str2, j6, dfVar2, dz1Var2, as0Var2, j102, ax1Var2, um1Var3, v71Var3, q10Var2);
        }
        dfVar2 = dfVar;
        um1Var2 = um1Var;
        v71Var2 = v71Var;
        q10Var2 = q10Var;
        bz1 bz1Var22 = bz1.a;
        if (lhVar != null) {
        }
        cz1Var = zq1Var.a;
        cz1Var.getClass();
        z = xmVar instanceof nh;
        if (z) {
        }
        if (lv1Var2 == null) {
        }
        if (j7 == 0) {
        }
        if (aa0Var == null) {
        }
        if (y90Var == null) {
        }
        if (z90Var2 == null) {
        }
        if (str2 == null) {
        }
        if ((j6 & 1095216660480L) == 0) {
        }
        if (dfVar2 == null) {
        }
        if (dz1Var == null) {
        }
        long j922 = j8;
        if (as0Var == null) {
        }
        if (j4 != 16) {
        }
        long j1022 = j5;
        if (ax1Var == null) {
        }
        if (um1Var2 == null) {
        }
        v71Var3 = zq1Var.o;
        if (v71Var3 == null) {
        }
        if (q10Var2 == null) {
        }
        return new zq1(xmVar, j922, aa0Var2, y90Var2, z90Var2, lv1Var2, str2, j6, dfVar2, dz1Var2, as0Var2, j1022, ax1Var2, um1Var3, v71Var3, q10Var2);
    }

    public static final Object b(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(float f, long j, long j2) {
        h02[] h02VarArr = g02.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    pg0.a("Cannot perform operation for Unspecified type.");
                }
                if (!h02.a(g02.b(j), g02.b(j2))) {
                    pg0.a("Cannot perform operation for " + h02.b(g02.b(j)) + " and " + h02.b(g02.b(j2)));
                }
                return uc1.y(xk.A(g02.c(j), g02.c(j2), f), j3);
            }
        }
        return ((g02) b(new g02(j), new g02(j2), f)).a;
    }
}
