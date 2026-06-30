package p005C0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.C0616k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.reddit.frontpage.R;
import p024N.C0250b;
import p026O.C0310j;
import p026O.C0311k;

/* JADX INFO: renamed from: C0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0035a extends C0250b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f78d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f79e;

    public /* synthetic */ C0035a(int i2, Object obj) {
        this.f78d = i2;
        this.f79e = obj;
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: c */
    public void mo250c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f78d) {
            case 0:
                super.mo250c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f79e).f2277d);
                break;
            default:
                super.mo250c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: d */
    public final void mo251d(View view, C0311k c0311k) {
        int i2;
        Object obj = this.f79e;
        View.AccessibilityDelegate accessibilityDelegate = this.f794a;
        switch (this.f78d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c0311k.f911a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2278e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f2277d);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0311k.f911a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2289x);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0311k.f911a);
                C0616k c0616k = (C0616k) obj;
                c0311k.m977k(c0616k.f2222e0.getVisibility() == 0 ? c0616k.m1453B().getResources().getString(R.string.resc) : c0616k.m1453B().getResources().getString(R.string.resc));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0311k.f911a);
                int i3 = MaterialButtonToggleGroup.f2142k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    i2 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) != view) {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.m1713c(i4)) {
                                i2++;
                            }
                        }
                    }
                    i2 = -1;
                } else {
                    i2 = -1;
                }
                c0311k.m976j(C0310j.m966a(((MaterialButton) view).f2139o, 0, 1, i2, 1));
                break;
        }
    }
}
