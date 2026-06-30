package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class h41 extends xv0 {
    public final g41 a;
    public final b3 b;
    public final wr c;
    public final float d;
    public final wl e;

    public h41(g41 g41Var, b3 b3Var, wr wrVar, float f, wl wlVar) {
        this.a = g41Var;
        this.b = b3Var;
        this.c = wrVar;
        this.d = f;
        this.e = wlVar;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        i41 i41Var = new i41();
        i41Var.s = this.a;
        i41Var.t = true;
        i41Var.u = this.b;
        i41Var.v = this.c;
        i41Var.w = this.d;
        i41Var.x = this.e;
        return i41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h41)) {
            return false;
        }
        h41 h41Var = (h41) obj;
        return xi0.o(this.a, h41Var.a) && xi0.o(this.b, h41Var.b) && this.c.equals(h41Var.c) && Float.compare(this.d, h41Var.d) == 0 && xi0.o(this.e, h41Var.e);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        i41 i41Var = (i41) sv0Var;
        boolean z = i41Var.t;
        g41 g41Var = this.a;
        boolean z2 = (z && io1.a(i41Var.s.e(), g41Var.e())) ? false : true;
        i41Var.s = g41Var;
        i41Var.t = true;
        i41Var.u = this.b;
        i41Var.v = this.c;
        i41Var.w = this.d;
        i41Var.x = this.e;
        if (z2) {
            el.D(i41Var);
        }
        al.C(i41Var);
    }

    public final int hashCode() {
        int iA = s91.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + s91.d(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        wl wlVar = this.e;
        return iA + (wlVar == null ? 0 : wlVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ")";
    }
}
