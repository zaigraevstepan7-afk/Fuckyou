package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l41 {
    public final r6 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public l41(r6 r6Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = r6Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final pc1 a(pc1 pc1Var) {
        return pc1Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = wz1.b;
            if (wz1.b(j, j2)) {
                return j2;
            }
        }
        int i = wz1.c;
        int i2 = this.b;
        return af1.g(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final pc1 c(pc1 pc1Var) {
        float f = -this.f;
        return pc1Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return lk.A(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l41) {
            l41 l41Var = (l41) obj;
            if (this.a == l41Var.a && this.b == l41Var.b && this.c == l41Var.c && this.d == l41Var.d && this.e == l41Var.e && Float.compare(this.f, l41Var.f) == 0 && Float.compare(this.g, l41Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + s91.a(this.f, s91.b(this.e, s91.b(this.d, s91.b(this.c, s91.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ")";
    }
}
