package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nh1 implements jh1, vh1 {
    public final /* synthetic */ kh1 e;
    public zo0 f;
    public n81 g;

    public nh1(kh1 kh1Var) {
        this.e = kh1Var;
        Object objF = kh1Var.f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objF instanceof Bundle ? (Bundle) objF : null;
        if (bundle != null && this.g == null) {
            n81 n81Var = new n81(new uh1(this, new p7(17, this)), 3);
            this.g = n81Var;
            n81Var.k(bundle);
        }
        kh1Var.a("androidx.savedstate.SavedStateRegistry", new p7(16, this));
    }

    @Override // defpackage.jh1
    public final oc a(String str, ha0 ha0Var) {
        return this.e.a(str, ha0Var);
    }

    @Override // defpackage.vh1
    public final n81 c() {
        n81 n81Var = this.g;
        if (n81Var == null) {
            n81 n81Var2 = new n81(new uh1(this, new p7(17, this)), 3);
            this.g = n81Var2;
            n81Var2.k(null);
            n81Var = n81Var2;
        }
        return (n81) n81Var.c;
    }

    @Override // defpackage.jh1
    public final boolean d(Object obj) {
        return this.e.d(obj);
    }

    @Override // defpackage.jh1
    public final Map e() {
        return this.e.e();
    }

    @Override // defpackage.jh1
    public final Object f(String str) {
        return this.e.f(str);
    }

    @Override // defpackage.xo0
    public final zo0 g() {
        zo0 zo0Var = this.f;
        if (zo0Var != null) {
            return zo0Var;
        }
        zo0 zo0Var2 = new zo0(this, false);
        this.f = zo0Var2;
        return zo0Var2;
    }
}
