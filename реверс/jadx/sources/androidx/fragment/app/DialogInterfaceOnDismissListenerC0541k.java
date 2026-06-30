package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0541k implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0543m f1729a;

    public DialogInterfaceOnDismissListenerC0541k(DialogInterfaceOnCancelListenerC0543m dialogInterfaceOnCancelListenerC0543m) {
        this.f1729a = dialogInterfaceOnCancelListenerC0543m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0543m dialogInterfaceOnCancelListenerC0543m = this.f1729a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0543m.f1741c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0543m.onDismiss(dialog);
        }
    }
}
