package p074l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0878H0 extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0884K0 f3537a;

    public C0878H0(C0884K0 c0884k0) {
        this.f3537a = c0884k0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0884K0 c0884k0 = this.f3537a;
        if (c0884k0.f3577z.isShowing()) {
            c0884k0.mo2150i();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3537a.dismiss();
    }
}
