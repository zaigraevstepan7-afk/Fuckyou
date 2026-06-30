package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.EnumC0581m;
import androidx.lifecycle.InterfaceC0584p;
import androidx.lifecycle.InterfaceC0586r;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.Map;
import p051a1.AbstractC0451c;
import p068h0.C0781d;
import p068h0.InterfaceC0780c;
import p068h0.InterfaceC0782e;
import p078n.C1010d;
import p078n.C1012f;

/* JADX INFO: renamed from: androidx.activity.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0468m {

    /* JADX INFO: renamed from: a */
    public boolean f1198a;

    /* JADX INFO: renamed from: b */
    public final Object f1199b;

    /* JADX INFO: renamed from: c */
    public final Object f1200c;

    public C0468m(InterfaceC0782e interfaceC0782e) {
        this.f1199b = interfaceC0782e;
        this.f1200c = new C0781d();
    }

    /* JADX INFO: renamed from: a */
    public void m1171a() {
        InterfaceC0782e interfaceC0782e = (InterfaceC0782e) this.f1199b;
        C0588t c0588tMo1164d = interfaceC0782e.mo1164d();
        if (c0588tMo1164d.f1877c != EnumC0581m.f1867b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0588tMo1164d.m1481a(new Recreator(interfaceC0782e));
        final C0781d c0781d = (C0781d) this.f1200c;
        c0781d.getClass();
        if (c0781d.f3152a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0588tMo1164d.m1481a(new InterfaceC0584p() { // from class: h0.a
            @Override // androidx.lifecycle.InterfaceC0584p
            /* JADX INFO: renamed from: b */
            public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
                C0781d c0781d2 = c0781d;
                AbstractC0451c.m1146e(c0781d2, "this$0");
                if (enumC0580l == EnumC0580l.ON_START) {
                    c0781d2.f3154c = true;
                } else if (enumC0580l == EnumC0580l.ON_STOP) {
                    c0781d2.f3154c = false;
                }
            }
        });
        c0781d.f3152a = true;
        this.f1198a = true;
    }

    /* JADX INFO: renamed from: b */
    public void m1172b(Bundle bundle) {
        if (!this.f1198a) {
            m1171a();
        }
        C0588t c0588tMo1164d = ((InterfaceC0782e) this.f1199b).mo1164d();
        if (c0588tMo1164d.f1877c.compareTo(EnumC0581m.f1869d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0588tMo1164d.f1877c).toString());
        }
        C0781d c0781d = (C0781d) this.f1200c;
        if (!c0781d.f3152a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0781d.f3153b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0781d.f3156e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0781d.f3153b = true;
    }

    /* JADX INFO: renamed from: c */
    public void m1173c(Bundle bundle) {
        C0781d c0781d = (C0781d) this.f1200c;
        c0781d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0781d.f3156e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1012f c1012f = (C1012f) c0781d.f3155d;
        c1012f.getClass();
        C1010d c1010d = new C1010d(c1012f);
        c1012f.f4009c.put(c1010d, Boolean.FALSE);
        while (c1010d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1010d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0780c) entry.getValue()).mo1157a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public C0468m(ExecutorC0465j executorC0465j, C0459d c0459d) {
        this.f1199b = new Object();
        this.f1200c = new ArrayList();
    }
}
