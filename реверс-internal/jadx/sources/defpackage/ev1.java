package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ev1 implements hx, ks {
    public final /* synthetic */ fv1 e;
    public final xi f;
    public xi g;
    public f81 h = f81.f;
    public final d40 i = d40.e;
    public final /* synthetic */ fv1 j;

    public ev1(fv1 fv1Var, xi xiVar) {
        this.j = fv1Var;
        this.e = fv1Var;
        this.f = xiVar;
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

    public final Object a(f81 f81Var, ye yeVar) {
        xi xiVar = new xi(1, bl.E(yeVar));
        xiVar.v();
        this.h = f81Var;
        this.g = xiVar;
        return xiVar.t();
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e.b();
    }

    public final long c() {
        fv1 fv1Var = this.j;
        long jX = fv1Var.X(bl.P(fv1Var).D.g());
        long j = fv1Var.B;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jX >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jX & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.hx
    public final float d0(long j) {
        return this.e.d0(j);
    }

    @Override // defpackage.ks
    public final lt e() {
        return this.i;
    }

    public final j62 f() {
        return bl.P(this.j).D;
    }

    @Override // defpackage.ks
    public final void g(Object obj) throws IllegalAccessException, ly, InvocationTargetException {
        fv1 fv1Var = this.j;
        synchronized (fv1Var.y) {
            fv1Var.x.j(this);
        }
        this.f.g(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j, wa0 wa0Var, ls lsVar) throws Throwable {
        cv1 cv1Var;
        Throwable th;
        jr1 jr1Var;
        xi xiVar;
        if (lsVar instanceof cv1) {
            cv1Var = (cv1) lsVar;
            int i = cv1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cv1Var.k = i - Integer.MIN_VALUE;
            } else {
                cv1Var = new cv1(this, lsVar);
            }
        }
        Object objH = cv1Var.i;
        int i2 = cv1Var.k;
        if (i2 != 0) {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jr1Var = cv1Var.h;
            try {
                xc.G(objH);
                jr1Var.a(ui.f);
                return objH;
            } catch (Throwable th2) {
                th = th2;
                jr1Var.a(ui.f);
                throw th;
            }
        }
        xc.G(objH);
        if (j <= 0 && (xiVar = this.g) != null) {
            xiVar.g(new oe1(new g81(j)));
        }
        jr1 jr1VarA = nu0.A(this.j.z0(), null, null, new jl1(j, this, (ks) null), 3);
        try {
            cv1Var.h = jr1VarA;
            cv1Var.k = 1;
            objH = wa0Var.h(this, cv1Var);
            Object obj = wt.e;
            if (objH == obj) {
                return obj;
            }
            jr1Var = jr1VarA;
            jr1Var.a(ui.f);
            return objH;
        } catch (Throwable th3) {
            th = th3;
            jr1Var = jr1VarA;
            jr1Var.a(ui.f);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j, wa0 wa0Var, ls lsVar) {
        dv1 dv1Var;
        if (lsVar instanceof dv1) {
            dv1Var = (dv1) lsVar;
            int i = dv1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv1Var.j = i - Integer.MIN_VALUE;
            } else {
                dv1Var = new dv1(this, lsVar);
            }
        }
        Object obj = dv1Var.h;
        int i2 = dv1Var.j;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    xc.G(obj);
                    return obj;
                }
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(obj);
            dv1Var.j = 1;
            Object objH = h(j, wa0Var, dv1Var);
            Object obj2 = wt.e;
            return objH == obj2 ? obj2 : objH;
        } catch (g81 unused) {
            return null;
        }
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
        return f / this.e.b();
    }

    @Override // defpackage.hx
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.hx
    public final float y(float f) {
        return this.e.b() * f;
    }
}
