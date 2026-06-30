package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zj1 {
    public final /* synthetic */ bk1 a;

    public zj1(bk1 bk1Var) {
        this.a = bk1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141 A[PHI: r8
      0x0141: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:77:0x016f, B:66:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fH;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        boolean z;
        boolean zF;
        boolean z2;
        int i3;
        boolean z3;
        bk1 bk1Var = this.a;
        bk1Var.j = i;
        v5 v5Var = bk1Var.b;
        if (v5Var == null || !bk1Var.b()) {
            return bk1Var.d(bk1Var.k, j, i);
        }
        int i4 = bk1Var.j;
        n nVar = bk1Var.m;
        n20 n20Var = v5Var.c;
        if (io1.c(v5Var.g)) {
            bk1 bk1Var2 = (bk1) nVar.f;
            return new w01(bk1Var2.d(bk1Var2.k, j, bk1Var2.j)).a;
        }
        if (!v5Var.f) {
            if (n20.g(n20Var.f)) {
                v5Var.g(0L);
            }
            if (n20.g(n20Var.g)) {
                v5Var.h(0L);
            }
            if (n20.g(n20Var.d)) {
                v5Var.i(0L);
            }
            if (n20.g(n20Var.e)) {
                v5Var.f(0L);
            }
            v5Var.f = true;
        }
        int i5 = o6.a;
        float f = i4 == 2 ? 4.0f : 1.0f;
        long jF = w01.f(f, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!n20.g(n20Var.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (n20.g(n20Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float f2 = v5Var.f(jF);
                    if (!n20.g(n20Var.e)) {
                        n20Var.b().finish();
                    }
                    fIntBitsToFloat = f2 == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : f2 / f;
                }
            } else {
                float fI = v5Var.i(jF);
                j2 = 4294967295L;
                if (!n20.g(n20Var.d)) {
                    n20Var.e().finish();
                }
                fIntBitsToFloat = fI == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : fI / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (n20.g(n20Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                    fH = v5Var.g(jF);
                    if (!n20.g(n20Var.f)) {
                        n20Var.c().finish();
                    }
                    if (fH == Float.intBitsToFloat((int) (jF >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                } else if (!n20.g(n20Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fH = v5Var.h(jF);
                    if (!n20.g(n20Var.g)) {
                        n20Var.d().finish();
                    }
                    fIntBitsToFloat2 = fH == Float.intBitsToFloat((int) (jF >> 32)) ? Float.intBitsToFloat(i2) : fH / f;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!w01.b(jFloatToRawIntBits, 0L)) {
                v5Var.d();
            }
            jD = w01.d(j, jFloatToRawIntBits);
            bk1 bk1Var3 = (bk1) nVar.f;
            long j3 = new w01(bk1Var3.d(bk1Var3.k, jD, bk1Var3.j)).a;
            long jD2 = w01.d(jD, j3);
            if ((Float.intBitsToFloat((int) (jD >> 32)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (n20.g(n20Var.f) || n20.g(n20Var.d) || n20.g(n20Var.g) || n20.g(n20Var.e)))) {
                v5Var.a();
            }
            if (i4 != 1) {
                int i7 = (int) (jD2 >> 32);
                if (Float.intBitsToFloat(i7) > 0.5f) {
                    v5Var.g(jD2);
                } else if (Float.intBitsToFloat(i7) < -0.5f) {
                    v5Var.h(jD2);
                } else {
                    z2 = false;
                    i3 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i3) <= 0.5f) {
                        v5Var.i(jD2);
                    } else if (Float.intBitsToFloat(i3) < -0.5f) {
                        v5Var.f(jD2);
                    } else {
                        z3 = false;
                        z = !z2 || z3;
                    }
                    z3 = true;
                    if (z2) {
                    }
                }
                z2 = true;
                i3 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i3) <= 0.5f) {
                }
                z3 = true;
                if (z2) {
                }
            }
            if (!w01.b(jD, 0L)) {
                if (!n20.f(n20Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = n20Var.c();
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof ic0) {
                        ic0 ic0Var = (ic0) edgeEffectC;
                        float f3 = ic0Var.b + fIntBitsToFloat3;
                        ic0Var.b = f3;
                        if (Math.abs(f3) > ic0Var.a) {
                            ic0Var.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = n20.f(n20Var.f);
                }
                if (n20.f(n20Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    EdgeEffect edgeEffectD = n20Var.d();
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof ic0) {
                        ic0 ic0Var2 = (ic0) edgeEffectD;
                        float f4 = ic0Var2.b + fIntBitsToFloat4;
                        ic0Var2.b = f4;
                        if (Math.abs(f4) > ic0Var2.a) {
                            ic0Var2.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    zF = zF || n20.f(n20Var.g);
                }
                if (n20.f(n20Var.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    EdgeEffect edgeEffectE = n20Var.e();
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof ic0) {
                        ic0 ic0Var3 = (ic0) edgeEffectE;
                        float f5 = ic0Var3.b + fIntBitsToFloat5;
                        ic0Var3.b = f5;
                        if (Math.abs(f5) > ic0Var3.a) {
                            ic0Var3.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    zF = zF || n20.f(n20Var.d);
                }
                if (n20.f(n20Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    EdgeEffect edgeEffectB = n20Var.b();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof ic0) {
                        ic0 ic0Var4 = (ic0) edgeEffectB;
                        float f6 = ic0Var4.b + fIntBitsToFloat6;
                        ic0Var4.b = f6;
                        if (Math.abs(f6) > ic0Var4.a) {
                            ic0Var4.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    zF = zF || n20.f(n20Var.e);
                }
                z = zF || z;
            }
            if (z) {
                v5Var.d();
            }
            return w01.e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!w01.b(jFloatToRawIntBits, 0L)) {
        }
        jD = w01.d(j, jFloatToRawIntBits);
        bk1 bk1Var32 = (bk1) nVar.f;
        long j32 = new w01(bk1Var32.d(bk1Var32.k, jD, bk1Var32.j)).a;
        long jD22 = w01.d(jD, j32);
        if (Float.intBitsToFloat((int) (jD >> 32)) == 0.0f) {
            v5Var.a();
        } else {
            v5Var.a();
        }
        if (i4 != 1) {
        }
        if (!w01.b(jD, 0L)) {
        }
        if (z) {
        }
        return w01.e(jFloatToRawIntBits, j32);
    }
}
