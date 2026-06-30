package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ew implements pu0 {
    public final /* synthetic */ int e;
    public final pu0 f;
    public final Enum g;
    public final Enum h;

    public /* synthetic */ ew(pu0 pu0Var, Enum r2, Enum r3, int i) {
        this.e = i;
        this.f = pu0Var;
        this.g = r2;
        this.h = r3;
    }

    @Override // defpackage.pu0
    public final int O(int i) {
        switch (this.e) {
        }
        return this.f.O(i);
    }

    @Override // defpackage.pu0
    public final int U(int i) {
        switch (this.e) {
        }
        return this.f.U(i);
    }

    @Override // defpackage.pu0
    public final int a0(int i) {
        switch (this.e) {
        }
        return this.f.a0(i);
    }

    @Override // defpackage.pu0
    public final z61 e(long j) {
        int i = this.e;
        Enum r1 = this.g;
        Enum r2 = this.h;
        pu0 pu0Var = this.f;
        switch (i) {
            case 0:
                ui0 ui0Var = (ui0) r2;
                qi0 qi0Var = (qi0) r1;
                qi0 qi0Var2 = qi0.f;
                if (ui0Var == ui0.e) {
                    return new r60(qi0Var == qi0Var2 ? pu0Var.U(kr.g(j)) : pu0Var.O(kr.g(j)), kr.c(j) ? kr.g(j) : 32767, 0);
                }
                return new r60(kr.d(j) ? kr.h(j) : 32767, qi0Var == qi0Var2 ? pu0Var.f(kr.h(j)) : pu0Var.a0(kr.h(j)), 0);
            case 1:
                cv0 cv0Var = (cv0) r2;
                bv0 bv0Var = (bv0) r1;
                bv0 bv0Var2 = bv0.f;
                if (cv0Var == cv0.e) {
                    return new r60(bv0Var == bv0Var2 ? pu0Var.U(kr.g(j)) : pu0Var.O(kr.g(j)), kr.c(j) ? kr.g(j) : 32767, 1);
                }
                return new r60(kr.d(j) ? kr.h(j) : 32767, bv0Var == bv0Var2 ? pu0Var.f(kr.h(j)) : pu0Var.a0(kr.h(j)), 1);
            default:
                g01 g01Var = (g01) r2;
                f01 f01Var = (f01) r1;
                f01 f01Var2 = f01.f;
                if (g01Var == g01.e) {
                    return new r60(f01Var == f01Var2 ? pu0Var.U(kr.g(j)) : pu0Var.O(kr.g(j)), kr.c(j) ? kr.g(j) : 32767, 2);
                }
                return new r60(kr.d(j) ? kr.h(j) : 32767, f01Var == f01Var2 ? pu0Var.f(kr.h(j)) : pu0Var.a0(kr.h(j)), 2);
        }
    }

    @Override // defpackage.pu0
    public final int f(int i) {
        switch (this.e) {
        }
        return this.f.f(i);
    }

    @Override // defpackage.pu0
    public final Object i() {
        switch (this.e) {
        }
        return this.f.i();
    }
}
