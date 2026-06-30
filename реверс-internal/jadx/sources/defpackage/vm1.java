package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vm1 extends xv0 {
    public final ym1 a;
    public final boolean b;
    public final long c;
    public final long d;

    public vm1(ym1 ym1Var, boolean z, long j, long j2) {
        this.a = ym1Var;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new yf(new g3(19, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm1)) {
            return false;
        }
        vm1 vm1Var = (vm1) obj;
        return tz.b(3.0f, 3.0f) && xi0.o(this.a, vm1Var.a) && this.b == vm1Var.b && vl.c(this.c, vm1Var.c) && vl.c(this.d, vm1Var.d);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        yf yfVar = (yf) sv0Var;
        g3 g3Var = new g3(19, this);
        yfVar.s = g3Var;
        el.V(yfVar, g3Var);
    }

    public final int hashCode() {
        int iD = s91.d((this.a.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.b);
        int i = vl.h;
        return Long.hashCode(this.d) + s91.c(iD, 31, this.c);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + tz.c(3.0f) + ", shape=" + this.a + ", clip=" + this.b + ", ambientColor=" + vl.i(this.c) + ", spotColor=" + vl.i(this.d) + ")";
    }
}
