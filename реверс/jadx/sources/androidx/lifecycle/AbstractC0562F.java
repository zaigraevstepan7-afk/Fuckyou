package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p051a1.AbstractC0451c;
import p068h0.C0781d;
import p068h0.InterfaceC0780c;
import p068h0.InterfaceC0782e;
import p078n.C1008b;
import p078n.C1012f;

/* JADX INFO: renamed from: androidx.lifecycle.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0562F {

    /* JADX INFO: renamed from: a */
    public static final C0566J f1840a = new C0566J();

    /* JADX INFO: renamed from: b */
    public static final C0566J f1841b = new C0566J();

    /* JADX INFO: renamed from: c */
    public static final C0566J f1842c = new C0566J();

    /* JADX INFO: renamed from: a */
    public static final void m1472a(InterfaceC0782e interfaceC0782e) {
        InterfaceC0780c interfaceC0780c;
        EnumC0581m enumC0581m = interfaceC0782e.mo1164d().f1877c;
        if (enumC0581m != EnumC0581m.f1867b && enumC0581m != EnumC0581m.f1868c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0781d c0781dMo1162b = interfaceC0782e.mo1162b();
        c0781dMo1162b.getClass();
        Iterator it = ((C1012f) c0781dMo1162b.f3155d).iterator();
        while (true) {
            C1008b c1008b = (C1008b) it;
            if (!c1008b.hasNext()) {
                interfaceC0780c = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c1008b.next();
            AbstractC0451c.m1145d(entry, "components");
            String str = (String) entry.getKey();
            interfaceC0780c = (InterfaceC0780c) entry.getValue();
            if (AbstractC0451c.m1142a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0780c == null) {
            C0563G c0563g = new C0563G(interfaceC0782e.mo1162b(), (InterfaceC0568L) interfaceC0782e);
            interfaceC0782e.mo1162b().m2132e("androidx.lifecycle.internal.SavedStateHandlesProvider", c0563g);
            interfaceC0782e.mo1164d().m1481a(new SavedStateHandleAttacher(c0563g));
        }
    }
}
