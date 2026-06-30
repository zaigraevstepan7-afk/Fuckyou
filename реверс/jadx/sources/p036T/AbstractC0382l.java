package p036T;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: T.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0382l {
    /* JADX INFO: renamed from: a */
    public static boolean m1022a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* JADX INFO: renamed from: b */
    public static int m1023b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* JADX INFO: renamed from: c */
    public static void m1024c(PopupWindow popupWindow, boolean z2) {
        popupWindow.setOverlapAnchor(z2);
    }

    /* JADX INFO: renamed from: d */
    public static void m1025d(PopupWindow popupWindow, int i2) {
        popupWindow.setWindowLayoutType(i2);
    }
}
