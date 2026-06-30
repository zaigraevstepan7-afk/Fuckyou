package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class qp0 extends ViewGroup {
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public boolean l;
    public int[] m;
    public int[] n;
    public Drawable o;
    public int p;
    public int q;
    public int r;
    public int s;

    public qp0(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, 0);
        this.e = true;
        this.f = -1;
        this.g = 0;
        this.i = 8388659;
        int[] iArr = ub1.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        h62.a(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.k = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.f = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.l = typedArrayObtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!typedArrayObtainStyledAttributes.hasValue(5) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(5) : nu0.u(context, resourceId));
        this.r = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i) {
        this.o.setBounds(getPaddingLeft() + this.s, i, (getWidth() - getPaddingRight()) - this.s, this.q + i);
        this.o.draw(canvas);
    }

    public final void b(Canvas canvas, int i) {
        this.o.setBounds(i, getPaddingTop() + this.s, this.p + i, (getHeight() - getPaddingBottom()) - this.s);
        this.o.draw(canvas);
    }

    public final boolean c(int i) {
        if (i == 0) {
            return (this.r & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.r;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pp0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int i = this.h;
        if (i == 0) {
            return new pp0(-2, -2);
        }
        if (i == 1) {
            return new pp0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pp0 ? new pp0((pp0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new pp0((ViewGroup.MarginLayoutParams) layoutParams) : new pp0(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.g;
        if (this.h == 1 && (i = this.i & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.j) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.j;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((pp0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f;
    }

    public Drawable getDividerDrawable() {
        return this.o;
    }

    public int getDividerPadding() {
        return this.s;
    }

    public int getDividerWidth() {
        return this.p;
    }

    public int getGravity() {
        return this.i;
    }

    public int getOrientation() {
        return this.h;
    }

    public int getShowDividers() {
        return this.r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.o == null) {
            return;
        }
        int i2 = 0;
        if (this.h == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && c(i2)) {
                    a(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((pp0) childAt.getLayoutParams())).topMargin) - this.q);
                }
                i2++;
            }
            if (c(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.q : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((pp0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = w62.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && c(i2)) {
                pp0 pp0Var = (pp0) childAt3.getLayoutParams();
                b(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) pp0Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) pp0Var).leftMargin) - this.p);
            }
            i2++;
        }
        if (c(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                pp0 pp0Var2 = (pp0) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) pp0Var2).leftMargin;
                    i = this.p;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) pp0Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.p;
                right = left - i;
            }
            b(canvas, right);
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

    /* JADX WARN: Removed duplicated region for block: B:229:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
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
        boolean z;
        boolean z2;
        pp0 pp0Var;
        int i12;
        int[] iArr2;
        int i13;
        View view;
        int i14;
        boolean z3;
        boolean z4;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z5;
        int i23;
        int i24;
        int i25;
        View view2;
        boolean z6;
        qp0 qp0Var = this;
        int i26 = -2;
        int iMax3 = 0;
        int i27 = 1073741824;
        int i28 = 8;
        if (qp0Var.h == 1) {
            qp0Var.j = 0;
            int virtualChildCount = qp0Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i29 = qp0Var.f;
            boolean z7 = qp0Var.l;
            int i30 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z8 = false;
            int i31 = 0;
            boolean z9 = false;
            boolean z10 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i30 < virtualChildCount) {
                int i32 = mode;
                View childAt = qp0Var.getChildAt(i30);
                if (childAt == null) {
                    qp0Var.j = qp0Var.j;
                } else {
                    if (childAt.getVisibility() != i28) {
                        if (qp0Var.c(i30)) {
                            qp0Var.j += qp0Var.q;
                        }
                        pp0 pp0Var2 = (pp0) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) pp0Var2).weight;
                        f += f2;
                        if (mode2 == i27 && ((LinearLayout.LayoutParams) pp0Var2).height == 0 && f2 > 0.0f) {
                            int i33 = qp0Var.j;
                            qp0Var.j = Math.max(i33, ((LinearLayout.LayoutParams) pp0Var2).topMargin + i33 + ((LinearLayout.LayoutParams) pp0Var2).bottomMargin);
                            view2 = childAt;
                            i22 = mode2;
                            i23 = i29;
                            z5 = z7;
                            i24 = i30;
                            z8 = true;
                            i25 = i32;
                        } else {
                            if (((LinearLayout.LayoutParams) pp0Var2).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) pp0Var2).height = i26;
                                i19 = 0;
                            }
                            if (f == 0.0f) {
                                i20 = i30;
                                i21 = qp0Var.j;
                            } else {
                                i20 = i30;
                                i21 = 0;
                            }
                            i22 = mode2;
                            z5 = z7;
                            i23 = i29;
                            i24 = i20;
                            i25 = i32;
                            qp0Var.measureChildWithMargins(childAt, i, 0, i2, i21);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) pp0Var2).height = i19;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i34 = qp0Var.j;
                            view2 = childAt;
                            qp0Var.j = Math.max(i34, i34 + measuredHeight + ((LinearLayout.LayoutParams) pp0Var2).topMargin + ((LinearLayout.LayoutParams) pp0Var2).bottomMargin);
                            if (z5) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i23 >= 0 && i23 == i24 + 1) {
                            qp0Var.g = qp0Var.j;
                        }
                        if (i24 < i23 && ((LinearLayout.LayoutParams) pp0Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i25 == 1073741824 || ((LinearLayout.LayoutParams) pp0Var2).width != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                            z9 = true;
                        }
                        int i35 = ((LinearLayout.LayoutParams) pp0Var2).leftMargin + ((LinearLayout.LayoutParams) pp0Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i35;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z11 = z6;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i31, measuredState);
                        if (z10) {
                            i31 = iCombineMeasuredStates;
                            boolean z12 = ((LinearLayout.LayoutParams) pp0Var2).width == -1;
                            if (((LinearLayout.LayoutParams) pp0Var2).weight <= 0.0f) {
                                if (!z11) {
                                    i35 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i35);
                            } else {
                                if (!z11) {
                                    i35 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i35);
                            }
                            z10 = z12;
                        } else {
                            i31 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) pp0Var2).weight <= 0.0f) {
                        }
                        z10 = z12;
                    }
                    i30 = i24 + 1;
                    i29 = i23;
                    mode = i25;
                    z7 = z5;
                    mode2 = i22;
                    i26 = -2;
                    i27 = 1073741824;
                    i28 = 8;
                }
                i22 = mode2;
                i23 = i29;
                z5 = z7;
                i24 = i30;
                i25 = i32;
                i30 = i24 + 1;
                i29 = i23;
                mode = i25;
                z7 = z5;
                mode2 = i22;
                i26 = -2;
                i27 = 1073741824;
                i28 = 8;
            }
            int i36 = mode;
            int i37 = mode2;
            boolean z13 = z7;
            int i38 = i31;
            int i39 = i2;
            if (qp0Var.j > 0 && qp0Var.c(virtualChildCount)) {
                qp0Var.j += qp0Var.q;
            }
            if (z13 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
                qp0Var.j = 0;
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View childAt2 = qp0Var.getChildAt(i40);
                    if (childAt2 == null) {
                        qp0Var.j = qp0Var.j;
                    } else if (childAt2.getVisibility() != 8) {
                        pp0 pp0Var3 = (pp0) childAt2.getLayoutParams();
                        int i41 = qp0Var.j;
                        qp0Var.j = Math.max(i41, i41 + iMax6 + ((LinearLayout.LayoutParams) pp0Var3).topMargin + ((LinearLayout.LayoutParams) pp0Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = qp0Var.getPaddingBottom() + qp0Var.getPaddingTop() + qp0Var.j;
            qp0Var.j = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, qp0Var.getSuggestedMinimumHeight()), i39, 0);
            int i42 = (iResolveSizeAndState & 16777215) - qp0Var.j;
            if (z8 || (i42 != 0 && f > 0.0f)) {
                float f3 = qp0Var.k;
                if (f3 > 0.0f) {
                    f = f3;
                }
                qp0Var.j = 0;
                int iCombineMeasuredStates2 = i38;
                int i43 = 0;
                while (i43 < virtualChildCount) {
                    View childAt3 = qp0Var.getChildAt(i43);
                    if (childAt3.getVisibility() == 8) {
                        i16 = i43;
                    } else {
                        pp0 pp0Var4 = (pp0) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) pp0Var4).weight;
                        if (f4 > 0.0f) {
                            int i44 = (int) ((i42 * f4) / f);
                            f -= f4;
                            i42 -= i44;
                            i16 = i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, qp0Var.getPaddingRight() + qp0Var.getPaddingLeft() + ((LinearLayout.LayoutParams) pp0Var4).leftMargin + ((LinearLayout.LayoutParams) pp0Var4).rightMargin, ((LinearLayout.LayoutParams) pp0Var4).width);
                            if (((LinearLayout.LayoutParams) pp0Var4).height == 0) {
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
                        int i45 = ((LinearLayout.LayoutParams) pp0Var4).leftMargin + ((LinearLayout.LayoutParams) pp0Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i45;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i36 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) pp0Var4).width == -1) {
                                measuredWidth2 = i45;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z14 = z10 && ((LinearLayout.LayoutParams) pp0Var4).width == i17;
                        int i46 = qp0Var.j;
                        qp0Var.j = Math.max(i46, childAt3.getMeasuredHeight() + i46 + ((LinearLayout.LayoutParams) pp0Var4).topMargin + ((LinearLayout.LayoutParams) pp0Var4).bottomMargin);
                        z10 = z14;
                    }
                    i43 = i16 + 1;
                }
                qp0Var.j = qp0Var.getPaddingBottom() + qp0Var.getPaddingTop() + qp0Var.j;
                i38 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z13 && i37 != 1073741824) {
                    for (int i47 = 0; i47 < virtualChildCount; i47++) {
                        View childAt4 = qp0Var.getChildAt(i47);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((pp0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z10 || i36 == 1073741824) {
                iMax4 = iMax3;
            }
            qp0Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(qp0Var.getPaddingRight() + qp0Var.getPaddingLeft() + iMax4, qp0Var.getSuggestedMinimumWidth()), i, i38), iResolveSizeAndState);
            if (z9) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(qp0Var.getMeasuredWidth(), 1073741824);
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt5 = qp0Var.getChildAt(i48);
                    if (childAt5.getVisibility() != 8) {
                        pp0 pp0Var5 = (pp0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) pp0Var5).width == -1) {
                            int i49 = ((LinearLayout.LayoutParams) pp0Var5).height;
                            ((LinearLayout.LayoutParams) pp0Var5).height = childAt5.getMeasuredHeight();
                            qp0Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i39, 0);
                            ((LinearLayout.LayoutParams) pp0Var5).height = i49;
                        }
                    }
                    i48++;
                    i39 = i2;
                }
                return;
            }
            return;
        }
        int i50 = i;
        qp0Var.j = 0;
        int virtualChildCount2 = qp0Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i50);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (qp0Var.m == null || qp0Var.n == null) {
            qp0Var.m = new int[4];
            qp0Var.n = new int[4];
        }
        int[] iArr3 = qp0Var.m;
        int[] iArr4 = qp0Var.n;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z15 = qp0Var.e;
        boolean z16 = qp0Var.l;
        boolean z17 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z18 = true;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z19 = false;
        boolean z20 = false;
        while (i51 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = qp0Var.getChildAt(i51);
            if (childAt6 == null) {
                qp0Var.j = qp0Var.j;
                i11 = i51;
                i15 = i53;
                iArr2 = iArr3;
                iArr = iArr4;
                z = z15;
                z2 = z16;
            } else {
                int i54 = i52;
                if (childAt6.getVisibility() == 8) {
                    i50 = i;
                    i11 = i51;
                    i15 = i53;
                    iArr = iArr4;
                    z = z15;
                    z2 = z16;
                    i52 = i54;
                    iArr2 = iArr3;
                } else {
                    if (qp0Var.c(i51)) {
                        qp0Var.j += qp0Var.p;
                    }
                    pp0 pp0Var6 = (pp0) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) pp0Var6).weight;
                    f5 += f6;
                    int i55 = i51;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) pp0Var6).width == 0 && f6 > 0.0f) {
                        int i56 = qp0Var.j;
                        int i57 = ((LinearLayout.LayoutParams) pp0Var6).leftMargin;
                        if (z17) {
                            qp0Var.j = i57 + ((LinearLayout.LayoutParams) pp0Var6).rightMargin + i56;
                        } else {
                            qp0Var.j = Math.max(i56, i56 + i57 + ((LinearLayout.LayoutParams) pp0Var6).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            i12 = i54;
                            i11 = i55;
                            pp0Var = pp0Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax7;
                        } else {
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            z20 = true;
                            i12 = i54;
                            i11 = i55;
                            i14 = 1073741824;
                            pp0Var = pp0Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax7;
                            if (mode4 == i14 && ((LinearLayout.LayoutParams) pp0Var).height == -1) {
                                z3 = true;
                                z19 = true;
                            } else {
                                z3 = false;
                            }
                            int i58 = ((LinearLayout.LayoutParams) pp0Var).topMargin + ((LinearLayout.LayoutParams) pp0Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i58;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z) {
                                z4 = z3;
                            } else {
                                int baseline2 = view.getBaseline();
                                z4 = z3;
                                if (baseline2 != -1) {
                                    int i59 = ((LinearLayout.LayoutParams) pp0Var).gravity;
                                    if (i59 < 0) {
                                        i59 = qp0Var.i;
                                    }
                                    int i60 = (((i59 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i60] = Math.max(iArr2[i60], baseline2);
                                    iArr[i60] = Math.max(iArr[i60], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax9 = Math.max(i12, measuredHeight3);
                            boolean z21 = !z18 && ((LinearLayout.LayoutParams) pp0Var).height == -1;
                            if (((LinearLayout.LayoutParams) pp0Var).weight <= 0.0f) {
                                if (!z4) {
                                    i58 = measuredHeight3;
                                }
                                iMax7 = Math.max(i10, i58);
                                iMax2 = i13;
                            } else {
                                if (!z4) {
                                    i58 = measuredHeight3;
                                }
                                iMax2 = Math.max(i13, i58);
                                iMax7 = i10;
                            }
                            int i61 = iMax2;
                            i52 = iMax9;
                            i15 = i61;
                            z18 = z21;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) pp0Var6).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) pp0Var6).width = -2;
                            i9 = 0;
                        }
                        iArr = iArr4;
                        i10 = iMax7;
                        i11 = i55;
                        z = z15;
                        z2 = z16;
                        int i62 = i9;
                        pp0Var = pp0Var6;
                        i12 = i54;
                        i50 = i;
                        iArr2 = iArr3;
                        i13 = i53;
                        qp0Var.measureChildWithMargins(childAt6, i50, f5 == 0.0f ? qp0Var.j : 0, i2, 0);
                        if (i62 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) pp0Var).width = i62;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i63 = qp0Var.j;
                        int i64 = ((LinearLayout.LayoutParams) pp0Var).leftMargin;
                        if (z17) {
                            view = childAt6;
                            qp0Var.j = i64 + measuredWidth3 + ((LinearLayout.LayoutParams) pp0Var).rightMargin + i63;
                        } else {
                            view = childAt6;
                            qp0Var.j = Math.max(i63, i63 + measuredWidth3 + i64 + ((LinearLayout.LayoutParams) pp0Var).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z3 = false;
                        int i582 = ((LinearLayout.LayoutParams) pp0Var).topMargin + ((LinearLayout.LayoutParams) pp0Var).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i582;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                        }
                        int iMax92 = Math.max(i12, measuredHeight32);
                        if (z18) {
                            if (((LinearLayout.LayoutParams) pp0Var).weight <= 0.0f) {
                            }
                            int i612 = iMax2;
                            i52 = iMax92;
                            i15 = i612;
                            z18 = z21;
                        }
                    }
                }
            }
            i53 = i15;
            i51 = i11 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z15 = z;
            z16 = z2;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z22 = z15;
        boolean z23 = z16;
        int i65 = i52;
        int i66 = i53;
        int i67 = iMax7;
        if (qp0Var.j > 0 && qp0Var.c(virtualChildCount2)) {
            qp0Var.j += qp0Var.p;
        }
        int i68 = iArr5[1];
        int iMax10 = (i68 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i65 : Math.max(i65, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i68, iArr5[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            qp0Var.j = 0;
            for (int i69 = 0; i69 < virtualChildCount2; i69++) {
                View childAt7 = qp0Var.getChildAt(i69);
                if (childAt7 == null) {
                    qp0Var.j = qp0Var.j;
                } else if (childAt7.getVisibility() != 8) {
                    pp0 pp0Var7 = (pp0) childAt7.getLayoutParams();
                    int i70 = qp0Var.j;
                    if (z17) {
                        qp0Var.j = ((LinearLayout.LayoutParams) pp0Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) pp0Var7).rightMargin + i70;
                    } else {
                        qp0Var.j = Math.max(i70, i70 + iMax8 + ((LinearLayout.LayoutParams) pp0Var7).leftMargin + ((LinearLayout.LayoutParams) pp0Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = qp0Var.getPaddingRight() + qp0Var.getPaddingLeft() + qp0Var.j;
        qp0Var.j = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, qp0Var.getSuggestedMinimumWidth()), i50, 0);
        int i71 = (iResolveSizeAndState2 & 16777215) - qp0Var.j;
        if (z20 || (i71 != 0 && f5 > 0.0f)) {
            float f7 = qp0Var.k;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            qp0Var.j = 0;
            iMax10 = -1;
            int i72 = 0;
            while (i72 < virtualChildCount2) {
                View childAt8 = qp0Var.getChildAt(i72);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i6 = iResolveSizeAndState2;
                } else {
                    pp0 pp0Var8 = (pp0) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) pp0Var8).weight;
                    if (f8 > 0.0f) {
                        int i73 = (int) ((i71 * f8) / f5);
                        f5 -= f8;
                        i71 -= i73;
                        i6 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, qp0Var.getPaddingBottom() + qp0Var.getPaddingTop() + ((LinearLayout.LayoutParams) pp0Var8).topMargin + ((LinearLayout.LayoutParams) pp0Var8).bottomMargin, ((LinearLayout.LayoutParams) pp0Var8).height);
                        if (((LinearLayout.LayoutParams) pp0Var8).width == 0) {
                            i8 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i73 <= 0) {
                                    i73 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i73, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i73;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i6 = iResolveSizeAndState2;
                    }
                    int i74 = qp0Var.j;
                    if (z17) {
                        qp0Var.j = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) pp0Var8).leftMargin + ((LinearLayout.LayoutParams) pp0Var8).rightMargin + i74;
                    } else {
                        qp0Var.j = Math.max(i74, childAt8.getMeasuredWidth() + i74 + ((LinearLayout.LayoutParams) pp0Var8).leftMargin + ((LinearLayout.LayoutParams) pp0Var8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) pp0Var8).height == -1;
                    int i75 = ((LinearLayout.LayoutParams) pp0Var8).topMargin + ((LinearLayout.LayoutParams) pp0Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i75;
                    iMax10 = Math.max(iMax10, measuredHeight4);
                    if (!z24) {
                        i75 = measuredHeight4;
                    }
                    int iMax11 = Math.max(i66, i75);
                    if (z18) {
                        i7 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) pp0Var8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i7) {
                            int i76 = ((LinearLayout.LayoutParams) pp0Var8).gravity;
                            if (i76 < 0) {
                                i76 = qp0Var.i;
                            }
                            int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i77] = Math.max(iArr5[i77], baseline);
                            iArr6[i77] = Math.max(iArr6[i77], measuredHeight4 - baseline);
                        }
                        z18 = z25;
                        i66 = iMax11;
                    } else {
                        i7 = -1;
                    }
                    if (!z22) {
                        z18 = z25;
                        i66 = iMax11;
                    }
                }
                i72++;
                iResolveSizeAndState2 = i6;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            qp0Var.j = qp0Var.getPaddingRight() + qp0Var.getPaddingLeft() + qp0Var.j;
            int i78 = iArr5[1];
            if (i78 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax10 = Math.max(iMax10, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i78, iArr5[c3]))));
            }
            iMax = i66;
        } else {
            iMax = Math.max(i66, i67);
            if (z23 && mode3 != 1073741824) {
                for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                    View childAt9 = qp0Var.getChildAt(i79);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((pp0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z18 && mode4 != 1073741824) {
            iMax10 = iMax;
        }
        qp0Var.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(qp0Var.getPaddingBottom() + qp0Var.getPaddingTop() + iMax10, qp0Var.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z19) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(qp0Var.getMeasuredHeight(), 1073741824);
            int i80 = i5;
            while (i80 < virtualChildCount2) {
                View childAt10 = qp0Var.getChildAt(i80);
                if (childAt10.getVisibility() != 8) {
                    pp0 pp0Var9 = (pp0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) pp0Var9).height == -1) {
                        int i81 = ((LinearLayout.LayoutParams) pp0Var9).width;
                        ((LinearLayout.LayoutParams) pp0Var9).width = childAt10.getMeasuredWidth();
                        qp0Var.measureChildWithMargins(childAt10, i50, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) pp0Var9).width = i81;
                    }
                }
                i80++;
                qp0Var = this;
                i50 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.e = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.o) {
            return;
        }
        this.o = drawable;
        if (drawable != null) {
            this.p = drawable.getIntrinsicWidth();
            this.q = drawable.getIntrinsicHeight();
        } else {
            this.p = 0;
            this.q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.s = i;
    }

    public void setGravity(int i) {
        if (this.i != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.i = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.i;
        if ((8388615 & i3) != i2) {
            this.i = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.l = z;
    }

    public void setOrientation(int i) {
        if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.r) {
            requestLayout();
        }
        this.r = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.i;
        if ((i3 & 112) != i2) {
            this.i = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.k = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new pp0(getContext(), attributeSet);
    }
}
