package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 {
    public static final gj0 e;
    public static final gj0 f;
    public static final gj0 g;
    public static final gj0 h;
    public static final /* synthetic */ gj0[] i;

    static {
        gj0 gj0Var = new gj0("LookaheadMeasurement", 0);
        e = gj0Var;
        gj0 gj0Var2 = new gj0("LookaheadPlacement", 1);
        f = gj0Var2;
        gj0 gj0Var3 = new gj0("Measurement", 2);
        g = gj0Var3;
        gj0 gj0Var4 = new gj0("Placement", 3);
        h = gj0Var4;
        i = new gj0[]{gj0Var, gj0Var2, gj0Var3, gj0Var4};
    }

    public static gj0 valueOf(String str) {
        return (gj0) Enum.valueOf(gj0.class, str);
    }

    public static gj0[] values() {
        return (gj0[]) i.clone();
    }
}
