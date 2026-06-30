package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wk1 {
    public final vk1 a;
    public final vk1 b;
    public final boolean c;

    public wk1(vk1 vk1Var, vk1 vk1Var2, boolean z) {
        this.a = vk1Var;
        this.b = vk1Var2;
        this.c = z;
    }

    public static wk1 a(wk1 wk1Var, vk1 vk1Var, vk1 vk1Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            vk1Var = wk1Var.a;
        }
        if ((i & 2) != 0) {
            vk1Var2 = wk1Var.b;
        }
        wk1Var.getClass();
        return new wk1(vk1Var, vk1Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk1)) {
            return false;
        }
        wk1 wk1Var = (wk1) obj;
        return xi0.o(this.a, wk1Var.a) && xi0.o(this.b, wk1Var.b) && this.c == wk1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ")";
    }
}
