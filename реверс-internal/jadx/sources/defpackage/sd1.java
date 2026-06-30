package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sd1 {
    public static final sd1 e;
    public static final /* synthetic */ sd1[] f;

    static {
        sd1 sd1Var = new sd1("Restart", 0);
        e = sd1Var;
        f = new sd1[]{sd1Var, new sd1("Reverse", 1)};
    }

    public static sd1 valueOf(String str) {
        return (sd1) Enum.valueOf(sd1.class, str);
    }

    public static sd1[] values() {
        return (sd1[]) f.clone();
    }
}
