package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sc0 implements pc0 {
    public static final AtomicBoolean J = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final fj b;
    public final ej c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public wl l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public sc0(h4 h4Var, fj fjVar, ej ejVar) {
        this.b = fjVar;
        this.c = ejVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", h4Var);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (J.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                rd1.c(renderNodeCreate, rd1.a(renderNodeCreate));
                rd1.d(renderNodeCreate, rd1.b(renderNodeCreate));
            }
            qd1.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        P(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = vl.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // defpackage.pc0
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            rd1.d(this.d, lk.l0(j));
        }
    }

    @Override // defpackage.pc0
    public final void B(float f) {
        this.q = f;
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
        this.H = i;
        this.I = i2;
        boolean zA = vh0.a(this.e, j);
        this.e = j;
        S();
        if (zA) {
            return;
        }
        if (this.n || w01.b(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // defpackage.pc0
    public final float E() {
        return this.x;
    }

    @Override // defpackage.pc0
    public final void F(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.pc0
    public final float G() {
        return this.t;
    }

    @Override // defpackage.pc0
    public final boolean H() {
        return this.d.isValid();
    }

    @Override // defpackage.pc0
    public final float I() {
        return this.q;
    }

    @Override // defpackage.pc0
    public final void J(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.pc0
    public final float K() {
        return this.y;
    }

    @Override // defpackage.pc0
    public final int L() {
        return this.k;
    }

    @Override // defpackage.pc0
    public final void M(long j) {
        this.o = j;
        R();
    }

    @Override // defpackage.pc0
    public final long N() {
        return this.u;
    }

    public final void O() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void P(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            P(i);
        } else {
            P(1);
        }
    }

    public final void R() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // defpackage.pc0
    public final float a() {
        return this.m;
    }

    @Override // defpackage.pc0
    public final void b(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.pc0
    public final void c(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.pc0
    public final float d() {
        return this.p;
    }

    @Override // defpackage.pc0
    public final void e(wl wlVar) {
        this.l = wlVar;
        if (wlVar == null) {
            Q();
            return;
        }
        P(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(wlVar.a);
        renderNode.setLayerPaint(paint);
    }

    @Override // defpackage.pc0
    public final void f(float f) {
        this.t = f;
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.pc0
    public final float h() {
        return this.s;
    }

    @Override // defpackage.pc0
    public final void i(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.pc0
    public final void j(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.pc0
    public final long k() {
        return this.v;
    }

    @Override // defpackage.pc0
    public final void l(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            rd1.c(this.d, lk.l0(j));
        }
    }

    @Override // defpackage.pc0
    public final void m(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        O();
    }

    @Override // defpackage.pc0
    public final void n(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.pc0
    public final void o(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(nu0.L(i)));
        Q();
    }

    @Override // defpackage.pc0
    public final float p() {
        return this.z;
    }

    @Override // defpackage.pc0
    public final void q() {
        qd1.a(this.d);
    }

    @Override // defpackage.pc0
    public final float r() {
        return this.r;
    }

    @Override // defpackage.pc0
    public final void s(cj cjVar) {
        Canvas canvas = o3.a;
        DisplayListCanvas displayListCanvas = ((n3) cjVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.pc0
    public final void t(boolean z) {
        this.A = z;
        O();
    }

    @Override // defpackage.pc0
    public final int u() {
        return this.j;
    }

    @Override // defpackage.pc0
    public final float v() {
        return this.w;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pc0
    public final void w(hx hxVar, al0 al0Var, nc0 nc0Var, g3 g3Var) throws Throwable {
        DisplayListCanvas displayListCanvas;
        n3 n3Var;
        Canvas canvas;
        DisplayListCanvas displayListCanvas2;
        hx hxVarK;
        al0 al0VarO;
        cj cjVarI;
        Canvas canvas2;
        long jQ;
        nc0 nc0Var2;
        long j;
        int i;
        int i2;
        ej ejVar = this.c;
        oc ocVar = ejVar.f;
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            n3Var = this.b.a;
            canvas = n3Var.a;
            n3Var.a = (Canvas) displayListCanvasStart;
        } catch (Throwable th) {
            th = th;
            displayListCanvas = displayListCanvasStart;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            displayListCanvas = displayListCanvas2;
            this.d.end(displayListCanvas);
            throw th;
        }
        try {
            if (this.B <= 0.0f) {
                try {
                    if (this.C <= 0.0f) {
                        long jP = xk.P(this.e);
                        hxVarK = ocVar.k();
                        al0VarO = ocVar.o();
                        cjVarI = ocVar.i();
                        canvas2 = canvas;
                        jQ = ocVar.q();
                        displayListCanvas2 = displayListCanvasStart;
                        nc0Var2 = (nc0) ocVar.b;
                        ocVar.z(hxVar);
                        ocVar.A(al0Var);
                        ocVar.y(n3Var);
                        ocVar.B(jP);
                        ocVar.b = nc0Var;
                        n3Var.l();
                        try {
                            g3Var.i(ejVar);
                            n3Var.a = canvas2;
                            this.d.end(displayListCanvas2);
                            return;
                        } finally {
                            n3Var.i();
                            ocVar.z(hxVarK);
                            ocVar.A(al0VarO);
                            ocVar.y(cjVarI);
                            ocVar.B(jQ);
                            ocVar.b = nc0Var2;
                        }
                    }
                    displayListCanvas2 = displayListCanvasStart;
                    j = 4294967295L;
                    canvas2 = canvas;
                } catch (Throwable th3) {
                    th = th3;
                    displayListCanvas2 = displayListCanvasStart;
                    displayListCanvas = displayListCanvas2;
                }
                this.d.end(displayListCanvas);
                throw th;
            }
            displayListCanvas2 = displayListCanvasStart;
            canvas2 = canvas;
            j = 4294967295L;
            g3Var.i(ejVar);
            n3Var.i();
            ocVar.z(hxVarK);
            ocVar.A(al0VarO);
            ocVar.y(cjVarI);
            ocVar.B(jQ);
            ocVar.b = nc0Var2;
            n3Var.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            n3Var.a = canvas2;
            this.d.end(displayListCanvas2);
            return;
        } catch (Throwable th4) {
            displayListCanvas = displayListCanvas2;
            try {
                throw th4;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        i = (int) (jFloatToRawIntBits >> 32);
        i2 = (int) (jFloatToRawIntBits & j);
        n3Var.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        long jP2 = xk.P(this.e);
        hxVarK = ocVar.k();
        al0VarO = ocVar.o();
        cjVarI = ocVar.i();
        jQ = ocVar.q();
        nc0Var2 = (nc0) ocVar.b;
        ocVar.z(hxVar);
        ocVar.A(al0Var);
        ocVar.y(n3Var);
        ocVar.B(jP2);
        ocVar.b = nc0Var;
        n3Var.l();
    }

    @Override // defpackage.pc0
    public final wl x() {
        return this.l;
    }

    @Override // defpackage.pc0
    public final void y(int i) {
        this.j = i;
        Q();
    }

    @Override // defpackage.pc0
    public final void z(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }
}
