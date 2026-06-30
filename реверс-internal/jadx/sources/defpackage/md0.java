package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class md0 extends xv0 {
    public final d02 a;
    public final int b;
    public final int c;

    public md0(d02 d02Var, int i, int i2) {
        this.a = d02Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        od0 od0Var = new od0();
        od0Var.s = this.a;
        od0Var.t = this.b;
        od0Var.u = this.c;
        od0Var.w = -1;
        od0Var.x = -1;
        return od0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md0)) {
            return false;
        }
        md0 md0Var = (md0) obj;
        return xi0.o(this.a, md0Var.a) && this.b == md0Var.b && this.c == md0Var.c;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        od0 od0Var = (od0) sv0Var;
        d02 d02Var = od0Var.s;
        d02 d02Var2 = this.a;
        boolean zO = xi0.o(d02Var, d02Var2);
        int i = this.b;
        int i2 = this.c;
        if (zO && od0Var.t == i && od0Var.u == i2) {
            return;
        }
        od0Var.s = d02Var2;
        od0Var.t = i;
        od0Var.u = i2;
        od0Var.y = qc1.x(d02Var2, bl.P(od0Var).C);
        od0Var.v = true;
        el.D(od0Var);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
