package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class p80 extends xv0 {
    public final o80 a;

    public p80(o80 o80Var) {
        this.a = o80Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        r80 r80Var = new r80();
        r80Var.s = this.a;
        return r80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p80) && xi0.o(this.a, ((p80) obj).a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        r80 r80Var = (r80) sv0Var;
        r80Var.s.a.j(r80Var);
        o80 o80Var = this.a;
        r80Var.s = o80Var;
        o80Var.a.b(r80Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ")";
    }
}
