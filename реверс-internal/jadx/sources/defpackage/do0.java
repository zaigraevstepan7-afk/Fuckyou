package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class do0 extends xv0 {
    public final n6 a;
    public final jo0 b;
    public final ry1 c;

    public do0(n6 n6Var, jo0 jo0Var, ry1 ry1Var) {
        this.a = n6Var;
        this.b = jo0Var;
        this.c = ry1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new eo0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof do0) {
            do0 do0Var = (do0) obj;
            return xi0.o(this.a, do0Var.a) && this.b == do0Var.b && this.c == do0Var.c;
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        eo0 eo0Var = (eo0) sv0Var;
        if (eo0Var.r) {
            eo0Var.s.g();
            eo0Var.s.k(eo0Var);
        }
        n6 n6Var = this.a;
        eo0Var.s = n6Var;
        if (eo0Var.r) {
            if (n6Var.a != null) {
                qg0.c("Expected textInputModifierNode to be null");
            }
            n6Var.a = eo0Var;
        }
        eo0Var.t = this.b;
        eo0Var.u = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ")";
    }
}
