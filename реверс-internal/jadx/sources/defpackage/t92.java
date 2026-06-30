package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class t92 extends xv0 {
    public final jy a;
    public final wa0 b;
    public final Object c;

    public t92(jy jyVar, wa0 wa0Var, Object obj) {
        this.a = jyVar;
        this.b = wa0Var;
        this.c = obj;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        u92 u92Var = new u92();
        u92Var.s = this.a;
        u92Var.t = this.b;
        return u92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t92.class != obj.getClass()) {
            return false;
        }
        t92 t92Var = (t92) obj;
        return this.a == t92Var.a && this.c.equals(t92Var.c);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        u92 u92Var = (u92) sv0Var;
        u92Var.s = this.a;
        u92Var.t = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + s91.d(this.a.hashCode() * 31, 31, false);
    }
}
