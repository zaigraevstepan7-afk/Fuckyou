package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 {
    public static final qo0 e;
    public static final qo0 f;
    public static final qo0 g;
    public static final qo0 h;
    public static final qo0 i;
    public static final /* synthetic */ qo0[] j;

    static {
        qo0 qo0Var = new qo0("DESTROYED", 0);
        e = qo0Var;
        qo0 qo0Var2 = new qo0("INITIALIZED", 1);
        f = qo0Var2;
        qo0 qo0Var3 = new qo0("CREATED", 2);
        g = qo0Var3;
        qo0 qo0Var4 = new qo0("STARTED", 3);
        h = qo0Var4;
        qo0 qo0Var5 = new qo0("RESUMED", 4);
        i = qo0Var5;
        j = new qo0[]{qo0Var, qo0Var2, qo0Var3, qo0Var4, qo0Var5};
    }

    public static qo0 valueOf(String str) {
        return (qo0) Enum.valueOf(qo0.class, str);
    }

    public static qo0[] values() {
        return (qo0[]) j.clone();
    }
}
