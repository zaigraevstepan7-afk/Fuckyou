package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ce1 implements hx, up {
    public float e;
    public xt1 f;
    public yt1 g;
    public yt1 h;
    public yt1 i;
    public yt1 j;
    public hx0 k;
    public hx0 l;
    public hx0 m;
    public long n;
    public int o;
    public wa p;
    public wa q;
    public n81 r;

    @Override // defpackage.up
    public final Object B(nb1 nb1Var) {
        xt1 xt1Var = this.f;
        xt1Var.getClass();
        return hk.o(xt1Var, nb1Var);
    }

    public final void a(long j) {
        hx0 hx0Var;
        wa waVar = this.p;
        wa waVar2 = this.q;
        wa waVar3 = null;
        i42 i42Var = i42.a;
        if (waVar == i42Var) {
            if ((this.n & 17179869184L) != 0) {
                hx0 hx0Var2 = this.k;
                if (hx0Var2 == null || (waVar = (wa) hx0Var2.b(34)) == null) {
                    waVar = de1.a;
                }
            } else {
                waVar = null;
            }
        }
        if (waVar2 == i42Var) {
            if ((this.n & 17179869184L) != 0) {
                hx0 hx0Var3 = this.l;
                if (hx0Var3 == null || (waVar2 = (wa) hx0Var3.b(34)) == null) {
                    waVar2 = de1.a;
                }
            } else {
                waVar2 = null;
            }
        }
        this.n = (waVar == null || waVar2 == null) ? this.n & (-17179869185L) : 17179869184L | this.n;
        f(34, waVar, waVar2);
        wa waVar4 = this.p;
        wa waVar5 = this.q;
        if (waVar4 == i42Var) {
            if ((this.o & 2) != 0) {
                hx0 hx0Var4 = this.k;
                if (hx0Var4 == null || (waVar4 = (wa) hx0Var4.b(51)) == null) {
                    waVar4 = de1.a;
                }
            } else {
                waVar4 = null;
            }
        }
        if (waVar5 != i42Var) {
            waVar3 = waVar5;
        } else if ((this.o & 2) != 0 && ((hx0Var = this.l) == null || (waVar3 = (wa) hx0Var.b(51)) == null)) {
            waVar3 = de1.a;
        }
        this.o = (waVar4 == null || waVar3 == null) ? this.o & (-3) : this.o | 2;
        f(51, waVar4, waVar3);
        yt1 yt1Var = this.g;
        if (yt1Var != null) {
            yt1Var.b(j);
        }
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        yt1 yt1Var;
        long j;
        long j2;
        boolean z;
        wa waVar;
        long j3;
        int i;
        boolean z2;
        xt1 xt1Var = this.f;
        xt1Var.getClass();
        this.f = null;
        n81 n81Var = this.r;
        if (n81Var != null) {
            synchronized (n81Var.b) {
                z2 = ((hx0) n81Var.c).e == 0;
            }
            if (z2) {
                if (this.n == 0 && this.o == 0) {
                    return;
                }
            }
        }
        yt1 yt1Var2 = this.g;
        if (yt1Var2 == null || (yt1Var = this.h) == null) {
            return;
        }
        int iH = zt1.h(this.o, this.n);
        long jI = zt1.i(this.o, this.n);
        int iG = yt1Var.g(iH, yt1Var2);
        long jH = yt1Var.h(yt1Var2, jI);
        if (jH == 0 && iG == 0) {
            return;
        }
        n81 n81Var2 = this.r;
        if (n81Var2 == null) {
            n81Var2 = new n81(6);
            this.r = n81Var2;
        }
        long jH2 = (((long) zt1.h(iG, jH)) << 50) | ((-257698037761L) & jH);
        long j4 = (((long) iH) << 50) | jI;
        hx0 hx0Var = this.k;
        hx0 hx0Var2 = this.l;
        hx0 hx0Var3 = this.m;
        synchronized (n81Var2.b) {
            try {
                hx0 hx0Var4 = (hx0) n81Var2.c;
                int[] iArr = hx0Var4.b;
                Object[] objArr = hx0Var4.c;
                long[] jArr = hx0Var4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j5 = jArr[i2];
                        j = jH2;
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j5 & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    int i6 = iArr[i5];
                                    j3 = j5;
                                    nt1 nt1Var = (nt1) objArr[i5];
                                    int iOrdinal = nt1Var.c.ordinal();
                                    i = i4;
                                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                                        nt1Var.c = ot1.e;
                                    }
                                } else {
                                    j3 = j5;
                                    i = i4;
                                }
                                j5 = j3 >> 8;
                                i4 = i + 1;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                            jH2 = j;
                        }
                    }
                } else {
                    j = jH2;
                }
                j2 = 0;
                if (j4 != 0) {
                    long j6 = j4;
                    while (j6 != 0) {
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
                        if (hx0Var == null || (waVar = (wa) hx0Var.b(iNumberOfTrailingZeros)) == null) {
                            waVar = hx0Var3 != null ? (wa) hx0Var3.b(iNumberOfTrailingZeros) : null;
                            if (waVar == null) {
                                waVar = hx0Var2 != null ? (wa) hx0Var2.b(iNumberOfTrailingZeros) : null;
                                if (waVar == null) {
                                    waVar = de1.a;
                                }
                            }
                        }
                        long j7 = 1 << iNumberOfTrailingZeros;
                        boolean z3 = (j & j7) != 0;
                        long j8 = j6;
                        hx0 hx0Var5 = (hx0) n81Var2.c;
                        nt1 nt1Var2 = (nt1) hx0Var5.b(iNumberOfTrailingZeros);
                        if (nt1Var2 != null) {
                            if (!z3 && xi0.o(nt1Var2.a, waVar)) {
                                nt1Var2.c = ot1.f;
                                j6 = j8 ^ j7;
                            }
                            nt1Var2.a = waVar;
                            nt1Var2.c = ot1.g;
                        } else if (z3) {
                            hx0Var5.i(iNumberOfTrailingZeros, new nt1(n81Var2, waVar));
                        }
                        j2 |= j7;
                        j6 = j8 ^ j7;
                    }
                }
                n81Var2.m(xt1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j2 != 0) {
            yt1 yt1Var3 = this.j;
            if (yt1Var3 == null) {
                yt1Var3 = new yt1();
                this.j = yt1Var3;
            }
            long j9 = 2251799813685247L & j2;
            int i7 = (int) (j2 >> 50);
            long jI2 = zt1.i(i7, j9);
            int iH2 = zt1.h(i7, j9);
            yt1Var.f(yt1Var3, jI2, iH2);
            yt1 yt1Var4 = this.i;
            if (yt1Var4 != null) {
                yt1Var4.f(yt1Var3, jI2, iH2);
            }
            this.i = null;
        }
        synchronized (n81Var2.b) {
            z = ((hx0) n81Var2.c).e == 0;
        }
        if (z) {
            this.r = null;
        }
    }

    public final int e() {
        int i;
        n81 n81Var = this.r;
        int i2 = 0;
        if (n81Var == null) {
            return 0;
        }
        hx0 hx0Var = (hx0) n81Var.c;
        int[] iArr = hx0Var.b;
        Object[] objArr = hx0Var.c;
        long[] jArr = hx0Var.a;
        int length = jArr.length - 2;
        long j = 0;
        if (length >= 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            if (i7 < 50) {
                                j |= 1 << ((byte) i7);
                            } else {
                                i |= 1 << (i7 - 50);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    i2 = i;
                    break;
                }
                i3++;
            }
            i = i2;
        } else {
            i = i2;
        }
        return zt1.e(i) | zt1.g(j);
    }

    public final void f(int i, wa waVar, wa waVar2) {
        if (waVar == null || waVar.equals(de1.a)) {
            hx0 hx0Var = this.k;
            if (hx0Var != null) {
            }
        } else {
            hx0 hx0Var2 = this.k;
            if (hx0Var2 == null) {
                hx0 hx0Var3 = nh0.a;
                hx0Var2 = new hx0();
                this.k = hx0Var2;
            }
            hx0Var2.i(i, waVar);
        }
        if (waVar2 != null && !waVar2.equals(de1.a)) {
            hx0 hx0Var4 = this.l;
            if (hx0Var4 == null) {
                hx0 hx0Var5 = nh0.a;
                hx0Var4 = new hx0();
                this.l = hx0Var4;
            }
            hx0Var4.i(i, waVar2);
            return;
        }
        hx0 hx0Var6 = this.l;
        if (hx0Var6 != null) {
            wa waVar3 = (wa) hx0Var6.b(i);
            hx0Var6.g(i);
            if (waVar3 != null) {
                hx0 hx0Var7 = this.m;
                if (hx0Var7 == null) {
                    hx0 hx0Var8 = nh0.a;
                    hx0Var7 = new hx0();
                    this.m = hx0Var7;
                }
                hx0Var7.i(i, waVar3);
            }
        }
    }

    public final void g(int i, yt1 yt1Var) {
        boolean z;
        yt1 yt1Var2 = this.g;
        if (yt1Var2 == null) {
            yt1Var2 = zt1.n;
        }
        yt1 yt1Var3 = yt1Var2;
        yt1Var3.e(yt1Var);
        n81 n81Var = this.r;
        if (n81Var == null) {
            return;
        }
        yt1 yt1Var4 = this.j;
        if (yt1Var4 == null && (yt1Var4 = this.h) == null) {
            return;
        }
        yt1 yt1Var5 = yt1Var4;
        synchronized (n81Var.b) {
            z = ((hx0) n81Var.c).e == 0;
        }
        if (z) {
            this.j = null;
            this.r = null;
            return;
        }
        int i2 = i & 1;
        int i3 = i & 8;
        int i4 = i & 2;
        int i5 = i & 4;
        int i6 = i & 32;
        int i7 = i & 16;
        long j = (i2 != 0 ? zt1.b : 0L) | (i3 != 0 ? zt1.c : 0L) | (i4 != 0 ? zt1.d : 0L) | (i5 != 0 ? zt1.e : 0L) | (i6 != 0 ? zt1.f : 0L) | (i7 != 0 ? zt1.g : 0L);
        int i8 = (i2 != 0 ? zt1.h : 0) | (i3 != 0 ? zt1.i : 0) | (i4 != 0 ? zt1.j : 0) | (i5 != 0 ? zt1.k : 0) | (i6 != 0 ? zt1.l : 0);
        int i9 = i7 != 0 ? zt1.m : 0;
        long j2 = n81Var.j();
        int i10 = (int) (j2 >> 50);
        long jI = zt1.i(i10, 2251799813685247L & j2) & j;
        int iH = zt1.h(i10, jI) & (i8 | i9);
        if (jI == 0 && iH == 0) {
            return;
        }
        zt1.a(yt1Var5, yt1Var3, n81Var, jI, iH, yt1Var);
    }

    @Override // defpackage.hx
    public final float l() {
        return 1.0f;
    }
}
