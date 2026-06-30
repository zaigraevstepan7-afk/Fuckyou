package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h81 extends xv0 {
    public final d7 a;

    public h81(d7 d7Var) {
        this.a = d7Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new i81(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h81) && this.a.equals(((h81) obj).a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        i81 i81Var = (i81) sv0Var;
        d7 d7Var = i81Var.t;
        d7 d7Var2 = this.a;
        if (xi0.o(d7Var, d7Var2)) {
            return;
        }
        i81Var.t = d7Var2;
        if (i81Var.u) {
            i81Var.N0();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
