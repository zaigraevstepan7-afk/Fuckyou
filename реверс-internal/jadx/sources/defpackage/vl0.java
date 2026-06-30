package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vl0 implements lu1, xu0 {
    public final /* synthetic */ yl0 e;
    public final /* synthetic */ em0 f;

    public vl0(em0 em0Var) {
        this.f = em0Var;
        this.e = em0Var.l;
    }

    @Override // defpackage.lu1
    public final List G(wa0 wa0Var, Object obj) {
        em0 em0Var = this.f;
        ql0 ql0Var = em0Var.e;
        zx0 zx0Var = em0Var.k;
        ql0 ql0Var2 = (ql0) zx0Var.g(obj);
        if (ql0Var2 != null && ((iy0) ((qx0) ql0Var.o()).f).i(ql0Var2) < em0Var.h) {
            return ql0Var2.m();
        }
        zx0 zx0Var2 = em0Var.p;
        zx0 zx0Var3 = em0Var.n;
        iy0 iy0Var = em0Var.q;
        if (iy0Var.g < em0Var.i) {
            ng0.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        ql0 ql0Var3 = (ql0) zx0Var.g(obj);
        int i = iy0Var.g;
        int i2 = em0Var.i;
        if (i == i2) {
            iy0Var.b(obj);
        } else {
            Object[] objArr = iy0Var.e;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        em0Var.i++;
        boolean zB = zx0Var3.b(obj);
        if (zB || ql0Var3 != null) {
            if (!zB && ql0Var3 != null) {
                em0Var.j(((iy0) ((qx0) ql0Var.o()).f).i(ql0Var3), ((iy0) ((qx0) ql0Var.o()).f).g);
                em0Var.s++;
                zx0Var.k(obj);
                zx0Var3.m(obj, ql0Var3);
                zx0Var2.m(obj, em0Var.f(obj));
                if (ql0Var.J()) {
                    em0Var.h();
                }
            }
            ql0 ql0Var4 = (ql0) zx0Var3.g(obj);
            wl0 wl0Var = ql0Var4 != null ? (wl0) em0Var.j.g(ql0Var4) : null;
            if (wl0Var != null && wl0Var.d) {
                em0Var.m(ql0Var4, obj, false, wa0Var);
            }
            if ((wl0Var != null ? wl0Var.f : null) != null) {
                em0Var.d(wl0Var, true);
            }
        } else {
            em0Var.k(obj, wa0Var, false);
            zx0Var2.m(obj, em0Var.f(obj));
        }
        ql0 ql0Var5 = (ql0) zx0Var3.g(obj);
        if (ql0Var5 == null) {
            return f40.e;
        }
        List listQ0 = ql0Var5.J.p.q0();
        qx0 qx0Var = (qx0) listQ0;
        int i3 = ((iy0) qx0Var.f).g;
        for (int i4 = 0; i4 < i3; i4++) {
            ((tu0) qx0Var.get(i4)).j.b = true;
        }
        return listQ0;
    }

    @Override // defpackage.hx
    public final float J(long j) {
        return this.e.J(j);
    }

    @Override // defpackage.hx
    public final int N(float f) {
        return this.e.N(f);
    }

    @Override // defpackage.xu0
    public final vu0 V(int i, int i2, g3 g3Var, q qVar, Map map, u3 u3Var) {
        return this.e.V(i, i2, g3Var, qVar, map, u3Var);
    }

    @Override // defpackage.hx
    public final long X(long j) {
        return this.e.X(j);
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e.f;
    }

    @Override // defpackage.hx
    public final float d0(long j) {
        return this.e.d0(j);
    }

    @Override // defpackage.xu0
    public final vu0 f0(int i, int i2, Map map, sa0 sa0Var) {
        return this.e.u(i, i2, map, sa0Var);
    }

    @Override // defpackage.pi0
    public final al0 getLayoutDirection() {
        return this.e.e;
    }

    @Override // defpackage.hx
    public final float l() {
        return this.e.g;
    }

    @Override // defpackage.hx
    public final long m0(float f) {
        return this.e.m0(f);
    }

    @Override // defpackage.pi0
    public final boolean s() {
        return this.e.s();
    }

    @Override // defpackage.hx
    public final float s0(int i) {
        return this.e.s0(i);
    }

    @Override // defpackage.xu0
    public final vu0 u(int i, int i2, Map map, sa0 sa0Var) {
        return this.e.u(i, i2, map, sa0Var);
    }

    @Override // defpackage.hx
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.hx
    public final float v0(float f) {
        return f / this.e.b();
    }

    @Override // defpackage.hx
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.hx
    public final float y(float f) {
        return this.e.b() * f;
    }
}
