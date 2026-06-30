package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ph {
    public static final ph e;
    public static final ph f;
    public static final ph g;
    public static final /* synthetic */ ph[] h;

    static {
        ph phVar = new ph("SUSPEND", 0);
        e = phVar;
        ph phVar2 = new ph("DROP_OLDEST", 1);
        f = phVar2;
        ph phVar3 = new ph("DROP_LATEST", 2);
        g = phVar3;
        h = new ph[]{phVar, phVar2, phVar3};
    }

    public static ph valueOf(String str) {
        return (ph) Enum.valueOf(ph.class, str);
    }

    public static ph[] values() {
        return (ph[]) h.clone();
    }
}
