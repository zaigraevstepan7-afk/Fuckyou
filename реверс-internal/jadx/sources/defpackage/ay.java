package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ay extends kl {
    public final /* synthetic */ cy g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(cy cyVar) {
        super(1);
        this.g = cyVar;
    }

    @Override // defpackage.kl
    public final p82 g(p82 p82Var, List list) {
        cy cyVar = this.g;
        if (!cyVar.q) {
            View childAt = cyVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, cyVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, cyVar.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return p82Var.a.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return p82Var;
    }

    @Override // defpackage.kl
    public final n81 h(t72 t72Var, n81 n81Var) {
        cy cyVar = this.g;
        if (!cyVar.q) {
            View childAt = cyVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, cyVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, cyVar.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                eh0 eh0VarB = eh0.b(iMax, iMax2, iMax3, iMax4);
                int i = eh0VarB.a;
                eh0 eh0Var = (eh0) n81Var.b;
                int i2 = eh0VarB.b;
                int i3 = eh0VarB.c;
                int i4 = eh0VarB.d;
                return new n81(11, p82.a(eh0Var, i, i2, i3, i4), p82.a((eh0) n81Var.c, i, i2, i3, i4));
            }
        }
        return n81Var;
    }
}
