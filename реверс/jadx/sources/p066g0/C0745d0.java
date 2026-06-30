package p066g0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p024N.C0250b;
import p026O.C0311k;

/* JADX INFO: renamed from: g0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0745d0 extends C0250b {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f2960d;

    /* JADX INFO: renamed from: e */
    public final C0743c0 f2961e;

    public C0745d0(RecyclerView recyclerView) {
        this.f2960d = recyclerView;
        C0743c0 c0743c0 = this.f2961e;
        if (c0743c0 != null) {
            this.f2961e = c0743c0;
        } else {
            this.f2961e = new C0743c0(this);
        }
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: c */
    public final void mo250c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo250c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f2960d.m1607O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1561U(accessibilityEvent);
        }
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: d */
    public final void mo251d(View view, C0311k c0311k) {
        this.f794a.onInitializeAccessibilityNodeInfo(view, c0311k.f911a);
        RecyclerView recyclerView = this.f2960d;
        if (recyclerView.m1607O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0723K layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2862b;
        layoutManager.mo1504V(recyclerView2.f1962c, recyclerView2.f1967e0, c0311k);
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: g */
    public final boolean mo813g(View view, int i2, Bundle bundle) {
        if (super.mo813g(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2960d;
        if (recyclerView.m1607O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo1518i0(i2, bundle);
    }
}
