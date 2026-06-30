package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ho1 extends bp {
    public Object b;
    public Object c;
    public ay0 d;
    public ay0 e;
    public im1 f;
    public final n g;
    public final i2 h;

    public ho1() {
        super(1);
        this.g = new n(28, this);
        ud udVar = new ud(17, this);
        aq1.e(aq1.a);
        synchronized (aq1.c) {
            aq1.h = pl.k0(aq1.h, udVar);
        }
        this.h = new i2(udVar);
    }

    @Override // defpackage.bp
    public final void c(im1 im1Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.bp
    public final void d() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        ay0 ay0Var = qi1.a;
                        this.d = new ay0();
                    }
                    ay0 ay0Var2 = this.d;
                    this.d = this.e;
                    this.e = ay0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bp
    public final void e() {
        this.h.a();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.bp
    public final sa0 g(im1 im1Var) {
        im1 im1Var2 = this.f;
        if (im1Var2 != null && !im1Var2.equals(im1Var)) {
            e91.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = im1Var;
        return this.g;
    }

    @Override // defpackage.bp
    public final void h(mj mjVar) {
        this.f = null;
        this.c = null;
        this.e = null;
        d();
    }
}
