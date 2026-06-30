package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ol0 {
    public static final ol0 e;
    public static final ol0 f;
    public static final ol0 g;
    public static final /* synthetic */ ol0[] h;

    static {
        ol0 ol0Var = new ol0("InMeasureBlock", 0);
        e = ol0Var;
        ol0 ol0Var2 = new ol0("InLayoutBlock", 1);
        f = ol0Var2;
        ol0 ol0Var3 = new ol0("NotUsed", 2);
        g = ol0Var3;
        h = new ol0[]{ol0Var, ol0Var2, ol0Var3};
    }

    public static ol0 valueOf(String str) {
        return (ol0) Enum.valueOf(ol0.class, str);
    }

    public static ol0[] values() {
        return (ol0[]) h.clone();
    }
}
