package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ri0 {
    public static final ri0 e;
    public static final ri0 f;
    public static final /* synthetic */ ri0[] g;

    static {
        ri0 ri0Var = new ri0("Min", 0);
        e = ri0Var;
        ri0 ri0Var2 = new ri0("Max", 1);
        f = ri0Var2;
        g = new ri0[]{ri0Var, ri0Var2};
    }

    public static ri0 valueOf(String str) {
        return (ri0) Enum.valueOf(ri0.class, str);
    }

    public static ri0[] values() {
        return (ri0[]) g.clone();
    }
}
