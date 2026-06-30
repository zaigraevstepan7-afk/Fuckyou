package androidx.activity;

import androidx.fragment.app.C0556z;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.InterfaceC0584p;
import androidx.lifecycle.InterfaceC0586r;
import p051a1.AbstractC0451c;

/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0584p, InterfaceC0458c {

    /* JADX INFO: renamed from: a */
    public final C0588t f1158a;

    /* JADX INFO: renamed from: b */
    public final C0556z f1159b;

    /* JADX INFO: renamed from: c */
    public C0483t f1160c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0485v f1161d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0485v c0485v, C0588t c0588t, C0556z c0556z) {
        AbstractC0451c.m1146e(c0556z, "onBackPressedCallback");
        this.f1161d = c0485v;
        this.f1158a = c0588t;
        this.f1159b = c0556z;
        c0588t.m1481a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0584p
    /* JADX INFO: renamed from: b */
    public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        if (enumC0580l != EnumC0580l.ON_START) {
            if (enumC0580l != EnumC0580l.ON_STOP) {
                if (enumC0580l == EnumC0580l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0483t c0483t = this.f1160c;
                if (c0483t != null) {
                    c0483t.cancel();
                    return;
                }
                return;
            }
        }
        C0485v c0485v = this.f1161d;
        c0485v.getClass();
        C0556z c0556z = this.f1159b;
        AbstractC0451c.m1146e(c0556z, "onBackPressedCallback");
        c0485v.f1247b.addLast(c0556z);
        C0483t c0483t2 = new C0483t(c0485v, c0556z);
        c0556z.f1823b.add(c0483t2);
        c0485v.m1189d();
        c0556z.f1824c = new C0484u(1, c0485v);
        this.f1160c = c0483t2;
    }

    @Override // androidx.activity.InterfaceC0458c
    public final void cancel() {
        this.f1158a.m1486f(this);
        this.f1159b.f1823b.remove(this);
        C0483t c0483t = this.f1160c;
        if (c0483t != null) {
            c0483t.cancel();
        }
        this.f1160c = null;
    }
}
