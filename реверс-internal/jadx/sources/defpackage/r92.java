package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r92 {
    public static final r92 e;
    public static final r92 f;
    public static final r92 g;
    public static final r92 h;
    public static final r92 i;
    public static final r92 j;
    public static final r92 k;
    public static final r92 l;
    public static final r92 m;
    public static final /* synthetic */ r92[] n;

    static {
        r92 r92Var = new r92("INT", 0);
        e = r92Var;
        r92 r92Var2 = new r92("LONG", 1);
        f = r92Var2;
        r92 r92Var3 = new r92("FLOAT", 2);
        g = r92Var3;
        r92 r92Var4 = new r92("DOUBLE", 3);
        h = r92Var4;
        r92 r92Var5 = new r92("BOOLEAN", 4);
        i = r92Var5;
        r92 r92Var6 = new r92("STRING", 5);
        j = r92Var6;
        ji jiVar = ji.g;
        r92 r92Var7 = new r92("BYTE_STRING", 6);
        k = r92Var7;
        r92 r92Var8 = new r92("ENUM", 7);
        l = r92Var8;
        r92 r92Var9 = new r92("MESSAGE", 8);
        m = r92Var9;
        n = new r92[]{r92Var, r92Var2, r92Var3, r92Var4, r92Var5, r92Var6, r92Var7, r92Var8, r92Var9};
    }

    public static r92 valueOf(String str) {
        return (r92) Enum.valueOf(r92.class, str);
    }

    public static r92[] values() {
        return (r92[]) n.clone();
    }
}
