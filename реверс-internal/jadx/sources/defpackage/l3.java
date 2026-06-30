package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends fe implements i80 {
    public final xg0 e;
    public final ul1 f;
    public final h4 g;
    public final sc1 h;
    public final String i;
    public final Rect j = new Rect();
    public final AutofillId k;
    public final ix0 l;
    public boolean m;

    public l3(xg0 xg0Var, ul1 ul1Var, h4 h4Var, sc1 sc1Var, String str) {
        this.e = xg0Var;
        this.f = ul1Var;
        this.g = h4Var;
        this.h = sc1Var;
        this.i = str;
        h4Var.setImportantForAutofill(1);
        AutofillId autofillId = h4Var.getAutofillId();
        if (autofillId == null) {
            throw s91.g("Required value was null.");
        }
        this.k = autofillId;
        this.l = new ix0();
    }

    @Override // defpackage.i80
    public final void d(w80 w80Var, w80 w80Var2) {
        ql0 ql0VarP;
        nl1 nl1VarW;
        ql0 ql0VarP2;
        nl1 nl1VarW2;
        h4 h4Var = this.g;
        xg0 xg0Var = this.e;
        if (w80Var != null && (ql0VarP2 = bl.P(w80Var)) != null && (nl1VarW2 = ql0VarP2.w()) != null && xi0.m(nl1VarW2)) {
            xg0Var.w().notifyViewExited(h4Var, ql0VarP2.f);
        }
        if (w80Var2 == null || (ql0VarP = bl.P(w80Var2)) == null || (nl1VarW = ql0VarP.w()) == null || !xi0.m(nl1VarW)) {
            return;
        }
        int i = ql0VarP.f;
        sc1 sc1Var = this.h;
        ql0 ql0Var = (ql0) sc1Var.a.b(i);
        if (ql0Var == null || ql0Var.k == -4) {
            return;
        }
        g6 g6Var = sc1Var.c;
        int iE = sc1Var.e(ql0Var);
        long[] jArr = (long[]) g6Var.b;
        long j = jArr[iE];
        long j2 = jArr[iE + 1];
        xg0Var.w().notifyViewEntered(h4Var, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
