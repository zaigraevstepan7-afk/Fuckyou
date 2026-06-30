package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 {
    public static final iz1 e;
    public static final iz1 f;
    public static final iz1 g;
    public static final iz1 h;
    public static final /* synthetic */ iz1[] i;

    static {
        iz1 iz1Var = new iz1("StartInput", 0);
        e = iz1Var;
        iz1 iz1Var2 = new iz1("StopInput", 1);
        f = iz1Var2;
        iz1 iz1Var3 = new iz1("ShowKeyboard", 2);
        g = iz1Var3;
        iz1 iz1Var4 = new iz1("HideKeyboard", 3);
        h = iz1Var4;
        i = new iz1[]{iz1Var, iz1Var2, iz1Var3, iz1Var4};
    }

    public static iz1 valueOf(String str) {
        return (iz1) Enum.valueOf(iz1.class, str);
    }

    public static iz1[] values() {
        return (iz1[]) i.clone();
    }
}
