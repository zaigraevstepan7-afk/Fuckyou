package p074l;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.F0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0874F0 {
    /* JADX INFO: renamed from: a */
    public static void m2284a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: renamed from: b */
    public static void m2285b(PopupWindow popupWindow, boolean z2) {
        popupWindow.setIsClippedToScreen(z2);
    }
}
