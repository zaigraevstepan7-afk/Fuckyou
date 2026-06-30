package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wt {
    public static final wt e;
    public static final wt f;
    public static final wt g;
    public static final /* synthetic */ wt[] h;

    static {
        wt wtVar = new wt("COROUTINE_SUSPENDED", 0);
        e = wtVar;
        wt wtVar2 = new wt("UNDECIDED", 1);
        f = wtVar2;
        wt wtVar3 = new wt("RESUMED", 2);
        g = wtVar3;
        h = new wt[]{wtVar, wtVar2, wtVar3};
    }

    public static wt valueOf(String str) {
        return (wt) Enum.valueOf(wt.class, str);
    }

    public static wt[] values() {
        return (wt[]) h.clone();
    }
}
