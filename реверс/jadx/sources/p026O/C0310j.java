package p026O;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: O.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0310j {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo.CollectionItemInfo f909a;

    public C0310j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f909a = collectionItemInfo;
    }

    /* JADX INFO: renamed from: a */
    public static C0310j m966a(boolean z2, int i2, int i3, int i4, int i5) {
        return new C0310j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, false, z2));
    }
}
