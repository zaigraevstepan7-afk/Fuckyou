package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class t02 extends xv0 {
    public final jx0 a;
    public final boolean b;
    public final p60 c;

    public t02(jx0 jx0Var, boolean z, p60 p60Var) {
        this.a = jx0Var;
        this.b = z;
        this.c = p60Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        v02 v02Var = new v02();
        v02Var.s = this.a;
        v02Var.t = this.b;
        v02Var.u = this.c;
        v02Var.y = Float.NaN;
        v02Var.z = Float.NaN;
        return v02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t02)) {
            return false;
        }
        t02 t02Var = (t02) obj;
        return xi0.o(this.a, t02Var.a) && this.b == t02Var.b && xi0.o(this.c, t02Var.c);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        v02 v02Var = (v02) sv0Var;
        v02Var.s = this.a;
        boolean z = v02Var.t;
        boolean z2 = this.b;
        if (z != z2) {
            el.D(v02Var);
        }
        v02Var.t = z2;
        v02Var.u = this.c;
        if (v02Var.x == null && !Float.isNaN(v02Var.z)) {
            v02Var.x = xi0.a(v02Var.z);
        }
        if (v02Var.w != null || Float.isNaN(v02Var.y)) {
            return;
        }
        v02Var.w = xi0.a(v02Var.y);
    }

    public final int hashCode() {
        return this.c.hashCode() + s91.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ")";
    }
}
