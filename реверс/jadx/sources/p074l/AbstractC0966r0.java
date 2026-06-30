package p074l;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import p011G.C0097f;
import p011G.InterfaceC0096e;

/* JADX INFO: renamed from: l.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0966r0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f3838a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f3839b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f3840c = new Rect();

    /* JADX INFO: renamed from: a */
    public static void m2413a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        int[] iArr = f3838a;
        int[] iArr2 = f3839b;
        if (i2 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
            return;
        }
        if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr);
        } else {
            drawable.setState(iArr2);
        }
        drawable.setState(state2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Rect m2414b(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Insets insetsM2412a = AbstractC0963q0.m2412a(drawable);
            return new Rect(insetsM2412a.left, insetsM2412a.top, insetsM2412a.right, insetsM2412a.bottom);
        }
        boolean z2 = drawable instanceof InterfaceC0096e;
        Object obj = drawable;
        if (z2) {
            obj = ((C0097f) ((InterfaceC0096e) drawable)).f293f;
        }
        if (i2 >= 29) {
            boolean z3 = AbstractC0960p0.f3824a;
        } else if (AbstractC0960p0.f3824a) {
            try {
                Object objInvoke = AbstractC0960p0.f3825b.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(AbstractC0960p0.f3826c.getInt(objInvoke), AbstractC0960p0.f3827d.getInt(objInvoke), AbstractC0960p0.f3828e.getInt(objInvoke), AbstractC0960p0.f3829f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f3840c;
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m2415c(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
