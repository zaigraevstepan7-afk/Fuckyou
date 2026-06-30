package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0518H;
import androidx.fragment.app.C0556z;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0581m;
import androidx.lifecycle.InterfaceC0586r;
import java.util.Iterator;
import java.util.ListIterator;
import p035S0.C0364a;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.activity.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0485v {

    /* JADX INFO: renamed from: a */
    public final Runnable f1246a;

    /* JADX INFO: renamed from: b */
    public final C0364a f1247b = new C0364a();

    /* JADX INFO: renamed from: c */
    public C0556z f1248c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f1249d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f1250e;

    /* JADX INFO: renamed from: f */
    public boolean f1251f;

    /* JADX INFO: renamed from: g */
    public boolean f1252g;

    public C0485v(Runnable runnable) {
        this.f1246a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f1249d = i2 >= 34 ? C0482s.f1238a.m1184a(new C0469n(this, 0), new C0469n(this, 1), new C0470o(0, this), new C0470o(1, this)) : C0472q.f1207a.m1174a(new C0470o(2, this));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1186a(InterfaceC0586r interfaceC0586r, C0556z c0556z) {
        AbstractC0451c.m1146e(c0556z, "onBackPressedCallback");
        C0588t c0588tMo1164d = interfaceC0586r.mo1164d();
        if (c0588tMo1164d.f1877c == EnumC0581m.f1866a) {
            return;
        }
        c0556z.f1823b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, c0588tMo1164d, c0556z));
        m1189d();
        c0556z.f1824c = new C0484u(0, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m1187b() {
        Object objPrevious;
        C0364a c0364a = this.f1247b;
        c0364a.getClass();
        ListIterator listIterator = c0364a.listIterator(c0364a.f1008c);
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((C0556z) objPrevious).f1822a) {
                    break;
                }
            }
        }
        C0556z c0556z = (C0556z) objPrevious;
        this.f1248c = null;
        if (c0556z == null) {
            this.f1246a.run();
            return;
        }
        C0518H c0518h = c0556z.f1825d;
        c0518h.m1382y(true);
        if (c0518h.f1598h.f1822a) {
            c0518h.m1343M();
        } else {
            c0518h.f1597g.m1187b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1188c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1250e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1249d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0472q c0472q = C0472q.f1207a;
        if (z2 && !this.f1251f) {
            c0472q.m1175b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1251f = true;
        } else {
            if (z2 || !this.f1251f) {
                return;
            }
            c0472q.m1176c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1251f = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1189d() {
        boolean z2 = this.f1252g;
        boolean z3 = false;
        C0364a c0364a = this.f1247b;
        if (!(c0364a != null) || !c0364a.isEmpty()) {
            Iterator it = c0364a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0556z) it.next()).f1822a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1252g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m1188c(z3);
    }
}
