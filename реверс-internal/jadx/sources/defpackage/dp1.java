package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dp1 implements sa0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ fl f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ sa0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float j;
    public final /* synthetic */ ha0 k;

    public dp1(boolean z, fl flVar, boolean z2, sa0 sa0Var, boolean z3, float f, ha0 ha0Var) {
        this.e = z;
        this.f = flVar;
        this.g = z2;
        this.h = sa0Var;
        this.i = z3;
        this.j = f;
        this.k = ha0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        KeyEvent keyEvent = ((gk0) obj).a;
        fl flVar = this.f;
        float f = flVar.b;
        if (!this.e) {
            return Boolean.FALSE;
        }
        int iD = bl.D(keyEvent);
        boolean z = this.i;
        if (iD != 2) {
            if (iD != 1) {
                return Boolean.FALSE;
            }
            ha0 ha0Var = this.k;
            if (z) {
                long jD = hk.d(keyEvent.getKeyCode());
                if (!ek0.a(jD, ek0.d) && !ek0.a(jD, ek0.e) && !ek0.a(jD, ek0.v) && !ek0.a(jD, ek0.w) && !ek0.a(jD, ek0.C) && !ek0.a(jD, ek0.D)) {
                    return Boolean.FALSE;
                }
                if (ha0Var != null) {
                    ha0Var.a();
                }
                return Boolean.TRUE;
            }
            long jD2 = hk.d(keyEvent.getKeyCode());
            if (!ek0.a(jD2, ek0.g) && !ek0.a(jD2, ek0.f) && !ek0.a(jD2, ek0.v) && !ek0.a(jD2, ek0.w) && !ek0.a(jD2, ek0.C) && !ek0.a(jD2, ek0.D)) {
                return Boolean.FALSE;
            }
            if (ha0Var != null) {
                ha0Var.a();
            }
            return Boolean.TRUE;
        }
        float f2 = flVar.a;
        float fAbs = Math.abs(f - f2) / 100.0f;
        int i = this.g ? -1 : 1;
        boolean zA = ek0.a(hk.d(keyEvent.getKeyCode()), ek0.v);
        sa0 sa0Var = this.h;
        if (zA) {
            sa0Var.i(Float.valueOf(f2));
            return Boolean.TRUE;
        }
        if (ek0.a(hk.d(keyEvent.getKeyCode()), ek0.w)) {
            sa0Var.i(Float.valueOf(f));
            return Boolean.TRUE;
        }
        float f3 = this.j;
        if (z) {
            long jD3 = hk.d(keyEvent.getKeyCode());
            if (ek0.a(jD3, ek0.d)) {
                sa0Var.i(lk.C(Float.valueOf(f3 - (i * fAbs)), flVar));
                return Boolean.TRUE;
            }
            if (ek0.a(jD3, ek0.e)) {
                sa0Var.i(lk.C(Float.valueOf((i * fAbs) + f3), flVar));
                return Boolean.TRUE;
            }
            if (ek0.a(jD3, ek0.C)) {
                sa0Var.i(lk.C(Float.valueOf(f3 - ((lk.A(10, 1, 10) * i) * fAbs)), flVar));
                return Boolean.TRUE;
            }
            if (!ek0.a(jD3, ek0.D)) {
                return Boolean.FALSE;
            }
            sa0Var.i(lk.C(Float.valueOf((lk.A(10, 1, 10) * i * fAbs) + f3), flVar));
            return Boolean.TRUE;
        }
        long jD4 = hk.d(keyEvent.getKeyCode());
        if (ek0.a(jD4, ek0.g)) {
            sa0Var.i(lk.C(Float.valueOf((i * fAbs) + f3), flVar));
            return Boolean.TRUE;
        }
        if (ek0.a(jD4, ek0.f)) {
            sa0Var.i(lk.C(Float.valueOf(f3 - (i * fAbs)), flVar));
            return Boolean.TRUE;
        }
        if (ek0.a(jD4, ek0.C)) {
            sa0Var.i(lk.C(Float.valueOf((lk.A(10, 1, 10) * fAbs) + f3), flVar));
            return Boolean.TRUE;
        }
        if (!ek0.a(jD4, ek0.D)) {
            return Boolean.FALSE;
        }
        sa0Var.i(lk.C(Float.valueOf(f3 - (lk.A(10, 1, 10) * fAbs)), flVar));
        return Boolean.TRUE;
    }
}
