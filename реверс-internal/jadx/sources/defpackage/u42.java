package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u42 {
    public static final u42 e;
    public static final u42 f;
    public static final u42 g;
    public static final u42 h;
    public static final u42 i;
    public static final u42 j;
    public static final u42 k;
    public static final /* synthetic */ u42[] l;

    static {
        u42 u42Var = new u42("MONOCHROME", 0);
        e = u42Var;
        u42 u42Var2 = new u42("NEUTRAL", 1);
        f = u42Var2;
        u42 u42Var3 = new u42("TONAL_SPOT", 2);
        g = u42Var3;
        u42 u42Var4 = new u42("VIBRANT", 3);
        h = u42Var4;
        u42 u42Var5 = new u42("EXPRESSIVE", 4);
        i = u42Var5;
        u42 u42Var6 = new u42("FIDELITY", 5);
        j = u42Var6;
        u42 u42Var7 = new u42("CONTENT", 6);
        k = u42Var7;
        l = new u42[]{u42Var, u42Var2, u42Var3, u42Var4, u42Var5, u42Var6, u42Var7, new u42("RAINBOW", 7), new u42("FRUIT_SALAD", 8)};
    }

    public static u42 valueOf(String str) {
        return (u42) Enum.valueOf(u42.class, str);
    }

    public static u42[] values() {
        return (u42[]) l.clone();
    }
}
