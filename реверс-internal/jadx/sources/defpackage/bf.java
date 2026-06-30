package defpackage;

import android.graphics.Path;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ sx f;

    public /* synthetic */ bf(sx sxVar, int i) {
        this.e = i;
        this.f = sxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) throws Throwable {
        sx sxVar;
        sl0 sl0Var;
        float f;
        ej ejVar;
        float f2;
        float fMax;
        float f3;
        float f4;
        float f5;
        int i;
        boolean z;
        float f6;
        float f7;
        float f8;
        float f9;
        long j;
        sx sxVar2;
        sl0 sl0Var2;
        jr1 jr1Var;
        int i2 = this.e;
        t32 t32Var = t32.a;
        int i3 = 0;
        sx sxVar3 = this.f;
        int i4 = 1;
        ks ksVar = null;
        switch (i2) {
            case 0:
                sxVar3.B.h(((Number) ((h9) obj).d()).floatValue() % 1.0f);
                return t32Var;
            case 1:
                sl0 sl0Var3 = (sl0) obj;
                h9 h9Var = sxVar3.D;
                rp0 rp0Var = sxVar3.F;
                float fFloatValue = h9Var != null ? ((Number) h9Var.d()).floatValue() : 0.0f;
                ej ejVar2 = sl0Var3.e;
                ej ejVar3 = sl0Var3.e;
                long jD = ejVar2.d();
                float fY = sl0Var3.y(sxVar3.z);
                float[] fArrO0 = sxVar3.O0();
                float fG = fFloatValue > 0.0f ? sxVar3.B.g() : 0.0f;
                float fY2 = sl0Var3.y(sxVar3.y);
                kt1 kt1Var = sxVar3.w;
                kt1 kt1Var2 = sxVar3.x;
                x6 x6Var = rp0Var.k;
                w6 w6Var = rp0Var.l;
                if (rp0Var.d == null) {
                    rp0Var.d = new float[fArrO0.length];
                    int length = fArrO0.length / 2;
                    sl0Var = sl0Var3;
                    w6[] w6VarArr = new w6[length];
                    sxVar = sxVar3;
                    for (int i5 = 0; i5 < length; i5++) {
                        w6VarArr[i5] = y6.a();
                    }
                    rp0Var.m = w6VarArr;
                } else {
                    sxVar = sxVar3;
                    sl0Var = sl0Var3;
                }
                w6 w6Var2 = rp0Var.j;
                float f10 = fG;
                if (io1.a(rp0Var.c, jD) && rp0Var.a == fY && xi0.o(rp0Var.g, kt1Var) && xi0.o(rp0Var.h, kt1Var2) && rp0Var.e == fY2) {
                    float f11 = rp0Var.b;
                    if ((f11 != 0.0f && fFloatValue != 0.0f) || (f11 == 0.0f && fFloatValue == 0.0f)) {
                        ejVar = ejVar3;
                        f3 = f10;
                        f4 = fFloatValue;
                        i = 0;
                        z = false;
                        f = 2.0f;
                    }
                } else {
                    f = 2.0f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jD & 4294967295L));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD >> 32));
                    int i6 = kt1Var.c;
                    ejVar = ejVar3;
                    float f12 = kt1Var.a;
                    if (!(i6 == 0 && kt1Var2.c == 0) && fIntBitsToFloat <= fIntBitsToFloat2) {
                        f2 = f12;
                        fMax = Math.max(f12 / 2.0f, kt1Var2.a / 2.0f);
                    } else {
                        f2 = f12;
                        fMax = 0.0f;
                    }
                    rp0Var.n = fMax;
                    w6Var2.h();
                    Path path = w6Var2.a;
                    path.moveTo(0.0f, 0.0f);
                    if (fFloatValue == 0.0f) {
                        w6Var2.e(fIntBitsToFloat2, 0.0f);
                        f3 = f10;
                        f4 = fFloatValue;
                        f5 = 0.0f;
                    } else {
                        float f13 = fY / 2.0f;
                        float f14 = (fY * 2.0f) + fIntBitsToFloat2;
                        float f15 = f13;
                        float f16 = fIntBitsToFloat - f2;
                        f3 = f10;
                        float f17 = f13 / 2.0f;
                        while (f15 <= f14) {
                            path.quadTo(f17, f16, f15, 0.0f);
                            f15 += f13;
                            f17 += f13;
                            f16 *= -1.0f;
                            fFloatValue = fFloatValue;
                        }
                        f4 = fFloatValue;
                        f5 = 0.0f;
                    }
                    w6Var2.j((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / 2.0f)) & 4294967295L));
                    i = 0;
                    x6Var.a.setPath(w6Var2 != null ? w6Var2.a : null, false);
                    float length2 = x6Var.a.getLength();
                    pc1 pc1VarD = w6Var2.d();
                    rp0Var.i = length2 / ((pc1VarD.c - pc1VarD.a) + 1.0E-8f);
                    rp0Var.c = jD;
                    rp0Var.a = fY;
                    rp0Var.g = kt1Var;
                    rp0Var.h = kt1Var2;
                    rp0Var.e = fY2;
                    z = true;
                }
                if (io1.a(rp0Var.c, 9205357640488583168L)) {
                    yc.p("updateDrawPaths was called before updateFullPaths");
                } else {
                    w6[] w6VarArr2 = rp0Var.m;
                    w6VarArr2.getClass();
                    if (w6VarArr2.length == fArrO0.length / 2) {
                        if (!z && Arrays.equals(rp0Var.d, fArrO0) && rp0Var.b == f4 && rp0Var.f == f3) {
                            f6 = 0.0f;
                        } else {
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (rp0Var.c >> 32));
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (rp0Var.c & 4294967295L)) / f;
                            float fMin = rp0Var.e;
                            float f18 = fIntBitsToFloat3 - rp0Var.n;
                            w6Var.h();
                            Path path2 = w6Var.a;
                            path2.moveTo(f18, fIntBitsToFloat4);
                            w6[] w6VarArr3 = rp0Var.m;
                            w6VarArr3.getClass();
                            int length3 = w6VarArr3.length;
                            int i7 = i;
                            int i8 = i7;
                            while (i7 < length3) {
                                w6[] w6VarArr4 = rp0Var.m;
                                w6VarArr4.getClass();
                                w6VarArr4[i7].h();
                                int i9 = i7 * 2;
                                float f19 = fArrO0[i9];
                                float f20 = fArrO0[i9 + 1];
                                float f21 = f19 * fIntBitsToFloat3;
                                float f22 = f20 * fIntBitsToFloat3;
                                if (i7 == 0) {
                                    float f23 = rp0Var.n;
                                    fMin = f22 < f23 ? 0.0f : Math.min(f22 - f23, rp0Var.e);
                                    i8 = f22 >= rp0Var.n ? 1 : i;
                                }
                                float f24 = rp0Var.n;
                                float f25 = fIntBitsToFloat3 - f24;
                                float f26 = f22 < f24 ? f24 : f22;
                                if (f26 > f25) {
                                    f26 = f25;
                                }
                                if (f21 >= f24) {
                                    f24 = f21;
                                }
                                if (f24 <= f25) {
                                    f25 = f24;
                                }
                                if (Math.abs(f20 - f19) > 0.0f) {
                                    float f27 = f4 == 0.0f ? 0.0f : rp0Var.a * f3;
                                    float f28 = rp0Var.i;
                                    f8 = fIntBitsToFloat3;
                                    w6[] w6VarArr5 = rp0Var.m;
                                    w6VarArr5.getClass();
                                    x6Var.a((f25 + f27) * f28, f28 * (f26 + f27), w6VarArr5[i7]);
                                    w6[] w6VarArr6 = rp0Var.m;
                                    w6VarArr6.getClass();
                                    w6 w6Var3 = w6VarArr6[i7];
                                    float[] fArrA = ou0.a();
                                    ou0.i(fArrA, f27 > 0.0f ? -f27 : 0.0f, (1.0f - f4) * fIntBitsToFloat4);
                                    if (f4 == 1.0f) {
                                        f7 = fMin;
                                        f9 = f4;
                                    } else {
                                        f7 = fMin;
                                        f9 = f4;
                                        ou0.g(fArrA, 0.0f, f9, 5);
                                    }
                                    w6Var3.i(fArrA);
                                } else {
                                    f7 = fMin;
                                    f8 = fIntBitsToFloat3;
                                    f9 = f4;
                                }
                                float f29 = i8 != 0 ? (rp0Var.n * f) + f7 : f7;
                                float f30 = f26 + f29;
                                if (f18 > f30) {
                                    w6Var.e(Math.max(rp0Var.n, f30), fIntBitsToFloat4);
                                }
                                if (f22 > f21) {
                                    float fMax2 = Math.max(rp0Var.n, f25 - f29);
                                    path2.moveTo(fMax2, fIntBitsToFloat4);
                                    f18 = fMax2;
                                }
                                i7++;
                                fIntBitsToFloat3 = f8;
                                f4 = f9;
                                fMin = f7;
                                i = 0;
                            }
                            float f31 = f4;
                            f6 = 0.0f;
                            float f32 = rp0Var.n;
                            if (f18 > f32) {
                                w6Var.e(f32, fIntBitsToFloat4);
                            }
                            float[] fArr = rp0Var.d;
                            fArr.getClass();
                            nd.O(fArrO0, fArr, 14);
                            rp0Var.b = f31;
                            rp0Var.f = f3;
                        }
                        float f33 = sl0Var.getLayoutDirection() == al0.e ? f6 : 180.0f;
                        long jS = ejVar.S();
                        ej ejVar4 = ejVar;
                        oc ocVar = ejVar4.f;
                        long jQ = ocVar.q();
                        ocVar.i().l();
                        try {
                            ((qt0) ocVar.a).w(f33, jS);
                            sxVar2 = sxVar;
                            sl0Var2 = sl0Var;
                            p10.l0(sl0Var2, w6Var, sxVar2.v, sxVar2.x, 52);
                            w6[] w6VarArr7 = rp0Var.m;
                            if (w6VarArr7 != null) {
                                for (w6 w6Var4 : w6VarArr7) {
                                    p10.l0(sl0Var2, w6Var4, sxVar2.u, sxVar2.w, 52);
                                }
                            }
                            j = jQ;
                        } catch (Throwable th) {
                            th = th;
                            j = jQ;
                        }
                        try {
                            nu0.i(sl0Var2, sxVar2.O0()[1], ejVar4.d(), sxVar2.I, rp0Var.n, sxVar2.x, sxVar2.u);
                            s91.r(ocVar, j);
                            return t32Var;
                        } catch (Throwable th2) {
                            th = th2;
                            s91.r(ocVar, j);
                            throw th;
                        }
                    }
                    int length4 = fArrO0.length / 2;
                    w6[] w6VarArr8 = rp0Var.m;
                    w6VarArr8.getClass();
                    yc.e(s91.k("the given progress fraction pairs do not match the expected number of progress paths to draw. updateDrawPaths called with ", length4, " pairs, while there are ", w6VarArr8.length, " expected progress paths."));
                }
                return null;
            default:
                li liVar = (li) obj;
                float fFloatValue2 = ((Number) sxVar3.G.a()).floatValue();
                if (fFloatValue2 < 0.0f) {
                    fFloatValue2 = 0.0f;
                }
                if (fFloatValue2 > 1.0f) {
                    fFloatValue2 = 1.0f;
                }
                float fFloatValue3 = ((Number) sxVar3.H.i(Float.valueOf(fFloatValue2))).floatValue();
                float f34 = fFloatValue3 >= 0.0f ? fFloatValue3 : 0.0f;
                float f35 = f34 <= 1.0f ? f34 : 1.0f;
                h9 h9VarA = sxVar3.D;
                if (h9VarA == null) {
                    h9VarA = xi0.a(f35);
                    sxVar3.D = h9VarA;
                }
                if (sxVar3.r && ((Number) h9VarA.e.getValue()).floatValue() != f35 && ((jr1Var = sxVar3.E) == null || (!(jr1Var.P() instanceof if0)))) {
                    sxVar3.E = nu0.A(sxVar3.z0(), null, null, new af(h9VarA, f35, ksVar, i3), 3);
                }
                return liVar.a(new bf(sxVar3, i4));
        }
    }
}
