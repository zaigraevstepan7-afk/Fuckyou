package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k32 implements vc {
    public final Object e;
    public final ArrayList f = new ArrayList();
    public Object g;

    public k32(ql0 ql0Var) {
        this.e = ql0Var;
        this.g = ql0Var;
    }

    public final void a() {
        this.f.clear();
        this.g = this.e;
        ((ql0) this.e).T();
    }

    @Override // defpackage.vc
    public final void c(int i, Object obj) {
        ((ql0) this.g).B(i, (ql0) obj);
    }

    @Override // defpackage.vc
    public final void d(Object obj) {
        this.f.add(this.g);
        this.g = obj;
    }

    @Override // defpackage.vc
    public final void e() {
        sc1 rectManager;
        l3 autofillManager;
        sc1 rectManager2;
        ql0 ql0Var = (ql0) this.g;
        xz0 xz0Var = ql0Var.I;
        if (!ql0Var.J()) {
            ng0.a("onReuse is only expected on attached node");
        }
        em0 em0Var = ql0Var.K;
        if (em0Var != null) {
            em0Var.i(false);
        }
        ql0Var.w = false;
        if (ql0Var.R) {
            ql0Var.R = false;
        } else {
            sv0 sv0Var = ql0Var.I.e;
            for (sv0 sv0Var2 = sv0Var; sv0Var2 != null; sv0Var2 = sv0Var2.i) {
                if (sv0Var2.r) {
                    sv0Var2.G0();
                }
            }
            for (sv0 sv0Var3 = sv0Var; sv0Var3 != null; sv0Var3 = sv0Var3.i) {
                if (sv0Var3.r) {
                    sv0Var3.I0();
                }
            }
            while (sv0Var != null) {
                if (sv0Var.r) {
                    sv0Var.C0();
                }
                sv0Var = sv0Var.i;
            }
        }
        int i = ql0Var.f;
        w31 w31Var = ql0Var.r;
        if (w31Var != null && (rectManager2 = ((h4) w31Var).getRectManager()) != null) {
            rectManager2.i(ql0Var);
        }
        ql0Var.f = ol1.a.addAndGet(1);
        w31 w31Var2 = ql0Var.r;
        if (w31Var2 != null) {
            h4 h4Var = (h4) w31Var2;
            h4Var.m1914getLayoutNodes().g(i);
            h4Var.m1914getLayoutNodes().i(ql0Var.f, ql0Var);
        }
        for (sv0 sv0Var4 = xz0Var.f; sv0Var4 != null; sv0Var4 = sv0Var4.j) {
            sv0Var4.B0();
        }
        xz0Var.e();
        if (xz0Var.d(8)) {
            ql0Var.H();
        }
        ql0.a0(ql0Var);
        w31 w31Var3 = ql0Var.r;
        if (w31Var3 != null && (autofillManager = ((h4) w31Var3).getAutofillManager()) != null) {
            h4 h4Var2 = autofillManager.g;
            xg0 xg0Var = autofillManager.e;
            ix0 ix0Var = autofillManager.l;
            if (ix0Var.e(i)) {
                xg0Var.A(h4Var2, i, false);
            }
            nl1 nl1VarW = ql0Var.w();
            if (nl1VarW != null && nl1VarW.e.b(vl1.r)) {
                ix0Var.a(ql0Var.f);
                xg0Var.A(h4Var2, ql0Var.f, true);
            }
        }
        w31 w31Var4 = ql0Var.r;
        if (w31Var4 == null || (rectManager = ((h4) w31Var4).getRectManager()) == null) {
            return;
        }
        rectManager.h(ql0Var);
    }

    @Override // defpackage.vc
    public final /* bridge */ /* synthetic */ void f(int i, Object obj) {
    }

    @Override // defpackage.vc
    public final void g() {
        sx0 sx0Var;
        Object[] objArr;
        w31 w31Var = ((ql0) this.e).r;
        if (w31Var != null) {
            h4 h4Var = (h4) w31Var;
            if (h4Var.M) {
                qq1 qq1Var = h4Var.getSnapshotObserver().a;
                synchronized (qq1Var.g) {
                    try {
                        iy0 iy0Var = qq1Var.f;
                        int i = iy0Var.g;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            objArr = iy0Var.e;
                            if (i2 >= i) {
                                break;
                            }
                            pq1 pq1Var = (pq1) objArr[i2];
                            pq1Var.c();
                            if (!pq1Var.f.j()) {
                                i3++;
                            } else if (i3 > 0) {
                                Object[] objArr2 = iy0Var.e;
                                objArr2[i2 - i3] = objArr2[i2];
                            }
                            i2++;
                        }
                        int i4 = i - i3;
                        Arrays.fill(objArr, i4, i, (Object) null);
                        iy0Var.g = i4;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                h4Var.M = false;
            }
            l3 autofillManager = h4Var.getAutofillManager();
            if (autofillManager != null) {
                ix0 ix0Var = autofillManager.l;
                if (ix0Var.d == 0 && autofillManager.m) {
                    autofillManager.e.w().commit();
                    autofillManager.m = false;
                }
                if (ix0Var.d != 0) {
                    autofillManager.m = true;
                }
            }
            while (h4Var.r0.i() && h4Var.r0.f(0) != null) {
                int i5 = h4Var.r0.b;
                int i6 = 0;
                while (true) {
                    sx0Var = h4Var.r0;
                    if (i6 < i5) {
                        ha0 ha0Var = (ha0) sx0Var.f(i6);
                        h4Var.r0.n(i6, null);
                        if (ha0Var != null) {
                            ha0Var.a();
                        }
                        i6++;
                    }
                }
                sx0Var.l(0, i5);
            }
        }
    }

    @Override // defpackage.vc
    public final void h(int i, int i2, int i3) {
        ((ql0) this.g).N(i, i2, i3);
    }

    @Override // defpackage.vc
    public final Object i() {
        return this.g;
    }

    @Override // defpackage.vc
    public final void j(int i, int i2) {
        ((ql0) this.g).U(i, i2);
    }

    @Override // defpackage.vc
    public final void q() {
        this.g = this.f.remove(r0.size() - 1);
    }
}
