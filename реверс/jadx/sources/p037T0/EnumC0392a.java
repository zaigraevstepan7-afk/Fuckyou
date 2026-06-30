package p037T0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T0.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0392a {

    /* JADX INFO: renamed from: a */
    public static final EnumC0392a f1063a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0392a[] f1064b;

    static {
        EnumC0392a enumC0392a = new EnumC0392a("COROUTINE_SUSPENDED", 0);
        f1063a = enumC0392a;
        f1064b = new EnumC0392a[]{enumC0392a, new EnumC0392a("UNDECIDED", 1), new EnumC0392a("RESUMED", 2)};
    }

    public static EnumC0392a valueOf(String str) {
        return (EnumC0392a) Enum.valueOf(EnumC0392a.class, str);
    }

    public static EnumC0392a[] values() {
        return (EnumC0392a[]) f1064b.clone();
    }
}
