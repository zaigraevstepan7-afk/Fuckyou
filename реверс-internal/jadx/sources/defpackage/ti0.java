package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class ti0 extends xv0 {
    public final ri0 a;

    public ti0(ri0 ri0Var) {
        this.a = ri0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        vi0 vi0Var = new vi0(0);
        vi0Var.t = this.a;
        vi0Var.u = true;
        return vi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ti0 ti0Var = obj instanceof ti0 ? (ti0) obj : null;
        return ti0Var != null && this.a == ti0Var.a;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        vi0 vi0Var = (vi0) sv0Var;
        vi0Var.t = this.a;
        vi0Var.u = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
