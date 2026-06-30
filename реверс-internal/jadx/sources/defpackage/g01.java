package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g01 {
    public static final g01 e;
    public static final g01 f;
    public static final /* synthetic */ g01[] g;

    static {
        g01 g01Var = new g01("Width", 0);
        e = g01Var;
        g01 g01Var2 = new g01("Height", 1);
        f = g01Var2;
        g = new g01[]{g01Var, g01Var2};
    }

    public static g01 valueOf(String str) {
        return (g01) Enum.valueOf(g01.class, str);
    }

    public static g01[] values() {
        return (g01[]) g.clone();
    }
}
