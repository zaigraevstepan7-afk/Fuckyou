package p074l;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.M0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0888M0 {
    /* JADX INFO: renamed from: a */
    public static void m2311a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m2312b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
