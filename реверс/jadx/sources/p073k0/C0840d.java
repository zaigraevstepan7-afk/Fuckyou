package p073k0;

import android.view.ViewGroup;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: k0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0840d extends AbstractC0850n {

    /* JADX INFO: renamed from: a */
    public boolean f3423a = false;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f3424b;

    public C0840d(ViewGroup viewGroup) {
        this.f3424b = viewGroup;
    }

    @Override // p073k0.AbstractC0850n, p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: a */
    public final void mo2210a() {
        AbstractC0383m.m1045k0(this.f3424b, false);
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: b */
    public final void mo2211b(AbstractC0849m abstractC0849m) {
        if (!this.f3423a) {
            AbstractC0383m.m1045k0(this.f3424b, false);
        }
        abstractC0849m.mo2234x(this);
    }

    @Override // p073k0.AbstractC0850n, p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: c */
    public final void mo2212c() {
        AbstractC0383m.m1045k0(this.f3424b, true);
    }

    @Override // p073k0.AbstractC0850n, p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: f */
    public final void mo2215f(AbstractC0849m abstractC0849m) {
        AbstractC0383m.m1045k0(this.f3424b, false);
        this.f3423a = true;
    }
}
