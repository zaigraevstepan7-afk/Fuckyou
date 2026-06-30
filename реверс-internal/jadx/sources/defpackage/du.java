package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class du {
    public static final du e;
    public static final du f;
    public static final du g;
    public static final /* synthetic */ du[] h;

    static {
        du duVar = new du("CROSSED", 0);
        e = duVar;
        du duVar2 = new du("NOT_CROSSED", 1);
        f = duVar2;
        du duVar3 = new du("COLLAPSED", 2);
        g = duVar3;
        h = new du[]{duVar, duVar2, duVar3};
    }

    public static du valueOf(String str) {
        return (du) Enum.valueOf(du.class, str);
    }

    public static du[] values() {
        return (du[]) h.clone();
    }
}
