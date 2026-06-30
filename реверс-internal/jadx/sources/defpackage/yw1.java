package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class yw1 extends xv0 {
    public final n81 a;
    public final cv b;
    public final my1 c;
    public final vs d;

    public yw1(n81 n81Var, cv cvVar, my1 my1Var, vs vsVar) {
        this.a = n81Var;
        this.b = cvVar;
        this.c = my1Var;
        this.d = vsVar;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new zw1(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw1)) {
            return false;
        }
        yw1 yw1Var = (yw1) obj;
        return this.a == yw1Var.a && this.b == yw1Var.b && this.c == yw1Var.c && this.d == yw1Var.d;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        zw1 zw1Var = (zw1) sv0Var;
        zw1Var.u.b = null;
        n81 n81Var = this.a;
        zw1Var.u = n81Var;
        n81Var.b = zw1Var;
        n81Var.c = zw1Var.r ? k12.g : k12.f;
        zw1Var.v = this.b;
        zw1Var.w = this.c;
        zw1Var.x = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
