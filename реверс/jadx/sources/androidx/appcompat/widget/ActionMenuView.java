package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p000A.C0001b;
import p015I0.C0109e;
import p072k.C0818o;
import p072k.InterfaceC0799A;
import p072k.InterfaceC0815l;
import p072k.MenuC0816m;
import p074l.AbstractC0868C0;
import p074l.AbstractC0970s1;
import p074l.C0866B0;
import p074l.C0925d1;
import p074l.C0932g;
import p074l.C0941j;
import p074l.C0944k;
import p074l.C0950m;
import p074l.InterfaceC0947l;
import p074l.InterfaceC0953n;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0868C0 implements InterfaceC0815l, InterfaceC0799A {

    /* JADX INFO: renamed from: p */
    public MenuC0816m f1345p;

    /* JADX INFO: renamed from: q */
    public Context f1346q;

    /* JADX INFO: renamed from: r */
    public int f1347r;

    /* JADX INFO: renamed from: s */
    public boolean f1348s;

    /* JADX INFO: renamed from: t */
    public C0944k f1349t;

    /* JADX INFO: renamed from: u */
    public C0925d1 f1350u;

    /* JADX INFO: renamed from: v */
    public boolean f1351v;

    /* JADX INFO: renamed from: w */
    public int f1352w;

    /* JADX INFO: renamed from: x */
    public final int f1353x;

    /* JADX INFO: renamed from: y */
    public final int f1354y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0953n f1355z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1353x = (int) (56.0f * f);
        this.f1354y = (int) (f * 4.0f);
        this.f1346q = context;
        this.f1347r = 0;
    }

    /* JADX INFO: renamed from: j */
    public static C0950m m1212j() {
        C0950m c0950m = new C0950m(-2, -2);
        c0950m.f3787a = false;
        ((LinearLayout.LayoutParams) c0950m).gravity = 16;
        return c0950m;
    }

    /* JADX INFO: renamed from: k */
    public static C0950m m1213k(ViewGroup.LayoutParams layoutParams) {
        C0950m c0950m;
        if (layoutParams == null) {
            return m1212j();
        }
        if (layoutParams instanceof C0950m) {
            C0950m c0950m2 = (C0950m) layoutParams;
            c0950m = new C0950m(c0950m2);
            c0950m.f3787a = c0950m2.f3787a;
        } else {
            c0950m = new C0950m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0950m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0950m).gravity = 16;
        }
        return c0950m;
    }

    @Override // p072k.InterfaceC0815l
    /* JADX INFO: renamed from: b */
    public final boolean mo1195b(C0818o c0818o) {
        return this.f1345p.m2192q(c0818o, null, 0);
    }

    @Override // p072k.InterfaceC0799A
    /* JADX INFO: renamed from: c */
    public final void mo1196c(MenuC0816m menuC0816m) {
        this.f1345p = menuC0816m;
    }

    @Override // p074l.AbstractC0868C0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0950m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p074l.AbstractC0868C0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C0866B0 generateDefaultLayoutParams() {
        return m1212j();
    }

    @Override // p074l.AbstractC0868C0
    /* JADX INFO: renamed from: g */
    public final C0866B0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0950m(getContext(), attributeSet);
    }

    @Override // p074l.AbstractC0868C0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1212j();
    }

    @Override // p074l.AbstractC0868C0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1213k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1345p == null) {
            Context context = getContext();
            MenuC0816m menuC0816m = new MenuC0816m(context);
            this.f1345p = menuC0816m;
            menuC0816m.f3323e = new C0001b(26, this);
            C0944k c0944k = new C0944k(context);
            this.f1349t = c0944k;
            c0944k.f3744l = true;
            c0944k.f3745m = true;
            c0944k.f3737e = new C0109e(24);
            this.f1345p.m2185b(c0944k, this.f1346q);
            C0944k c0944k2 = this.f1349t;
            c0944k2.f3740h = this;
            this.f1345p = c0944k2.f3735c;
        }
        return this.f1345p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0944k c0944k = this.f1349t;
        C0941j c0941j = c0944k.f3741i;
        if (c0941j != null) {
            return c0941j.getDrawable();
        }
        if (c0944k.f3743k) {
            return c0944k.f3742j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1347r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p074l.AbstractC0868C0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C0866B0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1213k(layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1217l(int i2) {
        boolean zMo1192c = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0947l)) {
            zMo1192c = ((InterfaceC0947l) childAt).mo1192c();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0947l)) ? zMo1192c : ((InterfaceC0947l) childAt2).mo1191b() | zMo1192c;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0944k c0944k = this.f1349t;
        if (c0944k != null) {
            c0944k.mo2152c();
            if (this.f1349t.m2383i()) {
                this.f1349t.m2382e();
                this.f1349t.m2384l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0944k c0944k = this.f1349t;
        if (c0944k != null) {
            c0944k.m2382e();
            C0932g c0932g = c0944k.f3752t;
            if (c0932g == null || !c0932g.m2206b()) {
                return;
            }
            c0932g.f3395i.dismiss();
        }
    }

    @Override // p074l.AbstractC0868C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f1351v) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = AbstractC0970s1.f3845a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0950m c0950m = (C0950m) childAt.getLayoutParams();
                if (c0950m.f3787a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1217l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0950m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0950m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0950m).leftMargin) + ((LinearLayout.LayoutParams) c0950m).rightMargin;
                    m1217l(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0950m c0950m2 = (C0950m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0950m2.f3787a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0950m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0950m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0950m c0950m3 = (C0950m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0950m3.f3787a) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c0950m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0950m3).rightMargin + iMax + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p074l.AbstractC0868C0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        ?? r11;
        int i6;
        int i7;
        MenuC0816m menuC0816m;
        boolean z2 = this.f1351v;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1351v = z3;
        if (z2 != z3) {
            this.f1352w = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1351v && (menuC0816m = this.f1345p) != null && size != this.f1352w) {
            this.f1352w = size;
            menuC0816m.m2191p(true);
        }
        int childCount = getChildCount();
        if (!this.f1351v || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C0950m c0950m = (C0950m) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c0950m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0950m).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f1353x;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        boolean z4 = false;
        int i16 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f1354y;
            if (i15 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i15);
            int i17 = size3;
            int i18 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i6 = i13;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z5) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0950m c0950m2 = (C0950m) childAt.getLayoutParams();
                c0950m2.f3792f = false;
                c0950m2.f3789c = 0;
                c0950m2.f3788b = 0;
                c0950m2.f3790d = false;
                ((LinearLayout.LayoutParams) c0950m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0950m2).rightMargin = 0;
                c0950m2.f3791e = z5 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i19 = c0950m2.f3787a ? 1 : i11;
                C0950m c0950m3 = (C0950m) childAt.getLayoutParams();
                int i20 = i11;
                i6 = i13;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i18, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z7 = z6;
                if (i19 <= 0 || (z6 && i19 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i19, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i6;
                    if (measuredWidth % i6 != 0) {
                        i7++;
                    }
                    if (z7 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c0950m3.f3790d = !c0950m3.f3787a && z7;
                c0950m3.f3788b = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i6, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i7);
                if (c0950m2.f3790d) {
                    i16++;
                }
                if (c0950m2.f3787a) {
                    z4 = true;
                }
                i11 = i20 - i7;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j2 |= (long) (1 << i15);
                }
            }
            i15++;
            size3 = i17;
            paddingBottom = i18;
            i13 = i6;
        }
        int i21 = size3;
        int i22 = i11;
        int i23 = i13;
        boolean z8 = z4 && i14 == 2;
        int i24 = i22;
        boolean z9 = false;
        while (i16 > 0 && i24 > 0) {
            int i25 = Integer.MAX_VALUE;
            long j3 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i27 < childCount2) {
                boolean z10 = z8;
                C0950m c0950m4 = (C0950m) getChildAt(i27).getLayoutParams();
                int i28 = iMax;
                if (c0950m4.f3790d) {
                    int i29 = c0950m4.f3788b;
                    if (i29 < i25) {
                        j3 = 1 << i27;
                        i25 = i29;
                        i26 = 1;
                    } else if (i29 == i25) {
                        j3 |= 1 << i27;
                        i26++;
                    }
                }
                i27++;
                iMax = i28;
                z8 = z10;
            }
            boolean z11 = z8;
            i5 = iMax;
            j2 |= j3;
            if (i26 > i24) {
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                C0950m c0950m5 = (C0950m) childAt2.getLayoutParams();
                boolean z12 = z4;
                long j4 = 1 << i31;
                if ((j3 & j4) != 0) {
                    if (z11 && c0950m5.f3791e) {
                        r11 = 1;
                        r11 = 1;
                        if (i24 == 1) {
                            childAt2.setPadding(i4 + i23, 0, i4, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0950m5.f3788b += r11;
                    c0950m5.f3792f = r11;
                    i24--;
                } else if (c0950m5.f3788b == i30) {
                    j2 |= j4;
                }
                i31++;
                z4 = z12;
            }
            iMax = i5;
            z8 = z11;
            z9 = true;
        }
        i5 = iMax;
        boolean z13 = !z4 && i14 == 1;
        if (i24 > 0 && j2 != 0 && (i24 < i14 - 1 || z13 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j2);
            if (!z13) {
                if ((j2 & 1) != 0 && !((C0950m) getChildAt(0).getLayoutParams()).f3791e) {
                    fBitCount -= 0.5f;
                }
                int i32 = childCount2 - 1;
                if ((j2 & ((long) (1 << i32))) != 0 && !((C0950m) getChildAt(i32).getLayoutParams()).f3791e) {
                    fBitCount -= 0.5f;
                }
            }
            int i33 = fBitCount > 0.0f ? (int) ((i24 * i23) / fBitCount) : 0;
            boolean z14 = z9;
            for (int i34 = 0; i34 < childCount2; i34++) {
                if ((j2 & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0950m c0950m6 = (C0950m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0950m6.f3789c = i33;
                        c0950m6.f3792f = true;
                        if (i34 == 0 && !c0950m6.f3791e) {
                            ((LinearLayout.LayoutParams) c0950m6).leftMargin = (-i33) / 2;
                        }
                        z14 = true;
                    } else if (c0950m6.f3787a) {
                        c0950m6.f3789c = i33;
                        c0950m6.f3792f = true;
                        ((LinearLayout.LayoutParams) c0950m6).rightMargin = (-i33) / 2;
                        z14 = true;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) c0950m6).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0950m6).rightMargin = i33 / 2;
                        }
                    }
                }
            }
            z9 = z14;
        }
        if (z9) {
            for (int i35 = 0; i35 < childCount2; i35++) {
                View childAt4 = getChildAt(i35);
                C0950m c0950m7 = (C0950m) childAt4.getLayoutParams();
                if (c0950m7.f3792f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0950m7.f3788b * i23) + c0950m7.f3789c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? i5 : i21);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1349t.f3749q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0953n interfaceC0953n) {
        this.f1355z = interfaceC0953n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0944k c0944k = this.f1349t;
        C0941j c0941j = c0944k.f3741i;
        if (c0941j != null) {
            c0941j.setImageDrawable(drawable);
        } else {
            c0944k.f3743k = true;
            c0944k.f3742j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1348s = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f1347r != i2) {
            this.f1347r = i2;
            if (i2 == 0) {
                this.f1346q = getContext();
            } else {
                this.f1346q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0944k c0944k) {
        this.f1349t = c0944k;
        c0944k.f3740h = this;
        this.f1345p = c0944k.f3735c;
    }

    @Override // p074l.AbstractC0868C0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0950m(getContext(), attributeSet);
    }
}
