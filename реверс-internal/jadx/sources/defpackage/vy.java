package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class vy extends xv0 {
    public final qm0 a;

    public vy(qm0 qm0Var) {
        this.a = qm0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        wy wyVar = new wy();
        wyVar.s = this.a;
        return wyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy) && xi0.o(this.a, ((vy) obj).a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        wy wyVar = (wy) sv0Var;
        qm0 qm0Var = wyVar.s;
        qm0 qm0Var2 = this.a;
        if (xi0.o(qm0Var, qm0Var2) || !wyVar.e.r) {
            return;
        }
        qm0 qm0Var3 = wyVar.s;
        qm0Var3.c();
        qm0Var3.b = null;
        qm0Var2.getClass();
        wyVar.s = qm0Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ")";
    }
}
