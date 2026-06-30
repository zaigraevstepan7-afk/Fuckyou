package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 implements z71 {
    public final View a;
    public final oc b;
    public final hz1 c;
    public boolean d;
    public sa0 e;
    public sa0 f;
    public az1 g;
    public df0 h;
    public final ArrayList i;
    public final hm0 j;
    public Rect k;
    public final hu l;
    public final iy0 m;
    public p n;

    public jz1(View view, h4 h4Var) {
        oc ocVar = new oc();
        ocVar.a = view;
        ocVar.b = al.E(new a7(6, ocVar));
        ocVar.c = new y41(view);
        hz1 hz1Var = new hz1(view);
        this.a = view;
        this.b = ocVar;
        this.c = hz1Var;
        this.e = zz0.v;
        this.f = zz0.w;
        this.g = new az1("", wz1.b, 4);
        this.h = df0.g;
        this.i = new ArrayList();
        this.j = al.E(new a7(15, this));
        this.l = new hu(h4Var, ocVar);
        this.m = new iy0(new iz1[16]);
    }

    @Override // defpackage.z71
    public final void a(az1 az1Var, df0 df0Var, kf kfVar, qs qsVar) {
        this.d = true;
        this.g = az1Var;
        this.h = df0Var;
        this.e = kfVar;
        this.f = qsVar;
        i(iz1.e);
    }

    @Override // defpackage.z71
    public final void b(az1 az1Var, z01 z01Var, pz1 pz1Var, kh khVar, pc1 pc1Var, pc1 pc1Var2) {
        hu huVar = this.l;
        synchronized (huVar.c) {
            try {
                huVar.j = az1Var;
                huVar.l = z01Var;
                huVar.k = pz1Var;
                huVar.m = khVar;
                huVar.n = pc1Var;
                huVar.o = pc1Var2;
                if (huVar.e || huVar.d) {
                    huVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z71
    public final void c() {
        i(iz1.e);
    }

    @Override // defpackage.z71
    public final void d(az1 az1Var, az1 az1Var2) {
        boolean z = (wz1.b(this.g.b, az1Var2.b) && xi0.o(this.g.c, az1Var2.c)) ? false : true;
        this.g = az1Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            lc1 lc1Var = (lc1) ((WeakReference) this.i.get(i)).get();
            if (lc1Var != null) {
                lc1Var.d = az1Var2;
            }
        }
        hu huVar = this.l;
        synchronized (huVar.c) {
            huVar.j = null;
            huVar.l = null;
            huVar.k = null;
            huVar.m = a4.x;
            huVar.n = null;
            huVar.o = null;
        }
        if (xi0.o(az1Var, az1Var2)) {
            if (z) {
                oc ocVar = this.b;
                int iF = wz1.f(az1Var2.b);
                int iE = wz1.e(az1Var2.b);
                wz1 wz1Var = this.g.c;
                int iF2 = wz1Var != null ? wz1.f(wz1Var.a) : -1;
                wz1 wz1Var2 = this.g.c;
                ((InputMethodManager) ((hm0) ocVar.b).getValue()).updateSelection((View) ocVar.a, iF, iE, iF2, wz1Var2 != null ? wz1.e(wz1Var2.a) : -1);
                return;
            }
            return;
        }
        if (az1Var != null && (!xi0.o(az1Var.a.f, az1Var2.a.f) || (wz1.b(az1Var.b, az1Var2.b) && !xi0.o(az1Var.c, az1Var2.c)))) {
            oc ocVar2 = this.b;
            ((InputMethodManager) ((hm0) ocVar2.b).getValue()).restartInput((View) ocVar2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lc1 lc1Var2 = (lc1) ((WeakReference) this.i.get(i2)).get();
            if (lc1Var2 != null) {
                az1 az1Var3 = this.g;
                oc ocVar3 = this.b;
                if (lc1Var2.h) {
                    lc1Var2.d = az1Var3;
                    if (lc1Var2.f) {
                        ((InputMethodManager) ((hm0) ocVar3.b).getValue()).updateExtractedText((View) ocVar3.a, lc1Var2.e, bk.Z(az1Var3));
                    }
                    wz1 wz1Var3 = az1Var3.c;
                    long j = az1Var3.b;
                    int iF3 = wz1Var3 != null ? wz1.f(wz1Var3.a) : -1;
                    wz1 wz1Var4 = az1Var3.c;
                    ((InputMethodManager) ((hm0) ocVar3.b).getValue()).updateSelection((View) ocVar3.a, wz1.f(j), wz1.e(j), iF3, wz1Var4 != null ? wz1.e(wz1Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.z71
    public final void e() {
        i(iz1.g);
    }

    @Override // defpackage.z71
    public final void f() {
        i(iz1.h);
    }

    @Override // defpackage.z71
    public final void g() {
        this.d = false;
        this.e = zz0.x;
        this.f = zz0.y;
        this.k = null;
        i(iz1.f);
    }

    @Override // defpackage.z71
    public final void h(pc1 pc1Var) {
        Rect rect;
        this.k = new Rect(nu0.I(pc1Var.a), nu0.I(pc1Var.b), nu0.I(pc1Var.c), nu0.I(pc1Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(iz1 iz1Var) {
        this.m.b(iz1Var);
        if (this.n == null) {
            p pVar = new p(11, this);
            this.c.execute(pVar);
            this.n = pVar;
        }
    }
}
