package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jw0 {
    public static final jw0 e;
    public static final jw0 f;
    public static final jw0 g;
    public static final jw0 h;
    public static final /* synthetic */ jw0[] i;

    /* JADX INFO: Fake field, exist only in values array */
    jw0 EF0;

    static {
        jw0 jw0Var = new jw0("DefaultSpatial", 0);
        jw0 jw0Var2 = new jw0("FastSpatial", 1);
        e = jw0Var2;
        jw0 jw0Var3 = new jw0("SlowSpatial", 2);
        jw0 jw0Var4 = new jw0("DefaultEffects", 3);
        f = jw0Var4;
        jw0 jw0Var5 = new jw0("FastEffects", 4);
        g = jw0Var5;
        jw0 jw0Var6 = new jw0("SlowEffects", 5);
        h = jw0Var6;
        i = new jw0[]{jw0Var, jw0Var2, jw0Var3, jw0Var4, jw0Var5, jw0Var6};
    }

    public static jw0 valueOf(String str) {
        return (jw0) Enum.valueOf(jw0.class, str);
    }

    public static jw0[] values() {
        return (jw0[]) i.clone();
    }
}
