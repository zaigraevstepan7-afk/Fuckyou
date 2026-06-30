package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj1 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ uj1 f;

    public /* synthetic */ rj1(uj1 uj1Var, int i) {
        this.e = i;
        this.f = uj1Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        uj1 uj1Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(uj1Var.r);
            default:
                w80 w80Var = uj1Var.T;
                if (!w80Var.e.r) {
                    return null;
                }
                v80 v80VarQ0 = w80Var.Q0();
                int iOrdinal = v80VarQ0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    ez1.a();
                    return null;
                }
                if (v80VarQ0.a()) {
                    return w80Var.O0(null);
                }
                w80 w80VarF = ((m80) ((h4) bl.Q(w80Var)).getFocusOwner()).f();
                if (w80VarF != null) {
                    return w80VarF.O0(bl.O(w80Var));
                }
                return null;
        }
    }
}
