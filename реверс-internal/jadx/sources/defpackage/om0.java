package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class om0 extends sv0 implements il0 {
    public static final mm0 v = new mm0();
    public in0 s;
    public wg t;
    public k31 u;

    public final boolean L0(km0 km0Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.u != k31.e) {
                }
            } else if (i != 1 && i != 2) {
                yc.l("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (M0(i) ? km0Var.a > 0 : km0Var.b < this.s.a.g().n - 1) {
                return true;
            }
        } else if (this.u != k31.f) {
            if (M0(i)) {
            }
        }
        return false;
    }

    public final boolean M0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = bl.P(this).C.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            ez1.a();
            return false;
        }
        if (i != 4) {
            yc.l("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = bl.P(this).C.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        ez1.a();
        return false;
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        z61 z61VarE = pu0Var.e(j);
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new pd(z61VarE, 4));
    }
}
