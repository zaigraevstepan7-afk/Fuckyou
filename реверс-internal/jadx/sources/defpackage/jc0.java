package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jc0 extends yw implements o10 {
    public final /* synthetic */ int u = 1;
    public final v5 v;
    public final n20 w;
    public Object x;

    public jc0(fv1 fv1Var, v5 v5Var, n20 n20Var, c41 c41Var) {
        this.v = v5Var;
        this.w = n20Var;
        this.x = c41Var;
        L0(fv1Var);
    }

    public static boolean O0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean P0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        boolean zP0;
        long j;
        char c;
        boolean z;
        boolean zO0;
        float f;
        float f2;
        int i = this.u;
        v5 v5Var = this.v;
        n20 n20Var = this.w;
        switch (i) {
            case 0:
                c41 c41Var = (c41) this.x;
                ej ejVar = sl0Var.e;
                v5Var.j(ejVar.d());
                if (io1.c(ejVar.d())) {
                    sl0Var.a();
                    return;
                }
                sl0Var.a();
                v5Var.d.getValue();
                Canvas canvasA = o3.a(ejVar.f.i());
                if (n20.f(n20Var.f)) {
                    zP0 = P0(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ejVar.d() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(sl0Var.y(c41Var.a(sl0Var.getLayoutDirection())))) & 4294967295L), n20Var.c(), canvasA);
                } else {
                    zP0 = false;
                }
                if (n20.f(n20Var.d)) {
                    EdgeEffect edgeEffectE = n20Var.e();
                    zP0 = P0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sl0Var.y(c41Var.d()))) & 4294967295L), edgeEffectE, canvasA) || zP0;
                }
                if (n20.f(n20Var.g)) {
                    EdgeEffect edgeEffectD = n20Var.d();
                    zP0 = P0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sl0Var.y(c41Var.b(sl0Var.getLayoutDirection())) + (-((float) nu0.I(Float.intBitsToFloat((int) (ejVar.d() >> 32))))))) & 4294967295L), edgeEffectD, canvasA) || zP0;
                }
                if (n20.f(n20Var.e)) {
                    EdgeEffect edgeEffectB = n20Var.b();
                    float fY = sl0Var.y(c41Var.c());
                    zP0 = P0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ejVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (ejVar.d() & 4294967295L))) + fY)) & 4294967295L), edgeEffectB, canvasA) || zP0;
                }
                if (zP0) {
                    v5Var.d();
                    return;
                }
                return;
            default:
                ej ejVar2 = sl0Var.e;
                v5Var.j(ejVar2.d());
                Canvas canvasA2 = o3.a(ejVar2.f.i());
                v5Var.d.getValue();
                if (io1.c(ejVar2.d())) {
                    sl0Var.a();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = n20Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = n20Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = n20Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = n20Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = n20Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = n20Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = n20Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = n20Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    sl0Var.a();
                    return;
                }
                float fY2 = sl0Var.y(30.0f);
                boolean z2 = n20.f(n20Var.d) || n20.g(n20Var.h) || n20.f(n20Var.e) || n20.g(n20Var.i);
                boolean z3 = n20.f(n20Var.f) || n20.g(n20Var.j) || n20.f(n20Var.g) || n20.g(n20Var.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    Q0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        Q0().setPosition(0, 0, (nu0.I(fY2) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                    } else {
                        if (!z3) {
                            sl0Var.a();
                            return;
                        }
                        Q0().setPosition(0, 0, canvasA2.getWidth(), (nu0.I(fY2) * 2) + canvasA2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = Q0().beginRecording();
                boolean zG = n20.g(n20Var.j);
                k31 k31Var = k31.f;
                if (zG) {
                    EdgeEffect edgeEffectA = n20Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = n20Var.a(k31Var);
                        n20Var.j = edgeEffectA;
                    }
                    O0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (n20.f(n20Var.f)) {
                    EdgeEffect edgeEffectC = n20Var.c();
                    zO0 = O0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (n20.g(n20Var.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (v5Var.c() & j));
                        EdgeEffect edgeEffectA2 = n20Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = n20Var.a(k31Var);
                            n20Var.j = edgeEffectA2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fC = i2 >= 31 ? pb.c(edgeEffectC) : 0.0f;
                        float f3 = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            pb.d(edgeEffectA2, fC, f3);
                        } else {
                            edgeEffectA2.onPull(fC, f3);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zO0 = false;
                }
                boolean zG2 = n20.g(n20Var.h);
                k31 k31Var2 = k31.e;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = n20Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = n20Var.a(k31Var2);
                        n20Var.h = edgeEffectA3;
                    }
                    O0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (n20.f(n20Var.d)) {
                    EdgeEffect edgeEffectE2 = n20Var.e();
                    zO0 = O0(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zO0;
                    if (n20.g(n20Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (v5Var.c() >> c));
                        EdgeEffect edgeEffectA4 = n20Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = n20Var.a(k31Var2);
                            n20Var.h = edgeEffectA4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fC2 = i3 >= 31 ? pb.c(edgeEffectE2) : 0.0f;
                        if (i3 >= 31) {
                            pb.d(edgeEffectA4, fC2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fC2, fIntBitsToFloat2);
                        }
                    }
                }
                if (n20.g(n20Var.k)) {
                    EdgeEffect edgeEffectA5 = n20Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = n20Var.a(k31Var);
                        n20Var.k = edgeEffectA5;
                    }
                    O0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (n20.f(n20Var.g)) {
                    EdgeEffect edgeEffectD2 = n20Var.d();
                    zO0 = O0(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zO0;
                    if (n20.g(n20Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (v5Var.c() & j));
                        EdgeEffect edgeEffectA6 = n20Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = n20Var.a(k31Var);
                            n20Var.k = edgeEffectA6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fC3 = i4 >= 31 ? pb.c(edgeEffectD2) : 0.0f;
                        if (i4 >= 31) {
                            pb.d(edgeEffectA6, fC3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fC3, fIntBitsToFloat3);
                        }
                    }
                }
                if (n20.g(n20Var.i)) {
                    EdgeEffect edgeEffectA7 = n20Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = n20Var.a(k31Var2);
                        n20Var.i = edgeEffectA7;
                    }
                    O0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (n20.f(n20Var.e)) {
                    EdgeEffect edgeEffectB2 = n20Var.b();
                    boolean z4 = O0(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zO0;
                    if (n20.g(n20Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (v5Var.c() >> c));
                        EdgeEffect edgeEffectA8 = n20Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = n20Var.a(k31Var2);
                            n20Var.i = edgeEffectA8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fC4 = i5 >= 31 ? pb.c(edgeEffectB2) : 0.0f;
                        float f4 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            pb.d(edgeEffectA8, fC4, f4);
                        } else {
                            edgeEffectA8.onPull(fC4, f4);
                        }
                    }
                    zO0 = z4;
                }
                if (zO0) {
                    v5Var.d();
                }
                float f5 = z ? 0.0f : fY2;
                float f6 = z2 ? 0.0f : fY2;
                al0 layoutDirection = sl0Var.getLayoutDirection();
                n3 n3Var = new n3();
                n3Var.a = recordingCanvasBeginRecording;
                long jD = ejVar2.d();
                hx hxVarK = ejVar2.f.k();
                al0 al0VarO = ejVar2.f.o();
                cj cjVarI = ejVar2.f.i();
                long jQ = ejVar2.f.q();
                oc ocVar = ejVar2.f;
                nc0 nc0Var = (nc0) ocVar.b;
                ocVar.z(sl0Var);
                ocVar.A(layoutDirection);
                ocVar.y(n3Var);
                ocVar.B(jD);
                ocVar.b = null;
                n3Var.l();
                try {
                    ((qt0) ejVar2.f.a).A(f5, f6);
                    try {
                        sl0Var.a();
                        n3Var.i();
                        oc ocVar2 = ejVar2.f;
                        ocVar2.z(hxVarK);
                        ocVar2.A(al0VarO);
                        ocVar2.y(cjVarI);
                        ocVar2.B(jQ);
                        ocVar2.b = nc0Var;
                        Q0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f, f2);
                        canvasA2.drawRenderNode(Q0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((qt0) ejVar2.f.a).A(-f5, -f6);
                    }
                } catch (Throwable th) {
                    n3Var.i();
                    oc ocVar3 = ejVar2.f;
                    ocVar3.z(hxVarK);
                    ocVar3.A(al0VarO);
                    ocVar3.y(cjVarI);
                    ocVar3.B(jQ);
                    ocVar3.b = nc0Var;
                    throw th;
                }
        }
    }

    public RenderNode Q0() {
        RenderNode renderNode = (RenderNode) this.x;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeF = dh0.f();
        this.x = renderNodeF;
        return renderNodeF;
    }

    public jc0(fv1 fv1Var, v5 v5Var, n20 n20Var) {
        this.v = v5Var;
        this.w = n20Var;
        L0(fv1Var);
    }
}
