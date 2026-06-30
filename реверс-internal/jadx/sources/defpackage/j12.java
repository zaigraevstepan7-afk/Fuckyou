package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j12 {
    public static final j12 e;
    public static final j12 f;
    public static final j12 g;
    public static final j12 h;
    public static final j12 i;
    public static final /* synthetic */ j12[] j;

    static {
        j12 j12Var = new j12("DARKER", 0);
        e = j12Var;
        j12 j12Var2 = new j12("LIGHTER", 1);
        f = j12Var2;
        j12 j12Var3 = new j12("RELATIVE_DARKER", 2);
        g = j12Var3;
        j12 j12Var4 = new j12("RELATIVE_LIGHTER", 3);
        h = j12Var4;
        j12 j12Var5 = new j12("NEARER", 4);
        i = j12Var5;
        j = new j12[]{j12Var, j12Var2, j12Var3, j12Var4, j12Var5, new j12("FARTHER", 5)};
    }

    public static j12 valueOf(String str) {
        return (j12) Enum.valueOf(j12.class, str);
    }

    public static j12[] values() {
        return (j12[]) j.clone();
    }
}
