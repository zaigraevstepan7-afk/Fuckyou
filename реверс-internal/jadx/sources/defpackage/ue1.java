package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 implements hx {
    public hk A;
    public int e;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i;
    public float j;
    public float k;
    public long l;
    public long m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public ym1 s;
    public boolean t;
    public long u;
    public vk0 v;
    public hx w;
    public al0 x;
    public wl y;
    public int z;

    public ue1() {
        long j = rc0.a;
        this.l = j;
        this.m = j;
        this.q = 8.0f;
        this.r = u12.b;
        this.s = pv.w;
        this.u = 9205357640488583168L;
        this.v = vk0.a;
        this.w = hk.a();
        this.x = al0.e;
        this.z = 3;
    }

    public final void a() {
        k(1.0f);
        m(1.0f);
        c(1.0f);
        t(0.0f);
        z(0.0f);
        n(0.0f);
        long j = rc0.a;
        e(j);
        p(j);
        h(0.0f);
        i(0.0f);
        j(0.0f);
        if (this.q != 8.0f) {
            this.e |= 2048;
            this.q = 8.0f;
        }
        r(u12.b);
        o(pv.w);
        f(false);
        g(null);
        if (this.z != 3) {
            this.e |= 524288;
            this.z = 3;
        }
        vk0 vk0Var = vk0.a;
        if (!xi0.o(this.v, vk0Var)) {
            this.e |= 1048576;
            this.v = vk0Var;
        }
        this.u = 9205357640488583168L;
        this.A = null;
        this.e = 0;
    }

    @Override // defpackage.hx
    public final float b() {
        return this.w.b();
    }

    public final void c(float f) {
        if (this.h == f) {
            return;
        }
        this.e |= 4;
        this.h = f;
    }

    public final void e(long j) {
        if (vl.c(this.l, j)) {
            return;
        }
        this.e |= 64;
        this.l = j;
    }

    public final void f(boolean z) {
        if (this.t != z) {
            this.e |= 16384;
            this.t = z;
        }
    }

    public final void g(wl wlVar) {
        if (xi0.o(this.y, wlVar)) {
            return;
        }
        this.e |= 262144;
        this.y = wlVar;
    }

    public final void h(float f) {
        if (this.n == f) {
            return;
        }
        this.e |= 256;
        this.n = f;
    }

    public final void i(float f) {
        if (this.o == f) {
            return;
        }
        this.e |= 512;
        this.o = f;
    }

    public final void j(float f) {
        if (this.p == f) {
            return;
        }
        this.e |= 1024;
        this.p = f;
    }

    public final void k(float f) {
        if (this.f == f) {
            return;
        }
        this.e |= 1;
        this.f = f;
    }

    @Override // defpackage.hx
    public final float l() {
        return this.w.l();
    }

    public final void m(float f) {
        if (this.g == f) {
            return;
        }
        this.e |= 2;
        this.g = f;
    }

    public final void n(float f) {
        if (this.k == f) {
            return;
        }
        this.e |= 32;
        this.k = f;
    }

    public final void o(ym1 ym1Var) {
        if (xi0.o(this.s, ym1Var)) {
            return;
        }
        this.e |= 8192;
        this.s = ym1Var;
    }

    public final void p(long j) {
        if (vl.c(this.m, j)) {
            return;
        }
        this.e |= 128;
        this.m = j;
    }

    public final void r(long j) {
        if (u12.a(this.r, j)) {
            return;
        }
        this.e |= 4096;
        this.r = j;
    }

    public final void t(float f) {
        if (this.i == f) {
            return;
        }
        this.e |= 8;
        this.i = f;
    }

    public final void z(float f) {
        if (this.j == f) {
            return;
        }
        this.e |= 16;
        this.j = f;
    }
}
