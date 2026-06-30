package p024N;

import android.view.View;

/* JADX INFO: renamed from: N.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0235M {
    /* JADX INFO: renamed from: a */
    public static int m761a(View view) {
        return view.getImportantForContentCapture();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m762b(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m763c(View view) {
        return view.isImportantForContentCapture();
    }

    /* JADX INFO: renamed from: d */
    public static void m764d(View view, int i2) {
        view.setImportantForContentCapture(i2);
    }

    /* JADX INFO: renamed from: e */
    public static void m765e(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
