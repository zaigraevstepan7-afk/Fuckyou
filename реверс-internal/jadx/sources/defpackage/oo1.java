package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 {
    public static final oo1 e;
    public static final oo1 f;
    public static final /* synthetic */ oo1[] g;

    static {
        oo1 oo1Var = new oo1("THUMB", 0);
        e = oo1Var;
        oo1 oo1Var2 = new oo1("TRACK", 1);
        f = oo1Var2;
        g = new oo1[]{oo1Var, oo1Var2};
    }

    public static oo1 valueOf(String str) {
        return (oo1) Enum.valueOf(oo1.class, str);
    }

    public static oo1[] values() {
        return (oo1[]) g.clone();
    }
}
