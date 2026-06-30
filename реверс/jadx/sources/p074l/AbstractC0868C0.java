package p074l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p057d.AbstractC0641a;

/* JADX INFO: renamed from: l.C0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0868C0 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f3510a;

    /* JADX INFO: renamed from: b */
    public int f3511b;

    /* JADX INFO: renamed from: c */
    public int f3512c;

    /* JADX INFO: renamed from: d */
    public int f3513d;

    /* JADX INFO: renamed from: e */
    public int f3514e;

    /* JADX INFO: renamed from: f */
    public int f3515f;

    /* JADX INFO: renamed from: g */
    public float f3516g;

    /* JADX INFO: renamed from: h */
    public boolean f3517h;

    /* JADX INFO: renamed from: i */
    public int[] f3518i;

    /* JADX INFO: renamed from: j */
    public int[] f3519j;

    /* JADX INFO: renamed from: k */
    public Drawable f3520k;

    /* JADX INFO: renamed from: l */
    public int f3521l;

    /* JADX INFO: renamed from: m */
    public int f3522m;

    /* JADX INFO: renamed from: n */
    public int f3523n;

    /* JADX INFO: renamed from: o */
    public int f3524o;

    public AbstractC0868C0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3510a = true;
        this.f3511b = -1;
        this.f3512c = 0;
        this.f3514e = 8388659;
        int[] iArr = AbstractC0641a.f2493n;
        C0270l c0270lM838m = C0270l.m838m(context, attributeSet, iArr, 0);
        AbstractC0240S.m784o(this, context, iArr, attributeSet, (TypedArray) c0270lM838m.f837b, 0);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f3516g = typedArray.getFloat(4, -1.0f);
        this.f3511b = typedArray.getInt(3, -1);
        this.f3517h = typedArray.getBoolean(7, false);
        setDividerDrawable(c0270lM838m.m845h(5));
        this.f3523n = typedArray.getInt(8, 0);
        this.f3524o = typedArray.getDimensionPixelSize(6, 0);
        c0270lM838m.m851o();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0866B0;
    }

    /* JADX INFO: renamed from: d */
    public final void m2274d(Canvas canvas, int i2) {
        this.f3520k.setBounds(getPaddingLeft() + this.f3524o, i2, (getWidth() - getPaddingRight()) - this.f3524o, this.f3522m + i2);
        this.f3520k.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m2275e(Canvas canvas, int i2) {
        this.f3520k.setBounds(i2, getPaddingTop() + this.f3524o, this.f3521l + i2, (getHeight() - getPaddingBottom()) - this.f3524o);
        this.f3520k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0866B0 generateDefaultLayoutParams() {
        int i2 = this.f3513d;
        if (i2 == 0) {
            return new C0866B0(-2, -2);
        }
        if (i2 == 1) {
            return new C0866B0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0866B0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0866B0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f3511b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f3511b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3511b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f3512c;
        if (this.f3513d == 1 && (i2 = this.f3514e & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3515f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3515f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0866B0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3511b;
    }

    public Drawable getDividerDrawable() {
        return this.f3520k;
    }

    public int getDividerPadding() {
        return this.f3524o;
    }

    public int getDividerWidth() {
        return this.f3521l;
    }

    public int getGravity() {
        return this.f3514e;
    }

    public int getOrientation() {
        return this.f3513d;
    }

    public int getShowDividers() {
        return this.f3523n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3516g;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0866B0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0866B0 ? new C0866B0((C0866B0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0866B0((ViewGroup.MarginLayoutParams) layoutParams) : new C0866B0(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2276i(int i2) {
        if (i2 == 0) {
            return (this.f3523n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f3523n & 4) != 0;
        }
        if ((this.f3523n & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f3520k == null) {
            return;
        }
        int i3 = 0;
        if (this.f3513d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && m2276i(i3)) {
                    m2274d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0866B0) childAt.getLayoutParams())).topMargin) - this.f3522m);
                }
                i3++;
            }
            if (m2276i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2274d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f3522m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0866B0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = AbstractC0970s1.f3845a;
        boolean z3 = getLayoutDirection() == 1;
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2276i(i3)) {
                C0866B0 c0866b0 = (C0866B0) childAt3.getLayoutParams();
                m2275e(canvas, z3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0866b0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0866b0).leftMargin) - this.f3521l);
            }
            i3++;
        }
        if (m2276i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0866B0 c0866b02 = (C0866B0) childAt4.getLayoutParams();
                if (z3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0866b02).leftMargin;
                    i2 = this.f3521l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0866b02).rightMargin;
                }
            } else if (z3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f3521l;
                right = left - i2;
            }
            m2275e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int measuredHeight;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        if (this.f3513d == 1) {
            int paddingLeft = getPaddingLeft();
            int i17 = i4 - i2;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.f3514e;
            int i19 = i18 & 112;
            int i20 = 8388615 & i18;
            int paddingTop = i19 != 16 ? i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f3515f : getPaddingTop() + (((i5 - i3) - this.f3515f) / 2);
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt != null && childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0866B0 c0866b0 = (C0866B0) childAt.getLayoutParams();
                    int i22 = ((LinearLayout.LayoutParams) c0866b0).gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0866b0).leftMargin;
                        i14 = ((LinearLayout.LayoutParams) c0866b0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i15 = ((LinearLayout.LayoutParams) c0866b0).leftMargin + paddingLeft;
                        if (m2276i(i21)) {
                            paddingTop += this.f3522m;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) c0866b0).topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0866b0).bottomMargin + i23;
                    } else {
                        i13 = paddingRight - measuredWidth;
                        i14 = ((LinearLayout.LayoutParams) c0866b0).rightMargin;
                    }
                    i15 = i13 - i14;
                    if (m2276i(i21)) {
                    }
                    int i232 = paddingTop + ((LinearLayout.LayoutParams) c0866b0).topMargin;
                    childAt.layout(i15, i232, measuredWidth + i15, i232 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0866b0).bottomMargin + i232;
                }
                i21++;
                i16 = 8;
            }
            return;
        }
        boolean z3 = AbstractC0970s1.f3845a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i24 = i5 - i3;
        int paddingBottom = i24 - getPaddingBottom();
        int paddingBottom2 = (i24 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i25 = this.f3514e;
        int i26 = 8388615 & i25;
        int i27 = i25 & 112;
        boolean z5 = this.f3510a;
        int[] iArr = this.f3518i;
        int[] iArr2 = this.f3519j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i26, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f3515f : getPaddingLeft() + (((i4 - i2) - this.f3515f) / 2);
        if (z4) {
            i6 = virtualChildCount2 - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        int i28 = 0;
        while (i28 < virtualChildCount2) {
            int i29 = (i7 * i28) + i6;
            View childAt2 = getChildAt(i29);
            if (childAt2 == null) {
                i8 = i6;
            } else {
                i8 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C0866B0 c0866b02 = (C0866B0) childAt2.getLayoutParams();
                    int i30 = paddingLeft2;
                    if (z5) {
                        i9 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) c0866b02).height != -1 ? childAt2.getBaseline() : -1;
                        i10 = ((LinearLayout.LayoutParams) c0866b02).gravity;
                        if (i10 < 0) {
                            i10 = i27;
                        }
                        i11 = i10 & 112;
                        if (i11 == 16) {
                            if (i11 == 48) {
                                i12 = i9 + ((LinearLayout.LayoutParams) c0866b02).topMargin;
                                if (baseline != -1) {
                                    i12 = (iArr[1] - baseline) + i12;
                                }
                            } else if (i11 != 80) {
                                i12 = i9;
                            } else {
                                i12 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0866b02).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i31 = (m2276i(i29) ? i30 + this.f3521l : i30) + ((LinearLayout.LayoutParams) c0866b02).leftMargin;
                            childAt2.layout(i31, i12, i31 + measuredWidth2, i12 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0866b02).rightMargin + i31;
                            i28++;
                            i6 = i8;
                            paddingTop2 = i9;
                        } else {
                            i12 = ((paddingBottom2 - measuredHeight3) / 2) + i9 + ((LinearLayout.LayoutParams) c0866b02).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c0866b02).bottomMargin;
                        }
                        i12 -= measuredHeight;
                        int i312 = (m2276i(i29) ? i30 + this.f3521l : i30) + ((LinearLayout.LayoutParams) c0866b02).leftMargin;
                        childAt2.layout(i312, i12, i312 + measuredWidth2, i12 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0866b02).rightMargin + i312;
                        i28++;
                        i6 = i8;
                        paddingTop2 = i9;
                    } else {
                        i9 = paddingTop2;
                    }
                    i10 = ((LinearLayout.LayoutParams) c0866b02).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    if (i11 == 16) {
                    }
                    i12 -= measuredHeight;
                    int i3122 = (m2276i(i29) ? i30 + this.f3521l : i30) + ((LinearLayout.LayoutParams) c0866b02).leftMargin;
                    childAt2.layout(i3122, i12, i3122 + measuredWidth2, i12 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0866b02).rightMargin + i3122;
                    i28++;
                    i6 = i8;
                    paddingTop2 = i9;
                }
            }
            i9 = paddingTop2;
            i28++;
            i6 = i8;
            paddingTop2 = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int iMax;
        int i6;
        int i7;
        int baseline;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        C0866B0 c0866b0;
        int i12;
        int[] iArr2;
        int i13;
        View view;
        int i14;
        boolean z4;
        boolean z5;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z6;
        int i23;
        int i24;
        int i25;
        View view2;
        boolean z7;
        AbstractC0868C0 abstractC0868C0 = this;
        int i26 = -2;
        int i27 = 1073741824;
        int i28 = 8;
        int iMax3 = 0;
        if (abstractC0868C0.f3513d == 1) {
            abstractC0868C0.f3515f = 0;
            int virtualChildCount = abstractC0868C0.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i29 = abstractC0868C0.f3511b;
            boolean z8 = abstractC0868C0.f3517h;
            int i30 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            int iMax6 = 0;
            float f = 0.0f;
            boolean z9 = false;
            int i31 = 0;
            boolean z10 = false;
            boolean z11 = true;
            while (i30 < virtualChildCount) {
                int i32 = mode;
                View childAt = abstractC0868C0.getChildAt(i30);
                if (childAt == null) {
                    abstractC0868C0.f3515f = abstractC0868C0.f3515f;
                } else {
                    if (childAt.getVisibility() != i28) {
                        if (abstractC0868C0.m2276i(i30)) {
                            abstractC0868C0.f3515f += abstractC0868C0.f3522m;
                        }
                        C0866B0 c0866b02 = (C0866B0) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) c0866b02).weight;
                        f += f2;
                        if (mode2 == i27 && ((LinearLayout.LayoutParams) c0866b02).height == 0 && f2 > 0.0f) {
                            int i33 = abstractC0868C0.f3515f;
                            abstractC0868C0.f3515f = Math.max(i33, ((LinearLayout.LayoutParams) c0866b02).topMargin + i33 + ((LinearLayout.LayoutParams) c0866b02).bottomMargin);
                            view2 = childAt;
                            i22 = mode2;
                            i23 = i29;
                            z6 = z8;
                            i24 = i30;
                            i25 = i32;
                            z9 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) c0866b02).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c0866b02).height = i26;
                                i19 = 0;
                            }
                            if (f == 0.0f) {
                                i20 = i30;
                                i21 = abstractC0868C0.f3515f;
                            } else {
                                i20 = i30;
                                i21 = 0;
                            }
                            i22 = mode2;
                            z6 = z8;
                            i23 = i29;
                            i24 = i20;
                            i25 = i32;
                            abstractC0868C0.measureChildWithMargins(childAt, i2, 0, i3, i21);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c0866b02).height = i19;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i34 = abstractC0868C0.f3515f;
                            view2 = childAt;
                            abstractC0868C0.f3515f = Math.max(i34, i34 + measuredHeight + ((LinearLayout.LayoutParams) c0866b02).topMargin + ((LinearLayout.LayoutParams) c0866b02).bottomMargin);
                            if (z6) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i23 >= 0 && i23 == i24 + 1) {
                            abstractC0868C0.f3512c = abstractC0868C0.f3515f;
                        }
                        if (i24 < i23 && ((LinearLayout.LayoutParams) c0866b02).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i25 == 1073741824 || ((LinearLayout.LayoutParams) c0866b02).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z10 = true;
                        }
                        int i35 = ((LinearLayout.LayoutParams) c0866b02).leftMargin + ((LinearLayout.LayoutParams) c0866b02).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i35;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z12 = z7;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i31, measuredState);
                        if (z11) {
                            i31 = iCombineMeasuredStates;
                            boolean z13 = ((LinearLayout.LayoutParams) c0866b02).width == -1;
                            if (((LinearLayout.LayoutParams) c0866b02).weight <= 0.0f) {
                                if (!z12) {
                                    i35 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i35);
                            } else {
                                if (!z12) {
                                    i35 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i35);
                            }
                            z11 = z13;
                            iMax3 = iMax7;
                        } else {
                            i31 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c0866b02).weight <= 0.0f) {
                        }
                        z11 = z13;
                        iMax3 = iMax7;
                    }
                    i30 = i24 + 1;
                    i29 = i23;
                    mode = i25;
                    z8 = z6;
                    mode2 = i22;
                    i26 = -2;
                    i27 = 1073741824;
                    i28 = 8;
                }
                i22 = mode2;
                i23 = i29;
                z6 = z8;
                i24 = i30;
                i25 = i32;
                i30 = i24 + 1;
                i29 = i23;
                mode = i25;
                z8 = z6;
                mode2 = i22;
                i26 = -2;
                i27 = 1073741824;
                i28 = 8;
            }
            int i36 = mode;
            int i37 = mode2;
            boolean z14 = z8;
            int i38 = i31;
            int i39 = i3;
            if (abstractC0868C0.f3515f > 0 && abstractC0868C0.m2276i(virtualChildCount)) {
                abstractC0868C0.f3515f += abstractC0868C0.f3522m;
            }
            if (z14 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
                abstractC0868C0.f3515f = 0;
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View childAt2 = abstractC0868C0.getChildAt(i40);
                    if (childAt2 == null) {
                        abstractC0868C0.f3515f = abstractC0868C0.f3515f;
                    } else if (childAt2.getVisibility() != 8) {
                        C0866B0 c0866b03 = (C0866B0) childAt2.getLayoutParams();
                        int i41 = abstractC0868C0.f3515f;
                        abstractC0868C0.f3515f = Math.max(i41, i41 + iMax6 + ((LinearLayout.LayoutParams) c0866b03).topMargin + ((LinearLayout.LayoutParams) c0866b03).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC0868C0.getPaddingBottom() + abstractC0868C0.getPaddingTop() + abstractC0868C0.f3515f;
            abstractC0868C0.f3515f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC0868C0.getSuggestedMinimumHeight()), i39, 0);
            int i42 = (iResolveSizeAndState & 16777215) - abstractC0868C0.f3515f;
            if (z9 || (i42 != 0 && f > 0.0f)) {
                float f3 = abstractC0868C0.f3516g;
                if (f3 > 0.0f) {
                    f = f3;
                }
                abstractC0868C0.f3515f = 0;
                int iCombineMeasuredStates2 = i38;
                int i43 = 0;
                while (i43 < virtualChildCount) {
                    View childAt3 = abstractC0868C0.getChildAt(i43);
                    if (childAt3.getVisibility() == 8) {
                        i16 = i43;
                    } else {
                        C0866B0 c0866b04 = (C0866B0) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) c0866b04).weight;
                        if (f4 > 0.0f) {
                            int i44 = (int) ((i42 * f4) / f);
                            f -= f4;
                            i42 -= i44;
                            i16 = i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, abstractC0868C0.getPaddingRight() + abstractC0868C0.getPaddingLeft() + ((LinearLayout.LayoutParams) c0866b04).leftMargin + ((LinearLayout.LayoutParams) c0866b04).rightMargin, ((LinearLayout.LayoutParams) c0866b04).width);
                            if (((LinearLayout.LayoutParams) c0866b04).height == 0) {
                                i18 = 1073741824;
                                if (i37 == 1073741824) {
                                    if (i44 <= 0) {
                                        i44 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i18 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i44;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i18));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        } else {
                            i16 = i43;
                        }
                        int i45 = ((LinearLayout.LayoutParams) c0866b04).leftMargin + ((LinearLayout.LayoutParams) c0866b04).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i45;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i36 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) c0866b04).width == -1) {
                                measuredWidth2 = i45;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z15 = z11 && ((LinearLayout.LayoutParams) c0866b04).width == i17;
                        int i46 = abstractC0868C0.f3515f;
                        abstractC0868C0.f3515f = Math.max(i46, childAt3.getMeasuredHeight() + i46 + ((LinearLayout.LayoutParams) c0866b04).topMargin + ((LinearLayout.LayoutParams) c0866b04).bottomMargin);
                        z11 = z15;
                    }
                    i43 = i16 + 1;
                }
                abstractC0868C0.f3515f = abstractC0868C0.getPaddingBottom() + abstractC0868C0.getPaddingTop() + abstractC0868C0.f3515f;
                i38 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z14 && i37 != 1073741824) {
                    for (int i47 = 0; i47 < virtualChildCount; i47++) {
                        View childAt4 = abstractC0868C0.getChildAt(i47);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0866B0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i36 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC0868C0.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC0868C0.getPaddingRight() + abstractC0868C0.getPaddingLeft() + iMax4, abstractC0868C0.getSuggestedMinimumWidth()), i2, i38), iResolveSizeAndState);
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC0868C0.getMeasuredWidth(), 1073741824);
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt5 = abstractC0868C0.getChildAt(i48);
                    if (childAt5.getVisibility() != 8) {
                        C0866B0 c0866b05 = (C0866B0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0866b05).width == -1) {
                            int i49 = ((LinearLayout.LayoutParams) c0866b05).height;
                            ((LinearLayout.LayoutParams) c0866b05).height = childAt5.getMeasuredHeight();
                            abstractC0868C0.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i39, 0);
                            ((LinearLayout.LayoutParams) c0866b05).height = i49;
                        }
                    }
                    i48++;
                    i39 = i3;
                }
                return;
            }
            return;
        }
        int i50 = i2;
        abstractC0868C0.f3515f = 0;
        int virtualChildCount2 = abstractC0868C0.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i50);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (abstractC0868C0.f3518i == null || abstractC0868C0.f3519j == null) {
            abstractC0868C0.f3518i = new int[4];
            abstractC0868C0.f3519j = new int[4];
        }
        int[] iArr3 = abstractC0868C0.f3518i;
        int[] iArr4 = abstractC0868C0.f3519j;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = abstractC0868C0.f3510a;
        boolean z17 = abstractC0868C0.f3517h;
        boolean z18 = mode3 == 1073741824;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z19 = false;
        boolean z20 = false;
        float f5 = 0.0f;
        boolean z21 = true;
        while (i51 < virtualChildCount2) {
            View childAt6 = abstractC0868C0.getChildAt(i51);
            if (childAt6 == null) {
                abstractC0868C0.f3515f = abstractC0868C0.f3515f;
                i11 = i51;
                i15 = i53;
                iArr2 = iArr3;
                iArr = iArr4;
                z2 = z16;
                z3 = z17;
            } else {
                int i54 = i52;
                if (childAt6.getVisibility() == 8) {
                    i50 = i2;
                    i11 = i51;
                    i15 = i53;
                    iArr = iArr4;
                    z2 = z16;
                    z3 = z17;
                    i52 = i54;
                    iArr2 = iArr3;
                } else {
                    if (abstractC0868C0.m2276i(i51)) {
                        abstractC0868C0.f3515f += abstractC0868C0.f3521l;
                    }
                    C0866B0 c0866b06 = (C0866B0) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c0866b06).weight;
                    f5 += f6;
                    int i55 = i51;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0866b06).width == 0 && f6 > 0.0f) {
                        if (z18) {
                            abstractC0868C0.f3515f = ((LinearLayout.LayoutParams) c0866b06).leftMargin + ((LinearLayout.LayoutParams) c0866b06).rightMargin + abstractC0868C0.f3515f;
                        } else {
                            int i56 = abstractC0868C0.f3515f;
                            abstractC0868C0.f3515f = Math.max(i56, ((LinearLayout.LayoutParams) c0866b06).leftMargin + i56 + ((LinearLayout.LayoutParams) c0866b06).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i12 = i54;
                            i11 = i55;
                            c0866b0 = c0866b06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i2;
                            i13 = i53;
                            i10 = iMax8;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i12 = i54;
                            i11 = i55;
                            i14 = 1073741824;
                            z20 = true;
                            c0866b0 = c0866b06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i2;
                            i13 = i53;
                            i10 = iMax8;
                            if (mode4 == i14 && ((LinearLayout.LayoutParams) c0866b0).height == -1) {
                                z4 = true;
                                z19 = true;
                            } else {
                                z4 = false;
                            }
                            int i57 = ((LinearLayout.LayoutParams) c0866b0).topMargin + ((LinearLayout.LayoutParams) c0866b0).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i57;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i58 = ((LinearLayout.LayoutParams) c0866b0).gravity;
                                    if (i58 < 0) {
                                        i58 = abstractC0868C0.f3514e;
                                    }
                                    int i59 = (((i58 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i59] = Math.max(iArr2[i59], baseline2);
                                    iArr[i59] = Math.max(iArr[i59], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax10 = Math.max(i12, measuredHeight3);
                            boolean z22 = !z21 && ((LinearLayout.LayoutParams) c0866b0).height == -1;
                            if (((LinearLayout.LayoutParams) c0866b0).weight <= 0.0f) {
                                if (!z5) {
                                    i57 = measuredHeight3;
                                }
                                iMax8 = Math.max(i10, i57);
                                iMax2 = i13;
                            } else {
                                if (!z5) {
                                    i57 = measuredHeight3;
                                }
                                iMax2 = Math.max(i13, i57);
                                iMax8 = i10;
                            }
                            int i60 = iMax2;
                            i52 = iMax10;
                            i15 = i60;
                            z21 = z22;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c0866b06).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c0866b06).width = -2;
                            i9 = 0;
                        }
                        iArr = iArr4;
                        i10 = iMax8;
                        i11 = i55;
                        z2 = z16;
                        z3 = z17;
                        int i61 = i9;
                        c0866b0 = c0866b06;
                        i12 = i54;
                        i50 = i2;
                        iArr2 = iArr3;
                        i13 = i53;
                        abstractC0868C0.measureChildWithMargins(childAt6, i50, f5 == 0.0f ? abstractC0868C0.f3515f : 0, i3, 0);
                        if (i61 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0866b0).width = i61;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z18) {
                            view = childAt6;
                            abstractC0868C0.f3515f = ((LinearLayout.LayoutParams) c0866b0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0866b0).rightMargin + abstractC0868C0.f3515f;
                        } else {
                            view = childAt6;
                            int i62 = abstractC0868C0.f3515f;
                            abstractC0868C0.f3515f = Math.max(i62, i62 + measuredWidth3 + ((LinearLayout.LayoutParams) c0866b0).leftMargin + ((LinearLayout.LayoutParams) c0866b0).rightMargin);
                        }
                        if (z3) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z4 = false;
                        int i572 = ((LinearLayout.LayoutParams) c0866b0).topMargin + ((LinearLayout.LayoutParams) c0866b0).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i572;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z2) {
                        }
                        int iMax102 = Math.max(i12, measuredHeight32);
                        if (z21) {
                            if (((LinearLayout.LayoutParams) c0866b0).weight <= 0.0f) {
                            }
                            int i602 = iMax2;
                            i52 = iMax102;
                            i15 = i602;
                            z21 = z22;
                        }
                    }
                }
            }
            i53 = i15;
            i51 = i11 + 1;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z2;
            z17 = z3;
        }
        int i63 = i52;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        boolean z23 = z16;
        boolean z24 = z17;
        int i64 = i53;
        int i65 = iMax8;
        if (abstractC0868C0.f3515f > 0 && abstractC0868C0.m2276i(virtualChildCount2)) {
            abstractC0868C0.f3515f += abstractC0868C0.f3521l;
        }
        int i66 = iArr5[1];
        int iMax11 = (i66 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i63 : Math.max(i63, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i66, iArr5[2]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC0868C0.f3515f = 0;
            for (int i67 = 0; i67 < virtualChildCount2; i67++) {
                View childAt7 = abstractC0868C0.getChildAt(i67);
                if (childAt7 == null) {
                    abstractC0868C0.f3515f = abstractC0868C0.f3515f;
                } else if (childAt7.getVisibility() != 8) {
                    C0866B0 c0866b07 = (C0866B0) childAt7.getLayoutParams();
                    if (z18) {
                        abstractC0868C0.f3515f = ((LinearLayout.LayoutParams) c0866b07).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c0866b07).rightMargin + abstractC0868C0.f3515f;
                    } else {
                        int i68 = abstractC0868C0.f3515f;
                        abstractC0868C0.f3515f = Math.max(i68, i68 + iMax9 + ((LinearLayout.LayoutParams) c0866b07).leftMargin + ((LinearLayout.LayoutParams) c0866b07).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC0868C0.getPaddingRight() + abstractC0868C0.getPaddingLeft() + abstractC0868C0.f3515f;
        abstractC0868C0.f3515f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC0868C0.getSuggestedMinimumWidth()), i50, 0);
        int i69 = (iResolveSizeAndState2 & 16777215) - abstractC0868C0.f3515f;
        if (z20 || (i69 != 0 && f5 > 0.0f)) {
            float f7 = abstractC0868C0.f3516g;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC0868C0.f3515f = 0;
            iMax11 = -1;
            int i70 = 0;
            while (i70 < virtualChildCount2) {
                View childAt8 = abstractC0868C0.getChildAt(i70);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i6 = iResolveSizeAndState2;
                } else {
                    C0866B0 c0866b08 = (C0866B0) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) c0866b08).weight;
                    if (f8 > 0.0f) {
                        int i71 = (int) ((i69 * f8) / f5);
                        f5 -= f8;
                        i69 -= i71;
                        i6 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, abstractC0868C0.getPaddingBottom() + abstractC0868C0.getPaddingTop() + ((LinearLayout.LayoutParams) c0866b08).topMargin + ((LinearLayout.LayoutParams) c0866b08).bottomMargin, ((LinearLayout.LayoutParams) c0866b08).height);
                        if (((LinearLayout.LayoutParams) c0866b08).width == 0) {
                            i8 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i71 <= 0) {
                                    i71 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i71, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i71;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i6 = iResolveSizeAndState2;
                    }
                    if (z18) {
                        abstractC0868C0.f3515f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0866b08).leftMargin + ((LinearLayout.LayoutParams) c0866b08).rightMargin + abstractC0868C0.f3515f;
                    } else {
                        int i72 = abstractC0868C0.f3515f;
                        abstractC0868C0.f3515f = Math.max(i72, childAt8.getMeasuredWidth() + i72 + ((LinearLayout.LayoutParams) c0866b08).leftMargin + ((LinearLayout.LayoutParams) c0866b08).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0866b08).height == -1;
                    int i73 = ((LinearLayout.LayoutParams) c0866b08).topMargin + ((LinearLayout.LayoutParams) c0866b08).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i73;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z25) {
                        i73 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i64, i73);
                    if (z21) {
                        i7 = -1;
                        boolean z26 = ((LinearLayout.LayoutParams) c0866b08).height == -1;
                        if (!z23 && (baseline = childAt8.getBaseline()) != i7) {
                            int i74 = ((LinearLayout.LayoutParams) c0866b08).gravity;
                            if (i74 < 0) {
                                i74 = abstractC0868C0.f3514e;
                            }
                            int i75 = (((i74 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i75] = Math.max(iArr5[i75], baseline);
                            iArr6[i75] = Math.max(iArr6[i75], measuredHeight4 - baseline);
                        }
                        z21 = z26;
                        i64 = iMax12;
                    } else {
                        i7 = -1;
                    }
                    if (!z23) {
                        z21 = z26;
                        i64 = iMax12;
                    }
                }
                i70++;
                iResolveSizeAndState2 = i6;
            }
            i4 = iResolveSizeAndState2;
            i5 = -16777216;
            abstractC0868C0.f3515f = abstractC0868C0.getPaddingRight() + abstractC0868C0.getPaddingLeft() + abstractC0868C0.f3515f;
            int i76 = iArr5[1];
            if (i76 != -1 || iArr5[0] != -1 || iArr5[2] != -1 || iArr5[3] != -1) {
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i76, iArr5[2]))));
            }
            iMax = i64;
        } else {
            iMax = Math.max(i64, i65);
            if (z24 && mode3 != 1073741824) {
                for (int i77 = 0; i77 < virtualChildCount2; i77++) {
                    View childAt9 = abstractC0868C0.getChildAt(i77);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0866B0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = iResolveSizeAndState2;
            i5 = -16777216;
        }
        if (!z21 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        abstractC0868C0.setMeasuredDimension(i4 | (iCombineMeasuredStates3 & i5), View.resolveSizeAndState(Math.max(abstractC0868C0.getPaddingBottom() + abstractC0868C0.getPaddingTop() + iMax11, abstractC0868C0.getSuggestedMinimumHeight()), i3, iCombineMeasuredStates3 << 16));
        if (z19) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC0868C0.getMeasuredHeight(), 1073741824);
            int i78 = 0;
            while (i78 < virtualChildCount2) {
                View childAt10 = abstractC0868C0.getChildAt(i78);
                if (childAt10.getVisibility() != 8) {
                    C0866B0 c0866b09 = (C0866B0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0866b09).height == -1) {
                        int i79 = ((LinearLayout.LayoutParams) c0866b09).width;
                        ((LinearLayout.LayoutParams) c0866b09).width = childAt10.getMeasuredWidth();
                        abstractC0868C0.measureChildWithMargins(childAt10, i50, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c0866b09).width = i79;
                    }
                }
                i78++;
                abstractC0868C0 = this;
                i50 = i2;
            }
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f3510a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f3511b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3520k) {
            return;
        }
        this.f3520k = drawable;
        if (drawable != null) {
            this.f3521l = drawable.getIntrinsicWidth();
            this.f3522m = drawable.getIntrinsicHeight();
        } else {
            this.f3521l = 0;
            this.f3522m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f3524o = i2;
    }

    public void setGravity(int i2) {
        if (this.f3514e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f3514e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f3514e;
        if ((8388615 & i4) != i3) {
            this.f3514e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f3517h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f3513d != i2) {
            this.f3513d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f3523n) {
            requestLayout();
        }
        this.f3523n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f3514e;
        if ((i4 & 112) != i3) {
            this.f3514e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f3516g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
