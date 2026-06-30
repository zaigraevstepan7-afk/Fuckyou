package p042W;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import p023M0.RunnableC0191D;
import p024N.AbstractC0240S;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: W.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0404e {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC0403d f1090v = new InterpolatorC0403d(0);

    /* JADX INFO: renamed from: a */
    public int f1091a;

    /* JADX INFO: renamed from: b */
    public final int f1092b;

    /* JADX INFO: renamed from: d */
    public float[] f1094d;

    /* JADX INFO: renamed from: e */
    public float[] f1095e;

    /* JADX INFO: renamed from: f */
    public float[] f1096f;

    /* JADX INFO: renamed from: g */
    public float[] f1097g;

    /* JADX INFO: renamed from: h */
    public int[] f1098h;

    /* JADX INFO: renamed from: i */
    public int[] f1099i;

    /* JADX INFO: renamed from: j */
    public int[] f1100j;

    /* JADX INFO: renamed from: k */
    public int f1101k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f1102l;

    /* JADX INFO: renamed from: m */
    public final float f1103m;

    /* JADX INFO: renamed from: n */
    public final float f1104n;

    /* JADX INFO: renamed from: o */
    public final int f1105o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f1106p;

    /* JADX INFO: renamed from: q */
    public final AbstractC0383m f1107q;

    /* JADX INFO: renamed from: r */
    public View f1108r;

    /* JADX INFO: renamed from: s */
    public boolean f1109s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f1110t;

    /* JADX INFO: renamed from: c */
    public int f1093c = -1;

    /* JADX INFO: renamed from: u */
    public final RunnableC0191D f1111u = new RunnableC0191D(2, this);

    public C0404e(Context context, CoordinatorLayout coordinatorLayout, AbstractC0383m abstractC0383m) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0383m == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1110t = coordinatorLayout;
        this.f1107q = abstractC0383m;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1105o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1092b = viewConfiguration.getScaledTouchSlop();
        this.f1103m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1104n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1106p = new OverScroller(context, f1090v);
    }

    /* JADX INFO: renamed from: a */
    public final void m1115a() {
        this.f1093c = -1;
        float[] fArr = this.f1094d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1095e, 0.0f);
            Arrays.fill(this.f1096f, 0.0f);
            Arrays.fill(this.f1097g, 0.0f);
            Arrays.fill(this.f1098h, 0);
            Arrays.fill(this.f1099i, 0);
            Arrays.fill(this.f1100j, 0);
            this.f1101k = 0;
        }
        VelocityTracker velocityTracker = this.f1102l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1102l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1116b(View view, int i2) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f1110t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f1108r = view;
        this.f1093c = i2;
        this.f1107q.mo1066Q(view, i2);
        m1128n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[RETURN] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1117c(View view, float f, float f2) {
        if (view != null) {
            AbstractC0383m abstractC0383m = this.f1107q;
            boolean z2 = abstractC0383m.mo546C(view) > 0;
            boolean z3 = abstractC0383m.mo547D() > 0;
            if (z2 && z3) {
                float f3 = (f2 * f2) + (f * f);
                int i2 = this.f1092b;
                if (f3 > i2 * i2) {
                }
            } else if (!z2 ? !(!z3 || Math.abs(f2) <= this.f1092b) : Math.abs(f) > this.f1092b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m1118d(int i2) {
        float[] fArr = this.f1094d;
        if (fArr != null) {
            int i3 = this.f1101k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f1095e[i2] = 0.0f;
                this.f1096f[i2] = 0.0f;
                this.f1097g[i2] = 0.0f;
                this.f1098h[i2] = 0;
                this.f1099i[i2] = 0;
                this.f1100j[i2] = 0;
                this.f1101k = (~i4) & i3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m1119e(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f1110t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1120f() {
        if (this.f1091a == 2) {
            OverScroller overScroller = this.f1106p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1108r.getLeft();
            int top = currY - this.f1108r.getTop();
            if (left != 0) {
                AbstractC0240S.m779j(this.f1108r, left);
            }
            if (top != 0) {
                AbstractC0240S.m780k(this.f1108r, top);
            }
            if (left != 0 || top != 0) {
                this.f1107q.mo549S(this.f1108r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f1110t.post(this.f1111u);
            }
        }
        return this.f1091a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m1121g(int i2, int i3) {
        CoordinatorLayout coordinatorLayout = this.f1110t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1107q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1122h(int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f1108r.getLeft();
        int top = this.f1108r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        OverScroller overScroller = this.f1106p;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            m1128n(0);
            return false;
        }
        View view = this.f1108r;
        int i8 = (int) this.f1104n;
        int i9 = (int) this.f1103m;
        int iAbs = Math.abs(i4);
        if (iAbs < i8) {
            i4 = 0;
        } else if (iAbs > i9) {
            i4 = i4 > 0 ? i9 : -i9;
        }
        int iAbs2 = Math.abs(i5);
        if (iAbs2 < i8) {
            i5 = 0;
        } else if (iAbs2 > i9) {
            i5 = i5 > 0 ? i9 : -i9;
        }
        int iAbs3 = Math.abs(i6);
        int iAbs4 = Math.abs(i7);
        int iAbs5 = Math.abs(i4);
        int iAbs6 = Math.abs(i5);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i4 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i5 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        AbstractC0383m abstractC0383m = this.f1107q;
        overScroller.startScroll(left, top, i6, i7, (int) ((m1119e(i7, i5, abstractC0383m.mo547D()) * f6) + (m1119e(i6, i4, abstractC0383m.mo546C(view)) * f5)));
        m1128n(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1123i(int i2) {
        if ((this.f1101k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m1124j(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1115a();
        }
        if (this.f1102l == null) {
            this.f1102l = VelocityTracker.obtain();
        }
        this.f1102l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM1121g = m1121g((int) x2, (int) y2);
            m1126l(x2, y2, pointerId);
            m1131q(viewM1121g, pointerId);
            int i4 = this.f1098h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f1091a == 1) {
                m1125k();
            }
            m1115a();
            return;
        }
        AbstractC0383m abstractC0383m = this.f1107q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f1091a == 1) {
                    this.f1109s = true;
                    abstractC0383m.mo550T(this.f1108r, 0.0f, 0.0f);
                    this.f1109s = false;
                    if (this.f1091a == 1) {
                        m1128n(0);
                    }
                }
                m1115a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m1126l(x3, y3, pointerId2);
                if (this.f1091a == 0) {
                    m1131q(m1121g((int) x3, (int) y3), pointerId2);
                    int i5 = this.f1098h[pointerId2];
                    return;
                }
                int i6 = (int) x3;
                int i7 = (int) y3;
                View view = this.f1108r;
                if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    m1131q(this.f1108r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f1091a == 1 && pointerId3 == this.f1093c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i3 >= pointerCount) {
                        i2 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i3);
                    if (pointerId4 != this.f1093c) {
                        View viewM1121g2 = m1121g((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                        View view2 = this.f1108r;
                        if (viewM1121g2 == view2 && m1131q(view2, pointerId4)) {
                            i2 = this.f1093c;
                            break;
                        }
                    }
                    i3++;
                }
                if (i2 == -1) {
                    m1125k();
                }
            }
            m1118d(pointerId3);
            return;
        }
        if (this.f1091a == 1) {
            if (m1123i(this.f1093c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1093c);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f1096f;
                int i8 = this.f1093c;
                int i9 = (int) (x4 - fArr[i8]);
                int i10 = (int) (y4 - this.f1097g[i8]);
                int left = this.f1108r.getLeft() + i9;
                int top = this.f1108r.getTop() + i10;
                int left2 = this.f1108r.getLeft();
                int top2 = this.f1108r.getTop();
                if (i9 != 0) {
                    left = abstractC0383m.mo551l(this.f1108r, left);
                    AbstractC0240S.m779j(this.f1108r, left - left2);
                }
                if (i10 != 0) {
                    top = abstractC0383m.mo552m(this.f1108r, top);
                    AbstractC0240S.m780k(this.f1108r, top - top2);
                }
                if (i9 != 0 || i10 != 0) {
                    abstractC0383m.mo549S(this.f1108r, left, top);
                }
                m1127m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i3 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i3);
            if (m1123i(pointerId5)) {
                float x5 = motionEvent.getX(i3);
                float y5 = motionEvent.getY(i3);
                float f = x5 - this.f1094d[pointerId5];
                float f2 = y5 - this.f1095e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i11 = this.f1098h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i12 = this.f1098h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i13 = this.f1098h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i14 = this.f1098h[pointerId5];
                if (this.f1091a != 1) {
                    View viewM1121g3 = m1121g((int) x5, (int) y5);
                    if (m1117c(viewM1121g3, f, f2) && m1131q(viewM1121g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i3++;
        }
        m1127m(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    public final void m1125k() {
        VelocityTracker velocityTracker = this.f1102l;
        float f = this.f1103m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f1102l.getXVelocity(this.f1093c);
        float f2 = this.f1104n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f1102l.getYVelocity(this.f1093c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f1109s = true;
        this.f1107q.mo550T(this.f1108r, xVelocity, f);
        this.f1109s = false;
        if (this.f1091a == 1) {
            m1128n(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1126l(float f, float f2, int i2) {
        float[] fArr = this.f1094d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1095e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1096f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1097g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1098h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1099i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1100j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1094d = fArr2;
            this.f1095e = fArr3;
            this.f1096f = fArr4;
            this.f1097g = fArr5;
            this.f1098h = iArr;
            this.f1099i = iArr2;
            this.f1100j = iArr3;
        }
        float[] fArr9 = this.f1094d;
        this.f1096f[i2] = f;
        fArr9[i2] = f;
        float[] fArr10 = this.f1095e;
        this.f1097g[i2] = f2;
        fArr10[i2] = f2;
        int[] iArr7 = this.f1098h;
        int i4 = (int) f;
        int i5 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f1110t;
        int left = coordinatorLayout.getLeft();
        int i6 = this.f1105o;
        int i7 = i4 < left + i6 ? 1 : 0;
        if (i5 < coordinatorLayout.getTop() + i6) {
            i7 |= 4;
        }
        if (i4 > coordinatorLayout.getRight() - i6) {
            i7 |= 2;
        }
        if (i5 > coordinatorLayout.getBottom() - i6) {
            i7 |= 8;
        }
        iArr7[i2] = i7;
        this.f1101k |= 1 << i2;
    }

    /* JADX INFO: renamed from: m */
    public final void m1127m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m1123i(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f1096f[pointerId] = x2;
                this.f1097g[pointerId] = y2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1128n(int i2) {
        this.f1110t.removeCallbacks(this.f1111u);
        if (this.f1091a != i2) {
            this.f1091a = i2;
            this.f1107q.mo548R(i2);
            if (this.f1091a == 0) {
                this.f1108r = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1129o(int i2, int i3) {
        if (this.f1109s) {
            return m1122h(i2, i3, (int) this.f1102l.getXVelocity(this.f1093c), (int) this.f1102l.getYVelocity(this.f1093c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1130p(MotionEvent motionEvent) {
        View viewM1121g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1115a();
        }
        if (this.f1102l == null) {
            this.f1102l = VelocityTracker.obtain();
        }
        this.f1102l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m1126l(x2, y2, pointerId);
            View viewM1121g2 = m1121g((int) x2, (int) y2);
            if (viewM1121g2 == this.f1108r && this.f1091a == 2) {
                m1131q(viewM1121g2, pointerId);
            }
            int i2 = this.f1098h[pointerId];
        } else if (actionMasked == 1) {
            m1115a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x3 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    m1126l(x3, y3, pointerId2);
                    int i3 = this.f1091a;
                    if (i3 == 0) {
                        int i4 = this.f1098h[pointerId2];
                    } else if (i3 == 2 && (viewM1121g = m1121g((int) x3, (int) y3)) == this.f1108r) {
                        m1131q(viewM1121g, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    m1118d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f1094d != null && this.f1095e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i5 = 0; i5 < pointerCount; i5++) {
                int pointerId3 = motionEvent.getPointerId(i5);
                if (m1123i(pointerId3)) {
                    float x4 = motionEvent.getX(i5);
                    float y4 = motionEvent.getY(i5);
                    float f = x4 - this.f1094d[pointerId3];
                    float f2 = y4 - this.f1095e[pointerId3];
                    View viewM1121g3 = m1121g((int) x4, (int) y4);
                    boolean z2 = viewM1121g3 != null && m1117c(viewM1121g3, f, f2);
                    if (z2) {
                        int left = viewM1121g3.getLeft();
                        AbstractC0383m abstractC0383m = this.f1107q;
                        int iMo551l = abstractC0383m.mo551l(viewM1121g3, ((int) f) + left);
                        int top = viewM1121g3.getTop();
                        int iMo552m = abstractC0383m.mo552m(viewM1121g3, ((int) f2) + top);
                        int iMo546C = abstractC0383m.mo546C(viewM1121g3);
                        int iMo547D = abstractC0383m.mo547D();
                        if ((iMo546C == 0 || (iMo546C > 0 && iMo551l == left)) && (iMo547D == 0 || (iMo547D > 0 && iMo552m == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i6 = this.f1098h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i7 = this.f1098h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i8 = this.f1098h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i9 = this.f1098h[pointerId3];
                        if (this.f1091a == 1 || (z2 && m1131q(viewM1121g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m1127m(motionEvent);
        }
        return this.f1091a == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1131q(View view, int i2) {
        if (view == this.f1108r && this.f1093c == i2) {
            return true;
        }
        if (view == null || !this.f1107q.mo553m0(view, i2)) {
            return false;
        }
        this.f1093c = i2;
        m1116b(view, i2);
        return true;
    }
}
