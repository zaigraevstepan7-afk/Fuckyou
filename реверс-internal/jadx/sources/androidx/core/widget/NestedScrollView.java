package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.bj1;
import defpackage.gk;
import defpackage.gy;
import defpackage.h62;
import defpackage.l20;
import defpackage.nz0;
import defpackage.o50;
import defpackage.oz0;
import defpackage.pz0;
import defpackage.qt0;
import defpackage.r52;
import defpackage.s52;
import defpackage.v0;
import defpackage.xk;
import defpackage.y20;
import defpackage.yc;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout {
    public static final float G = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final nz0 H = new nz0();
    public static final int[] I = {R.attr.fillViewport};
    public int A;
    public pz0 B;
    public final o50 C;
    public final gk D;
    public float E;
    public final gy F;
    public final float e;
    public long f;
    public final Rect g;
    public final OverScroller h;
    public final EdgeEffect i;
    public final EdgeEffect j;
    public bj1 k;
    public int l;
    public boolean m;
    public boolean n;
    public View o;
    public boolean p;
    public VelocityTracker q;
    public boolean r;
    public boolean s;
    public final int t;
    public final int u;
    public final int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public int z;

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Rect();
        this.m = true;
        this.n = false;
        this.o = null;
        this.p = false;
        this.s = true;
        this.w = -1;
        this.x = new int[2];
        this.y = new int[2];
        this.F = new gy(getContext(), new qt0(29, this));
        int i2 = Build.VERSION.SDK_INT;
        this.i = i2 >= 31 ? l20.a(context, attributeSet) : new EdgeEffect(context);
        this.j = i2 >= 31 ? l20.a(context, attributeSet) : new EdgeEffect(context);
        this.e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.t = viewConfiguration.getScaledTouchSlop();
        this.u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.C = new o50();
        gk gkVar = new gk();
        gkVar.d = this;
        this.D = gkVar;
        setNestedScrollingEnabled(true);
        h62.b(this, H);
    }

    public static boolean e(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && e((View) parent, nestedScrollView);
    }

    private bj1 getScrollFeedbackProvider() {
        if (this.k == null) {
            this.k = new bj1(this);
        }
        return this.k;
    }

    public final boolean a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !f(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            l(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.g;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            l(b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !f(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            yc.l("ScrollView can host only one direct child");
        }
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void c(int i) {
        if (getChildCount() > 0) {
            this.h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            o(2, 1);
            this.A = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                y20.a(this, Math.abs(this.h.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i;
        OverScroller overScroller = this.h;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.A;
        int height = getHeight();
        EdgeEffect edgeEffect = this.i;
        EdgeEffect edgeEffect2 = this.j;
        if (i2 <= 0 || xk.v(edgeEffect) == 0.0f) {
            if (i2 < 0 && xk.v(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(xk.D(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.A = currY;
            int[] iArr = this.y;
            iArr[1] = 0;
            this.D.a(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                y20.a(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                i(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.D.b(0, scrollY2, 0, i4, this.x, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                q(1);
            }
            if (overScroller.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                q(1);
                return;
            }
        }
        iRound = Math.round(xk.D(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect.finish();
        }
        i2 -= iRound;
        int i32 = i2;
        this.A = currY;
        int[] iArr2 = this.y;
        iArr2[1] = 0;
        this.D.a(0, i32, 1, iArr2, null);
        i = i32 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (overScroller.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final boolean d(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return k(i, rect.top, rect.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zD;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.g.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() != 0) {
                        zD = false;
                        if (!zD) {
                            return false;
                        }
                    } else {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            zD = keyEvent.isAltPressed() ? d(33) : a(33);
                        } else if (keyCode != 20) {
                            if (keyCode == 62) {
                                j(keyEvent.isShiftPressed() ? 33 : 130);
                            } else if (keyCode == 92) {
                                zD = d(33);
                            } else if (keyCode == 93) {
                                zD = d(130);
                            } else if (keyCode == 122) {
                                j(33);
                            } else if (keyCode == 123) {
                                j(130);
                            }
                            zD = false;
                        } else {
                            zD = keyEvent.isAltPressed() ? d(130) : a(130);
                        }
                        if (!zD) {
                        }
                    }
                } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                    View viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                    if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                        zD = true;
                    }
                    if (!zD) {
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParentC;
        gk gkVar = this.D;
        if (gkVar.a && (viewParentC = gkVar.c(0)) != null) {
            try {
                return viewParentC.onNestedFling((NestedScrollView) gkVar.d, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParentC;
        gk gkVar = this.D;
        if (gkVar.a && (viewParentC = gkVar.c(0)) != null) {
            try {
                return viewParentC.onNestedPreFling((NestedScrollView) gkVar.d, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.D.a(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.D.b(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.i;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.j;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean f(View view, int i, int i2) {
        Rect rect = this.g;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void g(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.D.b(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o50 o50Var = this.C;
        return o50Var.f | o50Var.e;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                yc.l("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.E;
    }

    public final void h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.l = (int) motionEvent.getY(i);
            this.w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.D.c(0) != null;
    }

    public final boolean i(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z2 = false;
                if (z2 && this.D.c(1) == null) {
                    this.h.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.h.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.D.a;
    }

    public final void j(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.g;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        k(i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            l(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            o(2, i4);
        }
        boolean zA = this.D.a(0, i, i4, this.y, this.x);
        int[] iArr = this.x;
        int[] iArr2 = this.y;
        if (zA) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = i(i5, 0, scrollY, scrollRange) && this.D.c(i4) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.D.b(0, scrollY2, 0, i5 - scrollY2, this.x, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.j;
        EdgeEffect edgeEffect2 = this.i;
        if (i9 >= 0) {
            if (i9 > scrollRange && z4) {
                xk.D(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    z2 = false;
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                } else {
                    z2 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.q) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                q(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z4) {
            xk.D(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z3 = z2;
        }
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
        }
        return i7;
    }

    public final boolean m(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fV = xk.v(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.e * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = G;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fV;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.h.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                o(2, 1);
            } else {
                q(1);
            }
            this.A = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.h;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                q(1);
            }
            scrollBy(i, i2);
        }
        this.f = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(int i, int i2) {
        boolean zOnStartNestedScroll;
        gk gkVar = this.D;
        View view = (NestedScrollView) gkVar.d;
        if (gkVar.c(i2) != null) {
            return true;
        }
        if (gkVar.a) {
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof NestedScrollView;
                if (z) {
                    zOnStartNestedScroll = (i & 2) != 0;
                } else if (i2 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                    }
                }
                if (zOnStartNestedScroll) {
                    if (i2 == 0) {
                        gkVar.b = parent;
                    } else if (i2 == 1) {
                        gkVar.c = parent;
                    }
                    if (z) {
                        NestedScrollView nestedScrollView = (NestedScrollView) parent;
                        o50 o50Var = nestedScrollView.C;
                        if (i2 == 1) {
                            o50Var.f = i;
                        } else {
                            o50Var.e = i;
                        }
                        nestedScrollView.o(2, i2);
                        return true;
                    }
                    if (i2 != 0) {
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view2, view, i);
                        return true;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int width;
        boolean z;
        int i2;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z2;
        boolean z3;
        float yVelocity;
        float f2;
        long j;
        float f3;
        int i3;
        float fSqrt;
        boolean z4;
        float f4;
        if (motionEvent.getAction() != 8 || this.p) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            width = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        l(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            gy gyVar = this.F;
            NestedScrollView nestedScrollView = (NestedScrollView) gyVar.b.f;
            int[] iArr = gyVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (gyVar.f == source && gyVar.g == deviceId && gyVar.e == i) {
                z2 = false;
                z = true;
                i2 = 0;
            } else {
                Context context = gyVar.a;
                z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i2 = 0;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 34) {
                    scaledMinimumFlingVelocity = v0.f(viewConfiguration, deviceId2, i, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i4 >= 34) {
                    scaledMaximumFlingVelocity = v0.e(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                gyVar.f = source;
                gyVar.g = deviceId;
                gyVar.e = i;
                z2 = true;
            }
            int i5 = iArr[i2];
            VelocityTracker velocityTracker = gyVar.c;
            if (i5 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return z;
                }
                velocityTracker.recycle();
                gyVar.c = null;
                return z;
            }
            if (velocityTracker == null) {
                gyVar.c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = gyVar.c;
            Map map = r52.a;
            velocityTracker2.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = r52.a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new s52());
                }
                s52 s52Var = (s52) map2.get(velocityTracker2);
                long[] jArr = s52Var.b;
                long eventTime = motionEvent.getEventTime();
                if (s52Var.d != 0 && eventTime - jArr[s52Var.e] > 40) {
                    s52Var.d = i2;
                    s52Var.c = 0.0f;
                }
                int i6 = (s52Var.e + 1) % 20;
                s52Var.e = i6;
                int i7 = s52Var.d;
                if (i7 != 20) {
                    s52Var.d = i7 + 1;
                }
                s52Var.a[i6] = motionEvent.getAxisValue(26);
                jArr[s52Var.e] = eventTime;
            }
            float f5 = Float.MAX_VALUE;
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            s52 s52Var2 = (s52) r52.a.get(velocityTracker2);
            if (s52Var2 != null) {
                float[] fArr = s52Var2.a;
                long[] jArr2 = s52Var2.b;
                int i8 = s52Var2.d;
                if (i8 < 2) {
                    f3 = Float.MAX_VALUE;
                } else {
                    int i9 = s52Var2.e;
                    int i10 = ((i9 + 20) - (i8 - 1)) % 20;
                    long j2 = jArr2[i9];
                    while (true) {
                        j = jArr2[i10];
                        long j3 = j2 - j;
                        f3 = f5;
                        i3 = s52Var2.d;
                        if (j3 <= 100) {
                            break;
                        }
                        s52Var2.d = i3 - 1;
                        i10 = (i10 + 1) % 20;
                        f5 = f3;
                    }
                    if (i3 >= 2) {
                        if (i3 == 2) {
                            int i11 = (i10 + 1) % 20;
                            if (j != jArr2[i11]) {
                                fSqrt = fArr[i11] / (r11 - j);
                                z3 = z2;
                            }
                        } else {
                            float fAbs = 0.0f;
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                if (i12 >= s52Var2.d - 1) {
                                    break;
                                }
                                int i14 = i12 + i10;
                                long j4 = jArr2[i14 % 20];
                                int i15 = (i14 + 1) % 20;
                                if (jArr2[i15] == j4) {
                                    z4 = z2;
                                } else {
                                    i13++;
                                    float f6 = fAbs;
                                    z4 = z2;
                                    float fSqrt2 = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(2.0f * Math.abs(fAbs)));
                                    float f7 = fArr[i15] / (jArr2[i15] - j4);
                                    fAbs = (Math.abs(f7) * (f7 - fSqrt2)) + f6;
                                    if (i13 == z) {
                                        fAbs *= 0.5f;
                                    }
                                }
                                i12++;
                                z2 = z4;
                                z = true;
                            }
                            z3 = z2;
                            fSqrt = ((float) Math.sqrt(Math.abs(r28) * 2.0f)) * (fAbs < 0.0f ? -1.0f : 1.0f);
                        }
                        f4 = fSqrt * 1000.0f;
                        s52Var2.c = f4;
                        if (f4 >= (-Math.abs(f3))) {
                            s52Var2.c = -Math.abs(f3);
                        } else if (s52Var2.c > Math.abs(f3)) {
                            s52Var2.c = Math.abs(f3);
                        }
                    }
                }
                z3 = z2;
                fSqrt = 0.0f;
                f4 = fSqrt * 1000.0f;
                s52Var2.c = f4;
                if (f4 >= (-Math.abs(f3))) {
                }
            } else {
                z3 = z2;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = v0.b(velocityTracker2, i);
            } else if (i == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                s52 s52Var3 = (s52) r52.a.get(velocityTracker2);
                yVelocity = (s52Var3 == null || i != 26) ? 0.0f : s52Var3.c;
            }
            float f8 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f8);
            if (z3 || (fSignum != Math.signum(gyVar.d) && fSignum != 0.0f)) {
                nestedScrollView.h.abortAnimation();
            }
            if (Math.abs(f8) >= iArr[0]) {
                float fMax = Math.max(-r3, Math.min(f8, iArr[1]));
                if (fMax == 0.0f) {
                    f2 = 0.0f;
                } else {
                    nestedScrollView.h.abortAnimation();
                    nestedScrollView.c((int) fMax);
                    f2 = fMax;
                }
                gyVar.d = f2;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.p) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.h;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!p(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.p = z;
                    VelocityTracker velocityTracker = this.q;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.q = null;
                    }
                } else {
                    this.l = y;
                    this.w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.q;
                    if (velocityTracker2 == null) {
                        this.q = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.q.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!p(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.p = z;
                    o(2, 0);
                }
            }
        } else if (i == 1) {
            this.p = false;
            this.w = -1;
            VelocityTracker velocityTracker3 = this.q;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.q = null;
            }
            if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            q(0);
        } else if (i == 2) {
            int i2 = this.w;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.l) > this.t && (2 & getNestedScrollAxes()) == 0) {
                        this.p = true;
                        this.l = y2;
                        if (this.q == null) {
                            this.q = VelocityTracker.obtain();
                        }
                        this.q.addMovement(motionEvent);
                        this.z = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i != 3) {
            if (i == 6) {
                h(motionEvent);
            }
        }
        return this.p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.m = false;
        View view = this.o;
        if (view != null && e(view, this)) {
            View view2 = this.o;
            Rect rect = this.g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.o = null;
        if (!this.n) {
            if (this.B != null) {
                scrollTo(getScrollX(), this.B.e);
                this.B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        c((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.D.a(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        g(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.C.e = i;
        o(2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && f(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pz0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pz0 pz0Var = (pz0) parcelable;
        super.onRestoreInstanceState(pz0Var.getSuperState());
        this.B = pz0Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        pz0 pz0Var = new pz0(super.onSaveInstanceState());
        pz0Var.e = getScrollY();
        return pz0Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !f(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.g;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.s) {
                n(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.C.e = 0;
        q(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fD;
        int iRound;
        if (this.q == null) {
            this.q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.z = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.z);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.i;
            EdgeEffect edgeEffect2 = this.j;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.q;
                velocityTracker.computeCurrentVelocity(1000, this.v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.w);
                if (Math.abs(yVelocity) >= this.u) {
                    if (xk.v(edgeEffect) != 0.0f) {
                        if (m(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            c(-yVelocity);
                        }
                    } else if (xk.v(edgeEffect2) != 0.0f) {
                        int i = -yVelocity;
                        if (m(edgeEffect2, i)) {
                            edgeEffect2.onAbsorb(i);
                        } else {
                            c(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            c(i2);
                        }
                    }
                } else if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.w = -1;
                this.p = false;
                VelocityTracker velocityTracker2 = this.q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.q = null;
                }
                q(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.w);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.w + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.l - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (xk.v(edgeEffect) != 0.0f) {
                        fD = -xk.D(edgeEffect, -height, x);
                        if (xk.v(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (xk.v(edgeEffect2) != 0.0f) {
                            fD = xk.D(edgeEffect2, height, 1.0f - x);
                            if (xk.v(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        int i4 = i3 - iRound;
                        if (!this.p) {
                            int iAbs = Math.abs(i4);
                            int i5 = this.t;
                            if (iAbs > i5) {
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.p = true;
                                i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                            }
                        }
                        if (this.p) {
                            int iL = l(i4, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.l = y - iL;
                            this.z += iL;
                        }
                    }
                    f = fD;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                    }
                    int i42 = i3 - iRound;
                    if (!this.p) {
                    }
                    if (this.p) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.p && getChildCount() > 0) {
                    if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.w = -1;
                this.p = false;
                VelocityTracker velocityTracker3 = this.q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.q = null;
                }
                q(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.l = (int) motionEvent.getY(actionIndex);
                this.w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                h(motionEvent);
                this.l = (int) motionEvent.getY(motionEvent.findPointerIndex(this.w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.h;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                q(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.l = y2;
            this.w = pointerId;
            o(2, 0);
        }
        VelocityTracker velocityTracker4 = this.q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.i;
        if (xk.v(edgeEffect) != 0.0f) {
            xk.D(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.j;
        if (xk.v(edgeEffect2) == 0.0f) {
            return z;
        }
        xk.D(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void q(int i) {
        gk gkVar = this.D;
        ViewParent viewParentC = gkVar.c(i);
        if (viewParentC != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) gkVar.d;
            if (viewParentC instanceof NestedScrollView) {
                NestedScrollView nestedScrollView2 = (NestedScrollView) viewParentC;
                o50 o50Var = nestedScrollView2.C;
                if (i == 1) {
                    o50Var.f = 0;
                } else {
                    o50Var.e = 0;
                }
                nestedScrollView2.q(i);
            } else if (i == 0) {
                try {
                    viewParentC.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                gkVar.b = null;
            } else {
                if (i != 1) {
                    return;
                }
                gkVar.c = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.m) {
            this.o = view2;
        } else {
            Rect rect = this.g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z2 = iB != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iB);
                return z2;
            }
            n(0, iB, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.q) != null) {
            velocityTracker.recycle();
            this.q = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.m = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.r) {
            this.r = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        gk gkVar = this.D;
        if (gkVar.a) {
            NestedScrollView nestedScrollView = (NestedScrollView) gkVar.d;
            Field field = h62.a;
            nestedScrollView.stopNestedScroll();
        }
        gkVar.a = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.s = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return o(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        q(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            yc.l("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            yc.l("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            yc.l("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(oz0 oz0Var) {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.reddit.secondpage.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
