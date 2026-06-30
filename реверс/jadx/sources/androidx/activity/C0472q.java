package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p048Z0.InterfaceC0421a;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.activity.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0472q {

    /* JADX INFO: renamed from: a */
    public static final C0472q f1207a = new C0472q();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m1174a(InterfaceC0421a interfaceC0421a) {
        AbstractC0451c.m1146e(interfaceC0421a, "onBackInvoked");
        return new C0471p(0, interfaceC0421a);
    }

    /* JADX INFO: renamed from: b */
    public final void m1175b(Object obj, int i2, Object obj2) {
        AbstractC0451c.m1146e(obj, "dispatcher");
        AbstractC0451c.m1146e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public final void m1176c(Object obj, Object obj2) {
        AbstractC0451c.m1146e(obj, "dispatcher");
        AbstractC0451c.m1146e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
