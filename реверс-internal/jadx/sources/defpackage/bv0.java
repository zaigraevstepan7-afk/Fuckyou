package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bv0 {
    public static final bv0 e;
    public static final bv0 f;
    public static final /* synthetic */ bv0[] g;

    static {
        bv0 bv0Var = new bv0("Min", 0);
        e = bv0Var;
        bv0 bv0Var2 = new bv0("Max", 1);
        f = bv0Var2;
        g = new bv0[]{bv0Var, bv0Var2};
    }

    public static bv0 valueOf(String str) {
        return (bv0) Enum.valueOf(bv0.class, str);
    }

    public static bv0[] values() {
        return (bv0[]) g.clone();
    }
}
