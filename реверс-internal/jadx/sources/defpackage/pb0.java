package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 implements qp {
    public final np e;

    public pb0(np npVar) {
        this.e = npVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pb0) {
            return this.e.equals(((pb0) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() * 31;
    }
}
