package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 {
    public vj1 a;
    public v5 b;
    public aw c;
    public k31 d;
    public boolean e;
    public vu f;
    public final uj1 g;
    public final rj1 h;
    public boolean i;
    public int j = 1;
    public fj1 k = oj1.b;
    public final zj1 l = new zj1(this);
    public final n m = new n(24, this);

    public bk1(vj1 vj1Var, v5 v5Var, aw awVar, k31 k31Var, boolean z, vu vuVar, uj1 uj1Var, rj1 rj1Var) {
        this.a = vj1Var;
        this.b = v5Var;
        this.c = awVar;
        this.d = k31Var;
        this.e = z;
        this.f = vuVar;
        this.g = uj1Var;
        this.h = rj1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ls lsVar) throws Throwable {
        xj1 xj1Var;
        bk1 bk1Var;
        Throwable th;
        yc1 yc1Var;
        if (lsVar instanceof xj1) {
            xj1Var = (xj1) lsVar;
            int i = xj1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xj1Var.k = i - Integer.MIN_VALUE;
            } else {
                xj1Var = new xj1(this, lsVar);
            }
        }
        Object obj = xj1Var.i;
        int i2 = xj1Var.k;
        if (i2 != 0) {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yc1Var = xj1Var.h;
            try {
                xc.G(obj);
                bk1Var = this;
                bk1Var.i = false;
                return new o52(yc1Var.e);
            } catch (Throwable th2) {
                th = th2;
                bk1Var = this;
                bk1Var.i = false;
                throw th;
            }
        }
        xc.G(obj);
        yc1 yc1Var2 = new yc1();
        yc1Var2.e = j;
        this.i = true;
        try {
            ly0 ly0Var = ly0.e;
            bk1Var = this;
            try {
                r71 r71Var = new r71(bk1Var, yc1Var2, j, (ks) null);
                xj1Var.h = yc1Var2;
                xj1Var.k = 1;
                Object objG = bk1Var.g(ly0Var, r71Var, xj1Var);
                wt wtVar = wt.e;
                if (objG == wtVar) {
                    return wtVar;
                }
                yc1Var = yc1Var2;
                bk1Var.i = false;
                return new o52(yc1Var.e);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                bk1Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bk1Var = this;
        }
    }

    public final boolean b() {
        v5 v5Var;
        return this.a.c() || this.a.a() || ((v5Var = this.b) != null && v5Var.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, boolean z, zu1 zu1Var) {
        t32 t32Var = t32.a;
        if (z) {
            aw awVar = this.c;
            fi1 fi1Var = oj1.a;
            if (!(awVar instanceof aw)) {
                long jA = o52.a(j, 0.0f, 0.0f, this.d == k31.f ? 1 : 2);
                ak1 ak1Var = new ak1(this, null);
                v5 v5Var = this.b;
                wt wtVar = wt.e;
                if (v5Var == null || !b()) {
                    ak1 ak1Var2 = new ak1(this, zu1Var);
                    ak1Var2.k = jA;
                    Object objQ = ak1Var2.q(t32Var);
                    if (objQ == wtVar) {
                        return objQ;
                    }
                } else {
                    Object objB = v5Var.b(jA, ak1Var, zu1Var);
                    if (objB == wtVar) {
                        return objB;
                    }
                }
            }
        }
        return t32Var;
    }

    public final long d(fj1 fj1Var, long j, int i) {
        mz0 mz0Var = (mz0) this.f.e;
        mz0 mz0VarM0 = mz0Var != null ? mz0Var.M0() : null;
        long jQ0 = mz0VarM0 != null ? mz0VarM0.Q0(i, j) : 0L;
        long jD = w01.d(j, jQ0);
        long jF = f(i(fj1Var.a(h(f(this.d == k31.f ? w01.a(jD, 0.0f, 1) : w01.a(jD, 0.0f, 2))))));
        uj1 uj1Var = this.g;
        if (uj1Var.r) {
            ViewTreeObserver viewTreeObserver = ((h4) bl.Q(uj1Var)).getViewTreeObserver();
            try {
                if (h4.P0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    h4.P0 = declaredMethod;
                }
                Method method = h4.P0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jD2 = w01.d(jD, jF);
        mz0 mz0Var2 = (mz0) this.f.e;
        mz0 mz0VarM02 = mz0Var2 != null ? mz0Var2.M0() : null;
        return w01.e(w01.e(jQ0, jF), mz0VarM02 != null ? mz0VarM02.O0(jF, jD2, i) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? w01.f(-1.0f, j) : j;
    }

    public final Object g(ly0 ly0Var, wa0 wa0Var, ls lsVar) {
        Object objD = this.a.d(ly0Var, new g(this, wa0Var, (ks) null, 14), lsVar);
        return objD == wt.e ? objD : t32.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == k31.f ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == k31.f) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        k31 k31Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (k31Var == k31.e) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (k31Var == k31.f) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
