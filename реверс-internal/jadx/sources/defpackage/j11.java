package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j11 extends xk {
    public final pe c;
    public final xo0 d;

    public j11(pe peVar, xo0 xo0Var) {
        peVar.getClass();
        this.c = peVar;
        this.d = xo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j11)) {
            return false;
        }
        j11 j11Var = (j11) obj;
        return xi0.o(this.c, j11Var.c) && xi0.o(this.d, j11Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        xo0 xo0Var = this.d;
        return iHashCode + (xo0Var == null ? 0 : xo0Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.c + ", owner=" + this.d + ')';
    }
}
