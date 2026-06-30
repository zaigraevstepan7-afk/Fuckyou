package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m71 {
    public static final m71 c = new m71(0, false);
    public final boolean a;
    public final int b;

    public m71() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m71)) {
            return false;
        }
        m71 m71Var = (m71) obj;
        return this.a == m71Var.a && this.b == m71Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + u30.a(this.b) + ")";
    }

    public m71(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
