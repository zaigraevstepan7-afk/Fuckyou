package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0584p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0572d f1836a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0584p f1837b;

    public DefaultLifecycleObserverAdapter(InterfaceC0572d interfaceC0572d, InterfaceC0584p interfaceC0584p) {
        this.f1836a = interfaceC0572d;
        this.f1837b = interfaceC0584p;
    }

    @Override // androidx.lifecycle.InterfaceC0584p
    /* JADX INFO: renamed from: b */
    public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        int i2 = AbstractC0573e.f1864a[enumC0580l.ordinal()];
        InterfaceC0572d interfaceC0572d = this.f1836a;
        if (i2 == 3) {
            interfaceC0572d.mo1286a();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0584p interfaceC0584p = this.f1837b;
        if (interfaceC0584p != null) {
            interfaceC0584p.mo1151b(interfaceC0586r, enumC0580l);
        }
    }
}
