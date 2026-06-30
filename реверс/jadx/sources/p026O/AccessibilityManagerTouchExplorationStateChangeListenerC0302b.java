package p026O;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p023M0.C0206l;
import p023M0.C0207m;
import p024N.AbstractC0240S;

/* JADX INFO: renamed from: O.b */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0302b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final C0206l f893a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0302b(C0206l c0206l) {
        this.f893a = c0206l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0302b) {
            return this.f893a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0302b) obj).f893a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f893a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        C0207m c0207m = (C0207m) this.f893a.f662a;
        AutoCompleteTextView autoCompleteTextView = c0207m.f666h;
        if (autoCompleteTextView == null || AbstractC0016e.m171b0(autoCompleteTextView)) {
            return;
        }
        int i2 = z2 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        c0207m.f710d.setImportantForAccessibility(i2);
    }
}
