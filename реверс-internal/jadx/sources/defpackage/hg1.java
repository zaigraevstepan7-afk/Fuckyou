package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hg1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        xc.e(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public hg1(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg1)) {
            return false;
        }
        hg1 hg1Var = (hg1) obj;
        return Float.compare(this.a, hg1Var.a) == 0 && Float.compare(this.b, hg1Var.b) == 0 && Float.compare(this.c, hg1Var.c) == 0 && Float.compare(this.d, hg1Var.d) == 0 && el.u(this.e, hg1Var.e) && el.u(this.f, hg1Var.f) && el.u(this.g, hg1Var.g) && el.u(this.h, hg1Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + s91.c(s91.c(s91.c(s91.a(this.d, s91.a(this.c, s91.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = hk.X(this.a) + ", " + hk.X(this.b) + ", " + hk.X(this.c) + ", " + hk.X(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zU = el.u(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zU || !el.u(j2, j3) || !el.u(j3, j4)) {
            String strU = el.U(j);
            String strU2 = el.U(j2);
            String strU3 = el.U(j3);
            String strU4 = el.U(j4);
            StringBuilder sbO = s91.o("RoundRect(rect=", str, ", topLeft=", strU, ", topRight=");
            s91.u(sbO, strU2, ", bottomRight=", strU3, ", bottomLeft=");
            sbO.append(strU4);
            sbO.append(")");
            return sbO.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) != Float.intBitsToFloat(i2)) {
            String strX = hk.X(Float.intBitsToFloat(i));
            String strX2 = hk.X(Float.intBitsToFloat(i2));
            StringBuilder sbO2 = s91.o("RoundRect(rect=", str, ", x=", strX, ", y=");
            sbO2.append(strX2);
            sbO2.append(")");
            return sbO2.toString();
        }
        return "RoundRect(rect=" + str + ", radius=" + hk.X(Float.intBitsToFloat(i)) + ")";
    }
}
