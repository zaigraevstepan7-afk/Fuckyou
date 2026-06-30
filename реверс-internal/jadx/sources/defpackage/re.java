package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class re extends xk {
    public final Object c;
    public final long d;

    public re(long j, Object obj) {
        this.c = obj;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return this.c.equals(reVar.c) && this.d == reVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.c + ", compositeKey=" + this.d + ')';
    }
}
