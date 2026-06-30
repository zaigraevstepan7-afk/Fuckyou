package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.j */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0540j implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0543m f1728a;

    public DialogInterfaceOnCancelListenerC0540j(DialogInterfaceOnCancelListenerC0543m dialogInterfaceOnCancelListenerC0543m) {
        this.f1728a = dialogInterfaceOnCancelListenerC0543m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0543m dialogInterfaceOnCancelListenerC0543m = this.f1728a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0543m.f1741c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0543m.onCancel(dialog);
        }
    }
}
