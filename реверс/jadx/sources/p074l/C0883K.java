package p074l;

import p072k.InterfaceC0801C;

/* JADX INFO: renamed from: l.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0883K extends AbstractViewOnTouchListenerC0864A0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0893P f3547j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0900T f3548k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0883K(C0900T c0900t, C0900T c0900t2, C0893P c0893p) {
        super(c0900t2);
        this.f3548k = c0900t;
        this.f3547j = c0893p;
    }

    @Override // p074l.AbstractViewOnTouchListenerC0864A0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0801C mo2173b() {
        return this.f3547j;
    }

    @Override // p074l.AbstractViewOnTouchListenerC0864A0
    /* JADX INFO: renamed from: c */
    public final boolean mo2174c() {
        C0900T c0900t = this.f3548k;
        if (c0900t.getInternalPopup().mo2300a()) {
            return true;
        }
        c0900t.f3615f.mo2304f(c0900t.getTextDirection(), c0900t.getTextAlignment());
        return true;
    }
}
