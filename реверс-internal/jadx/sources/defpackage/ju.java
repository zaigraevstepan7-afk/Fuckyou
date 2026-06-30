package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ju {
    public static final ju e;
    public static final ju f;
    public static final ju g;
    public static final /* synthetic */ ju[] h;

    static {
        ju juVar = new ju("None", 0);
        e = juVar;
        ju juVar2 = new ju("Cancelled", 1);
        f = juVar2;
        ju juVar3 = new ju("Redirected", 2);
        g = juVar3;
        h = new ju[]{juVar, juVar2, juVar3, new ju("RedirectCancelled", 3)};
    }

    public static ju valueOf(String str) {
        return (ju) Enum.valueOf(ju.class, str);
    }

    public static ju[] values() {
        return (ju[]) h.clone();
    }
}
