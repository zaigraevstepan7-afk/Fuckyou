package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pr {
    public static final pr e;
    public static final pr f;
    public static final /* synthetic */ pr[] g;

    static {
        pr prVar = new pr("VIEW_APPEAR", 0);
        e = prVar;
        pr prVar2 = new pr("VIEW_DISAPPEAR", 1);
        f = prVar2;
        g = new pr[]{prVar, prVar2};
    }

    public static pr valueOf(String str) {
        return (pr) Enum.valueOf(pr.class, str);
    }

    public static pr[] values() {
        return (pr[]) g.clone();
    }
}
