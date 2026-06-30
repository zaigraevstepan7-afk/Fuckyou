package p074l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p001A0.AbstractC0016e;
import p009F.AbstractC0074a;
import p057d.AbstractC0641a;

/* JADX INFO: renamed from: l.Y0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0911Y0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3675a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f3676b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f3677c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f3678d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f3679e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f3680f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f3681g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m2344a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0641a.f2489j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m2345b(Context context, int i2) {
        ColorStateList colorStateListM2347d = m2347d(context, i2);
        if (colorStateListM2347d != null && colorStateListM2347d.isStateful()) {
            return colorStateListM2347d.getColorForState(f3676b, colorStateListM2347d.getDefaultColor());
        }
        ThreadLocal threadLocal = f3675a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC0074a.m356e(m2346c(context, i2), Math.round(Color.alpha(r4) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m2346c(Context context, int i2) {
        int[] iArr = f3681g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m2347d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f3681g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0016e.m160I(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
