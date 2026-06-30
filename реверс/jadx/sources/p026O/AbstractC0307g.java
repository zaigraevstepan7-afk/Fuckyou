package p026O;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: O.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0307g {
    /* JADX INFO: renamed from: a */
    public static Object m941a(int i2, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m942b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m943c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
