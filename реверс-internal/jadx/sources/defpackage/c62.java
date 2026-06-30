package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c62 {
    public static p82 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        p82 p82VarC = p82.c(rootWindowInsets, null);
        m82 m82Var = p82VarC.a;
        m82Var.w(p82VarC);
        View rootView = view.getRootView();
        m82Var.d(rootView);
        m82Var.o(rootView);
        m82Var.p();
        return p82VarC;
    }
}
