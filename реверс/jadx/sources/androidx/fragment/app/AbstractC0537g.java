package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import p013H.InterfaceMenuItemC0103a;
import p016J.C0130b;
import p060e.C0645A;
import p060e.LayoutInflaterFactory2C0648D;
import p072k.MenuItemC0823t;
import p084q.C1031j;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0537g {

    /* JADX INFO: renamed from: a */
    public Object f1721a;

    /* JADX INFO: renamed from: b */
    public Object f1722b;

    public AbstractC0537g(Context context) {
        this.f1721a = context;
    }

    /* JADX INFO: renamed from: c */
    public void m1426c() {
        C0645A c0645a = (C0645A) this.f1721a;
        if (c0645a != null) {
            try {
                ((LayoutInflaterFactory2C0648D) this.f1722b).f2562k.unregisterReceiver(c0645a);
            } catch (IllegalArgumentException unused) {
            }
            this.f1721a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1427d() {
        C0528S c0528s = (C0528S) this.f1721a;
        HashSet hashSet = c0528s.f1671e;
        if (hashSet.remove((C0130b) this.f1722b) && hashSet.isEmpty()) {
            c0528s.m1409b();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo1428e();

    /* JADX INFO: renamed from: f */
    public abstract int mo1429f();

    /* JADX INFO: renamed from: g */
    public MenuItem m1430g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0103a)) {
            return menuItem;
        }
        InterfaceMenuItemC0103a interfaceMenuItemC0103a = (InterfaceMenuItemC0103a) menuItem;
        if (((C1031j) this.f1722b) == null) {
            this.f1722b = new C1031j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C1031j) this.f1722b).get(interfaceMenuItemC0103a);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0823t menuItemC0823t = new MenuItemC0823t((Context) this.f1721a, interfaceMenuItemC0103a);
        ((C1031j) this.f1722b).put(interfaceMenuItemC0103a, menuItemC0823t);
        return menuItemC0823t;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1431h();

    /* JADX INFO: renamed from: i */
    public void m1432i() {
        m1426c();
        IntentFilter intentFilterMo1428e = mo1428e();
        if (intentFilterMo1428e.countActions() == 0) {
            return;
        }
        if (((C0645A) this.f1721a) == null) {
            this.f1721a = new C0645A(this);
        }
        ((LayoutInflaterFactory2C0648D) this.f1722b).f2562k.registerReceiver((C0645A) this.f1721a, intentFilterMo1428e);
    }

    public AbstractC0537g(C0528S c0528s, C0130b c0130b) {
        this.f1721a = c0528s;
        this.f1722b = c0130b;
    }

    public AbstractC0537g(LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D) {
        this.f1722b = layoutInflaterFactory2C0648D;
    }
}
