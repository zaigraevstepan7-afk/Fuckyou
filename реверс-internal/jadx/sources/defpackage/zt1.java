package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class zt1 {
    public static final int[] a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final yt1 n;

    static {
        int[] iArr = new int[61];
        a = iArr;
        iArr[2] = iArr[2] | 1;
        iArr[3] = iArr[3] | 1;
        iArr[0] = iArr[0] | 1;
        iArr[1] = iArr[1] | 1;
        iArr[6] = iArr[6] | 8;
        iArr[7] = iArr[7] | 8;
        iArr[4] = iArr[4] | 8;
        iArr[5] = iArr[5] | 8;
        iArr[8] = 3 | iArr[8];
        iArr[35] = iArr[35] | 2;
        iArr[50] = iArr[50] | 2;
        iArr[9] = iArr[9] | 8;
        iArr[10] = iArr[10] | 8;
        iArr[11] = iArr[11] | 8;
        iArr[12] = iArr[12] | 8;
        iArr[13] = iArr[13] | 8;
        iArr[14] = iArr[14] | 8;
        iArr[15] = iArr[15] | 8;
        iArr[16] = iArr[16] | 8;
        iArr[17] = iArr[17] | 8;
        iArr[18] = iArr[18] | 8;
        iArr[19] = iArr[19] | 8;
        iArr[20] = iArr[20] | 8;
        iArr[21] = iArr[21] | 4;
        iArr[22] = iArr[22] | 4;
        iArr[23] = iArr[23] | 4;
        iArr[24] = iArr[24] | 4;
        iArr[25] = iArr[25] | 4;
        iArr[29] = iArr[29] | 4;
        iArr[30] = iArr[30] | 4;
        iArr[26] = iArr[26] | 4;
        iArr[27] = iArr[27] | 4;
        iArr[28] = iArr[28] | 4;
        iArr[32] = iArr[32] | 4;
        iArr[34] = iArr[34] | 2;
        iArr[51] = iArr[51] | 2;
        iArr[36] = iArr[36] | 2;
        iArr[52] = iArr[52] | 2;
        iArr[31] = iArr[31] | 4;
        iArr[53] = iArr[53] | 2;
        iArr[54] = iArr[54] | 4;
        iArr[55] = iArr[55] | 2;
        iArr[56] = iArr[56] | 2;
        iArr[37] = iArr[37] | 32;
        iArr[57] = iArr[57] | 32;
        iArr[58] = iArr[58] | 48;
        iArr[59] = iArr[59] | 48;
        iArr[60] = iArr[60] | 48;
        iArr[46] = iArr[46] | 48;
        iArr[47] = iArr[47] | 48;
        iArr[48] = iArr[48] | 48;
        iArr[43] = iArr[43] | 48;
        iArr[49] = iArr[49] | 48;
        iArr[39] = iArr[39] | 48;
        iArr[40] = iArr[40] | 48;
        iArr[41] = iArr[41] | 48;
        iArr[42] = iArr[42] | 48;
        iArr[44] = iArr[44] | 48;
        iArr[45] = iArr[45] | 48;
        iArr[38] = iArr[38] | 48;
        b = f(1);
        c = f(8);
        d = f(2);
        e = f(4);
        f = f(32);
        g = f(16);
        h = d(1);
        i = d(8);
        j = d(2);
        k = d(4);
        l = d(32);
        m = d(16);
        n = new yt1();
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x059a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(yt1 yt1Var, yt1 yt1Var2, n81 n81Var, long j2, int i2, yt1 yt1Var3) {
        long j3;
        float f2;
        int i3;
        double d2;
        float f3;
        uz1 uz1Var;
        float f4;
        long j4;
        long j5;
        long j6;
        wl fp0Var;
        long j7;
        Object objB;
        long jI = i(i2, j2);
        int iH = h(i2, j2) & (yt1Var.b | yt1Var2.b);
        long j8 = (yt1Var.a | yt1Var2.a) & jI;
        if ((iH & 135) != 0) {
            if ((iH & 1) != 0) {
                j8 &= -34359738369L;
            }
            if ((iH & 128) != 0) {
                j8 &= -137438953473L;
            }
            if ((iH & 2) != 0) {
                j8 &= -17179869185L;
            }
            if ((iH & 4) != 0) {
                j8 &= -68719476737L;
            }
        }
        if (j8 == 0 && iH == 0) {
            return;
        }
        if ((c & j8) != 0) {
            if ((j8 & 16) != 0) {
                float fP = n81Var.p(4);
                float f5 = yt1Var.g;
                float f6 = yt1Var2.g;
                boolean zIsNaN = Float.isNaN(f5);
                boolean zIsNaN2 = Float.isNaN(f6);
                float f7 = (fP * f6) + ((1.0f - fP) * f5);
                j3 = 0;
                if (zIsNaN) {
                    f5 = f6;
                } else if (!zIsNaN2) {
                    f5 = f7;
                }
                yt1Var3.a |= 16;
                yt1Var3.g = f5;
            } else {
                j3 = 0;
            }
            if ((j8 & 32) != j3) {
                float fP2 = n81Var.p(5);
                float f8 = yt1Var.h;
                float f9 = yt1Var2.h;
                boolean zIsNaN3 = Float.isNaN(f8);
                boolean zIsNaN4 = Float.isNaN(f9);
                float f10 = (fP2 * f9) + ((1.0f - fP2) * f8);
                if (zIsNaN3) {
                    f8 = f9;
                } else if (!zIsNaN4) {
                    f8 = f10;
                }
                yt1Var3.a = 32 | yt1Var3.a;
                yt1Var3.h = f8;
            }
            if ((j8 & 64) != j3) {
                float fP3 = n81Var.p(6);
                float f11 = yt1Var.i;
                float f12 = yt1Var2.i;
                boolean zIsNaN5 = Float.isNaN(f11);
                boolean zIsNaN6 = Float.isNaN(f12);
                float f13 = (fP3 * f12) + ((1.0f - fP3) * f11);
                if (zIsNaN5) {
                    f11 = f12;
                } else if (!zIsNaN6) {
                    f11 = f13;
                }
                yt1Var3.a = 64 | yt1Var3.a;
                yt1Var3.i = f11;
            }
            if ((j8 & 128) != j3) {
                float fP4 = n81Var.p(7);
                float f14 = yt1Var.j;
                float f15 = yt1Var2.j;
                boolean zIsNaN7 = Float.isNaN(f14);
                boolean zIsNaN8 = Float.isNaN(f15);
                float f16 = (fP4 * f15) + ((1.0f - fP4) * f14);
                if (zIsNaN7) {
                    f14 = f15;
                } else if (!zIsNaN8) {
                    f14 = f16;
                }
                yt1Var3.a = 128 | yt1Var3.a;
                yt1Var3.j = f14;
            }
            if ((j8 & 8192) != j3) {
                float fP5 = n81Var.p(13);
                float f17 = yt1Var.p;
                float f18 = yt1Var2.p;
                boolean zIsNaN9 = Float.isNaN(f17);
                boolean zIsNaN10 = Float.isNaN(f18);
                float f19 = (fP5 * f18) + ((1.0f - fP5) * f17);
                if (zIsNaN9) {
                    f17 = f18;
                } else if (!zIsNaN10) {
                    f17 = f19;
                }
                yt1Var3.a = 8192 | yt1Var3.a;
                yt1Var3.p = f17;
            }
            if ((j8 & 16384) != j3) {
                float fP6 = n81Var.p(14);
                float f20 = yt1Var.q;
                float f21 = yt1Var2.q;
                boolean zIsNaN11 = Float.isNaN(f20);
                boolean zIsNaN12 = Float.isNaN(f21);
                float f22 = (fP6 * f21) + ((1.0f - fP6) * f20);
                if (zIsNaN11) {
                    f20 = f21;
                } else if (!zIsNaN12) {
                    f20 = f22;
                }
                yt1Var3.a = 16384 | yt1Var3.a;
                yt1Var3.q = f20;
            }
            if ((j8 & 32768) != j3) {
                float fP7 = n81Var.p(15);
                float f23 = yt1Var.r;
                float f24 = yt1Var2.r;
                boolean zIsNaN13 = Float.isNaN(f23);
                boolean zIsNaN14 = Float.isNaN(f24);
                float f25 = (fP7 * f24) + ((1.0f - fP7) * f23);
                if (zIsNaN13) {
                    f23 = f24;
                } else if (!zIsNaN14) {
                    f23 = f25;
                }
                yt1Var3.a = 32768 | yt1Var3.a;
                yt1Var3.r = f23;
            }
            if ((j8 & 65536) != j3) {
                float fP8 = n81Var.p(16);
                float f26 = yt1Var.s;
                float f27 = yt1Var2.s;
                boolean zIsNaN15 = Float.isNaN(f26);
                boolean zIsNaN16 = Float.isNaN(f27);
                float f28 = (fP8 * f27) + ((1.0f - fP8) * f26);
                if (zIsNaN15) {
                    f26 = f27;
                } else if (!zIsNaN16) {
                    f26 = f28;
                }
                yt1Var3.a = 65536 | yt1Var3.a;
                yt1Var3.s = f26;
            }
            if ((j8 & 512) != j3) {
                float fP9 = n81Var.p(9);
                float f29 = yt1Var.l;
                float f30 = yt1Var2.l;
                boolean zIsNaN17 = Float.isNaN(f29);
                boolean zIsNaN18 = Float.isNaN(f30);
                float f31 = (fP9 * f30) + ((1.0f - fP9) * f29);
                if (zIsNaN17) {
                    f29 = f30;
                } else if (!zIsNaN18) {
                    f29 = f31;
                }
                yt1Var3.a = (512 | yt1Var3.a) & (-2049);
                yt1Var3.l = f29;
                yt1Var3.n = Float.NaN;
            }
            if ((j8 & 1024) != j3) {
                float fP10 = n81Var.p(10);
                float f32 = yt1Var.m;
                float f33 = yt1Var2.m;
                boolean zIsNaN19 = Float.isNaN(f32);
                boolean zIsNaN20 = Float.isNaN(f33);
                float f34 = (fP10 * f33) + ((1.0f - fP10) * f32);
                if (zIsNaN19) {
                    f32 = f33;
                } else if (!zIsNaN20) {
                    f32 = f34;
                }
                yt1Var3.a = (1024 | yt1Var3.a) & (-4097);
                yt1Var3.m = f32;
                yt1Var3.o = Float.NaN;
            }
            if ((j8 & 2048) != j3) {
                float fP11 = n81Var.p(11);
                float f35 = yt1Var.n;
                float f36 = yt1Var2.n;
                boolean zIsNaN21 = Float.isNaN(f35);
                boolean zIsNaN22 = Float.isNaN(f36);
                float f37 = (fP11 * f36) + ((1.0f - fP11) * f35);
                if (zIsNaN21) {
                    f35 = f36;
                } else if (!zIsNaN22) {
                    f35 = f37;
                }
                yt1Var3.a = 2048 | (yt1Var3.a & (-513));
                yt1Var3.n = f35;
                yt1Var3.l = Float.NaN;
            }
            if ((j8 & 4096) != j3) {
                float fP12 = n81Var.p(12);
                float f38 = yt1Var.o;
                float f39 = yt1Var2.o;
                boolean zIsNaN23 = Float.isNaN(f38);
                boolean zIsNaN24 = Float.isNaN(f39);
                float f40 = (fP12 * f39) + ((1.0f - fP12) * f38);
                if (zIsNaN23) {
                    f38 = f39;
                } else if (!zIsNaN24) {
                    f38 = f40;
                }
                yt1Var3.a = 4096 | (yt1Var3.a & (-1025));
                yt1Var3.o = f38;
                yt1Var3.m = Float.NaN;
            }
            if ((j8 & 131072) != j3) {
                float fP13 = n81Var.p(17);
                float f41 = yt1Var.v;
                float f42 = yt1Var2.v;
                boolean zIsNaN25 = Float.isNaN(f41);
                boolean zIsNaN26 = Float.isNaN(f42);
                float f43 = (fP13 * f42) + ((1.0f - fP13) * f41);
                if (zIsNaN25) {
                    f41 = f42;
                } else if (!zIsNaN26) {
                    f41 = f43;
                }
                yt1Var3.a = 131072 | yt1Var3.a;
                yt1Var3.v = f41;
            }
            if ((j8 & 524288) != j3) {
                float fP14 = n81Var.p(19);
                float f44 = yt1Var.w;
                float f45 = yt1Var2.w;
                boolean zIsNaN27 = Float.isNaN(f44);
                boolean zIsNaN28 = Float.isNaN(f45);
                float f46 = (fP14 * f45) + ((1.0f - fP14) * f44);
                if (zIsNaN27) {
                    f44 = f45;
                } else if (!zIsNaN28) {
                    f44 = f46;
                }
                yt1Var3.a = 524288 | yt1Var3.a;
                yt1Var3.w = f44;
            }
            if ((j8 & 262144) != j3) {
                float fP15 = n81Var.p(18);
                float f47 = yt1Var.t;
                float f48 = yt1Var2.t;
                boolean zIsNaN29 = Float.isNaN(f47);
                boolean zIsNaN30 = Float.isNaN(f48);
                float f49 = (fP15 * f48) + ((1.0f - fP15) * f47);
                if (zIsNaN29) {
                    f47 = f48;
                } else if (!zIsNaN30) {
                    f47 = f49;
                }
                yt1Var3.a = 262144 | yt1Var3.a;
                yt1Var3.t = f47;
            }
            if ((j8 & 1048576) != j3) {
                float fP16 = n81Var.p(20);
                float f50 = yt1Var.u;
                float f51 = yt1Var2.u;
                boolean zIsNaN31 = Float.isNaN(f50);
                boolean zIsNaN32 = Float.isNaN(f51);
                float f52 = (fP16 * f51) + ((1.0f - fP16) * f50);
                if (zIsNaN31) {
                    f50 = f51;
                } else if (!zIsNaN32) {
                    f50 = f52;
                }
                yt1Var3.a = 1048576 | yt1Var3.a;
                yt1Var3.u = f50;
            }
        } else {
            j3 = 0;
        }
        if ((b & j8) != j3) {
            if ((j8 & 1) != j3) {
                float fA = xk.A(yt1Var.c, yt1Var2.c, n81Var.p(0));
                yt1Var3.a = 1 | yt1Var3.a;
                yt1Var3.c = fA;
            }
            if ((j8 & 2) != j3) {
                float fA2 = xk.A(yt1Var.d, yt1Var2.d, n81Var.p(1));
                yt1Var3.a = 2 | yt1Var3.a;
                yt1Var3.d = fA2;
            }
            if ((j8 & 4) != j3) {
                float fA3 = xk.A(yt1Var.e, yt1Var2.e, n81Var.p(2));
                yt1Var3.a = 4 | yt1Var3.a;
                yt1Var3.e = fA3;
            }
            if ((j8 & 8) != j3) {
                float fA4 = xk.A(yt1Var.f, yt1Var2.f, n81Var.p(3));
                yt1Var3.a = 8 | yt1Var3.a;
                yt1Var3.f = fA4;
            }
        }
        if ((d & j8) != j3) {
            if ((j8 & 256) != j3) {
                f2 = 1.0f;
                float fA5 = xk.A(yt1Var.k, yt1Var2.k, n81Var.p(8));
                yt1Var3.a |= 256;
                yt1Var3.k = fA5;
            } else {
                f2 = 1.0f;
            }
            if ((j8 & 34359738368L) != j3) {
                long jU = lk.U(n81Var.p(50), yt1Var.x, yt1Var2.x);
                yt1Var3.a |= 34359738368L;
                yt1Var3.b &= -2;
                yt1Var3.x = jU;
                yt1Var3.y = null;
            }
            if ((17179869184L & j8) != j3) {
                yt1Var3.b(lk.U(n81Var.p(51), yt1Var.z, yt1Var2.z));
            }
            if ((j8 & 68719476736L) != j3) {
                long jU2 = lk.U(n81Var.p(52), yt1Var.B, yt1Var2.B);
                yt1Var3.a |= 68719476736L;
                yt1Var3.b &= -5;
                yt1Var3.B = jU2;
                yt1Var3.C = null;
            }
        } else {
            f2 = 1.0f;
        }
        if ((j & iH) != 0) {
            if ((iH & 1) != 0) {
                d2 = 0.5d;
                i3 = 32;
                f3 = 0.5f;
                yt1Var3.c(b(yt1Var.y, yt1Var.x, yt1Var2.y, yt1Var2.x, n81Var.p(50)));
            } else {
                i3 = 32;
                d2 = 0.5d;
                f3 = 0.5f;
            }
            if ((iH & 2) != 0) {
                yt1Var3.a(b(yt1Var.A, yt1Var.z, yt1Var2.A, yt1Var2.z, n81Var.p(51)));
            }
            if ((iH & 4) != 0) {
                yt1Var3.l(b(yt1Var.C, yt1Var.B, yt1Var2.C, yt1Var2.B, n81Var.p(52)));
            }
            if ((iH & 64) != 0) {
                Object objC = c(yt1Var.G, yt1Var2.G, n81Var.p(56));
                int i4 = yt1Var3.b;
                yt1Var3.b = objC != null ? i4 | 64 : i4 & (-65);
                yt1Var3.G = objC;
            }
            if ((iH & 32) != 0) {
                Object objC2 = c(yt1Var.F, yt1Var2.F, n81Var.p(55));
                int i5 = yt1Var3.b;
                yt1Var3.b = objC2 != null ? i5 | 32 : i5 & (-33);
                yt1Var3.F = objC2;
            }
            if ((iH & 8) != 0) {
                float fP17 = n81Var.p(53);
                ym1 ym1Var = yt1Var.E;
                ym1 ym1Var2 = yt1Var2.E;
                if (fP17 != 0.0f) {
                    if (fP17 != f2) {
                        if (xi0.o(ym1Var, ym1Var2)) {
                            objB = fP17 < f3 ? ym1Var : ym1Var2;
                        } else {
                            objB = ym1Var instanceof li0 ? ((li0) ym1Var).b(ym1Var2, fP17) : null;
                            if (objB == null && (ym1Var2 instanceof li0)) {
                                objB = ((li0) ym1Var2).b(ym1Var, f2 - fP17);
                            }
                            if (objB == null) {
                                if (fP17 < f3) {
                                }
                            }
                        }
                        ym1 ym1Var3 = objB instanceof ym1 ? (ym1) objB : null;
                        if (ym1Var3 != null) {
                            ym1Var = ym1Var3;
                        } else if (fP17 >= d2) {
                            ym1Var = ym1Var2;
                        }
                    }
                }
                yt1Var3.b |= 8;
                yt1Var3.E = ym1Var;
            }
        } else {
            i3 = 32;
            d2 = 0.5d;
            f3 = 0.5f;
        }
        if ((e & j8) != j3) {
            if ((j8 & 2097152) != j3) {
                float fA6 = xk.A(yt1Var.H, yt1Var2.H, n81Var.p(21));
                yt1Var3.a = 2097152 | yt1Var3.a;
                yt1Var3.H = fA6;
            }
            if ((j8 & 4194304) != j3) {
                float fA7 = xk.A(yt1Var.I, yt1Var2.I, n81Var.p(22));
                yt1Var3.a = 4194304 | yt1Var3.a;
                yt1Var3.I = fA7;
            }
            if ((j8 & 8388608) != j3) {
                float fA8 = xk.A(yt1Var.J, yt1Var2.J, n81Var.p(23));
                yt1Var3.a = 8388608 | yt1Var3.a;
                yt1Var3.J = fA8;
            }
            if ((j8 & 16777216) != j3) {
                float fA9 = xk.A(yt1Var.K, yt1Var2.K, n81Var.p(24));
                yt1Var3.a |= 16777216;
                yt1Var3.K = fA9;
            }
            if ((j8 & 33554432) != j3) {
                float fA10 = xk.A(yt1Var.L, yt1Var2.L, n81Var.p(25));
                yt1Var3.a |= 33554432;
                yt1Var3.L = fA10;
            }
            if ((j8 & 67108864) != j3) {
                j7 = 16777216;
                float fA11 = xk.A(yt1Var.M, yt1Var2.M, n81Var.p(26));
                yt1Var3.a |= 67108864;
                yt1Var3.M = fA11;
            } else {
                j7 = 16777216;
            }
            if ((j8 & 134217728) != j3) {
                float fA12 = xk.A(yt1Var.N, yt1Var2.N, n81Var.p(27));
                yt1Var3.a = 134217728 | yt1Var3.a;
                yt1Var3.N = fA12;
            }
            if ((268435456 & j8) != j3) {
                float fA13 = xk.A(yt1Var.O, yt1Var2.O, n81Var.p(28));
                yt1Var3.a |= 268435456;
                yt1Var3.O = fA13;
            }
            if ((536870912 & j8) != j3) {
                float fA14 = xk.A(yt1Var.P, yt1Var2.P, n81Var.p(29));
                yt1Var3.a |= j7;
                yt1Var3.K = fA14;
            }
            if ((1073741824 & j8) != j3) {
                float fA15 = xk.A(yt1Var.Q, yt1Var2.Q, n81Var.p(30));
                yt1Var3.a |= 33554432;
                yt1Var3.L = fA15;
            }
            if ((4294967296L & j8) != j3) {
                float fA16 = xk.A(yt1Var.S, yt1Var2.S, n81Var.p(i3));
                yt1Var3.a |= 4294967296L;
                yt1Var3.S = fA16;
            }
            if ((2147483648L & j8) != j3) {
                boolean z = (n81Var.p(31) < f3 ? yt1Var : yt1Var2).D;
                yt1Var3.a |= 2147483648L;
                yt1Var3.D = z;
            }
        }
        if ((k & iH) != 0 && (iH & 16) != 0) {
            float fP18 = n81Var.p(54);
            wl wlVar = yt1Var.T;
            wl wlVar2 = yt1Var2.T;
            if ((wlVar instanceof wf) && (wlVar2 instanceof wf)) {
                wf wfVar = (wf) wlVar;
                wf wfVar2 = (wf) wlVar2;
                fp0Var = new wf((fP18 <= f3 ? wfVar : wfVar2).c, lk.U(fP18, wfVar.b, wfVar2.b));
            } else if ((wlVar instanceof fp0) && (wlVar2 instanceof fp0)) {
                fp0 fp0Var2 = (fp0) wlVar;
                fp0 fp0Var3 = (fp0) wlVar2;
                fp0Var = new fp0(lk.U(fP18, fp0Var2.b, fp0Var3.b), lk.U(fP18, fp0Var2.c, fp0Var3.c));
            } else {
                if (fP18 > f3) {
                    wlVar = wlVar2;
                }
                yt1Var3.b |= 16;
                yt1Var3.T = wlVar;
            }
            wlVar = fp0Var;
            yt1Var3.b |= 16;
            yt1Var3.T = wlVar;
        }
        if ((137438953472L & j8) != j3) {
            long jU3 = lk.U(n81Var.p(57), yt1Var.U, yt1Var2.U);
            yt1Var3.a |= 137438953472L;
            yt1Var3.b &= -129;
            yt1Var3.U = jU3;
            yt1Var3.V = null;
        }
        if ((iH & 128) != 0) {
            yt1Var3.d(b(yt1Var.V, yt1Var.U, yt1Var2.V, yt1Var2.U, n81Var.p(57)));
        }
        if ((g & j8) != j3) {
            if ((j8 & 274877906944L) != j3) {
                yt1Var3.y(((yt1Var.a & 274877906944L) == j3 || ((274877906944L & yt1Var2.a) != j3 && ((double) n81Var.p(38)) >= d2)) ? yt1Var2.s() : yt1Var.s());
            }
            if ((j8 & 70368744177664L) != j3) {
                if ((yt1Var.a & 70368744177664L) == j3) {
                    j6 = yt1Var2.Y;
                } else if ((yt1Var2.a & 70368744177664L) != j3) {
                    j6 = (((double) n81Var.p(46)) < d2 ? yt1Var : yt1Var2).Y;
                } else {
                    j6 = yt1Var.Y;
                }
                yt1Var3.a = 70368744177664L | yt1Var3.a;
                yt1Var3.Y = j6;
            }
            if ((j8 & 140737488355328L) != j3) {
                if ((yt1Var.a & 140737488355328L) == j3) {
                    j5 = yt1Var2.Z;
                } else if ((yt1Var2.a & 140737488355328L) != j3) {
                    j5 = (((double) n81Var.p(47)) < d2 ? yt1Var : yt1Var2).Z;
                } else {
                    j5 = yt1Var.Z;
                }
                yt1Var3.a = 140737488355328L | yt1Var3.a;
                yt1Var3.Z = j5;
            }
            if ((j8 & 281474976710656L) != j3) {
                if ((yt1Var.a & 281474976710656L) == j3) {
                    j4 = yt1Var2.a0;
                } else if ((yt1Var2.a & 281474976710656L) != j3) {
                    j4 = (((double) n81Var.p(48)) < d2 ? yt1Var : yt1Var2).a0;
                } else {
                    j4 = yt1Var.a0;
                }
                yt1Var3.a = 281474976710656L | yt1Var3.a;
                yt1Var3.a0 = j4;
            }
            if ((j8 & 8796093022208L) != j3) {
                if ((yt1Var.a & 8796093022208L) == j3) {
                    f4 = yt1Var2.b0;
                } else if ((yt1Var2.a & 8796093022208L) != j3) {
                    f4 = (((double) n81Var.p(43)) < d2 ? yt1Var : yt1Var2).b0;
                } else {
                    f4 = yt1Var.b0;
                }
                yt1Var3.a = 8796093022208L | yt1Var3.a;
                yt1Var3.b0 = f4;
            }
            if ((j8 & 562949953421312L) != j3) {
                if ((yt1Var.a & 562949953421312L) != j3 && (yt1Var2.a & 562949953421312L) != j3) {
                    n81Var.p(49);
                }
                yt1Var3.a = 562949953421312L | yt1Var3.a;
            }
            if ((j8 & 2199023255552L) != j3) {
                yt1Var3.x(((yt1Var.a & 2199023255552L) == j3 || ((2199023255552L & yt1Var2.a) != j3 && ((double) n81Var.p(41)) >= d2)) ? yt1Var2.r() : yt1Var.r());
            }
            if ((j8 & 4398046511104L) != j3) {
                yt1Var3.z(((yt1Var.a & 4398046511104L) == j3 || ((4398046511104L & yt1Var2.a) != j3 && ((double) n81Var.p(42)) >= d2)) ? yt1Var2.t() : yt1Var.t());
            }
            if ((j8 & 17592186044416L) != j3) {
                yt1Var3.w(((yt1Var.a & 17592186044416L) == j3 || ((17592186044416L & yt1Var2.a) != j3 && ((double) n81Var.p(44)) >= d2)) ? yt1Var2.p() : yt1Var.p());
            }
            if ((j8 & 35184372088832L) != j3) {
                yt1Var3.j(((yt1Var.a & 35184372088832L) == j3 || ((35184372088832L & yt1Var2.a) != j3 && ((double) n81Var.p(45)) >= d2)) ? yt1Var2.n() : yt1Var.n());
            }
            if ((j8 & 549755813888L) != j3) {
                yt1Var3.k(((yt1Var.a & 549755813888L) == j3 || ((549755813888L & yt1Var2.a) != j3 && ((double) n81Var.p(39)) >= d2)) ? yt1Var2.o() : yt1Var.o());
            }
            if ((j8 & 1099511627776L) != j3) {
                yt1Var3.i(((yt1Var.a & 1099511627776L) == j3 || ((yt1Var2.a & 1099511627776L) != j3 && ((double) n81Var.p(40)) >= d2)) ? yt1Var2.m() : yt1Var.m());
            }
        }
        if ((m & iH) != 0) {
            if ((iH & 256) != 0) {
                if ((yt1Var.b & 256) != 0 && (yt1Var2.b & 256) != 0) {
                    n81Var.p(58);
                }
                yt1Var3.b |= 256;
            }
            if ((iH & 512) != 0) {
                if ((yt1Var.b & 512) == 0) {
                    uz1Var = yt1Var2.W;
                } else if ((yt1Var2.b & 512) != 0) {
                    uz1Var = (((double) n81Var.p(59)) < d2 ? yt1Var : yt1Var2).W;
                } else {
                    uz1Var = yt1Var.W;
                }
                yt1Var3.b |= 512;
                yt1Var3.W = uz1Var;
            }
            if ((iH & 1024) != 0) {
                fz1 fz1Var = (yt1Var.b & 1024) != 0 ? ((yt1Var2.b & 1024) == 0 || ((double) n81Var.p(60)) < d2) ? yt1Var.X : yt1Var2.X : yt1Var2.X;
                fz1Var.getClass();
                yt1Var3.b |= 1024;
                yt1Var3.X = fz1Var;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lh b(lh lhVar, long j2, lh lhVar2, long j3, float f2) {
        Object objB;
        if (lhVar == null && lhVar2 == null) {
            return null;
        }
        if (lhVar == null) {
            lhVar = new uq1(j2);
        } else if (lhVar2 == null) {
            lhVar2 = new uq1(j3);
        }
        if (lhVar.equals(lhVar2)) {
            objB = f2 < 0.5f ? lhVar : lhVar2;
        } else {
            objB = lhVar instanceof li0 ? ((li0) lhVar).b(lhVar2, f2) : null;
            if (objB == null && (lhVar2 instanceof li0)) {
                objB = ((li0) lhVar2).b(lhVar, 1.0f - f2);
            }
            if (objB == null) {
                if (f2 < 0.5f) {
                }
            }
        }
        lh lhVar3 = objB instanceof lh ? (lh) objB : null;
        return lhVar3 == null ? ((double) f2) < 0.5d ? lhVar : lhVar2 : lhVar3;
    }

    public static final Object c(Object obj, Object obj2, float f2) {
        Object[] objArr;
        Object[] objArr2;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            return null;
        }
        if (z) {
            objArr = (tm1[]) obj;
        } else {
            obj.getClass();
            objArr = new tm1[]{obj};
        }
        if (z2) {
            objArr2 = (tm1[]) obj2;
        } else {
            obj2.getClass();
            objArr2 = new tm1[]{obj2};
        }
        int iMax = Math.max(objArr.length, objArr2.length);
        tm1[] tm1VarArr = new tm1[iMax];
        for (int i2 = 0; i2 < iMax; i2++) {
            tm1VarArr[i2] = null;
        }
        for (int i3 = 0; i3 < iMax; i3++) {
            tm1VarArr[i3] = null;
        }
        return tm1VarArr;
    }

    public static final int d(int i2) {
        int i3 = 0;
        for (int i4 = 50; i4 < 61; i4++) {
            if ((a[i4] & i2) != 0) {
                i3 |= 1 << (i4 - 50);
            }
        }
        return i3;
    }

    public static final int e(int i2) {
        return ((h & i2) != 0 ? 1 : 0) | ((i & i2) != 0 ? 8 : 0) | ((j & i2) != 0 ? 2 : 0) | ((k & i2) != 0 ? 4 : 0) | ((l & i2) != 0 ? 32 : 0) | ((i2 & m) != 0 ? 16 : 0);
    }

    public static final long f(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < 50; i3++) {
            if ((a[i3] & i2) != 0) {
                j2 |= 1 << ((byte) i3);
            }
        }
        return j2;
    }

    public static final int g(long j2) {
        return ((b & j2) != 0 ? 1 : 0) | ((c & j2) != 0 ? 8 : 0) | ((d & j2) != 0 ? 2 : 0) | ((e & j2) != 0 ? 4 : 0) | ((f & j2) != 0 ? 32 : 0) | ((j2 & g) != 0 ? 16 : 0);
    }

    public static final int h(int i2, long j2) {
        if ((257698037760L & j2) == 0) {
            return i2;
        }
        if ((34359738368L & j2) != 0) {
            i2 |= 1;
        }
        if ((137438953472L & j2) != 0) {
            i2 |= 128;
        }
        if ((17179869184L & j2) != 0) {
            i2 |= 2;
        }
        return (j2 & 68719476736L) != 0 ? i2 | 4 : i2;
    }

    public static final long i(int i2, long j2) {
        if ((i2 & 135) != 0) {
            if ((i2 & 1) != 0) {
                j2 |= 34359738368L;
            }
            if ((i2 & 128) != 0) {
                j2 |= 137438953472L;
            }
            if ((i2 & 2) != 0) {
                j2 |= 17179869184L;
            }
            if ((i2 & 4) != 0) {
                return j2 | 68719476736L;
            }
        }
        return j2;
    }
}
