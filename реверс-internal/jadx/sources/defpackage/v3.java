package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v3 extends sv0 implements vg, pl1, jk0, il0, i22 {
    public x82 s;
    public final q t = new q(1, this);
    public final g3 u = new g3(1, this);
    public final /* synthetic */ h4 v;

    public v3(h4 h4Var) {
        this.v = h4Var;
    }

    @Override // defpackage.jk0
    public final boolean P(KeyEvent keyEvent) {
        a80 a80Var;
        int[] iArr = g80.a;
        long jA = bl.A(keyEvent);
        if (ek0.a(jA, ek0.b)) {
            a80Var = new a80(2);
        } else if (ek0.a(jA, ek0.c)) {
            a80Var = new a80(1);
        } else if (ek0.a(jA, ek0.p)) {
            a80Var = new a80(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            a80Var = ek0.a(jA, ek0.g) ? new a80(4) : ek0.a(jA, ek0.f) ? new a80(3) : (ek0.a(jA, ek0.d) || ek0.a(jA, ek0.C)) ? new a80(5) : (ek0.a(jA, ek0.e) || ek0.a(jA, ek0.D)) ? new a80(6) : (ek0.a(jA, ek0.h) || ek0.a(jA, ek0.r) || ek0.a(jA, ek0.E)) ? new a80(7) : (ek0.a(jA, ek0.a) || ek0.a(jA, ek0.u)) ? new a80(8) : null;
        }
        if (a80Var != null) {
            int i = a80Var.a;
            if (bl.D(keyEvent) == 2) {
                h4 h4Var = this.v;
                ((m80) h4Var.getFocusOwner()).f();
                Boolean boolE = ((m80) h4Var.getFocusOwner()).e(i, h4Var.getEmbeddedViewFocusRect(), new g3(2, a80Var));
                if (boolE == null) {
                    return true;
                }
                if (boolE.booleanValue()) {
                    h4Var.getPlayNavigationSoundEffect$ui().h(a80Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numB = g80.b(i);
                int iIntValue = numB != null ? numB.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = h4Var.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, h4Var.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(h4Var)) {
                    return ((m80) h4Var.getFocusOwner()).h(i);
                }
            }
        }
        return false;
    }

    @Override // defpackage.vg
    public final Object b0(c01 c01Var, y3 y3Var, ls lsVar) {
        long jM = c01Var.M(0L);
        pc1 pc1Var = (pc1) y3Var.a();
        pc1 pc1VarI = pc1Var != null ? pc1Var.i(jM) : null;
        if (pc1VarI != null) {
            this.v.requestRectangleOnScreen(new Rect((int) pc1VarI.a, (int) pc1VarI.b, (int) pc1VarI.c, (int) pc1VarI.d), false);
        }
        return t32.a;
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        z61 z61VarE = pu0Var.e(j);
        int i = z61VarE.e;
        int i2 = z61VarE.f;
        u3 u3Var = new u3(z61VarE, 0);
        return xu0Var.V(i, i2, this.u, this.t, g40.e, u3Var);
    }

    @Override // defpackage.jk0
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.i22
    public final Object p() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
    }
}
