package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b02 {
    public final String a;
    public String b;
    public boolean c = false;
    public o41 d = null;

    public b02(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b02)) {
            return false;
        }
        b02 b02Var = (b02) obj;
        return xi0.o(this.a, b02Var.a) && xi0.o(this.b, b02Var.b) && this.c == b02Var.c && xi0.o(this.d, b02Var.d);
    }

    public final int hashCode() {
        int iD = s91.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        o41 o41Var = this.d;
        return iD + (o41Var == null ? 0 : o41Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
