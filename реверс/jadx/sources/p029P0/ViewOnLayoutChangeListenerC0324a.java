package p029P0;

import android.view.View;

/* JADX INFO: renamed from: P0.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0324a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f917b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0324a(int i2, Object obj) {
        this.f916a = i2;
        this.f917b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        switch (this.f916a) {
            case 0:
                C0325b c0325b = (C0325b) this.f917b;
                c0325b.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                c0325b.f927J = iArr[0];
                view.getWindowVisibleDisplayFrame(c0325b.f920C);
                return;
            default:
                throw null;
        }
    }
}
