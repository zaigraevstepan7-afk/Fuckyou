package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import com.reddit.secondpage.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h4 extends ViewGroup implements w31, fg1, iw, m31, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, i80 {
    public static Class K0;
    public static Method L0;
    public static Method M0;
    public static t3 O0;
    public static Method P0;
    public static Method Q0;
    public final a5 A;
    public final eg0 A0;
    public final e6 B;
    public final x3 B0;
    public final ge C;
    public final x3 C0;
    public final sx0 D;
    public boolean D0;
    public sx0 E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public final dw0 G;
    public final y41 G0;
    public final gk H;
    public View H0;
    public final v41 I;
    public final c4 I0;
    public final qx J;
    public final k3 K;
    public final l3 L;
    public boolean M;
    public final y31 N;
    public boolean O;
    public kr P;
    public boolean Q;
    public final ru0 R;
    public long S;
    public final int[] T;
    public final float[] U;
    public final Matrix V;
    public final float[] W;
    public final float[] a0;
    public long b0;
    public boolean c0;
    public long d0;
    public ip e;
    public sa0 e0;
    public long f;
    public jz1 f0;
    public final boolean g;
    public gz1 g0;
    public tf0 h;
    public final AtomicReference h0;
    public ap0 i;
    public zw i0;
    public bp0 j;
    public final fy0 j0;
    public se1 k;
    public final v41 k0;
    public final fd l;
    public bh0 l0;
    public final q3 m;
    public final uv0 m0;
    public final v41 n;
    public s8 n0;
    public final View o;
    public MotionEvent o0;
    public final m80 p;
    public long p0;
    public lt q;
    public final n81 q0;
    public final r5 r;
    public final sx0 r0;
    public final v41 s;
    public float s0;
    public final qx t;
    public float t0;
    public final z82 u;
    public float u0;
    public final ql0 v;
    public float v0;
    public final hx0 w;
    public final e4 w0;
    public final sc1 x;
    public final q3 x0;
    public final ul1 y;
    public boolean y0;
    public final m4 z;
    public wa0 z0;
    public static final l91 J0 = new l91(17);
    public static final sx0 N0 = new sx0();

    public h4(Context context, ip ipVar) {
        super(context);
        this.e = ipVar;
        this.f = 9205357640488583168L;
        int i = 1;
        this.g = true;
        this.k = v20.L;
        this.l = new fd();
        int i2 = 0;
        this.m = new q3(this, i2);
        this.n = new v41(xi0.d(context), l91.f);
        this.p = new m80(this, this);
        ipVar.f();
        op opVar = ipVar.c;
        opVar.getClass();
        this.q = opVar.j();
        this.r = new r5();
        this.s = xc.B(Boolean.FALSE);
        this.t = xc.s(new x3(this, i2));
        this.u = new z82();
        ql0 ql0Var = new ql0(3);
        ql0Var.g0(gg1.c);
        ql0Var.d0(getDensity());
        ql0Var.i0(getViewConfiguration());
        ql0Var.h0(new f4(this).c(((m80) getFocusOwner()).e).c(m1912getDragAndDropManager().c));
        this.v = ql0Var;
        hx0 hx0Var = nh0.a;
        this.w = new hx0();
        this.x = new sc1(m1914getLayoutNodes(), this);
        this.y = new ul1(getRoot(), new h40(), m1914getLayoutNodes());
        m4 m4Var = new m4(this);
        this.z = m4Var;
        a5 a5Var = new a5(this, new w3(0, this, u4.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 0));
        this.A = a5Var;
        this.B = new e6(this);
        this.C = new ge();
        this.D = new sx0();
        this.G = new dw0();
        ql0 root = getRoot();
        gk gkVar = new gk();
        gkVar.b = root;
        gkVar.c = new qd0(root.I.c);
        gkVar.d = new y41(2);
        gkVar.e = new td0();
        this.H = gkVar;
        this.I = xc.B(new Configuration(context.getResources().getConfiguration()));
        this.J = xc.s(new x3(this, 2));
        this.K = new k3(this, getAutofillTree());
        this.L = new l3(new xg0(context, 29), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.N = new y31(new b4(this, i));
        this.R = new ru0(getRoot());
        this.S = 9223372034707292159L;
        this.T = new int[]{0, 0};
        this.U = ou0.a();
        this.V = new Matrix();
        this.W = ou0.a();
        this.a0 = ou0.a();
        this.b0 = -1L;
        this.d0 = 9187343241974906880L;
        this.h0 = new AtomicReference(null);
        this.j0 = ipVar.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = g80.a;
        al0 al0Var = al0.e;
        al0 al0Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : al0.f : al0Var;
        this.k0 = xc.B(al0Var2 != null ? al0Var2 : al0Var);
        uv0 uv0Var = new uv0();
        new iy0(new xe[16]);
        new iy0(new xk[16]);
        new iy0(new ql0[16]);
        new iy0(new xk[16]);
        this.m0 = uv0Var;
        this.q0 = new n81(10);
        this.r0 = new sx0();
        this.s0 = Float.NaN;
        this.t0 = Float.NaN;
        this.u0 = Float.NaN;
        this.v0 = Float.NaN;
        this.w0 = new e4(i2, this);
        this.x0 = new q3(this, i);
        this.z0 = new s3(this);
        this.A0 = new eg0(context, new b4(this, i2));
        this.B0 = new x3(this, 4);
        this.C0 = new x3(this, i);
        addOnAttachStateChangeListener(a5Var);
        setWillNotDraw(false);
        setFocusable(true);
        t4.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        h62.b(this, m4Var);
        setOnDragListener(m1912getDragAndDropManager());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            o4.a.a(this);
        }
        if (l()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.o = view;
            addView(view, -1);
        }
        this.G0 = i3 >= 31 ? new y41(9) : null;
        this.I0 = new c4(this);
    }

    public static long g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    private final fj getCanvasHolder() {
        return this.e.u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    private final jz1 getLegacyTextInputServiceAndroid() {
        jz1 jz1Var = this.f0;
        if (jz1Var != null) {
            return jz1Var;
        }
        jz1 jz1Var2 = new jz1(getView(), this);
        this.f0 = jz1Var2;
        return jz1Var2;
    }

    public static void j(ql0 ql0Var) {
        ql0Var.E();
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            j((ql0) objArr[i2]);
        }
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean m(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !ew0.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.s.setValue(Boolean.valueOf(z));
    }

    private void setDensity(hx hxVar) {
        this.n.setValue(hxVar);
    }

    private void setLayoutDirection(al0 al0Var) {
        this.k0.setValue(al0Var);
    }

    public final void A() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.W;
        int[] iArr = this.T;
        if (i >= 29) {
            mi.a.a(this, fArr, this.V, iArr);
        } else {
            ou0.d(fArr);
            nu0.N(this, fArr, this.U, iArr);
        }
        el.E(fArr, this.a0);
    }

    public final boolean B() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void C(ha0 ha0Var) {
        fd fdVar = this.l;
        boolean zIsEmpty = fdVar.isEmpty();
        fdVar.addLast(ha0Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.m);
            } else {
                yc.p("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void D(ql0 ql0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (ql0Var != null) {
            while (ql0Var != null && ql0Var.r() == ol0.e) {
                if (!this.Q) {
                    ql0 ql0VarU = ql0Var.u();
                    if (ql0VarU == null) {
                        break;
                    }
                    long j = ql0VarU.I.c.h;
                    if (kr.f(j) && kr.e(j)) {
                        break;
                    }
                }
                ql0Var = ql0Var.u();
            }
            if (ql0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long E(long j) {
        y();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.d0 >> 32));
        return ou0.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.d0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.a0);
    }

    public final int F(MotionEvent motionEvent) {
        Object obj;
        if (this.D0) {
            this.D0 = false;
            co0 co0Var = this.e.t;
            int metaState = motionEvent.getMetaState();
            co0Var.getClass();
            j72.a.setValue(new r81(metaState));
        }
        dw0 dw0Var = this.G;
        n81 n81VarC = dw0Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        gk gkVar = this.H;
        if (n81VarC == null) {
            if (!gkVar.a) {
                qs0 qs0Var = (qs0) ((y41) gkVar.d).f;
                int i = qs0Var.h;
                Object[] objArr = qs0Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                qs0Var.h = 0;
                qs0Var.e = false;
                ((qd0) gkVar.c).c();
            }
            return 0;
        }
        List list = (List) n81VarC.b;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((o81) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                size = i3;
            }
            obj = null;
        } else {
            obj = null;
        }
        o81 o81Var = (o81) obj;
        if (o81Var != null) {
            this.f = o81Var.d;
        }
        int iD = gkVar.d(n81VarC, this, n(motionEvent));
        n81VarC.c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iD & 1) != 0) {
            return iD;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        dw0Var.c.delete(pointerId);
        dw0Var.b.delete(pointerId);
        return iD;
    }

    public final void G(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jQ = q((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jQ >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jQ & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        n81 n81VarC = this.G.c(motionEventObtain, this);
        n81VarC.getClass();
        this.H.d(n81VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(wa0 wa0Var, ls lsVar) {
        g4 g4Var;
        if (lsVar instanceof g4) {
            g4Var = (g4) lsVar;
            int i = g4Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                g4Var.j = i - Integer.MIN_VALUE;
            } else {
                g4Var = new g4(this, lsVar);
            }
        }
        Object obj = g4Var.h;
        int i2 = g4Var.j;
        if (i2 == 0) {
            xc.G(obj);
            b4 b4Var = new b4(this, 2);
            g4Var.j = 1;
            if (bl.r(new m6(b4Var, this.h0, wa0Var, null, 14), g4Var) == wt.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            xc.G(obj);
        }
        yc.j();
    }

    public final void I(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (xi0.o(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(xi0.d(getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        boolean z;
        int i;
        int[] iArr = this.T;
        getLocationOnScreen(iArr);
        long j = this.S;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.b0 < 0) {
            this.S = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                iy0 iy0VarY = getRoot().y();
                Object[] objArr = iy0VarY.e;
                int i5 = iy0VarY.g;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((ql0) objArr[i6]).J.p.C0();
                }
                z = true;
            }
        }
        y();
        View rootView = this.H0;
        if (rootView == null) {
            rootView = getRootView();
            this.H0 = rootView;
        }
        sc1 rectManager = getRectManager();
        long j2 = this.S;
        long jS = hk.S(this.d0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.W;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        r02 r02Var = rectManager.d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.g = r02Var.b(j2, jS, fArr, width, height) || rectManager.g;
        this.R.b(z);
        getRectManager().a();
    }

    public final void K(float f) {
        if (l()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.s0) || f > this.s0) {
                    this.s0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.t0) || f < this.t0) {
                    this.t0 = f;
                }
            }
        }
    }

    @Override // defpackage.iw
    public final void a(xo0 xo0Var) {
        bp0 bp0Var = this.j;
        if (bp0Var != null) {
            ot0 ot0Var = (ot0) bp0Var.a.f;
            if (ot0Var.e && !ot0Var.g) {
                zi ziVar = bp0Var.d;
                if (ziVar != null) {
                    ziVar.cancel();
                }
                bp0Var.d = null;
                return;
            }
            if (ot0Var.f) {
                return;
            }
            if (!ot0Var.g) {
                f91.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!ot0Var.h.i()) {
                f91.a("Attempted to start retaining exited values with pending exited values");
            }
            ot0Var.g = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        w80 w80Var = ((m80) getFocusOwner()).c;
        if (!w80Var.r) {
            return;
        }
        if (!w80Var.e.r) {
            ng0.b("visitSubtreeIf called on an unattached node");
        }
        iy0 iy0Var = new iy0(new sv0[16]);
        sv0 sv0Var = w80Var.e;
        sv0 sv0Var2 = sv0Var.j;
        if (sv0Var2 == null) {
            bl.h(iy0Var, sv0Var);
        } else {
            iy0Var.b(sv0Var2);
        }
        while (true) {
            int i3 = iy0Var.g;
            if (i3 == 0) {
                return;
            }
            sv0 sv0Var3 = (sv0) iy0Var.k(i3 - 1);
            if ((sv0Var3.h & 1024) != 0) {
                for (sv0 sv0Var4 = sv0Var3; sv0Var4 != null && sv0Var4.r; sv0Var4 = sv0Var4.j) {
                    if ((sv0Var4.g & 1024) != 0) {
                        sv0 sv0VarK = sv0Var4;
                        iy0 iy0Var2 = null;
                        while (sv0VarK != null) {
                            int i4 = 0;
                            if (sv0VarK instanceof w80) {
                                w80 w80Var2 = (w80) sv0VarK;
                                if (w80Var2.r && w80Var2.N0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    w80 w80Var3 = ((m80) getFocusOwner()).c;
                                    if (w80Var3.r) {
                                        if (!w80Var3.e.r) {
                                            ng0.b("visitSubtreeIf called on an unattached node");
                                        }
                                        iy0 iy0Var3 = new iy0(new sv0[16]);
                                        sv0 sv0Var5 = w80Var3.e;
                                        sv0 sv0Var6 = sv0Var5.j;
                                        if (sv0Var6 == null) {
                                            bl.h(iy0Var3, sv0Var5);
                                        } else {
                                            iy0Var3.b(sv0Var6);
                                        }
                                        while (true) {
                                            int i5 = iy0Var3.g;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            sv0 sv0Var7 = (sv0) iy0Var3.k(i5 - 1);
                                            if ((sv0Var7.h & 1024) != 0) {
                                                for (sv0 sv0Var8 = sv0Var7; sv0Var8 != null && sv0Var8.r; sv0Var8 = sv0Var8.j) {
                                                    if ((sv0Var8.g & 1024) != 0) {
                                                        sv0 sv0VarK2 = sv0Var8;
                                                        iy0 iy0Var4 = null;
                                                        while (sv0VarK2 != null) {
                                                            if (sv0VarK2 instanceof w80) {
                                                                w80 w80Var4 = (w80) sv0VarK2;
                                                                if (w80Var4.r) {
                                                                    n80 n80VarN0 = w80Var4.N0();
                                                                    if (w80Var4.r && n80VarN0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((sv0VarK2.g & 1024) != 0 && (sv0VarK2 instanceof yw)) {
                                                                int i6 = 0;
                                                                for (sv0 sv0Var9 = ((yw) sv0VarK2).t; sv0Var9 != null; sv0Var9 = sv0Var9.j) {
                                                                    if ((sv0Var9.g & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            sv0VarK2 = sv0Var9;
                                                                        } else {
                                                                            if (iy0Var4 == null) {
                                                                                iy0Var4 = new iy0(new sv0[16]);
                                                                            }
                                                                            if (sv0VarK2 != null) {
                                                                                iy0Var4.b(sv0VarK2);
                                                                                sv0VarK2 = null;
                                                                            }
                                                                            iy0Var4.b(sv0Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            sv0VarK2 = bl.k(iy0Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            bl.h(iy0Var3, sv0Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                for (sv0 sv0Var10 = ((yw) sv0VarK).t; sv0Var10 != null; sv0Var10 = sv0Var10.j) {
                                    if ((sv0Var10.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            sv0VarK = sv0Var10;
                                        } else {
                                            if (iy0Var2 == null) {
                                                iy0Var2 = new iy0(new sv0[16]);
                                            }
                                            if (sv0VarK != null) {
                                                iy0Var2.b(sv0VarK);
                                                sv0VarK = null;
                                            }
                                            iy0Var2.b(sv0Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            sv0VarK = bl.k(iy0Var2);
                        }
                    }
                }
            }
            bl.h(iy0Var, sv0Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        nl1 nl1VarW;
        sa0 sa0Var;
        sa0 sa0Var2;
        l3 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                ql0 ql0Var = (ql0) autofillManager.f.c.b(iKeyAt);
                if (ql0Var != null && (nl1VarW = ql0Var.w()) != null) {
                    zx0 zx0Var = nl1VarW.e;
                    Object objG = zx0Var.g(ml1.g);
                    if (objG == null) {
                        objG = null;
                    }
                    r0 r0Var = (r0) objG;
                    if (r0Var != null && (sa0Var2 = (sa0) r0Var.b) != null) {
                    }
                    Object objG2 = zx0Var.g(ml1.h);
                    r0 r0Var2 = (r0) (objG2 != null ? objG2 : null);
                    if (r0Var2 != null && (sa0Var = (sa0) r0Var2.b) != null) {
                    }
                }
            }
        }
        k3 autofill = getAutofill();
        if (autofill != null) {
            ge geVar = autofill.b;
            if (geVar.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (geVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        yc.d();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new o01("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new o01("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new o01("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // defpackage.iw
    public final void c(xo0 xo0Var) {
        zi ziVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(l91.r());
        }
        bp0 bp0Var = this.j;
        if (bp0Var != null) {
            ap0 ap0Var = this.i;
            ap0Var.getClass();
            qt0 qt0Var = bp0Var.a;
            ot0 ot0Var = (ot0) qt0Var.f;
            if (!ot0Var.e || ot0Var.g) {
                return;
            }
            try {
                ziVarS = ((x92) ap0Var).e.s(new a7(9, bp0Var));
            } catch (CancellationException unused) {
                ot0 ot0Var2 = (ot0) qt0Var.f;
                if (!ot0Var2.f) {
                    if (ot0Var2.g) {
                        f91.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ot0Var2.a();
                    ot0Var2.g = true;
                }
                ziVarS = null;
            }
            zi ziVar = bp0Var.d;
            if (ziVar != null) {
                ziVar.cancel();
            }
            bp0Var.d = ziVarS;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.z.g(false, i, this.f);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.z.g(true, i, this.f);
    }

    @Override // defpackage.i80
    public final void d(w80 w80Var, w80 w80Var2) {
        xz0 xz0Var;
        boolean z;
        xz0 xz0Var2;
        boolean z2;
        if (w80Var != null) {
            w80 w80Var3 = w80Var;
            if (!w80Var3.e.r) {
                ng0.b("visitAncestors called on an unattached node");
            }
            sv0 sv0Var = w80Var3.e;
            ql0 ql0VarP = bl.P(w80Var);
            ay0 ay0Var = null;
            ArrayList arrayList = null;
            while (ql0VarP != null) {
                if ((ql0VarP.I.f.h & 2097152) != 0) {
                    while (sv0Var != null) {
                        if ((sv0Var.g & 2097152) != 0) {
                            sv0 sv0VarK = sv0Var;
                            iy0 iy0Var = null;
                            while (sv0VarK != null) {
                                if (sv0VarK instanceof cg0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(sv0VarK);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (sv0VarK.g & 2097152) != 0 && (sv0VarK instanceof yw)) {
                                    int i = 0;
                                    for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                        if ((sv0Var2.g & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                sv0VarK = sv0Var2;
                                            } else {
                                                if (iy0Var == null) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (sv0VarK != null) {
                                                    iy0Var.b(sv0VarK);
                                                    sv0VarK = null;
                                                }
                                                iy0Var.b(sv0Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                sv0VarK = bl.k(iy0Var);
                            }
                        }
                        sv0Var = sv0Var.i;
                    }
                }
                ql0VarP = ql0VarP.u();
                sv0Var = (ql0VarP == null || (xz0Var2 = ql0VarP.I) == null) ? null : xz0Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (w80Var2 != null) {
                if (!w80Var2.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var3 = w80Var2.e;
                ql0 ql0VarP2 = bl.P(w80Var2);
                ay0 ay0Var2 = null;
                while (ql0VarP2 != null) {
                    if ((ql0VarP2.I.f.h & 2097152) != 0) {
                        while (sv0Var3 != null) {
                            if ((sv0Var3.g & 2097152) != 0) {
                                sv0 sv0VarK2 = sv0Var3;
                                iy0 iy0Var2 = null;
                                while (sv0VarK2 != null) {
                                    if (sv0VarK2 instanceof cg0) {
                                        if (ay0Var2 == null) {
                                            ay0 ay0Var3 = qi1.a;
                                            ay0Var2 = new ay0();
                                        }
                                        ay0Var2.a(sv0VarK2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (sv0VarK2.g & 2097152) != 0 && (sv0VarK2 instanceof yw)) {
                                        int i2 = 0;
                                        for (sv0 sv0Var4 = ((yw) sv0VarK2).t; sv0Var4 != null; sv0Var4 = sv0Var4.j) {
                                            if ((sv0Var4.g & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    sv0VarK2 = sv0Var4;
                                                } else {
                                                    if (iy0Var2 == null) {
                                                        iy0Var2 = new iy0(new sv0[16]);
                                                    }
                                                    if (sv0VarK2 != null) {
                                                        iy0Var2.b(sv0VarK2);
                                                        sv0VarK2 = null;
                                                    }
                                                    iy0Var2.b(sv0Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    sv0VarK2 = bl.k(iy0Var2);
                                }
                            }
                            sv0Var3 = sv0Var3.i;
                        }
                    }
                    ql0VarP2 = ql0VarP2.u();
                    sv0Var3 = (ql0VarP2 == null || (xz0Var = ql0VarP2.I) == null) ? null : xz0Var.e;
                }
                ay0Var = ay0Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                cg0 cg0Var = (cg0) arrayList.get(i3);
                if (!(ay0Var != null ? ay0Var.c(cg0Var) : false)) {
                    cg0Var.C();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sx0 sx0Var = this.D;
        if (!isAttachedToWindow()) {
            j(getRoot());
        }
        r(true);
        aq1.j().m();
        this.F = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            fj canvasHolder = getCanvasHolder();
            n3 n3Var = canvasHolder.a;
            Canvas canvas2 = n3Var.a;
            n3Var.a = canvas;
            getRoot().i(n3Var, null);
            canvasHolder.a.a = canvas2;
            if (sx0Var.i()) {
                int i = sx0Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((qc0) ((v31) sx0Var.f(i2))).g();
                }
            }
            int i3 = l62.e;
            sx0Var.d();
            this.F = false;
            Trace.endSection();
            sx0 sx0Var2 = this.E;
            if (sx0Var2 != null) {
                sx0Var.b(sx0Var2);
                sx0Var2.d();
            }
            if (l()) {
                if (Float.compare(this.s0, this.u0) != 0) {
                    float f = this.s0;
                    this.u0 = f;
                    sb.a(this, f);
                }
                View view = this.o;
                if (view != null) {
                    if (Float.compare(this.t0, this.v0) != 0) {
                        float f2 = this.t0;
                        this.v0 = f2;
                        sb.a(view, f2);
                    }
                    if (!Float.isNaN(this.t0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.s0 = Float.NaN;
                this.t0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04e8 A[PHI: r5
      0x04e8: PHI (r5v65 ??) = (r5v86 ??), (r5v87 ??), (r5v88 ??) binds: [B:304:0x04a9, B:306:0x04ad, B:321:0x04e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x06c5 A[PHI: r4
      0x06c5: PHI (r4v28 ??) = (r4v67 ??), (r4v68 ??), (r4v69 ??) binds: [B:441:0x068a, B:443:0x068e, B:458:0x06c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v18, types: [sv0] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v41, types: [sv0] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v134 */
    /* JADX WARN: Type inference failed for: r2v135 */
    /* JADX WARN: Type inference failed for: r2v136 */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r2v47, types: [sv0] */
    /* JADX WARN: Type inference failed for: r2v78, types: [sv0] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [cg0, xw] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [sv0] */
    /* JADX WARN: Type inference failed for: r3v41, types: [sv0] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [iy0] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [iy0] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [cg0, xw] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [sv0] */
    /* JADX WARN: Type inference failed for: r4v50, types: [sv0] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, sv0] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [sv0] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [iy0] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [iy0] */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [iy0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [iy0] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, sv0] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [sv0] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [iy0] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [iy0] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r8v17 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) throws Throwable {
        Throwable th;
        int i;
        String str;
        int i2;
        g6 g6Var;
        String str2;
        long jValueAt;
        tf0 tf0Var;
        long j;
        long j2;
        int i3;
        char c;
        int i4;
        long jFloatToRawIntBits;
        ?? r3;
        xz0 xz0Var;
        boolean z;
        ?? r32;
        xz0 xz0Var2;
        ?? K;
        ?? r4;
        boolean z2;
        int size;
        int size2;
        xz0 xz0Var3;
        boolean z3;
        ?? r42;
        xz0 xz0Var4;
        ?? K2;
        boolean z4;
        v3 v3Var;
        int size3;
        xz0 xz0Var5;
        boolean z5;
        sv0 sv0VarK;
        xz0 xz0Var6;
        if (this.y0) {
            q3 q3Var = this.x0;
            removeCallbacks(q3Var);
            if (motionEvent.getActionMasked() == 8) {
                this.y0 = false;
            } else {
                q3Var.run();
            }
        }
        if (m(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int actionIndex = -1;
        int i5 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (i(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            m80 m80Var = (m80) getFocusOwner();
            if (m80Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            w80 w80VarS = hk.s(m80Var.c);
            if (w80VarS != null) {
                if (!w80VarS.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var = w80VarS.e;
                ql0 ql0VarP = bl.P(w80VarS);
                loop0: while (true) {
                    if (ql0VarP == null) {
                        sv0VarK = null;
                        break;
                    }
                    if ((ql0VarP.I.f.h & 16384) != 0) {
                        while (sv0Var != null) {
                            if ((sv0Var.g & 16384) != 0) {
                                sv0VarK = sv0Var;
                                iy0 iy0Var = null;
                                while (sv0VarK != null) {
                                    if (sv0VarK instanceof v3) {
                                        break loop0;
                                    }
                                    if ((sv0VarK.g & 16384) != 0 && (sv0VarK instanceof yw)) {
                                        int i6 = 0;
                                        for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                            if ((sv0Var2.g & 16384) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    sv0VarK = sv0Var2;
                                                } else {
                                                    if (iy0Var == null) {
                                                        iy0Var = new iy0(new sv0[16]);
                                                    }
                                                    if (sv0VarK != null) {
                                                        iy0Var.b(sv0VarK);
                                                        sv0VarK = null;
                                                    }
                                                    iy0Var.b(sv0Var2);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    sv0VarK = bl.k(iy0Var);
                                }
                            }
                            sv0Var = sv0Var.i;
                        }
                    }
                    ql0VarP = ql0VarP.u();
                    sv0Var = (ql0VarP == null || (xz0Var6 = ql0VarP.I) == null) ? null : xz0Var6.e;
                }
                v3Var = (v3) sv0VarK;
            } else {
                v3Var = null;
            }
            if (v3Var != null) {
                if (!v3Var.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var3 = v3Var.e.i;
                ql0 ql0VarP2 = bl.P(v3Var);
                ArrayList arrayList = null;
                while (ql0VarP2 != null) {
                    if ((ql0VarP2.I.f.h & 16384) != 0) {
                        while (sv0Var3 != null) {
                            if ((sv0Var3.g & 16384) != 0) {
                                sv0 sv0VarK2 = sv0Var3;
                                iy0 iy0Var2 = null;
                                while (sv0VarK2 != null) {
                                    if (sv0VarK2 instanceof v3) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(sv0VarK2);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (sv0VarK2.g & 16384) != 0 && (sv0VarK2 instanceof yw)) {
                                        int i7 = 0;
                                        for (sv0 sv0Var4 = ((yw) sv0VarK2).t; sv0Var4 != null; sv0Var4 = sv0Var4.j) {
                                            if ((sv0Var4.g & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    sv0VarK2 = sv0Var4;
                                                } else {
                                                    if (iy0Var2 == null) {
                                                        iy0Var2 = new iy0(new sv0[16]);
                                                    }
                                                    if (sv0VarK2 != null) {
                                                        iy0Var2.b(sv0VarK2);
                                                        sv0VarK2 = null;
                                                    }
                                                    iy0Var2.b(sv0Var4);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    sv0VarK2 = bl.k(iy0Var2);
                                }
                            }
                            sv0Var3 = sv0Var3.i;
                        }
                    }
                    ql0VarP2 = ql0VarP2.u();
                    sv0Var3 = (ql0VarP2 == null || (xz0Var5 = ql0VarP2.I) == null) ? null : xz0Var5.e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i8 = size3 - 1;
                        ((v3) arrayList.get(size3)).getClass();
                        if (i8 < 0) {
                            break;
                        }
                        size3 = i8;
                    }
                }
                sv0 sv0VarK3 = v3Var.e;
                iy0 iy0Var3 = null;
                while (sv0VarK3 != null) {
                    if (!(sv0VarK3 instanceof v3) && (sv0VarK3.g & 16384) != 0 && (sv0VarK3 instanceof yw)) {
                        int i9 = 0;
                        for (sv0 sv0Var5 = ((yw) sv0VarK3).t; sv0Var5 != null; sv0Var5 = sv0Var5.j) {
                            if ((sv0Var5.g & 16384) != 0) {
                                i9++;
                                if (i9 == 1) {
                                    sv0VarK3 = sv0Var5;
                                } else {
                                    if (iy0Var3 == null) {
                                        iy0Var3 = new iy0(new sv0[16]);
                                    }
                                    if (sv0VarK3 != null) {
                                        iy0Var3.b(sv0VarK3);
                                        sv0VarK3 = null;
                                    }
                                    iy0Var3.b(sv0Var5);
                                }
                            }
                        }
                        if (i9 == 1) {
                        }
                    }
                    sv0VarK3 = bl.k(iy0Var3);
                }
                if (!super.dispatchGenericMotionEvent(motionEvent)) {
                    sv0 sv0VarK4 = v3Var.e;
                    iy0 iy0Var4 = null;
                    while (sv0VarK4 != null) {
                        if (!(sv0VarK4 instanceof v3) && (sv0VarK4.g & 16384) != 0 && (sv0VarK4 instanceof yw)) {
                            int i10 = 0;
                            for (sv0 sv0Var6 = ((yw) sv0VarK4).t; sv0Var6 != null; sv0Var6 = sv0Var6.j) {
                                if ((sv0Var6.g & 16384) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        sv0VarK4 = sv0Var6;
                                    } else {
                                        if (iy0Var4 == null) {
                                            iy0Var4 = new iy0(new sv0[16]);
                                        }
                                        if (sv0VarK4 != null) {
                                            iy0Var4.b(sv0VarK4);
                                            sv0VarK4 = null;
                                        }
                                        iy0Var4.b(sv0Var6);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        sv0VarK4 = bl.k(iy0Var4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            ((v3) arrayList.get(i11)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        tf0 tf0Var2 = this.h;
        dw0 dw0Var = this.G;
        qs0 qs0Var = dw0Var.e;
        SparseLongArray sparseLongArray = dw0Var.b;
        int actionMasked = motionEvent.getActionMasked();
        dw0Var.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            dw0Var.c.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            g6Var = null;
            th = null;
        } else {
            dw0Var.a(motionEvent);
            if (actionMasked != 1) {
                if (actionMasked == 6) {
                    actionIndex = motionEvent.getActionIndex();
                }
                th = null;
            } else {
                th = null;
                actionIndex = 0;
            }
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i12 = 0;
            while (i12 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i12);
                int i13 = i5;
                int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    str2 = str3;
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    tf0Var = tf0Var2;
                } else {
                    str2 = str3;
                    jValueAt = dw0Var.a;
                    tf0Var = tf0Var2;
                    dw0Var.a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                dw0 dw0Var2 = dw0Var;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i12))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i12))) & 4294967295L);
                ?? r33 = i12 != actionIndex ? i13 : 0;
                cw0 cw0Var = (cw0) qs0Var.a(jValueAt);
                if (i12 == actionIndex) {
                    qs0Var.d(jValueAt);
                    j = jValueAt;
                    j2 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z6) {
                        j2 = 2147483647L;
                        i3 = 65535;
                        j = jValueAt;
                        qs0Var.c(j, new cw0(1 | ((motionEvent.getEventTime() & 2147483647L) << i13) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32)));
                    } else {
                        j = jValueAt;
                        j2 = 2147483647L;
                        i3 = 65535;
                    }
                    c = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                long j3 = j2;
                float pressure = motionEvent.getPressure(i12);
                int i14 = i3;
                int i15 = actionIndex;
                long eventTime2 = cw0Var != null ? (cw0Var.a >> i13) & j3 : motionEvent.getEventTime();
                if (cw0Var != null) {
                    i4 = i15;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (r5 & i14))) & 4294967295L) | (((long) Float.floatToRawIntBits((short) (((int) (cw0Var.a >>> c)) >>> 16))) << c);
                } else {
                    i4 = i15;
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                arrayList2.add(new uf0(j, eventTime, jFloatToRawIntBits2, r33, pressure, eventTime2, jFloatToRawIntBits, cw0Var != null ? (cw0Var.a & 1) != 0 ? i13 : 0 : 0));
                i12++;
                dw0Var = dw0Var2;
                i5 = i13;
                str3 = str2;
                tf0Var2 = tf0Var;
                actionIndex = i4;
            }
            tf0 tf0Var3 = tf0Var2;
            str = str3;
            int i16 = i5;
            dw0Var.e(motionEvent);
            if (tf0Var3 != null) {
                i2 = tf0Var3.a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    yc.p("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i16);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                    if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                    }
                                }
                                i2 = 1;
                            }
                            i2 = 0;
                        }
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                }
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            g6Var = new g6();
            g6Var.b = arrayList2;
            g6Var.a = i2;
            g6Var.c = motionEvent;
            if (arrayList2.isEmpty()) {
                yc.p("changes cannot be empty");
                throw th;
            }
        }
        eg0 eg0Var = this.A0;
        if (g6Var == null) {
            w80 w80VarF = ((m80) getFocusOwner()).f();
            if (w80VarF != null) {
                if (!w80VarF.e.r) {
                    ng0.b(str);
                }
                Object obj = w80VarF.e;
                ql0 ql0VarP3 = bl.P(w80VarF);
                loop26: while (true) {
                    if (ql0VarP3 == null) {
                        r32 = th;
                        break;
                    }
                    int i17 = 2097152;
                    if ((ql0VarP3.I.f.h & 2097152) != 0) {
                        for (?? r2 = obj; r2 != 0; r2 = r2.i) {
                            if ((r2.g & i17) != 0) {
                                r32 = r2;
                                ?? r43 = th;
                                while (r32 != 0) {
                                    if (r32 instanceof cg0) {
                                        break loop26;
                                    }
                                    ?? iy0Var5 = r43;
                                    if ((r32.g & i17) != 0) {
                                        iy0Var5 = r43;
                                        if (r32 instanceof yw) {
                                            sv0 sv0Var7 = ((yw) r32).t;
                                            int i18 = 0;
                                            K = r32;
                                            iy0Var5 = r43;
                                            while (sv0Var7 != null) {
                                                if ((sv0Var7.g & i17) != 0) {
                                                    i18++;
                                                    iy0Var5 = iy0Var5;
                                                    if (i18 == 1) {
                                                        K = sv0Var7;
                                                    } else {
                                                        if (iy0Var5 == 0) {
                                                            iy0Var5 = new iy0(new sv0[16]);
                                                        }
                                                        if (K != 0) {
                                                            iy0Var5.b(K);
                                                            K = th;
                                                        }
                                                        iy0Var5.b(sv0Var7);
                                                    }
                                                }
                                                sv0Var7 = sv0Var7.j;
                                                i17 = 2097152;
                                                K = K;
                                                iy0Var5 = iy0Var5;
                                            }
                                            iy0Var5 = iy0Var5;
                                            if (i18 != 1) {
                                                K = bl.k(iy0Var5);
                                            }
                                        }
                                    }
                                    i17 = 2097152;
                                    r32 = K;
                                    r43 = iy0Var5;
                                }
                            }
                            i17 = 2097152;
                        }
                    }
                    ql0VarP3 = ql0VarP3.u();
                    obj = (ql0VarP3 == null || (xz0Var2 = ql0VarP3.I) == null) ? th : xz0Var2.e;
                }
                r3 = (cg0) r32;
            } else {
                r3 = th;
            }
            if (r3 != 0) {
                sv0 sv0Var8 = (sv0) r3;
                if (!sv0Var8.e.r) {
                    ng0.b(str);
                }
                Object obj2 = sv0Var8.e.i;
                ql0 ql0VarP4 = bl.P(r3);
                ?? r44 = th;
                while (ql0VarP4 != null) {
                    int i19 = 2097152;
                    ?? r0 = obj2;
                    r44 = r44;
                    if ((ql0VarP4.I.f.h & 2097152) != 0) {
                        while (r0 != 0) {
                            if ((r0.g & i19) != 0) {
                                ?? K3 = r0;
                                ?? iy0Var6 = th;
                                while (K3 != 0) {
                                    ?? arrayList3 = r44;
                                    if (K3 instanceof cg0) {
                                        if (r44 == 0) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(K3);
                                        z = false;
                                        r44 = arrayList3;
                                    } else {
                                        z = true;
                                        r44 = r44;
                                    }
                                    if (z) {
                                        if ((K3.g & 2097152) != 0 && (K3 instanceof yw)) {
                                            sv0 sv0Var9 = ((yw) K3).t;
                                            int i20 = 0;
                                            K3 = K3;
                                            iy0Var6 = iy0Var6;
                                            while (sv0Var9 != null) {
                                                K3 = K3;
                                                if ((sv0Var9.g & 2097152) != 0) {
                                                    i20++;
                                                    if (i20 == 1) {
                                                        K3 = sv0Var9;
                                                    } else {
                                                        iy0Var6 = iy0Var6 == 0 ? new iy0(new sv0[16]) : iy0Var6;
                                                        if (K3 != 0) {
                                                            iy0Var6.b(K3);
                                                            K3 = th;
                                                        }
                                                        iy0Var6.b(sv0Var9);
                                                    }
                                                }
                                                sv0Var9 = sv0Var9.j;
                                                K3 = K3;
                                                iy0Var6 = iy0Var6;
                                            }
                                            if (i20 == 1) {
                                            }
                                        }
                                    }
                                    K3 = bl.k(iy0Var6);
                                }
                            }
                            i19 = 2097152;
                            r0 = r0.i;
                            r44 = r44;
                        }
                    }
                    ql0VarP4 = ql0VarP4.u();
                    obj2 = (ql0VarP4 == null || (xz0Var = ql0VarP4.I) == null) ? th : xz0Var.e;
                }
                r3.C();
                if (r44 != 0) {
                    int size5 = r44.size();
                    for (int i21 = 0; i21 < size5; i21++) {
                        ((cg0) r44.get(i21)).C();
                    }
                }
            }
            eg0Var.b = 0;
            eg0Var.c = true;
            return true;
        }
        m80 m80Var2 = (m80) getFocusOwner();
        if (m80Var2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            w80 w80VarF2 = m80Var2.f();
            if (w80VarF2 != null) {
                if (!w80VarF2.e.r) {
                    ng0.b(str);
                }
                sv0 sv0Var10 = w80VarF2.e;
                ql0 ql0VarP5 = bl.P(w80VarF2);
                Object obj3 = sv0Var10;
                loop14: while (true) {
                    if (ql0VarP5 == null) {
                        r42 = th;
                        break;
                    }
                    int i22 = 2097152;
                    if ((ql0VarP5.I.f.h & 2097152) != 0) {
                        for (?? r22 = obj3; r22 != 0; r22 = r22.i) {
                            if ((r22.g & i22) != 0) {
                                r42 = r22;
                                ?? r5 = th;
                                while (r42 != 0) {
                                    if (r42 instanceof cg0) {
                                        break loop14;
                                    }
                                    ?? iy0Var7 = r5;
                                    if ((r42.g & i22) != 0) {
                                        iy0Var7 = r5;
                                        if (r42 instanceof yw) {
                                            sv0 sv0Var11 = ((yw) r42).t;
                                            int i23 = 0;
                                            K2 = r42;
                                            iy0Var7 = r5;
                                            while (sv0Var11 != null) {
                                                if ((sv0Var11.g & i22) != 0) {
                                                    i23++;
                                                    iy0Var7 = iy0Var7;
                                                    if (i23 == 1) {
                                                        K2 = sv0Var11;
                                                    } else {
                                                        if (iy0Var7 == 0) {
                                                            iy0Var7 = new iy0(new sv0[i]);
                                                        }
                                                        if (K2 != 0) {
                                                            iy0Var7.b(K2);
                                                            K2 = th;
                                                        }
                                                        iy0Var7.b(sv0Var11);
                                                    }
                                                }
                                                sv0Var11 = sv0Var11.j;
                                                i = 16;
                                                i22 = 2097152;
                                                K2 = K2;
                                                iy0Var7 = iy0Var7;
                                            }
                                            iy0Var7 = iy0Var7;
                                            if (i23 != 1) {
                                                K2 = bl.k(iy0Var7);
                                            }
                                        }
                                    }
                                    i = 16;
                                    i22 = 2097152;
                                    r42 = K2;
                                    r5 = iy0Var7;
                                }
                            }
                            i = 16;
                            i22 = 2097152;
                        }
                    }
                    ql0VarP5 = ql0VarP5.u();
                    i = 16;
                    obj3 = (ql0VarP5 == null || (xz0Var4 = ql0VarP5.I) == null) ? th : xz0Var4.e;
                }
                r4 = (cg0) r42;
            } else {
                r4 = th;
            }
            if (r4 != 0) {
                sv0 sv0Var12 = (sv0) r4;
                if (!sv0Var12.e.r) {
                    ng0.b(str);
                }
                Object obj4 = sv0Var12.e.i;
                ql0 ql0VarP6 = bl.P(r4);
                ?? r52 = th;
                while (ql0VarP6 != null) {
                    int i24 = 2097152;
                    ?? r02 = obj4;
                    r52 = r52;
                    if ((ql0VarP6.I.f.h & 2097152) != 0) {
                        while (r02 != 0) {
                            if ((r02.g & i24) != 0) {
                                ?? K4 = r02;
                                ?? iy0Var8 = th;
                                while (K4 != 0) {
                                    ?? arrayList4 = r52;
                                    if (K4 instanceof cg0) {
                                        if (r52 == 0) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(K4);
                                        z3 = false;
                                        r52 = arrayList4;
                                    } else {
                                        z3 = true;
                                        r52 = r52;
                                    }
                                    if (z3) {
                                        int i25 = 2097152;
                                        if ((K4.g & 2097152) != 0 && (K4 instanceof yw)) {
                                            sv0 sv0Var13 = ((yw) K4).t;
                                            int i26 = 0;
                                            K4 = K4;
                                            iy0Var8 = iy0Var8;
                                            while (sv0Var13 != null) {
                                                if ((sv0Var13.g & i25) != 0) {
                                                    i26++;
                                                    iy0Var8 = iy0Var8;
                                                    if (i26 == 1) {
                                                        K4 = sv0Var13;
                                                    } else {
                                                        if (iy0Var8 == 0) {
                                                            iy0Var8 = new iy0(new sv0[16]);
                                                        }
                                                        if (K4 != 0) {
                                                            iy0Var8.b(K4);
                                                            K4 = th;
                                                        }
                                                        iy0Var8.b(sv0Var13);
                                                    }
                                                }
                                                sv0Var13 = sv0Var13.j;
                                                i25 = 2097152;
                                                K4 = K4;
                                                iy0Var8 = iy0Var8;
                                            }
                                            if (i26 == 1) {
                                            }
                                        }
                                    }
                                    K4 = bl.k(iy0Var8);
                                }
                            }
                            i24 = 2097152;
                            r02 = r02.i;
                            r52 = r52;
                        }
                    }
                    ql0VarP6 = ql0VarP6.u();
                    obj4 = (ql0VarP6 == null || (xz0Var3 = ql0VarP6.I) == null) ? th : xz0Var3.e;
                }
                f81 f81Var = f81.e;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i27 = size2 - 1;
                        ((cg0) r52.get(size2)).F(g6Var, f81Var);
                        if (i27 < 0) {
                            break;
                        }
                        size2 = i27;
                    }
                }
                r4.F(g6Var, f81Var);
                f81 f81Var2 = f81.f;
                r4.F(g6Var, f81Var2);
                if (r52 != 0) {
                    int size6 = r52.size();
                    for (int i28 = 0; i28 < size6; i28++) {
                        ((cg0) r52.get(i28)).F(g6Var, f81Var2);
                    }
                }
                f81 f81Var3 = f81.g;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i29 = size - 1;
                        ((cg0) r52.get(size)).F(g6Var, f81Var3);
                        if (i29 < 0) {
                            break;
                        }
                        size = i29;
                    }
                }
                r4.F(g6Var, f81Var3);
            }
            ArrayList arrayList5 = (ArrayList) g6Var.b;
            int size7 = arrayList5.size();
            for (int i30 = 0; i30 < size7; i30++) {
                if (((uf0) arrayList5.get(i30)).i) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        eg0Var.getClass();
        MotionEvent motionEvent2 = (MotionEvent) g6Var.c;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                eg0Var.b = 0;
                eg0Var.c = true;
            }
        } else {
            z4 = true;
            eg0Var.b = g6Var.a;
            eg0Var.c = false;
        }
        eg0Var.d.onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0140, code lost:
    
        if (o(r23) == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        int iU;
        boolean z2 = this.y0;
        q3 q3Var = this.x0;
        if (z2) {
            removeCallbacks(q3Var);
            q3Var.run();
        }
        if (!m(motionEvent) && isAttachedToWindow()) {
            m4 m4Var = this.z;
            h4 h4Var = m4Var.h;
            AccessibilityManager accessibilityManager = m4Var.k;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    h4Var.r(true);
                    td0 td0Var = new td0();
                    ql0 root = h4Var.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    xz0 xz0Var = root.I;
                    c01 c01Var = xz0Var.d;
                    ue1 ue1Var = c01.U;
                    xz0Var.d.b1(c01.Y, c01Var.T0(jFloatToRawIntBits), td0Var, 1, true);
                    sx0 sx0Var = td0Var.e;
                    int i = sx0Var.b - 1;
                    while (true) {
                        if (-1 >= i) {
                            iU = Integer.MIN_VALUE;
                            break;
                        }
                        Object objF = sx0Var.f(i);
                        objF.getClass();
                        ql0 ql0VarP = bl.P((sv0) objF);
                        h4Var.getAndroidViewsHandler();
                        if (ql0VarP.I.d(8)) {
                            iU = m4Var.u(ql0VarP.f);
                            rl1 rl1VarD = pd1.d(ql0VarP, false);
                            if (nu0.z(rl1VarD)) {
                                if (!rl1VarD.k().e.c(vl1.B)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i--;
                    }
                    h4Var.getAndroidViewsHandler();
                    int i2 = m4Var.i;
                    if (i2 != iU) {
                        m4Var.i = iU;
                        m4.y(m4Var, iU, 128, null, 12);
                        m4.y(m4Var, i2, 256, null, 12);
                    }
                    if (iU != Integer.MIN_VALUE) {
                        z = true;
                    }
                } else {
                    if (action == 10) {
                        int i3 = m4Var.i;
                        if (i3 != Integer.MIN_VALUE) {
                            if (i3 != Integer.MIN_VALUE) {
                                m4Var.i = Integer.MIN_VALUE;
                                m4.y(m4Var, Integer.MIN_VALUE, 128, null, 12);
                                m4.y(m4Var, i3, 256, null, 12);
                            }
                            z = true;
                        } else {
                            h4Var.getAndroidViewsHandler();
                        }
                    }
                    z = false;
                }
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7) {
                }
            } else {
                z = false;
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7) {
                    if (actionMasked == 10 && n(motionEvent)) {
                        if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                            MotionEvent motionEvent2 = this.o0;
                            if (motionEvent2 != null) {
                                motionEvent2.recycle();
                            }
                            this.o0 = MotionEvent.obtainNoHistory(motionEvent);
                            this.y0 = true;
                            postDelayed(q3Var, 8L);
                            return z;
                        }
                        return z;
                    }
                    if ((i(motionEvent) & 1) != 0 || z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((m80) getFocusOwner()).d(keyEvent, new y3(i, this, keyEvent));
        }
        co0 co0Var = this.e.t;
        int metaState = keyEvent.getMetaState();
        co0Var.getClass();
        j72.a.setValue(new r81(metaState));
        return ((m80) getFocusOwner()).d(keyEvent, zp.n) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        xz0 xz0Var;
        if (isFocused()) {
            m80 m80Var = (m80) getFocusOwner();
            if (m80Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                w80 w80VarS = hk.s(m80Var.c);
                if (w80VarS != null) {
                    if (!w80VarS.e.r) {
                        ng0.b("visitAncestors called on an unattached node");
                    }
                    sv0 sv0Var = w80VarS.e;
                    ql0 ql0VarP = bl.P(w80VarS);
                    while (ql0VarP != null) {
                        if ((ql0VarP.I.f.h & 131072) != 0) {
                            while (sv0Var != null) {
                                if ((sv0Var.g & 131072) != 0) {
                                    sv0 sv0VarK = sv0Var;
                                    iy0 iy0Var = null;
                                    while (sv0VarK != null) {
                                        if ((sv0VarK.g & 131072) != 0 && (sv0VarK instanceof yw)) {
                                            int i = 0;
                                            for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                                if ((sv0Var2.g & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        sv0VarK = sv0Var2;
                                                    } else {
                                                        if (iy0Var == null) {
                                                            iy0Var = new iy0(new sv0[16]);
                                                        }
                                                        if (sv0VarK != null) {
                                                            iy0Var.b(sv0VarK);
                                                            sv0VarK = null;
                                                        }
                                                        iy0Var.b(sv0Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        sv0VarK = bl.k(iy0Var);
                                    }
                                }
                                sv0Var = sv0Var.i;
                            }
                        }
                        ql0VarP = ql0VarP.u();
                        sv0Var = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.F0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.F0 = false;
            x(viewStructure);
        } catch (Throwable th) {
            this.F0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            n4.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object aeVar;
        w80 w80VarF;
        if (this.y0) {
            q3 q3Var = this.x0;
            removeCallbacks(q3Var);
            MotionEvent motionEvent2 = this.o0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.y0 = false;
            } else {
                q3Var.run();
            }
        }
        if (!m(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int i = i(motionEvent);
            int i2 = 1;
            if ((i & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (aeVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    aeVar = new ae(i2);
                }
                if (aeVar.equals(new ae(i2)) && (w80VarF = ((m80) getFocusOwner()).f()) != null) {
                    c01 c01VarO = bl.O(w80VarF);
                    if (!al.w(c01VarO).I(c01VarO, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((m80) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((i & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        l91 l91Var = J0;
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return l91.p(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(l91Var, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        pc1 pc1VarA;
        if (view == null || this.R.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || viewFindNextFocus.equals(this)) {
            viewFindNextFocus = null;
        } else {
            for (ViewParent parent = viewFindNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            viewFindNextFocus = null;
        }
        if (view == this) {
            w80 w80VarS = hk.s(((m80) getFocusOwner()).c);
            pc1VarA = w80VarS != null ? hk.t(w80VarS) : null;
            if (pc1VarA == null) {
                pc1VarA = g80.a(view, this);
            }
        } else {
            pc1VarA = g80.a(view, this);
        }
        a80 a80VarC = g80.c(i);
        int i2 = a80VarC != null ? a80VarC.a : 6;
        zc1 zc1Var = new zc1();
        if (((m80) getFocusOwner()).e(i2, pc1VarA, new z3(0, zc1Var)) == null) {
            return view;
        }
        Object obj = zc1Var.e;
        if (obj != null) {
            if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || af1.t(hk.t((w80) obj), g80.a(viewFindNextFocus, this), pc1VarA, i2)) {
                return this;
            }
        } else if (viewFindNextFocus == null) {
            return super.focusSearch(view, i);
        }
        return viewFindNextFocus;
    }

    public a1 getAccessibilityManager() {
        return this.e.k;
    }

    public final c9 getAndroidViewsHandler() {
        return null;
    }

    public ge getAutofillTree() {
        return this.C;
    }

    public yk getClipboard() {
        return this.e.n;
    }

    public zk getClipboardManager() {
        return this.e.m;
    }

    public final ip getComposeViewContext() {
        return this.e;
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.E0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.I.getValue();
    }

    public final a5 getContentCaptureManager$ui() {
        return this.A;
    }

    public lt getCoroutineContext() {
        return this.q;
    }

    public hx getDensity() {
        return (hx) this.n.getValue();
    }

    public pc1 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            w80 w80VarS = hk.s(((m80) getFocusOwner()).c);
            if (w80VarS != null) {
                return hk.t(w80VarS);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return g80.a(viewFindFocus, this);
        }
        return null;
    }

    public j80 getFocusOwner() {
        return this.p;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        pc1 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (xi0.o(((m80) getFocusOwner()).e(6, null, a4.g), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public c90 getFontFamilyResolver() {
        return (c90) this.j0.getValue();
    }

    public b90 getFontLoader() {
        return this.e.o;
    }

    public final ap0 getFrameEndScheduler$ui() {
        return this.i;
    }

    public mc0 getGraphicsContext() {
        return this.B;
    }

    public id0 getHapticFeedBack() {
        return this.e.q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.R.b.s() || !this.l.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public bh0 getInputModeManager() {
        bh0 bh0Var = this.l0;
        if (bh0Var == null) {
            bh0Var = new bh0(isInTouchMode() ? 1 : 2);
            this.l0 = bh0Var;
        }
        return bh0Var;
    }

    public final z82 getInsetsWatcher() {
        return this.u;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.b0;
    }

    @Override // android.view.View, android.view.ViewParent
    public al0 getLayoutDirection() {
        return (al0) this.k0.getValue();
    }

    public as0 getLocaleList() {
        return (as0) this.J.getValue();
    }

    public long getMeasureIteration() {
        ru0 ru0Var = this.R;
        if (!ru0Var.c) {
            ng0.a("measureIteration should be only used during the measure/layout pass");
        }
        return ru0Var.g;
    }

    public uv0 getModifierLocalManager() {
        return this.m0;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public h4 m1915getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public y61 getPlacementScope() {
        int i = a71.b;
        return new xs0(1, this);
    }

    public final wa0 getPlayNavigationSoundEffect$ui() {
        return this.z0;
    }

    public k81 getPointerIconService() {
        return this.I0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final tf0 m1908getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.h;
    }

    public sc1 getRectManager() {
        return this.x;
    }

    public se1 getRetainedValuesStore() {
        return this.k;
    }

    public ql0 getRoot() {
        return this.v;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        y41 y41Var;
        if (Build.VERSION.SDK_INT < 31 || (y41Var = this.G0) == null) {
            return false;
        }
        return ((Boolean) ((v41) y41Var.f).getValue()).booleanValue();
    }

    public ul1 getSemanticsOwner() {
        return this.y;
    }

    public sl0 getSharedDrawScope() {
        return this.e.s;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? nb.a.a(this) : this.O;
    }

    public y31 getSnapshotObserver() {
        return this.N;
    }

    public rq1 getSoftwareKeyboardController() {
        zw zwVar = this.i0;
        if (zwVar != null) {
            return zwVar;
        }
        zw zwVar2 = new zw(getTextInputService());
        this.i0 = zwVar2;
        return zwVar2;
    }

    public gz1 getTextInputService() {
        gz1 gz1Var = this.g0;
        if (gz1Var != null) {
            return gz1Var;
        }
        gz1 gz1Var2 = new gz1(getLegacyTextInputServiceAndroid());
        this.g0 = gz1Var2;
        return gz1Var2;
    }

    public e02 getTextToolbar() {
        s8 s8Var = this.n0;
        if (s8Var != null) {
            return s8Var;
        }
        s8 s8Var2 = new s8();
        new t61(new a7(1, s8Var2));
        this.n0 = s8Var2;
        return s8Var2;
    }

    public final eg1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public j62 getViewConfiguration() {
        return this.e.r;
    }

    public i72 getWindowInfo() {
        return this.e.t;
    }

    public final void h(ql0 ql0Var, boolean z) {
        this.R.g(ql0Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016a A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018e A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:42:0x0090, B:43:0x0096, B:44:0x00a1, B:53:0x00b4, B:55:0x00ba, B:123:0x018e, B:124:0x019a, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:147:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b2 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:125:0x019e, B:129:0x01aa, B:131:0x01b2, B:133:0x01bc, B:132:0x01b5), top: B:152:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b5 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:125:0x019e, B:129:0x01aa, B:131:0x01b2, B:133:0x01bc, B:132:0x01b5), top: B:152:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011b A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:57:0x00c4, B:59:0x00ca, B:67:0x00db, B:72:0x00e8, B:73:0x00eb, B:75:0x00ef, B:77:0x00f5, B:79:0x00f9, B:81:0x00ff, B:84:0x0107, B:87:0x010f, B:88:0x011b, B:90:0x0121, B:92:0x0127, B:94:0x012d, B:96:0x0133, B:98:0x0137, B:99:0x013b, B:105:0x014e, B:107:0x0152, B:109:0x0159, B:116:0x016a, B:117:0x0174, B:119:0x017c, B:120:0x017f, B:121:0x0186), top: B:149:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        h4 h4Var;
        boolean z;
        MotionEvent motionEvent3;
        int iF;
        qd0 qd0Var;
        h4 h4Var2;
        int pointerId;
        int action;
        boolean z2;
        qd0 qd0Var2;
        h4 h4Var3 = this;
        h4Var3.removeCallbacks(h4Var3.w0);
        try {
            z(motionEvent);
            h4Var3.c0 = true;
            h4Var3.r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = h4Var3.o0;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                gk gkVar = h4Var3.H;
                if (motionEvent4 != null) {
                    try {
                        if ((motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                            if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                motionEvent2 = motionEvent4;
                                if (!gkVar.a) {
                                    qs0 qs0Var = (qs0) ((y41) gkVar.d).f;
                                    int i = qs0Var.h;
                                    Object[] objArr = qs0Var.g;
                                    for (int i2 = 0; i2 < i; i2++) {
                                        objArr[i2] = null;
                                    }
                                    qs0Var.h = 0;
                                    qs0Var.e = false;
                                    ((qd0) gkVar.c).c();
                                }
                            } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                h4Var3.G(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                motionEvent2 = motionEvent4;
                            }
                            if (motionEvent.getToolType(0) != 3) {
                            }
                            if (z3) {
                                h4Var = this;
                                if (actionMasked2 == 8) {
                                    if (motionEvent2 != null) {
                                    }
                                    motionEvent3 = h4Var.o0;
                                    if (motionEvent3 != null) {
                                        MotionEvent motionEvent5 = h4Var.o0;
                                        if (motionEvent5 == null) {
                                        }
                                        action = motionEvent.getAction();
                                        dw0 dw0Var = h4Var.G;
                                        if (action == 9) {
                                            if (motionEvent.getAction() == 0) {
                                                MotionEvent motionEvent6 = h4Var.o0;
                                                if (motionEvent6 == null) {
                                                }
                                                MotionEvent motionEvent7 = h4Var.o0;
                                                if (motionEvent7 != null) {
                                                }
                                                if (x == motionEvent.getX()) {
                                                    MotionEvent motionEvent8 = h4Var.o0;
                                                    if ((motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime()) {
                                                    }
                                                    if (!z2) {
                                                        if (pointerId >= 0) {
                                                        }
                                                        qd0Var2 = (qd0) gkVar.c;
                                                        if (qd0Var2.d) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    h4Var.o0 = MotionEvent.obtainNoHistory(motionEvent);
                                    if (z) {
                                    }
                                    iF = F(motionEvent);
                                    Trace.endSection();
                                    if ((iF & 4) == 0) {
                                        qd0Var = (qd0) gkVar.c;
                                        if (qd0Var.d) {
                                        }
                                        h4Var2 = this;
                                        h4Var2.G(motionEvent, 9, motionEvent.getEventTime(), true);
                                    }
                                    h4Var2.c0 = false;
                                    return iF;
                                }
                            }
                        } else {
                            motionEvent2 = motionEvent4;
                            boolean z4 = motionEvent.getToolType(0) != 3;
                            if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && n(motionEvent)) {
                                h4Var = this;
                                h4Var.G(motionEvent, 9, motionEvent.getEventTime(), true);
                            } else {
                                h4Var = this;
                            }
                            z = (actionMasked2 == 8 || (motionEvent.getButtonState() == 0) || motionEvent2 == null || motionEvent2.isFromSource(4098)) ? false : true;
                            if (motionEvent2 != null) {
                                motionEvent2.recycle();
                            }
                            motionEvent3 = h4Var.o0;
                            if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                MotionEvent motionEvent52 = h4Var.o0;
                                pointerId = motionEvent52 == null ? motionEvent52.getPointerId(0) : -1;
                                action = motionEvent.getAction();
                                dw0 dw0Var2 = h4Var.G;
                                if (action == 9 || motionEvent.getHistorySize() != 0) {
                                    if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                        MotionEvent motionEvent62 = h4Var.o0;
                                        float x = motionEvent62 == null ? motionEvent62.getX() : Float.NaN;
                                        MotionEvent motionEvent72 = h4Var.o0;
                                        z2 = x == motionEvent.getX() || (motionEvent72 != null ? motionEvent72.getY() : Float.NaN) != motionEvent.getY();
                                        MotionEvent motionEvent82 = h4Var.o0;
                                        boolean z5 = (motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime();
                                        if (!z2 || z5) {
                                            if (pointerId >= 0) {
                                                dw0Var2.c.delete(pointerId);
                                                dw0Var2.b.delete(pointerId);
                                            }
                                            qd0Var2 = (qd0) gkVar.c;
                                            if (qd0Var2.d) {
                                                qd0Var2.g.a.g();
                                            } else {
                                                qd0Var2.d = true;
                                            }
                                        }
                                    }
                                } else if (pointerId >= 0) {
                                    dw0Var2.c.delete(pointerId);
                                    dw0Var2.b.delete(pointerId);
                                }
                            }
                            h4Var.o0 = MotionEvent.obtainNoHistory(motionEvent);
                            if (z) {
                                h4Var.G(motionEvent, 10, motionEvent.getEventTime(), true);
                            }
                            iF = F(motionEvent);
                            try {
                                Trace.endSection();
                                if ((iF & 4) == 0 && z) {
                                    qd0Var = (qd0) gkVar.c;
                                    if (qd0Var.d) {
                                        qd0Var.g.a.g();
                                    } else {
                                        qd0Var.d = true;
                                    }
                                    h4Var2 = this;
                                    h4Var2.G(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    h4Var2 = this;
                                }
                                h4Var2.c0 = false;
                                return iF;
                            } catch (Throwable th) {
                                th = th;
                                h4Var3 = this;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Trace.endSection();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        h4Var3.c0 = false;
        throw th;
    }

    public final void k(ql0 ql0Var) {
        this.R.r(ql0Var, false);
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            k((ql0) objArr[i2]);
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.o0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        se1 se1Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().J()) {
            getRoot().d(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(l91.r());
        }
        this.u.onViewAttachedToWindow(this);
        if (!this.E0) {
            this.e.d();
        }
        int i = 0;
        this.E0 = false;
        k(getRoot());
        j(getRoot());
        getSnapshotObserver().a.d();
        h4 h4VarM1915getOutOfFrameExecutor = m1915getOutOfFrameExecutor();
        if (h4VarM1915getOutOfFrameExecutor == null) {
            yc.l("Expected the view to be attached to window.");
            return;
        }
        h4VarM1915getOutOfFrameExecutor.C(new x3(this, 3));
        this.e.c();
        ip ipVar = this.e;
        ipVar.f();
        t62 t62Var = ipVar.f;
        ap0 ap0Var = this.i;
        if (t62Var == null || ap0Var == null) {
            se1Var = null;
        } else {
            et0 et0VarE = ((bo) t62Var).e();
            s62 s62Var = new s62();
            bu buVar = bu.b;
            buVar.getClass();
            vu vuVar = new vu(et0VarE, s62Var, buVar);
            mk mkVarA = ad1.a(cp0.class);
            String strB = mkVarA.b();
            if (strB == null) {
                yc.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            cp0 cp0Var = (cp0) vuVar.h(mkVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            hx0 hx0Var = cp0Var.b;
            Object objB = hx0Var.b(id);
            if (objB == null) {
                objB = new sx0(1);
                hx0Var.i(id, objB);
            }
            sx0 sx0Var = (sx0) objB;
            Object[] objArr = sx0Var.a;
            int i2 = sx0Var.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((bp0) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            bp0 bp0Var = (bp0) obj;
            if (bp0Var == null) {
                bp0Var = new bp0();
                sx0Var.a(bp0Var);
            }
            bp0Var.c = true;
            this.j = bp0Var;
            se1Var = bp0Var.b;
        }
        if (se1Var == null) {
            se1Var = v20.L;
        }
        this.k = se1Var;
        sa0 sa0Var = this.e0;
        if (sa0Var != null) {
            sa0Var.i(this.e);
            this.e0 = null;
        }
        zo0 zo0VarG = this.e.c().g();
        zo0VarG.a(this);
        zo0VarG.a(this.A);
        getInputModeManager().a.setValue(new zg0(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            r4.a.b(this);
        }
        l3 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((m80) getFocusOwner()).g.a(autofillManager);
            getSemanticsOwner().d.a(autofillManager);
        }
        ((m80) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        om1 om1Var = (om1) this.h0.get();
        c7 c7Var = (c7) (om1Var != null ? om1Var.b : null);
        if (c7Var == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        om1 om1Var2 = (om1) c7Var.h.get();
        yg0 yg0Var = (yg0) (om1Var2 != null ? om1Var2.b : null);
        return yg0Var != null && (yg0Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        om1 om1Var = (om1) this.h0.get();
        c7 c7Var = (c7) (om1Var != null ? om1Var.b : null);
        if (c7Var != null) {
            om1 om1Var2 = (om1) c7Var.h.get();
            yg0 yg0Var = (yg0) (om1Var2 != null ? om1Var2.b : null);
            if (yg0Var == null) {
                return null;
            }
            synchronized (yg0Var.c) {
                if (yg0Var.e) {
                    return null;
                }
                mc1 mc1VarA = yg0Var.a.a(editorInfo);
                g3 g3Var = new g3(14, yg0Var);
                InputConnection q01Var = Build.VERSION.SDK_INT >= 34 ? new q01(mc1VarA, g3Var) : new p01(mc1VarA, g3Var);
                yg0Var.d.b(new f72(q01Var));
                return q01Var;
            }
        }
        jz1 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        df0 df0Var = legacyTextInputServiceAndroid.h;
        az1 az1Var = legacyTextInputServiceAndroid.g;
        int i2 = df0Var.e;
        boolean z = df0Var.a;
        if (i2 == 1) {
            i = z ? 6 : 0;
        } else if (i2 == 0) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 == 6) {
            i = 5;
        } else if (i2 == 5) {
            i = 7;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 == 4) {
            i = 4;
        } else {
            if (i2 != 7) {
                yc.l("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i3 = df0Var.d;
        int i4 = 17;
        if (i3 == 1) {
            editorInfo.inputType = 1;
        } else if (i3 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i;
        } else if (i3 == 3) {
            editorInfo.inputType = 2;
        } else if (i3 == 4) {
            editorInfo.inputType = 3;
        } else if (i3 == 5) {
            editorInfo.inputType = 17;
        } else if (i3 == 6) {
            editorInfo.inputType = 33;
        } else if (i3 == 7) {
            editorInfo.inputType = 129;
        } else if (i3 == 8) {
            editorInfo.inputType = 18;
        } else if (i3 == 9) {
            editorInfo.inputType = 8194;
        } else if (i3 == 10) {
            editorInfo.inputType = 145;
        } else if (i3 == 11) {
            editorInfo.inputType = 113;
        } else if (i3 == 12) {
            editorInfo.inputType = 97;
        } else if (i3 == 13) {
            editorInfo.inputType = 49;
        } else if (i3 == 14) {
            editorInfo.inputType = 65;
        } else if (i3 == 15) {
            editorInfo.inputType = 81;
        } else if (i3 == 16) {
            editorInfo.inputType = 177;
        } else if (i3 == 17) {
            editorInfo.inputType = 193;
        } else if (i3 == 18) {
            editorInfo.inputType = 4;
        } else if (i3 == 19) {
            editorInfo.inputType = 20;
        } else if (i3 == 20) {
            editorInfo.inputType = 36;
        } else if (i3 == 21) {
            editorInfo.inputType = 4098;
        } else if (i3 == 22) {
            editorInfo.inputType = 12290;
        } else if (i3 == 23) {
            editorInfo.inputType = 8210;
        } else if (i3 == 24) {
            editorInfo.inputType = 4114;
        } else {
            if (i3 != 25) {
                yc.l("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 12306;
        }
        if (!z) {
            int i5 = editorInfo.inputType;
            if ((i5 & 15) == 1) {
                editorInfo.inputType = i5 | 131072;
                if (i2 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 15) == 1) {
            int i7 = df0Var.b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | 4096;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | 8192;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (df0Var.c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = az1Var.b;
        int i8 = wz1.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        el.N(editorInfo, az1Var.a.f);
        editorInfo.imeOptions |= 33554432;
        if (g30.d()) {
            g30.a().i(editorInfo);
        }
        lc1 lc1Var = new lc1(legacyTextInputServiceAndroid.g, new y41(i4, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(lc1Var));
        return lc1Var;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        rl1 rl1Var;
        a5 a5Var = this.A;
        a5Var.getClass();
        for (long j : jArr) {
            tl1 tl1Var = (tl1) a5Var.f().b((int) j);
            if (tl1Var != null && (rl1Var = tl1Var.a) != null) {
                q4.s();
                ViewTranslationRequest.Builder builderO = q4.o(a5Var.e.getAutofillId(), rl1Var.f);
                Object objG = rl1Var.d.e.g(vl1.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builderO.setValue("android:text", TranslationRequestValue.forText(new hb(vq0.a(list, "\n", null, 62))));
                    consumer.accept(builderO.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.u.onViewDetachedFromWindow(this);
        View view = this.o;
        if (l() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            sx0 sx0Var = N0;
            synchronized (sx0Var) {
                sx0Var.j(this);
            }
        }
        this.e.b();
        qq1 qq1Var = getSnapshotObserver().a;
        i2 i2Var = qq1Var.h;
        if (i2Var != null) {
            i2Var.a();
        }
        qq1Var.a();
        zo0 zo0VarG = this.e.c().g();
        zo0VarG.f(this.A);
        zo0VarG.f(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        bp0 bp0Var = this.j;
        if (bp0Var != null) {
            bp0Var.c = false;
        }
        this.j = null;
        if (i >= 31) {
            r4.a.a(this);
        }
        l3 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.j(autofillManager);
            ((m80) getFocusOwner()).g.j(autofillManager);
        }
        sc1 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        sc1 rectManager2 = getRectManager();
        r3 r3Var = rectManager2.i;
        if (r3Var != null) {
            rectManager2.b.removeCallbacks(r3Var);
            rectManager2.i = null;
        }
        ((m80) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        m80 m80Var = (m80) getFocusOwner();
        bk.X(m80Var.c, true);
        if (m80Var.f() != null) {
            w80 w80VarF = m80Var.f();
            m80Var.i(null);
            if (w80VarF != null) {
                w80VarF.M0(v80.e, v80.g);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b0 = 0L;
        J();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        I(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.b0 = 0L;
            this.R.l(this.B0);
            this.P = null;
            J();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ru0 ru0Var = this.R;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().J()) {
                getRoot().d(this);
            }
            if (!isAttachedToWindow()) {
                k(getRoot());
            }
            long jG = g(i);
            long jG2 = g(i2);
            long jW = bl.w((int) (jG >>> 32), (int) (jG & 4294967295L), (int) (jG2 >>> 32), (int) (4294967295L & jG2));
            kr krVar = this.P;
            if (krVar == null) {
                this.P = new kr(jW);
                this.Q = false;
            } else if (!kr.b(krVar.a, jW)) {
                this.Q = true;
            }
            ru0Var.s(jW);
            ru0Var.n();
            setMeasuredDimension(getRoot().J.p.e, getRoot().J.p.f);
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.F0) {
            return;
        }
        x(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        j81 j81Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (j81Var = ((c4) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return j81Var instanceof d7 ? PointerIcon.getSystemIcon(context, ((d7) j81Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.g) {
            int[] iArr = g80.a;
            al0 al0Var = al0.e;
            al0 al0Var2 = i != 0 ? i != 1 ? null : al0.f : al0Var;
            if (al0Var2 != null) {
                al0Var = al0Var2;
            }
            setLayoutDirection(al0Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        y41 y41Var;
        if (Build.VERSION.SDK_INT < 31 || (y41Var = this.G0) == null) {
            return;
        }
        ul1 semanticsOwner = getSemanticsOwner();
        lt coroutineContext = getCoroutineContext();
        iy0 iy0Var = new iy0(new yi1[16]);
        uc1.F(semanticsOwner.a(), 0, new xi1(1, 8, iy0.class, iy0Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(iy0Var.e, 0, iy0Var.g, new kn(0, new sa0[]{zz0.t, zz0.u}));
        int i = iy0Var.g;
        yi1 yi1Var = (yi1) (i == 0 ? null : iy0Var.e[i - 1]);
        if (yi1Var == null) {
            return;
        }
        sh0 sh0Var = yi1Var.c;
        yo yoVar = new yo(yi1Var.a, sh0Var, bl.d(coroutineContext), y41Var, this);
        c01 c01Var = yi1Var.d;
        pc1 pc1VarI = al.w(c01Var).I(c01Var, true);
        long j = (((long) sh0Var.a) << 32) | (((long) sh0Var.b) & 4294967295L);
        ScrollCaptureTarget scrollCaptureTargetJ = q4.j(this, el.Q(lk.e0(pc1VarI)), new Point((int) (j >> 32), (int) (j & 4294967295L)), yoVar);
        scrollCaptureTargetJ.setScrollBounds(el.Q(sh0Var));
        consumer.accept(scrollCaptureTargetJ);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        J();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new zg0(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        a5 a5Var = this.A;
        a5Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (xi0.o(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            wi0.w(a5Var, longSparseArray);
        } else {
            a5Var.e.post(new y4(0, a5Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zR;
        this.D0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zR = l91.r())) {
            return;
        }
        setShowLayoutBounds(zR);
        j(getRoot());
    }

    public final void p(float[] fArr) {
        y();
        ou0.h(fArr, this.W);
        u4.c(fArr, Float.intBitsToFloat((int) (this.d0 >> 32)), Float.intBitsToFloat((int) (this.d0 & 4294967295L)), this.U);
    }

    public final long q(long j) {
        y();
        long jB = ou0.b(j, this.W);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.d0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.d0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void r(boolean z) {
        ru0 ru0Var = this.R;
        if (ru0Var.b.s() || ((iy0) ru0Var.e.f).g != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (ru0Var.l(z ? this.B0 : this.C0)) {
                    requestLayout();
                }
                ru0Var.b(false);
                getRectManager().a();
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            a80 a80VarC = g80.c(i);
            int i3 = a80VarC != null ? a80VarC.a : 7;
            Boolean boolE = ((m80) getFocusOwner()).e(i3, rect != null ? new pc1(rect.left, rect.top, rect.right, rect.bottom) : null, new d4(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!xi0.o(boolE, bool)) {
                if (!xi0.o(((m80) getFocusOwner()).e(i3, null, new d4(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((m80) getFocusOwner()).h(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(ql0 ql0Var, long j) {
        ru0 ru0Var = this.R;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ru0Var.m(ql0Var, j);
            if (!ru0Var.b.s()) {
                ru0Var.b(false);
                getRectManager().a();
                this.C0.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.z.l = j;
    }

    public final void setComposeViewContext(ip ipVar) {
        ip ipVar2 = this.e;
        if (ipVar == ipVar2) {
            return;
        }
        if (isAttachedToWindow()) {
            ipVar2.b();
            ipVar.d();
        }
        this.e = ipVar;
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.E0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.I.setValue(configuration);
    }

    public void setCoroutineContext(lt ltVar) {
        this.q = ltVar;
    }

    public final void setFrameEndScheduler$ui(ap0 ap0Var) {
        this.i = ap0Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.b0 = j;
    }

    public final void setOnReadyForComposition(sa0 sa0Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.E0) {
            sa0Var.i(this.e);
        } else {
            this.e0 = sa0Var;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(wa0 wa0Var) {
        this.z0 = wa0Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m1909setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(tf0 tf0Var) {
        this.h = tf0Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.O = z;
    }

    public void setUncaughtExceptionHandler(eg1 eg1Var) {
        this.R.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(ql0 ql0Var) {
        m4 m4Var = this.z;
        m4Var.C = true;
        if (m4Var.p()) {
            m4Var.q(ql0Var);
        }
        a5 a5Var = this.A;
        a5Var.k = true;
        a5Var.h();
    }

    public final void u(ql0 ql0Var, boolean z, boolean z2, boolean z3) {
        ql0 ql0VarU;
        ql0 ql0VarU2;
        ru0 ru0Var = this.R;
        if (!z) {
            if (ru0Var.r(ql0Var, z2) && z3) {
                D(ql0Var);
                return;
            }
            return;
        }
        oc ocVar = ru0Var.b;
        ql0 ql0Var2 = ql0Var.l;
        ul0 ul0Var = ql0Var.J;
        if (ql0Var2 == null) {
            ng0.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = ul0Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    ez1.a();
                    return;
                }
                if (!ul0Var.e || z2) {
                    ul0Var.e = true;
                    ul0Var.p.y = true;
                    if (ql0Var.R) {
                        return;
                    }
                    if ((xi0.o(ql0Var.L(), Boolean.TRUE) || ru0.i(ql0Var)) && ((ql0VarU = ql0Var.u()) == null || !ql0VarU.J.e)) {
                        ocVar.c(ql0Var, gj0.e);
                    } else if ((ql0Var.K() || ru0.j(ql0Var)) && ((ql0VarU2 = ql0Var.u()) == null || !ql0VarU2.q())) {
                        ocVar.c(ql0Var, gj0.g);
                    }
                    if (ru0Var.d || !z3) {
                        return;
                    }
                    D(ql0Var);
                    return;
                }
                return;
            }
        }
        ru0Var.h.b(new qu0(ql0Var, true, z2));
    }

    public final void v(ql0 ql0Var, boolean z, boolean z2) {
        ul0 ul0Var = ql0Var.J;
        gj0 gj0Var = gj0.h;
        ru0 ru0Var = this.R;
        if (!z) {
            ru0Var.getClass();
            int iOrdinal = ul0Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                ez1.a();
                return;
            }
            ql0 ql0VarU = ql0Var.u();
            boolean z3 = ql0VarU == null || ql0VarU.K();
            if (!z2) {
                if (ql0Var.q()) {
                    return;
                }
                if (ql0Var.p() && ql0Var.K() == z3 && ql0Var.K() == ul0Var.p.x) {
                    return;
                }
            }
            tu0 tu0Var = ul0Var.p;
            tu0Var.z = true;
            tu0Var.A = true;
            if (!ql0Var.R && tu0Var.x && z3) {
                if ((ql0VarU == null || !ql0VarU.p()) && (ql0VarU == null || !ql0VarU.q())) {
                    ru0Var.b.c(ql0Var, gj0Var);
                }
                if (ru0Var.d) {
                    return;
                }
                D(null);
                return;
            }
            return;
        }
        oc ocVar = ru0Var.b;
        int iOrdinal2 = ul0Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    ez1.a();
                    return;
                }
            }
        }
        if ((ul0Var.e || ul0Var.f) && !z2) {
            return;
        }
        ul0Var.f = true;
        ul0Var.g = true;
        tu0 tu0Var2 = ul0Var.p;
        tu0Var2.z = true;
        tu0Var2.A = true;
        if (ql0Var.R) {
            return;
        }
        ql0 ql0VarU2 = ql0Var.u();
        if (xi0.o(ql0Var.L(), Boolean.TRUE) && ((ql0VarU2 == null || !ql0VarU2.J.e) && (ql0VarU2 == null || !ql0VarU2.J.f))) {
            ocVar.c(ql0Var, gj0.f);
        } else if (ql0Var.K() && ((ql0VarU2 == null || !ql0VarU2.p()) && (ql0VarU2 == null || !ql0VarU2.q()))) {
            ocVar.c(ql0Var, gj0Var);
        }
        if (ru0Var.d) {
            return;
        }
        D(null);
    }

    public final void w() {
        m4 m4Var = this.z;
        m4Var.C = true;
        Handler handler = m4Var.h.getHandler();
        if (handler != null && m4Var.p() && !m4Var.N) {
            m4Var.N = true;
            handler.post(m4Var.Q);
        }
        a5 a5Var = this.A;
        a5Var.k = true;
        a5Var.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(ViewStructure viewStructure) {
        l3 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ql0 ql0Var = autofillManager.f.a;
            AutofillId autofillId = autofillManager.k;
            String str = autofillManager.i;
            sc1 sc1Var = autofillManager.h;
            el.K(viewStructure, ql0Var, autofillId, str, sc1Var);
            Object[] objArr = s01.a;
            sx0 sx0Var = new sx0(2);
            sx0Var.a(ql0Var);
            sx0Var.a(viewStructure);
            while (sx0Var.i()) {
                Object objK = sx0Var.k(sx0Var.b - 1);
                objK.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objK;
                Object objK2 = sx0Var.k(sx0Var.b - 1);
                objK2.getClass();
                qx0 qx0Var = (qx0) ((ql0) objK2).n();
                int i = ((iy0) qx0Var.f).g;
                for (int i2 = 0; i2 < i; i2++) {
                    ql0 ql0Var2 = (ql0) qx0Var.get(i2);
                    if (!ql0Var2.R && ql0Var2.J() && ql0Var2.K()) {
                        nl1 nl1VarW = ql0Var2.w();
                        if (nl1VarW != null) {
                            zx0 zx0Var = nl1VarW.e;
                            if (zx0Var.b(ml1.g) || zx0Var.b(ml1.h) || zx0Var.b(vl1.r) || zx0Var.b(vl1.s) || (Build.VERSION.SDK_INT >= 34 && zx0Var.b(wl1.c))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                el.K(viewStructureNewChild, ql0Var2, autofillId, str, sc1Var);
                                sx0Var.a(ql0Var2);
                                sx0Var.a(viewStructureNewChild);
                            } else {
                                sx0Var.a(ql0Var2);
                                sx0Var.a(viewStructure2);
                            }
                        }
                    }
                }
            }
        }
        k3 autofill = getAutofill();
        if (autofill != null) {
            ge geVar = autofill.b;
            LinkedHashMap linkedHashMap = geVar.a;
            LinkedHashMap linkedHashMap2 = geVar.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    yc.d();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId(autofill.c, iIntValue);
                viewStructureNewChild2.setId(iIntValue, autofill.a.getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    public final void y() {
        if (this.c0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.b0) {
            this.b0 = jCurrentAnimationTimeMillis;
            A();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.T;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.d0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void z(MotionEvent motionEvent) {
        this.b0 = AnimationUtils.currentAnimationTimeMillis();
        A();
        float x = motionEvent.getX();
        long jB = ou0.b((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.W);
        this.d0 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
    }

    public k3 getAutofill() {
        return this.K;
    }

    public l3 getAutofillManager() {
        return this.L;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public r5 m1912getDragAndDropManager() {
        return this.r;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public hx0 m1914getLayoutNodes() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @mx
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m1907getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @mx
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public fg1 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setAndroidViewsHandler(c9 c9Var) {
    }

    public final void setUncaughtExceptionHandler$ui(eg1 eg1Var) {
    }
}
