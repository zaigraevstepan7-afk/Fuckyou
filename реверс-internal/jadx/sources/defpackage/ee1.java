package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 {
    public static final ee1 e;
    public static final ee1 f;
    public static final /* synthetic */ ee1[] g;

    static {
        ee1 ee1Var = new ee1("Ltr", 0);
        e = ee1Var;
        ee1 ee1Var2 = new ee1("Rtl", 1);
        f = ee1Var2;
        g = new ee1[]{ee1Var, ee1Var2};
    }

    public static ee1 valueOf(String str) {
        return (ee1) Enum.valueOf(ee1.class, str);
    }

    public static ee1[] values() {
        return (ee1[]) g.clone();
    }
}
