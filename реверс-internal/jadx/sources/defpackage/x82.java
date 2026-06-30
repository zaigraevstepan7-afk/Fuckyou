package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x82 {
    public static final ug0[] b;
    public static final hx0 c;
    public static final hx0 d;
    public static final hx0 e;
    public final z82 a;

    static {
        ug0[] ug0VarArr = new ug0[4];
        for (int i = 0; i < 4; i++) {
            ug0VarArr[i] = new ug0((String) null);
        }
        b = ug0VarArr;
        hx0 hx0Var = new hx0(8);
        hx0Var.i(1, new ug0("status bars source"));
        hx0Var.i(2, new ug0("navigation bars source"));
        hx0Var.i(4, new ug0("caption bar source"));
        hx0Var.i(8, new ug0("IME source"));
        hx0Var.i(16, new ug0("system gestures source"));
        hx0Var.i(32, new ug0("mandatory system gestures source"));
        hx0Var.i(64, new ug0("tappable element source"));
        hx0Var.i(128, new ug0("display cutout source"));
        c = hx0Var;
        hx0 hx0Var2 = new hx0(8);
        hx0Var2.i(1, new ug0("status bars target"));
        hx0Var2.i(2, new ug0("navigation bars target"));
        hx0Var2.i(4, new ug0("caption bar target"));
        hx0Var2.i(8, new ug0("IME target"));
        hx0Var2.i(16, new ug0("system gestures target"));
        hx0Var2.i(32, new ug0("mandatory system gestures target"));
        hx0Var2.i(64, new ug0("tappable element target"));
        hx0Var2.i(128, new ug0("display cutout target"));
        d = hx0Var2;
        hx0 hx0Var3 = new hx0(8);
        v82.a.getClass();
        hx0Var3.i(1, u82.g);
        hx0Var3.i(2, u82.f);
        hx0Var3.i(4, u82.b);
        hx0Var3.i(8, u82.d);
        hx0Var3.i(16, u82.h);
        hx0Var3.i(32, u82.e);
        hx0Var3.i(64, u82.i);
        hx0Var3.i(128, u82.c);
        e = hx0Var3;
    }

    public x82(z82 z82Var) {
        this.a = z82Var;
        nh0.a();
    }

    public static boolean a(xd0 xd0Var, ug0 ug0Var) {
        return xd0Var == ug0Var.b() || xd0Var == ug0Var.d() || xd0Var == ug0Var.c() || xd0Var == ug0Var.a();
    }

    public static void b(rs0 rs0Var, ug0 ug0Var, eh0 eh0Var) {
        rs0Var.e = true;
        ws0 ws0Var = rs0Var.h;
        zk0 zk0VarA0 = ws0Var.A0();
        if (oh0.a(rs0Var.f, 9223372034707292159L)) {
            rs0Var.f = hk.S(zk0VarA0.c(0L));
            rs0Var.g = zk0VarA0.K();
        }
        ws0Var.C0().J.b();
        long jK = zk0VarA0.K();
        rs0Var.a(ug0Var.b(), eh0Var.a);
        rs0Var.a(ug0Var.d(), eh0Var.b);
        rs0Var.a(ug0Var.c(), ((int) (jK >> 32)) - eh0Var.c);
        rs0Var.a(ug0Var.a(), ((int) (jK & 4294967295L)) - eh0Var.d);
    }
}
