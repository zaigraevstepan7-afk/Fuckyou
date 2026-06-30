package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u30 {
    public final int a;

    public /* synthetic */ u30(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : s91.h(i, "Invalid(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u30) {
            return this.a == ((u30) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
