package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vk1 {
    public final ee1 a;
    public final int b;
    public final long c;

    public vk1(ee1 ee1Var, int i, long j) {
        this.a = ee1Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk1)) {
            return false;
        }
        vk1 vk1Var = (vk1) obj;
        return this.a == vk1Var.a && this.b == vk1Var.b && this.c == vk1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + s91.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ")";
    }
}
