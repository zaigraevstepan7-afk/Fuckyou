package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ae {
    public final int a;

    public /* synthetic */ ae(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ae) {
            return this.a == ((ae) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return s91.h(this.a, "AutoClearFocusBehavior(value=", ")");
    }
}
