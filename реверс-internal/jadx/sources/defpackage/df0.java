package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class df0 {
    public static final df0 g = new df0(false, 0, true, 1, 1, as0.g);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final as0 f;

    public df0(boolean z, int i, boolean z2, int i2, int i3, as0 as0Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = as0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df0)) {
            return false;
        }
        df0 df0Var = (df0) obj;
        return this.a == df0Var.a && this.b == df0Var.b && this.c == df0Var.c && this.d == df0Var.d && this.e == df0Var.e && xi0.o(this.f, df0Var.f);
    }

    public final int hashCode() {
        return this.f.e.hashCode() + s91.b(this.e, s91.b(this.d, s91.d(s91.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + mk0.a(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + lk.n0(this.d) + ", imeAction=" + cf0.a(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
