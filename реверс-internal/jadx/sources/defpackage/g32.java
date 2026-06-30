package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g32 {
    public static final g32 e;
    public static final g32 f;
    public static final g32 g;
    public static final g32 h;
    public static final g32 i;
    public static final /* synthetic */ g32[] j;

    static {
        g32 g32Var = new g32("BodyLarge", 0);
        e = g32Var;
        g32 g32Var2 = new g32("BodyMedium", 1);
        f = g32Var2;
        g32 g32Var3 = new g32("BodySmall", 2);
        g32 g32Var4 = new g32("DisplayLarge", 3);
        g32 g32Var5 = new g32("DisplayMedium", 4);
        g32 g32Var6 = new g32("DisplaySmall", 5);
        g32 g32Var7 = new g32("HeadlineLarge", 6);
        g32 g32Var8 = new g32("HeadlineMedium", 7);
        g32 g32Var9 = new g32("HeadlineSmall", 8);
        g32 g32Var10 = new g32("LabelLarge", 9);
        g = g32Var10;
        g32 g32Var11 = new g32("LabelMedium", 10);
        g32 g32Var12 = new g32("LabelSmall", 11);
        h = g32Var12;
        g32 g32Var13 = new g32("TitleLarge", 12);
        g32 g32Var14 = new g32("TitleMedium", 13);
        i = g32Var14;
        j = new g32[]{g32Var, g32Var2, g32Var3, g32Var4, g32Var5, g32Var6, g32Var7, g32Var8, g32Var9, g32Var10, g32Var11, g32Var12, g32Var13, g32Var14, new g32("TitleSmall", 14), new g32("BodyLargeEmphasized", 15), new g32("BodyMediumEmphasized", 16), new g32("BodySmallEmphasized", 17), new g32("DisplayLargeEmphasized", 18), new g32("DisplayMediumEmphasized", 19), new g32("DisplaySmallEmphasized", 20), new g32("HeadlineLargeEmphasized", 21), new g32("HeadlineMediumEmphasized", 22), new g32("HeadlineSmallEmphasized", 23), new g32("LabelLargeEmphasized", 24), new g32("LabelMediumEmphasized", 25), new g32("LabelSmallEmphasized", 26), new g32("TitleLargeEmphasized", 27), new g32("TitleMediumEmphasized", 28), new g32("TitleSmallEmphasized", 29)};
    }

    public static g32 valueOf(String str) {
        return (g32) Enum.valueOf(g32.class, str);
    }

    public static g32[] values() {
        return (g32[]) j.clone();
    }
}
