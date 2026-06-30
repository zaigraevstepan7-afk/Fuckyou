package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vl {
    public static final long b = lk.g(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        lk.g(4282664004L);
        lk.g(4287137928L);
        lk.g(4291611852L);
        c = lk.g(4294967295L);
        d = lk.g(4294901760L);
        lk.g(4278255360L);
        e = lk.g(4278190335L);
        lk.g(4294967040L);
        lk.g(4278255615L);
        lk.g(4294902015L);
        f = lk.f(0);
        float[] fArr = gm.a;
        g = lk.c(0.0f, 0.0f, 0.0f, 0.0f, gm.u);
    }

    public /* synthetic */ vl(long j) {
        this.a = j;
    }

    public static final long a(long j, em emVar) {
        hr hrVarQ;
        em emVarF = f(j);
        int i = emVarF.c;
        int i2 = emVar.c;
        if ((i | i2) < 0) {
            hrVarQ = al.q(emVarF, emVar);
        } else {
            hx0 hx0Var = ir.a;
            int i3 = i | (i2 << 6);
            Object objB = hx0Var.b(i3);
            if (objB == null) {
                objB = al.q(emVarF, emVar);
                hx0Var.i(i3, objB);
            }
            hrVarQ = (hr) objB;
        }
        return hrVarQ.a(j);
    }

    public static long b(float f2, long j) {
        return lk.c(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float fX;
        float f2;
        if ((63 & j) == 0) {
            fX = (float) pd1.x((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fX = (float) pd1.x((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fX / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) pd1.x((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - x60.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final em f(long j) {
        float[] fArr = gm.a;
        return gm.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) pd1.x((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - x60.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) pd1.x((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - x60.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        float fH = h(j);
        float fG = g(j);
        float fE = e(j);
        float fD = d(j);
        String str = f(j).a;
        StringBuilder sbM = s91.m("Color(", fH, ", ", fG, ", ");
        sbM.append(fE);
        sbM.append(", ");
        sbM.append(fD);
        sbM.append(", ");
        sbM.append(str);
        sbM.append(")");
        return sbM.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vl) {
            return this.a == ((vl) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
