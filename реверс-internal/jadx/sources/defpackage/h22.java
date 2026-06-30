package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h22 {
    public static final h22 e;
    public static final h22 f;
    public static final h22 g;
    public static final /* synthetic */ h22[] h;

    static {
        h22 h22Var = new h22("ContinueTraversal", 0);
        e = h22Var;
        h22 h22Var2 = new h22("SkipSubtreeAndContinueTraversal", 1);
        f = h22Var2;
        h22 h22Var3 = new h22("CancelTraversal", 2);
        g = h22Var3;
        h = new h22[]{h22Var, h22Var2, h22Var3};
    }

    public static h22 valueOf(String str) {
        return (h22) Enum.valueOf(h22.class, str);
    }

    public static h22[] values() {
        return (h22[]) h.clone();
    }
}
