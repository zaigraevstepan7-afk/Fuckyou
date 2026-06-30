package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c32 {
    public final lv1 a;
    public final aa0 b;
    public final int c;
    public final int d;
    public final Object e;

    public c32(lv1 lv1Var, aa0 aa0Var, int i, int i2, Object obj) {
        this.a = lv1Var;
        this.b = aa0Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c32)) {
            return false;
        }
        c32 c32Var = (c32) obj;
        return xi0.o(this.a, c32Var.a) && xi0.o(this.b, c32Var.b) && this.c == c32Var.c && this.d == c32Var.d && xi0.o(this.e, c32Var.e);
    }

    public final int hashCode() {
        lv1 lv1Var = this.a;
        int iB = s91.b(this.d, s91.b(this.c, (((lv1Var == null ? 0 : lv1Var.hashCode()) * 31) + this.b.e) * 31, 31), 31);
        Object obj = this.e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str = "Invalid";
        int i = this.c;
        String str2 = i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        s91.u(sb, str2, ", fontSynthesis=", str, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
