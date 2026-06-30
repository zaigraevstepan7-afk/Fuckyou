package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class em {
    public final String a;
    public final long b;
    public final int c;

    public em(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            yc.p("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            yc.p("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        em emVar = (em) obj;
        if (this.c == emVar.c && this.a.equals(emVar.a)) {
            return xk.p(this.b, emVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, em emVar);

    public int hashCode() {
        return s91.c(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        long j = this.b;
        return this.a + " (id=" + this.c + ", model=" + (xk.p(j, 12884901888L) ? "Rgb" : xk.p(j, 12884901889L) ? "Xyz" : xk.p(j, 12884901890L) ? "Lab" : xk.p(j, 17179869187L) ? "Cmyk" : "Unknown") + ")";
    }
}
