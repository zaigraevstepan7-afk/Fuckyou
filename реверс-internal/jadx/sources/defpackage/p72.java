package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.reddit.secondpage.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p72 extends s72 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final r50 f = new r50();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(t72 t72Var, View view) {
        kl klVarI = i(view);
        if (klVarI != null) {
            klVarI.e(t72Var);
            if (klVarI.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(t72Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, t72 t72Var, p82 p82Var, boolean z) {
        kl klVarI = i(view);
        if (klVarI != null) {
            klVarI.f = p82Var;
            if (!z) {
                klVarI.f(t72Var);
                z = klVarI.e == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), t72Var, p82Var, z);
            }
        }
    }

    public static void g(View view, p82 p82Var, List list) {
        kl klVarI = i(view);
        if (klVarI != null) {
            p82Var = klVarI.g(p82Var, list);
            if (klVarI.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), p82Var, list);
            }
        }
    }

    public static void h(View view, t72 t72Var, n81 n81Var) {
        kl klVarI = i(view);
        if (klVarI != null) {
            klVarI.h(t72Var, n81Var);
            if (klVarI.e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), t72Var, n81Var);
            }
        }
    }

    public static kl i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof o72) {
            return ((o72) tag).a;
        }
        return null;
    }
}
