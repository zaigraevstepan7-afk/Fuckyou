package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ly0 {
    public static final ly0 e;
    public static final ly0 f;
    public static final /* synthetic */ ly0[] g;

    static {
        ly0 ly0Var = new ly0("Default", 0);
        e = ly0Var;
        ly0 ly0Var2 = new ly0("UserInput", 1);
        f = ly0Var2;
        g = new ly0[]{ly0Var, ly0Var2, new ly0("PreventUserInput", 2)};
    }

    public static ly0 valueOf(String str) {
        return (ly0) Enum.valueOf(ly0.class, str);
    }

    public static ly0[] values() {
        return (ly0[]) g.clone();
    }
}
