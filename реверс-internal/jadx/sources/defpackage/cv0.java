package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cv0 {
    public static final cv0 e;
    public static final cv0 f;
    public static final /* synthetic */ cv0[] g;

    static {
        cv0 cv0Var = new cv0("Width", 0);
        e = cv0Var;
        cv0 cv0Var2 = new cv0("Height", 1);
        f = cv0Var2;
        g = new cv0[]{cv0Var, cv0Var2};
    }

    public static cv0 valueOf(String str) {
        return (cv0) Enum.valueOf(cv0.class, str);
    }

    public static cv0[] values() {
        return (cv0[]) g.clone();
    }
}
