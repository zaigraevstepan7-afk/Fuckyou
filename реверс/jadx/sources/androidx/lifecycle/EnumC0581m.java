package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0581m {

    /* JADX INFO: renamed from: a */
    public static final EnumC0581m f1866a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0581m f1867b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0581m f1868c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0581m f1869d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0581m f1870e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0581m[] f1871f;

    static {
        EnumC0581m enumC0581m = new EnumC0581m("DESTROYED", 0);
        f1866a = enumC0581m;
        EnumC0581m enumC0581m2 = new EnumC0581m("INITIALIZED", 1);
        f1867b = enumC0581m2;
        EnumC0581m enumC0581m3 = new EnumC0581m("CREATED", 2);
        f1868c = enumC0581m3;
        EnumC0581m enumC0581m4 = new EnumC0581m("STARTED", 3);
        f1869d = enumC0581m4;
        EnumC0581m enumC0581m5 = new EnumC0581m("RESUMED", 4);
        f1870e = enumC0581m5;
        f1871f = new EnumC0581m[]{enumC0581m, enumC0581m2, enumC0581m3, enumC0581m4, enumC0581m5};
    }

    public static EnumC0581m valueOf(String str) {
        return (EnumC0581m) Enum.valueOf(EnumC0581m.class, str);
    }

    public static EnumC0581m[] values() {
        return (EnumC0581m[]) f1871f.clone();
    }
}
