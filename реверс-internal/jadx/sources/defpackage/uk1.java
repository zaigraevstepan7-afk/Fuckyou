package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uk1 {
    public static final uk1 e;
    public static final /* synthetic */ uk1[] f;

    static {
        uk1 uk1Var = new uk1("EditableText", 0);
        e = uk1Var;
        f = new uk1[]{uk1Var, new uk1("StaticText", 1)};
    }

    public static uk1 valueOf(String str) {
        return (uk1) Enum.valueOf(uk1.class, str);
    }

    public static uk1[] values() {
        return (uk1[]) f.clone();
    }
}
