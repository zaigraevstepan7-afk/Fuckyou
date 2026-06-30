package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sc1 {
    public final mh0 a;
    public final h4 b;
    public final g6 c;
    public final r02 d;
    public final sx0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public r3 i;
    public long j;
    public final a7 k;
    public final yx0 l;

    public sc1(hx0 hx0Var, h4 h4Var) {
        this.a = hx0Var;
        this.b = h4Var;
        g6 g6Var = new g6();
        g6Var.b = new long[192];
        g6Var.c = new long[192];
        this.c = g6Var;
        this.d = new r02();
        this.e = new sx0();
        this.j = -1L;
        this.k = new a7(13, this);
        this.l = new yx0();
    }

    public static boolean c(c01 c01Var) {
        v31 v31Var = c01Var.T;
        return (v31Var == null || bl.H(((qc0) v31Var).b())) ? false : true;
    }

    public static boolean d(ql0 ql0Var) {
        return ql0Var.k != -4;
    }

    public static long g(ql0 ql0Var) {
        xz0 xz0Var = ql0Var.I;
        c01 c01Var = xz0Var.d;
        long jC = 0;
        for (c01 c01Var2 = xz0Var.c; c01Var2 != null && c01Var2 != c01Var; c01Var2 = c01Var2.y) {
            if (c(c01Var2)) {
                return 9223372034707292159L;
            }
            jC = oh0.c(jC, c01Var2.H);
        }
        return jC;
    }

    public static void j(ql0 ql0Var) {
        if (!ql0Var.g || c(ql0Var.I.d)) {
            return;
        }
        ql0Var.g = false;
        if (ql0Var.i) {
            ql0Var.h = g(ql0Var);
            ql0Var.i = false;
        }
        if (oh0.a(ql0Var.h, 9223372034707292159L)) {
            return;
        }
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            j((ql0) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        long j;
        g6 g6Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        r3 r3Var = this.i;
        if (r3Var != null) {
            this.b.removeCallbacks(r3Var);
            this.i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        g6 g6Var2 = this.c;
        boolean z4 = true;
        r02 r02Var = this.d;
        if (z2) {
            this.f = false;
            sx0 sx0Var = this.e;
            Object[] objArr = sx0Var.a;
            int i3 = sx0Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((ha0) objArr[i4]).a();
            }
            long[] jArr2 = (long[]) g6Var2.b;
            int i5 = g6Var2.a;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    q02 q02Var = (q02) r02Var.a.b(((int) j6) & 33554431);
                    while (q02Var != null) {
                        q02 q02Var2 = q02Var.d;
                        boolean z6 = z3;
                        long j9 = q02Var.g;
                        boolean z7 = (jCurrentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        q02Var.e = j7;
                        q02Var.f = j8;
                        if (z7) {
                            q02Var.g = jCurrentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            q02Var.a(j4, j5, r02Var.d, r02Var.e, r02Var.g);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        q02Var = q02Var2;
                        j7 = j4;
                        j8 = j5;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) g6Var2.b;
            int i8 = g6Var2.a;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j10 = r02Var.d;
            long j11 = r02Var.e;
            float[] fArr = r02Var.g;
            hx0 hx0Var = r02Var.a;
            j2 = 128;
            Object[] objArr2 = hx0Var.c;
            long[] jArr4 = hx0Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    g6Var = g6Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                q02 q02Var3 = (q02) objArr2[(i11 << 3) + i15];
                                while (q02Var3 != null) {
                                    r02Var.a(q02Var3, j12, j11, fArr, jCurrentTimeMillis);
                                    q02Var3 = q02Var3.d;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    g6Var2 = g6Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = r02Var.d;
                    long j16 = r02Var.e;
                    float[] fArr2 = r02Var.g;
                    q02 q02Var4 = r02Var.b;
                    if (q02Var4 != null) {
                        while (q02Var4 != null) {
                            ql0 ql0VarP = bl.P(q02Var4.b);
                            long jB = ((h4) tl0.a(ql0VarP)).getRectManager().b(ql0VarP);
                            q02Var4.e = jB;
                            tu0 tu0Var = ql0VarP.J.p;
                            q02Var4.f = (((long) (tu0Var.e + ((int) (jB >> 32)))) << 32) | (((long) (tu0Var.f + ((int) (jB & 4294967295L)))) & 4294967295L);
                            r02Var.a(q02Var4, j15, j16, fArr2, jCurrentTimeMillis);
                            q02Var4 = q02Var4.d;
                        }
                    }
                }
                if (this.h) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.h = false;
                    g6 g6Var3 = g6Var;
                    long[] jArr6 = (long[]) g6Var3.b;
                    int i17 = g6Var3.a;
                    long[] jArr7 = (long[]) g6Var3.c;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != rc1.a) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    g6Var3.a = i18;
                    g6Var3.b = jArr7;
                    g6Var3.c = jArr6;
                }
                if (r02Var.c <= jCurrentTimeMillis) {
                    hx0 hx0Var2 = r02Var.a;
                    Object[] objArr3 = hx0Var2.c;
                    long[] jArr8 = hx0Var2.a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (q02 q02Var5 = (q02) objArr3[(i21 << 3) + i23]; q02Var5 != null; q02Var5 = q02Var5.d) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                } else if (i21 == length2) {
                                    break;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    q02 q02Var6 = r02Var.b;
                    if (q02Var6 != null) {
                        while (q02Var6 != null) {
                            q02Var6 = q02Var6.d;
                        }
                    }
                    r02Var.c = -1L;
                }
                if (r02Var.c <= j) {
                    k();
                    return;
                }
                return;
            }
            g6Var = g6Var2;
            i = 8;
        } else {
            g6Var = g6Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.h) {
        }
        if (r02Var.c <= jCurrentTimeMillis) {
        }
        if (r02Var.c <= j) {
        }
    }

    public final long b(ql0 ql0Var) {
        if (!d(ql0Var)) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.b)[e(ql0Var)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int e(ql0 ql0Var) {
        int i = ql0Var.k;
        if (i == -4) {
            i = -4;
        } else {
            int i2 = ql0Var.f;
            g6 g6Var = this.c;
            long[] jArr = (long[]) g6Var.b;
            if (i < 0 || i >= g6Var.a - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = g6Var.a;
                for (int i5 = 0; i5 < i4 - 2; i5 += 3) {
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                }
                i = -4;
            }
        }
        if (i == -4) {
            ng0.a("LayoutNode " + ql0Var.f + " not found in RectList");
        }
        ql0Var.k = i;
        return i;
    }

    public final void f(ql0 ql0Var) {
        ql0Var.g = true;
        xz0 xz0Var = ql0Var.I;
        c01 c01Var = xz0Var.d;
        tu0 tu0Var = ql0Var.J.p;
        int iH0 = tu0Var.h0();
        float fG0 = tu0Var.g0();
        yx0 yx0Var = this.l;
        yx0Var.a = 0.0f;
        yx0Var.b = 0.0f;
        yx0Var.c = iH0;
        yx0Var.d = fG0;
        while (true) {
            if (c01Var == null) {
                break;
            }
            ql0 ql0Var2 = c01Var.w;
            if (c01Var == ql0Var2.I.d && !ql0Var2.g) {
                if (!oh0.a(b(ql0Var2), 9223372034707292159L)) {
                    yx0Var.c((((long) Float.floatToRawIntBits((int) (r9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (r9 & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            v31 v31Var = c01Var.T;
            if (v31Var != null) {
                float[] fArrB = ((qc0) v31Var).b();
                if (!bl.H(fArrB)) {
                    ou0.c(fArrB, yx0Var);
                }
            }
            long j = c01Var.H;
            yx0Var.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            c01Var = c01Var.y;
        }
        int i = (int) yx0Var.a;
        int i2 = (int) yx0Var.b;
        int i3 = (int) yx0Var.c;
        int i4 = (int) yx0Var.d;
        int i5 = ql0Var.f;
        int i6 = ql0Var.k;
        g6 g6Var = this.c;
        if (i6 != -4) {
            int iE = e(ql0Var);
            long[] jArr = (long[]) g6Var.b;
            jArr[iE] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iE + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iE + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            ql0 ql0VarU = ql0Var.u();
            ql0Var.k = g6Var.c(i5, i, i2, i3, i4, ql0VarU != null ? ql0VarU.f : -1, ql0VarU != null ? e(ql0VarU) : -4, xz0Var.d(1024), xz0Var.d(16), this.d.a.a(i5));
        }
        ql0Var.j = false;
        this.f = true;
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i8 = iy0VarY.g;
        for (int i9 = 0; i9 < i8; i9++) {
            ql0 ql0Var3 = (ql0) objArr[i9];
            if (ql0Var3.K()) {
                f(ql0Var3);
            }
        }
    }

    public final void h(ql0 ql0Var) {
        long j;
        boolean zK = ql0Var.K();
        xz0 xz0Var = ql0Var.I;
        if (zK && ql0Var.j) {
            ql0 ql0VarU = ql0Var.u();
            if (ql0VarU == null || ql0VarU.g) {
                j = ql0VarU == null ? 0L : 9223372034707292159L;
            } else {
                if (ql0VarU.i) {
                    ql0VarU.i = false;
                    ql0VarU.h = g(ql0VarU);
                }
                j = ql0VarU.h;
            }
            c01 c01Var = xz0Var.d;
            if (oh0.a(j, 9223372034707292159L) || c(c01Var)) {
                f(ql0Var);
            } else if (ql0Var.g) {
                f(ql0Var);
                j(ql0Var);
            } else {
                long jC = oh0.c(j, c01Var.H);
                tu0 tu0Var = ql0Var.J.p;
                int iH0 = tu0Var.h0();
                int iG0 = tu0Var.g0();
                int i = ql0Var.k;
                g6 g6Var = this.c;
                if (i != -4) {
                    int iE = e(ql0Var);
                    if (ql0VarU != null) {
                        int iE2 = e(ql0VarU);
                        long[] jArr = (long[]) g6Var.b;
                        long j2 = jArr[iE2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jC >> 32));
                        int i3 = ((int) j2) + ((int) (jC & 4294967295L));
                        long j3 = jArr[iE];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iE + 2;
                        long j4 = jArr[i6];
                        jArr[iE] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iE + 1] = (((long) (iH0 + i2)) << 32) | (((long) (iG0 + i3)) & 4294967295L);
                        jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i4 != 0 || i5 != 0) {
                            g6Var.d(iE, i4, i5, j4);
                        }
                    } else {
                        int iE3 = e(ql0Var);
                        int i7 = (int) (jC >> 32);
                        int i8 = (int) (jC & 4294967295L);
                        long[] jArr2 = (long[]) g6Var.b;
                        long j5 = jArr2[iE3];
                        jArr2[iE3] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                        jArr2[iE3 + 1] = (((long) (iG0 + i8)) & 4294967295L) | (((long) (iH0 + i7)) << 32);
                        int i9 = iE3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            g6Var.d(iE3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = ql0Var.f;
                    boolean zD = xz0Var.d(1024);
                    boolean zD2 = xz0Var.d(16);
                    boolean zA = this.d.a.a(i12);
                    if (ql0VarU != null) {
                        int i13 = ql0VarU.f;
                        int iE4 = e(ql0VarU);
                        int i14 = (int) (jC >> 32);
                        int i15 = (int) (jC & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) g6Var.b;
                        if ((((int) jArr3[iE4 + 2]) & 33554431) != (33554431 & i13)) {
                            ng0.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iE4];
                        int i17 = ((int) (j7 >> 32)) + i14;
                        int i18 = ((int) j7) + i15;
                        ql0Var.k = g6Var.c(i16, i17, i18, i17 + iH0, i18 + iG0, i13, iE4, zD, zD2, zA);
                    } else {
                        int i19 = (int) (jC >> 32);
                        int i20 = (int) (jC & 4294967295L);
                        ql0Var.k = g6Var.c(i12, i19, i20, i19 + iH0, i20 + iG0, -1, -4, zD, zD2, zA);
                    }
                }
            }
            ql0Var.j = false;
            this.f = true;
            k();
        }
    }

    public final void i(ql0 ql0Var) {
        if (d(ql0Var)) {
            int iE = e(ql0Var);
            long[] jArr = (long[]) this.c.b;
            jArr[iE] = -1;
            jArr[iE + 1] = -1;
            jArr[iE + 2] = rc1.a;
            ql0Var.k = -4;
            ql0Var.j = true;
            this.f = true;
            this.h = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void k() {
        r3 r3Var = this.i;
        boolean z = r3Var != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            h4 h4Var = this.b;
            if (r3Var != null) {
                h4Var.removeCallbacks(r3Var);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            r3 r3Var2 = new r3(this.k, 0);
            h4Var.postDelayed(r3Var2, jMax - jCurrentTimeMillis);
            this.i = r3Var2;
        }
    }
}
