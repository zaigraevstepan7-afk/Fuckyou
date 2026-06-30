package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uc0 implements pc0 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final fj b;
    public final ej c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public wl k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public uc0() {
        fj fjVar = new fj();
        ej ejVar = new ej();
        this.b = fjVar;
        this.c = ejVar;
        RenderNode renderNodeB = tc0.b();
        this.d = renderNodeB;
        this.e = 0L;
        renderNodeB.setClipToBounds(false);
        P(renderNodeB, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = vl.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.G = 0;
    }

    @Override // defpackage.pc0
    public final void A(long j) {
        this.s = j;
        this.d.setSpotShadowColor(lk.l0(j));
    }

    @Override // defpackage.pc0
    public final void B(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.pc0
    public final Matrix C() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.pc0
    public final void D(int i, int i2, long j) {
        this.E = i;
        this.F = i2;
        boolean zA = io1.a(this.e, xk.P(j));
        this.e = xk.P(j);
        S();
        if (zA || !w01.b(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // defpackage.pc0
    public final float E() {
        return this.u;
    }

    @Override // defpackage.pc0
    public final void F(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.pc0
    public final float G() {
        return this.q;
    }

    @Override // defpackage.pc0
    public final boolean H() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.pc0
    public final float I() {
        return this.n;
    }

    @Override // defpackage.pc0
    public final void J(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.pc0
    public final float K() {
        return this.v;
    }

    @Override // defpackage.pc0
    public final int L() {
        return this.j;
    }

    @Override // defpackage.pc0
    public final void M(long j) {
        this.l = j;
        R();
    }

    @Override // defpackage.pc0
    public final long N() {
        return this.r;
    }

    public final void O() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void P(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.G;
        if (i != 1 && this.j == 3 && this.k == null) {
            P(this.d, i);
        } else {
            P(this.d, 1);
        }
    }

    public final void R() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // defpackage.pc0
    public final float a() {
        return this.i;
    }

    @Override // defpackage.pc0
    public final void b(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.pc0
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.pc0
    public final float d() {
        return this.m;
    }

    @Override // defpackage.pc0
    public final void e(wl wlVar) {
        this.k = wlVar;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(wlVar != null ? wlVar.a : null);
        Q();
    }

    @Override // defpackage.pc0
    public final void f(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.pc0
    public final void g(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbN = s91.n("Outsets cannot be negative! Left: ", i, ", Top: ", i2, ", Right: ");
            sbN.append(i3);
            sbN.append(", Bottom: ");
            sbN.append(i4);
            mg0.a(sbN.toString());
        }
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.pc0
    public final float h() {
        return this.p;
    }

    @Override // defpackage.pc0
    public final void i(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.pc0
    public final void j(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.pc0
    public final long k() {
        return this.s;
    }

    @Override // defpackage.pc0
    public final void l(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(lk.l0(j));
    }

    @Override // defpackage.pc0
    public final void m(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    @Override // defpackage.pc0
    public final void n(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.pc0
    public final void o(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(nu0.K(i));
        Q();
    }

    @Override // defpackage.pc0
    public final float p() {
        return this.w;
    }

    @Override // defpackage.pc0
    public final void q() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.pc0
    public final float r() {
        return this.o;
    }

    @Override // defpackage.pc0
    public final void s(cj cjVar) {
        Canvas canvas = o3.a;
        ((n3) cjVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.pc0
    public final void t(boolean z) {
        this.x = z;
        O();
    }

    @Override // defpackage.pc0
    public final int u() {
        return this.G;
    }

    @Override // defpackage.pc0
    public final float v() {
        return this.t;
    }

    @Override // defpackage.pc0
    public final void w(hx hxVar, al0 al0Var, nc0 nc0Var, g3 g3Var) {
        ej ejVar = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            fj fjVar = this.b;
            n3 n3Var = fjVar.a;
            Canvas canvas = n3Var.a;
            n3Var.a = recordingCanvasBeginRecording;
            oc ocVar = ejVar.f;
            ocVar.z(hxVar);
            ocVar.A(al0Var);
            ocVar.b = nc0Var;
            ocVar.B(this.e);
            ocVar.y(n3Var);
            if (this.y > 0.0f || this.z > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                n3Var.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                g3Var.i(ejVar);
                n3Var.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                g3Var.i(ejVar);
            }
            fjVar.a.a = canvas;
            this.d.endRecording();
        } catch (Throwable th) {
            this.d.endRecording();
            throw th;
        }
    }

    @Override // defpackage.pc0
    public final wl x() {
        return this.k;
    }

    @Override // defpackage.pc0
    public final void y(int i) {
        this.G = i;
        Q();
    }

    @Override // defpackage.pc0
    public final void z(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }
}
