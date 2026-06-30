package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class at0 {
    public static final at0 e;
    public static final at0 f;
    public static final at0 g;
    public static final /* synthetic */ at0[] h;

    static {
        at0 at0Var = new at0("IsPlacedInLookahead", 0);
        e = at0Var;
        at0 at0Var2 = new at0("IsPlacedInApproach", 1);
        f = at0Var2;
        at0 at0Var3 = new at0("IsNotPlaced", 2);
        g = at0Var3;
        h = new at0[]{at0Var, at0Var2, at0Var3};
    }

    public static at0 valueOf(String str) {
        return (at0) Enum.valueOf(at0.class, str);
    }

    public static at0[] values() {
        return (at0[]) h.clone();
    }
}
