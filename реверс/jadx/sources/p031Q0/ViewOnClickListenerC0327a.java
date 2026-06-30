package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import com.reddit.frontpage.ConfigsActivity;

/* JADX INFO: renamed from: Q0.a */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0327a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f935a;

    /* JADX INFO: renamed from: b */
    public final ConfigsActivity f936b;

    static {
        ZLoader.registerNativesForClass(54, ViewOnClickListenerC0327a.class);
        Hidden0.special_clinit_54_00(ViewOnClickListenerC0327a.class);
    }

    public /* synthetic */ ViewOnClickListenerC0327a(ConfigsActivity configsActivity, int i2) {
        this.f935a = i2;
        this.f936b = configsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
