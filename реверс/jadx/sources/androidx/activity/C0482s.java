package androidx.activity;

import android.window.OnBackInvokedCallback;
import p048Z0.InterfaceC0421a;
import p048Z0.InterfaceC0432l;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.activity.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0482s {

    /* JADX INFO: renamed from: a */
    public static final C0482s f1238a = new C0482s();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m1184a(InterfaceC0432l interfaceC0432l, InterfaceC0432l interfaceC0432l2, InterfaceC0421a interfaceC0421a, InterfaceC0421a interfaceC0421a2) {
        AbstractC0451c.m1146e(interfaceC0432l, "onBackStarted");
        AbstractC0451c.m1146e(interfaceC0432l2, "onBackProgressed");
        AbstractC0451c.m1146e(interfaceC0421a, "onBackInvoked");
        AbstractC0451c.m1146e(interfaceC0421a2, "onBackCancelled");
        return new C0473r(interfaceC0432l, interfaceC0432l2, interfaceC0421a, interfaceC0421a2);
    }
}
