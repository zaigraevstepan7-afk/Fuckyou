package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ir {
    public static final hx0 a;

    static {
        cf1 cf1Var = gm.e;
        int i = cf1Var.c;
        fr frVar = new fr(cf1Var, cf1Var, 1);
        int i2 = cf1Var.c;
        b11 b11Var = gm.x;
        int i3 = (b11Var.c << 6) | i2;
        hr hrVar = new hr(cf1Var, b11Var, 0);
        int i4 = (i2 << 6) | b11Var.c;
        hr hrVar2 = new hr(b11Var, cf1Var, 0);
        hx0 hx0Var = nh0.a;
        hx0 hx0Var2 = new hx0();
        hx0Var2.i(i | (i << 6), frVar);
        hx0Var2.i(i3, hrVar);
        hx0Var2.i(i4, hrVar2);
        a = hx0Var2;
    }
}
