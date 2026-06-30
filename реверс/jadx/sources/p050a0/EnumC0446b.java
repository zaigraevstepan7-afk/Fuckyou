package p050a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a0.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0446b {

    /* JADX INFO: renamed from: a */
    public static final EnumC0446b f1139a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0446b f1140b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0446b f1141c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0446b[] f1142d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0446b EF8;

    static {
        EnumC0446b enumC0446b = new EnumC0446b("PENALTY_LOG", 0);
        EnumC0446b enumC0446b2 = new EnumC0446b("PENALTY_DEATH", 1);
        EnumC0446b enumC0446b3 = new EnumC0446b("DETECT_FRAGMENT_REUSE", 2);
        f1139a = enumC0446b3;
        EnumC0446b enumC0446b4 = new EnumC0446b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1140b = enumC0446b4;
        EnumC0446b enumC0446b5 = new EnumC0446b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        EnumC0446b enumC0446b6 = new EnumC0446b("DETECT_SET_USER_VISIBLE_HINT", 5);
        EnumC0446b enumC0446b7 = new EnumC0446b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        EnumC0446b enumC0446b8 = new EnumC0446b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f1141c = enumC0446b8;
        f1142d = new EnumC0446b[]{enumC0446b, enumC0446b2, enumC0446b3, enumC0446b4, enumC0446b5, enumC0446b6, enumC0446b7, enumC0446b8};
    }

    public static EnumC0446b valueOf(String str) {
        return (EnumC0446b) Enum.valueOf(EnumC0446b.class, str);
    }

    public static EnumC0446b[] values() {
        return (EnumC0446b[]) f1142d.clone();
    }
}
