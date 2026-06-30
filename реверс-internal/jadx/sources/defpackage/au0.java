package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class au0 {
    public static zt0 a(Object obj, Object obj2) {
        zt0 zt0VarB = (zt0) obj;
        zt0 zt0Var = (zt0) obj2;
        if (!zt0Var.isEmpty()) {
            if (!zt0VarB.e) {
                zt0VarB = zt0VarB.b();
            }
            zt0VarB.a();
            if (!zt0Var.isEmpty()) {
                zt0VarB.putAll(zt0Var);
            }
        }
        return zt0VarB;
    }
}
