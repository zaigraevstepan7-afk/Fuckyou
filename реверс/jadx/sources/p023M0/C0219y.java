package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.constraintlayout.helper.widget.C1146;
import com.google.android.material.appbar.C1153;
import com.google.android.material.datepicker.C1155;
import com.google.android.material.snackbar.C1157;
import com.google.android.material.textfield.TextInputLayout;
import com.reddit.frontpage.R;
import p004C.C1122;
import p011G.C1123;
import p015I0.C1125;
import p038U.C1137;
import p052b0.C1151;
import p052b0.C1152;
import p065g.C1159;
import p073k0.C1167;
import p074l.C0884K0;
import p074l.C0956o;
import p075l0.C1168;
import p081o0.C1170;
import p084q.C1173;
import p086r.C1174;
import p097x.C1178;
import p098x0.C1179;

/* JADX INFO: renamed from: M0.y */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0219y extends C0956o {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4841short = null;

    /* JADX INFO: renamed from: e */
    public final C0884K0 f750e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f751f;

    /* JADX INFO: renamed from: g */
    public final Rect f752g;

    /* JADX INFO: renamed from: h */
    public final int f753h;

    /* JADX INFO: renamed from: i */
    public final float f754i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f755j;

    /* JADX INFO: renamed from: k */
    public int f756k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f757l;

    static {
        ZLoader.registerNativesForClass(51, C0219y.class);
        Hidden0.special_clinit_51_00(C0219y.class);
    }

    public C0219y(Context context, AttributeSet attributeSet) {
        super(C1168.m4769(context, attributeSet, R.attr.resc, 0), attributeSet);
        this.f752g = new Rect();
        Context contextM3855 = C1146.m3855(this);
        TypedArray typedArrayM4876 = C1170.m4876(contextM3855, attributeSet, C1125.m2948(), R.attr.resc, R.style.resc, new int[0]);
        if (C1155.m4187(typedArrayM4876, 0) && C1123.m2853(typedArrayM4876, 0, 0) == 0) {
            C1152.m4027(this, null);
        }
        this.f753h = C1174.m5032(typedArrayM4876, 3, R.layout.resc);
        this.f754i = C1122.m2829(typedArrayM4876, 1, R.dimen.resc);
        if (C1155.m4187(typedArrayM4876, 2)) {
            this.f755j = C1153.m4070(C1167.m4729(typedArrayM4876, 2, 0));
        }
        this.f756k = C1167.m4729(typedArrayM4876, 4, 0);
        this.f757l = C1122.m2831(contextM3855, typedArrayM4876, 5);
        this.f751f = (AccessibilityManager) C1137.m3427(contextM3855, C1157.m4269(m3008(), 0, 13, 1753));
        C0884K0 c0884k0 = new C0884K0(contextM3855, null, R.attr.resc);
        this.f750e = c0884k0;
        c0884k0.f3576y = true;
        C1178.m5163(C1173.m4975(c0884k0), true);
        c0884k0.f3566o = this;
        C1152.m4029(C1173.m4975(c0884k0), 2);
        C1159.m4412(c0884k0, C1179.m5232(this));
        c0884k0.f3567p = new C0217w(0, this);
        if (C1155.m4187(typedArrayM4876, 6)) {
            C1155.m4169(this, C1174.m5032(typedArrayM4876, 6, 0));
        }
        C1151.m4006(typedArrayM4876);
    }

    /* JADX INFO: renamed from: a */
    public static native void m686a(C0219y c0219y, Object obj);

    /* JADX INFO: renamed from: ۟۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static native short[] m3008();

    /* JADX INFO: renamed from: ۟۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static native CharSequence m3009(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۣ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static native void m3010(Object obj, int i2, int i3);

    /* JADX INFO: renamed from: b */
    public final native TextInputLayout m687b();

    /* JADX INFO: renamed from: c */
    public final native boolean m688c();

    @Override // android.widget.AutoCompleteTextView
    public final native void dismissDropDown();

    public native ColorStateList getDropDownBackgroundTintList();

    @Override // android.widget.TextView
    public native CharSequence getHint();

    public native float getPopupElevation();

    public native int getSimpleItemSelectedColor();

    public native ColorStateList getSimpleItemSelectedRippleColor();

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final native void onAttachedToWindow();

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final native void onDetachedFromWindow();

    @Override // android.widget.TextView, android.view.View
    public final native void onMeasure(int i2, int i3);

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final native void onWindowFocusChanged(boolean z2);

    @Override // android.widget.AutoCompleteTextView
    public native <T extends ListAdapter & Filterable> void setAdapter(T t2);

    @Override // android.widget.AutoCompleteTextView
    public native void setDropDownBackgroundDrawable(Drawable drawable);

    public native void setDropDownBackgroundTint(int i2);

    public native void setDropDownBackgroundTintList(ColorStateList colorStateList);

    @Override // android.widget.AutoCompleteTextView
    public native void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener);

    @Override // android.widget.TextView
    public native void setRawInputType(int i2);

    public native void setSimpleItemSelectedColor(int i2);

    public native void setSimpleItemSelectedRippleColor(ColorStateList colorStateList);

    public native void setSimpleItems(int i2);

    public native void setSimpleItems(String[] strArr);

    @Override // android.widget.AutoCompleteTextView
    public final native void showDropDown();
}
