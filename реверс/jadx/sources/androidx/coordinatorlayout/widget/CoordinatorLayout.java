package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p000A.AbstractC0002c;
import p000A.AbstractC0011l;
import p000A.C0001b;
import p000A.C0005f;
import p000A.C0008i;
import p000A.C0009j;
import p000A.C0010k;
import p000A.InterfaceC0003d;
import p000A.ViewGroupOnHierarchyChangeListenerC0004e;
import p000A.ViewTreeObserverOnPreDrawListenerC0006g;
import p001A0.AbstractC0016e;
import p006D.AbstractC0051a;
import p022M.C0186c;
import p022M.C0187d;
import p024N.AbstractC0227E;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.C0280q;
import p024N.C0295x0;
import p024N.InterfaceC0276o;
import p024N.InterfaceC0278p;
import p084q.C1031j;
import p100z.AbstractC1118a;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0276o, InterfaceC0278p {

    /* JADX INFO: renamed from: t */
    public static final String f1435t;

    /* JADX INFO: renamed from: u */
    public static final Class[] f1436u;

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f1437v;

    /* JADX INFO: renamed from: w */
    public static final C0009j f1438w;

    /* JADX INFO: renamed from: x */
    public static final C0187d f1439x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1440a;

    /* JADX INFO: renamed from: b */
    public final C0010k f1441b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1442c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f1443d;

    /* JADX INFO: renamed from: e */
    public final int[] f1444e;

    /* JADX INFO: renamed from: f */
    public final int[] f1445f;

    /* JADX INFO: renamed from: g */
    public boolean f1446g;

    /* JADX INFO: renamed from: h */
    public boolean f1447h;

    /* JADX INFO: renamed from: i */
    public final int[] f1448i;

    /* JADX INFO: renamed from: j */
    public View f1449j;

    /* JADX INFO: renamed from: k */
    public View f1450k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC0006g f1451l;

    /* JADX INFO: renamed from: m */
    public boolean f1452m;

    /* JADX INFO: renamed from: n */
    public C0295x0 f1453n;

    /* JADX INFO: renamed from: o */
    public boolean f1454o;

    /* JADX INFO: renamed from: p */
    public Drawable f1455p;

    /* JADX INFO: renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f1456q;

    /* JADX INFO: renamed from: r */
    public C0001b f1457r;

    /* JADX INFO: renamed from: s */
    public final C0280q f1458s;

    static {
        Package r1 = CoordinatorLayout.class.getPackage();
        f1435t = r1 != null ? r1.getName() : null;
        f1438w = new C0009j(0);
        f1436u = new Class[]{Context.class, AttributeSet.class};
        f1437v = new ThreadLocal();
        f1439x = new C0187d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.resc);
        this.f1440a = new ArrayList();
        this.f1441b = new C0010k(0);
        this.f1442c = new ArrayList();
        this.f1443d = new ArrayList();
        this.f1444e = new int[2];
        this.f1445f = new int[2];
        this.f1458s = new C0280q();
        int[] iArr = AbstractC1118a.f4813a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.resc, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0000a.m20q(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1448i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1448i[i2] = (int) (r3[i2] * f);
            }
        }
        this.f1455p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m1265w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0004e(this));
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Rect m1249g() {
        Rect rect = (Rect) f1439x.mo622a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m1250l(int i2, Rect rect, Rect rect2, C0005f c0005f, int i3, int i4) {
        int i5 = c0005f.f5c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = c0005f.f6d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int iWidth = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    /* JADX INFO: renamed from: n */
    public static C0005f m1251n(View view) {
        C0005f c0005f = (C0005f) view.getLayoutParams();
        if (!c0005f.f4b) {
            InterfaceC0003d interfaceC0003d = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0003d = (InterfaceC0003d) superclass.getAnnotation(InterfaceC0003d.class);
                if (interfaceC0003d != null) {
                    break;
                }
            }
            if (interfaceC0003d != null) {
                try {
                    AbstractC0002c abstractC0002c = (AbstractC0002c) interfaceC0003d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC0002c abstractC0002c2 = c0005f.f3a;
                    if (abstractC0002c2 != abstractC0002c) {
                        if (abstractC0002c2 != null) {
                            abstractC0002c2.mo66e();
                        }
                        c0005f.f3a = abstractC0002c;
                        c0005f.f4b = true;
                        if (abstractC0002c != null) {
                            abstractC0002c.mo64c(c0005f);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0003d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            c0005f.f4b = true;
        }
        return c0005f;
    }

    /* JADX INFO: renamed from: u */
    public static void m1252u(View view, int i2) {
        C0005f c0005f = (C0005f) view.getLayoutParams();
        int i3 = c0005f.f11i;
        if (i3 != i2) {
            AbstractC0240S.m779j(view, i2 - i3);
            c0005f.f11i = i2;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m1253v(View view, int i2) {
        C0005f c0005f = (C0005f) view.getLayoutParams();
        int i3 = c0005f.f12j;
        if (i3 != i2) {
            AbstractC0240S.m780k(view, i2 - i3);
            c0005f.f12j = i2;
        }
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: a */
    public final void mo882a(View view, View view2, int i2, int i3) {
        C0280q c0280q = this.f1458s;
        if (i3 == 1) {
            c0280q.f858b = i2;
        } else {
            c0280q.f857a = i2;
        }
        this.f1450k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((C0005f) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // p024N.InterfaceC0278p
    /* JADX INFO: renamed from: b */
    public final void mo888b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        AbstractC0002c abstractC0002c;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                if (c0005f.m79a(i6) && (abstractC0002c = c0005f.f3a) != null) {
                    int[] iArr2 = this.f1444e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0002c.mo72k(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            m1260p(1);
        }
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: c */
    public final void mo883c(View view, int i2, int i3, int i4, int i5, int i6) {
        mo888b(view, i2, i3, i4, i5, 0, this.f1445f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0005f) && super.checkLayoutParams(layoutParams);
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: d */
    public final void mo884d(View view, int i2) {
        C0280q c0280q = this.f1458s;
        if (i2 == 1) {
            c0280q.f858b = 0;
        } else {
            c0280q.f857a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0005f c0005f = (C0005f) childAt.getLayoutParams();
            if (c0005f.m79a(i2)) {
                AbstractC0002c abstractC0002c = c0005f.f3a;
                if (abstractC0002c != null) {
                    abstractC0002c.mo77p(childAt, view, i2);
                }
                if (i2 == 0) {
                    c0005f.f15m = false;
                } else if (i2 == 1) {
                    c0005f.f16n = false;
                }
            }
        }
        this.f1450k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0002c abstractC0002c = ((C0005f) view.getLayoutParams()).f3a;
        if (abstractC0002c != null) {
            abstractC0002c.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1455p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: e */
    public final void mo885e(View view, int i2, int i3, int[] iArr, int i4) {
        AbstractC0002c abstractC0002c;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                if (c0005f.m79a(i4) && (abstractC0002c = c0005f.f3a) != null) {
                    int[] iArr2 = this.f1444e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0002c.mo71j(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            m1260p(1);
        }
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: f */
    public final boolean mo886f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                AbstractC0002c abstractC0002c = c0005f.f3a;
                if (abstractC0002c != null) {
                    boolean zMo76o = abstractC0002c.mo76o(childAt, i2, i3);
                    z2 |= zMo76o;
                    if (i3 == 0) {
                        c0005f.f15m = zMo76o;
                    } else if (i3 == 1) {
                        c0005f.f16n = zMo76o;
                    }
                } else if (i3 == 0) {
                    c0005f.f15m = false;
                } else if (i3 == 1) {
                    c0005f.f16n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0005f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0005f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m1263s();
        return Collections.unmodifiableList(this.f1440a);
    }

    public final C0295x0 getLastWindowInsets() {
        return this.f1453n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0280q c0280q = this.f1458s;
        return c0280q.f858b | c0280q.f857a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1455p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX INFO: renamed from: h */
    public final void m1254h(C0005f c0005f, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0005f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) c0005f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0005f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) c0005f).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    /* JADX INFO: renamed from: i */
    public final void m1255i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            m1257k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m1256j(View view) {
        C1031j c1031j = (C1031j) this.f1441b.f23b;
        int i2 = c1031j.f4104c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) c1031j.m2493i(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1031j.m2490f(i3));
            }
        }
        ArrayList arrayList3 = this.f1443d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m1257k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC0011l.f26a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC0011l.f26a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC0011l.m92a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC0011l.f27b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: m */
    public final int m1258m(int i2) {
        int[] iArr = this.f1448i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1259o(View view, int i2, int i3) {
        C0187d c0187d = f1439x;
        Rect rectM1249g = m1249g();
        m1257k(view, rectM1249g);
        try {
            return rectM1249g.contains(i2, i3);
        } finally {
            rectM1249g.setEmpty();
            c0187d.mo624c(rectM1249g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1264t(false);
        if (this.f1452m) {
            if (this.f1451l == null) {
                this.f1451l = new ViewTreeObserverOnPreDrawListenerC0006g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1451l);
        }
        if (this.f1453n == null) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            if (getFitsSystemWindows()) {
                AbstractC0227E.m698c(this);
            }
        }
        this.f1447h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1264t(false);
        if (this.f1452m && this.f1451l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1451l);
        }
        View view = this.f1450k;
        if (view != null) {
            mo884d(view, 0);
        }
        this.f1447h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1454o || this.f1455p == null) {
            return;
        }
        C0295x0 c0295x0 = this.f1453n;
        int iM924d = c0295x0 != null ? c0295x0.m924d() : 0;
        if (iM924d > 0) {
            this.f1455p.setBounds(0, 0, getWidth(), iM924d);
            this.f1455p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1264t(true);
        }
        boolean zM1262r = m1262r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM1262r;
        }
        m1264t(true);
        return zM1262r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        AbstractC0002c abstractC0002c;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1440a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((abstractC0002c = ((C0005f) view.getLayoutParams()).f3a) == null || !abstractC0002c.mo68g(this, view, layoutDirection))) {
                m1261q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC0002c abstractC0002c;
        int i8;
        View view;
        ArrayList arrayList;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m1263s();
        int childCount = coordinatorLayout.getChildCount();
        int i15 = 0;
        loop0: while (true) {
            if (i15 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i15);
            C1031j c1031j = (C1031j) coordinatorLayout.f1441b.f23b;
            int i16 = c1031j.f4104c;
            for (int i17 = 0; i17 < i16; i17++) {
                ArrayList arrayList2 = (ArrayList) c1031j.m2493i(i17);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i15++;
        }
        if (z2 != coordinatorLayout.f1452m) {
            if (z2) {
                if (coordinatorLayout.f1447h) {
                    if (coordinatorLayout.f1451l == null) {
                        coordinatorLayout.f1451l = new ViewTreeObserverOnPreDrawListenerC0006g(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f1451l);
                }
                coordinatorLayout.f1452m = true;
            } else {
                if (coordinatorLayout.f1447h && coordinatorLayout.f1451l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f1451l);
                }
                coordinatorLayout.f1452m = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i18 = paddingLeft + paddingRight;
        int i19 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.f1453n != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f1440a;
        int size3 = arrayList3.size();
        int i20 = 0;
        int iCombineMeasuredStates = 0;
        while (i20 < size3) {
            View view2 = (View) arrayList3.get(i20);
            int i21 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i7 = size3;
                i12 = paddingLeft;
                i10 = paddingRight;
                suggestedMinimumWidth = i21;
                i14 = i20;
            } else {
                C0005f c0005f = (C0005f) view2.getLayoutParams();
                int i22 = c0005f.f7e;
                if (i22 < 0 || mode == 0) {
                    i4 = suggestedMinimumHeight;
                } else {
                    int iM1258m = coordinatorLayout.m1258m(i22);
                    int i23 = c0005f.f5c;
                    if (i23 == 0) {
                        i23 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, layoutDirection) & 7;
                    i4 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iM1258m);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iM1258m - paddingLeft);
                    }
                    int i24 = size3;
                    i6 = iMax;
                    i5 = i24;
                    if (z4 || view2.getFitsSystemWindows()) {
                        i7 = i5;
                        iMakeMeasureSpec = i2;
                        iMakeMeasureSpec2 = i3;
                    } else {
                        i7 = i5;
                        int iM923c = coordinatorLayout.f1453n.m923c() + coordinatorLayout.f1453n.m922b();
                        int iM921a = coordinatorLayout.f1453n.m921a() + coordinatorLayout.f1453n.m924d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM923c, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM921a, mode2);
                    }
                    abstractC0002c = c0005f.f3a;
                    if (abstractC0002c == null) {
                        ArrayList arrayList4 = arrayList3;
                        int i25 = iMakeMeasureSpec;
                        arrayList = arrayList4;
                        i10 = paddingRight;
                        i11 = i4;
                        i12 = paddingLeft;
                        i13 = i21;
                        i14 = i20;
                        int i26 = iMakeMeasureSpec2;
                        boolean zMo69h = abstractC0002c.mo69h(this, view2, i25, i6, i26);
                        view = view2;
                        iMakeMeasureSpec = i25;
                        i9 = i6;
                        i8 = i26;
                        if (zMo69h) {
                            coordinatorLayout = this;
                        }
                        int iMax2 = Math.max(i13, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) c0005f).leftMargin + ((ViewGroup.MarginLayoutParams) c0005f).rightMargin);
                        int iMax3 = Math.max(i11, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) c0005f).topMargin + ((ViewGroup.MarginLayoutParams) c0005f).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax2;
                        suggestedMinimumHeight = iMax3;
                    } else {
                        int i27 = i6;
                        i8 = iMakeMeasureSpec2;
                        view = view2;
                        arrayList = arrayList3;
                        i9 = i27;
                        i10 = paddingRight;
                        i11 = i4;
                        i12 = paddingLeft;
                        i13 = i21;
                        i14 = i20;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i9, i8, 0);
                    int iMax22 = Math.max(i13, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) c0005f).leftMargin + ((ViewGroup.MarginLayoutParams) c0005f).rightMargin);
                    int iMax32 = Math.max(i11, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) c0005f).topMargin + ((ViewGroup.MarginLayoutParams) c0005f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax22;
                    suggestedMinimumHeight = iMax32;
                }
                i5 = size3;
                i6 = 0;
                if (z4) {
                    i7 = i5;
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i3;
                    abstractC0002c = c0005f.f3a;
                    if (abstractC0002c == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i9, i8, 0);
                    int iMax222 = Math.max(i13, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) c0005f).leftMargin + ((ViewGroup.MarginLayoutParams) c0005f).rightMargin);
                    int iMax322 = Math.max(i11, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) c0005f).topMargin + ((ViewGroup.MarginLayoutParams) c0005f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax222;
                    suggestedMinimumHeight = iMax322;
                }
            }
            i20 = i14 + 1;
            arrayList3 = arrayList;
            size3 = i7;
            paddingLeft = i12;
            paddingRight = i10;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i2, (-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(suggestedMinimumHeight, i3, iCombineMeasuredStates << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                if (c0005f.m79a(0)) {
                    AbstractC0002c abstractC0002c = c0005f.f3a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0002c abstractC0002c;
        int childCount = getChildCount();
        boolean zMo70i = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0005f c0005f = (C0005f) childAt.getLayoutParams();
                if (c0005f.m79a(0) && (abstractC0002c = c0005f.f3a) != null) {
                    zMo70i |= abstractC0002c.mo70i(view);
                }
            }
        }
        return zMo70i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        mo885e(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        mo883c(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo882a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0008i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0008i c0008i = (C0008i) parcelable;
        super.onRestoreInstanceState(c0008i.f1069a);
        SparseArray sparseArray = c0008i.f20c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC0002c abstractC0002c = m1251n(childAt).f3a;
            if (id != -1 && abstractC0002c != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0002c.mo74m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo75n;
        C0008i c0008i = new C0008i(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC0002c abstractC0002c = ((C0005f) childAt.getLayoutParams()).f3a;
            if (id != -1 && abstractC0002c != null && (parcelableMo75n = abstractC0002c.mo75n(childAt)) != null) {
                sparseArray.append(id, parcelableMo75n);
            }
        }
        c0008i.f20c = sparseArray;
        return c0008i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo886f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo884d(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1262r;
        boolean zMo78q;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1449j == null) {
            zM1262r = m1262r(motionEvent, 1);
            if (!zM1262r) {
                zMo78q = false;
            }
            motionEventObtain = null;
            if (this.f1449j != null) {
                zMo78q |= super.onTouchEvent(motionEvent);
            } else if (zM1262r) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo78q;
            }
            m1264t(false);
            return zMo78q;
        }
        zM1262r = false;
        AbstractC0002c abstractC0002c = ((C0005f) this.f1449j.getLayoutParams()).f3a;
        if (abstractC0002c != null) {
            zMo78q = abstractC0002c.mo78q(this.f1449j, motionEvent);
        }
        motionEventObtain = null;
        if (this.f1449j != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        m1264t(false);
        return zMo78q;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0047 A[EDGE_INSN: B:133:0x0047->B:10:0x0047 BREAK  A[LOOP:2: B:119:0x02a8->B:124:0x02bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1260p(int i2) {
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int width;
        int i6;
        int i7;
        int i8;
        int height;
        int i9;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        Rect rect3;
        Rect rect4;
        int i13;
        C0187d c0187d;
        int i14;
        AbstractC0002c abstractC0002c;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f1440a;
        int size = arrayList2.size();
        Rect rectM1249g = m1249g();
        Rect rectM1249g2 = m1249g();
        Rect rectM1249g3 = m1249g();
        int i15 = 0;
        while (true) {
            C0187d c0187d2 = f1439x;
            if (i15 >= size) {
                Rect rect5 = rectM1249g2;
                Rect rect6 = rectM1249g3;
                rectM1249g.setEmpty();
                c0187d2.mo624c(rectM1249g);
                rect5.setEmpty();
                c0187d2.mo624c(rect5);
                rect6.setEmpty();
                c0187d2.mo624c(rect6);
                return;
            }
            View view = (View) arrayList2.get(i15);
            C0005f c0005f = (C0005f) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                rect = rectM1249g2;
                rect2 = rectM1249g3;
                i3 = i15;
                i5 = size;
            } else {
                int i16 = 0;
                while (i16 < i15) {
                    if (c0005f.f14l == ((View) arrayList2.get(i16))) {
                        C0005f c0005f2 = (C0005f) view.getLayoutParams();
                        if (c0005f2.f13k != null) {
                            rect3 = rectM1249g2;
                            Rect rectM1249g4 = m1249g();
                            Rect rectM1249g5 = m1249g();
                            Rect rect7 = rectM1249g3;
                            Rect rectM1249g6 = m1249g();
                            i12 = i16;
                            m1257k(c0005f2.f13k, rectM1249g4);
                            m1255i(view, rectM1249g5, false);
                            i13 = i15;
                            int measuredWidth = view.getMeasuredWidth();
                            C0187d c0187d3 = c0187d2;
                            int measuredHeight = view.getMeasuredHeight();
                            c0187d = c0187d3;
                            arrayList = arrayList2;
                            m1250l(layoutDirection, rectM1249g4, rectM1249g6, c0005f2, measuredWidth, measuredHeight);
                            i14 = size;
                            rect4 = rect7;
                            boolean z4 = (rectM1249g6.left == rectM1249g5.left && rectM1249g6.top == rectM1249g5.top) ? false : true;
                            m1254h(c0005f2, rectM1249g6, measuredWidth, measuredHeight);
                            int i17 = rectM1249g6.left - rectM1249g5.left;
                            int i18 = rectM1249g6.top - rectM1249g5.top;
                            if (i17 != 0) {
                                AbstractC0240S.m779j(view, i17);
                            }
                            if (i18 != 0) {
                                AbstractC0240S.m780k(view, i18);
                            }
                            if (z4 && (abstractC0002c = c0005f2.f3a) != null) {
                                abstractC0002c.mo65d(this, view, c0005f2.f13k);
                            }
                            rectM1249g4.setEmpty();
                            c0187d.mo624c(rectM1249g4);
                            rectM1249g5.setEmpty();
                            c0187d.mo624c(rectM1249g5);
                            rectM1249g6.setEmpty();
                            c0187d.mo624c(rectM1249g6);
                        } else {
                            i12 = i16;
                            arrayList = arrayList2;
                            rect3 = rectM1249g2;
                            rect4 = rectM1249g3;
                            i13 = i15;
                            c0187d = c0187d2;
                            i14 = size;
                        }
                    }
                    c0187d2 = c0187d;
                    i16 = i12 + 1;
                    rectM1249g2 = rect3;
                    i15 = i13;
                    arrayList2 = arrayList;
                    size = i14;
                    rectM1249g3 = rect4;
                }
                ArrayList arrayList3 = arrayList2;
                rect = rectM1249g2;
                Rect rect8 = rectM1249g3;
                i3 = i15;
                C0186c c0186c = c0187d2;
                int i19 = size;
                m1255i(view, rect, true);
                if (c0005f.f9g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0005f.f9g, layoutDirection);
                    int i20 = absoluteGravity & 112;
                    if (i20 == 48) {
                        rectM1249g.top = Math.max(rectM1249g.top, rect.bottom);
                    } else if (i20 == 80) {
                        rectM1249g.bottom = Math.max(rectM1249g.bottom, getHeight() - rect.top);
                    }
                    int i21 = absoluteGravity & 7;
                    if (i21 == 3) {
                        rectM1249g.left = Math.max(rectM1249g.left, rect.right);
                    } else if (i21 == 5) {
                        rectM1249g.right = Math.max(rectM1249g.right, getWidth() - rect.left);
                    }
                }
                if (c0005f.f10h == 0 || view.getVisibility() != 0) {
                    if (i2 != 2) {
                        rect2 = rect8;
                        rect2.set(((C0005f) view.getLayoutParams()).f17o);
                        if (rect2.equals(rect)) {
                            arrayList2 = arrayList3;
                            i5 = i19;
                        } else {
                            ((C0005f) view.getLayoutParams()).f17o.set(rect);
                        }
                    } else {
                        rect2 = rect8;
                    }
                    i4 = i3 + 1;
                    i5 = i19;
                    while (true) {
                        arrayList2 = arrayList3;
                        if (i4 >= i5) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i4);
                        AbstractC0002c abstractC0002c2 = ((C0005f) view2.getLayoutParams()).f3a;
                        if (abstractC0002c2 != null) {
                            abstractC0002c2.mo63b(view2);
                        }
                        i4++;
                        arrayList3 = arrayList2;
                    }
                } else {
                    WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0005f c0005f3 = (C0005f) view.getLayoutParams();
                        AbstractC0002c abstractC0002c3 = c0005f3.f3a;
                        Rect rectM1249g7 = m1249g();
                        Rect rectM1249g8 = m1249g();
                        rectM1249g8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC0002c3 == null || !abstractC0002c3.mo62a(view)) {
                            rectM1249g7.set(rectM1249g8);
                        } else if (!rectM1249g8.contains(rectM1249g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM1249g7.toShortString() + " | Bounds:" + rectM1249g8.toShortString());
                        }
                        rectM1249g8.setEmpty();
                        c0186c.mo624c(rectM1249g8);
                        if (rectM1249g7.isEmpty()) {
                            rectM1249g7.setEmpty();
                            c0186c.mo624c(rectM1249g7);
                            if (i2 != 2) {
                            }
                            i4 = i3 + 1;
                            i5 = i19;
                            while (true) {
                                arrayList2 = arrayList3;
                                if (i4 >= i5) {
                                }
                                i4++;
                                arrayList3 = arrayList2;
                            }
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0005f3.f10h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i10 = (rectM1249g7.top - ((ViewGroup.MarginLayoutParams) c0005f3).topMargin) - c0005f3.f12j) >= (i11 = rectM1249g.top)) {
                                z2 = false;
                            } else {
                                m1253v(view, i11 - i10);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM1249g7.bottom) - ((ViewGroup.MarginLayoutParams) c0005f3).bottomMargin) + c0005f3.f12j) < (i9 = rectM1249g.bottom)) {
                                m1253v(view, height - i9);
                                z2 = true;
                            }
                            if (!z2) {
                                m1253v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i7 = (rectM1249g7.left - ((ViewGroup.MarginLayoutParams) c0005f3).leftMargin) - c0005f3.f11i) >= (i8 = rectM1249g.left)) {
                                z3 = false;
                            } else {
                                m1252u(view, i8 - i7);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM1249g7.right) - ((ViewGroup.MarginLayoutParams) c0005f3).rightMargin) + c0005f3.f11i) < (i6 = rectM1249g.right)) {
                                m1252u(view, width - i6);
                                z3 = true;
                            }
                            if (!z3) {
                                m1252u(view, 0);
                            }
                            rectM1249g7.setEmpty();
                            c0186c.mo624c(rectM1249g7);
                            if (i2 != 2) {
                            }
                            i4 = i3 + 1;
                            i5 = i19;
                            while (true) {
                                arrayList2 = arrayList3;
                                if (i4 >= i5) {
                                }
                                i4++;
                                arrayList3 = arrayList2;
                            }
                        }
                    }
                }
            }
            i15 = i3 + 1;
            size = i5;
            rectM1249g3 = rect2;
            rectM1249g2 = rect;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1261q(View view, int i2) {
        Rect rectM1249g;
        Rect rectM1249g2;
        C0005f c0005f = (C0005f) view.getLayoutParams();
        View view2 = c0005f.f13k;
        if (view2 == null && c0005f.f8f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0187d c0187d = f1439x;
        if (view2 != null) {
            rectM1249g = m1249g();
            rectM1249g2 = m1249g();
            try {
                m1257k(view2, rectM1249g);
                C0005f c0005f2 = (C0005f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1250l(i2, rectM1249g, rectM1249g2, c0005f2, measuredWidth, measuredHeight);
                m1254h(c0005f2, rectM1249g2, measuredWidth, measuredHeight);
                view.layout(rectM1249g2.left, rectM1249g2.top, rectM1249g2.right, rectM1249g2.bottom);
                return;
            } finally {
                rectM1249g.setEmpty();
                c0187d.mo624c(rectM1249g);
                rectM1249g2.setEmpty();
                c0187d.mo624c(rectM1249g2);
            }
        }
        int i3 = c0005f.f7e;
        if (i3 < 0) {
            C0005f c0005f3 = (C0005f) view.getLayoutParams();
            rectM1249g = m1249g();
            rectM1249g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0005f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0005f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0005f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0005f3).bottomMargin);
            if (this.f1453n != null) {
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM1249g.left = this.f1453n.m922b() + rectM1249g.left;
                    rectM1249g.top = this.f1453n.m924d() + rectM1249g.top;
                    rectM1249g.right -= this.f1453n.m923c();
                    rectM1249g.bottom -= this.f1453n.m921a();
                }
            }
            rectM1249g2 = m1249g();
            int i4 = c0005f3.f5c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM1249g, rectM1249g2, i2);
            view.layout(rectM1249g2.left, rectM1249g2.top, rectM1249g2.right, rectM1249g2.bottom);
            return;
        }
        C0005f c0005f4 = (C0005f) view.getLayoutParams();
        int i5 = c0005f4.f5c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int iM1258m = m1258m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM1258m += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM1258m += measuredWidth2;
        }
        int i8 = i7 != 16 ? i7 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0005f4).leftMargin, Math.min(iM1258m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0005f4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0005f4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0005f4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1262r(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1442c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        C0009j c0009j = f1438w;
        if (c0009j != null) {
            Collections.sort(arrayList, c0009j);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo67f = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            AbstractC0002c abstractC0002c = ((C0005f) view.getLayoutParams()).f3a;
            if (zMo67f && actionMasked != 0) {
                if (abstractC0002c != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 == 0) {
                        abstractC0002c.mo67f(this, view, motionEventObtain);
                    } else if (i2 == 1) {
                        abstractC0002c.mo78q(view, motionEventObtain);
                    }
                }
            } else if (!zMo67f && abstractC0002c != null) {
                if (i2 == 0) {
                    zMo67f = abstractC0002c.mo67f(this, view, motionEvent);
                } else if (i2 == 1) {
                    zMo67f = abstractC0002c.mo78q(view, motionEvent);
                }
                if (zMo67f) {
                    this.f1449j = view;
                }
            }
        }
        arrayList.clear();
        return zMo67f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC0002c abstractC0002c = ((C0005f) view.getLayoutParams()).f3a;
        if (abstractC0002c != null) {
            abstractC0002c.mo73l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1446g) {
            return;
        }
        m1264t(false);
        this.f1446g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1263s() {
        C0186c c0186c;
        View viewFindViewById;
        ArrayList arrayList = this.f1440a;
        arrayList.clear();
        C0010k c0010k = this.f1441b;
        C1031j c1031j = (C1031j) c0010k.f23b;
        int i2 = c1031j.f4104c;
        int i3 = 0;
        while (true) {
            c0186c = (C0186c) c0010k.f22a;
            if (i3 >= i2) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) c1031j.m2493i(i3);
            if (arrayList2 != null) {
                arrayList2.clear();
                c0186c.mo624c(arrayList2);
            }
            i3++;
        }
        c1031j.clear();
        int childCount = getChildCount();
        int i4 = 0;
        loop1: while (true) {
            C1031j c1031j2 = (C1031j) c0010k.f23b;
            if (i4 >= childCount) {
                ArrayList arrayList3 = (ArrayList) c0010k.f24c;
                arrayList3.clear();
                HashSet hashSet = (HashSet) c0010k.f25d;
                hashSet.clear();
                int i5 = c1031j2.f4104c;
                for (int i6 = 0; i6 < i5; i6++) {
                    c0010k.m81b(c1031j2.m2490f(i6), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i4);
            C0005f c0005fM1251n = m1251n(childAt);
            int i7 = c0005fM1251n.f8f;
            if (i7 == -1) {
                c0005fM1251n.f14l = null;
                c0005fM1251n.f13k = null;
            } else {
                View view = c0005fM1251n.f13k;
                if (view == null || view.getId() != i7) {
                    viewFindViewById = findViewById(i7);
                    c0005fM1251n.f13k = viewFindViewById;
                    if (viewFindViewById != null) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i7) + " to anchor view " + childAt);
                        }
                        c0005fM1251n.f14l = null;
                        c0005fM1251n.f13k = null;
                    } else if (viewFindViewById != this) {
                        for (ViewParent parent = viewFindViewById.getParent(); parent != this && parent != null; parent = parent.getParent()) {
                            if (parent != childAt) {
                                if (parent instanceof View) {
                                    viewFindViewById = parent;
                                }
                            } else {
                                if (!isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                c0005fM1251n.f14l = null;
                                c0005fM1251n.f13k = null;
                            }
                        }
                        c0005fM1251n.f14l = viewFindViewById;
                    } else {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                        c0005fM1251n.f14l = null;
                        c0005fM1251n.f13k = null;
                    }
                } else {
                    View view2 = c0005fM1251n.f13k;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            c0005fM1251n.f14l = null;
                            c0005fM1251n.f13k = null;
                            viewFindViewById = findViewById(i7);
                            c0005fM1251n.f13k = viewFindViewById;
                            if (viewFindViewById != null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    c0005fM1251n.f14l = view2;
                }
            }
            if (!c1031j2.containsKey(childAt)) {
                c1031j2.put(childAt, null);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                if (i8 != i4) {
                    View childAt2 = getChildAt(i8);
                    if (childAt2 != c0005fM1251n.f14l) {
                        WeakHashMap weakHashMap = AbstractC0240S.f777a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C0005f) childAt2.getLayoutParams()).f9g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(c0005fM1251n.f10h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC0002c abstractC0002c = c0005fM1251n.f3a;
                            if (abstractC0002c != null) {
                                abstractC0002c.mo63b(childAt);
                            }
                        } else {
                            if (!c1031j2.containsKey(childAt2) && !c1031j2.containsKey(childAt2)) {
                                c1031j2.put(childAt2, null);
                            }
                            if (!c1031j2.containsKey(childAt2) || !c1031j2.containsKey(childAt)) {
                                break loop1;
                            }
                            ArrayList arrayList4 = (ArrayList) c1031j2.get(childAt2);
                            if (arrayList4 == null) {
                                arrayList4 = (ArrayList) c0186c.mo622a();
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                c1031j2.put(childAt2, arrayList4);
                            }
                            arrayList4.add(childAt);
                        }
                    }
                }
            }
            i4++;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m1265w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1456q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1455p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1455p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1455p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1455p;
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                AbstractC0016e.m200w0(drawable3, getLayoutDirection());
                this.f1455p.setVisible(getVisibility() == 0, false);
                this.f1455p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? AbstractC0051a.m315b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1455p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1455p.setVisible(z2, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m1264t(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC0002c abstractC0002c = ((C0005f) childAt.getLayoutParams()).f3a;
            if (abstractC0002c != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC0002c.mo67f(this, childAt, motionEventObtain);
                } else {
                    abstractC0002c.mo78q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0005f) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.f1449j = null;
        this.f1446g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1455p;
    }

    /* JADX INFO: renamed from: w */
    public final void m1265w() {
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (!getFitsSystemWindows()) {
            AbstractC0229G.m719u(this, null);
            return;
        }
        if (this.f1457r == null) {
            this.f1457r = new C0001b(0, this);
        }
        AbstractC0229G.m719u(this, this.f1457r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0005f ? new C0005f((C0005f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0005f((ViewGroup.MarginLayoutParams) layoutParams) : new C0005f(layoutParams);
    }
}
