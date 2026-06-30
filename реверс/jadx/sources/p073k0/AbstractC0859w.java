package p073k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import p015I0.C0109e;

/* JADX INFO: renamed from: k0.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859w {

    /* JADX INFO: renamed from: a */
    public static final C0109e f3492a;

    /* JADX INFO: renamed from: b */
    public static final C0838b f3493b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f3492a = new C0833D(23);
        } else if (i2 >= 23) {
            f3492a = new C0832C(23);
        } else if (i2 >= 22) {
            f3492a = new C0830A(23);
        } else {
            f3492a = new C0109e(23);
        }
        f3493b = new C0838b(Float.class, "translationAlpha", 5);
        new C0838b(Rect.class, "clipBounds", 6);
    }

    /* JADX INFO: renamed from: a */
    public static void m2265a(View view, int i2, int i3, int i4, int i5) {
        f3492a.mo464m(view, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: b */
    public static void m2266b(View view, int i2) {
        f3492a.mo467q(view, i2);
    }
}
