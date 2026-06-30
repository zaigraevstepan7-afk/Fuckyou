package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0584p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0585q f1853a;

    /* JADX INFO: renamed from: b */
    public final C0569a f1854b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0585q interfaceC0585q) {
        this.f1853a = interfaceC0585q;
        C0571c c0571c = C0571c.f1861c;
        Class<?> cls = interfaceC0585q.getClass();
        C0569a c0569a = (C0569a) c0571c.f1862a.get(cls);
        this.f1854b = c0569a == null ? c0571c.m1478a(cls, null) : c0569a;
    }

    @Override // androidx.lifecycle.InterfaceC0584p
    /* JADX INFO: renamed from: b */
    public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        HashMap map = this.f1854b.f1857a;
        List list = (List) map.get(enumC0580l);
        InterfaceC0585q interfaceC0585q = this.f1853a;
        C0569a.m1476a(list, interfaceC0586r, enumC0580l, interfaceC0585q);
        C0569a.m1476a((List) map.get(EnumC0580l.ON_ANY), interfaceC0586r, enumC0580l, interfaceC0585q);
    }
}
