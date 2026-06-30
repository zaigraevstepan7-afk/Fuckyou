package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bt extends xv0 {
    public final v12 a;
    public final az1 b;
    public final jo0 c;
    public final boolean d;
    public final z01 e;
    public final ry1 f;
    public final df0 g;
    public final o80 h;

    public bt(v12 v12Var, az1 az1Var, jo0 jo0Var, boolean z, z01 z01Var, ry1 ry1Var, df0 df0Var, o80 o80Var) {
        this.a = v12Var;
        this.b = az1Var;
        this.c = jo0Var;
        this.d = z;
        this.e = z01Var;
        this.f = ry1Var;
        this.g = df0Var;
        this.h = o80Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        et etVar = new et();
        etVar.u = this.a;
        etVar.v = this.b;
        etVar.w = this.c;
        etVar.x = this.d;
        etVar.y = this.e;
        ry1 ry1Var = this.f;
        etVar.z = ry1Var;
        etVar.A = this.g;
        etVar.B = this.h;
        ry1Var.f = new ct(etVar, 4);
        return etVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bt) {
            bt btVar = (bt) obj;
            if (this.a.equals(btVar.a) && this.b.equals(btVar.b) && this.c == btVar.c && this.d == btVar.d && this.e.equals(btVar.e) && this.f == btVar.f && xi0.o(this.g, btVar.g) && xi0.o(this.h, btVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        et etVar = (et) sv0Var;
        boolean z = etVar.x;
        df0 df0Var = etVar.A;
        ry1 ry1Var = etVar.z;
        etVar.u = this.a;
        az1 az1Var = this.b;
        etVar.v = az1Var;
        etVar.w = this.c;
        boolean z2 = this.d;
        etVar.x = z2;
        etVar.y = this.e;
        ry1 ry1Var2 = this.f;
        etVar.z = ry1Var2;
        df0 df0Var2 = this.g;
        etVar.A = df0Var2;
        etVar.B = this.h;
        if (z2 != z || z2 != z || !xi0.o(df0Var2, df0Var) || !wz1.c(az1Var.b)) {
            kd1.t(etVar);
        }
        if (ry1Var2 != ry1Var) {
            ry1Var2.f = new ct(etVar, 0);
        }
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + s91.d(s91.d(s91.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.d), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.d + ", isPassword=false, offsetMapping=" + this.e + ", manager=" + this.f + ", imeOptions=" + this.g + ", focusRequester=" + this.h + ")";
    }
}
