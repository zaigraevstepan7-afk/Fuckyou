package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m41 {
    public final v6 a;
    public final int b;
    public final int c;

    public m41(v6 v6Var, int i, int i2) {
        this.a = v6Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m41) {
            m41 m41Var = (m41) obj;
            if (this.a == m41Var.a && this.b == m41Var.b && this.c == m41Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + s91.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ")";
    }
}
