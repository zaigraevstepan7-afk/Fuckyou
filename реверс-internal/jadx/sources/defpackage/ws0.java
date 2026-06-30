package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ws0 extends z61 implements fw0, x31, xu0 {
    public rs0 j;
    public sa0 k;
    public wa0 l;
    public sa0 m;
    public b71 n;
    public zx0 o;
    public boolean p;
    public zx0 q;
    public boolean r;
    public boolean s;
    public final xs0 t = new xs0(0, this);
    public ub u;
    public zx0 v;

    public static void H0(c01 c01Var) {
        rl0 rl0Var;
        c01 c01Var2 = c01Var.x;
        ql0 ql0Var = c01Var.w;
        if (!xi0.o(c01Var2 != null ? c01Var2.w : null, ql0Var)) {
            ql0Var.J.p.B.f();
            return;
        }
        h3 h3VarO = ql0Var.J.p.o();
        if (h3VarO == null || (rl0Var = ((tu0) h3VarO).B) == null) {
            return;
        }
        rl0Var.f();
    }

    public abstract zk0 A0();

    public abstract boolean B0();

    public abstract ql0 C0();

    public abstract vu0 D0();

    public abstract ws0 E0();

    public abstract long F0();

    public final rs0 G0() {
        rs0 rs0Var = this.j;
        if (rs0Var != null) {
            return rs0Var;
        }
        rs0 rs0Var2 = new rs0(this);
        this.j = rs0Var2;
        return rs0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(ay0 ay0Var) {
        ql0 ql0Var;
        Object[] objArr = ay0Var.b;
        long[] jArr = ay0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (ql0Var = (ql0) ((f72) objArr[(i << 3) + i3]).get()) != null) {
                        if (s()) {
                            ql0Var.W(false);
                        } else {
                            ql0Var.Y(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void J0();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0() {
        ub ubVar = this.u;
        if (ubVar != null) {
            int i = ubVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((xd0[]) ubVar.b)[i2] = null;
                ((float[]) ubVar.c)[i2] = Float.NaN;
                ((byte[]) ubVar.d)[i2] = 0;
            }
            ubVar.a = 0;
        }
        zx0 zx0Var = this.v;
        if (zx0Var == null) {
            return;
        }
        Object[] objArr = zx0Var.c;
        long[] jArr = zx0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            I0((ay0) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        zx0Var.a();
    }

    @Override // defpackage.xu0
    public final vu0 V(int i, int i2, g3 g3Var, q qVar, Map map, u3 u3Var) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ng0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new vs0(i, i2, map, g3Var, qVar, u3Var, this);
    }

    @Override // defpackage.z61
    public final int b0(c3 c3Var) {
        int iR0;
        if (!B0() || (iR0 = r0(c3Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = c3Var instanceof x52;
        long j = this.i;
        return iR0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.fw0
    public final void m(boolean z) {
        ws0 ws0VarE0 = E0();
        ql0 ql0VarC0 = ws0VarE0 != null ? ws0VarE0.C0() : null;
        if (xi0.o(ql0VarC0, C0())) {
            this.p = z;
            return;
        }
        if ((ql0VarC0 != null ? ql0VarC0.J.d : null) != ml0.g) {
            if ((ql0VarC0 != null ? ql0VarC0.J.d : null) != ml0.h) {
                return;
            }
        }
        this.p = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(ql0 ql0Var, xd0 xd0Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        zx0 zx0Var = this.v;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (zx0Var != null) {
            Object[] objArr = zx0Var.c;
            long[] jArr3 = zx0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                ay0 ay0Var = (ay0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = ay0Var.b;
                                long[] jArr4 = ay0Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    ql0 ql0Var2 = (ql0) ((f72) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (ql0Var2 != null) {
                                                        boolean zJ = ql0Var2.J();
                                                        i4 = i8;
                                                        if (zJ) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    ay0Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        }
        zx0 zx0Var2 = this.v;
        if (zx0Var2 != null) {
            long[] jArr5 = zx0Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((ay0) zx0Var2.c[i18]).g()) {
                                    zx0Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        zx0 zx0Var3 = this.v;
        if (zx0Var3 == null) {
            zx0Var3 = new zx0();
            this.v = zx0Var3;
        }
        Object objG = zx0Var3.g(xd0Var);
        if (objG == null) {
            objG = new ay0();
            zx0Var3.m(xd0Var, objG);
        }
        ((ay0) objG).k(new f72(ql0Var));
    }

    public abstract int r0(c3 c3Var);

    @Override // defpackage.pi0
    public boolean s() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(b71 b71Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        ql0 ql0Var;
        int i;
        char c2;
        long j6;
        ws0 ws0VarE0;
        y31 snapshotObserver;
        zx0 zx0Var = this.v;
        ub ubVar = this.u;
        if (ubVar == null) {
            ubVar = new ub();
            this.u = ubVar;
        }
        ub ubVar2 = ubVar;
        w31 w31Var = C0().r;
        if (w31Var != null && (snapshotObserver = ((h4) w31Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.c(b71Var, a4.I, new ss0(this, j, j2, b71Var));
        }
        boolean zS = s();
        ay0 ay0Var = (ay0) ubVar2.e;
        ay0 ay0Var2 = (ay0) ubVar2.f;
        int i2 = ubVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) ubVar2.d)[i3];
            if (b == 3) {
                xd0 xd0Var = ((xd0[]) ubVar2.b)[i3];
                xd0Var.getClass();
                ay0Var2.k(xd0Var);
            } else if (b != 0 && zx0Var != null) {
                xd0 xd0Var2 = ((xd0[]) ubVar2.b)[i3];
                xd0Var2.getClass();
                ay0 ay0Var3 = (ay0) zx0Var.k(xd0Var2);
                if (ay0Var3 != null) {
                    ay0Var.j(ay0Var3);
                }
            }
        }
        int i4 = ubVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) ubVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                xd0[] xd0VarArr = (xd0[]) ubVar2.b;
                xd0VarArr[i6 - i5] = xd0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = ubVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((xd0[]) ubVar2.b)[i8] = null;
        }
        ubVar2.a -= i5;
        ws0 ws0VarE02 = E0();
        Object[] objArr = ay0Var2.b;
        long[] jArr = ay0Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            xd0 xd0Var3 = (xd0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            ws0 ws0Var = ws0VarE02 == null ? this : ws0VarE02;
                            i = i9;
                            ws0 ws0Var2 = ws0Var;
                            while (true) {
                                ub ubVar3 = ws0Var2.u;
                                if ((ubVar3 != null && nd.V((xd0[]) ubVar3.b, xd0Var3) >= 0) || (ws0VarE0 = ws0Var2.E0()) == null) {
                                    break;
                                } else {
                                    ws0Var2 = ws0VarE0;
                                }
                            }
                            zx0 zx0Var2 = ws0Var2.v;
                            ay0 ay0Var4 = zx0Var2 != null ? (ay0) zx0Var2.k(xd0Var3) : null;
                            if (ay0Var4 != null) {
                                ws0Var.I0(ay0Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        ay0Var2.b();
        Object[] objArr2 = ay0Var.b;
        long[] jArr2 = ay0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (ql0Var = (ql0) ((f72) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zS) {
                                ql0Var.W(false);
                            } else {
                                ql0Var.Y(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        ay0Var.b();
    }

    @Override // defpackage.xu0
    public final vu0 u(int i, int i2, Map map, sa0 sa0Var) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ng0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new us0(i, i2, map, sa0Var, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(vu0 vu0Var) {
        long j;
        char c;
        long j2;
        long j3;
        rs0 rs0Var;
        zx0 zx0Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        rs0 rs0Var2;
        long j4;
        if (this.s) {
            return;
        }
        sa0 sa0VarE = vu0Var.e();
        wa0 wa0VarC = vu0Var.c();
        sa0 sa0VarF = vu0Var.f();
        long jK = 0;
        if (wa0VarC == null) {
            long jS = 9223372034707292159L;
            if (sa0VarE == null) {
                K0();
                this.k = null;
                this.l = null;
                this.m = null;
                rs0 rs0Var3 = this.j;
                if (rs0Var3 != null) {
                    rs0Var3.e = false;
                }
                if (rs0Var3 != null) {
                    rs0Var3.f = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.l = null;
            this.m = null;
            boolean z2 = this.k != sa0VarE;
            if (!z2 && G0().e) {
                zk0 zk0VarA0 = A0();
                jS = hk.S(zk0VarA0.c(0L));
                jK = zk0VarA0.K();
                z2 = (oh0.a(jS, G0().f) && vh0.a(jK, G0().g)) ? false : true;
            }
            if (z2) {
                b71 b71Var = this.n;
                if (b71Var != null) {
                    b71Var.e = vu0Var;
                } else {
                    b71Var = new b71(vu0Var, this, null);
                    this.n = b71Var;
                }
                t0(b71Var, jS, jK);
                this.k = vu0Var.e();
                return;
            }
            return;
        }
        if (wa0VarC != this.l || sa0VarF != this.m) {
            this.l = wa0VarC;
            this.m = sa0VarF;
            K0();
            return;
        }
        zx0 zx0Var2 = this.q;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (zx0Var2 != null) {
            Object[] objArr3 = zx0Var2.c;
            long[] jArr3 = zx0Var2.a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                rs0Var2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                rs0 rs0Var4 = (rs0) objArr3[(i4 << 3) + i6];
                                if (rs0Var4.e) {
                                    rs0Var2 = rs0Var4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                rs0Var2 = null;
            }
            rs0Var = rs0Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            rs0Var = null;
        }
        if (rs0Var == null) {
            return;
        }
        zk0 zk0VarA02 = A0();
        long jS2 = hk.S(zk0VarA02.c(0L));
        long jK2 = zk0VarA02.K();
        if ((oh0.a(jS2, rs0Var.f) && vh0.a(jK2, rs0Var.g)) || (zx0Var = this.q) == null) {
            return;
        }
        Object[] objArr4 = zx0Var.b;
        Object[] objArr5 = zx0Var.c;
        long[] jArr4 = zx0Var.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        rs0 rs0Var5 = (rs0) objArr5[i11];
                        i2 = i3;
                        xd0 xd0Var = (xd0) obj;
                        jArr2 = jArr4;
                        if (rs0Var5.e) {
                            objArr2 = objArr4;
                            z = (vh0.a(rs0Var5.g, jK2) && oh0.a(rs0Var5.f, jS2)) ? false : true;
                            rs0Var5.g = jK2;
                            rs0Var5.f = jS2;
                            rs0Var5.e = false;
                            if (z) {
                                ub ubVar = this.u;
                                if (ubVar != null) {
                                    ubVar.c(xd0Var);
                                }
                                zx0 zx0Var3 = this.v;
                                ay0 ay0Var = zx0Var3 != null ? (ay0) zx0Var3.g(xd0Var) : null;
                                if (ay0Var != null) {
                                    I0(ay0Var);
                                    ay0Var.b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        rs0Var5.g = jK2;
                        rs0Var5.f = jS2;
                        rs0Var5.e = false;
                        if (z) {
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    public boolean z() {
        return C0().J();
    }

    public abstract ws0 z0();
}
