package p026O;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p000A.C0001b;

/* JADX INFO: renamed from: O.l */
/* JADX INFO: loaded from: classes.dex */
public class C0312l extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C0001b f913a;

    public C0312l(C0001b c0001b) {
        this.f913a = c0001b;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        C0311k c0311kMo32C = this.f913a.mo32C(i2);
        if (c0311kMo32C == null) {
            return null;
        }
        return c0311kMo32C.f911a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f913a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        C0311k c0311kMo33D = this.f913a.mo33D(i2);
        if (c0311kMo33D == null) {
            return null;
        }
        return c0311kMo33D.f911a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.f913a.mo35F(i2, i3, bundle);
    }
}
