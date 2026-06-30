package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hn implements tv0 {
    public final tv0 a;
    public final tv0 b;

    public hn(tv0 tv0Var, tv0 tv0Var2) {
        this.a = tv0Var;
        this.b = tv0Var2;
    }

    @Override // defpackage.tv0
    public final Object a(wa0 wa0Var, Object obj) {
        return this.b.a(wa0Var, this.a.a(wa0Var, obj));
    }

    @Override // defpackage.tv0
    public final boolean b(sa0 sa0Var) {
        return this.a.b(sa0Var) && this.b.b(sa0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        return this.a.equals(hnVar.a) && xi0.o(this.b, hnVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + a(r9.i, "") + "]";
    }
}
