package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class li1 {
    public static final li1 e;
    public static final li1 f;
    public static final li1 g;
    public static final li1 h;
    public static final li1 i;
    public static final /* synthetic */ li1[] j;

    static {
        li1 li1Var = new li1("TopBar", 0);
        e = li1Var;
        li1 li1Var2 = new li1("MainContent", 1);
        f = li1Var2;
        li1 li1Var3 = new li1("Snackbar", 2);
        g = li1Var3;
        li1 li1Var4 = new li1("Fab", 3);
        h = li1Var4;
        li1 li1Var5 = new li1("BottomBar", 4);
        i = li1Var5;
        j = new li1[]{li1Var, li1Var2, li1Var3, li1Var4, li1Var5};
    }

    public static li1 valueOf(String str) {
        return (li1) Enum.valueOf(li1.class, str);
    }

    public static li1[] values() {
        return (li1[]) j.clone();
    }
}
