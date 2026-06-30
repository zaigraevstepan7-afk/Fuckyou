package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k12 {
    public static final k12 e;
    public static final k12 f;
    public static final k12 g;
    public static final /* synthetic */ k12[] h;

    static {
        k12 k12Var = new k12("Uninitialized", 0);
        e = k12Var;
        k12 k12Var2 = new k12("Detached", 1);
        f = k12Var2;
        k12 k12Var3 = new k12("Attached", 2);
        g = k12Var3;
        h = new k12[]{k12Var, k12Var2, k12Var3};
    }

    public static k12 valueOf(String str) {
        return (k12) Enum.valueOf(k12.class, str);
    }

    public static k12[] values() {
        return (k12[]) h.clone();
    }
}
