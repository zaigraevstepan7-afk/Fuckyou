package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface a22 {
    default boolean a(Enum r2, Enum r3) {
        return r2.equals(b()) && r3.equals(c());
    }

    Object b();

    Object c();
}
