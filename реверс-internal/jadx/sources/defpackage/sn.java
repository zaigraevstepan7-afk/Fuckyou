package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn implements vo0 {
    public final /* synthetic */ n11 e;
    public final /* synthetic */ bo f;

    public /* synthetic */ sn(n11 n11Var, bo boVar) {
        this.e = n11Var;
        this.f = boVar;
    }

    @Override // defpackage.vo0
    public final void e(xo0 xo0Var, po0 po0Var) {
        if (po0Var == po0.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.f.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.e.b(onBackInvokedDispatcher);
        }
    }
}
