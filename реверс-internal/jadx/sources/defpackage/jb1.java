package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 {
    public final float a;
    public final v50 b;

    public jb1(float f, v50 v50Var) {
        v50Var.getClass();
        this.a = f;
        this.b = v50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb1)) {
            return false;
        }
        jb1 jb1Var = (jb1) obj;
        return Float.compare(this.a, jb1Var.a) == 0 && xi0.o(this.b, jb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
