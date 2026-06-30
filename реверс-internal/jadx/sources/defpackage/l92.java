package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.reddit.secondpage.R;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l92 {
    public static final zx0 a;

    static {
        long[] jArr = pi1.a;
        a = new zx0();
    }

    public static final op a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof op) {
            return (op) tag;
        }
        return null;
    }

    public static final jc1 b(View view) {
        lt ltVar;
        y8 y8Var;
        if (!view.isAttachedToWindow()) {
            ng0.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objS = af1.s(view);
        while (objS instanceof View) {
            View view2 = (View) objS;
            if (view2.getId() == 16908290) {
                break;
            }
            objS = view2.getParent();
            view = view2;
        }
        op opVarA = a(view);
        ks ksVar = null;
        if (opVarA != null) {
            if (opVarA instanceof jc1) {
                return (jc1) opVarA;
            }
            yc.l("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((f92) g92.a.get()).getClass();
        lt ltVar2 = d40.e;
        jv1 jv1Var = w8.q;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ltVar = (lt) w8.q.getValue();
        } else {
            ltVar = (lt) w8.r.get();
            if (ltVar == null) {
                yc.l("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        lt ltVarJ = ltVar.j(ltVar2);
        y8 y8Var2 = (y8) ltVarJ.l(v20.P);
        if (y8Var2 != null) {
            y8Var = new y8(y8Var2);
            tk0 tk0Var = (tk0) y8Var.g;
            synchronized (tk0Var.b) {
                tk0Var.a = false;
            }
        } else {
            y8Var = null;
        }
        zc1 zc1Var = new zc1();
        lt bw0Var = (aw0) ltVarJ.l(v20.Q);
        if (bw0Var == null) {
            bw0Var = new bw0(view.getContext().getApplicationContext());
            zc1Var.e = bw0Var;
        }
        if (y8Var != null) {
            ltVar2 = y8Var;
        }
        lt ltVarJ2 = ltVarJ.j(ltVar2).j(bw0Var);
        jc1 jc1Var = new jc1(ltVarJ2);
        synchronized (jc1Var.c) {
            jc1Var.t = true;
        }
        js jsVarD = bl.d(ltVarJ2);
        xo0 xo0VarI = ef1.i(view);
        zo0 zo0VarG = xo0VarI != null ? xo0VarI.g() : null;
        if (zo0VarG == null) {
            ng0.c("ViewTreeLifecycleOwner not found from " + view);
            yc.j();
            return null;
        }
        view.addOnAttachStateChangeListener(new h92(view, jc1Var));
        zo0VarG.a(new j92(jsVarD, y8Var, jc1Var, zc1Var));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, jc1Var);
        ec0 ec0Var = ec0.e;
        Handler handler = view.getHandler();
        int i = fd0.a;
        view.addOnAttachStateChangeListener(new d6(2, nu0.A(ec0Var, new ed0(handler, "windowRecomposer cleanup", false).j, null, new qk1(jc1Var, view, ksVar, 8), 2)));
        return jc1Var;
    }
}
