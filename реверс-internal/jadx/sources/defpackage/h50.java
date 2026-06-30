package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h50 implements k72 {
    public final k72 a;
    public final k72 b;

    public h50(k72 k72Var, k72 k72Var2) {
        this.a = k72Var;
        this.b = k72Var2;
    }

    @Override // defpackage.k72
    public final int a(hx hxVar) {
        int iA = this.a.a(hxVar) - this.b.a(hxVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.k72
    public final int b(hx hxVar) {
        int iB = this.a.b(hxVar) - this.b.b(hxVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.k72
    public final int c(hx hxVar, al0 al0Var) {
        int iC = this.a.c(hxVar, al0Var) - this.b.c(hxVar, al0Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.k72
    public final int d(hx hxVar, al0 al0Var) {
        int iD = this.a.d(hxVar, al0Var) - this.b.d(hxVar, al0Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h50)) {
            return false;
        }
        h50 h50Var = (h50) obj;
        return xi0.o(h50Var.a, this.a) && xi0.o(h50Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
