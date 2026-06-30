package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cq implements s42 {
    public final sa0 a;

    public cq(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.s42
    public final Object a(b61 b61Var) {
        return this.a.i(b61Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq) && xi0.o(this.a, ((cq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
