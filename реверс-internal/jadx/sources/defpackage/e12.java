package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e12 {
    public static final e12 e;
    public static final e12 f;
    public static final /* synthetic */ e12[] g;

    static {
        e12 e12Var = new e12("On", 0);
        e = e12Var;
        e12 e12Var2 = new e12("Off", 1);
        f = e12Var2;
        g = new e12[]{e12Var, e12Var2, new e12("Indeterminate", 2)};
    }

    public static e12 valueOf(String str) {
        return (e12) Enum.valueOf(e12.class, str);
    }

    public static e12[] values() {
        return (e12[]) g.clone();
    }
}
