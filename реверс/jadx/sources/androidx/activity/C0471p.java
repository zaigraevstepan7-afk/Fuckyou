package androidx.activity;

import android.window.OnBackInvokedCallback;
import p048Z0.InterfaceC0421a;
import p051a1.AbstractC0451c;
import p060e.LayoutInflaterFactory2C0648D;

/* JADX INFO: renamed from: androidx.activity.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0471p implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1206b;

    public /* synthetic */ C0471p(int i2, Object obj) {
        this.f1205a = i2;
        this.f1206b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f1205a) {
            case 0:
                InterfaceC0421a interfaceC0421a = (InterfaceC0421a) this.f1206b;
                AbstractC0451c.m1146e(interfaceC0421a, "$onBackInvoked");
                interfaceC0421a.mo1135a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0648D) this.f1206b).m1836D();
                break;
            default:
                ((Runnable) this.f1206b).run();
                break;
        }
    }
}
