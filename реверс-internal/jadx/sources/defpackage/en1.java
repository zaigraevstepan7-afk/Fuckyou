package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class en1 {
    public static final en1 e;
    public static final en1 f;
    public static final en1 g;
    public static final en1 h;
    public static final en1 i;
    public static final en1 j;
    public static final /* synthetic */ en1[] k;

    /* JADX INFO: Fake field, exist only in values array */
    en1 EF0;

    static {
        en1 en1Var = new en1("CornerExtraExtraLarge", 0);
        en1 en1Var2 = new en1("CornerExtraLarge", 1);
        en1 en1Var3 = new en1("CornerExtraLargeIncreased", 2);
        en1 en1Var4 = new en1("CornerExtraLargeTop", 3);
        en1 en1Var5 = new en1("CornerExtraSmall", 4);
        e = en1Var5;
        en1 en1Var6 = new en1("CornerExtraSmallTop", 5);
        f = en1Var6;
        en1 en1Var7 = new en1("CornerFull", 6);
        g = en1Var7;
        en1 en1Var8 = new en1("CornerLarge", 7);
        h = en1Var8;
        en1 en1Var9 = new en1("CornerLargeEnd", 8);
        en1 en1Var10 = new en1("CornerLargeIncreased", 9);
        en1 en1Var11 = new en1("CornerLargeStart", 10);
        en1 en1Var12 = new en1("CornerLargeTop", 11);
        en1 en1Var13 = new en1("CornerMedium", 12);
        i = en1Var13;
        en1 en1Var14 = new en1("CornerNone", 13);
        en1 en1Var15 = new en1("CornerSmall", 14);
        j = en1Var15;
        k = new en1[]{en1Var, en1Var2, en1Var3, en1Var4, en1Var5, en1Var6, en1Var7, en1Var8, en1Var9, en1Var10, en1Var11, en1Var12, en1Var13, en1Var14, en1Var15};
    }

    public static en1 valueOf(String str) {
        return (en1) Enum.valueOf(en1.class, str);
    }

    public static en1[] values() {
        return (en1[]) k.clone();
    }
}
