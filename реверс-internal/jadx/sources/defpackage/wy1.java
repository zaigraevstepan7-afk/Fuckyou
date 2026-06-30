package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 {
    public al0 a;
    public hx b;
    public c90 c;
    public d02 d;
    public Object e;
    public final v41 f = xc.B(Boolean.TRUE);
    public long g = 0;

    public wy1(al0 al0Var, hx hxVar, c90 c90Var, d02 d02Var, Object obj) {
        this.a = al0Var;
        this.b = hxVar;
        this.c = c90Var;
        this.d = d02Var;
        this.e = obj;
    }

    public static void a(wy1 wy1Var, al0 al0Var, hx hxVar, d02 d02Var, int i) {
        if ((i & 1) != 0) {
            al0Var = wy1Var.a;
        }
        if ((i & 2) != 0) {
            hxVar = wy1Var.b;
        }
        c90 c90Var = wy1Var.c;
        if ((i & 8) != 0) {
            d02Var = wy1Var.d;
        }
        Object obj = wy1Var.e;
        al0 al0Var2 = wy1Var.a;
        v41 v41Var = wy1Var.f;
        if (al0Var == al0Var2 && xi0.o(hxVar, wy1Var.b) && xi0.o(c90Var, wy1Var.c) && xi0.o(d02Var, wy1Var.d)) {
            if (xi0.o(obj, wy1Var.e)) {
                return;
            }
            wy1Var.e = obj;
            v41Var.setValue(Boolean.TRUE);
            return;
        }
        wy1Var.a = al0Var;
        wy1Var.b = hxVar;
        wy1Var.c = c90Var;
        wy1Var.d = d02Var;
        v41Var.setValue(Boolean.TRUE);
    }
}
