package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uf1 {
    public final pd1 a;
    public final uc1 b;
    public final kd1 c;
    public final qc1 d;

    public uf1(pd1 pd1Var, uc1 uc1Var, kd1 kd1Var, qc1 qc1Var) {
        this.a = pd1Var;
        this.b = uc1Var;
        this.c = kd1Var;
        this.d = qc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf1)) {
            return false;
        }
        uf1 uf1Var = (uf1) obj;
        return this.a.equals(uf1Var.a) && this.b.equals(uf1Var.b) && this.c.equals(uf1Var.c) && this.d.equals(uf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
