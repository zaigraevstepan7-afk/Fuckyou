package p019K0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.ViewTreeObserver;
import com.google.android.material.slider.Slider;

/* JADX INFO: renamed from: K0.a */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewTreeObserverOnScrollChangedListenerC0159a implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    public final Slider f496a;

    static {
        ZLoader.registerNativesForClass(12, ViewTreeObserverOnScrollChangedListenerC0159a.class);
        Hidden0.special_clinit_12_00(ViewTreeObserverOnScrollChangedListenerC0159a.class);
    }

    public /* synthetic */ ViewTreeObserverOnScrollChangedListenerC0159a(Slider slider) {
        this.f496a = slider;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final native void onScrollChanged();
}
