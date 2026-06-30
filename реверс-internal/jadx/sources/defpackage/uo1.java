package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 {
    public static final uo1 a = new uo1();
    public static final float b;
    public static final float c;
    public static final w6 d;

    static {
        float f = u4.u0;
        b = f;
        c = f;
        d = y6.a();
    }

    public static no1 d(ob0 ob0Var) {
        bm bmVar = ((ju0) ob0Var.j(mu0.b)).a;
        no1 no1Var = bmVar.c0;
        if (no1Var != null) {
            return no1Var;
        }
        long jB = dm.b(bmVar, u4.o0);
        cm cmVar = u4.h0;
        long jB2 = dm.b(bmVar, cmVar);
        cm cmVar2 = u4.s0;
        long jB3 = dm.b(bmVar, cmVar2);
        long jB4 = dm.b(bmVar, cmVar2);
        long jB5 = dm.b(bmVar, cmVar);
        long jE = lk.E(vl.b(u4.l0, dm.b(bmVar, u4.k0)), bmVar.p);
        cm cmVar3 = u4.i0;
        long jB6 = dm.b(bmVar, cmVar3);
        float f = u4.j0;
        long jB7 = vl.b(f, jB6);
        cm cmVar4 = u4.m0;
        long jB8 = dm.b(bmVar, cmVar4);
        float f2 = u4.n0;
        no1 no1Var2 = new no1(jB, jB2, jB3, jB4, jB5, jE, jB7, vl.b(f2, jB8), vl.b(f2, dm.b(bmVar, cmVar4)), vl.b(f, dm.b(bmVar, cmVar3)));
        bmVar.c0 = no1Var2;
        return no1Var2;
    }

    public static void e(p10 p10Var, k31 k31Var, long j, long j2, long j3, float f, float f2) {
        hg1 hg1Var;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (k31Var == k31.e) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            pc1 pc1VarA = qc1.a(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            hg1Var = new hg1(pc1VarA.a, pc1VarA.b, pc1VarA.c, pc1VarA.d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            pc1 pc1VarA2 = qc1.a(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            hg1Var = new hg1(pc1VarA2.a, pc1VarA2.b, pc1VarA2.c, pc1VarA2.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        w6 w6Var = d;
        w6.c(w6Var, hg1Var);
        p10.l0(p10Var, w6Var, j3, null, 60);
        w6Var.h();
    }

    public final void a(final jx0 jx0Var, tv0 tv0Var, final no1 no1Var, final boolean z, long j, ob0 ob0Var, final int i) {
        final tv0 tv0Var2;
        final long j2;
        long j3;
        tv0 tv0Var3;
        ob0Var.X(-290277409);
        int i2 = i | (ob0Var.f(jx0Var) ? 4 : 2) | 48 | (ob0Var.f(no1Var) ? 256 : 128) | (ob0Var.g(z) ? 2048 : 1024) | 24576;
        if (ob0Var.N(i2 & 1, (74899 & i2) != 74898)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                j3 = fp1.c;
                tv0Var3 = qv0.a;
            } else {
                ob0Var.Q();
                tv0Var3 = tv0Var;
                j3 = j;
            }
            ob0Var.q();
            tv0 tv0Var4 = tv0Var3;
            fp1.e(jx0Var, tv0Var4, no1Var, z, j3, ob0Var, (i2 & 7168) | (i2 & 14) | 196656 | (i2 & 896) | 24576);
            j2 = j3;
            tv0Var2 = tv0Var4;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            j2 = j;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(jx0Var, tv0Var2, no1Var, z, j2, i) { // from class: qo1
                public final /* synthetic */ jx0 f;
                public final /* synthetic */ tv0 g;
                public final /* synthetic */ no1 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ long j;

                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = al.V(196609);
                    this.e.a(this.f, this.g, this.h, this.i, this.j, (ob0) obj, iV);
                    return t32.a;
                }
            };
        }
    }

    public final void b(final hp1 hp1Var, tv0 tv0Var, final boolean z, final no1 no1Var, wa0 wa0Var, xa0 xa0Var, float f, float f2, ob0 ob0Var, final int i) {
        int i2;
        final tv0 tv0Var2;
        final wa0 wa0Var2;
        final xa0 xa0Var2;
        final float f3;
        final float f4;
        int i3;
        wa0 wa0Var3;
        float f5;
        xa0 xa0Var3;
        tv0 tv0Var3;
        float f6;
        ob0Var.X(49984771);
        if ((i & 6) == 0) {
            i2 = (ob0Var.h(hp1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= ob0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ob0Var.f(no1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= ob0Var.f(this) ? 67108864 : 33554432;
        }
        if (ob0Var.N(i5 & 1, (38347923 & i5) != 38347922)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && ob0Var.f(no1Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objK = ob0Var.K();
                l91 l91Var = kp.a;
                if (z2 || objK == l91Var) {
                    objK = new tc(no1Var, z);
                    ob0Var.f0(objK);
                }
                wa0 wa0Var4 = (wa0) objK;
                i3 = i5 & (-57345);
                Object objK2 = ob0Var.K();
                if (objK2 == l91Var) {
                    objK2 = to1.e;
                    ob0Var.f0(objK2);
                }
                float f7 = fp1.d;
                wa0Var3 = wa0Var4;
                f5 = fp1.e;
                xa0Var3 = (xa0) objK2;
                tv0Var3 = qv0.a;
                f6 = f7;
            } else {
                ob0Var.Q();
                i3 = i5 & (-57345);
                tv0Var3 = tv0Var;
                wa0Var3 = wa0Var;
                xa0Var3 = xa0Var;
                f6 = f;
                f5 = f2;
            }
            ob0Var.q();
            int i6 = i3 << 3;
            c(hp1Var, tv0Var3, z, no1Var, wa0Var3, xa0Var3, f6, f5, ob0Var, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), ((i3 >> 21) & 112) | 6);
            tv0Var2 = tv0Var3;
            f4 = f5;
            f3 = f6;
            xa0Var2 = xa0Var3;
            wa0Var2 = wa0Var3;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            wa0Var2 = wa0Var;
            xa0Var2 = xa0Var;
            f3 = f;
            f4 = f2;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0() { // from class: po1
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.e.b(hp1Var, tv0Var2, z, no1Var, wa0Var2, xa0Var2, f3, f4, (ob0) obj, al.V(i | 1));
                    return t32.a;
                }
            };
        }
    }

    public final void c(final hp1 hp1Var, final tv0 tv0Var, final boolean z, final no1 no1Var, final wa0 wa0Var, final xa0 xa0Var, final float f, final float f2, ob0 ob0Var, final int i, final int i2) {
        int i3;
        int i4;
        ob0 ob0Var2;
        int i5;
        tv0 tv0VarB;
        tv0 tv0Var2;
        ob0Var.X(133396521);
        if ((i & 6) == 0) {
            i3 = (ob0Var.h(hp1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ob0Var.c(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ob0Var.f(tv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ob0Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ob0Var.f(no1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ob0Var.h(wa0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ob0Var.h(xa0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ob0Var.c(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ob0Var.c(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ob0Var.g(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ob0Var.g(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (ob0Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jA = no1Var.a(z, false);
            final long jA2 = no1Var.a(z, true);
            long j = z ? no1Var.e : no1Var.j;
            long j2 = z ? no1Var.c : no1Var.h;
            wf1 wf1Var = ((xf1) ob0Var.j(jf1.a)).a;
            if (hp1Var.m == k31.e) {
                i5 = i3;
                tv0VarB = ko1.h(tv0Var, fp1.a).c(ko1.b);
            } else {
                i5 = i3;
                tv0VarB = ko1.b(tv0Var.c(ko1.a), fp1.a);
            }
            int i6 = i5 & 112;
            boolean zH = (i6 == 32) | ob0Var.h(hp1Var);
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (zH || objK == l91Var) {
                objK = new wi(8, hp1Var);
                ob0Var.f0(objK);
            }
            tv0 tv0VarC = tv0VarB.c(s22.y(qv0.a, (xa0) objK));
            boolean zH2 = (i6 == 32) | ob0Var.h(hp1Var) | ((i4 & 14) == 4) | ob0Var.e(jA) | ob0Var.e(jA2) | ob0Var.e(j) | ob0Var.e(j2) | ((i5 & 29360128) == 8388608) | ob0Var.c(0.0f) | ((i5 & 234881024) == 67108864) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912);
            Object objK2 = ob0Var.K();
            if (zH2 || objK2 == l91Var) {
                tv0Var2 = tv0VarC;
                final long j3 = j2;
                ob0Var2 = ob0Var;
                final long j4 = j;
                sa0 sa0Var = new sa0() { // from class: ro1
                    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
                    /* JADX WARN: Removed duplicated region for block: B:144:0x033c  */
                    @Override // defpackage.sa0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object i(Object obj) {
                        float fY;
                        long j5;
                        int iD;
                        float fY2;
                        float fY3;
                        float f3;
                        k31 k31Var;
                        char c2;
                        float[] fArr;
                        wa0 wa0Var2;
                        float f4;
                        float f5;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        p10 p10Var;
                        k31 k31Var2;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits4;
                        p10 p10Var2;
                        long jFloatToRawIntBits7;
                        int iFloatToRawIntBits5;
                        long jFloatToRawIntBits8;
                        long jFloatToRawIntBits9;
                        int iFloatToRawIntBits6;
                        long jFloatToRawIntBits10;
                        p10 p10Var3 = (p10) obj;
                        boolean zB = tz.b(Float.NaN, Float.NaN);
                        k31 k31Var3 = k31.e;
                        hp1 hp1Var2 = hp1Var;
                        if (zB) {
                            fY = (hp1Var2.m == k31Var3 ? Float.intBitsToFloat((int) (p10Var3.d() >> 32)) : Float.intBitsToFloat((int) (p10Var3.d() & 4294967295L))) / 2.0f;
                        } else {
                            fY = p10Var3.y(Float.NaN);
                        }
                        hp1Var2.b();
                        s41 s41Var = hp1Var2.l;
                        s41 s41Var2 = hp1Var2.k;
                        hp1Var2.b();
                        float fS0 = p10Var3.s0(s41Var2.g());
                        float fS02 = p10Var3.s0(s41Var.g());
                        uo1 uo1Var = uo1.a;
                        float[] fArr2 = hp1Var2.f;
                        float fB = hp1Var2.b();
                        float f6 = f + 0.0f;
                        float fV0 = p10Var3.v0(fY);
                        k31 k31Var4 = hp1Var2.m;
                        boolean z2 = k31Var4 == k31Var3;
                        boolean z3 = p10Var3.getLayoutDirection() == al0.f;
                        boolean z4 = z3 && !z2;
                        float fY4 = p10Var3.y(fV0);
                        if (z2) {
                            j5 = 4294967295L;
                            iD = (int) (p10Var3.d() & 4294967295L);
                        } else {
                            j5 = 4294967295L;
                            iD = (int) (p10Var3.d() >> 32);
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat(iD);
                        fArr2.getClass();
                        if (xi0.n(0.0f, fArr2.length == 0 ? null : Float.valueOf(fArr2[0])) || xi0.n(0.0f, nd.Y(fArr2))) {
                        }
                        float f7 = (fArr2.length == 0 || (xi0.n(fB, fArr2.length != 0 ? Float.valueOf(fArr2[0]) : null) || xi0.n(fB, nd.Y(fArr2)))) ? ((fIntBitsToFloat - 0.0f) * fB) + 0.0f : (((fIntBitsToFloat - 0.0f) - (fY4 * 2.0f)) * fB) + 0.0f + fY4;
                        int length = fArr2.length;
                        float fY5 = p10Var3.y(f2);
                        if (z2) {
                            if (tz.a(0.0f, 0.0f) > 0) {
                                p10Var3.y(0.0f);
                                p10Var3.y(0.0f);
                            }
                            if (tz.a(f6, 0.0f) > 0) {
                                fY2 = p10Var3.y(fS02) / 2.0f;
                                fY3 = p10Var3.y(f6);
                                f3 = fY3 + fY2;
                            }
                            f3 = 0.0f;
                        } else {
                            if (tz.a(0.0f, 0.0f) > 0) {
                                p10Var3.y(0.0f);
                                p10Var3.y(0.0f);
                            }
                            if (tz.a(f6, 0.0f) > 0) {
                                fY2 = p10Var3.y(fS0) / 2.0f;
                                fY3 = p10Var3.y(f6);
                                f3 = fY3 + fY2;
                            }
                            f3 = 0.0f;
                        }
                        long jS = p10Var3.S();
                        Float.intBitsToFloat((int) (z2 ? jS & j5 : jS >> 32));
                        float f8 = (fIntBitsToFloat - f3) - fY4;
                        wa0 wa0Var3 = wa0Var;
                        if (f7 < f8) {
                            float f9 = z4 ? fY4 : fY5;
                            float f10 = z4 ? fY5 : fY4;
                            float f11 = f7 + f3;
                            float f12 = fIntBitsToFloat - f11;
                            if (z2) {
                                jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(f11);
                                c2 = ' ';
                                fArr = fArr2;
                            } else {
                                c2 = ' ';
                                fArr = fArr2;
                                if (z3) {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                } else {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f11);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                }
                            }
                            long j6 = (jFloatToRawIntBits6 << c2) | (((long) iFloatToRawIntBits4) & j5);
                            if (z2) {
                                jFloatToRawIntBits7 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (p10Var3.d() >> c2)));
                                p10Var2 = p10Var3;
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(f12);
                            } else {
                                p10Var2 = p10Var3;
                                if (z3) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p10Var2.d() >> c2)) - f11;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (p10Var2.d() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p10Var2.d() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f12);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits8 = iFloatToRawIntBits5;
                            }
                            long j7 = (jFloatToRawIntBits8 & j5) | (jFloatToRawIntBits7 << c2);
                            k31Var = k31Var4;
                            p10Var3 = p10Var2;
                            wa0Var2 = wa0Var3;
                            uo1.e(p10Var3, k31Var, j6, j7, jA, f9, f10);
                            if (z2) {
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (p10Var3.S() >> c2)));
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat - fY4);
                            } else if (z3) {
                                jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fY4)) << c2) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (p10Var3.S() & j5)))) & j5);
                                if (wa0Var2 != null) {
                                    wa0Var2.h(p10Var3, new w01(jFloatToRawIntBits10));
                                }
                            } else {
                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (p10Var3.S() & j5));
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat - fY4);
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
                            }
                            jFloatToRawIntBits10 = (((long) iFloatToRawIntBits6) & j5) | (jFloatToRawIntBits9 << c2);
                            if (wa0Var2 != null) {
                            }
                        } else {
                            k31Var = k31Var4;
                            c2 = ' ';
                            fArr = fArr2;
                            wa0Var2 = wa0Var3;
                        }
                        float f13 = f7 - f3;
                        float f14 = !z4 ? fY4 : fY5;
                        float f15 = z4 ? fY4 : fY5;
                        float f16 = z4 ? f13 : f13 - 0.0f;
                        if (f16 > f14) {
                            if (!z2 && z3) {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (p10Var3.d() >> c2)) - f13);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                            } else {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                            }
                            long j8 = (jFloatToRawIntBits3 << c2) | (((long) iFloatToRawIntBits2) & j5);
                            if (z2) {
                                p10Var = p10Var3;
                                k31Var2 = k31Var;
                                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f16)) & j5) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (p10Var3.d() >> c2)))) << c2);
                            } else {
                                p10Var = p10Var3;
                                k31Var2 = k31Var;
                                if (z3) {
                                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (p10Var.d() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f13);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                                } else {
                                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (p10Var.d() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f16);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits3) & j5);
                            }
                            long j9 = jFloatToRawIntBits5;
                            p10Var3 = p10Var;
                            uo1.e(p10Var3, k31Var2, j8, j9, jA2, f14, f15);
                        }
                        float f17 = 0.0f + fY4;
                        float f18 = fIntBitsToFloat - fY4;
                        float f19 = f7 - f3;
                        float f20 = f7 + f3;
                        float[] fArr3 = fArr;
                        int length2 = fArr3.length;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length2) {
                            float f21 = fArr3[i7];
                            int i9 = i8 + 1;
                            if (wa0Var2 == null || i8 != fArr3.length - 1) {
                                float fA = xk.A(f17, f18, f21);
                                if (fA < f19 || fA > f20) {
                                    if (z2) {
                                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (p10Var3.S() >> c2)));
                                        f4 = f17;
                                        f5 = f19;
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fA);
                                    } else {
                                        f4 = f17;
                                        f5 = f19;
                                        if (z3) {
                                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (p10Var3.d() >> c2)) - fA;
                                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (p10Var3.S() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
                                        } else {
                                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (p10Var3.S() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                                        }
                                        jFloatToRawIntBits2 = iFloatToRawIntBits;
                                    }
                                    xa0Var.f(p10Var3, new w01((jFloatToRawIntBits2 & j5) | (jFloatToRawIntBits << c2)), new vl((fA < 0.0f || fA > f13) ? j4 : j3));
                                } else {
                                    f4 = f17;
                                    f5 = f19;
                                }
                            }
                            i7++;
                            i8 = i9;
                            f17 = f4;
                            f19 = f5;
                        }
                        return t32.a;
                    }
                };
                ob0Var2.f0(sa0Var);
                objK2 = sa0Var;
            } else {
                tv0Var2 = tv0VarC;
                ob0Var2 = ob0Var;
            }
            u4.a(tv0Var2, (sa0) objK2, ob0Var2, 0);
        } else {
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0() { // from class: so1
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.e.c(hp1Var, tv0Var, z, no1Var, wa0Var, xa0Var, f, f2, (ob0) obj, al.V(i | 1), al.V(i2));
                    return t32.a;
                }
            };
        }
    }
}
