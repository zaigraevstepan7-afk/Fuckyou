package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p52 {
    public static final p52 e;
    public static final p52 f;
    public static final /* synthetic */ p52[] g;

    static {
        p52 p52Var = new p52("Lsq2", 0);
        e = p52Var;
        p52 p52Var2 = new p52("Impulse", 1);
        f = p52Var2;
        g = new p52[]{p52Var, p52Var2};
    }

    public static p52 valueOf(String str) {
        return (p52) Enum.valueOf(p52.class, str);
    }

    public static p52[] values() {
        return (p52[]) g.clone();
    }
}
