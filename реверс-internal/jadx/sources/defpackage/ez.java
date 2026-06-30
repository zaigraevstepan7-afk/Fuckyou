package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ez {
    public final float a;
    public final jb1 b;
    public final jb1 c;

    public ez(float f, jb1 jb1Var, jb1 jb1Var2) {
        this.a = f;
        this.b = jb1Var;
        this.c = jb1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        return Float.compare(this.a, ezVar.a) == 0 && this.b.equals(ezVar.b) && this.c.equals(ezVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DistanceVertex(distance=" + this.a + ", f1=" + this.b + ", f2=" + this.c + ')';
    }
}
