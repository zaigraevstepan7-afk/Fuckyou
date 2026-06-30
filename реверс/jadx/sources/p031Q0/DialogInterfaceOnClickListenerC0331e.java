package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.DialogInterface;
import com.reddit.frontpage.ConfigsActivity;

/* JADX INFO: renamed from: Q0.e */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0331e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final ConfigsActivity f945a;

    /* JADX INFO: renamed from: b */
    public final C0340n f946b;

    static {
        ZLoader.registerNativesForClass(58, DialogInterfaceOnClickListenerC0331e.class);
        Hidden0.special_clinit_58_00(DialogInterfaceOnClickListenerC0331e.class);
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0331e(ConfigsActivity configsActivity, C0340n c0340n) {
        this.f945a = configsActivity;
        this.f946b = c0340n;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i2);
}
