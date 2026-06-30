package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n6 implements z71 {
    public eo0 a;
    public jr1 b;
    public ko0 c;
    public tn1 d;

    @Override // defpackage.z71
    public final void a(az1 az1Var, df0 df0Var, kf kfVar, qs qsVar) {
        j(new h2(az1Var, this, df0Var, kfVar, qsVar, 1));
    }

    @Override // defpackage.z71
    public final void b(az1 az1Var, z01 z01Var, pz1 pz1Var, kh khVar, pc1 pc1Var, pc1 pc1Var2) {
        ko0 ko0Var = this.c;
        if (ko0Var != null) {
            fo0 fo0Var = ko0Var.m;
            synchronized (fo0Var.c) {
                try {
                    fo0Var.j = az1Var;
                    fo0Var.l = z01Var;
                    fo0Var.k = pz1Var;
                    fo0Var.m = pc1Var;
                    fo0Var.n = pc1Var2;
                    if (fo0Var.e || fo0Var.d) {
                        fo0Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.z71
    public final void c() {
        j(null);
    }

    @Override // defpackage.z71
    public final void d(az1 az1Var, az1 az1Var2) {
        ko0 ko0Var = this.c;
        if (ko0Var != null) {
            boolean z = (wz1.b(ko0Var.h.b, az1Var2.b) && xi0.o(ko0Var.h.c, az1Var2.c)) ? false : true;
            ko0Var.h = az1Var2;
            int size = ko0Var.j.size();
            for (int i = 0; i < size; i++) {
                mc1 mc1Var = (mc1) ((WeakReference) ko0Var.j.get(i)).get();
                if (mc1Var != null) {
                    mc1Var.g = az1Var2;
                }
            }
            fo0 fo0Var = ko0Var.m;
            synchronized (fo0Var.c) {
                fo0Var.j = null;
                fo0Var.l = null;
                fo0Var.k = null;
                fo0Var.m = null;
                fo0Var.n = null;
            }
            if (xi0.o(az1Var, az1Var2)) {
                if (z) {
                    xg0 xg0Var = ko0Var.b;
                    int iF = wz1.f(az1Var2.b);
                    int iE = wz1.e(az1Var2.b);
                    wz1 wz1Var = ko0Var.h.c;
                    int iF2 = wz1Var != null ? wz1.f(wz1Var.a) : -1;
                    wz1 wz1Var2 = ko0Var.h.c;
                    xg0Var.u().updateSelection((View) xg0Var.f, iF, iE, iF2, wz1Var2 != null ? wz1.e(wz1Var2.a) : -1);
                    return;
                }
                return;
            }
            if (az1Var != null && (!xi0.o(az1Var.a.f, az1Var2.a.f) || (wz1.b(az1Var.b, az1Var2.b) && !xi0.o(az1Var.c, az1Var2.c)))) {
                xg0 xg0Var2 = ko0Var.b;
                xg0Var2.u().restartInput((View) xg0Var2.f);
                return;
            }
            int size2 = ko0Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                mc1 mc1Var2 = (mc1) ((WeakReference) ko0Var.j.get(i2)).get();
                if (mc1Var2 != null) {
                    az1 az1Var3 = ko0Var.h;
                    xg0 xg0Var3 = ko0Var.b;
                    if (mc1Var2.k) {
                        mc1Var2.g = az1Var3;
                        if (mc1Var2.i) {
                            xg0Var3.u().updateExtractedText((View) xg0Var3.f, mc1Var2.h, bl.l(az1Var3));
                        }
                        wz1 wz1Var3 = az1Var3.c;
                        long j = az1Var3.b;
                        int iF3 = wz1Var3 != null ? wz1.f(wz1Var3.a) : -1;
                        wz1 wz1Var4 = az1Var3.c;
                        xg0Var3.u().updateSelection((View) xg0Var3.f, wz1.f(j), wz1.e(j), iF3, wz1Var4 != null ? wz1.e(wz1Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.z71
    public final void e() {
        rq1 rq1Var;
        eo0 eo0Var = this.a;
        if (eo0Var == null || (rq1Var = (rq1) hk.o(eo0Var, aq.q)) == null) {
            return;
        }
        ((zw) rq1Var).b();
    }

    @Override // defpackage.z71
    public final void f() {
        rq1 rq1Var;
        eo0 eo0Var = this.a;
        if (eo0Var == null || (rq1Var = (rq1) hk.o(eo0Var, aq.q)) == null) {
            return;
        }
        ((zw) rq1Var).a();
    }

    @Override // defpackage.z71
    public final void g() {
        jr1 jr1Var = this.b;
        if (jr1Var != null) {
            jr1Var.a(null);
        }
        this.b = null;
        dy0 dy0VarI = i();
        if (dy0VarI != null) {
            tn1 tn1Var = (tn1) dy0VarI;
            synchronized (tn1Var) {
                tn1Var.v(tn1Var.p() + ((long) tn1Var.o), tn1Var.n, tn1Var.p() + ((long) tn1Var.o), tn1Var.p() + ((long) tn1Var.o) + ((long) tn1Var.p));
            }
        }
    }

    @Override // defpackage.z71
    public final void h(pc1 pc1Var) {
        Rect rect;
        ko0 ko0Var = this.c;
        if (ko0Var != null) {
            ko0Var.l = new Rect(nu0.I(pc1Var.a), nu0.I(pc1Var.b), nu0.I(pc1Var.c), nu0.I(pc1Var.d));
            if (!ko0Var.j.isEmpty() || (rect = ko0Var.l) == null) {
                return;
            }
            ko0Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final dy0 i() {
        tn1 tn1Var = this.d;
        if (tn1Var != null) {
            return tn1Var;
        }
        if (!du1.a) {
            return null;
        }
        tn1 tn1VarD = s22.d(2, ph.g);
        this.d = tn1VarD;
        return tn1VarD;
    }

    public final void j(h2 h2Var) {
        eo0 eo0Var = this.a;
        if (eo0Var == null) {
            return;
        }
        jr1 jr1VarA = null;
        m6 m6Var = new m6(h2Var, this, eo0Var, jr1VarA, 0);
        if (eo0Var.r) {
            jr1VarA = nu0.A(eo0Var.z0(), null, yt.h, new e(eo0Var, m6Var, jr1VarA, 18), 1);
        }
        this.b = jr1VarA;
    }

    public final void k(eo0 eo0Var) {
        eo0 eo0Var2 = this.a;
        if (!(eo0Var2 == eo0Var)) {
            qg0.c("Expected textInputModifierNode to be " + eo0Var + " but was " + eo0Var2);
        }
        this.a = null;
    }
}
