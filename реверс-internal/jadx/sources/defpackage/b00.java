package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b00 {
    public static final b00 e;
    public static final b00 f;
    public static final b00 g;
    public static final /* synthetic */ b00[] h;

    static {
        b00 b00Var = new b00("Yes", 0);
        e = b00Var;
        b00 b00Var2 = new b00("No", 1);
        f = b00Var2;
        b00 b00Var3 = new b00("NotInitialized", 2);
        g = b00Var3;
        h = new b00[]{b00Var, b00Var2, b00Var3};
    }

    public static b00 valueOf(String str) {
        return (b00) Enum.valueOf(b00.class, str);
    }

    public static b00[] values() {
        return (b00[]) h.clone();
    }
}
