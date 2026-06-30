package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0584p {

    /* JADX INFO: renamed from: a */
    public final C0563G f1855a;

    public SavedStateHandleAttacher(C0563G c0563g) {
        this.f1855a = c0563g;
    }

    @Override // androidx.lifecycle.InterfaceC0584p
    /* JADX INFO: renamed from: b */
    public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
        if (enumC0580l != EnumC0580l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0580l).toString());
        }
        interfaceC0586r.mo1164d().m1486f(this);
        C0563G c0563g = this.f1855a;
        if (c0563g.f1844b) {
            return;
        }
        Bundle bundleM2130c = c0563g.f1843a.m2130c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0563g.f1845c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM2130c != null) {
            bundle.putAll(bundleM2130c);
        }
        c0563g.f1845c = bundle;
        c0563g.f1844b = true;
    }
}
