package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: M0.u */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0215u extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C0216v f716a;

    static {
        ZLoader.registerNativesForClass(47, C0215u.class);
        Hidden0.special_clinit_47_00(C0215u.class);
    }

    public C0215u(C0216v c0216v) {
        this.f716a = c0216v;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final native void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo);
}
