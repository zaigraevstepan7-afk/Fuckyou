package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x51 {
    public static final x51 e;
    public static final x51 f;
    public static final x51 g;
    public static final x51 h;
    public static final x51 i;
    public static final x51 j;
    public static final x51 k;
    public static final /* synthetic */ x51[] l;

    static {
        x51 x51Var = new x51("Invalid", 0);
        e = x51Var;
        x51 x51Var2 = new x51("Cancelled", 1);
        f = x51Var2;
        x51 x51Var3 = new x51("InitialPending", 2);
        g = x51Var3;
        x51 x51Var4 = new x51("RecomposePending", 3);
        h = x51Var4;
        x51 x51Var5 = new x51("Recomposing", 4);
        i = x51Var5;
        x51 x51Var6 = new x51("ApplyPending", 5);
        j = x51Var6;
        x51 x51Var7 = new x51("Applied", 6);
        k = x51Var7;
        l = new x51[]{x51Var, x51Var2, x51Var3, x51Var4, x51Var5, x51Var6, x51Var7};
    }

    public static x51 valueOf(String str) {
        return (x51) Enum.valueOf(x51.class, str);
    }

    public static x51[] values() {
        return (x51[]) l.clone();
    }
}
