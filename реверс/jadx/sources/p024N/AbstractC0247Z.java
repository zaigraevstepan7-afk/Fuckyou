package p024N;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: N.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0247Z {
    /* JADX INFO: renamed from: a */
    public static boolean m798a(ViewParent viewParent, View view, float f, float f2, boolean z2) {
        return viewParent.onNestedFling(view, f, f2, z2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m799b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public static void m800c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
        viewParent.onNestedPreScroll(view, i2, i3, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m801d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
        viewParent.onNestedScroll(view, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: e */
    public static void m802e(ViewParent viewParent, View view, View view2, int i2) {
        viewParent.onNestedScrollAccepted(view, view2, i2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m803f(ViewParent viewParent, View view, View view2, int i2) {
        return viewParent.onStartNestedScroll(view, view2, i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m804g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
