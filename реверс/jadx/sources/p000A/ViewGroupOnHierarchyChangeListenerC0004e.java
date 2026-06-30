package p000A;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: A.e */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewGroupOnHierarchyChangeListenerC0004e implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f2a;

    static {
        ZLoader.registerNativesForClass(4, ViewGroupOnHierarchyChangeListenerC0004e.class);
        Hidden0.special_clinit_4_00(ViewGroupOnHierarchyChangeListenerC0004e.class);
    }

    public ViewGroupOnHierarchyChangeListenerC0004e(CoordinatorLayout coordinatorLayout) {
        this.f2a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final native void onChildViewAdded(View view, View view2);

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final native void onChildViewRemoved(View view, View view2);
}
