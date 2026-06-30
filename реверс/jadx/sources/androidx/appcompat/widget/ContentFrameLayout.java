package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p024N.C0249a0;
import p060e.C0678t;
import p060e.LayoutInflaterFactory2C0648D;
import p072k.MenuC0816m;
import p074l.C0932g;
import p074l.C0944k;
import p074l.C0946k1;
import p074l.InterfaceC0951m0;
import p074l.InterfaceC0954n0;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f1360a;

    /* JADX INFO: renamed from: b */
    public TypedValue f1361b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1362c;

    /* JADX INFO: renamed from: d */
    public TypedValue f1363d;

    /* JADX INFO: renamed from: e */
    public TypedValue f1364e;

    /* JADX INFO: renamed from: f */
    public TypedValue f1365f;

    /* JADX INFO: renamed from: g */
    public final Rect f1366g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0951m0 f1367h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1366g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1364e == null) {
            this.f1364e = new TypedValue();
        }
        return this.f1364e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1365f == null) {
            this.f1365f = new TypedValue();
        }
        return this.f1365f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1362c == null) {
            this.f1362c = new TypedValue();
        }
        return this.f1362c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1363d == null) {
            this.f1363d = new TypedValue();
        }
        return this.f1363d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1360a == null) {
            this.f1360a = new TypedValue();
        }
        return this.f1360a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1361b == null) {
            this.f1361b = new TypedValue();
        }
        return this.f1361b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0951m0 interfaceC0951m0 = this.f1367h;
        if (interfaceC0951m0 != null) {
            interfaceC0951m0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0944k c0944k;
        super.onDetachedFromWindow();
        InterfaceC0951m0 interfaceC0951m0 = this.f1367h;
        if (interfaceC0951m0 != null) {
            LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D = ((C0678t) interfaceC0951m0).f2721b;
            InterfaceC0954n0 interfaceC0954n0 = layoutInflaterFactory2C0648D.f2569r;
            if (interfaceC0954n0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0954n0;
                actionBarOverlayLayout.m1210k();
                ActionMenuView actionMenuView = ((C0946k1) actionBarOverlayLayout.f1323e).f3769a.f1388a;
                if (actionMenuView != null && (c0944k = actionMenuView.f1349t) != null) {
                    c0944k.m2382e();
                    C0932g c0932g = c0944k.f3752t;
                    if (c0932g != null && c0932g.m2206b()) {
                        c0932g.f3395i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0648D.f2574w != null) {
                layoutInflaterFactory2C0648D.f2563l.getDecorView().removeCallbacks(layoutInflaterFactory2C0648D.f2575x);
                if (layoutInflaterFactory2C0648D.f2574w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0648D.f2574w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0648D.f2574w = null;
            }
            C0249a0 c0249a0 = layoutInflaterFactory2C0648D.f2576y;
            if (c0249a0 != null) {
                c0249a0.m806b();
            }
            MenuC0816m menuC0816m = layoutInflaterFactory2C0648D.m1860z(0).f2516h;
            if (menuC0816m != null) {
                menuC0816m.m2186c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int iMakeMeasureSpec2;
        int i4;
        int i5;
        float fraction;
        int i6;
        int i7;
        float fraction2;
        int i8;
        int i9;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        Rect rect = this.f1366g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i2;
            z2 = false;
        } else {
            TypedValue typedValue = z4 ? this.f1363d : this.f1362c;
            if (typedValue != null && (i8 = typedValue.type) != 0) {
                if (i8 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i8 == 6) {
                    int i10 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i10, i10);
                } else {
                    i9 = 0;
                    if (i9 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.left + rect.right), View.MeasureSpec.getSize(i2)), 1073741824);
                        z2 = true;
                    }
                }
                i9 = (int) fraction3;
                if (i9 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i3;
        } else {
            TypedValue typedValue2 = z4 ? this.f1364e : this.f1365f;
            if (typedValue2 != null && (i6 = typedValue2.type) != 0) {
                if (i6 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i6 == 6) {
                    int i11 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i11, i11);
                } else {
                    i7 = 0;
                    if (i7 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i7 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                    }
                }
                i7 = (int) fraction2;
                if (i7 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z2 || mode != Integer.MIN_VALUE) {
            z3 = false;
        } else {
            TypedValue typedValue3 = z4 ? this.f1361b : this.f1360a;
            if (typedValue3 != null && (i4 = typedValue3.type) != 0) {
                if (i4 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i4 == 6) {
                    int i12 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i12, i12);
                } else {
                    i5 = 0;
                    if (i5 > 0) {
                        i5 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i5) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    }
                }
                i5 = (int) fraction;
                if (i5 > 0) {
                }
                if (measuredWidth >= i5) {
                }
            }
        }
        if (z3) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC0951m0 interfaceC0951m0) {
        this.f1367h = interfaceC0951m0;
    }
}
