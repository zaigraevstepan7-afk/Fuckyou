package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l50 {
    public static volatile l50 a;
    public static final l50 b;

    static {
        l50 l50Var = new l50();
        Map map = Collections.EMPTY_MAP;
        b = l50Var;
    }

    public static l50 a() {
        l50 l50Var;
        lb1 lb1Var = lb1.c;
        l50 l50Var2 = a;
        if (l50Var2 != null) {
            return l50Var2;
        }
        synchronized (l50.class) {
            try {
                l50Var = a;
                if (l50Var == null) {
                    Class cls = k50.a;
                    l50 l50Var3 = null;
                    if (cls != null) {
                        try {
                            l50Var3 = (l50) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    l50Var = l50Var3 != null ? l50Var3 : b;
                    a = l50Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l50Var;
    }
}
