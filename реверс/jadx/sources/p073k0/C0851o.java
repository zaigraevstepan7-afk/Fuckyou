package p073k0;

import java.util.ArrayList;
import p084q.C1027f;

/* JADX INFO: renamed from: k0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0851o extends AbstractC0850n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1027f f3479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0852p f3480b;

    public C0851o(ViewTreeObserverOnPreDrawListenerC0852p viewTreeObserverOnPreDrawListenerC0852p, C1027f c1027f) {
        this.f3480b = viewTreeObserverOnPreDrawListenerC0852p;
        this.f3479a = c1027f;
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: b */
    public final void mo2211b(AbstractC0849m abstractC0849m) {
        ((ArrayList) this.f3479a.get(this.f3480b.f3482b)).remove(abstractC0849m);
        abstractC0849m.mo2234x(this);
    }
}
