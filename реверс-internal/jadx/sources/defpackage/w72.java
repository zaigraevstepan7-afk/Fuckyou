package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class w72 extends c82 {
    public final WindowInsets.Builder e;

    public w72(p82 p82Var) {
        super(p82Var);
        WindowInsets windowInsetsB = p82Var.b();
        this.e = windowInsetsB != null ? v72.d(windowInsetsB) : v72.c();
    }

    @Override // defpackage.c82
    public p82 b() {
        a();
        p82 p82VarC = p82.c(this.e.build(), null);
        eh0[] eh0VarArr = this.b;
        m82 m82Var = p82VarC.a;
        m82Var.v(eh0VarArr);
        m82Var.u(null);
        m82Var.z(this.c);
        m82Var.A(this.d);
        return p82VarC;
    }

    @Override // defpackage.c82
    public void e(eh0 eh0Var) {
        this.e.setMandatorySystemGestureInsets(eh0Var.d());
    }

    @Override // defpackage.c82
    public void f(eh0 eh0Var) {
        this.e.setStableInsets(eh0Var.d());
    }

    @Override // defpackage.c82
    public void g(eh0 eh0Var) {
        this.e.setSystemGestureInsets(eh0Var.d());
    }

    @Override // defpackage.c82
    public void h(eh0 eh0Var) {
        this.e.setSystemWindowInsets(eh0Var.d());
    }

    @Override // defpackage.c82
    public void i(eh0 eh0Var) {
        this.e.setTappableElementInsets(eh0Var.d());
    }

    public w72() {
        this.e = v72.c();
    }
}
