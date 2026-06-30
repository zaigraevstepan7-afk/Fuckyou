package p066g0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: g0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0747e0 extends AbstractC0726N {

    /* JADX INFO: renamed from: a */
    public boolean f2967a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0775z f2968b;

    public C0747e0(C0775z c0775z) {
        this.f2968b = c0775z;
    }

    @Override // p066g0.AbstractC0726N
    /* JADX INFO: renamed from: a */
    public final void mo1733a(RecyclerView recyclerView, int i2) {
        if (i2 == 0 && this.f2967a) {
            this.f2967a = false;
            this.f2968b.m2122f();
        }
    }

    @Override // p066g0.AbstractC0726N
    /* JADX INFO: renamed from: b */
    public final void mo1734b(RecyclerView recyclerView, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        this.f2967a = true;
    }
}
