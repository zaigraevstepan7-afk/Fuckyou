package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pt1 extends xv0 {
    public final hy0 a;
    public final mt1 b;

    public pt1(hy0 hy0Var, mt1 mt1Var) {
        this.a = hy0Var;
        this.b = mt1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new xt1(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt1)) {
            return false;
        }
        pt1 pt1Var = (pt1) obj;
        return xi0.o(pt1Var.b, this.b) && xi0.o(pt1Var.a, this.a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        xt1 xt1Var = (xt1) sv0Var;
        xt1Var.v = this.b;
        xt1Var.R0(false);
        hy0 hy0Var = this.a;
        if (hy0Var == null) {
            hy0Var = new hy0(null);
        }
        if (xi0.o(xt1Var.C, hy0Var)) {
            return;
        }
        xt1Var.C = hy0Var;
        xt1Var.R0(false);
        st1 st1Var = xt1Var.u;
        if (st1Var != null) {
            el.C(st1Var);
        } else {
            yc.l("StyleOuterNode with no corresponding StyleInnerNode");
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.a + ", style=" + this.b + ")";
    }
}
