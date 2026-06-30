package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ma1 implements hx {
    public final /* synthetic */ hx e;
    public boolean f;
    public boolean g;
    public final uy0 h = new uy0();

    public ma1(hx hxVar) {
        this.e = hxVar;
    }

    @Override // defpackage.hx
    public final float J(long j) {
        return this.e.J(j);
    }

    @Override // defpackage.hx
    public final int N(float f) {
        return this.e.N(f);
    }

    @Override // defpackage.hx
    public final long X(long j) {
        return this.e.X(j);
    }

    public final void a() {
        this.g = true;
        uy0 uy0Var = this.h;
        if (uy0Var.d()) {
            uy0Var.h(null);
        }
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e.b();
    }

    public final void c() {
        this.f = true;
        uy0 uy0Var = this.h;
        if (uy0Var.d()) {
            uy0Var.h(null);
        }
    }

    @Override // defpackage.hx
    public final float d0(long j) {
        return this.e.d0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ls lsVar) {
        ka1 ka1Var;
        if (lsVar instanceof ka1) {
            ka1Var = (ka1) lsVar;
            int i = ka1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ka1Var.j = i - Integer.MIN_VALUE;
            } else {
                ka1Var = new ka1(this, lsVar);
            }
        }
        Object obj = ka1Var.h;
        int i2 = ka1Var.j;
        if (i2 == 0) {
            xc.G(obj);
            ka1Var.j = 1;
            Object objE = this.h.e(ka1Var);
            wt wtVar = wt.e;
            if (objE == wtVar) {
                return wtVar;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(obj);
        }
        this.f = false;
        this.g = false;
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ls lsVar) {
        la1 la1Var;
        if (lsVar instanceof la1) {
            la1Var = (la1) lsVar;
            int i = la1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                la1Var.j = i - Integer.MIN_VALUE;
            } else {
                la1Var = new la1(this, lsVar);
            }
        }
        Object obj = la1Var.h;
        int i2 = la1Var.j;
        uy0 uy0Var = this.h;
        if (i2 == 0) {
            xc.G(obj);
            if (!this.f && !this.g) {
                la1Var.j = 1;
                Object objE = uy0Var.e(la1Var);
                wt wtVar = wt.e;
                if (objE == wtVar) {
                    return wtVar;
                }
            }
            return Boolean.valueOf(this.f);
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xc.G(obj);
        uy0Var.h(null);
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.hx
    public final float l() {
        return this.e.l();
    }

    @Override // defpackage.hx
    public final long m0(float f) {
        return this.e.m0(f);
    }

    @Override // defpackage.hx
    public final float s0(int i) {
        return this.e.s0(i);
    }

    @Override // defpackage.hx
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.hx
    public final float v0(float f) {
        return this.e.v0(f);
    }

    @Override // defpackage.hx
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.hx
    public final float y(float f) {
        return this.e.y(f);
    }
}
