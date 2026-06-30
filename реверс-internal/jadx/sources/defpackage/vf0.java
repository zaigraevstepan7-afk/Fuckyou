package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vf0 {
    public static final vf0 e;
    public static final vf0 f;
    public static final vf0 g;
    public static final /* synthetic */ vf0[] h;

    static {
        vf0 vf0Var = new vf0("Yes", 0);
        e = vf0Var;
        vf0 vf0Var2 = new vf0("No", 1);
        f = vf0Var2;
        vf0 vf0Var3 = new vf0("NotInitialized", 2);
        g = vf0Var3;
        h = new vf0[]{vf0Var, vf0Var2, vf0Var3};
    }

    public static vf0 valueOf(String str) {
        return (vf0) Enum.valueOf(vf0.class, str);
    }

    public static vf0[] values() {
        return (vf0[]) h.clone();
    }
}
