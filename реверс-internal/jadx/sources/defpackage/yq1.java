package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yq1 implements qp, Iterable, yj0 {
    public final jp1 e;
    public final int f;
    public final ed1 g;

    public yq1(jp1 jp1Var, int i, qb0 qb0Var, ed1 ed1Var) {
        this.e = jp1Var;
        this.f = i;
        this.g = ed1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yq1)) {
            return false;
        }
        yq1 yq1Var = (yq1) obj;
        return yq1Var.f == this.f && yq1Var.e == this.e && yq1Var.g.equals(this.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.e.hashCode() + (this.f * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xq1(this.e, this.f, null, this.g);
    }
}
