package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class my0 {
    public static final my0 e;
    public static final /* synthetic */ my0[] f;

    static {
        my0 my0Var = new my0("Default", 0);
        e = my0Var;
        f = new my0[]{my0Var, new my0("UserInput", 1), new my0("PreventUserInput", 2)};
    }

    public static my0 valueOf(String str) {
        return (my0) Enum.valueOf(my0.class, str);
    }

    public static my0[] values() {
        return (my0[]) f.clone();
    }
}
