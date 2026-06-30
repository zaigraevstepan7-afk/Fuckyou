package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0542l extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0545o f1730p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0543m f1731q;

    public C0542l(DialogInterfaceOnCancelListenerC0543m dialogInterfaceOnCancelListenerC0543m, C0545o c0545o) {
        this.f1731q = dialogInterfaceOnCancelListenerC0543m;
        this.f1730p = c0545o;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: N */
    public final View mo1063N(int i2) {
        C0545o c0545o = this.f1730p;
        if (c0545o.mo1064O()) {
            return c0545o.mo1063N(i2);
        }
        Dialog dialog = this.f1731q.f1741c0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: O */
    public final boolean mo1064O() {
        return this.f1730p.mo1064O() || this.f1731q.f1744f0;
    }
}
