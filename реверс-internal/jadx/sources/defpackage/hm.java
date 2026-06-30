package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hm {
    public static final hm e;
    public static final hm f;
    public static final /* synthetic */ hm[] g;

    static {
        hm hmVar = new hm("SPEC_2021", 0);
        e = hmVar;
        hm hmVar2 = new hm("SPEC_2025", 1);
        f = hmVar2;
        g = new hm[]{hmVar, hmVar2};
    }

    public static hm valueOf(String str) {
        return (hm) Enum.valueOf(hm.class, str);
    }

    public static hm[] values() {
        return (hm[]) g.clone();
    }
}
