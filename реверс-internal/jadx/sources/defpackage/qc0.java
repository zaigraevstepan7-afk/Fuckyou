package defpackage;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qc0 implements v31 {
    public nc0 e;
    public final mc0 f;
    public final h4 g;
    public wa0 h;
    public ha0 i;
    public boolean k;
    public float[] m;
    public boolean n;
    public int r;
    public hk t;
    public boolean u;
    public boolean v;
    public boolean x;
    public long j = 9223372034707292159L;
    public final float[] l = ou0.a();
    public hx o = hk.a();
    public al0 p = al0.e;
    public final ej q = new ej();
    public long s = u12.b;
    public boolean w = true;
    public final g3 y = new g3(12, this);

    public qc0(nc0 nc0Var, mc0 mc0Var, h4 h4Var, wa0 wa0Var, ha0 ha0Var) {
        this.e = nc0Var;
        this.f = mc0Var;
        this.g = h4Var;
        this.h = wa0Var;
        this.i = ha0Var;
    }

    public final float[] a() {
        float[] fArrA = this.m;
        if (fArrA == null) {
            fArrA = ou0.a();
            this.m = fArrA;
        }
        if (this.v) {
            this.v = false;
            float[] fArrB = b();
            if (this.w) {
                return fArrB;
            }
            if (!el.E(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.u;
        float[] fArr = this.l;
        if (z) {
            nc0 nc0Var = this.e;
            long j = nc0Var.z;
            pc0 pc0Var = nc0Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = ef1.j(xk.P(this.j));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float fR = pc0Var.r();
            float fH = pc0Var.h();
            float fV = pc0Var.v();
            float fE = pc0Var.E();
            float fK = pc0Var.K();
            float fD = pc0Var.d();
            float fI = pc0Var.I();
            double d = ((double) fV) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fH * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fH * fSin);
            double d2 = ((double) fE) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fR * fCos2);
            float f10 = (f3 * fCos2) + ((-fR) * fSin2);
            double d3 = ((double) fK) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fD;
            float f16 = f14 * fD;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fD;
            float f18 = f12 * fI;
            float f19 = fCos * fCos3 * fI;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fI;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.u = false;
            this.w = bl.H(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.n || this.k) {
            return;
        }
        this.g.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zL = h4.l();
        h4 h4Var = this.g;
        if (zL) {
            h4Var.K(-4.0f);
        }
        nc0 nc0Var = this.e;
        if (!oh0.a(nc0Var.t, j)) {
            nc0Var.t = j;
            nc0Var.a.D((int) (j >> 32), (int) (j & 4294967295L), nc0Var.u);
        }
        ViewParent parent = h4Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(h4Var, h4Var);
        }
    }

    public final void e(long j) {
        if (vh0.a(j, this.j)) {
            return;
        }
        if (h4.l()) {
            this.g.K(-4.0f);
        }
        this.j = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.n) {
            this.n = z;
            h4 h4Var = this.g;
            sx0 sx0Var = h4Var.D;
            boolean z2 = h4Var.F;
            if (!z) {
                if (z2) {
                    return;
                }
                sx0Var.j(this);
                sx0 sx0Var2 = h4Var.E;
                if (sx0Var2 != null) {
                    sx0Var2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                sx0Var.a(this);
                return;
            }
            sx0 sx0Var3 = h4Var.E;
            if (sx0Var3 == null) {
                sx0Var3 = new sx0();
                h4Var.E = sx0Var3;
            }
            sx0Var3.a(this);
        }
    }

    public final void g() {
        h4.l();
        if (this.n) {
            if (!u12.a(this.s, u12.b) && !vh0.a(this.e.u, this.j)) {
                nc0 nc0Var = this.e;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.s >> 32)) * ((int) (this.j >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.s & 4294967295L)) * ((int) (this.j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!w01.b(nc0Var.z, jFloatToRawIntBits)) {
                    nc0Var.z = jFloatToRawIntBits;
                    nc0Var.a.M(jFloatToRawIntBits);
                }
            }
            this.e.e(this.o, this.p, this.j, this.y);
            f(false);
        }
    }
}
