package p012G0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: G0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0102d {

    /* JADX INFO: renamed from: a */
    public static final int[] f301a = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final String f302b = AbstractC0102d.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m448a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f301a, 0)) != 0) {
            Log.w(f302b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m449b(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z2 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }
}
