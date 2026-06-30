package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wc0 implements pc0 {
    public static final vc0 H = new vc0();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final m10 b;
    public final fj c;
    public final m62 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public wl o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public wc0(m10 m10Var) {
        fj fjVar = new fj();
        ej ejVar = new ej();
        this.b = m10Var;
        this.c = fjVar;
        m62 m62Var = new m62(m10Var, fjVar, ejVar);
        this.d = m62Var;
        this.e = m10Var.getResources();
        this.f = new Rect();
        m10Var.addView(m62Var);
        m62Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = vl.b;
        this.y = j;
        this.z = j;
    }

    @Override // defpackage.pc0
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            this.d.setOutlineSpotShadowColor(lk.l0(j));
        }
    }

    @Override // defpackage.pc0
    public final void B(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.pc0
    public final Matrix C() {
        return this.d.getMatrix();
    }

    @Override // defpackage.pc0
    public final void D(int i, int i2, long j) {
        if (!vh0.a(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            P();
            return;
        }
        int i3 = this.h;
        m62 m62Var = this.d;
        if (i3 != i) {
            m62Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            m62Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.pc0
    public final float E() {
        return this.B;
    }

    @Override // defpackage.pc0
    public final void F(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.pc0
    public final float G() {
        return this.x;
    }

    @Override // defpackage.pc0
    public final float I() {
        return this.u;
    }

    @Override // defpackage.pc0
    public final void J(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.pc0
    public final float K() {
        return this.C;
    }

    @Override // defpackage.pc0
    public final int L() {
        return this.n;
    }

    @Override // defpackage.pc0
    public final void M(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        R();
    }

    @Override // defpackage.pc0
    public final long N() {
        return this.y;
    }

    public final void O(int i) {
        m62 m62Var = this.d;
        boolean z = true;
        if (i == 1) {
            m62Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                m62Var.setLayerType(0, paint);
                z = false;
            } else {
                m62Var.setLayerType(0, paint);
            }
        }
        m62Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void P() {
        boolean z = this.m;
        m62 m62Var = this.d;
        if (z || m62Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        m62Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void Q() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            O(i);
        } else {
            O(1);
        }
    }

    public final void R() {
        boolean z = this.r;
        m62 m62Var = this.d;
        if (z || w01.b(this.s, 9205357640488583168L)) {
            m62Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            m62Var.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            m62Var.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            m62Var.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    @Override // defpackage.pc0
    public final float a() {
        return this.q;
    }

    @Override // defpackage.pc0
    public final void b(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.pc0
    public final void c(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.pc0
    public final float d() {
        return this.t;
    }

    @Override // defpackage.pc0
    public final void e(wl wlVar) {
        this.o = wlVar;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(wlVar != null ? wlVar.a : null);
        Q();
    }

    @Override // defpackage.pc0
    public final void f(float f) {
        this.x = f;
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
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        P();
        if (z) {
            R();
        }
    }

    @Override // defpackage.pc0
    public final float h() {
        return this.w;
    }

    @Override // defpackage.pc0
    public final void i(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.pc0
    public final void j(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.pc0
    public final long k() {
        return this.z;
    }

    @Override // defpackage.pc0
    public final void l(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            this.d.setOutlineAmbientShadowColor(lk.l0(j));
        }
    }

    @Override // defpackage.pc0
    public final void m(Outline outline, long j) {
        m62 m62Var = this.d;
        m62Var.i = outline;
        m62Var.invalidateOutline();
        if ((this.m || m62Var.getClipToOutline()) && outline != null) {
            m62Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.pc0
    public final void n(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.pc0
    public final void o(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(nu0.L(i)));
        Q();
    }

    @Override // defpackage.pc0
    public final float p() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.pc0
    public final void q() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.pc0
    public final float r() {
        return this.v;
    }

    @Override // defpackage.pc0
    public final void s(cj cjVar) {
        Rect rect;
        boolean z = this.k;
        m62 m62Var = this.d;
        if (z) {
            if ((this.m || m62Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = m62Var.getWidth();
                rect.bottom = m62Var.getHeight();
            } else {
                rect = null;
            }
            m62Var.setClipBounds(rect);
        }
        Canvas canvas = o3.a;
        if (((n3) cjVar).a.isHardwareAccelerated()) {
            this.b.a(cjVar, m62Var, m62Var.getDrawingTime());
        }
    }

    @Override // defpackage.pc0
    public final void t(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.pc0
    public final int u() {
        return this.p;
    }

    @Override // defpackage.pc0
    public final float v() {
        return this.A;
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
    public final void w(hx hxVar, al0 al0Var, nc0 nc0Var, g3 g3Var) {
        m62 m62Var = this.d;
        ViewParent parent = m62Var.getParent();
        m10 m10Var = this.b;
        if (parent == null) {
            m10Var.addView(m62Var);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.D)) << 32) | (((long) Float.floatToRawIntBits(this.E)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        m62Var.k = hxVar;
        m62Var.l = al0Var;
        m62Var.m = g3Var;
        m62Var.n = nc0Var;
        m62Var.o = fIntBitsToFloat;
        m62Var.p = fIntBitsToFloat2;
        if (m62Var.isAttachedToWindow()) {
            m62Var.setVisibility(4);
            m62Var.setVisibility(0);
            try {
                fj fjVar = this.c;
                vc0 vc0Var = H;
                n3 n3Var = fjVar.a;
                Canvas canvas = n3Var.a;
                n3Var.a = vc0Var;
                m10Var.a(n3Var, m62Var, m62Var.getDrawingTime());
                fjVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.pc0
    public final wl x() {
        return this.o;
    }

    @Override // defpackage.pc0
    public final void y(int i) {
        this.p = i;
        Q();
    }

    @Override // defpackage.pc0
    public final void z(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }
}
