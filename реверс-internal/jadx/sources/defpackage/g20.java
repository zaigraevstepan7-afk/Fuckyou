package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g20 {
    public static final wr e;
    public static final g20 f;
    public static final g20 g;
    public static final g20 h;
    public static final /* synthetic */ g20[] i;

    static {
        g20 g20Var = new g20("PHONE", 0);
        g = g20Var;
        g20 g20Var2 = new g20("WATCH", 1);
        h = g20Var2;
        i = new g20[]{g20Var, g20Var2};
        e = new wr(6);
        f = g20Var;
    }

    public static g20 valueOf(String str) {
        return (g20) Enum.valueOf(g20.class, str);
    }

    public static g20[] values() {
        return (g20[]) i.clone();
    }
}
