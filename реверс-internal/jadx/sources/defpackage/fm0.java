package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fm0 extends xv0 {
    public final float a;
    public final boolean b;

    public fm0(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        gm0 gm0Var = new gm0();
        gm0Var.s = this.a;
        gm0Var.t = this.b;
        return gm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        fm0 fm0Var = obj instanceof fm0 ? (fm0) obj : null;
        return fm0Var != null && this.a == fm0Var.a && this.b == fm0Var.b;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        gm0 gm0Var = (gm0) sv0Var;
        gm0Var.s = this.a;
        gm0Var.t = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
