package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f81 {
    public static final f81 e;
    public static final f81 f;
    public static final f81 g;
    public static final /* synthetic */ f81[] h;

    static {
        f81 f81Var = new f81("Initial", 0);
        e = f81Var;
        f81 f81Var2 = new f81("Main", 1);
        f = f81Var2;
        f81 f81Var3 = new f81("Final", 2);
        g = f81Var3;
        h = new f81[]{f81Var, f81Var2, f81Var3};
    }

    public static f81 valueOf(String str) {
        return (f81) Enum.valueOf(f81.class, str);
    }

    public static f81[] values() {
        return (f81[]) h.clone();
    }
}
