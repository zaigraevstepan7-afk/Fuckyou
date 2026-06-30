package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tt {
    public static final tt e;
    public static final tt f;
    public static final tt g;
    public static final tt h;
    public static final tt i;
    public static final /* synthetic */ tt[] j;

    static {
        tt ttVar = new tt("CPU_ACQUIRED", 0);
        e = ttVar;
        tt ttVar2 = new tt("BLOCKING", 1);
        f = ttVar2;
        tt ttVar3 = new tt("PARKING", 2);
        g = ttVar3;
        tt ttVar4 = new tt("DORMANT", 3);
        h = ttVar4;
        tt ttVar5 = new tt("TERMINATED", 4);
        i = ttVar5;
        j = new tt[]{ttVar, ttVar2, ttVar3, ttVar4, ttVar5};
    }

    public static tt valueOf(String str) {
        return (tt) Enum.valueOf(tt.class, str);
    }

    public static tt[] values() {
        return (tt[]) j.clone();
    }
}
