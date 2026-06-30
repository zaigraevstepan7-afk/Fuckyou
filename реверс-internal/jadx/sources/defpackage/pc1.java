package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pc1 {
    public static final pc1 e = new pc1(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pc1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final pc1 e(pc1 pc1Var) {
        return new pc1(Math.max(this.a, pc1Var.a), Math.max(this.b, pc1Var.b), Math.min(this.c, pc1Var.c), Math.min(this.d, pc1Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc1)) {
            return false;
        }
        pc1 pc1Var = (pc1) obj;
        return Float.compare(this.a, pc1Var.a) == 0 && Float.compare(this.b, pc1Var.b) == 0 && Float.compare(this.c, pc1Var.c) == 0 && Float.compare(this.d, pc1Var.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(pc1 pc1Var) {
        return (this.a < pc1Var.c) & (pc1Var.a < this.c) & (this.b < pc1Var.d) & (pc1Var.b < this.d);
    }

    public final pc1 h(float f, float f2) {
        return new pc1(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + s91.a(this.c, s91.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final pc1 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new pc1(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strX = hk.X(this.a);
        String strX2 = hk.X(this.b);
        String strX3 = hk.X(this.c);
        String strX4 = hk.X(this.d);
        StringBuilder sbO = s91.o("Rect.fromLTRB(", strX, ", ", strX2, ", ");
        sbO.append(strX3);
        sbO.append(", ");
        sbO.append(strX4);
        sbO.append(")");
        return sbO.toString();
    }
}
