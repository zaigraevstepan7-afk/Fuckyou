package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class y80 extends xv0 {
    public final jx0 a;

    public y80(jx0 jx0Var) {
        this.a = jx0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new z80(this.a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y80) {
            return xi0.o(this.a, ((y80) obj).a);
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((z80) sv0Var).P0(this.a);
    }

    public final int hashCode() {
        jx0 jx0Var = this.a;
        if (jx0Var != null) {
            return jx0Var.hashCode();
        }
        return 0;
    }
}
