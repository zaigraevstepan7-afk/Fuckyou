package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kz {
    public static final kz e;
    public static final kz f;
    public static final kz g;
    public static final kz h;
    public static final /* synthetic */ kz[] i;

    static {
        kz kzVar = new kz("Up", 0);
        e = kzVar;
        kz kzVar2 = new kz("Drag", 1);
        f = kzVar2;
        kz kzVar3 = new kz("Timeout", 2);
        g = kzVar3;
        kz kzVar4 = new kz("Cancel", 3);
        h = kzVar4;
        i = new kz[]{kzVar, kzVar2, kzVar3, kzVar4};
    }

    public static kz valueOf(String str) {
        return (kz) Enum.valueOf(kz.class, str);
    }

    public static kz[] values() {
        return (kz[]) i.clone();
    }
}
