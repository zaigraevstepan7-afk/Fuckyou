package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0580l {
    private static final /* synthetic */ EnumC0580l[] $VALUES;
    public static final C0578j Companion;
    public static final EnumC0580l ON_ANY;
    public static final EnumC0580l ON_CREATE;
    public static final EnumC0580l ON_DESTROY;
    public static final EnumC0580l ON_PAUSE;
    public static final EnumC0580l ON_RESUME;
    public static final EnumC0580l ON_START;
    public static final EnumC0580l ON_STOP;

    static {
        EnumC0580l enumC0580l = new EnumC0580l("ON_CREATE", 0);
        ON_CREATE = enumC0580l;
        EnumC0580l enumC0580l2 = new EnumC0580l("ON_START", 1);
        ON_START = enumC0580l2;
        EnumC0580l enumC0580l3 = new EnumC0580l("ON_RESUME", 2);
        ON_RESUME = enumC0580l3;
        EnumC0580l enumC0580l4 = new EnumC0580l("ON_PAUSE", 3);
        ON_PAUSE = enumC0580l4;
        EnumC0580l enumC0580l5 = new EnumC0580l("ON_STOP", 4);
        ON_STOP = enumC0580l5;
        EnumC0580l enumC0580l6 = new EnumC0580l("ON_DESTROY", 5);
        ON_DESTROY = enumC0580l6;
        EnumC0580l enumC0580l7 = new EnumC0580l("ON_ANY", 6);
        ON_ANY = enumC0580l7;
        $VALUES = new EnumC0580l[]{enumC0580l, enumC0580l2, enumC0580l3, enumC0580l4, enumC0580l5, enumC0580l6, enumC0580l7};
        Companion = new C0578j();
    }

    public static EnumC0580l valueOf(String str) {
        return (EnumC0580l) Enum.valueOf(EnumC0580l.class, str);
    }

    public static EnumC0580l[] values() {
        return (EnumC0580l[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC0581m m1479a() {
        switch (AbstractC0579k.f1865a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0581m.f1868c;
            case 3:
            case 4:
                return EnumC0581m.f1869d;
            case 5:
                return EnumC0581m.f1870e;
            case 6:
                return EnumC0581m.f1866a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
