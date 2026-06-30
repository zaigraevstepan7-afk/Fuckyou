package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m62 extends View {
    public static final ey q = new ey(2);
    public final m10 e;
    public final fj f;
    public final ej g;
    public boolean h;
    public Outline i;
    public boolean j;
    public hx k;
    public al0 l;
    public sa0 m;
    public nc0 n;
    public float o;
    public float p;

    public m62(m10 m10Var, fj fjVar, ej ejVar) {
        super(m10Var.getContext());
        this.e = m10Var;
        this.f = fjVar;
        this.g = ejVar;
        setOutlineProvider(q);
        this.j = true;
        this.k = u4.j;
        this.l = al0.e;
        pc0.a.getClass();
        this.m = a4.H;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n3 n3Var;
        hx hxVarK;
        al0 al0VarO;
        cj cjVarI;
        long jQ;
        nc0 nc0Var;
        float f = this.o;
        ej ejVar = this.g;
        fj fjVar = this.f;
        if (f > 0.0f || this.p > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.o, this.p);
            n3Var = fjVar.a;
            Canvas canvas2 = n3Var.a;
            n3Var.a = canvas;
            hx hxVar = this.k;
            al0 al0Var = this.l;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            nc0 nc0Var2 = this.n;
            sa0 sa0Var = this.m;
            hxVarK = ejVar.E().k();
            al0VarO = ejVar.E().o();
            cjVarI = ejVar.E().i();
            jQ = ejVar.E().q();
            nc0Var = (nc0) ejVar.E().b;
            oc ocVarE = ejVar.E();
            ocVarE.z(hxVar);
            ocVarE.A(al0Var);
            ocVarE.y(n3Var);
            ocVarE.B(jFloatToRawIntBits);
            ocVarE.b = nc0Var2;
            n3Var.l();
            try {
                sa0Var.i(ejVar);
                n3Var.i();
                oc ocVarE2 = ejVar.E();
                ocVarE2.z(hxVarK);
                ocVarE2.A(al0VarO);
                ocVarE2.y(cjVarI);
                ocVarE2.B(jQ);
                ocVarE2.b = nc0Var;
                fjVar.a.a = canvas2;
                canvas.restoreToCount(iSave);
            } finally {
            }
        } else {
            n3Var = fjVar.a;
            Canvas canvas3 = n3Var.a;
            n3Var.a = canvas;
            hx hxVar2 = this.k;
            al0 al0Var2 = this.l;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            nc0 nc0Var3 = this.n;
            sa0 sa0Var2 = this.m;
            hxVarK = ejVar.E().k();
            al0VarO = ejVar.E().o();
            cjVarI = ejVar.E().i();
            jQ = ejVar.E().q();
            nc0Var = (nc0) ejVar.E().b;
            oc ocVarE3 = ejVar.E();
            ocVarE3.z(hxVar2);
            ocVarE3.A(al0Var2);
            ocVarE3.y(n3Var);
            ocVarE3.B(jFloatToRawIntBits2);
            ocVarE3.b = nc0Var3;
            n3Var.l();
            try {
                sa0Var2.i(ejVar);
                n3Var.i();
                oc ocVarE4 = ejVar.E();
                ocVarE4.z(hxVarK);
                ocVarE4.A(al0VarO);
                ocVarE4.y(cjVarI);
                ocVarE4.B(jQ);
                ocVarE4.b = nc0Var;
                fjVar.a.a = canvas3;
            } finally {
            }
        }
        this.h = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.j;
    }

    public final fj getCanvasHolder() {
        return this.f;
    }

    public final View getOwnerView() {
        return this.e;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.j;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.h) {
            return;
        }
        this.h = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
