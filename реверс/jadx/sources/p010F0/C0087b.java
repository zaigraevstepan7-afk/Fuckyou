package p010F0;

import android.graphics.Typeface;
import p001A0.AbstractC0016e;
import p007E.AbstractC0056b;

/* JADX INFO: renamed from: F0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0087b extends AbstractC0056b {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC0016e f266h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0089d f267i;

    public C0087b(C0089d c0089d, AbstractC0016e abstractC0016e) {
        this.f267i = c0089d;
        this.f266h = abstractC0016e;
    }

    @Override // p007E.AbstractC0056b
    /* JADX INFO: renamed from: h */
    public final void mo337h(int i2) {
        this.f267i.f284m = true;
        this.f266h.mo222k0(i2);
    }

    @Override // p007E.AbstractC0056b
    /* JADX INFO: renamed from: i */
    public final void mo338i(Typeface typeface) {
        C0089d c0089d = this.f267i;
        c0089d.f285n = Typeface.create(typeface, c0089d.f274c);
        c0089d.f284m = true;
        this.f266h.mo223l0(c0089d.f285n, false);
    }
}
