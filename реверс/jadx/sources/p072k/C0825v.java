package p072k;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: k.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0825v implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0826w f3386a;

    public C0825v(C0826w c0826w) {
        this.f3386a = c0826w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3386a.mo2207c();
    }
}
