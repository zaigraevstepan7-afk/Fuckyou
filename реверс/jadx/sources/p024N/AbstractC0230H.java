package p024N;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: N.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0230H {
    /* JADX INFO: renamed from: a */
    public static C0295x0 m725a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0295x0 c0295x0M920g = C0295x0.m920g(null, rootWindowInsets);
        C0291v0 c0291v0 = c0295x0M920g.f882a;
        c0291v0.mo901p(c0295x0M920g);
        c0291v0.mo895d(view.getRootView());
        return c0295x0M920g;
    }

    /* JADX INFO: renamed from: b */
    public static int m726b(View view) {
        return view.getScrollIndicators();
    }

    /* JADX INFO: renamed from: c */
    public static void m727c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    /* JADX INFO: renamed from: d */
    public static void m728d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
