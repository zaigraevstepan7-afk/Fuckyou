package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;

/* JADX INFO: renamed from: M0.p */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC0210p implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final int f679a;

    /* JADX INFO: renamed from: b */
    public final Object f680b;

    static {
        ZLoader.registerNativesForClass(43, ViewOnAttachStateChangeListenerC0210p.class);
        Hidden0.special_clinit_43_00(ViewOnAttachStateChangeListenerC0210p.class);
    }

    public /* synthetic */ ViewOnAttachStateChangeListenerC0210p(int i2, Object obj) {
        this.f679a = i2;
        this.f680b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final native void m656a(View view);

    /* JADX INFO: renamed from: b */
    private final native void m657b(View view);

    /* JADX INFO: renamed from: c */
    private final native void m658c(View view);

    @Override // android.view.View.OnAttachStateChangeListener
    public final native void onViewAttachedToWindow(View view);

    @Override // android.view.View.OnAttachStateChangeListener
    public final native void onViewDetachedFromWindow(View view);
}
