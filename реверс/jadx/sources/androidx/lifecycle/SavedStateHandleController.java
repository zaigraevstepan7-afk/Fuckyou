package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0584p {

    /* JADX INFO: renamed from: a */
    public boolean f1856a;

    @Override // androidx.lifecycle.InterfaceC0584p
    /* JADX INFO: renamed from: b */
    public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        if (enumC0580l == EnumC0580l.ON_DESTROY) {
            this.f1856a = false;
            interfaceC0586r.mo1164d().m1486f(this);
        }
    }
}
