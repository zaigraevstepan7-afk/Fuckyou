package p024N;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: N.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227E {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m696a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m697b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m698c(View view) {
        view.requestApplyInsets();
    }
}
