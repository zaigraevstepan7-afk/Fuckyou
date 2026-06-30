package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z61 {
    public int e;
    public int f;
    public long g = 0;
    public long h = a71.a;
    public long i = 0;

    public abstract int b0(c3 c3Var);

    public int g0() {
        return (int) (this.g & 4294967295L);
    }

    public int h0() {
        return (int) (this.g >> 32);
    }

    public Object i() {
        return null;
    }

    public final void i0() {
        this.e = lk.A((int) (this.g >> 32), kr.j(this.h), kr.h(this.h));
        int iA = lk.A((int) (this.g & 4294967295L), kr.i(this.h), kr.g(this.h));
        this.f = iA;
        int i = this.e;
        long j = this.g;
        this.i = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iA - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void k0(long j, float f, sa0 sa0Var);

    public final void n0(long j) {
        if (vh0.a(this.g, j)) {
            return;
        }
        this.g = j;
        i0();
    }

    public final void o0(long j) {
        if (kr.b(this.h, j)) {
            return;
        }
        this.h = j;
        i0();
    }
}
