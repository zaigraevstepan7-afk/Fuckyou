package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 extends xv0 {
    public final uq a;
    public final uy1 b;
    public final h71 c;

    public gt0(uq uqVar, uy1 uy1Var, h71 h71Var) {
        this.a = uqVar;
        this.b = uy1Var;
        this.c = h71Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new it0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        it0 it0Var = (it0) sv0Var;
        it0Var.getClass();
        h71 h71Var = it0Var.u;
        View view = it0Var.v;
        hx hxVar = it0Var.w;
        it0Var.s = this.a;
        it0Var.t = this.b;
        h71 h71Var2 = this.c;
        it0Var.u = h71Var2;
        View viewL = el.L(it0Var);
        hx hxVar2 = bl.P(it0Var).B;
        if (it0Var.x != null) {
            zl1 zl1Var = jt0.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !h71Var2.a()) || !tz.b(Float.NaN, Float.NaN) || !tz.b(Float.NaN, Float.NaN) || !h71Var2.equals(h71Var) || !viewL.equals(view) || !xi0.o(hxVar2, hxVar)) {
                it0Var.M0();
            }
        }
        it0Var.N0();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + s91.d(s91.a(Float.NaN, s91.a(Float.NaN, s91.c(s91.d(s91.a(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
