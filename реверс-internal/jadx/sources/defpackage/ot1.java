package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 {
    public static final ot1 e;
    public static final ot1 f;
    public static final ot1 g;
    public static final ot1 h;
    public static final ot1 i;
    public static final ot1 j;
    public static final /* synthetic */ ot1[] k;

    static {
        ot1 ot1Var = new ot1("Untouched", 0);
        e = ot1Var;
        ot1 ot1Var2 = new ot1("Unchanged", 1);
        f = ot1Var2;
        ot1 ot1Var3 = new ot1("Changed", 2);
        g = ot1Var3;
        ot1 ot1Var4 = new ot1("Inserted", 3);
        h = ot1Var4;
        ot1 ot1Var5 = new ot1("Interrupted", 4);
        i = ot1Var5;
        ot1 ot1Var6 = new ot1("Removing", 5);
        j = ot1Var6;
        k = new ot1[]{ot1Var, ot1Var2, ot1Var3, ot1Var4, ot1Var5, ot1Var6};
    }

    public static ot1 valueOf(String str) {
        return (ot1) Enum.valueOf(ot1.class, str);
    }

    public static ot1[] values() {
        return (ot1[]) k.clone();
    }
}
