package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 extends bl {
    public final vy0 d;

    public ez0(vy0 vy0Var) {
        vy0Var.getClass();
        this.d = vy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ez0.class == obj.getClass() && xi0.o(this.d, ((ez0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.d + ", direction=-1)";
    }
}
