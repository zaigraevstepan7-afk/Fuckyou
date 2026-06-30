package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k52 implements g52 {
    public final gx0 e;
    public final hx0 f;
    public final int g;
    public final j20 h;
    public int[] i = f52.a;
    public float[] j;
    public cb k;
    public cb l;
    public cb m;
    public cb n;
    public float[] o;
    public float[] p;
    public qt0 q;

    public k52(gx0 gx0Var, hx0 hx0Var, int i, j20 j20Var) {
        this.e = gx0Var;
        this.f = hx0Var;
        this.g = i;
        this.h = j20Var;
        float[] fArr = f52.b;
        this.j = fArr;
        this.o = fArr;
        this.p = fArr;
        this.q = f52.c;
    }

    public final int c(int i) {
        int i2;
        gx0 gx0Var = this.e;
        int i3 = gx0Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            yc.o("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = gx0Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        j20 j20Var;
        float f;
        gx0 gx0Var = this.e;
        if (i >= gx0Var.b - 1) {
            f = i2;
        } else {
            int iC = gx0Var.c(i);
            int iC2 = gx0Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                j52 j52Var = (j52) this.f.b(iC);
                if (j52Var == null || (j20Var = j52Var.b) == null) {
                    j20Var = this.h;
                }
                float f2 = i3;
                float fB = j20Var.b((i2 - iC) / f2);
                return z ? fB : ((f2 * fB) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void e(cb cbVar, cb cbVar2, cb cbVar3) {
        float[] fArr;
        boolean z = this.q != f52.c;
        cb cbVar4 = this.k;
        hx0 hx0Var = this.f;
        gx0 gx0Var = this.e;
        if (cbVar4 == null) {
            this.k = cbVar.c();
            this.l = cbVar3.c();
            int i = gx0Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = gx0Var.c(i2) / 1000.0f;
            }
            this.j = fArr2;
            int i3 = gx0Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.i = iArr;
        }
        if (z) {
            if (this.q != f52.c && xi0.o(this.m, cbVar) && xi0.o(this.n, cbVar2)) {
                return;
            }
            this.m = cbVar;
            this.n = cbVar2;
            int iB = cbVar.b() + (cbVar.b() % 2);
            this.o = new float[iB];
            this.p = new float[iB];
            int i5 = gx0Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = gx0Var.c(i6);
                j52 j52Var = (j52) hx0Var.b(iC);
                if (iC == 0 && j52Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = cbVar.a(i7);
                    }
                } else if (iC == this.g && j52Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = cbVar2.a(i8);
                    }
                } else {
                    j52Var.getClass();
                    cb cbVar5 = j52Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = cbVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.q = new qt0(this.i, this.j, fArr3);
        }
    }

    @Override // defpackage.g52
    public final int k() {
        return 0;
    }

    @Override // defpackage.e52
    public final cb l(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        long j2 = j / 1000000;
        int[] iArr = f52.a;
        long j3 = this.g;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return cbVar3;
        }
        e(cbVar, cbVar2, cbVar3);
        cb cbVar4 = this.l;
        cbVar4.getClass();
        int i = 0;
        if (this.q != f52.c) {
            int i2 = (int) j4;
            float fD = d(c(i2), i2, false);
            float[] fArr = this.p;
            wc[][] wcVarArr = (wc[][]) this.q.f;
            float f = wcVarArr[0][0].a;
            float f2 = wcVarArr[wcVarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (wc[] wcVarArr2 : wcVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    wc wcVar = wcVarArr2[i4];
                    if (f2 <= wcVar.b) {
                        if (wcVar.p) {
                            fArr[i3] = wcVar.q;
                            fArr[i3 + 1] = wcVar.r;
                        } else {
                            wcVar.c(f2);
                            fArr[i3] = wcVar.a();
                            fArr[i3 + 1] = wcVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                cbVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            cb cbVarO = o((j4 - 1) * 1000000, cbVar, cbVar2, cbVar3);
            cb cbVarO2 = o(j4 * 1000000, cbVar, cbVar2, cbVar3);
            int iB = cbVarO.b();
            while (i < iB) {
                cbVar4.e(i, (cbVarO.a(i) - cbVarO2.a(i)) * 1000.0f);
                i++;
            }
        }
        return cbVar4;
    }

    @Override // defpackage.g52
    public final int n() {
        return this.g;
    }

    @Override // defpackage.e52
    public final cb o(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        cb cbVar4;
        cb cbVar5;
        wc[][] wcVarArr;
        cb cbVar6 = cbVar;
        long j2 = j / 1000000;
        int[] iArr = f52.a;
        int i = this.g;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        hx0 hx0Var = this.f;
        j52 j52Var = (j52) hx0Var.b(i2);
        if (j52Var != null) {
            return j52Var.a;
        }
        if (i2 >= i) {
            return cbVar2;
        }
        if (i2 <= 0) {
            return cbVar6;
        }
        e(cbVar6, cbVar2, cbVar3);
        cb cbVar7 = this.k;
        cbVar7.getClass();
        int i3 = 0;
        if (this.q != f52.c) {
            float fD = d(c(i2), i2, false);
            float[] fArr = this.o;
            wc[][] wcVarArr2 = (wc[][]) this.q.f;
            int length = wcVarArr2.length - 1;
            float f = wcVarArr2[0][0].a;
            float f2 = wcVarArr2[length][0].b;
            int length2 = fArr.length;
            if (fD < f || fD > f2) {
                if (fD > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fD - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    wc wcVar = wcVarArr2[length][i5];
                    boolean z = wcVar.p;
                    float f4 = wcVar.r;
                    float f5 = wcVar.q;
                    if (z) {
                        float f6 = wcVar.a;
                        float f7 = wcVar.k;
                        float f8 = wcVar.c;
                        wcVarArr = wcVarArr2;
                        fArr[i4] = (f5 * f3) + ((wcVar.e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = wcVar.d;
                        fArr[i4 + 1] = (f4 * f3) + ((wcVar.f - f10) * f9) + f10;
                    } else {
                        wcVarArr = wcVarArr2;
                        wcVar.c(f);
                        fArr[i4] = (wcVar.a() * f3) + (wcVar.n * wcVar.h) + f5;
                        fArr[i4 + 1] = (wcVar.b() * f3) + (wcVar.o * wcVar.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    wcVarArr2 = wcVarArr;
                }
            } else {
                int length3 = wcVarArr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        wc wcVar2 = wcVarArr2[i6][i8];
                        if (fD <= wcVar2.b) {
                            if (wcVar2.p) {
                                float f11 = wcVar2.a;
                                float f12 = wcVar2.k;
                                float f13 = wcVar2.c;
                                fArr[i7] = ((wcVar2.e - f13) * (fD - f11) * f12) + f13;
                                float f14 = wcVar2.d;
                                fArr[i7 + 1] = ((wcVar2.f - f14) * (fD - f11) * f12) + f14;
                            } else {
                                wcVar2.c(fD);
                                fArr[i7] = (wcVar2.n * wcVar2.h) + wcVar2.q;
                                fArr[i7 + 1] = (wcVar2.o * wcVar2.i) + wcVar2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                cbVar7.e(i9, fArr[i9]);
            }
        } else {
            int iC = c(i2);
            float fD2 = d(iC, i2, true);
            gx0 gx0Var = this.e;
            j52 j52Var2 = (j52) hx0Var.b(gx0Var.c(iC));
            if (j52Var2 != null && (cbVar5 = j52Var2.a) != null) {
                cbVar6 = cbVar5;
            }
            j52 j52Var3 = (j52) hx0Var.b(gx0Var.c(iC + 1));
            if (j52Var3 == null || (cbVar4 = j52Var3.a) == null) {
                cbVar4 = cbVar2;
            }
            int iB = cbVar7.b();
            for (int i10 = 0; i10 < iB; i10++) {
                cbVar7.e(i10, (cbVar4.a(i10) * fD2) + ((1.0f - fD2) * cbVar6.a(i10)));
            }
        }
        return cbVar7;
    }
}
