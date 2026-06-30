package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x4 {
    public static final x4 e;
    public static final x4 f;
    public static final /* synthetic */ x4[] g;

    static {
        x4 x4Var = new x4("SHOW_ORIGINAL", 0);
        e = x4Var;
        x4 x4Var2 = new x4("SHOW_TRANSLATED", 1);
        f = x4Var2;
        g = new x4[]{x4Var, x4Var2};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) g.clone();
    }
}
