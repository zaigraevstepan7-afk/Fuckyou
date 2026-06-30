package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p31 extends hk {
    public final hg1 b;
    public final w6 c;

    public p31(hg1 hg1Var) {
        w6 w6VarA;
        this.b = hg1Var;
        if (xc.A(hg1Var)) {
            w6VarA = null;
        } else {
            w6VarA = y6.a();
            w6.c(w6VarA, hg1Var);
        }
        this.c = w6VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p31) {
            return this.b.equals(((p31) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.hk
    public final pc1 x() {
        hg1 hg1Var = this.b;
        return new pc1(hg1Var.a, hg1Var.b, hg1Var.c, hg1Var.d);
    }
}
