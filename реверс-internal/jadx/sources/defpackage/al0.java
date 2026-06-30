package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class al0 {
    public static final al0 e;
    public static final al0 f;
    public static final /* synthetic */ al0[] g;

    static {
        al0 al0Var = new al0("Ltr", 0);
        e = al0Var;
        al0 al0Var2 = new al0("Rtl", 1);
        f = al0Var2;
        g = new al0[]{al0Var, al0Var2};
    }

    public static al0 valueOf(String str) {
        return (al0) Enum.valueOf(al0.class, str);
    }

    public static al0[] values() {
        return (al0[]) g.clone();
    }
}
