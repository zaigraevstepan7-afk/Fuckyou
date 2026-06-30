package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 extends l01 {
    public final qt0 f;
    public final rh g;
    public jr1 h;

    public qw0(bk1 bk1Var, qt0 qt0Var, io ioVar, hx hxVar) {
        super(bk1Var, ioVar, hxVar);
        this.f = qt0Var;
        this.g = nu0.d(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(qw0 qw0Var, bk1 bk1Var, mw0 mw0Var, float f, float f2, ls lsVar) {
        nw0 nw0Var;
        t32 t32Var;
        zc1 zc1Var;
        Object obj;
        wc1 wc1Var;
        float f3;
        bk1 bk1Var2;
        qw0Var.getClass();
        xg0 xg0Var = qw0Var.e;
        if (lsVar instanceof nw0) {
            nw0Var = (nw0) lsVar;
            int i = nw0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nw0Var.m = i - Integer.MIN_VALUE;
            } else {
                nw0Var = new nw0(qw0Var, lsVar);
            }
        }
        nw0 nw0Var2 = nw0Var;
        Object obj2 = nw0Var2.k;
        int i2 = nw0Var2.m;
        t32 t32Var2 = t32.a;
        Object obj3 = wt.e;
        if (i2 == 0) {
            xc.G(obj2);
            zc1 zc1Var2 = new zc1();
            zc1Var2.e = mw0Var;
            t32Var = t32Var2;
            long j = mw0Var.b;
            long j2 = mw0Var.a;
            ((q52) xg0Var.f).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((q52) xg0Var.g).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            mw0 mw0VarG = g(qw0Var.g);
            if (mw0VarG != null) {
                long j3 = mw0VarG.b;
                long j4 = mw0VarG.a;
                ((q52) xg0Var.f).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((q52) xg0Var.g).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                zc1Var = zc1Var2;
                zc1Var.e = ((mw0) zc1Var.e).a(mw0VarG);
            } else {
                zc1Var = zc1Var2;
            }
            wc1 wc1Var2 = new wc1();
            float fH = bk1Var.h(bk1Var.f(((mw0) zc1Var.e).a));
            wc1Var2.e = fH;
            if (!el.j(fH)) {
                zc1 zc1Var3 = new zc1();
                zc1Var3.e = wi0.a(30, 0.0f);
                obj = obj3;
                wa0 ow0Var = new ow0(wc1Var2, zc1Var3, zc1Var, f, qw0Var, f2, bk1Var, null);
                nw0Var2.h = bk1Var;
                nw0Var2.i = wc1Var2;
                nw0Var2.j = f2;
                nw0Var2.m = 1;
                if (qw0Var.b(ow0Var, nw0Var2) != obj) {
                    wc1Var = wc1Var2;
                    f3 = f2;
                    bk1Var2 = bk1Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                xc.G(obj2);
                return t32Var2;
            }
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = nw0Var2.j;
        wc1Var = nw0Var2.i;
        bk1Var2 = nw0Var2.h;
        xc.G(obj2);
        obj = obj3;
        t32Var = t32Var2;
        long jC = kd1.c(((q52) xg0Var.f).c(Float.MAX_VALUE), ((q52) xg0Var.g).c(Float.MAX_VALUE));
        if (jC == 0) {
            float fE = bk1Var2.e(Math.signum(wc1Var.e)) * Math.min(Math.abs(wc1Var.e) / 100.0f, f3) * 1000.0f;
            if (fE == 0.0f) {
                jC = 0;
            } else {
                jC = bk1Var2.d == k31.f ? kd1.c(fE, 0.0f) : kd1.c(0.0f, fE);
            }
        }
        wa0 wa0Var = qw0Var.b;
        o52 o52Var = new o52(jC);
        nw0Var2.h = null;
        nw0Var2.i = null;
        nw0Var2.m = 2;
        return wa0Var.h(o52Var, nw0Var2) == obj ? obj : t32Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(qw0 qw0Var, zc1 zc1Var, wc1 wc1Var, bk1 bk1Var, zc1 zc1Var2, long j, ls lsVar) {
        pw0 pw0Var;
        wc1 wc1Var2;
        bk1 bk1Var2;
        zc1 zc1Var3;
        boolean z;
        if (lsVar instanceof pw0) {
            pw0Var = (pw0) lsVar;
            int i = pw0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                pw0Var.n = i - Integer.MIN_VALUE;
            } else {
                pw0Var = new pw0(lsVar);
            }
        }
        Object objF = pw0Var.m;
        int i2 = pw0Var.n;
        ks ksVar = null;
        if (i2 == 0) {
            xc.G(objF);
            if (j < 0) {
                return Boolean.FALSE;
            }
            tv tvVar = new tv(qw0Var, ksVar, 9);
            pw0Var.h = qw0Var;
            pw0Var.i = zc1Var;
            pw0Var.j = wc1Var;
            pw0Var.k = bk1Var;
            pw0Var.l = zc1Var2;
            pw0Var.n = 1;
            objF = af1.F(j, tvVar, pw0Var);
            wt wtVar = wt.e;
            if (objF == wtVar) {
                return wtVar;
            }
            wc1Var2 = wc1Var;
            bk1Var2 = bk1Var;
            zc1Var3 = zc1Var2;
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zc1 zc1Var4 = pw0Var.l;
            bk1 bk1Var3 = pw0Var.k;
            wc1Var2 = pw0Var.j;
            zc1 zc1Var5 = pw0Var.i;
            qw0 qw0Var2 = pw0Var.h;
            xc.G(objF);
            zc1Var3 = zc1Var4;
            bk1Var2 = bk1Var3;
            zc1Var = zc1Var5;
            qw0Var = qw0Var2;
        }
        mw0 mw0Var = (mw0) objF;
        if (mw0Var != null) {
            boolean z2 = ((mw0) zc1Var.e).c;
            long j2 = mw0Var.a;
            zc1Var.e = new mw0(j2, mw0Var.b, z2);
            wc1Var2.e = bk1Var2.j(bk1Var2.f(j2));
            zc1Var3.e = wi0.a(30, 0.0f);
            xg0 xg0Var = qw0Var.e;
            long j3 = mw0Var.b;
            long j4 = mw0Var.a;
            ((q52) xg0Var.f).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((q52) xg0Var.g).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !el.j(wc1Var2.e);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mw0 g(rh rhVar) {
        mw0 mw0Var = null;
        lm1 lm1VarX = af1.x(new ea0(new lw0(rhVar, 0), 0 == true ? 1 : 0, 2));
        while (lm1VarX.hasNext()) {
            mw0 mw0VarA = (mw0) lm1VarX.next();
            if (mw0Var != null) {
                mw0VarA = mw0Var.a(mw0VarA);
            }
            mw0Var = mw0VarA;
        }
        return mw0Var;
    }

    public final float e(zj1 zj1Var, float f) {
        bk1 bk1Var = this.a;
        long jI = bk1Var.i(bk1Var.e(f));
        bk1 bk1Var2 = zj1Var.a;
        return bk1Var.h(bk1Var.f(bk1Var2.d(bk1Var2.k, jI, 1)));
    }

    public final boolean f(e81 e81Var) {
        long j;
        hx hxVar = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.f;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : hxVar.y(64.0f));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : hxVar.y(64.0f));
        List list = e81Var.a;
        w01 w01Var = new w01(0L);
        int size = list.size();
        boolean zC = false;
        int i2 = 0;
        while (true) {
            j = w01Var.a;
            if (i2 >= size) {
                break;
            }
            w01Var = new w01(w01.e(j, ((l81) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        bk1 bk1Var = this.a;
        float fJ = bk1Var.j(bk1Var.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            vj1 vj1Var = bk1Var.a;
            zC = fJ > 0.0f ? vj1Var.c() : vj1Var.a();
        }
        if (zC) {
            return !(this.g.t(new mw0(jFloatToRawIntBits, ((l81) pl.c0(e81Var.a)).b, false)) instanceof xj);
        }
        return this.d;
    }
}
