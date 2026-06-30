package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ad0 {
    public static final ad0 e;
    public static final ad0 f;
    public static final ad0 g;
    public static final /* synthetic */ ad0[] h;

    static {
        ad0 ad0Var = new ad0("Cursor", 0);
        e = ad0Var;
        ad0 ad0Var2 = new ad0("SelectionStart", 1);
        f = ad0Var2;
        ad0 ad0Var3 = new ad0("SelectionEnd", 2);
        g = ad0Var3;
        h = new ad0[]{ad0Var, ad0Var2, ad0Var3};
    }

    public static ad0 valueOf(String str) {
        return (ad0) Enum.valueOf(ad0.class, str);
    }

    public static ad0[] values() {
        return (ad0[]) h.clone();
    }
}
