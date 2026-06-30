package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p048Z0.InterfaceC0421a;
import p048Z0.InterfaceC0432l;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.activity.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0473r implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0432l f1208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0432l f1209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0421a f1210c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0421a f1211d;

    public C0473r(InterfaceC0432l interfaceC0432l, InterfaceC0432l interfaceC0432l2, InterfaceC0421a interfaceC0421a, InterfaceC0421a interfaceC0421a2) {
        this.f1208a = interfaceC0432l;
        this.f1209b = interfaceC0432l2;
        this.f1210c = interfaceC0421a;
        this.f1211d = interfaceC0421a2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f1211d.mo1135a();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f1210c.mo1135a();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0451c.m1146e(backEvent, "backEvent");
        this.f1209b.mo1136b(new C0457b(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0451c.m1146e(backEvent, "backEvent");
        this.f1208a.mo1136b(new C0457b(backEvent));
    }
}
