package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yo implements ScrollCaptureCallback {
    public final rl1 a;
    public final sh0 b;
    public final y41 c;
    public final h4 d;
    public final js e;
    public final vd0 f;

    public yo(rl1 rl1Var, sh0 sh0Var, js jsVar, y41 y41Var, h4 h4Var) {
        this.a = rl1Var;
        this.b = sh0Var;
        this.c = y41Var;
        this.d = h4Var;
        this.e = new js(jsVar.e.j(ky.f));
        this.f = new vd0(sh0Var.d - sh0Var.b, new af(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yo yoVar, ScrollCaptureSession scrollCaptureSession, sh0 sh0Var, ls lsVar) {
        xo xoVar;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionI;
        int i3;
        sh0 sh0Var2;
        int i4;
        int iA;
        int iA2;
        if (lsVar instanceof xo) {
            xoVar = (xo) lsVar;
            int i5 = xoVar.n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                xoVar.n = i5 - Integer.MIN_VALUE;
            } else {
                xoVar = new xo(yoVar, lsVar);
            }
        }
        Object obj = xoVar.l;
        int i6 = xoVar.n;
        wt wtVar = wt.e;
        if (i6 == 0) {
            xc.G(obj);
            i = sh0Var.b;
            i2 = sh0Var.d;
            vd0 vd0Var = yoVar.f;
            xoVar.h = scrollCaptureSession;
            xoVar.i = sh0Var;
            xoVar.j = i;
            xoVar.k = i2;
            xoVar.n = 1;
            if (i > i2) {
                vd0Var.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
            }
            int i7 = i2 - i;
            int i8 = vd0Var.a;
            if (i7 > i8) {
                yc.e(s91.j("Expected range (", i7, ") to be ≤ viewportSize=", i8));
                return null;
            }
            Object objB = vd0Var.b((((i7 / 2) + i) - (i8 / 2)) - vd0Var.b, xoVar);
            Object obj2 = t32.a;
            if (objB != wtVar) {
                objB = obj2;
            }
            if (objB == wtVar) {
                obj2 = objB;
            }
            if (obj2 != wtVar) {
            }
            return wtVar;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = xoVar.k;
            i4 = xoVar.j;
            sh0Var2 = xoVar.i;
            scrollCaptureSessionI = q4.i(xoVar.h);
            xc.G(obj);
            vd0 vd0Var2 = yoVar.f;
            iA = lk.A(i4 - nu0.I(vd0Var2.b), 0, vd0Var2.a);
            vd0 vd0Var3 = yoVar.f;
            iA2 = lk.A(i3 - nu0.I(vd0Var3.b), 0, vd0Var3.a);
            int i9 = sh0Var2.a;
            int i10 = sh0Var2.c;
            if (iA != iA2) {
                return sh0.e;
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSessionI.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i9, -iA);
                sh0 sh0Var3 = yoVar.b;
                canvasLockHardwareCanvas.translate(-sh0Var3.a, -sh0Var3.b);
                yoVar.d.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSessionI.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                int I = nu0.I(yoVar.f.b);
                return new sh0(i9, iA + I, i10, iA2 + I);
            } catch (Throwable th) {
                scrollCaptureSessionI.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        }
        int i11 = xoVar.k;
        int i12 = xoVar.j;
        sh0 sh0Var4 = xoVar.i;
        ScrollCaptureSession scrollCaptureSessionI2 = q4.i(xoVar.h);
        xc.G(obj);
        i = i12;
        sh0Var = sh0Var4;
        i2 = i11;
        scrollCaptureSession = scrollCaptureSessionI2;
        a4 a4Var = a4.u;
        xoVar.h = scrollCaptureSession;
        xoVar.i = sh0Var;
        xoVar.j = i;
        xoVar.k = i2;
        xoVar.n = 2;
        lt ltVar = xoVar.f;
        ltVar.getClass();
        if (al.z(ltVar).c(a4Var, xoVar) != wtVar) {
            scrollCaptureSessionI = scrollCaptureSession;
            i3 = i2;
            sh0Var2 = sh0Var;
            i4 = i;
            vd0 vd0Var22 = yoVar.f;
            iA = lk.A(i4 - nu0.I(vd0Var22.b), 0, vd0Var22.a);
            vd0 vd0Var32 = yoVar.f;
            iA2 = lk.A(i3 - nu0.I(vd0Var32.b), 0, vd0Var32.a);
            int i92 = sh0Var2.a;
            int i102 = sh0Var2.c;
            if (iA != iA2) {
            }
        }
        return wtVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        nu0.A(this.e, i01.f, null, new e(this, runnable, null, 8), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        jr1 jr1VarA = nu0.A(this.e, null, null, new m6(this, scrollCaptureSession, rect, consumer, null, 5), 3);
        jr1VarA.s(new g3(7, cancellationSignal));
        cancellationSignal.setOnCancelListener(new zo(0, jr1VarA));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(el.Q(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((v41) this.c.f).setValue(Boolean.TRUE);
        runnable.run();
    }
}
