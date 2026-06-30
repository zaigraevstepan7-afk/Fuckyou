package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 {
    public static final qi0 e;
    public static final qi0 f;
    public static final /* synthetic */ qi0[] g;

    static {
        qi0 qi0Var = new qi0("Min", 0);
        e = qi0Var;
        qi0 qi0Var2 = new qi0("Max", 1);
        f = qi0Var2;
        g = new qi0[]{qi0Var, qi0Var2};
    }

    public static qi0 valueOf(String str) {
        return (qi0) Enum.valueOf(qi0.class, str);
    }

    public static qi0[] values() {
        return (qi0[]) g.clone();
    }
}
