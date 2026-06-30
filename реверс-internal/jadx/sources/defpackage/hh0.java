package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hh0 implements c41 {
    public final k72 a;
    public final hx b;

    public hh0(k72 k72Var, lu1 lu1Var) {
        this.a = k72Var;
        this.b = lu1Var;
    }

    @Override // defpackage.c41
    public final float a(al0 al0Var) {
        k72 k72Var = this.a;
        hx hxVar = this.b;
        return hxVar.s0(k72Var.d(hxVar, al0Var));
    }

    @Override // defpackage.c41
    public final float b(al0 al0Var) {
        k72 k72Var = this.a;
        hx hxVar = this.b;
        return hxVar.s0(k72Var.c(hxVar, al0Var));
    }

    @Override // defpackage.c41
    public final float c() {
        k72 k72Var = this.a;
        hx hxVar = this.b;
        return hxVar.s0(k72Var.a(hxVar));
    }

    @Override // defpackage.c41
    public final float d() {
        k72 k72Var = this.a;
        hx hxVar = this.b;
        return hxVar.s0(k72Var.b(hxVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh0)) {
            return false;
        }
        hh0 hh0Var = (hh0) obj;
        return xi0.o(this.a, hh0Var.a) && xi0.o(this.b, hh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
