package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ta {
    public static final ta e;
    public static final ta f;
    public static final /* synthetic */ ta[] g;

    static {
        ta taVar = new ta("BoundReached", 0);
        e = taVar;
        ta taVar2 = new ta("Finished", 1);
        f = taVar2;
        g = new ta[]{taVar, taVar2};
    }

    public static ta valueOf(String str) {
        return (ta) Enum.valueOf(ta.class, str);
    }

    public static ta[] values() {
        return (ta[]) g.clone();
    }
}
