package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.activity.C0468m;
import androidx.lifecycle.AbstractC0562F;
import androidx.lifecycle.C0566J;
import androidx.lifecycle.C0567K;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.InterfaceC0568L;
import androidx.lifecycle.InterfaceC0576h;
import java.util.LinkedHashMap;
import p055c0.C0603c;
import p068h0.C0781d;
import p068h0.InterfaceC0782e;

/* JADX INFO: renamed from: androidx.fragment.app.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0525O implements InterfaceC0576h, InterfaceC0782e, InterfaceC0568L {

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0548r f1658a;

    /* JADX INFO: renamed from: b */
    public final C0567K f1659b;

    /* JADX INFO: renamed from: c */
    public C0588t f1660c = null;

    /* JADX INFO: renamed from: d */
    public C0468m f1661d = null;

    public C0525O(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r, C0567K c0567k) {
        this.f1658a = abstractComponentCallbacksC0548r;
        this.f1659b = c0567k;
    }

    @Override // androidx.lifecycle.InterfaceC0576h
    /* JADX INFO: renamed from: a */
    public final C0603c mo1161a() {
        Application application;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1658a;
        Context applicationContext = abstractComponentCallbacksC0548r.m1453B().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0603c c0603c = new C0603c();
        LinkedHashMap linkedHashMap = c0603c.f2041a;
        if (application != null) {
            linkedHashMap.put(C0566J.f1850a, application);
        }
        linkedHashMap.put(AbstractC0562F.f1840a, this);
        linkedHashMap.put(AbstractC0562F.f1841b, this);
        Bundle bundle = abstractComponentCallbacksC0548r.f1782f;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0562F.f1842c, bundle);
        }
        return c0603c;
    }

    @Override // p068h0.InterfaceC0782e
    /* JADX INFO: renamed from: b */
    public final C0781d mo1162b() {
        m1406f();
        return (C0781d) this.f1661d.f1200c;
    }

    @Override // androidx.lifecycle.InterfaceC0568L
    /* JADX INFO: renamed from: c */
    public final C0567K mo1163c() {
        m1406f();
        return this.f1659b;
    }

    @Override // androidx.lifecycle.InterfaceC0586r
    /* JADX INFO: renamed from: d */
    public final C0588t mo1164d() {
        m1406f();
        return this.f1660c;
    }

    /* JADX INFO: renamed from: e */
    public final void m1405e(EnumC0580l enumC0580l) {
        this.f1660c.m1484d(enumC0580l);
    }

    /* JADX INFO: renamed from: f */
    public final void m1406f() {
        if (this.f1660c == null) {
            this.f1660c = new C0588t(this);
            C0468m c0468m = new C0468m(this);
            this.f1661d = c0468m;
            c0468m.m1171a();
            AbstractC0562F.m1472a(this);
        }
    }
}
