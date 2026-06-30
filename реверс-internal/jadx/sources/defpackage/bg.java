package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bg {
    public f6 a = null;
    public n3 b = null;
    public ej c = null;
    public w6 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return xi0.o(this.a, bgVar.a) && xi0.o(this.b, bgVar.b) && xi0.o(this.c, bgVar.c) && xi0.o(this.d, bgVar.d);
    }

    public final int hashCode() {
        f6 f6Var = this.a;
        int iHashCode = (f6Var == null ? 0 : f6Var.hashCode()) * 31;
        n3 n3Var = this.b;
        int iHashCode2 = (iHashCode + (n3Var == null ? 0 : n3Var.hashCode())) * 31;
        ej ejVar = this.c;
        int iHashCode3 = (iHashCode2 + (ejVar == null ? 0 : ejVar.hashCode())) * 31;
        w6 w6Var = this.d;
        return iHashCode3 + (w6Var != null ? w6Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
