package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s32 implements k72 {
    public final k72 a;
    public final k72 b;

    public s32(k72 k72Var, k72 k72Var2) {
        this.a = k72Var;
        this.b = k72Var2;
    }

    @Override // defpackage.k72
    public final int a(hx hxVar) {
        return Math.max(this.a.a(hxVar), this.b.a(hxVar));
    }

    @Override // defpackage.k72
    public final int b(hx hxVar) {
        return Math.max(this.a.b(hxVar), this.b.b(hxVar));
    }

    @Override // defpackage.k72
    public final int c(hx hxVar, al0 al0Var) {
        return Math.max(this.a.c(hxVar, al0Var), this.b.c(hxVar, al0Var));
    }

    @Override // defpackage.k72
    public final int d(hx hxVar, al0 al0Var) {
        return Math.max(this.a.d(hxVar, al0Var), this.b.d(hxVar, al0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s32)) {
            return false;
        }
        s32 s32Var = (s32) obj;
        return xi0.o(s32Var.a, this.a) && xi0.o(s32Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
