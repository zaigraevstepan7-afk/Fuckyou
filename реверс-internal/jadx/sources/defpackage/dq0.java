package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class dq0 {
    public static final cq0 a;
    public static final cq0 b;

    static {
        lb1 lb1Var = lb1.c;
        cq0 cq0Var = null;
        try {
            cq0Var = (cq0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = cq0Var;
        b = new cq0();
    }
}
