package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l8 implements tw1 {
    public final View a;
    public final sa0 b;
    public final ha0 c;
    public final qy0 d = new qy0();
    public final qq1 e = new qq1(new d8(this, 0));
    public final d8 f = new d8(this, 1);
    public final d8 g = new d8(this, 2);
    public ActionMode h;
    public j8 i;
    public Runnable j;

    public l8(View view, sa0 sa0Var, ha0 ha0Var) {
        this.a = view;
        this.b = sa0Var;
        this.c = ha0Var;
    }

    @Override // defpackage.tw1
    public final Object a(lw1 lw1Var, zu1 zu1Var) {
        ks ksVar = null;
        k8 k8Var = new k8(this, lw1Var, ksVar, 0);
        qy0 qy0Var = this.d;
        qy0Var.getClass();
        Object objR = bl.r(new i9(qy0Var, k8Var, ksVar, 3), zu1Var);
        return objR == wt.e ? objR : t32.a;
    }
}
