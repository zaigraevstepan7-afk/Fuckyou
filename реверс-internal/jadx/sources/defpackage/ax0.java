package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ax0 extends bp {
    public final zx0 b;
    public final ArrayList c;
    public final zx0 d;
    public final i2 e;

    public ax0() {
        super(1);
        this.b = qc1.g();
        this.c = new ArrayList();
        this.d = new zx0();
        ud udVar = new ud(11, this);
        aq1.e(aq1.a);
        synchronized (aq1.c) {
            aq1.h = pl.k0(aq1.h, udVar);
        }
        this.e = new i2(udVar);
    }

    @Override // defpackage.bp
    public final void c(im1 im1Var) {
        this.c.add(new yw0(im1Var));
    }

    @Override // defpackage.bp
    public final void d() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zw0 zw0Var = (zw0) arrayList.get(i);
                    if (zw0Var instanceof xw0) {
                        qc1.d(this.b, ((xw0) zw0Var).a, ((xw0) zw0Var).b);
                    } else {
                        if (!(zw0Var instanceof yw0)) {
                            throw new pn();
                        }
                        qc1.w(this.b, ((yw0) zw0Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.bp
    public final void e() {
        this.e.a();
        this.c.clear();
        this.d.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.bp
    public final sa0 g(im1 im1Var) {
        zx0 zx0Var = this.d;
        sa0 dVar = (sa0) zx0Var.g(im1Var);
        if (dVar == null) {
            dVar = new d(15, this, im1Var);
            int iF = zx0Var.f(im1Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = zx0Var.c;
            Object obj = objArr[iF];
            zx0Var.b[iF] = im1Var;
            objArr[iF] = dVar;
        }
        return dVar;
    }

    @Override // defpackage.bp
    public final void h(mj mjVar) {
        this.d.k(mjVar);
        c(mjVar);
        d();
    }
}
