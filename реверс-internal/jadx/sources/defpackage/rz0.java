package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class rz0 {
    public static final qz0 a;
    public static final qz0 b;

    static {
        lb1 lb1Var = lb1.c;
        qz0 qz0Var = null;
        try {
            qz0Var = (qz0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = qz0Var;
        b = new qz0();
    }
}
