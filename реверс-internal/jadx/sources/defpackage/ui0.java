package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ui0 {
    public static final ui0 e;
    public static final ui0 f;
    public static final /* synthetic */ ui0[] g;

    static {
        ui0 ui0Var = new ui0("Width", 0);
        e = ui0Var;
        ui0 ui0Var2 = new ui0("Height", 1);
        f = ui0Var2;
        g = new ui0[]{ui0Var, ui0Var2};
    }

    public static ui0 valueOf(String str) {
        return (ui0) Enum.valueOf(ui0.class, str);
    }

    public static ui0[] values() {
        return (ui0[]) g.clone();
    }
}
