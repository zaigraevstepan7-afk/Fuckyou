package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.DialogInterface;
import com.reddit.frontpage.MainActivity;

/* JADX INFO: renamed from: Q0.p */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0342p implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f974a;

    /* JADX INFO: renamed from: b */
    public final MainActivity f975b;

    static {
        ZLoader.registerNativesForClass(69, DialogInterfaceOnClickListenerC0342p.class);
        Hidden0.special_clinit_69_00(DialogInterfaceOnClickListenerC0342p.class);
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0342p(MainActivity mainActivity, int i2) {
        this.f974a = i2;
        this.f975b = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i2);
}
