package p074l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p072k.ViewTreeObserverOnGlobalLayoutListenerC0807d;

/* JADX INFO: renamed from: l.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0891O implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0807d f3584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0893P f3585b;

    public C0891O(C0893P c0893p, ViewTreeObserverOnGlobalLayoutListenerC0807d viewTreeObserverOnGlobalLayoutListenerC0807d) {
        this.f3585b = c0893p;
        this.f3584a = viewTreeObserverOnGlobalLayoutListenerC0807d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3585b.f3594H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3584a);
        }
    }
}
