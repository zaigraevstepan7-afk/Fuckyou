package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yt {
    public static final yt e;
    public static final yt f;
    public static final yt g;
    public static final yt h;
    public static final /* synthetic */ yt[] i;

    static {
        yt ytVar = new yt("DEFAULT", 0);
        e = ytVar;
        yt ytVar2 = new yt("LAZY", 1);
        f = ytVar2;
        yt ytVar3 = new yt("ATOMIC", 2);
        g = ytVar3;
        yt ytVar4 = new yt("UNDISPATCHED", 3);
        h = ytVar4;
        i = new yt[]{ytVar, ytVar2, ytVar3, ytVar4};
    }

    public static yt valueOf(String str) {
        return (yt) Enum.valueOf(yt.class, str);
    }

    public static yt[] values() {
        return (yt[]) i.clone();
    }
}
