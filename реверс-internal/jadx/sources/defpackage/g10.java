package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g10 {
    public static final f10 a;
    public static final f10 b;

    static {
        int i = 3;
        ks ksVar = null;
        a = new f10(i, ksVar, 0);
        b = new f10(i, ksVar, 1);
    }

    public static final long a(long j) {
        return kd1.c(Float.isNaN(o52.b(j)) ? 0.0f : o52.b(j), Float.isNaN(o52.c(j)) ? 0.0f : o52.c(j));
    }
}
