package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g12 {
    public final double a;
    public final double b;
    public final ld0 c;

    public g12(double d, double d2, ld0 ld0Var) {
        this.a = d;
        this.b = d2;
        this.c = ld0Var;
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g12)) {
            return false;
        }
        g12 g12Var = (g12) obj;
        return Double.compare(this.a, g12Var.a) == 0 && Double.compare(this.b, g12Var.b) == 0 && this.c.equals(g12Var.c);
    }

    public final int hashCode() {
        return ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31) + this.c.a;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.a + ", chroma=" + this.b + ", keyColor=" + this.c + ")";
    }
}
