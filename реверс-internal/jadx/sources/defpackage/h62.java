package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.reddit.secondpage.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h62 {
    public static Field a;
    public static boolean b;

    static {
        new WeakHashMap();
    }

    public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            e62.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0029, B:17:0x0033), top: B:32:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(ViewGroup viewGroup, u0 u0Var) {
        Object obj;
        View.AccessibilityDelegate accessibilityDelegateA;
        if (u0Var == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegateA = e62.a(viewGroup);
            } else if (!b) {
                if (a == null) {
                    try {
                        Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                        a = declaredField;
                        declaredField.setAccessible(true);
                        try {
                            obj = a.get(viewGroup);
                        } catch (Throwable unused) {
                            b = true;
                        }
                    } catch (Throwable unused2) {
                        b = true;
                    }
                    accessibilityDelegateA = !(obj instanceof View.AccessibilityDelegate) ? (View.AccessibilityDelegate) obj : null;
                } else {
                    obj = a.get(viewGroup);
                    if (!(obj instanceof View.AccessibilityDelegate)) {
                    }
                }
            }
            if (accessibilityDelegateA instanceof t0) {
                u0Var = new u0();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(u0Var != null ? u0Var.f : null);
    }

    public static void c(View view, kl klVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(klVar != null ? new q72(klVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = p72.e;
        View.OnApplyWindowInsetsListener o72Var = klVar != null ? new o72(view, klVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, o72Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(o72Var);
        }
    }
}
