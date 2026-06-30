package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 {
    public static final fl1 e;
    public static final fl1 f;
    public static final fl1 g;
    public static final /* synthetic */ fl1[] h;

    static {
        fl1 fl1Var = new fl1("Left", 0);
        e = fl1Var;
        fl1 fl1Var2 = new fl1("Middle", 1);
        f = fl1Var2;
        fl1 fl1Var3 = new fl1("Right", 2);
        g = fl1Var3;
        h = new fl1[]{fl1Var, fl1Var2, fl1Var3};
    }

    public static fl1 valueOf(String str) {
        return (fl1) Enum.valueOf(fl1.class, str);
    }

    public static fl1[] values() {
        return (fl1[]) h.clone();
    }
}
