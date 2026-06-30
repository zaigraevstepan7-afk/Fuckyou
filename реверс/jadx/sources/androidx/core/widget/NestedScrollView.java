package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
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
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p005C0.C0048n;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.C0260g;
import p024N.C0274n;
import p024N.C0280q;
import p024N.InterfaceC0278p;
import p036T.AbstractC0375e;
import p036T.AbstractC0379i;
import p036T.C0378h;
import p036T.C0381k;
import p036T.InterfaceC0380j;
import p060e.C0665g;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0278p {

    /* JADX INFO: renamed from: C */
    public static final float f1476C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: D */
    public static final C0378h f1477D = new C0378h(0);

    /* JADX INFO: renamed from: E */
    public static final int[] f1478E = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public InterfaceC0380j f1479A;

    /* JADX INFO: renamed from: B */
    public final C0260g f1480B;

    /* JADX INFO: renamed from: a */
    public final float f1481a;

    /* JADX INFO: renamed from: b */
    public long f1482b;

    /* JADX INFO: renamed from: c */
    public final Rect f1483c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f1484d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f1485e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f1486f;

    /* JADX INFO: renamed from: g */
    public int f1487g;

    /* JADX INFO: renamed from: h */
    public boolean f1488h;

    /* JADX INFO: renamed from: i */
    public boolean f1489i;

    /* JADX INFO: renamed from: j */
    public View f1490j;

    /* JADX INFO: renamed from: k */
    public boolean f1491k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f1492l;

    /* JADX INFO: renamed from: m */
    public boolean f1493m;

    /* JADX INFO: renamed from: n */
    public boolean f1494n;

    /* JADX INFO: renamed from: o */
    public final int f1495o;

    /* JADX INFO: renamed from: p */
    public final int f1496p;

    /* JADX INFO: renamed from: q */
    public final int f1497q;

    /* JADX INFO: renamed from: r */
    public int f1498r;

    /* JADX INFO: renamed from: s */
    public final int[] f1499s;

    /* JADX INFO: renamed from: t */
    public final int[] f1500t;

    /* JADX INFO: renamed from: u */
    public int f1501u;

    /* JADX INFO: renamed from: v */
    public int f1502v;

    /* JADX INFO: renamed from: w */
    public C0381k f1503w;

    /* JADX INFO: renamed from: x */
    public final C0280q f1504x;

    /* JADX INFO: renamed from: y */
    public final C0274n f1505y;

    /* JADX INFO: renamed from: z */
    public float f1506z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.reddit.frontpage.R.attr.resc);
        this.f1483c = new Rect();
        this.f1488h = true;
        this.f1489i = false;
        this.f1490j = null;
        this.f1491k = false;
        this.f1494n = true;
        this.f1498r = -1;
        this.f1499s = new int[2];
        this.f1500t = new int[2];
        this.f1480B = new C0260g(getContext(), new C0001b(10, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f1485e = i2 >= 31 ? AbstractC0375e.m1009a(context, attributeSet) : new EdgeEffect(context);
        this.f1486f = i2 >= 31 ? AbstractC0375e.m1009a(context, attributeSet) : new EdgeEffect(context);
        this.f1481a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1484d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1495o = viewConfiguration.getScaledTouchSlop();
        this.f1496p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1497q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1478E, com.reddit.frontpage.R.attr.resc, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1504x = new C0280q();
        this.f1505y = new C0274n(this);
        setNestedScrollingEnabled(true);
        AbstractC0240S.m785p(this, f1477D);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m1266l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1266l((View) parent, nestedScrollView);
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: a */
    public final void mo882a(View view, View view2, int i2, int i3) {
        C0280q c0280q = this.f1504x;
        if (i3 == 1) {
            c0280q.f858b = i2;
        } else {
            c0280q.f857a = i2;
        }
        this.f1505y.m877g(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p024N.InterfaceC0278p
    /* JADX INFO: renamed from: b */
    public final void mo888b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m1273n(i5, i6, iArr);
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: c */
    public final void mo883c(View view, int i2, int i3, int i4, int i5, int i6) {
        m1273n(i5, i6, null);
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i2;
        if (this.f1484d.isFinished()) {
            return;
        }
        this.f1484d.computeScrollOffset();
        int currY = this.f1484d.getCurrY();
        int i3 = currY - this.f1502v;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1486f;
        EdgeEffect edgeEffect2 = this.f1485e;
        if (i3 <= 0 || AbstractC0016e.m164N(edgeEffect2) == 0.0f) {
            if (i3 < 0 && AbstractC0016e.m164N(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(AbstractC0016e.m185m0(edgeEffect, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i3) {
                    edgeEffect.finish();
                }
            }
            int i4 = i3;
            this.f1502v = currY;
            int[] iArr = this.f1500t;
            iArr[1] = 0;
            this.f1505y.m873c(0, i4, 1, iArr, null);
            i2 = i4 - iArr[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                m1275p(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i5 = i2 - scrollY2;
                iArr[1] = 0;
                this.f1505y.m874d(0, scrollY2, 0, i5, this.f1499s, 1, iArr);
                i2 = i5 - iArr[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1484d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1484d.getCurrVelocity());
                    }
                }
                this.f1484d.abortAnimation();
                m1282w(1);
            }
            if (this.f1484d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                m1282w(1);
                return;
            }
        }
        iRound = Math.round(AbstractC0016e.m185m0(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect2.finish();
        }
        i3 -= iRound;
        int i42 = i3;
        this.f1502v = currY;
        int[] iArr2 = this.f1500t;
        iArr2[1] = 0;
        this.f1505y.m873c(0, i42, 1, iArr2, null);
        i2 = i42 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        if (this.f1484d.isFinished()) {
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

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: d */
    public final void mo884d(View view, int i2) {
        C0280q c0280q = this.f1504x;
        if (i2 == 1) {
            c0280q.f858b = 0;
        } else {
            c0280q.f857a = 0;
        }
        m1282w(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1269i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return this.f1505y.m871a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1505y.m872b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1505y.m873c(i2, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1505y.m874d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1485e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AbstractC0379i.m1021a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AbstractC0379i.m1021a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1486f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0379i.m1021a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (AbstractC0379i.m1021a(this)) {
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

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: e */
    public final void mo885e(View view, int i2, int i3, int[] iArr, int i4) {
        this.f1505y.m873c(i2, i3, i4, iArr, null);
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: f */
    public final boolean mo886f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1267g(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m1272m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1278s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1483c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m1278s(m1268h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m1272m(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
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
        C0280q c0280q = this.f1504x;
        return c0280q.f858b | c0280q.f857a;
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
        if (this.f1506z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1506z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1506z;
    }

    /* JADX INFO: renamed from: h */
    public final int m1268h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1505y.m876f(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1269i(KeyEvent keyEvent) {
        this.f1483c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m1271k(33) : m1267g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m1271k(130) : m1267g(130);
                    }
                    if (keyCode == 62) {
                        m1276q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m1271k(33);
                    }
                    if (keyCode == 93) {
                        return m1271k(130);
                    }
                    if (keyCode == 122) {
                        m1276q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m1276q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1505y.f852d;
    }

    /* JADX INFO: renamed from: j */
    public final void m1270j(int i2) {
        if (getChildCount() > 0) {
            this.f1484d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1505y.m877g(2, 1);
            this.f1502v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1271k(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1483c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m1277r(i2, rect.top, rect.bottom);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1272m(View view, int i2, int i3) {
        Rect rect = this.f1483c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final void m1273n(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1505y.m874d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    /* JADX INFO: renamed from: o */
    public final void m1274o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1498r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1487g = (int) motionEvent.getY(i2);
            this.f1498r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1492l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1489i = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        float axisValue;
        int width;
        if (motionEvent.getAction() == 8 && !this.f1491k) {
            if (AbstractC0016e.m174e0(motionEvent, 2)) {
                i2 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (AbstractC0016e.m174e0(motionEvent, 4194304)) {
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i2 = 26;
            } else {
                i2 = 0;
                axisValue = 0.0f;
                width = 0;
            }
            if (axisValue != 0.0f) {
                m1278s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, AbstractC0016e.m174e0(motionEvent, 8194));
                if (i2 != 0) {
                    this.f1480B.m819a(motionEvent, i2);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1491k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int y2 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 < childAt.getTop() - scrollY || y2 >= childAt.getBottom() - scrollY || x2 < childAt.getLeft() || x2 >= childAt.getRight()) {
                    if (!m1281v(motionEvent) && this.f1484d.isFinished()) {
                        z2 = false;
                    }
                    this.f1491k = z2;
                    VelocityTracker velocityTracker = this.f1492l;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1492l = null;
                    }
                } else {
                    this.f1487g = y2;
                    this.f1498r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1492l;
                    if (velocityTracker2 == null) {
                        this.f1492l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1492l.addMovement(motionEvent);
                    this.f1484d.computeScrollOffset();
                    if (!m1281v(motionEvent) && this.f1484d.isFinished()) {
                        z2 = false;
                    }
                    this.f1491k = z2;
                    this.f1505y.m877g(2, 0);
                }
            }
        } else if (i2 == 1) {
            this.f1491k = false;
            this.f1498r = -1;
            VelocityTracker velocityTracker3 = this.f1492l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1492l = null;
            }
            if (this.f1484d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m1282w(0);
        } else if (i2 == 2) {
            int i3 = this.f1498r;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y3 - this.f1487g) > this.f1495o && (2 & getNestedScrollAxes()) == 0) {
                        this.f1491k = true;
                        this.f1487g = y3;
                        if (this.f1492l == null) {
                            this.f1492l = VelocityTracker.obtain();
                        }
                        this.f1492l.addMovement(motionEvent);
                        this.f1501u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i2 != 3) {
            if (i2 == 6) {
                m1274o(motionEvent);
            }
        }
        return this.f1491k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredHeight;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f1488h = false;
        View view = this.f1490j;
        if (view != null && m1266l(view, this)) {
            View view2 = this.f1490j;
            Rect rect = this.f1483c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM1268h = m1268h(rect);
            if (iM1268h != 0) {
                scrollBy(0, iM1268h);
            }
        }
        this.f1490j = null;
        if (!this.f1489i) {
            if (this.f1503w != null) {
                scrollTo(getScrollX(), this.f1503w.f1041a);
                this.f1503w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i6 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1489i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1493m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m1270j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f1505y.m872b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1505y.m873c(i2, i3, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m1273n(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo882a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus != null && m1272m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0381k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0381k c0381k = (C0381k) parcelable;
        super.onRestoreInstanceState(c0381k.getSuperState());
        this.f1503w = c0381k;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0381k c0381k = new C0381k(super.onSaveInstanceState());
        c0381k.f1041a = getScrollY();
        return c0381k;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        InterfaceC0380j interfaceC0380j = this.f1479A;
        if (interfaceC0380j != null) {
            C0048n c0048n = (C0048n) interfaceC0380j;
            C0665g.m1885b(this, (View) c0048n.f174b, (View) c0048n.f175c);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m1272m(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1483c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM1268h = m1268h(rect);
        if (iM1268h != 0) {
            if (this.f1494n) {
                m1280u(0, iM1268h, false);
            } else {
                scrollBy(0, iM1268h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo886f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo884d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1492l == null) {
            this.f1492l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1501u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1501u);
        C0274n c0274n = this.f1505y;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1486f;
            EdgeEffect edgeEffect2 = this.f1485e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1492l;
                velocityTracker.computeCurrentVelocity(1000, this.f1497q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1498r);
                if (Math.abs(yVelocity) >= this.f1496p) {
                    if (AbstractC0016e.m164N(edgeEffect2) != 0.0f) {
                        if (m1279t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m1270j(-yVelocity);
                        }
                    } else if (AbstractC0016e.m164N(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (m1279t(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            m1270j(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!c0274n.m872b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m1270j(i3);
                        }
                    }
                } else if (this.f1484d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1498r = -1;
                this.f1491k = false;
                VelocityTracker velocityTracker2 = this.f1492l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1492l = null;
                }
                m1282w(0);
                this.f1485e.onRelease();
                this.f1486f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1498r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1498r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f1487g - y2;
                    float x2 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (AbstractC0016e.m164N(edgeEffect2) != 0.0f) {
                        float f3 = -AbstractC0016e.m185m0(edgeEffect2, -height, x2);
                        if (AbstractC0016e.m164N(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (AbstractC0016e.m164N(edgeEffect) != 0.0f) {
                        float fM185m0 = AbstractC0016e.m185m0(edgeEffect, height, 1.0f - x2);
                        if (AbstractC0016e.m164N(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fM185m0;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i5 = i4 - iRound;
                    if (!this.f1491k && Math.abs(i5) > this.f1495o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1491k = true;
                        i5 = i5 > 0 ? i5 - this.f1495o : i5 + this.f1495o;
                    }
                    if (this.f1491k) {
                        int iM1278s = m1278s(i5, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1487g = y2 - iM1278s;
                        this.f1501u += iM1278s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1491k && getChildCount() > 0 && this.f1484d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1498r = -1;
                this.f1491k = false;
                VelocityTracker velocityTracker3 = this.f1492l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1492l = null;
                }
                m1282w(0);
                this.f1485e.onRelease();
                this.f1486f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1487g = (int) motionEvent.getY(actionIndex);
                this.f1498r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1274o(motionEvent);
                this.f1487g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1498r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1491k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1484d.isFinished()) {
                this.f1484d.abortAnimation();
                m1282w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1487g = y3;
            this.f1498r = pointerId;
            c0274n.m877g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1492l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1275p(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            i6 = i3;
            z2 = false;
        } else {
            z2 = true;
            i6 = 0;
        }
        if (i8 > i5) {
            i7 = i5;
            z3 = true;
        } else if (i8 < 0) {
            z3 = true;
            i7 = 0;
        } else {
            i7 = i8;
            z3 = false;
        }
        if (z3 && !this.f1505y.m876f(1)) {
            this.f1484d.springBack(i6, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i6, i7);
        return z2 || z3;
    }

    /* JADX INFO: renamed from: q */
    public final void m1276q(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1483c;
        if (z2) {
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
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        m1277r(i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1277r(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            m1278s(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1488h) {
            this.f1490j = view2;
        } else {
            Rect rect = this.f1483c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM1268h = m1268h(rect);
            if (iM1268h != 0) {
                scrollBy(0, iM1268h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM1268h = m1268h(rect);
        boolean z3 = iM1268h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM1268h);
                return z3;
            }
            m1280u(0, iM1268h, false);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1492l) != null) {
            velocityTracker.recycle();
            this.f1492l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1488h = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final int m1278s(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        VelocityTracker velocityTracker;
        C0274n c0274n = this.f1505y;
        if (i4 == 1) {
            c0274n.m877g(2, i4);
        }
        boolean zM873c = this.f1505y.m873c(0, i2, i4, this.f1500t, this.f1499s);
        int[] iArr = this.f1500t;
        int[] iArr2 = this.f1499s;
        if (zM873c) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = m1275p(i5, 0, scrollY, scrollRange) && !c0274n.m876f(i4);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1505y.m874d(0, scrollY2, 0, i5 - scrollY2, this.f1499s, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f1486f;
        EdgeEffect edgeEffect2 = this.f1485e;
        if (i9 < 0) {
            if (z4) {
                AbstractC0016e.m185m0(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            AbstractC0016e.m185m0(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i4 == 0 && (velocityTracker = this.f1492l) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            m1282w(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1493m) {
            this.f1493m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0274n c0274n = this.f1505y;
        if (c0274n.f852d) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            AbstractC0229G.m724z(c0274n.f851c);
        }
        c0274n.f852d = z2;
    }

    public void setOnScrollChangeListener(InterfaceC0380j interfaceC0380j) {
        this.f1479A = interfaceC0380j;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1494n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1505y.m877g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1282w(0);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1279t(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fM164N = AbstractC0016e.m164N(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2) * 0.35f;
        float f = this.f1481a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d2 = f1476C;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f))) < fM164N;
    }

    /* JADX INFO: renamed from: u */
    public final void m1280u(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1482b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1484d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f1505y.m877g(2, 1);
            } else {
                m1282w(1);
            }
            this.f1502v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1484d.isFinished()) {
                this.f1484d.abortAnimation();
                m1282w(1);
            }
            scrollBy(i2, i3);
        }
        this.f1482b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1281v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1485e;
        if (AbstractC0016e.m164N(edgeEffect) != 0.0f) {
            AbstractC0016e.m185m0(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1486f;
        if (AbstractC0016e.m164N(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC0016e.m185m0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m1282w(int i2) {
        this.f1505y.m878h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
