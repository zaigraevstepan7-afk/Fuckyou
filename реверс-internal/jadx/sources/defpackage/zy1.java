package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 {
    public static final /* synthetic */ zy1[] e = {new zy1("Filled", 0), new zy1("Outlined", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    zy1 EF5;

    public static zy1 valueOf(String str) {
        return (zy1) Enum.valueOf(zy1.class, str);
    }

    public static zy1[] values() {
        return (zy1[]) e.clone();
    }
}
