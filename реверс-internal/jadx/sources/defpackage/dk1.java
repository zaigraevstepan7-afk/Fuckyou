package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dk1 {
    public static final dk1 e;
    public static final dk1 f;
    public static final /* synthetic */ dk1[] g;

    static {
        dk1 dk1Var = new dk1("Inherit", 0);
        e = dk1Var;
        dk1 dk1Var2 = new dk1("SecureOn", 1);
        f = dk1Var2;
        g = new dk1[]{dk1Var, dk1Var2, new dk1("SecureOff", 2)};
    }

    public static dk1 valueOf(String str) {
        return (dk1) Enum.valueOf(dk1.class, str);
    }

    public static dk1[] values() {
        return (dk1[]) g.clone();
    }
}
