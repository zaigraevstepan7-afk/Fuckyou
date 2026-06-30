package p000A;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: A.g */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC0006g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f18a;

    static {
        ZLoader.registerNativesForClass(6, ViewTreeObserverOnPreDrawListenerC0006g.class);
        Hidden0.special_clinit_6_00(ViewTreeObserverOnPreDrawListenerC0006g.class);
    }

    public ViewTreeObserverOnPreDrawListenerC0006g(CoordinatorLayout coordinatorLayout) {
        this.f18a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final native boolean onPreDraw();
}
