package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.reddit.secondpage.R;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y92 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final v92 a(r rVar, ip ipVar, jo joVar) {
        h4 h4Var;
        v92 v92Var;
        Object[] objArr = 0;
        if (hc0.a.compareAndSet(false, true)) {
            rh rhVarD = nu0.d(1, 6, null);
            nu0.A(bl.d((lt) w8.q.getValue()), null, null, new g(rhVarD, objArr == true ? 1 : 0, 9), 3);
            g3 g3Var = new g3(10, rhVarD);
            synchronized (aq1.c) {
                aq1.i = pl.k0(aq1.i, g3Var);
            }
            aq1.a();
        }
        if (rVar.getChildCount() > 0) {
            View childAt = rVar.getChildAt(0);
            if (childAt instanceof h4) {
                h4Var = (h4) childAt;
            }
            if (h4Var == null) {
                h4Var = new h4(rVar.getContext(), ipVar);
                rVar.addView(h4Var.getView(), a);
            }
            if (h4Var.getComposeViewContext() != ipVar) {
                rVar.m(ipVar);
            }
            if (rVar.getComposeViewContext$ui() != null) {
                ipVar.d();
                h4Var.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = h4Var.getTag(R.id.wrapped_composition_tag);
            v92Var = tag instanceof v92 ? (v92) tag : null;
            if (v92Var == null) {
                k32 k32Var = new k32(h4Var.getRoot());
                ipVar.f();
                op opVar = ipVar.c;
                opVar.getClass();
                v92Var = new v92(h4Var, new tp(opVar, k32Var));
                h4Var.setTag(R.id.wrapped_composition_tag, v92Var);
            }
            v92Var.f(joVar);
            ipVar.f();
            op opVar2 = ipVar.c;
            opVar2.getClass();
            h4Var.setFrameEndScheduler$ui(new x92(opVar2));
            return v92Var;
        }
        rVar.removeAllViews();
        h4Var = null;
        if (h4Var == null) {
        }
        if (h4Var.getComposeViewContext() != ipVar) {
        }
        if (rVar.getComposeViewContext$ui() != null) {
        }
        Object tag2 = h4Var.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof v92) {
        }
        if (v92Var == null) {
        }
        v92Var.f(joVar);
        ipVar.f();
        op opVar22 = ipVar.c;
        opVar22.getClass();
        h4Var.setFrameEndScheduler$ui(new x92(opVar22));
        return v92Var;
    }
}
