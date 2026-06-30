package p024N;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: renamed from: N.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231I {
    /* JADX INFO: renamed from: a */
    public static void m729a(View view, Collection<View> collection, int i2) {
        view.addKeyboardNavigationClusters(collection, i2);
    }

    /* JADX INFO: renamed from: b */
    public static AutofillId m730b(View view) {
        return view.getAutofillId();
    }

    /* JADX INFO: renamed from: c */
    public static int m731c(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: d */
    public static int m732d(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m733e(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m734f(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m735g(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m736h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: i */
    public static View m737i(View view, View view2, int i2) {
        return view.keyboardNavigationClusterSearch(view2, i2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m738j(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: k */
    public static void m739k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m740l(View view, boolean z2) {
        view.setFocusedByDefault(z2);
    }

    /* JADX INFO: renamed from: m */
    public static void m741m(View view, int i2) {
        view.setImportantForAutofill(i2);
    }

    /* JADX INFO: renamed from: n */
    public static void m742n(View view, boolean z2) {
        view.setKeyboardNavigationCluster(z2);
    }

    /* JADX INFO: renamed from: o */
    public static void m743o(View view, int i2) {
        view.setNextClusterForwardId(i2);
    }

    /* JADX INFO: renamed from: p */
    public static void m744p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
