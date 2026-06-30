package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f01 {
    public static final f01 e;
    public static final f01 f;
    public static final /* synthetic */ f01[] g;

    static {
        f01 f01Var = new f01("Min", 0);
        e = f01Var;
        f01 f01Var2 = new f01("Max", 1);
        f = f01Var2;
        g = new f01[]{f01Var, f01Var2};
    }

    public static f01 valueOf(String str) {
        return (f01) Enum.valueOf(f01.class, str);
    }

    public static f01[] values() {
        return (f01[]) g.clone();
    }
}
