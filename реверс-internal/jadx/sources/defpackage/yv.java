package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class yv {
    public static final vw a;

    static {
        String property;
        vw vwVar;
        int i = mv1.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            lw lwVar = qy.a;
            ed0 ed0Var = kt0.a;
            ed0 ed0Var2 = ed0Var.j;
            vwVar = ed0Var;
            if (ed0Var == null) {
                vwVar = xv.p;
            }
        } else {
            vwVar = xv.p;
        }
        a = vwVar;
    }
}
