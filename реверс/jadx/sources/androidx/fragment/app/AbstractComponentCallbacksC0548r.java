package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0468m;
import androidx.lifecycle.AbstractC0562F;
import androidx.lifecycle.C0566J;
import androidx.lifecycle.C0567K;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.C0592x;
import androidx.lifecycle.EnumC0581m;
import androidx.lifecycle.InterfaceC0568L;
import androidx.lifecycle.InterfaceC0576h;
import androidx.lifecycle.InterfaceC0586r;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p036T.AbstractC0383m;
import p051a1.AbstractC0451c;
import p055c0.C0603c;
import p060e.AbstractActivityC0669k;
import p068h0.C0781d;
import p068h0.InterfaceC0782e;

/* JADX INFO: renamed from: androidx.fragment.app.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0548r implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0586r, InterfaceC0568L, InterfaceC0576h, InterfaceC0782e {

    /* JADX INFO: renamed from: S */
    public static final Object f1758S = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f1759A;

    /* JADX INFO: renamed from: C */
    public boolean f1761C;

    /* JADX INFO: renamed from: D */
    public ViewGroup f1762D;

    /* JADX INFO: renamed from: E */
    public View f1763E;

    /* JADX INFO: renamed from: F */
    public boolean f1764F;

    /* JADX INFO: renamed from: H */
    public C0546p f1766H;

    /* JADX INFO: renamed from: I */
    public boolean f1767I;

    /* JADX INFO: renamed from: J */
    public boolean f1768J;

    /* JADX INFO: renamed from: K */
    public String f1769K;

    /* JADX INFO: renamed from: M */
    public C0588t f1771M;

    /* JADX INFO: renamed from: N */
    public C0525O f1772N;

    /* JADX INFO: renamed from: P */
    public C0468m f1774P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f1775Q;

    /* JADX INFO: renamed from: R */
    public final C0544n f1776R;

    /* JADX INFO: renamed from: b */
    public Bundle f1778b;

    /* JADX INFO: renamed from: c */
    public SparseArray f1779c;

    /* JADX INFO: renamed from: d */
    public Bundle f1780d;

    /* JADX INFO: renamed from: f */
    public Bundle f1782f;

    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC0548r f1783g;

    /* JADX INFO: renamed from: i */
    public int f1785i;

    /* JADX INFO: renamed from: k */
    public boolean f1787k;

    /* JADX INFO: renamed from: l */
    public boolean f1788l;

    /* JADX INFO: renamed from: m */
    public boolean f1789m;

    /* JADX INFO: renamed from: n */
    public boolean f1790n;

    /* JADX INFO: renamed from: o */
    public boolean f1791o;

    /* JADX INFO: renamed from: p */
    public boolean f1792p;

    /* JADX INFO: renamed from: q */
    public int f1793q;

    /* JADX INFO: renamed from: r */
    public C0518H f1794r;

    /* JADX INFO: renamed from: s */
    public C0550t f1795s;

    /* JADX INFO: renamed from: u */
    public AbstractComponentCallbacksC0548r f1797u;

    /* JADX INFO: renamed from: v */
    public int f1798v;

    /* JADX INFO: renamed from: w */
    public int f1799w;

    /* JADX INFO: renamed from: x */
    public String f1800x;

    /* JADX INFO: renamed from: y */
    public boolean f1801y;

    /* JADX INFO: renamed from: z */
    public boolean f1802z;

    /* JADX INFO: renamed from: a */
    public int f1777a = -1;

    /* JADX INFO: renamed from: e */
    public String f1781e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: h */
    public String f1784h = null;

    /* JADX INFO: renamed from: j */
    public Boolean f1786j = null;

    /* JADX INFO: renamed from: t */
    public C0518H f1796t = new C0518H();

    /* JADX INFO: renamed from: B */
    public final boolean f1760B = true;

    /* JADX INFO: renamed from: G */
    public boolean f1765G = true;

    /* JADX INFO: renamed from: L */
    public EnumC0581m f1770L = EnumC0581m.f1870e;

    /* JADX INFO: renamed from: O */
    public final C0592x f1773O = new C0592x();

    public AbstractComponentCallbacksC0548r() {
        new AtomicInteger();
        this.f1775Q = new ArrayList();
        this.f1776R = new C0544n(this);
        m1462k();
    }

    /* JADX INFO: renamed from: A */
    public void mo1440A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1796t.m1342L();
        this.f1792p = true;
        this.f1772N = new C0525O(this, mo1163c());
        View viewMo1467s = mo1467s(layoutInflater, viewGroup);
        this.f1763E = viewMo1467s;
        if (viewMo1467s == null) {
            if (this.f1772N.f1660c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1772N = null;
            return;
        }
        this.f1772N.m1406f();
        View view = this.f1763E;
        C0525O c0525o = this.f1772N;
        AbstractC0451c.m1146e(view, "<this>");
        view.setTag(R.id.resc, c0525o);
        View view2 = this.f1763E;
        C0525O c0525o2 = this.f1772N;
        AbstractC0451c.m1146e(view2, "<this>");
        view2.setTag(R.id.resc, c0525o2);
        View view3 = this.f1763E;
        C0525O c0525o3 = this.f1772N;
        AbstractC0451c.m1146e(view3, "<this>");
        view3.setTag(R.id.resc, c0525o3);
        C0592x c0592x = this.f1773O;
        C0525O c0525o4 = this.f1772N;
        c0592x.getClass();
        C0592x.m1493a("setValue");
        c0592x.f1896g++;
        c0592x.f1894e = c0525o4;
        c0592x.m1495c(null);
    }

    /* JADX INFO: renamed from: B */
    public final Context m1453B() {
        Context contextM1459h = m1459h();
        if (contextM1459h != null) {
            return contextM1459h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: renamed from: C */
    public final View m1454C() {
        View view = this.f1763E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: renamed from: D */
    public final void m1455D(int i2, int i3, int i4, int i5) {
        if (this.f1766H == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        m1457f().f1748b = i2;
        m1457f().f1749c = i3;
        m1457f().f1750d = i4;
        m1457f().f1751e = i5;
    }

    /* JADX INFO: renamed from: E */
    public final void m1456E(Bundle bundle) {
        C0518H c0518h = this.f1794r;
        if (c0518h != null && (c0518h.f1582E || c0518h.f1583F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1782f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0576h
    /* JADX INFO: renamed from: a */
    public final C0603c mo1161a() {
        Application application;
        Context applicationContext = m1453B().getApplicationContext();
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
        if (application == null && C0518H.m1330F(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m1453B().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0603c c0603c = new C0603c();
        LinkedHashMap linkedHashMap = c0603c.f2041a;
        if (application != null) {
            linkedHashMap.put(C0566J.f1850a, application);
        }
        linkedHashMap.put(AbstractC0562F.f1840a, this);
        linkedHashMap.put(AbstractC0562F.f1841b, this);
        Bundle bundle = this.f1782f;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0562F.f1842c, bundle);
        }
        return c0603c;
    }

    @Override // p068h0.InterfaceC0782e
    /* JADX INFO: renamed from: b */
    public final C0781d mo1162b() {
        return (C0781d) this.f1774P.f1200c;
    }

    @Override // androidx.lifecycle.InterfaceC0568L
    /* JADX INFO: renamed from: c */
    public final C0567K mo1163c() {
        if (this.f1794r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1460i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f1794r.f1589L.f1627e;
        C0567K c0567k = (C0567K) map.get(this.f1781e);
        if (c0567k != null) {
            return c0567k;
        }
        C0567K c0567k2 = new C0567K();
        map.put(this.f1781e, c0567k2);
        return c0567k2;
    }

    @Override // androidx.lifecycle.InterfaceC0586r
    /* JADX INFO: renamed from: d */
    public final C0588t mo1164d() {
        return this.f1771M;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC0383m mo1442e() {
        return new C0545o(this);
    }

    /* JADX INFO: renamed from: f */
    public final C0546p m1457f() {
        if (this.f1766H == null) {
            C0546p c0546p = new C0546p();
            Object obj = f1758S;
            c0546p.f1753g = obj;
            c0546p.f1754h = obj;
            c0546p.f1755i = obj;
            c0546p.f1756j = 1.0f;
            c0546p.f1757k = null;
            this.f1766H = c0546p;
        }
        return this.f1766H;
    }

    /* JADX INFO: renamed from: g */
    public final C0518H m1458g() {
        if (this.f1795s != null) {
            return this.f1796t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: renamed from: h */
    public final Context m1459h() {
        C0550t c0550t = this.f1795s;
        if (c0550t == null) {
            return null;
        }
        return c0550t.f1806q;
    }

    /* JADX INFO: renamed from: i */
    public final int m1460i() {
        EnumC0581m enumC0581m = this.f1770L;
        return (enumC0581m == EnumC0581m.f1867b || this.f1797u == null) ? enumC0581m.ordinal() : Math.min(enumC0581m.ordinal(), this.f1797u.m1460i());
    }

    /* JADX INFO: renamed from: j */
    public final C0518H m1461j() {
        C0518H c0518h = this.f1794r;
        if (c0518h != null) {
            return c0518h;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX INFO: renamed from: k */
    public final void m1462k() {
        this.f1771M = new C0588t(this);
        this.f1774P = new C0468m(this);
        ArrayList arrayList = this.f1775Q;
        C0544n c0544n = this.f1776R;
        if (arrayList.contains(c0544n)) {
            return;
        }
        if (this.f1777a < 0) {
            arrayList.add(c0544n);
            return;
        }
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0544n.f1745a;
        abstractComponentCallbacksC0548r.f1774P.m1171a();
        AbstractC0562F.m1472a(abstractComponentCallbacksC0548r);
    }

    /* JADX INFO: renamed from: l */
    public final void m1463l() {
        m1462k();
        this.f1769K = this.f1781e;
        this.f1781e = UUID.randomUUID().toString();
        this.f1787k = false;
        this.f1788l = false;
        this.f1789m = false;
        this.f1790n = false;
        this.f1791o = false;
        this.f1793q = 0;
        this.f1794r = null;
        this.f1796t = new C0518H();
        this.f1795s = null;
        this.f1798v = 0;
        this.f1799w = 0;
        this.f1800x = null;
        this.f1801y = false;
        this.f1802z = false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1464m() {
        if (this.f1801y) {
            return true;
        }
        C0518H c0518h = this.f1794r;
        if (c0518h != null) {
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1797u;
            c0518h.getClass();
            if (abstractComponentCallbacksC0548r == null ? false : abstractComponentCallbacksC0548r.m1464m()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1465n() {
        return this.f1793q > 0;
    }

    /* JADX INFO: renamed from: o */
    public void mo1443o() {
        this.f1761C = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1761C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0550t c0550t = this.f1795s;
        AbstractActivityC0669k abstractActivityC0669k = c0550t == null ? null : c0550t.f1805p;
        if (abstractActivityC0669k != null) {
            abstractActivityC0669k.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1761C = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m1466p(int i2, int i3, Intent intent) {
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo1444q(AbstractActivityC0669k abstractActivityC0669k) {
        this.f1761C = true;
        C0550t c0550t = this.f1795s;
        if ((c0550t == null ? null : c0550t.f1805p) != null) {
            this.f1761C = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo1445r(Bundle bundle) {
        Parcelable parcelable;
        this.f1761C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1796t.m1348R(parcelable);
            C0518H c0518h = this.f1796t;
            c0518h.f1582E = false;
            c0518h.f1583F = false;
            c0518h.f1589L.f1630h = false;
            c0518h.m1377t(1);
        }
        C0518H c0518h2 = this.f1796t;
        if (c0518h2.f1609s >= 1) {
            return;
        }
        c0518h2.f1582E = false;
        c0518h2.f1583F = false;
        c0518h2.f1589L.f1630h = false;
        c0518h2.m1377t(1);
    }

    /* JADX INFO: renamed from: s */
    public View mo1467s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public void mo1446t() {
        this.f1761C = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1781e);
        if (this.f1798v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1798v));
        }
        if (this.f1800x != null) {
            sb.append(" tag=");
            sb.append(this.f1800x);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo1447u() {
        this.f1761C = true;
    }

    /* JADX INFO: renamed from: v */
    public LayoutInflater mo1448v(Bundle bundle) {
        C0550t c0550t = this.f1795s;
        if (c0550t == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0669k abstractActivityC0669k = c0550t.f1809t;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0669k.getLayoutInflater().cloneInContext(abstractActivityC0669k);
        layoutInflaterCloneInContext.setFactory2(this.f1796t.f1596f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo1449w(Bundle bundle);

    /* JADX INFO: renamed from: x */
    public void mo1450x() {
        this.f1761C = true;
    }

    /* JADX INFO: renamed from: y */
    public void mo1451y() {
        this.f1761C = true;
    }

    /* JADX INFO: renamed from: z */
    public void mo1452z(Bundle bundle) {
        this.f1761C = true;
    }
}
