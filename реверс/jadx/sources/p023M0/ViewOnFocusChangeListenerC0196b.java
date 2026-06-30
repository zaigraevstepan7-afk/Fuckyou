package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;

/* JADX INFO: renamed from: M0.b */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0196b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final int f639a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0213s f640b;

    static {
        ZLoader.registerNativesForClass(28, ViewOnFocusChangeListenerC0196b.class);
        Hidden0.special_clinit_28_00(ViewOnFocusChangeListenerC0196b.class);
    }

    public /* synthetic */ ViewOnFocusChangeListenerC0196b(AbstractC0213s abstractC0213s, int i2) {
        this.f639a = i2;
        this.f640b = abstractC0213s;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final native void onFocusChange(View view, boolean z2);
}
