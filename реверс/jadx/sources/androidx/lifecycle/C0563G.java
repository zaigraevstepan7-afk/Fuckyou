package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.C0470o;
import java.util.Iterator;
import java.util.Map;
import p033R0.C0355c;
import p051a1.AbstractC0451c;
import p068h0.C0781d;
import p068h0.InterfaceC0780c;

/* JADX INFO: renamed from: androidx.lifecycle.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0563G implements InterfaceC0780c {

    /* JADX INFO: renamed from: a */
    public final C0781d f1843a;

    /* JADX INFO: renamed from: b */
    public boolean f1844b;

    /* JADX INFO: renamed from: c */
    public Bundle f1845c;

    /* JADX INFO: renamed from: d */
    public final C0355c f1846d;

    public C0563G(C0781d c0781d, InterfaceC0568L interfaceC0568L) {
        AbstractC0451c.m1146e(c0781d, "savedStateRegistry");
        this.f1843a = c0781d;
        this.f1846d = new C0355c(new C0470o(3, interfaceC0568L));
    }

    @Override // p068h0.InterfaceC0780c
    /* JADX INFO: renamed from: a */
    public final Bundle mo1157a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1845c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C0564H) this.f1846d.m988a()).f1847c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1844b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
