package p074l;

import android.view.View;
import p072k.InterfaceC0814k;
import p072k.MenuC0816m;

/* JADX INFO: renamed from: l.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0938i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C0932g f3726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0944k f3727b;

    public RunnableC0938i(C0944k c0944k, C0932g c0932g) {
        this.f3727b = c0944k;
        this.f3726a = c0932g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0814k interfaceC0814k;
        C0944k c0944k = this.f3727b;
        MenuC0816m menuC0816m = c0944k.f3735c;
        if (menuC0816m != null && (interfaceC0814k = menuC0816m.f3323e) != null) {
            interfaceC0814k.mo57v(menuC0816m);
        }
        View view = (View) c0944k.f3740h;
        if (view != null && view.getWindowToken() != null) {
            C0932g c0932g = this.f3726a;
            if (c0932g.m2206b()) {
                c0944k.f3751s = c0932g;
            } else if (c0932g.f3391e != null) {
                c0932g.m2208d(0, 0, false, false);
                c0944k.f3751s = c0932g;
            }
        }
        c0944k.f3753u = null;
    }
}
