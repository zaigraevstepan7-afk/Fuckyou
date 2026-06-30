package p024N;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.reddit.frontpage.R;
import p009F.C0076c;

/* JADX INFO: renamed from: N.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0229G {
    /* JADX INFO: renamed from: a */
    public static void m699a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.resc);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0295x0 m700b(View view, C0295x0 c0295x0, Rect rect) {
        WindowInsets windowInsetsM925f = c0295x0.m925f();
        if (windowInsetsM925f != null) {
            return C0295x0.m920g(view, view.computeSystemWindowInsets(windowInsetsM925f, rect));
        }
        rect.setEmpty();
        return c0295x0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m701c(View view, float f, float f2, boolean z2) {
        return view.dispatchNestedFling(f, f2, z2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m702d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m703e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m704f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m705g(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m706h(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: i */
    public static float m707i(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: j */
    public static C0295x0 m708j(View view) {
        if (!AbstractC0271l0.f842d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0271l0.f839a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0271l0.f840b.get(obj);
            Rect rect2 = (Rect) AbstractC0271l0.f841c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            AbstractC0279p0 c0277o0 = i2 >= 30 ? new C0277o0() : i2 >= 29 ? new C0275n0() : new C0273m0();
            c0277o0.mo869e(C0076c.m359b(rect.left, rect.top, rect.right, rect.bottom));
            c0277o0.mo870g(C0076c.m359b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0295x0 c0295x0Mo868b = c0277o0.mo868b();
            c0295x0Mo868b.f882a.mo901p(c0295x0Mo868b);
            c0295x0Mo868b.f882a.mo895d(view.getRootView());
            return c0295x0Mo868b;
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m709k(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: l */
    public static float m710l(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: m */
    public static float m711m(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m712n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m713o(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m714p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: q */
    public static void m715q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: r */
    public static void m716r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: s */
    public static void m717s(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: t */
    public static void m718t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    /* JADX INFO: renamed from: u */
    public static void m719u(View view, InterfaceC0282r interfaceC0282r) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.resc, interfaceC0282r);
        }
        if (interfaceC0282r == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.resc));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0228F(view, interfaceC0282r));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m720v(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m721w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: x */
    public static void m722x(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m723y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    /* JADX INFO: renamed from: z */
    public static void m724z(View view) {
        view.stopNestedScroll();
    }
}
