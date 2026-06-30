package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gl1 {
    public final ad0 a;
    public final long b;
    public final fl1 c;
    public final boolean d;

    public gl1(ad0 ad0Var, long j, fl1 fl1Var, boolean z) {
        this.a = ad0Var;
        this.b = j;
        this.c = fl1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl1)) {
            return false;
        }
        gl1 gl1Var = (gl1) obj;
        return this.a == gl1Var.a && w01.b(this.b, gl1Var.b) && this.c == gl1Var.c && this.d == gl1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + s91.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + w01.g(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
