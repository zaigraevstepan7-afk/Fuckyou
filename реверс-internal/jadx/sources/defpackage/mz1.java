package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class mz1 {
    public static final bq a = new bq(new lh1(6));

    public static final void a(d02 d02Var, jo joVar, ob0 ob0Var, int i) {
        ob0Var.X(15327438);
        int i2 = (ob0Var.f(d02Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(joVar) ? 32 : 16;
        }
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            bq bqVar = a;
            lk.i(bqVar.a(((d02) ob0Var.j(bqVar)).d(d02Var)), joVar, ob0Var, (i2 & 112) | 8);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new go(d02Var, joVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, tv0 tv0Var, long j, long j2, aa0 aa0Var, long j3, dw1 dw1Var, long j4, int i, boolean z, int i2, int i3, d02 d02Var, ob0 ob0Var, final int i4, final int i5, final int i6) {
        int i7;
        long j5;
        int i8;
        aa0 aa0Var2;
        int i9;
        int i10;
        int i11;
        dw1 dw1Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final tv0 tv0Var2;
        final boolean z2;
        final int i19;
        final int i20;
        final d02 d02Var2;
        final aa0 aa0Var3;
        final int i21;
        final long j6;
        final long j7;
        final long j8;
        final dw1 dw1Var3;
        final long j9;
        dc1 dc1VarR;
        long j10;
        long j11;
        dw1 dw1Var4;
        tv0 tv0Var3;
        d02 d02Var3;
        int i22;
        int i23;
        int i24;
        long j12;
        long jB;
        long j13;
        ob0Var.X(1809465675);
        if ((i4 & 6) == 0) {
            i7 = i4 | (ob0Var.f(str) ? 4 : 2);
        } else {
            i7 = i4;
        }
        int i25 = i7 | 48;
        int i26 = i6 & 4;
        if (i26 != 0) {
            i8 = i7 | 432;
            j5 = j;
        } else {
            j5 = j;
            i8 = (ob0Var.e(j5) ? 256 : 128) | i25;
        }
        int i27 = 224256 | i8;
        int i28 = i6 & 64;
        if (i28 != 0) {
            i27 = 1797120 | i8;
        } else {
            if ((i4 & 1572864) == 0) {
                aa0Var2 = aa0Var;
                i27 |= ob0Var.f(aa0Var2) ? 1048576 : 524288;
            }
            int i29 = 12582912 | i27;
            i9 = i6 & 256;
            if (i9 == 0) {
                i29 = 113246208 | i27;
            } else if ((i4 & 100663296) == 0) {
                i29 |= ob0Var.e(j3) ? 67108864 : 33554432;
            }
            i10 = i29 | 805306368;
            i11 = i6 & 1024;
            if (i11 == 0) {
                i12 = i5 | 6;
                dw1Var2 = dw1Var;
            } else {
                dw1Var2 = dw1Var;
                i12 = i5 | (ob0Var.f(dw1Var2) ? 4 : 2);
            }
            int i30 = i12;
            int i31 = i30 | 48;
            i13 = i6 & 4096;
            if (i13 == 0) {
                i15 = i13;
                i16 = i30 | 432;
                i14 = i;
            } else {
                if ((i5 & 384) == 0) {
                    i14 = i;
                    i31 |= ob0Var.d(i14) ? 256 : 128;
                } else {
                    i14 = i;
                }
                i15 = i13;
                i16 = i31;
            }
            int i32 = i16 | 3072;
            i17 = i6 & 16384;
            if (i17 != 0) {
                if ((i5 & 24576) == 0) {
                    i32 |= ob0Var.d(i2) ? 16384 : 8192;
                }
                i18 = i32 | 1769472 | (((i6 & 131072) == 0 && ob0Var.f(d02Var)) ? 8388608 : 4194304);
                boolean z3 = true;
                if (ob0Var.N(i10 & 1, ((i10 & 306783379) == 306783378 && (4793491 & i18) == 4793490) ? false : true)) {
                    ob0Var.S();
                    if ((i4 & 1) == 0 || ob0Var.x()) {
                        if (i26 != 0) {
                            j5 = vl.g;
                        }
                        j10 = g02.c;
                        if (i28 != 0) {
                            aa0Var2 = null;
                        }
                        j11 = i9 != 0 ? j10 : j3;
                        dw1Var4 = i11 == 0 ? dw1Var2 : null;
                        if (i15 != 0) {
                            i14 = 1;
                        }
                        int i33 = i17 != 0 ? Integer.MAX_VALUE : i2;
                        int i34 = i6 & 131072;
                        tv0Var3 = qv0.a;
                        if (i34 != 0) {
                            i22 = i18 & (-29360129);
                            i23 = i33;
                            d02Var3 = (d02) ob0Var.j(a);
                        } else {
                            d02Var3 = d02Var;
                            i22 = i18;
                            i23 = i33;
                        }
                        i24 = 1;
                        j12 = j10;
                    } else {
                        ob0Var.Q();
                        if ((i6 & 131072) != 0) {
                            i18 &= -29360129;
                        }
                        tv0Var3 = tv0Var;
                        j10 = j2;
                        j11 = j3;
                        z3 = z;
                        i23 = i2;
                        i24 = i3;
                        i22 = i18;
                        dw1Var4 = dw1Var2;
                        j12 = j4;
                        d02Var3 = d02Var;
                    }
                    ob0Var.q();
                    ob0Var.W(-565217490);
                    if (j5 != 16) {
                        j13 = j12;
                        jB = j5;
                    } else {
                        ob0Var.W(-565216717);
                        jB = d02Var3.b();
                        if (jB != 16) {
                            j13 = j12;
                        } else {
                            j13 = j12;
                            jB = ((vl) ob0Var.j(rr.a)).a;
                        }
                        ob0Var.p(false);
                    }
                    ob0Var.p(false);
                    d02 d02Var4 = d02Var3;
                    int i35 = i22 << 6;
                    int i36 = i23;
                    int i37 = i24;
                    wi0.b(str, tv0Var3, d02.e(d02Var4, jB, j10, aa0Var2, j11, dw1Var4 != null ? dw1Var4.a : 0, j13, 16609104), i14, z3, i36, i37, ob0Var, (i10 & 126) | 3072 | (57344 & i35) | 196608 | (i35 & 3670016) | 817889280, 256);
                    d02Var2 = d02Var4;
                    aa0Var3 = aa0Var2;
                    tv0Var2 = tv0Var3;
                    i21 = i14;
                    j6 = j5;
                    j8 = j13;
                    z2 = z3;
                    j9 = j11;
                    i20 = i37;
                    dw1Var3 = dw1Var4;
                    i19 = i36;
                    j7 = j10;
                } else {
                    ob0Var.Q();
                    tv0Var2 = tv0Var;
                    z2 = z;
                    i19 = i2;
                    i20 = i3;
                    d02Var2 = d02Var;
                    aa0Var3 = aa0Var2;
                    i21 = i14;
                    j6 = j5;
                    j7 = j2;
                    j8 = j4;
                    dw1Var3 = dw1Var2;
                    j9 = j3;
                }
                dc1VarR = ob0Var.r();
                if (dc1VarR != null) {
                    dc1VarR.d = new wa0() { // from class: lz1
                        @Override // defpackage.wa0
                        public final Object h(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iV = al.V(i4 | 1);
                            int iV2 = al.V(i5);
                            mz1.b(str, tv0Var2, j6, j7, aa0Var3, j9, dw1Var3, j8, i21, z2, i19, i20, d02Var2, (ob0) obj, iV, iV2, i6);
                            return t32.a;
                        }
                    };
                    return;
                }
                return;
            }
            i32 = i16 | 27648;
            i18 = i32 | 1769472 | (((i6 & 131072) == 0 && ob0Var.f(d02Var)) ? 8388608 : 4194304);
            boolean z32 = true;
            if (ob0Var.N(i10 & 1, ((i10 & 306783379) == 306783378 && (4793491 & i18) == 4793490) ? false : true)) {
            }
            dc1VarR = ob0Var.r();
            if (dc1VarR != null) {
            }
        }
        aa0Var2 = aa0Var;
        int i292 = 12582912 | i27;
        i9 = i6 & 256;
        if (i9 == 0) {
        }
        i10 = i292 | 805306368;
        i11 = i6 & 1024;
        if (i11 == 0) {
        }
        int i302 = i12;
        int i312 = i302 | 48;
        i13 = i6 & 4096;
        if (i13 == 0) {
        }
        int i322 = i16 | 3072;
        i17 = i6 & 16384;
        if (i17 != 0) {
        }
        i18 = i322 | 1769472 | (((i6 & 131072) == 0 && ob0Var.f(d02Var)) ? 8388608 : 4194304);
        boolean z322 = true;
        if (ob0Var.N(i10 & 1, ((i10 & 306783379) == 306783378 && (4793491 & i18) == 4793490) ? false : true)) {
        }
        dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
        }
    }
}
