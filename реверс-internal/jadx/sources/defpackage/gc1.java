package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gc1 {
    public static final gc1 e;
    public static final gc1 f;
    public static final gc1 g;
    public static final gc1 h;
    public static final gc1 i;
    public static final gc1 j;
    public static final /* synthetic */ gc1[] k;

    static {
        gc1 gc1Var = new gc1("ShutDown", 0);
        e = gc1Var;
        gc1 gc1Var2 = new gc1("ShuttingDown", 1);
        f = gc1Var2;
        gc1 gc1Var3 = new gc1("Inactive", 2);
        g = gc1Var3;
        gc1 gc1Var4 = new gc1("InactivePendingWork", 3);
        h = gc1Var4;
        gc1 gc1Var5 = new gc1("Idle", 4);
        i = gc1Var5;
        gc1 gc1Var6 = new gc1("PendingWork", 5);
        j = gc1Var6;
        k = new gc1[]{gc1Var, gc1Var2, gc1Var3, gc1Var4, gc1Var5, gc1Var6};
    }

    public static gc1 valueOf(String str) {
        return (gc1) Enum.valueOf(gc1.class, str);
    }

    public static gc1[] values() {
        return (gc1[]) k.clone();
    }
}
