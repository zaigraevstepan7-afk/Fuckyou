package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 {
    public static final nj0 e;
    public static final nj0 f;
    public static final nj0 g;
    public static final nj0 h;
    public static final nj0 i;
    public static final nj0 j;
    public static final nj0 k;
    public static final nj0 l;
    public static final nj0 m;
    public static final nj0 n;
    public static final /* synthetic */ nj0[] o;

    static {
        nj0 nj0Var = new nj0("VOID", 0);
        e = nj0Var;
        nj0 nj0Var2 = new nj0("INT", 1);
        f = nj0Var2;
        nj0 nj0Var3 = new nj0("LONG", 2);
        g = nj0Var3;
        nj0 nj0Var4 = new nj0("FLOAT", 3);
        h = nj0Var4;
        nj0 nj0Var5 = new nj0("DOUBLE", 4);
        i = nj0Var5;
        nj0 nj0Var6 = new nj0("BOOLEAN", 5);
        j = nj0Var6;
        nj0 nj0Var7 = new nj0("STRING", 6);
        k = nj0Var7;
        ji jiVar = ji.g;
        nj0 nj0Var8 = new nj0("BYTE_STRING", 7);
        l = nj0Var8;
        nj0 nj0Var9 = new nj0("ENUM", 8);
        m = nj0Var9;
        nj0 nj0Var10 = new nj0("MESSAGE", 9);
        n = nj0Var10;
        o = new nj0[]{nj0Var, nj0Var2, nj0Var3, nj0Var4, nj0Var5, nj0Var6, nj0Var7, nj0Var8, nj0Var9, nj0Var10};
    }

    public static nj0 valueOf(String str) {
        return (nj0) Enum.valueOf(nj0.class, str);
    }

    public static nj0[] values() {
        return (nj0[]) o.clone();
    }
}
