package p024N;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: N.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0264i {
    /* JADX INFO: renamed from: a */
    public static DisplayCutout m827a(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    /* JADX INFO: renamed from: b */
    public static List<Rect> m828b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: c */
    public static int m829c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: d */
    public static int m830d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: e */
    public static int m831e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: f */
    public static int m832f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
