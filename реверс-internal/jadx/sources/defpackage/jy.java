package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jy {
    public static final jy e;
    public static final jy f;
    public static final jy g;
    public static final /* synthetic */ jy[] h;

    static {
        jy jyVar = new jy("Vertical", 0);
        e = jyVar;
        jy jyVar2 = new jy("Horizontal", 1);
        f = jyVar2;
        jy jyVar3 = new jy("Both", 2);
        g = jyVar3;
        h = new jy[]{jyVar, jyVar2, jyVar3};
    }

    public static jy valueOf(String str) {
        return (jy) Enum.valueOf(jy.class, str);
    }

    public static jy[] values() {
        return (jy[]) h.clone();
    }
}
