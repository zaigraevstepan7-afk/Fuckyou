package p026O;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: O.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0308h {
    /* JADX INFO: renamed from: a */
    public static C0310j m944a(boolean z2, int i2, int i3, int i4, int i5, boolean z3, String str, String str2) {
        return new C0310j(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i4).setRowSpan(i5).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build());
    }

    /* JADX INFO: renamed from: b */
    public static C0311k m945b(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i3) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2, i3);
        if (child != null) {
            return new C0311k(child, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m946c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* JADX INFO: renamed from: d */
    public static String m947d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* JADX INFO: renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m948e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* JADX INFO: renamed from: f */
    public static C0311k m949f(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i2);
        if (parent != null) {
            return new C0311k(parent, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m950g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m951h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: i */
    public static void m952i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    /* JADX INFO: renamed from: j */
    public static void m953j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
