package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n50 {
    public static final m50 a = new m50();
    public static final m50 b;

    static {
        lb1 lb1Var = lb1.c;
        m50 m50Var = null;
        try {
            m50Var = (m50) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = m50Var;
    }
}
