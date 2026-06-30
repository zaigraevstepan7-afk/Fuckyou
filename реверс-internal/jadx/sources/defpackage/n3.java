package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n3 implements cj {
    public Canvas a = o3.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.cj
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.cj
    public final void b(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.cj
    public final void c(float f, long j, p6 p6Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, p6Var.a);
    }

    @Override // defpackage.cj
    public final void d(f6 f6Var, long j, long j2, long j3, p6 p6Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapJ = c2.j(f6Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapJ, rect, rect2, p6Var.a);
    }

    @Override // defpackage.cj
    public final void e(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.cj
    public final void f(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.cj
    public final void g(f6 f6Var, long j, p6 p6Var) {
        this.a.drawBitmap(c2.j(f6Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), wi0.x(p6Var));
    }

    @Override // defpackage.cj
    public final void h(w6 w6Var, p6 p6Var) {
        Canvas canvas = this.a;
        if (!(w6Var instanceof w6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(w6Var.a, wi0.x(p6Var));
    }

    @Override // defpackage.cj
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.cj
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, p6 p6Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, p6Var.a);
    }

    @Override // defpackage.cj
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.cj
    public final void m(long j, long j2, p6 p6Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), p6Var.a);
    }

    @Override // defpackage.cj
    public final void n() {
        pv.m(this.a, false);
    }

    @Override // defpackage.cj
    public final void o(pc1 pc1Var, p6 p6Var) {
        this.a.saveLayer(pc1Var.a, pc1Var.b, pc1Var.c, pc1Var.d, p6Var.a, 31);
    }

    @Override // defpackage.cj
    public final void p(float f, float f2, float f3, float f4, p6 p6Var) {
        this.a.drawRect(f, f2, f3, f4, wi0.x(p6Var));
    }

    @Override // defpackage.cj
    public final void q(float[] fArr) {
        if (bl.H(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        u4.s(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.cj
    public final void r() {
        pv.m(this.a, true);
    }

    @Override // defpackage.cj
    public final void s(w6 w6Var) {
        Canvas canvas = this.a;
        if (!(w6Var instanceof w6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(w6Var.a, Region.Op.INTERSECT);
    }

    @Override // defpackage.cj
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, p6 p6Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, p6Var.a);
    }
}
