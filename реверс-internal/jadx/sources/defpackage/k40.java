package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k40 {
    public static final k40 e;
    public static final k40 f;
    public static final k40 g;
    public static final /* synthetic */ k40[] h;

    static {
        k40 k40Var = new k40("PreEnter", 0);
        e = k40Var;
        k40 k40Var2 = new k40("Visible", 1);
        f = k40Var2;
        k40 k40Var3 = new k40("PostExit", 2);
        g = k40Var3;
        h = new k40[]{k40Var, k40Var2, k40Var3};
    }

    public static k40 valueOf(String str) {
        return (k40) Enum.valueOf(k40.class, str);
    }

    public static k40[] values() {
        return (k40[]) h.clone();
    }
}
