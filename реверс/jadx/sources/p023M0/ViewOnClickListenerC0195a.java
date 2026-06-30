package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;

/* JADX INFO: renamed from: M0.a */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0195a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f637a;

    /* JADX INFO: renamed from: b */
    public final Object f638b;

    static {
        ZLoader.registerNativesForClass(27, ViewOnClickListenerC0195a.class);
        Hidden0.special_clinit_27_00(ViewOnClickListenerC0195a.class);
    }

    public /* synthetic */ ViewOnClickListenerC0195a(int i2, Object obj) {
        this.f637a = i2;
        this.f638b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
