package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i91 {
    public final String a;

    public i91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i91)) {
            return false;
        }
        return this.a.equals(((i91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
