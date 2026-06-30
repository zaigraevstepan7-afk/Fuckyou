package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class ni0 extends xv0 {
    @Override // defpackage.xv0
    public final sv0 d() {
        oi0 oi0Var = new oi0(0);
        oi0Var.t = ri0.e;
        oi0Var.u = true;
        return oi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni0 ? (ni0) obj : null) != null;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        oi0 oi0Var = (oi0) sv0Var;
        oi0Var.t = ri0.e;
        oi0Var.u = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (ri0.e.hashCode() * 31);
    }
}
