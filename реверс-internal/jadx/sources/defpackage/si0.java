package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class si0 extends sv0 implements il0 {
    public final /* synthetic */ int s;

    public int D(ws0 ws0Var, pu0 pu0Var, int i) {
        switch (this.s) {
        }
        return pu0Var.a0(i);
    }

    public abstract long L0(pu0 pu0Var, long j);

    public abstract boolean M0();

    @Override // defpackage.il0
    public int O(ws0 ws0Var, pu0 pu0Var, int i) {
        switch (this.s) {
        }
        return pu0Var.O(i);
    }

    public vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        long jL0 = L0(pu0Var, j);
        if (M0()) {
            jL0 = lr.e(j, jL0);
        }
        z61 z61VarE = pu0Var.e(jL0);
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new pd(z61VarE, 3));
    }

    @Override // defpackage.il0
    public int f(ws0 ws0Var, pu0 pu0Var, int i) {
        switch (this.s) {
        }
        return pu0Var.U(i);
    }

    public int n(ws0 ws0Var, pu0 pu0Var, int i) {
        switch (this.s) {
        }
        return pu0Var.f(i);
    }
}
