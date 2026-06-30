package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 extends c01 {
    public static final p6 b0;
    public il0 Z;
    public jl0 a0;

    static {
        p6 p6VarL = wi0.l();
        int i = vl.h;
        p6VarL.f(vl.e);
        p6VarL.j(1.0f);
        p6VarL.k(1);
        b0 = p6VarL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kl0(ql0 ql0Var, il0 il0Var) {
        super(ql0Var);
        this.Z = il0Var;
        this.a0 = ql0Var.l != null ? new jl0(this) : null;
        if ((((sv0) il0Var).e.g & 512) == 0) {
            return;
        }
        yc.d();
        throw null;
    }

    @Override // defpackage.pu0
    public final int O(int i) {
        il0 il0Var = this.Z;
        c01 c01Var = this.x;
        c01Var.getClass();
        return il0Var.O(this, c01Var, i);
    }

    @Override // defpackage.c01
    public final void R0() {
        if (this.a0 == null) {
            this.a0 = new jl0(this);
        }
    }

    @Override // defpackage.pu0
    public final int U(int i) {
        il0 il0Var = this.Z;
        c01 c01Var = this.x;
        c01Var.getClass();
        return il0Var.f(this, c01Var, i);
    }

    @Override // defpackage.c01
    public final ys0 U0() {
        return this.a0;
    }

    @Override // defpackage.c01
    public final sv0 W0() {
        return ((sv0) this.Z).e;
    }

    @Override // defpackage.pu0
    public final int a0(int i) {
        il0 il0Var = this.Z;
        c01 c01Var = this.x;
        c01Var.getClass();
        return il0Var.D(this, c01Var, i);
    }

    @Override // defpackage.pu0
    public final z61 e(long j) {
        o0(j);
        il0 il0Var = this.Z;
        c01 c01Var = this.x;
        c01Var.getClass();
        p1(il0Var.e(this, c01Var, j));
        g1();
        return this;
    }

    @Override // defpackage.pu0
    public final int f(int i) {
        il0 il0Var = this.Z;
        c01 c01Var = this.x;
        c01Var.getClass();
        return il0Var.n(this, c01Var, i);
    }

    @Override // defpackage.z61
    public final void k0(long j, float f, sa0 sa0Var) {
        m1(j, f, sa0Var);
        if (this.r) {
            return;
        }
        h1();
        c01 c01Var = this.x;
        c01Var.getClass();
        boolean z = c01Var.s;
        c01Var.s = this.s;
        D0().b();
        c01Var.s = z;
    }

    @Override // defpackage.c01
    public final void l1(cj cjVar, nc0 nc0Var) {
        c01 c01Var;
        c01 c01Var2 = this.x;
        c01Var2.getClass();
        c01Var2.P0(cjVar, nc0Var);
        if (!((h4) tl0.a(this.w)).getShowLayoutBounds() || (c01Var = this.x) == null) {
            return;
        }
        if (vh0.a(this.g, c01Var.g) && oh0.a(c01Var.H, 0L)) {
            return;
        }
        long j = this.g;
        cjVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, b0);
    }

    @Override // defpackage.ws0
    public final int r0(c3 c3Var) {
        jl0 jl0Var = this.a0;
        if (jl0Var == null) {
            return bl.i(this, c3Var);
        }
        ox0 ox0Var = jl0Var.B;
        int iD = ox0Var.d(c3Var);
        if (iD >= 0) {
            return ox0Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y1(il0 il0Var) {
        if (il0Var.equals(this.Z) || (((sv0) il0Var).e.g & 512) == 0) {
            this.Z = il0Var;
        } else {
            yc.d();
        }
    }
}
