package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cd0 {
    public static final cd0 e;
    public static final cd0 f;
    public static final cd0 g;
    public static final /* synthetic */ cd0[] h;

    static {
        cd0 cd0Var = new cd0("None", 0);
        e = cd0Var;
        cd0 cd0Var2 = new cd0("Selection", 1);
        f = cd0Var2;
        cd0 cd0Var3 = new cd0("Cursor", 2);
        g = cd0Var3;
        h = new cd0[]{cd0Var, cd0Var2, cd0Var3};
    }

    public static cd0 valueOf(String str) {
        return (cd0) Enum.valueOf(cd0.class, str);
    }

    public static cd0[] values() {
        return (cd0[]) h.clone();
    }
}
