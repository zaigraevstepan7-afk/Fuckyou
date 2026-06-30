package p024N;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.reddit.frontpage.R;
import java.util.List;
import p005C0.C0048n;
import p052b0.C0595a;

/* JADX INFO: renamed from: N.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0261g0 extends AbstractC0267j0 {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f821e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final C0595a f822f = new C0595a();

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f823g = new DecelerateInterpolator();

    /* JADX INFO: renamed from: e */
    public static void m820e(View view) {
        C0254d c0254dM825j = m825j(view);
        if (c0254dM825j != null) {
            ((View) c0254dM825j.f800e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m820e(viewGroup.getChildAt(i2));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m821f(View view, WindowInsets windowInsets, boolean z2) {
        C0254d c0254dM825j = m825j(view);
        if (c0254dM825j != null) {
            c0254dM825j.f797b = windowInsets;
            if (!z2) {
                View view2 = (View) c0254dM825j.f800e;
                int[] iArr = (int[]) c0254dM825j.f801f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                c0254dM825j.f798c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m821f(viewGroup.getChildAt(i2), windowInsets, z2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m822g(View view, C0295x0 c0295x0, List list) {
        C0254d c0254dM825j = m825j(view);
        if (c0254dM825j != null) {
            c0254dM825j.m818b(c0295x0, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m822g(viewGroup.getChildAt(i2), c0295x0, list);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m823h(View view, C0048n c0048n) {
        C0254d c0254dM825j = m825j(view);
        if (c0254dM825j != null) {
            View view2 = (View) c0254dM825j.f800e;
            int[] iArr = (int[]) c0254dM825j.f801f;
            view2.getLocationOnScreen(iArr);
            int i2 = c0254dM825j.f798c - iArr[1];
            c0254dM825j.f799d = i2;
            view2.setTranslationY(i2);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m823h(viewGroup.getChildAt(i3), c0048n);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m824i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.resc) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: j */
    public static C0254d m825j(View view) {
        Object tag = view.getTag(R.id.resc);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0259f0) {
            return ((ViewOnApplyWindowInsetsListenerC0259f0) tag).f811a;
        }
        return null;
    }
}
