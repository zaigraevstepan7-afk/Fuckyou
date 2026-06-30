package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h12 {
    public static final h12 e;
    public static final h12 f;
    public static final /* synthetic */ h12[] g;

    static {
        h12 h12Var = new h12("EXACT", 0);
        e = h12Var;
        h12 h12Var2 = new h12("NEARER", 1);
        h12 h12Var3 = new h12("FARTHER", 2);
        f = h12Var3;
        g = new h12[]{h12Var, h12Var2, h12Var3};
    }

    public static h12 valueOf(String str) {
        return (h12) Enum.valueOf(h12.class, str);
    }

    public static h12[] values() {
        return (h12[]) g.clone();
    }
}
