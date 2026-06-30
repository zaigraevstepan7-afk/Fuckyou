package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k31 {
    public static final k31 e;
    public static final k31 f;
    public static final /* synthetic */ k31[] g;

    static {
        k31 k31Var = new k31("Vertical", 0);
        e = k31Var;
        k31 k31Var2 = new k31("Horizontal", 1);
        f = k31Var2;
        g = new k31[]{k31Var, k31Var2};
    }

    public static k31 valueOf(String str) {
        return (k31) Enum.valueOf(k31.class, str);
    }

    public static k31[] values() {
        return (k31[]) g.clone();
    }
}
