package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bt1 implements db {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof bt1) {
            return this.a.equals(((bt1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return s91.l("StringAnnotation(value=", this.a, ")");
    }
}
