package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class px extends xs1 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public ox0 e;
    public Object f;
    public int g;

    public px(long j) {
        super(j);
        ox0 ox0Var = r01.a;
        ox0Var.getClass();
        this.e = ox0Var;
        this.f = h;
    }

    @Override // defpackage.xs1
    public final void a(xs1 xs1Var) {
        xs1Var.getClass();
        px pxVar = (px) xs1Var;
        this.e = pxVar.e;
        this.f = pxVar.f;
        this.g = pxVar.g;
    }

    @Override // defpackage.xs1
    public final xs1 b(long j) {
        return new px(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(qx qxVar, sp1 sp1Var) {
        boolean z;
        boolean z2;
        Object obj = aq1.c;
        synchronized (obj) {
            z = true;
            if (this.c == sp1Var.g()) {
                z2 = this.d != sp1Var.h();
            }
        }
        if (this.f == h || (z2 && this.g != d(qxVar, sp1Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = sp1Var.g();
            this.d = sp1Var.h();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[PHI: r11
      0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v10, types: [px] */
    /* JADX WARN: Type inference failed for: r13v5, types: [xs1] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, xs1] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(qx qxVar, sp1 sp1Var) {
        ox0 ox0Var;
        int iIdentityHashCode;
        long[] jArr;
        int i;
        Object[] objArr;
        long[] jArr2;
        ?? r25;
        Object[] objArr2;
        long j;
        long j2;
        int i2;
        ?? r252;
        ?? I;
        synchronized (aq1.c) {
            ox0Var = this.e;
        }
        int i3 = 7;
        if (ox0Var.e == 0) {
            return 7;
        }
        iy0 iy0VarR = xc.r();
        Object[] objArr3 = iy0VarR.e;
        int i4 = iy0VarR.g;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            ((nb0) objArr3[i5]).b();
        }
        try {
            Object[] objArr4 = ox0Var.b;
            int[] iArr = ox0Var.c;
            long[] jArr3 = ox0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i6 = 0;
                while (true) {
                    long j3 = jArr3[i6];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8;
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        i = i3;
                        ?? r3 = z;
                        while (r3 < i8) {
                            if ((j3 & 255) < 128) {
                                int i9 = (i6 << 3) + r3;
                                j2 = j4;
                                vs1 vs1Var = (vs1) objArr4[i9];
                                int i10 = i7;
                                if (iArr[i9] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (vs1Var instanceof qx) {
                                        qx qxVar2 = (qx) vs1Var;
                                        I = qxVar2.g((px) aq1.i(qxVar2.h, sp1Var), sp1Var, z, qxVar2.f);
                                        ox0 ox0Var2 = I.e;
                                        Object[] objArr5 = ox0Var2.b;
                                        long[] jArr4 = ox0Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r252 = r3;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i11 = 0;
                                            while (true) {
                                                long j5 = jArr4[i11];
                                                j = j3;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j5) << i) & j5 & j2) != j2) {
                                                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                    for (int i13 = 0; i13 < i12; i13++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((vs1) objArr5[(i11 << 3) + i13]);
                                                        }
                                                        j5 >>= i10;
                                                    }
                                                    if (i12 != i10) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    j3 = j;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r252 = r3;
                                        objArr2 = objArr4;
                                        j = j3;
                                        I = aq1.i(vs1Var.a(), sp1Var);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(I)) * 31) + Long.hashCode(I.a);
                                    r25 = r252;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i2 = i7;
                            }
                            j3 = j >> i2;
                            i7 = i2;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i8 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i = i3;
                        objArr = objArr4;
                    }
                    if (i6 == length) {
                        i3 = iIdentityHashCode;
                        break;
                    }
                    i6++;
                    i3 = i;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            iIdentityHashCode = i3;
            Object[] objArr6 = iy0VarR.e;
            int i14 = iy0VarR.g;
            for (int i15 = 0; i15 < i14; i15++) {
                ((nb0) objArr6[i15]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = iy0VarR.e;
            int i16 = iy0VarR.g;
            for (int i17 = 0; i17 < i16; i17++) {
                ((nb0) objArr7[i17]).a();
            }
            throw th;
        }
    }
}
