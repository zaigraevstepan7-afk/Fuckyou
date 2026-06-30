package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d12 extends uk {
    public boolean Q;
    public sa0 R;
    public final p7 S;

    public d12(boolean z, jx0 jx0Var, yf1 yf1Var, sa0 sa0Var) {
        super(jx0Var, null, false, true, null, yf1Var, new g31(sa0Var, z, 1));
        this.Q = z;
        this.R = sa0Var;
        this.S = new p7(28, this);
    }

    @Override // defpackage.m
    public final void O0(am1 am1Var) {
        e12 e12Var = this.Q ? e12.e : e12.f;
        ck0[] ck0VarArr = yl1.a;
        zl1 zl1Var = vl1.K;
        ck0[] ck0VarArr2 = yl1.a;
        ck0 ck0Var = ck0VarArr2[26];
        am1Var.a(zl1Var, e12Var);
        b5 b5Var = v20.y;
        zl1 zl1Var2 = vl1.s;
        ck0 ck0Var2 = ck0VarArr2[9];
        am1Var.a(zl1Var2, b5Var);
        y5 y5Var = new y5(AutofillValue.forToggle(this.Q));
        zl1 zl1Var3 = vl1.t;
        ck0 ck0Var3 = ck0VarArr2[10];
        am1Var.a(zl1Var3, y5Var);
        am1Var.a(ml1.h, new r0(null, new wt1(6, am1Var)));
    }
}
