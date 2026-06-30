package p009F;

import android.graphics.Path;
import android.util.Log;
import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: F.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0079f {

    /* JADX INFO: renamed from: a */
    public char f243a;

    /* JADX INFO: renamed from: b */
    public final float[] f244b;

    public C0079f(char c2, float[] fArr) {
        this.f243a = c2;
        this.f244b = fArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m363a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3) {
        double d2;
        double d3;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d4 = f;
        double d5 = f2;
        double d6 = f5;
        double d7 = ((d5 * dSin) + (d4 * dCos)) / d6;
        double d8 = f6;
        double d9 = ((d5 * dCos) + (((double) (-f)) * dSin)) / d8;
        double d10 = f4;
        double d11 = ((d10 * dSin) + (((double) f3) * dCos)) / d6;
        double d12 = ((d10 * dCos) + (((double) (-f3)) * dSin)) / d8;
        double d13 = d7 - d11;
        double d14 = d9 - d12;
        double d15 = (d7 + d11) / 2.0d;
        double d16 = (d9 + d12) / 2.0d;
        double d17 = (d14 * d14) + (d13 * d13);
        if (d17 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d18 = (1.0d / d17) - 0.25d;
        if (d18 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d17);
            float fSqrt = (float) (Math.sqrt(d17) / 1.99999d);
            m363a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z2, z3);
            return;
        }
        double dSqrt = Math.sqrt(d18);
        double d19 = dSqrt * d13;
        double d20 = dSqrt * d14;
        if (z2 == z3) {
            d2 = d15 - d20;
            d3 = d16 + d19;
        } else {
            d2 = d15 + d20;
            d3 = d16 - d19;
        }
        double dAtan2 = Math.atan2(d9 - d3, d7 - d2);
        double dAtan22 = Math.atan2(d12 - d3, d11 - d2) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d21 = d2 * d6;
        double d22 = d3 * d8;
        double d23 = (d21 * dCos) - (d22 * dSin);
        double d24 = (d22 * dCos) + (d21 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d25 = d5;
        double d26 = -d6;
        double d27 = d26 * dCos2;
        double d28 = d8 * dSin2;
        double d29 = (d27 * dSin3) - (d28 * dCos3);
        double d30 = d26 * dSin2;
        double d31 = d8 * dCos2;
        double d32 = (dCos3 * d31) + (dSin3 * d30);
        double d33 = dAtan22 / ((double) iCeil);
        double d34 = dAtan2;
        int i2 = 0;
        while (i2 < iCeil) {
            double d35 = d34 + d33;
            double dSin4 = Math.sin(d35);
            double dCos4 = Math.cos(d35);
            int i3 = iCeil;
            double d36 = (((d6 * dCos2) * dCos4) + d23) - (d28 * dSin4);
            double d37 = d30;
            double d38 = (d31 * dSin4) + (d6 * dSin2 * dCos4) + d24;
            double d39 = (d27 * dSin4) - (d28 * dCos4);
            double d40 = (dCos4 * d31) + (dSin4 * d37);
            double d41 = d35 - d34;
            double dTan = Math.tan(d41 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d41)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d29 * dSqrt2) + d4), (float) ((d32 * dSqrt2) + d25), (float) (d36 - (dSqrt2 * d39)), (float) (d38 - (dSqrt2 * d40)), (float) d36, (float) d38);
            i2++;
            d4 = d36;
            d25 = d38;
            d23 = d23;
            d34 = d35;
            dCos2 = dCos2;
            d32 = d40;
            d29 = d39;
            iCeil = i3;
            d33 = d33;
            d30 = d37;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m364b(C0079f[] c0079fArr, Path path) {
        int i2;
        int i3;
        C0079f c0079f;
        int i4;
        char c2;
        float f;
        float f2;
        float f3;
        float f4;
        C0079f c0079f2;
        boolean z2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = c0079fArr.length;
        char c3 = 'm';
        char c4 = 0;
        char c5 = 'm';
        int i5 = 0;
        while (i5 < length) {
            C0079f c0079f3 = c0079fArr[i5];
            char c6 = c0079f3.f243a;
            float f13 = fArr[c4];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i2 = 2;
                    break;
            }
            float f19 = f14;
            float f20 = f17;
            float f21 = f18;
            float f22 = f13;
            int i6 = 0;
            while (true) {
                float[] fArr2 = c0079f3.f244b;
                if (i6 < fArr2.length) {
                    if (c6 == 'A') {
                        i3 = i6;
                        c0079f = c0079f3;
                        float f23 = f22;
                        float f24 = f19;
                        i4 = i5;
                        c2 = c6;
                        int i7 = i3 + 5;
                        int i8 = i3 + 6;
                        m363a(path, f23, f24, fArr2[i7], fArr2[i8], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f15 = fArr2[i7];
                        f = fArr2[i8];
                        f16 = f;
                        f2 = f15;
                    } else if (c6 == 'C') {
                        i3 = i6;
                        i4 = i5;
                        c0079f = c0079f3;
                        c2 = c6;
                        int i9 = i3 + 2;
                        int i10 = i3 + 3;
                        int i11 = i3 + 4;
                        int i12 = i3 + 5;
                        path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                        float f25 = fArr2[i11];
                        float f26 = fArr2[i12];
                        f15 = fArr2[i9];
                        f16 = fArr2[i10];
                        f = f26;
                        f2 = f25;
                    } else if (c6 != 'H') {
                        if (c6 == 'Q') {
                            i3 = i6;
                            i4 = i5;
                            c0079f = c0079f3;
                            c2 = c6;
                            int i13 = i3 + 1;
                            int i14 = i3 + 2;
                            int i15 = i3 + 3;
                            path2.quadTo(fArr2[i3], fArr2[i13], fArr2[i14], fArr2[i15]);
                            f3 = fArr2[i3];
                            float f27 = fArr2[i13];
                            f4 = fArr2[i14];
                            f16 = f27;
                            f = fArr2[i15];
                        } else if (c6 == 'V') {
                            i3 = i6;
                            i4 = i5;
                            c0079f = c0079f3;
                            f2 = f22;
                            c2 = c6;
                            path2.lineTo(f2, fArr2[i3]);
                            f = fArr2[i3];
                        } else if (c6 != 'a') {
                            if (c6 == 'c') {
                                i3 = i6;
                                int i16 = i3 + 2;
                                int i17 = i3 + 3;
                                int i18 = i3 + 4;
                                int i19 = i3 + 5;
                                path2.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                                float f28 = fArr2[i16] + f22;
                                float f29 = f19 + fArr2[i17];
                                f22 += fArr2[i18];
                                f19 += fArr2[i19];
                                f15 = f28;
                                f16 = f29;
                            } else if (c6 != 'h') {
                                if (c6 != 'q') {
                                    if (c6 != 'v') {
                                        if (c6 == 'L') {
                                            i3 = i6;
                                            int i20 = i3 + 1;
                                            path2.lineTo(fArr2[i3], fArr2[i20]);
                                            f2 = fArr2[i3];
                                            f = fArr2[i20];
                                        } else if (c6 == 'M') {
                                            i3 = i6;
                                            f2 = fArr2[i3];
                                            f = fArr2[i3 + 1];
                                            if (i3 > 0) {
                                                path2.lineTo(f2, f);
                                            } else {
                                                path2.moveTo(f2, f);
                                                f20 = f2;
                                                f21 = f;
                                            }
                                        } else if (c6 == 'S') {
                                            i3 = i6;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f22 = (f22 * 2.0f) - f15;
                                                f19 = (f19 * 2.0f) - f16;
                                            }
                                            float f30 = f22;
                                            float f31 = f19;
                                            int i21 = i3 + 1;
                                            int i22 = i3 + 2;
                                            int i23 = i3 + 3;
                                            path2.cubicTo(f30, f31, fArr2[i3], fArr2[i21], fArr2[i22], fArr2[i23]);
                                            f3 = fArr2[i3];
                                            float f32 = fArr2[i21];
                                            f4 = fArr2[i22];
                                            f16 = f32;
                                            f = fArr2[i23];
                                            i4 = i5;
                                            c0079f = c0079f3;
                                            c2 = c6;
                                        } else if (c6 == 'T') {
                                            i3 = i6;
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f22 = (f22 * 2.0f) - f15;
                                                f19 = (f19 * 2.0f) - f16;
                                            }
                                            float f33 = f19;
                                            float f34 = fArr2[i3];
                                            int i24 = i3 + 1;
                                            path2.quadTo(f22, f33, f34, fArr2[i24]);
                                            f16 = f33;
                                            f2 = fArr2[i3];
                                            f = fArr2[i24];
                                            i4 = i5;
                                            c0079f = c0079f3;
                                            f15 = f22;
                                            c2 = c6;
                                        } else if (c6 == 'l') {
                                            i3 = i6;
                                            int i25 = i3 + 1;
                                            path2.rLineTo(fArr2[i3], fArr2[i25]);
                                            f22 += fArr2[i3];
                                            f8 = fArr2[i25];
                                        } else if (c6 == c3) {
                                            i3 = i6;
                                            float f35 = fArr2[i3];
                                            f22 += f35;
                                            float f36 = fArr2[i3 + 1];
                                            f19 += f36;
                                            if (i3 > 0) {
                                                path2.rLineTo(f35, f36);
                                            } else {
                                                path2.rMoveTo(f35, f36);
                                                c0079f = c0079f3;
                                                f2 = f22;
                                                f20 = f2;
                                                f = f19;
                                                f21 = f;
                                                i4 = i5;
                                                c2 = c6;
                                            }
                                        } else if (c6 == 's') {
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f9 = f19 - f16;
                                                f10 = f22 - f15;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i26 = i6 + 1;
                                            int i27 = i6 + 2;
                                            int i28 = i6 + 3;
                                            i3 = i6;
                                            path2.rCubicTo(f10, f9, fArr2[i6], fArr2[i26], fArr2[i27], fArr2[i28]);
                                            f5 = fArr2[i3] + f22;
                                            f6 = f19 + fArr2[i26];
                                            f22 += fArr2[i27];
                                            f7 = fArr2[i28];
                                        } else if (c6 != 't') {
                                            i3 = i6;
                                        } else {
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f11 = f22 - f15;
                                                f12 = f19 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i29 = i6 + 1;
                                            path2.rQuadTo(f11, f12, fArr2[i6], fArr2[i29]);
                                            float f37 = f11 + f22;
                                            float f38 = f19 + f12;
                                            float f39 = f22 + fArr2[i6];
                                            f19 += fArr2[i29];
                                            f16 = f38;
                                            i3 = i6;
                                            c0079f = c0079f3;
                                            f2 = f39;
                                            f15 = f37;
                                            f = f19;
                                            i4 = i5;
                                            c2 = c6;
                                        }
                                        i4 = i5;
                                        c0079f = c0079f3;
                                        c2 = c6;
                                    } else {
                                        i3 = i6;
                                        path2.rLineTo(0.0f, fArr2[i3]);
                                        f8 = fArr2[i3];
                                    }
                                    f19 += f8;
                                } else {
                                    i3 = i6;
                                    int i30 = i3 + 1;
                                    int i31 = i3 + 2;
                                    int i32 = i3 + 3;
                                    path2.rQuadTo(fArr2[i3], fArr2[i30], fArr2[i31], fArr2[i32]);
                                    f5 = fArr2[i3] + f22;
                                    f6 = f19 + fArr2[i30];
                                    f22 += fArr2[i31];
                                    f7 = fArr2[i32];
                                }
                                f19 += f7;
                                f15 = f5;
                                f16 = f6;
                            } else {
                                i3 = i6;
                                path2.rLineTo(fArr2[i3], 0.0f);
                                f22 += fArr2[i3];
                            }
                            c0079f = c0079f3;
                            f2 = f22;
                            f = f19;
                            i4 = i5;
                            c2 = c6;
                        } else {
                            i3 = i6;
                            int i33 = i3 + 5;
                            float f40 = fArr2[i33] + f22;
                            int i34 = i3 + 6;
                            float f41 = fArr2[i34] + f19;
                            float f42 = fArr2[i3];
                            float f43 = fArr2[i3 + 1];
                            float f44 = fArr2[i3 + 2];
                            if (fArr2[i3 + 3] != 0.0f) {
                                c0079f2 = c0079f3;
                                z2 = true;
                            } else {
                                c0079f2 = c0079f3;
                                z2 = false;
                            }
                            c0079f = c0079f2;
                            float f45 = f22;
                            c2 = c6;
                            float f46 = f19;
                            i4 = i5;
                            m363a(path, f45, f46, f40, f41, f42, f43, f44, z2, fArr2[i3 + 4] != 0.0f);
                            f2 = f45 + fArr2[i33];
                            f = f46 + fArr2[i34];
                            f15 = f2;
                            f16 = f;
                        }
                        f15 = f3;
                        f2 = f4;
                    } else {
                        i3 = i6;
                        c0079f = c0079f3;
                        c2 = c6;
                        f = f19;
                        i4 = i5;
                        path2.lineTo(fArr2[i3], f);
                        f2 = fArr2[i3];
                    }
                    c6 = c2;
                    c0079f3 = c0079f;
                    i5 = i4;
                    c3 = 'm';
                    f22 = f2;
                    f19 = f;
                    c5 = c6;
                    i6 = i3 + i2;
                    path2 = path;
                }
            }
            fArr[0] = f22;
            fArr[1] = f19;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f20;
            fArr[5] = f21;
            c5 = c0079f3.f243a;
            i5++;
            path2 = path;
            c3 = 'm';
            c4 = 0;
        }
    }

    public C0079f(C0079f c0079f) {
        this.f243a = c0079f.f243a;
        float[] fArr = c0079f.f244b;
        this.f244b = AbstractC0016e.m192q(fArr, fArr.length);
    }
}
