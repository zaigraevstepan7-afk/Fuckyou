package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: l.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0973u {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f3858b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0973u f3859c;

    /* JADX INFO: renamed from: a */
    public C0899S0 f3860a;

    /* JADX INFO: renamed from: a */
    public static synchronized C0973u m2423a() {
        try {
            if (f3859c == null) {
                m2425d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3859c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m2424c(int i2, PorterDuff.Mode mode) {
        return C0899S0.m2317h(i2, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m2425d() {
        if (f3859c == null) {
            C0973u c0973u = new C0973u();
            f3859c = c0973u;
            c0973u.f3860a = C0899S0.m2316d();
            f3859c.f3860a.m2328m(new C0971t());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2426e(Drawable drawable, C0916a1 c0916a1, int[] iArr) {
        PorterDuff.Mode mode = C0899S0.f3599h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c0916a1.f3702d;
        if (z2 || c0916a1.f3701c) {
            PorterDuffColorFilter porterDuffColorFilterM2317h = null;
            ColorStateList colorStateList = z2 ? c0916a1.f3699a : null;
            PorterDuff.Mode mode2 = c0916a1.f3701c ? c0916a1.f3700b : C0899S0.f3599h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM2317h = C0899S0.m2317h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM2317h);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m2427b(Context context, int i2) {
        return this.f3860a.m2323f(context, i2);
    }
}
