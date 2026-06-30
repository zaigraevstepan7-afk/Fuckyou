package p074l;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0471p;
import java.util.Objects;

/* JADX INFO: renamed from: l.e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0928e1 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m2368a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m2369b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0471p(2, runnable);
    }

    /* JADX INFO: renamed from: c */
    public static void m2370c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m2371d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
