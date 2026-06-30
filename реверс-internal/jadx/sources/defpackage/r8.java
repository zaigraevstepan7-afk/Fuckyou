package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r8 extends TextPaint {
    public p6 a;
    public ax1 b;
    public int c;
    public um1 d;
    public vl e;
    public lh f;
    public qx g;
    public io1 h;
    public q10 i;

    public final p6 a() {
        p6 p6Var = this.a;
        if (p6Var != null) {
            return p6Var;
        }
        p6 p6Var2 = new p6(this);
        this.a = p6Var2;
        return p6Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().e(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final lh lhVar, final long j, float f) {
        if (lhVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (lhVar instanceof uq1) {
            d(uc1.w(f, ((uq1) lhVar).a));
            return;
        }
        if (!(lhVar instanceof mh)) {
            ez1.a();
            return;
        }
        if (xi0.o(this.f, lhVar)) {
            io1 io1Var = this.h;
            if (!(io1Var == null ? false : io1.a(io1Var.a, j))) {
            }
        } else if (j != 9205357640488583168L) {
            this.f = lhVar;
            this.h = new io1(j);
            this.g = xc.s(new ha0() { // from class: q8
                @Override // defpackage.ha0
                public final Object a() {
                    return ((mh) lhVar).c(j);
                }
            });
        }
        p6 p6VarA = a();
        qx qxVar = this.g;
        Shader shader = qxVar != null ? (Shader) qxVar.getValue() : null;
        p6VarA.c = shader;
        p6VarA.a.setShader(shader);
        this.e = null;
        s22.K(this, f);
    }

    public final void d(long j) {
        vl vlVar = this.e;
        if ((vlVar == null ? false : vl.c(vlVar.a, j)) || j == 16) {
            return;
        }
        this.e = new vl(j);
        setColor(lk.l0(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(q10 q10Var) {
        if (q10Var == null || xi0.o(this.i, q10Var)) {
            return;
        }
        this.i = q10Var;
        if (q10Var.equals(i60.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(q10Var instanceof kt1)) {
            ez1.a();
            return;
        }
        a().k(1);
        kt1 kt1Var = (kt1) q10Var;
        a().j(kt1Var.a);
        p6 p6VarA = a();
        p6VarA.a.setStrokeMiter(kt1Var.b);
        a().i(kt1Var.d);
        a().h(kt1Var.c);
        a().a.setPathEffect(null);
    }

    public final void f(um1 um1Var) {
        if (um1Var == null || xi0.o(this.d, um1Var)) {
            return;
        }
        this.d = um1Var;
        if (um1Var.equals(um1.d)) {
            clearShadowLayer();
            return;
        }
        um1 um1Var2 = this.d;
        float f = um1Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (um1Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), lk.l0(this.d.a));
    }

    public final void g(ax1 ax1Var) {
        if (ax1Var == null || xi0.o(this.b, ax1Var)) {
            return;
        }
        this.b = ax1Var;
        int i = ax1Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
