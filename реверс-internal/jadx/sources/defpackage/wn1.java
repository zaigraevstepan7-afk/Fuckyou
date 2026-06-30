package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wn1 {
    public static final wn1 e;
    public static final wn1 f;
    public static final wn1 g;
    public static final /* synthetic */ wn1[] h;

    static {
        wn1 wn1Var = new wn1("START", 0);
        e = wn1Var;
        wn1 wn1Var2 = new wn1("STOP", 1);
        f = wn1Var2;
        wn1 wn1Var3 = new wn1("STOP_AND_RESET_REPLAY_CACHE", 2);
        g = wn1Var3;
        h = new wn1[]{wn1Var, wn1Var2, wn1Var3};
    }

    public static wn1 valueOf(String str) {
        return (wn1) Enum.valueOf(wn1.class, str);
    }

    public static wn1[] values() {
        return (wn1[]) h.clone();
    }
}
