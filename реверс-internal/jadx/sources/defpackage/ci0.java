package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ci0 {
    public final boolean a;
    public final boolean b;

    public ci0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci0)) {
            return false;
        }
        ci0 ci0Var = (ci0) obj;
        return this.a == ci0Var.a && this.b == ci0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + s91.d(Boolean.hashCode(this.a) * 31, 31, false);
    }

    public final String toString() {
        return "InteractiveListColorState(enabled=" + this.a + ", selected=false, dragged=" + this.b + ")";
    }
}
