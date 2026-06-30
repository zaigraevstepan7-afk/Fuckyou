package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0511A;
import androidx.lifecycle.AbstractC0559C;
import androidx.lifecycle.AbstractC0562F;
import androidx.lifecycle.C0566J;
import androidx.lifecycle.C0567K;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.FragmentC0561E;
import androidx.lifecycle.InterfaceC0568L;
import androidx.lifecycle.InterfaceC0576h;
import androidx.lifecycle.InterfaceC0584p;
import androidx.lifecycle.InterfaceC0586r;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p004C.AbstractActivityC0030k;
import p004C.C0031l;
import p004C.C0034o;
import p004C.RunnableC0020a;
import p022M.InterfaceC0184a;
import p023M0.RunnableC0191D;
import p024N.C0270l;
import p036T.AbstractC0383m;
import p048Z0.InterfaceC0421a;
import p049a.C0443a;
import p049a.InterfaceC0444b;
import p051a1.AbstractC0451c;
import p055c0.C0603c;
import p060e.AbstractActivityC0669k;
import p068h0.C0781d;
import p068h0.InterfaceC0782e;

/* JADX INFO: renamed from: androidx.activity.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0466k extends AbstractActivityC0030k implements InterfaceC0568L, InterfaceC0576h, InterfaceC0782e {

    /* JADX INFO: renamed from: b */
    public final C0443a f1178b = new C0443a();

    /* JADX INFO: renamed from: c */
    public final C0270l f1179c;

    /* JADX INFO: renamed from: d */
    public final C0588t f1180d;

    /* JADX INFO: renamed from: e */
    public final C0468m f1181e;

    /* JADX INFO: renamed from: f */
    public C0567K f1182f;

    /* JADX INFO: renamed from: g */
    public C0485v f1183g;

    /* JADX INFO: renamed from: h */
    public final ExecutorC0465j f1184h;

    /* JADX INFO: renamed from: i */
    public final C0468m f1185i;

    /* JADX INFO: renamed from: j */
    public final AtomicInteger f1186j;

    /* JADX INFO: renamed from: k */
    public final C0462g f1187k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f1188l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f1189m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f1190n;

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList f1191o;

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList f1192p;

    /* JADX INFO: renamed from: q */
    public boolean f1193q;

    /* JADX INFO: renamed from: r */
    public boolean f1194r;

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.activity.d] */
    public AbstractActivityC0466k() {
        final AbstractActivityC0669k abstractActivityC0669k = (AbstractActivityC0669k) this;
        this.f1179c = new C0270l(new RunnableC0020a(6, abstractActivityC0669k));
        C0588t c0588t = new C0588t(this);
        this.f1180d = c0588t;
        C0468m c0468m = new C0468m(this);
        this.f1181e = c0468m;
        this.f1183g = null;
        ExecutorC0465j executorC0465j = new ExecutorC0465j(abstractActivityC0669k);
        this.f1184h = executorC0465j;
        this.f1185i = new C0468m(executorC0465j, new InterfaceC0421a() { // from class: androidx.activity.d
            @Override // p048Z0.InterfaceC0421a
            /* JADX INFO: renamed from: a */
            public final Object mo1135a() {
                abstractActivityC0669k.reportFullyDrawn();
                return null;
            }
        });
        this.f1186j = new AtomicInteger();
        this.f1187k = new C0462g(abstractActivityC0669k);
        this.f1188l = new CopyOnWriteArrayList();
        this.f1189m = new CopyOnWriteArrayList();
        this.f1190n = new CopyOnWriteArrayList();
        this.f1191o = new CopyOnWriteArrayList();
        this.f1192p = new CopyOnWriteArrayList();
        this.f1193q = false;
        this.f1194r = false;
        int i2 = Build.VERSION.SDK_INT;
        c0588t.m1481a(new InterfaceC0584p() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.InterfaceC0584p
            /* JADX INFO: renamed from: b */
            public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
                if (enumC0580l == EnumC0580l.ON_STOP) {
                    Window window = abstractActivityC0669k.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0588t.m1481a(new InterfaceC0584p() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.InterfaceC0584p
            /* JADX INFO: renamed from: b */
            public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
                if (enumC0580l == EnumC0580l.ON_DESTROY) {
                    abstractActivityC0669k.f1178b.f1137b = null;
                    if (!abstractActivityC0669k.isChangingConfigurations()) {
                        abstractActivityC0669k.mo1163c().m1473a();
                    }
                    ExecutorC0465j executorC0465j2 = abstractActivityC0669k.f1184h;
                    AbstractActivityC0669k abstractActivityC0669k2 = executorC0465j2.f1177d;
                    abstractActivityC0669k2.getWindow().getDecorView().removeCallbacks(executorC0465j2);
                    abstractActivityC0669k2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0465j2);
                }
            }
        });
        c0588t.m1481a(new InterfaceC0584p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0584p
            /* JADX INFO: renamed from: b */
            public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
                AbstractActivityC0669k abstractActivityC0669k2 = abstractActivityC0669k;
                if (abstractActivityC0669k2.f1182f == null) {
                    C0464i c0464i = (C0464i) abstractActivityC0669k2.getLastNonConfigurationInstance();
                    if (c0464i != null) {
                        abstractActivityC0669k2.f1182f = c0464i.f1173a;
                    }
                    if (abstractActivityC0669k2.f1182f == null) {
                        abstractActivityC0669k2.f1182f = new C0567K();
                    }
                }
                abstractActivityC0669k2.f1180d.m1486f(this);
            }
        });
        c0468m.m1171a();
        AbstractC0562F.m1472a(this);
        if (i2 <= 23) {
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.f1157a = this;
            c0588t.m1481a(immLeaksCleaner);
        }
        ((C0781d) c0468m.f1200c).m2132e("android:support:activity-result", new C0460e(0, abstractActivityC0669k));
        m1166h(new C0461f(abstractActivityC0669k, 0));
    }

    @Override // androidx.lifecycle.InterfaceC0576h
    /* JADX INFO: renamed from: a */
    public final C0603c mo1161a() {
        C0603c c0603c = new C0603c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0603c.f2041a;
        if (application != null) {
            linkedHashMap.put(C0566J.f1850a, getApplication());
        }
        linkedHashMap.put(AbstractC0562F.f1840a, this);
        linkedHashMap.put(AbstractC0562F.f1841b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0562F.f1842c, getIntent().getExtras());
        }
        return c0603c;
    }

    @Override // p068h0.InterfaceC0782e
    /* JADX INFO: renamed from: b */
    public final C0781d mo1162b() {
        return (C0781d) this.f1181e.f1200c;
    }

    @Override // androidx.lifecycle.InterfaceC0568L
    /* JADX INFO: renamed from: c */
    public final C0567K mo1163c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1182f == null) {
            C0464i c0464i = (C0464i) getLastNonConfigurationInstance();
            if (c0464i != null) {
                this.f1182f = c0464i.f1173a;
            }
            if (this.f1182f == null) {
                this.f1182f = new C0567K();
            }
        }
        return this.f1182f;
    }

    @Override // androidx.lifecycle.InterfaceC0586r
    /* JADX INFO: renamed from: d */
    public final C0588t mo1164d() {
        return this.f1180d;
    }

    /* JADX INFO: renamed from: g */
    public final void m1165g(InterfaceC0184a interfaceC0184a) {
        this.f1188l.add(interfaceC0184a);
    }

    /* JADX INFO: renamed from: h */
    public final void m1166h(InterfaceC0444b interfaceC0444b) {
        C0443a c0443a = this.f1178b;
        c0443a.getClass();
        if (c0443a.f1137b != null) {
            interfaceC0444b.mo1137a();
        }
        c0443a.f1136a.add(interfaceC0444b);
    }

    /* JADX INFO: renamed from: i */
    public final C0485v m1167i() {
        if (this.f1183g == null) {
            this.f1183g = new C0485v(new RunnableC0191D(3, this));
            this.f1180d.m1481a(new InterfaceC0584p() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.InterfaceC0584p
                /* JADX INFO: renamed from: b */
                public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
                    if (enumC0580l != EnumC0580l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    C0485v c0485v = this.f1152a.f1183g;
                    OnBackInvokedDispatcher onBackInvokedDispatcherM1159a = AbstractC0463h.m1159a((AbstractActivityC0466k) interfaceC0586r);
                    c0485v.getClass();
                    AbstractC0451c.m1146e(onBackInvokedDispatcherM1159a, "invoker");
                    c0485v.f1250e = onBackInvokedDispatcherM1159a;
                    c0485v.m1188c(c0485v.f1252g);
                }
            });
        }
        return this.f1183g;
    }

    /* JADX INFO: renamed from: j */
    public final void m1168j() {
        View decorView = getWindow().getDecorView();
        AbstractC0451c.m1146e(decorView, "<this>");
        decorView.setTag(R.id.resc, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0451c.m1146e(decorView2, "<this>");
        decorView2.setTag(R.id.resc, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0451c.m1146e(decorView3, "<this>");
        decorView3.setTag(R.id.resc, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0451c.m1146e(decorView4, "<this>");
        decorView4.setTag(R.id.resc, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC0451c.m1146e(decorView5, "<this>");
        decorView5.setTag(R.id.resc, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f1187k.m1179a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        m1167i().m1187b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1188l.iterator();
        while (it.hasNext()) {
            ((InterfaceC0184a) it.next()).mo567a(configuration);
        }
    }

    @Override // p004C.AbstractActivityC0030k, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1181e.m1172b(bundle);
        C0443a c0443a = this.f1178b;
        c0443a.getClass();
        c0443a.f1137b = this;
        Iterator it = c0443a.f1136a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0444b) it.next()).mo1137a();
        }
        super.onCreate(bundle);
        int i2 = FragmentC0561E.f1838b;
        AbstractC0559C.m1470b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1179c.f837b).iterator();
        while (it.hasNext()) {
            ((C0511A) it.next()).f1564a.m1367j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f1179c.f837b).iterator();
            while (it.hasNext()) {
                if (((C0511A) it.next()).f1564a.m1372o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1193q) {
            return;
        }
        Iterator it = this.f1191o.iterator();
        while (it.hasNext()) {
            ((InterfaceC0184a) it.next()).mo567a(new C0031l(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f1190n.iterator();
        while (it.hasNext()) {
            ((InterfaceC0184a) it.next()).mo567a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f1179c.f837b).iterator();
        while (it.hasNext()) {
            ((C0511A) it.next()).f1564a.m1373p();
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1194r) {
            return;
        }
        Iterator it = this.f1192p.iterator();
        while (it.hasNext()) {
            ((InterfaceC0184a) it.next()).mo567a(new C0034o(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1179c.f837b).iterator();
        while (it.hasNext()) {
            ((C0511A) it.next()).f1564a.m1376s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.f1187k.m1179a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0464i c0464i;
        C0567K c0567k = this.f1182f;
        if (c0567k == null && (c0464i = (C0464i) getLastNonConfigurationInstance()) != null) {
            c0567k = c0464i.f1173a;
        }
        if (c0567k == null) {
            return null;
        }
        C0464i c0464i2 = new C0464i();
        c0464i2.f1173a = c0567k;
        return c0464i2;
    }

    @Override // p004C.AbstractActivityC0030k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0588t c0588t = this.f1180d;
        if (c0588t != null) {
            c0588t.m1487g();
        }
        super.onSaveInstanceState(bundle);
        this.f1181e.m1173c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.f1189m.iterator();
        while (it.hasNext()) {
            ((InterfaceC0184a) it.next()).mo567a(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0383m.m1029H()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0468m c0468m = this.f1185i;
            synchronized (c0468m.f1199b) {
                try {
                    c0468m.f1198a = true;
                    Iterator it = ((ArrayList) c0468m.f1200c).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0421a) it.next()).mo1135a();
                    }
                    ((ArrayList) c0468m.f1200c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m1168j();
        View decorView = getWindow().getDecorView();
        ExecutorC0465j executorC0465j = this.f1184h;
        if (!executorC0465j.f1176c) {
            executorC0465j.f1176c = true;
            decorView.getViewTreeObserver().addOnDrawListener(executorC0465j);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        this.f1193q = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1193q = false;
            for (InterfaceC0184a interfaceC0184a : this.f1191o) {
                AbstractC0451c.m1146e(configuration, "newConfig");
                interfaceC0184a.mo567a(new C0031l(z2));
            }
        } catch (Throwable th) {
            this.f1193q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        this.f1194r = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1194r = false;
            for (InterfaceC0184a interfaceC0184a : this.f1192p) {
                AbstractC0451c.m1146e(configuration, "newConfig");
                interfaceC0184a.mo567a(new C0034o(z2));
            }
        } catch (Throwable th) {
            this.f1194r = false;
            throw th;
        }
    }
}
