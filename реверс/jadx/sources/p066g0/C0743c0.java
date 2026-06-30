package p066g0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p000A.C0001b;
import p024N.C0250b;
import p026O.C0311k;

/* JADX INFO: renamed from: g0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0743c0 extends C0250b {

    /* JADX INFO: renamed from: d */
    public final C0745d0 f2955d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f2956e = new WeakHashMap();

    public C0743c0(C0745d0 c0745d0) {
        this.f2955d = c0745d0;
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: a */
    public final boolean mo810a(View view, AccessibilityEvent accessibilityEvent) {
        C0250b c0250b = (C0250b) this.f2956e.get(view);
        return c0250b != null ? c0250b.mo810a(view, accessibilityEvent) : this.f794a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: b */
    public final C0001b mo811b(View view) {
        C0250b c0250b = (C0250b) this.f2956e.get(view);
        return c0250b != null ? c0250b.mo811b(view) : super.mo811b(view);
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: c */
    public final void mo250c(View view, AccessibilityEvent accessibilityEvent) {
        C0250b c0250b = (C0250b) this.f2956e.get(view);
        if (c0250b != null) {
            c0250b.mo250c(view, accessibilityEvent);
        } else {
            super.mo250c(view, accessibilityEvent);
        }
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: d */
    public final void mo251d(View view, C0311k c0311k) {
        C0745d0 c0745d0 = this.f2955d;
        boolean zM1607O = c0745d0.f2960d.m1607O();
        View.AccessibilityDelegate accessibilityDelegate = this.f794a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0311k.f911a;
        if (!zM1607O) {
            RecyclerView recyclerView = c0745d0.f2960d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m2003W(view, c0311k);
                C0250b c0250b = (C0250b) this.f2956e.get(view);
                if (c0250b != null) {
                    c0250b.mo251d(view, c0311k);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: e */
    public final void mo631e(View view, AccessibilityEvent accessibilityEvent) {
        C0250b c0250b = (C0250b) this.f2956e.get(view);
        if (c0250b != null) {
            c0250b.mo631e(view, accessibilityEvent);
        } else {
            super.mo631e(view, accessibilityEvent);
        }
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: f */
    public final boolean mo812f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0250b c0250b = (C0250b) this.f2956e.get(viewGroup);
        return c0250b != null ? c0250b.mo812f(viewGroup, view, accessibilityEvent) : this.f794a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: g */
    public final boolean mo813g(View view, int i2, Bundle bundle) {
        C0745d0 c0745d0 = this.f2955d;
        if (!c0745d0.f2960d.m1607O()) {
            RecyclerView recyclerView = c0745d0.f2960d;
            if (recyclerView.getLayoutManager() != null) {
                C0250b c0250b = (C0250b) this.f2956e.get(view);
                if (c0250b != null) {
                    if (c0250b.mo813g(view, i2, bundle)) {
                        return true;
                    }
                } else if (super.mo813g(view, i2, bundle)) {
                    return true;
                }
                C0729Q c0729q = recyclerView.getLayoutManager().f2862b.f1962c;
                return false;
            }
        }
        return super.mo813g(view, i2, bundle);
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: h */
    public final void mo814h(View view, int i2) {
        C0250b c0250b = (C0250b) this.f2956e.get(view);
        if (c0250b != null) {
            c0250b.mo814h(view, i2);
        } else {
            super.mo814h(view, i2);
        }
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: i */
    public final void mo815i(View view, AccessibilityEvent accessibilityEvent) {
        C0250b c0250b = (C0250b) this.f2956e.get(view);
        if (c0250b != null) {
            c0250b.mo815i(view, accessibilityEvent);
        } else {
            super.mo815i(view, accessibilityEvent);
        }
    }
}
