package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface sa {
    boolean a();

    Object b(long j);

    long c();

    r22 d();

    Object e();

    cb f(long j);

    default boolean g(long j) {
        return j >= c();
    }
}
