package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.v */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0552v implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0523M f1815a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0553w f1816b;

    public ViewOnAttachStateChangeListenerC0552v(LayoutInflaterFactory2C0553w layoutInflaterFactory2C0553w, C0523M c0523m) {
        this.f1816b = layoutInflaterFactory2C0553w;
        this.f1815a = c0523m;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0523M c0523m = this.f1815a;
        c0523m.m1398k();
        C0539i.m1433f((ViewGroup) c0523m.f1646c.f1763E.getParent(), this.f1816b.f1817a.m1338D()).m1438e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
