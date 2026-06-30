package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ij0 {
    public static final ij0 e;
    public static final ij0 f;
    public static final ij0 g;
    public static final ij0 h;
    public static final /* synthetic */ ij0[] i;

    static {
        ij0 ij0Var = new ij0("IGNORED", 0);
        e = ij0Var;
        ij0 ij0Var2 = new ij0("SCHEDULED", 1);
        f = ij0Var2;
        ij0 ij0Var3 = new ij0("DEFERRED", 2);
        g = ij0Var3;
        ij0 ij0Var4 = new ij0("IMMINENT", 3);
        h = ij0Var4;
        i = new ij0[]{ij0Var, ij0Var2, ij0Var3, ij0Var4};
    }

    public static ij0 valueOf(String str) {
        return (ij0) Enum.valueOf(ij0.class, str);
    }

    public static ij0[] values() {
        return (ij0[]) i.clone();
    }
}
