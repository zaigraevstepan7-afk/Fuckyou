package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ch0 {
    public static final ch0 e;
    public static final ch0 f;
    public static final ch0 g;
    public static final /* synthetic */ ch0[] h;

    static {
        ch0 ch0Var = new ch0("Focused", 0);
        e = ch0Var;
        ch0 ch0Var2 = new ch0("UnfocusedEmpty", 1);
        f = ch0Var2;
        ch0 ch0Var3 = new ch0("UnfocusedNotEmpty", 2);
        g = ch0Var3;
        h = new ch0[]{ch0Var, ch0Var2, ch0Var3};
    }

    public static ch0 valueOf(String str) {
        return (ch0) Enum.valueOf(ch0.class, str);
    }

    public static ch0[] values() {
        return (ch0[]) h.clone();
    }
}
