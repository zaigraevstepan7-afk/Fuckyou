package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import com.reddit.frontpage.MainActivity;

/* JADX INFO: renamed from: Q0.u */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0347u implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f986a;

    /* JADX INFO: renamed from: b */
    public final MainActivity f987b;

    static {
        ZLoader.registerNativesForClass(74, ViewOnClickListenerC0347u.class);
        Hidden0.special_clinit_74_00(ViewOnClickListenerC0347u.class);
    }

    public /* synthetic */ ViewOnClickListenerC0347u(MainActivity mainActivity, int i2) {
        this.f986a = i2;
        this.f987b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
