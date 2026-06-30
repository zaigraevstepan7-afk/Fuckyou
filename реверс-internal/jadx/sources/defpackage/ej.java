package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ej implements p10 {
    public final dj e;
    public final oc f;
    public p6 g;
    public p6 h;

    public ej() {
        kx kxVar = u4.j;
        dj djVar = new dj();
        djVar.a = kxVar;
        djVar.b = al0.e;
        djVar.c = c40.a;
        djVar.d = 0L;
        this.e = djVar;
        oc ocVar = new oc();
        ocVar.c = this;
        ocVar.a = new qt0(10, ocVar);
        this.f = ocVar;
    }

    public static p6 a(ej ejVar, long j, q10 q10Var, int i) {
        p6 p6VarE = ejVar.e(q10Var);
        Paint paint = p6VarE.a;
        if (!vl.c(p6VarE.a(), j)) {
            p6VarE.f(j);
        }
        if (p6VarE.c != null) {
            p6VarE.c = null;
            paint.setShader(null);
        }
        if (!xi0.o(p6VarE.d, null)) {
            p6VarE.g(null);
        }
        if (p6VarE.b != i) {
            p6VarE.e(i);
        }
        if (paint.isFilterBitmap()) {
            return p6VarE;
        }
        paint.setFilterBitmap(true);
        return p6VarE;
    }

    @Override // defpackage.p10
    public final void A(w6 w6Var, lh lhVar, float f, q10 q10Var, wl wlVar, int i) {
        this.e.c.h(w6Var, c(lhVar, q10Var, f, wlVar, i, 1));
    }

    @Override // defpackage.p10
    public final oc E() {
        return this.f;
    }

    @Override // defpackage.p10
    public final void L(long j, long j2, long j3, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.e.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, i60.a, i));
    }

    @Override // defpackage.p10
    public final void Q(f6 f6Var, long j, long j2, long j3, float f, wl wlVar, int i) {
        this.e.c.d(f6Var, j, j2, j3, c(null, i60.a, f, wlVar, 3, i));
    }

    @Override // defpackage.p10
    public final void T(w6 w6Var, long j, q10 q10Var) {
        this.e.c.h(w6Var, a(this, j, q10Var, 3));
    }

    @Override // defpackage.p10
    public final void W(lh lhVar, long j, long j2, long j3, float f, q10 q10Var, wl wlVar, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.e.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c(lhVar, q10Var, f, wlVar, i, 1));
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e.a.b();
    }

    public final p6 c(lh lhVar, q10 q10Var, float f, wl wlVar, int i, int i2) {
        p6 p6VarE = e(q10Var);
        Paint paint = p6VarE.a;
        if (lhVar != null) {
            lhVar.a(f, d(), p6VarE);
        } else {
            if (p6VarE.c != null) {
                p6VarE.c = null;
                paint.setShader(null);
            }
            long jA = p6VarE.a();
            long j = vl.b;
            if (!vl.c(jA, j)) {
                p6VarE.f(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                p6VarE.d(f);
            }
        }
        if (!xi0.o(p6VarE.d, wlVar)) {
            p6VarE.g(wlVar);
        }
        if (p6VarE.b != i) {
            p6VarE.e(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return p6VarE;
        }
        paint.setFilterBitmap(true ^ (i2 == 0));
        return p6VarE;
    }

    public final p6 e(q10 q10Var) {
        if (xi0.o(q10Var, i60.a)) {
            p6 p6Var = this.g;
            if (p6Var != null) {
                return p6Var;
            }
            p6 p6VarL = wi0.l();
            p6VarL.k(0);
            this.g = p6VarL;
            return p6VarL;
        }
        if (!(q10Var instanceof kt1)) {
            ez1.a();
            return null;
        }
        p6 p6VarL2 = this.h;
        if (p6VarL2 == null) {
            p6VarL2 = wi0.l();
            p6VarL2.k(1);
            this.h = p6VarL2;
        }
        Paint paint = p6VarL2.a;
        float strokeWidth = paint.getStrokeWidth();
        kt1 kt1Var = (kt1) q10Var;
        float f = kt1Var.a;
        if (strokeWidth != f) {
            p6VarL2.j(f);
        }
        int iB = p6VarL2.b();
        int i = kt1Var.c;
        if (iB != i) {
            p6VarL2.h(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = kt1Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iC = p6VarL2.c();
        int i2 = kt1Var.d;
        if (iC == i2) {
            return p6VarL2;
        }
        p6VarL2.i(i2);
        return p6VarL2;
    }

    @Override // defpackage.p10
    public final al0 getLayoutDirection() {
        return this.e.b;
    }

    @Override // defpackage.hx
    public final float l() {
        return this.e.a.l();
    }

    @Override // defpackage.p10
    public final void p0(lh lhVar, long j, long j2, float f, q10 q10Var, wl wlVar, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.e.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), c(lhVar, q10Var, f, wlVar, i, 1));
    }

    @Override // defpackage.p10
    public final void q(float f, long j, long j2) {
        this.e.c.c(f, j2, a(this, j, i60.a, 3));
    }

    @Override // defpackage.p10
    public final void w0(long j, float f, float f2, long j2, long j3, q10 q10Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.e.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, q10Var, 3));
    }
}
