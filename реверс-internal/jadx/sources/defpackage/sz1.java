package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sz1 {
    public final zq1 a;
    public final zq1 b;
    public final zq1 c;
    public final zq1 d;

    public sz1(zq1 zq1Var, zq1 zq1Var2, zq1 zq1Var3, zq1 zq1Var4) {
        this.a = zq1Var;
        this.b = zq1Var2;
        this.c = zq1Var3;
        this.d = zq1Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sz1)) {
            return false;
        }
        sz1 sz1Var = (sz1) obj;
        return xi0.o(this.a, sz1Var.a) && xi0.o(this.b, sz1Var.b) && xi0.o(this.c, sz1Var.c) && xi0.o(this.d, sz1Var.d);
    }

    public final int hashCode() {
        zq1 zq1Var = this.a;
        int iHashCode = (zq1Var != null ? zq1Var.hashCode() : 0) * 31;
        zq1 zq1Var2 = this.b;
        int iHashCode2 = (iHashCode + (zq1Var2 != null ? zq1Var2.hashCode() : 0)) * 31;
        zq1 zq1Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (zq1Var3 != null ? zq1Var3.hashCode() : 0)) * 31;
        zq1 zq1Var4 = this.d;
        return iHashCode3 + (zq1Var4 != null ? zq1Var4.hashCode() : 0);
    }
}
