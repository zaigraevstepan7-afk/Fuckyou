package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jo0 {
    public final v41 A;
    public final v41 B;
    public cx1 a;
    public final dc1 b;
    public final rq1 c;
    public final xg0 d;
    public kz1 e;
    public final v41 f;
    public final v41 g;
    public zk0 h;
    public final v41 i;
    public hb j;
    public final v41 k;
    public final v41 l;
    public final v41 m;
    public final v41 n;
    public final v41 o;
    public boolean p;
    public final v41 q;
    public final oc r;
    public final v41 s;
    public final v41 t;
    public sa0 u;
    public final qs v;
    public final qs w;
    public final qs x;
    public final p6 y;
    public long z;

    public jo0(cx1 cx1Var, dc1 dc1Var, rq1 rq1Var) {
        this.a = cx1Var;
        this.b = dc1Var;
        this.c = rq1Var;
        xg0 xg0Var = new xg0(9, false);
        hb hbVar = ib.a;
        long j = wz1.b;
        az1 az1Var = new az1(hbVar, j, (wz1) null);
        xg0Var.f = az1Var;
        xg0Var.g = new x20(hbVar, az1Var.b);
        this.d = xg0Var;
        Boolean bool = Boolean.FALSE;
        this.f = xc.B(bool);
        this.g = xc.B(new tz(0.0f));
        this.i = xc.B(null);
        this.k = xc.B(cd0.e);
        this.l = xc.B(bool);
        this.m = xc.B(bool);
        this.n = xc.B(bool);
        this.o = xc.B(bool);
        this.p = true;
        this.q = xc.B(Boolean.TRUE);
        oc ocVar = new oc();
        ocVar.a = rq1Var;
        this.r = ocVar;
        this.s = xc.B(bool);
        this.t = xc.B(bool);
        this.u = new mt(12);
        this.v = new qs(this, 1);
        this.w = new qs(this, 2);
        this.x = new qs(this, 3);
        this.y = wi0.l();
        this.z = vl.g;
        this.A = xc.B(new wz1(j));
        this.B = xc.B(new wz1(j));
    }

    public final cd0 a() {
        return (cd0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final zk0 c() {
        zk0 zk0Var = this.h;
        if (zk0Var == null || !zk0Var.B()) {
            return null;
        }
        return zk0Var;
    }

    public final qz1 d() {
        return (qz1) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new wz1(j));
    }

    public final void f(long j) {
        this.A.setValue(new wz1(j));
    }
}
