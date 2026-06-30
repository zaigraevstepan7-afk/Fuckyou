package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ml0 {
    public static final ml0 e;
    public static final ml0 f;
    public static final ml0 g;
    public static final ml0 h;
    public static final ml0 i;
    public static final /* synthetic */ ml0[] j;

    static {
        ml0 ml0Var = new ml0("Measuring", 0);
        e = ml0Var;
        ml0 ml0Var2 = new ml0("LookaheadMeasuring", 1);
        f = ml0Var2;
        ml0 ml0Var3 = new ml0("LayingOut", 2);
        g = ml0Var3;
        ml0 ml0Var4 = new ml0("LookaheadLayingOut", 3);
        h = ml0Var4;
        ml0 ml0Var5 = new ml0("Idle", 4);
        i = ml0Var5;
        j = new ml0[]{ml0Var, ml0Var2, ml0Var3, ml0Var4, ml0Var5};
    }

    public static ml0 valueOf(String str) {
        return (ml0) Enum.valueOf(ml0.class, str);
    }

    public static ml0[] values() {
        return (ml0[]) j.clone();
    }
}
