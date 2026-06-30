package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v80 {
    public static final v80 e;
    public static final v80 f;
    public static final v80 g;
    public static final /* synthetic */ v80[] h;

    static {
        v80 v80Var = new v80("Active", 0);
        e = v80Var;
        v80 v80Var2 = new v80("ActiveParent", 1);
        f = v80Var2;
        v80 v80Var3 = new v80("Captured", 2);
        v80 v80Var4 = new v80("Inactive", 3);
        g = v80Var4;
        h = new v80[]{v80Var, v80Var2, v80Var3, v80Var4};
    }

    public static v80 valueOf(String str) {
        return (v80) Enum.valueOf(v80.class, str);
    }

    public static v80[] values() {
        return (v80[]) h.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                ez1.a();
                return false;
            }
        }
        return true;
    }
}
