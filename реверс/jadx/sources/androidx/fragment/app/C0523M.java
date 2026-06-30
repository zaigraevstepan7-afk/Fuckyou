package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC0562F;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.C0592x;
import androidx.lifecycle.EnumC0580l;
import androidx.lifecycle.EnumC0581m;
import androidx.lifecycle.InterfaceC0584p;
import androidx.lifecycle.InterfaceC0586r;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000A.C0010k;
import p005C0.C0048n;
import p023M0.ViewOnAttachStateChangeListenerC0210p;
import p024N.AbstractC0227E;
import p024N.AbstractC0240S;
import p050a0.AbstractC0448d;
import p050a0.C0445a;
import p050a0.C0447c;
import p058d0.C0642a;
import p084q.C1032k;

/* JADX INFO: renamed from: androidx.fragment.app.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0523M {

    /* JADX INFO: renamed from: a */
    public final C0048n f1644a;

    /* JADX INFO: renamed from: b */
    public final C0010k f1645b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0548r f1646c;

    /* JADX INFO: renamed from: d */
    public boolean f1647d = false;

    /* JADX INFO: renamed from: e */
    public int f1648e = -1;

    public C0523M(C0048n c0048n, C0010k c0010k, AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        this.f1644a = c0048n;
        this.f1645b = c0010k;
        this.f1646c = abstractComponentCallbacksC0548r;
    }

    /* JADX INFO: renamed from: a */
    public final void m1388a() {
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0548r);
        }
        Bundle bundle = abstractComponentCallbacksC0548r.f1778b;
        abstractComponentCallbacksC0548r.f1796t.m1342L();
        abstractComponentCallbacksC0548r.f1777a = 3;
        abstractComponentCallbacksC0548r.f1761C = false;
        abstractComponentCallbacksC0548r.mo1443o();
        if (!abstractComponentCallbacksC0548r.f1761C) {
            throw new C0530U("Fragment " + abstractComponentCallbacksC0548r + " did not call through to super.onActivityCreated()");
        }
        if (C0518H.m1330F(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0548r);
        }
        View view = abstractComponentCallbacksC0548r.f1763E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0548r.f1778b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0548r.f1779c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0548r.f1779c = null;
            }
            if (abstractComponentCallbacksC0548r.f1763E != null) {
                abstractComponentCallbacksC0548r.f1772N.f1661d.m1172b(abstractComponentCallbacksC0548r.f1780d);
                abstractComponentCallbacksC0548r.f1780d = null;
            }
            abstractComponentCallbacksC0548r.f1761C = false;
            abstractComponentCallbacksC0548r.mo1452z(bundle2);
            if (!abstractComponentCallbacksC0548r.f1761C) {
                throw new C0530U("Fragment " + abstractComponentCallbacksC0548r + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0548r.f1763E != null) {
                abstractComponentCallbacksC0548r.f1772N.m1405e(EnumC0580l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0548r.f1778b = null;
        C0518H c0518h = abstractComponentCallbacksC0548r.f1796t;
        c0518h.f1582E = false;
        c0518h.f1583F = false;
        c0518h.f1589L.f1630h = false;
        c0518h.m1377t(4);
        this.f1644a.m296d(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m1389b() {
        View view;
        View view2;
        C0010k c0010k = this.f1645b;
        c0010k.getClass();
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        ViewGroup viewGroup = abstractComponentCallbacksC0548r.f1762D;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0010k.f24c;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0548r);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = (AbstractComponentCallbacksC0548r) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0548r2.f1762D == viewGroup && (view = abstractComponentCallbacksC0548r2.f1763E) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r3 = (AbstractComponentCallbacksC0548r) arrayList.get(i2);
                    if (abstractComponentCallbacksC0548r3.f1762D == viewGroup && (view2 = abstractComponentCallbacksC0548r3.f1763E) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0548r.f1762D.addView(abstractComponentCallbacksC0548r.f1763E, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m1390c() {
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0548r);
        }
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = abstractComponentCallbacksC0548r.f1783g;
        C0523M c0523m = null;
        C0010k c0010k = this.f1645b;
        if (abstractComponentCallbacksC0548r2 != null) {
            C0523M c0523m2 = (C0523M) ((HashMap) c0010k.f22a).get(abstractComponentCallbacksC0548r2.f1781e);
            if (c0523m2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0548r + " declared target fragment " + abstractComponentCallbacksC0548r.f1783g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0548r.f1784h = abstractComponentCallbacksC0548r.f1783g.f1781e;
            abstractComponentCallbacksC0548r.f1783g = null;
            c0523m = c0523m2;
        } else {
            String str = abstractComponentCallbacksC0548r.f1784h;
            if (str != null && (c0523m = (C0523M) ((HashMap) c0010k.f22a).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0548r + " declared target fragment " + abstractComponentCallbacksC0548r.f1784h + " that does not belong to this FragmentManager!");
            }
        }
        if (c0523m != null) {
            c0523m.m1398k();
        }
        C0518H c0518h = abstractComponentCallbacksC0548r.f1794r;
        abstractComponentCallbacksC0548r.f1795s = c0518h.f1610t;
        abstractComponentCallbacksC0548r.f1797u = c0518h.f1612v;
        C0048n c0048n = this.f1644a;
        c0048n.m302j(false);
        ArrayList arrayList = abstractComponentCallbacksC0548r.f1775Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r3 = ((C0544n) it.next()).f1745a;
            abstractComponentCallbacksC0548r3.f1774P.m1171a();
            AbstractC0562F.m1472a(abstractComponentCallbacksC0548r3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0548r.f1796t.m1358b(abstractComponentCallbacksC0548r.f1795s, abstractComponentCallbacksC0548r.mo1442e(), abstractComponentCallbacksC0548r);
        abstractComponentCallbacksC0548r.f1777a = 0;
        abstractComponentCallbacksC0548r.f1761C = false;
        abstractComponentCallbacksC0548r.mo1444q(abstractComponentCallbacksC0548r.f1795s.f1806q);
        if (!abstractComponentCallbacksC0548r.f1761C) {
            throw new C0530U("Fragment " + abstractComponentCallbacksC0548r + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0548r.f1794r.f1603m.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0521K) it2.next()).mo1327a();
        }
        C0518H c0518h2 = abstractComponentCallbacksC0548r.f1796t;
        c0518h2.f1582E = false;
        c0518h2.f1583F = false;
        c0518h2.f1589L.f1630h = false;
        c0518h2.m1377t(0);
        c0048n.m297e(false);
    }

    /* JADX INFO: renamed from: d */
    public final int m1391d() {
        C0528S c0528s;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (abstractComponentCallbacksC0548r.f1794r == null) {
            return abstractComponentCallbacksC0548r.f1777a;
        }
        int iMin = this.f1648e;
        int iOrdinal = abstractComponentCallbacksC0548r.f1770L.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0548r.f1789m) {
            if (abstractComponentCallbacksC0548r.f1790n) {
                iMin = Math.max(this.f1648e, 2);
                View view = abstractComponentCallbacksC0548r.f1763E;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1648e < 4 ? Math.min(iMin, abstractComponentCallbacksC0548r.f1777a) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0548r.f1787k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0548r.f1762D;
        if (viewGroup != null) {
            C0539i c0539iM1433f = C0539i.m1433f(viewGroup, abstractComponentCallbacksC0548r.m1461j().m1338D());
            c0539iM1433f.getClass();
            C0528S c0528sM1437d = c0539iM1433f.m1437d(abstractComponentCallbacksC0548r);
            i = c0528sM1437d != null ? c0528sM1437d.f1668b : 0;
            Iterator it = c0539iM1433f.f1725c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0528s = null;
                    break;
                }
                c0528s = (C0528S) it.next();
                if (c0528s.f1669c.equals(abstractComponentCallbacksC0548r) && !c0528s.f1672f) {
                    break;
                }
            }
            if (c0528s != null && (i == 0 || i == 1)) {
                i = c0528s.f1668b;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0548r.f1788l) {
            iMin = abstractComponentCallbacksC0548r.m1465n() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0548r.f1764F && abstractComponentCallbacksC0548r.f1777a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0548r);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public final void m1392e() {
        Parcelable parcelable;
        boolean zM1330F = C0518H.m1330F(3);
        final AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0548r);
        }
        if (abstractComponentCallbacksC0548r.f1768J) {
            Bundle bundle = abstractComponentCallbacksC0548r.f1778b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0548r.f1796t.m1348R(parcelable);
                C0518H c0518h = abstractComponentCallbacksC0548r.f1796t;
                c0518h.f1582E = false;
                c0518h.f1583F = false;
                c0518h.f1589L.f1630h = false;
                c0518h.m1377t(1);
            }
            abstractComponentCallbacksC0548r.f1777a = 1;
            return;
        }
        C0048n c0048n = this.f1644a;
        c0048n.m303l(false);
        Bundle bundle2 = abstractComponentCallbacksC0548r.f1778b;
        abstractComponentCallbacksC0548r.f1796t.m1342L();
        abstractComponentCallbacksC0548r.f1777a = 1;
        abstractComponentCallbacksC0548r.f1761C = false;
        abstractComponentCallbacksC0548r.f1771M.m1481a(new InterfaceC0584p() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.InterfaceC0584p
            /* JADX INFO: renamed from: b */
            public final void mo1151b(InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l) {
                View view;
                if (enumC0580l != EnumC0580l.ON_STOP || (view = abstractComponentCallbacksC0548r.f1763E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0548r.f1774P.m1172b(bundle2);
        abstractComponentCallbacksC0548r.mo1445r(bundle2);
        abstractComponentCallbacksC0548r.f1768J = true;
        if (abstractComponentCallbacksC0548r.f1761C) {
            abstractComponentCallbacksC0548r.f1771M.m1484d(EnumC0580l.ON_CREATE);
            c0048n.m298f(false);
        } else {
            throw new C0530U("Fragment " + abstractComponentCallbacksC0548r + " did not call through to super.onCreate()");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1393f() {
        String resourceName;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (abstractComponentCallbacksC0548r.f1789m) {
            return;
        }
        if (C0518H.m1330F(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0548r);
        }
        LayoutInflater layoutInflaterMo1448v = abstractComponentCallbacksC0548r.mo1448v(abstractComponentCallbacksC0548r.f1778b);
        ViewGroup viewGroup = abstractComponentCallbacksC0548r.f1762D;
        if (viewGroup == null) {
            int i2 = abstractComponentCallbacksC0548r.f1799w;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0548r + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0548r.f1794r.f1611u.mo1063N(i2);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0548r.f1791o) {
                        try {
                            resourceName = abstractComponentCallbacksC0548r.m1453B().getResources().getResourceName(abstractComponentCallbacksC0548r.f1799w);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0548r.f1799w) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0548r);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0447c c0447c = AbstractC0448d.f1144a;
                    AbstractC0448d.m1139b(new C0445a(abstractComponentCallbacksC0548r, "Attempting to add fragment " + abstractComponentCallbacksC0548r + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0448d.m1138a(abstractComponentCallbacksC0548r).getClass();
                }
            }
        }
        abstractComponentCallbacksC0548r.f1762D = viewGroup;
        abstractComponentCallbacksC0548r.mo1440A(layoutInflaterMo1448v, viewGroup, abstractComponentCallbacksC0548r.f1778b);
        View view = abstractComponentCallbacksC0548r.f1763E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0548r.f1763E.setTag(R.id.resc, abstractComponentCallbacksC0548r);
            if (viewGroup != null) {
                m1389b();
            }
            if (abstractComponentCallbacksC0548r.f1801y) {
                abstractComponentCallbacksC0548r.f1763E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0548r.f1763E;
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            if (view2.isAttachedToWindow()) {
                AbstractC0227E.m698c(abstractComponentCallbacksC0548r.f1763E);
            } else {
                View view3 = abstractComponentCallbacksC0548r.f1763E;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0210p(1, view3));
            }
            abstractComponentCallbacksC0548r.f1796t.m1377t(2);
            this.f1644a.m308s(false);
            int visibility = abstractComponentCallbacksC0548r.f1763E.getVisibility();
            abstractComponentCallbacksC0548r.m1457f().f1756j = abstractComponentCallbacksC0548r.f1763E.getAlpha();
            if (abstractComponentCallbacksC0548r.f1762D != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0548r.f1763E.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0548r.m1457f().f1757k = viewFindFocus;
                    if (C0518H.m1330F(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0548r);
                    }
                }
                abstractComponentCallbacksC0548r.f1763E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0548r.f1777a = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m1394g() {
        boolean z2;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM82c;
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0548r);
        }
        boolean z3 = abstractComponentCallbacksC0548r.f1788l && !abstractComponentCallbacksC0548r.m1465n();
        C0010k c0010k = this.f1645b;
        if (z3) {
        }
        if (!z3) {
            C0520J c0520j = (C0520J) c0010k.f25d;
            if (!((c0520j.f1625c.containsKey(abstractComponentCallbacksC0548r.f1781e) && c0520j.f1628f) ? c0520j.f1629g : true)) {
                String str = abstractComponentCallbacksC0548r.f1784h;
                if (str != null && (abstractComponentCallbacksC0548rM82c = c0010k.m82c(str)) != null && abstractComponentCallbacksC0548rM82c.f1759A) {
                    abstractComponentCallbacksC0548r.f1783g = abstractComponentCallbacksC0548rM82c;
                }
                abstractComponentCallbacksC0548r.f1777a = 0;
                return;
            }
        }
        C0550t c0550t = abstractComponentCallbacksC0548r.f1795s;
        if (c0550t != null) {
            z2 = ((C0520J) c0010k.f25d).f1629g;
        } else {
            z2 = AbstractC0529T.m1418g(c0550t.f1806q) ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((C0520J) c0010k.f25d).m1385b(abstractComponentCallbacksC0548r);
        }
        abstractComponentCallbacksC0548r.f1796t.m1368k();
        abstractComponentCallbacksC0548r.f1771M.m1484d(EnumC0580l.ON_DESTROY);
        abstractComponentCallbacksC0548r.f1777a = 0;
        abstractComponentCallbacksC0548r.f1768J = false;
        abstractComponentCallbacksC0548r.f1761C = true;
        this.f1644a.m299g(false);
        for (C0523M c0523m : c0010k.m85f()) {
            if (c0523m != null) {
                String str2 = abstractComponentCallbacksC0548r.f1781e;
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = c0523m.f1646c;
                if (str2.equals(abstractComponentCallbacksC0548r2.f1784h)) {
                    abstractComponentCallbacksC0548r2.f1783g = abstractComponentCallbacksC0548r;
                    abstractComponentCallbacksC0548r2.f1784h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0548r.f1784h;
        if (str3 != null) {
            abstractComponentCallbacksC0548r.f1783g = c0010k.m82c(str3);
        }
        c0010k.m89j(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m1395h() {
        View view;
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0548r);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0548r.f1762D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0548r.f1763E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0548r.f1796t.m1377t(1);
        if (abstractComponentCallbacksC0548r.f1763E != null) {
            C0525O c0525o = abstractComponentCallbacksC0548r.f1772N;
            c0525o.m1406f();
            if (c0525o.f1660c.f1877c.compareTo(EnumC0581m.f1868c) >= 0) {
                abstractComponentCallbacksC0548r.f1772N.m1405e(EnumC0580l.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0548r.f1777a = 1;
        abstractComponentCallbacksC0548r.f1761C = false;
        abstractComponentCallbacksC0548r.mo1446t();
        if (!abstractComponentCallbacksC0548r.f1761C) {
            throw new C0530U("Fragment " + abstractComponentCallbacksC0548r + " did not call through to super.onDestroyView()");
        }
        C1032k c1032k = ((C0642a) C0048n.m281x(abstractComponentCallbacksC0548r).f175c).f2506c;
        if (c1032k.f4107c > 0) {
            c1032k.f4106b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0548r.f1792p = false;
        this.f1644a.m309t(false);
        abstractComponentCallbacksC0548r.f1762D = null;
        abstractComponentCallbacksC0548r.f1763E = null;
        abstractComponentCallbacksC0548r.f1772N = null;
        C0592x c0592x = abstractComponentCallbacksC0548r.f1773O;
        c0592x.getClass();
        C0592x.m1493a("setValue");
        c0592x.f1896g++;
        c0592x.f1894e = null;
        c0592x.m1495c(null);
        abstractComponentCallbacksC0548r.f1790n = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m1396i() {
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0548r);
        }
        abstractComponentCallbacksC0548r.f1777a = -1;
        abstractComponentCallbacksC0548r.f1761C = false;
        abstractComponentCallbacksC0548r.mo1447u();
        if (!abstractComponentCallbacksC0548r.f1761C) {
            throw new C0530U("Fragment " + abstractComponentCallbacksC0548r + " did not call through to super.onDetach()");
        }
        C0518H c0518h = abstractComponentCallbacksC0548r.f1796t;
        if (!c0518h.f1584G) {
            c0518h.m1368k();
            abstractComponentCallbacksC0548r.f1796t = new C0518H();
        }
        this.f1644a.m300h(false);
        abstractComponentCallbacksC0548r.f1777a = -1;
        abstractComponentCallbacksC0548r.f1795s = null;
        abstractComponentCallbacksC0548r.f1797u = null;
        abstractComponentCallbacksC0548r.f1794r = null;
        if (!abstractComponentCallbacksC0548r.f1788l || abstractComponentCallbacksC0548r.m1465n()) {
            C0520J c0520j = (C0520J) this.f1645b.f25d;
            if (!((c0520j.f1625c.containsKey(abstractComponentCallbacksC0548r.f1781e) && c0520j.f1628f) ? c0520j.f1629g : true)) {
                return;
            }
        }
        if (C0518H.m1330F(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0548r);
        }
        abstractComponentCallbacksC0548r.m1463l();
    }

    /* JADX INFO: renamed from: j */
    public final void m1397j() {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (abstractComponentCallbacksC0548r.f1789m && abstractComponentCallbacksC0548r.f1790n && !abstractComponentCallbacksC0548r.f1792p) {
            if (C0518H.m1330F(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0548r);
            }
            abstractComponentCallbacksC0548r.mo1440A(abstractComponentCallbacksC0548r.mo1448v(abstractComponentCallbacksC0548r.f1778b), null, abstractComponentCallbacksC0548r.f1778b);
            View view = abstractComponentCallbacksC0548r.f1763E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0548r.f1763E.setTag(R.id.resc, abstractComponentCallbacksC0548r);
                if (abstractComponentCallbacksC0548r.f1801y) {
                    abstractComponentCallbacksC0548r.f1763E.setVisibility(8);
                }
                abstractComponentCallbacksC0548r.f1796t.m1377t(2);
                this.f1644a.m308s(false);
                abstractComponentCallbacksC0548r.f1777a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1398k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0010k c0010k = this.f1645b;
        boolean z2 = this.f1647d;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (z2) {
            if (C0518H.m1330F(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0548r);
                return;
            }
            return;
        }
        try {
            this.f1647d = true;
            boolean z3 = false;
            while (true) {
                int iM1391d = m1391d();
                int i2 = abstractComponentCallbacksC0548r.f1777a;
                if (iM1391d == i2) {
                    if (!z3 && i2 == -1 && abstractComponentCallbacksC0548r.f1788l && !abstractComponentCallbacksC0548r.m1465n()) {
                        if (C0518H.m1330F(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0548r);
                        }
                        ((C0520J) c0010k.f25d).m1385b(abstractComponentCallbacksC0548r);
                        c0010k.m89j(this);
                        if (C0518H.m1330F(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0548r);
                        }
                        abstractComponentCallbacksC0548r.m1463l();
                    }
                    if (abstractComponentCallbacksC0548r.f1767I) {
                        if (abstractComponentCallbacksC0548r.f1763E != null && (viewGroup = abstractComponentCallbacksC0548r.f1762D) != null) {
                            C0539i c0539iM1433f = C0539i.m1433f(viewGroup, abstractComponentCallbacksC0548r.m1461j().m1338D());
                            if (abstractComponentCallbacksC0548r.f1801y) {
                                c0539iM1433f.getClass();
                                if (C0518H.m1330F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0548r);
                                }
                                c0539iM1433f.m1434a(3, 1, this);
                            } else {
                                c0539iM1433f.getClass();
                                if (C0518H.m1330F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0548r);
                                }
                                c0539iM1433f.m1434a(2, 1, this);
                            }
                        }
                        C0518H c0518h = abstractComponentCallbacksC0548r.f1794r;
                        if (c0518h != null && abstractComponentCallbacksC0548r.f1787k && C0518H.m1331G(abstractComponentCallbacksC0548r)) {
                            c0518h.f1581D = true;
                        }
                        abstractComponentCallbacksC0548r.f1767I = false;
                        abstractComponentCallbacksC0548r.f1796t.m1371n();
                    }
                    this.f1647d = false;
                    return;
                }
                if (iM1391d <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            m1396i();
                            break;
                        case 0:
                            m1394g();
                            break;
                        case 1:
                            m1395h();
                            abstractComponentCallbacksC0548r.f1777a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0548r.f1790n = false;
                            abstractComponentCallbacksC0548r.f1777a = 2;
                            break;
                        case 3:
                            if (C0518H.m1330F(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0548r);
                            }
                            if (abstractComponentCallbacksC0548r.f1763E != null && abstractComponentCallbacksC0548r.f1779c == null) {
                                m1402o();
                            }
                            if (abstractComponentCallbacksC0548r.f1763E != null && (viewGroup2 = abstractComponentCallbacksC0548r.f1762D) != null) {
                                C0539i c0539iM1433f2 = C0539i.m1433f(viewGroup2, abstractComponentCallbacksC0548r.m1461j().m1338D());
                                c0539iM1433f2.getClass();
                                if (C0518H.m1330F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0548r);
                                }
                                c0539iM1433f2.m1434a(1, 3, this);
                            }
                            abstractComponentCallbacksC0548r.f1777a = 3;
                            break;
                        case 4:
                            m1404q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0548r.f1777a = 5;
                            break;
                        case 6:
                            m1399l();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            m1390c();
                            break;
                        case 1:
                            m1392e();
                            break;
                        case 2:
                            m1397j();
                            m1393f();
                            break;
                        case 3:
                            m1388a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0548r.f1763E != null && (viewGroup3 = abstractComponentCallbacksC0548r.f1762D) != null) {
                                C0539i c0539iM1433f3 = C0539i.m1433f(viewGroup3, abstractComponentCallbacksC0548r.m1461j().m1338D());
                                int iM1413b = AbstractC0529T.m1413b(abstractComponentCallbacksC0548r.f1763E.getVisibility());
                                c0539iM1433f3.getClass();
                                if (C0518H.m1330F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0548r);
                                }
                                c0539iM1433f3.m1434a(iM1413b, 2, this);
                            }
                            abstractComponentCallbacksC0548r.f1777a = 4;
                            break;
                        case 5:
                            m1403p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0548r.f1777a = 6;
                            break;
                        case 7:
                            m1401n();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.f1647d = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1399l() {
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0548r);
        }
        abstractComponentCallbacksC0548r.f1796t.m1377t(5);
        if (abstractComponentCallbacksC0548r.f1763E != null) {
            abstractComponentCallbacksC0548r.f1772N.m1405e(EnumC0580l.ON_PAUSE);
        }
        abstractComponentCallbacksC0548r.f1771M.m1484d(EnumC0580l.ON_PAUSE);
        abstractComponentCallbacksC0548r.f1777a = 6;
        abstractComponentCallbacksC0548r.f1761C = true;
        this.f1644a.m301i(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m1400m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        Bundle bundle = abstractComponentCallbacksC0548r.f1778b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0548r.f1779c = abstractComponentCallbacksC0548r.f1778b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0548r.f1780d = abstractComponentCallbacksC0548r.f1778b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0548r.f1778b.getString("android:target_state");
        abstractComponentCallbacksC0548r.f1784h = string;
        if (string != null) {
            abstractComponentCallbacksC0548r.f1785i = abstractComponentCallbacksC0548r.f1778b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0548r.f1778b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0548r.f1765G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0548r.f1764F = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1401n() {
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0548r);
        }
        C0546p c0546p = abstractComponentCallbacksC0548r.f1766H;
        View view = c0546p == null ? null : c0546p.f1757k;
        if (view != null) {
            if (view == abstractComponentCallbacksC0548r.f1763E) {
                boolean zRequestFocus = view.requestFocus();
                if (C0518H.m1330F(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(zRequestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(abstractComponentCallbacksC0548r);
                    sb.append(" resulting in focused view ");
                    sb.append(abstractComponentCallbacksC0548r.f1763E.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == abstractComponentCallbacksC0548r.f1763E) {
                        boolean zRequestFocus2 = view.requestFocus();
                        if (C0518H.m1330F(2)) {
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC0548r.m1457f().f1757k = null;
        abstractComponentCallbacksC0548r.f1796t.m1342L();
        abstractComponentCallbacksC0548r.f1796t.m1382y(true);
        abstractComponentCallbacksC0548r.f1777a = 7;
        abstractComponentCallbacksC0548r.f1761C = true;
        C0588t c0588t = abstractComponentCallbacksC0548r.f1771M;
        EnumC0580l enumC0580l = EnumC0580l.ON_RESUME;
        c0588t.m1484d(enumC0580l);
        if (abstractComponentCallbacksC0548r.f1763E != null) {
            abstractComponentCallbacksC0548r.f1772N.f1660c.m1484d(enumC0580l);
        }
        C0518H c0518h = abstractComponentCallbacksC0548r.f1796t;
        c0518h.f1582E = false;
        c0518h.f1583F = false;
        c0518h.f1589L.f1630h = false;
        c0518h.m1377t(7);
        this.f1644a.m304m(false);
        abstractComponentCallbacksC0548r.f1778b = null;
        abstractComponentCallbacksC0548r.f1779c = null;
        abstractComponentCallbacksC0548r.f1780d = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m1402o() {
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (abstractComponentCallbacksC0548r.f1763E == null) {
            return;
        }
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0548r + " with view " + abstractComponentCallbacksC0548r.f1763E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0548r.f1763E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0548r.f1779c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0548r.f1772N.f1661d.m1173c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0548r.f1780d = bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m1403p() {
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0548r);
        }
        abstractComponentCallbacksC0548r.f1796t.m1342L();
        abstractComponentCallbacksC0548r.f1796t.m1382y(true);
        abstractComponentCallbacksC0548r.f1777a = 5;
        abstractComponentCallbacksC0548r.f1761C = false;
        abstractComponentCallbacksC0548r.mo1450x();
        if (!abstractComponentCallbacksC0548r.f1761C) {
            throw new C0530U("Fragment " + abstractComponentCallbacksC0548r + " did not call through to super.onStart()");
        }
        C0588t c0588t = abstractComponentCallbacksC0548r.f1771M;
        EnumC0580l enumC0580l = EnumC0580l.ON_START;
        c0588t.m1484d(enumC0580l);
        if (abstractComponentCallbacksC0548r.f1763E != null) {
            abstractComponentCallbacksC0548r.f1772N.f1660c.m1484d(enumC0580l);
        }
        C0518H c0518h = abstractComponentCallbacksC0548r.f1796t;
        c0518h.f1582E = false;
        c0518h.f1583F = false;
        c0518h.f1589L.f1630h = false;
        c0518h.m1377t(5);
        this.f1644a.m306o(false);
    }

    /* JADX INFO: renamed from: q */
    public final void m1404q() {
        boolean zM1330F = C0518H.m1330F(3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1646c;
        if (zM1330F) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0548r);
        }
        C0518H c0518h = abstractComponentCallbacksC0548r.f1796t;
        c0518h.f1583F = true;
        c0518h.f1589L.f1630h = true;
        c0518h.m1377t(4);
        if (abstractComponentCallbacksC0548r.f1763E != null) {
            abstractComponentCallbacksC0548r.f1772N.m1405e(EnumC0580l.ON_STOP);
        }
        abstractComponentCallbacksC0548r.f1771M.m1484d(EnumC0580l.ON_STOP);
        abstractComponentCallbacksC0548r.f1777a = 4;
        abstractComponentCallbacksC0548r.f1761C = false;
        abstractComponentCallbacksC0548r.mo1451y();
        if (abstractComponentCallbacksC0548r.f1761C) {
            this.f1644a.m307q(false);
            return;
        }
        throw new C0530U("Fragment " + abstractComponentCallbacksC0548r + " did not call through to super.onStop()");
    }

    public C0523M(C0048n c0048n, C0010k c0010k, ClassLoader classLoader, C0512B c0512b, C0522L c0522l) {
        this.f1644a = c0048n;
        this.f1645b = c0010k;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548rM1326a = c0512b.m1326a(c0522l.f1631a);
        Bundle bundle = c0522l.f1640j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0548rM1326a.m1456E(bundle);
        abstractComponentCallbacksC0548rM1326a.f1781e = c0522l.f1632b;
        abstractComponentCallbacksC0548rM1326a.f1789m = c0522l.f1633c;
        abstractComponentCallbacksC0548rM1326a.f1791o = true;
        abstractComponentCallbacksC0548rM1326a.f1798v = c0522l.f1634d;
        abstractComponentCallbacksC0548rM1326a.f1799w = c0522l.f1635e;
        abstractComponentCallbacksC0548rM1326a.f1800x = c0522l.f1636f;
        abstractComponentCallbacksC0548rM1326a.f1759A = c0522l.f1637g;
        abstractComponentCallbacksC0548rM1326a.f1788l = c0522l.f1638h;
        abstractComponentCallbacksC0548rM1326a.f1802z = c0522l.f1639i;
        abstractComponentCallbacksC0548rM1326a.f1801y = c0522l.f1641k;
        abstractComponentCallbacksC0548rM1326a.f1770L = EnumC0581m.values()[c0522l.f1642l];
        Bundle bundle2 = c0522l.f1643m;
        if (bundle2 != null) {
            abstractComponentCallbacksC0548rM1326a.f1778b = bundle2;
        } else {
            abstractComponentCallbacksC0548rM1326a.f1778b = new Bundle();
        }
        this.f1646c = abstractComponentCallbacksC0548rM1326a;
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0548rM1326a);
        }
    }

    public C0523M(C0048n c0048n, C0010k c0010k, AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r, C0522L c0522l) {
        this.f1644a = c0048n;
        this.f1645b = c0010k;
        this.f1646c = abstractComponentCallbacksC0548r;
        abstractComponentCallbacksC0548r.f1779c = null;
        abstractComponentCallbacksC0548r.f1780d = null;
        abstractComponentCallbacksC0548r.f1793q = 0;
        abstractComponentCallbacksC0548r.f1790n = false;
        abstractComponentCallbacksC0548r.f1787k = false;
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = abstractComponentCallbacksC0548r.f1783g;
        abstractComponentCallbacksC0548r.f1784h = abstractComponentCallbacksC0548r2 != null ? abstractComponentCallbacksC0548r2.f1781e : null;
        abstractComponentCallbacksC0548r.f1783g = null;
        Bundle bundle = c0522l.f1643m;
        if (bundle != null) {
            abstractComponentCallbacksC0548r.f1778b = bundle;
        } else {
            abstractComponentCallbacksC0548r.f1778b = new Bundle();
        }
    }
}
