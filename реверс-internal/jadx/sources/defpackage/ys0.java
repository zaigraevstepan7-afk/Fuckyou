package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ys0 extends ws0 implements pu0 {
    public vu0 A;
    public final ox0 B;
    public final c01 w;
    public LinkedHashMap y;
    public long x = 0;
    public final zs0 z = new zs0(this);

    public ys0(c01 c01Var) {
        this.w = c01Var;
        ox0 ox0Var = r01.a;
        this.B = new ox0();
    }

    public static final void L0(ys0 ys0Var, vu0 vu0Var) {
        LinkedHashMap linkedHashMap;
        if (vu0Var != null) {
            ys0Var.n0((((long) vu0Var.d()) & 4294967295L) | (((long) vu0Var.g()) << 32));
        } else {
            ys0Var.n0(0L);
        }
        if (!xi0.o(ys0Var.A, vu0Var) && vu0Var != null && ((((linkedHashMap = ys0Var.y) != null && !linkedHashMap.isEmpty()) || !vu0Var.a().isEmpty()) && !xi0.o(vu0Var.a(), ys0Var.y))) {
            ct0 ct0Var = ys0Var.w.w.J.q;
            ct0Var.getClass();
            ct0Var.v.f();
            LinkedHashMap linkedHashMap2 = ys0Var.y;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                ys0Var.y = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(vu0Var.a());
        }
        ys0Var.A = vu0Var;
    }

    @Override // defpackage.ws0
    public final zk0 A0() {
        return this.z;
    }

    @Override // defpackage.ws0
    public final boolean B0() {
        return this.A != null;
    }

    @Override // defpackage.ws0
    public final ql0 C0() {
        return this.w.w;
    }

    @Override // defpackage.ws0
    public final vu0 D0() {
        vu0 vu0Var = this.A;
        if (vu0Var != null) {
            return vu0Var;
        }
        throw s91.g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.ws0
    public final ws0 E0() {
        c01 c01Var = this.w.y;
        if (c01Var != null) {
            return c01Var.U0();
        }
        return null;
    }

    @Override // defpackage.ws0
    public final long F0() {
        return this.x;
    }

    @Override // defpackage.ws0
    public final void J0() {
        k0(this.x, 0.0f, null);
    }

    public void M0() {
        D0().b();
    }

    public final void N0(long j) {
        if (!oh0.a(this.x, j)) {
            this.x = j;
            c01 c01Var = this.w;
            ct0 ct0Var = c01Var.w.J.q;
            if (ct0Var != null) {
                ct0Var.u0();
            }
            ws0.H0(c01Var);
        }
        if (this.s) {
            return;
        }
        u0(D0());
    }

    public final long O0(ys0 ys0Var, boolean z) {
        long jC = 0;
        while (!this.equals(ys0Var)) {
            if (!this.p || !z) {
                jC = oh0.c(jC, this.x);
            }
            c01 c01Var = this.w.y;
            c01Var.getClass();
            this = c01Var.U0();
            this.getClass();
        }
        return jC;
    }

    @Override // defpackage.hx
    public final float b() {
        return this.w.b();
    }

    @Override // defpackage.pi0
    public final al0 getLayoutDirection() {
        return this.w.w.C;
    }

    @Override // defpackage.z61, defpackage.pu0
    public final Object i() {
        return this.w.i();
    }

    @Override // defpackage.z61
    public final void k0(long j, float f, sa0 sa0Var) {
        N0(j);
        if (this.r) {
            return;
        }
        M0();
    }

    @Override // defpackage.hx
    public final float l() {
        return this.w.l();
    }

    @Override // defpackage.ws0, defpackage.pi0
    public final boolean s() {
        return true;
    }

    @Override // defpackage.ws0
    public final ws0 z0() {
        c01 c01Var = this.w.x;
        if (c01Var != null) {
            return c01Var.U0();
        }
        return null;
    }
}
