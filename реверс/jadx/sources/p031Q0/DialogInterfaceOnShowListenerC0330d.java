package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.DialogInterface;
import com.google.android.material.textfield.TextInputEditText;
import com.reddit.frontpage.ConfigsActivity;
import p060e.DialogInterfaceC0666h;

/* JADX INFO: renamed from: Q0.d */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC0330d implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final ConfigsActivity f941a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0666h f942b;

    /* JADX INFO: renamed from: c */
    public final TextInputEditText f943c;

    /* JADX INFO: renamed from: d */
    public final C0340n f944d;

    static {
        ZLoader.registerNativesForClass(57, DialogInterfaceOnShowListenerC0330d.class);
        Hidden0.special_clinit_57_00(DialogInterfaceOnShowListenerC0330d.class);
    }

    public /* synthetic */ DialogInterfaceOnShowListenerC0330d(C0340n c0340n, TextInputEditText textInputEditText, ConfigsActivity configsActivity, DialogInterfaceC0666h dialogInterfaceC0666h) {
        this.f941a = configsActivity;
        this.f942b = dialogInterfaceC0666h;
        this.f943c = textInputEditText;
        this.f944d = c0340n;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final native void onShow(DialogInterface dialogInterface);
}
