package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class bu0 {
    public static final au0 a;
    public static final au0 b;

    static {
        lb1 lb1Var = lb1.c;
        au0 au0Var = null;
        try {
            au0Var = (au0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = au0Var;
        b = new au0();
    }
}
