package p072k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p060e.DialogInterfaceC0666h;

/* JADX INFO: renamed from: k.n */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0817n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0827x {

    /* JADX INFO: renamed from: a */
    public SubMenuC0803E f3343a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0666h f3344b;

    /* JADX INFO: renamed from: c */
    public C0812i f3345c;

    @Override // p072k.InterfaceC0827x
    /* JADX INFO: renamed from: b */
    public final void mo37b(MenuC0816m menuC0816m, boolean z2) {
        DialogInterfaceC0666h dialogInterfaceC0666h;
        if ((z2 || menuC0816m == this.f3343a) && (dialogInterfaceC0666h = this.f3344b) != null) {
            dialogInterfaceC0666h.dismiss();
        }
    }

    @Override // p072k.InterfaceC0827x
    /* JADX INFO: renamed from: h */
    public final boolean mo43h(MenuC0816m menuC0816m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0812i c0812i = this.f3345c;
        if (c0812i.f3311f == null) {
            c0812i.f3311f = new C0811h(c0812i);
        }
        this.f3343a.m2192q(c0812i.f3311f.getItem(i2), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3345c.mo2151b(this.f3343a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0803E subMenuC0803E = this.f3343a;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3344b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3344b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0803E.m2186c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0803E.performShortcut(i2, keyEvent, 0);
    }
}
