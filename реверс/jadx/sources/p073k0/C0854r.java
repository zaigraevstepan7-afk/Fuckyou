package p073k0;

/* JADX INFO: renamed from: k0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0854r extends AbstractC0850n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3486a = 1;

    /* JADX INFO: renamed from: b */
    public AbstractC0849m f3487b;

    public /* synthetic */ C0854r() {
    }

    @Override // p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: b */
    public final void mo2211b(AbstractC0849m abstractC0849m) {
        switch (this.f3486a) {
            case 0:
                this.f3487b.mo2236z();
                abstractC0849m.mo2234x(this);
                break;
            default:
                C0837a c0837a = (C0837a) this.f3487b;
                int i2 = c0837a.f3419C - 1;
                c0837a.f3419C = i2;
                if (i2 == 0) {
                    c0837a.f3420D = false;
                    c0837a.m2254m();
                }
                abstractC0849m.mo2234x(this);
                break;
        }
    }

    @Override // p073k0.AbstractC0850n, p073k0.InterfaceC0847k
    /* JADX INFO: renamed from: d */
    public void mo2213d(AbstractC0849m abstractC0849m) {
        switch (this.f3486a) {
            case 1:
                C0837a c0837a = (C0837a) this.f3487b;
                if (!c0837a.f3420D) {
                    c0837a.m2249G();
                    c0837a.f3420D = true;
                }
                break;
        }
    }

    public C0854r(AbstractC0849m abstractC0849m) {
        this.f3487b = abstractC0849m;
    }
}
