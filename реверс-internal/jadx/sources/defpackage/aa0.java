package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class aa0 implements Comparable {
    public static final aa0 f;
    public static final aa0 g;
    public static final aa0 h;
    public static final aa0 i;
    public static final aa0 j;
    public final int e;

    static {
        aa0 aa0Var = new aa0(100);
        aa0 aa0Var2 = new aa0(200);
        aa0 aa0Var3 = new aa0(300);
        aa0 aa0Var4 = new aa0(400);
        aa0 aa0Var5 = new aa0(500);
        aa0 aa0Var6 = new aa0(600);
        f = aa0Var6;
        aa0 aa0Var7 = new aa0(700);
        aa0 aa0Var8 = new aa0(800);
        aa0 aa0Var9 = new aa0(900);
        g = aa0Var4;
        h = aa0Var5;
        i = aa0Var6;
        j = aa0Var7;
        hk.H(aa0Var, aa0Var2, aa0Var3, aa0Var4, aa0Var5, aa0Var6, aa0Var7, aa0Var8, aa0Var9);
    }

    public aa0(int i2) {
        this.e = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        og0.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return xi0.t(this.e, ((aa0) obj).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aa0) {
            return this.e == ((aa0) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return s91.h(this.e, "FontWeight(weight=", ")");
    }
}
