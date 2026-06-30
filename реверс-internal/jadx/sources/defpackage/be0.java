package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class be0 extends sv0 implements i22, p81, vp {
    public xz s;
    public d7 t;
    public boolean u;

    public be0(d7 d7Var, xz xzVar) {
        this.s = xzVar;
        this.t = d7Var;
    }

    @Override // defpackage.sv0
    public final void E0() {
        P0();
    }

    @Override // defpackage.p81
    public final void I(e81 e81Var, f81 f81Var, long j) {
        if (f81Var == f81.f) {
            List list = e81Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (O0(((l81) list.get(i)).i)) {
                    int i2 = e81Var.f;
                    if (i2 == 4) {
                        this.u = true;
                        N0();
                        return;
                    } else {
                        if (i2 == 5) {
                            P0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void L0() {
        d7 d7Var;
        zc1 zc1Var = new zc1();
        pd1.u(this, new zz0(zc1Var));
        be0 be0Var = (be0) zc1Var.e;
        if (be0Var == null || (d7Var = be0Var.t) == null) {
            d7Var = this.t;
        }
        M0(d7Var);
    }

    public abstract void M0(j81 j81Var);

    public final void N0() {
        vc1 vc1Var = new vc1();
        vc1Var.e = true;
        pd1.w(this, new zz(vc1Var));
        if (vc1Var.e) {
            L0();
        }
    }

    public abstract boolean O0(int i);

    public final void P0() {
        if (this.u) {
            this.u = false;
            if (this.r) {
                zc1 zc1Var = new zc1();
                pd1.u(this, new z3(1, zc1Var));
                be0 be0Var = (be0) zc1Var.e;
                if (be0Var != null) {
                    be0Var.L0();
                } else {
                    M0(null);
                }
            }
        }
    }

    @Override // defpackage.p81
    public final void h0() {
        P0();
    }

    @Override // defpackage.p81
    public final long r() {
        if (this.s == null) {
            return l12.a;
        }
        hx hxVar = bl.P(this).B;
        int i = l12.b;
        return t61.i(hxVar.N(10.0f), hxVar.N(40.0f), hxVar.N(10.0f), hxVar.N(40.0f));
    }
}
