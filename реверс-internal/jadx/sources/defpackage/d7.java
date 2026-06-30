package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d7 implements j81 {
    public final int b;

    public d7(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((d7) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return s91.h(this.b, "AndroidPointerIcon(type=", ")");
    }
}
