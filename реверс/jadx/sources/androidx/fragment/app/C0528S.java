package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000A.C0001b;
import p016J.C0130b;
import p016J.InterfaceC0129a;
import p089t.AbstractC1048e;

/* JADX INFO: renamed from: androidx.fragment.app.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0528S {

    /* JADX INFO: renamed from: a */
    public int f1667a;

    /* JADX INFO: renamed from: b */
    public int f1668b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0548r f1669c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f1670d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f1671e = new HashSet();

    /* JADX INFO: renamed from: f */
    public boolean f1672f = false;

    /* JADX INFO: renamed from: g */
    public boolean f1673g = false;

    /* JADX INFO: renamed from: h */
    public final C0523M f1674h;

    public C0528S(int i2, int i3, C0523M c0523m, C0130b c0130b) {
        this.f1667a = i2;
        this.f1668b = i3;
        this.f1669c = c0523m.f1646c;
        c0130b.m505a(new C0001b(17, this));
        this.f1674h = c0523m;
    }

    /* JADX INFO: renamed from: a */
    public final void m1408a() {
        if (this.f1672f) {
            return;
        }
        this.f1672f = true;
        HashSet hashSet = this.f1671e;
        if (hashSet.isEmpty()) {
            m1409b();
            return;
        }
        for (C0130b c0130b : new ArrayList(hashSet)) {
            synchronized (c0130b) {
                try {
                    if (!c0130b.f434a) {
                        c0130b.f434a = true;
                        c0130b.f436c = true;
                        InterfaceC0129a interfaceC0129a = c0130b.f435b;
                        if (interfaceC0129a != null) {
                            try {
                                interfaceC0129a.mo53r();
                            } catch (Throwable th) {
                                synchronized (c0130b) {
                                    c0130b.f436c = false;
                                    c0130b.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0130b) {
                            c0130b.f436c = false;
                            c0130b.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1409b() {
        if (!this.f1673g) {
            if (C0518H.m1330F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1673g = true;
            Iterator it = this.f1670d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1674h.m1398k();
    }

    /* JADX INFO: renamed from: c */
    public final void m1410c(int i2, int i3) {
        int iM2545a = AbstractC1048e.m2545a(i3);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = this.f1669c;
        if (iM2545a == 0) {
            if (this.f1667a != 1) {
                if (C0518H.m1330F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0548r + " mFinalState = " + AbstractC0529T.m1421j(this.f1667a) + " -> " + AbstractC0529T.m1421j(i2) + ". ");
                }
                this.f1667a = i2;
                return;
            }
            return;
        }
        if (iM2545a == 1) {
            if (this.f1667a == 1) {
                if (C0518H.m1330F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0548r + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0529T.m1420i(this.f1668b) + " to ADDING.");
                }
                this.f1667a = 2;
                this.f1668b = 2;
                return;
            }
            return;
        }
        if (iM2545a != 2) {
            return;
        }
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0548r + " mFinalState = " + AbstractC0529T.m1421j(this.f1667a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0529T.m1420i(this.f1668b) + " to REMOVING.");
        }
        this.f1667a = 1;
        this.f1668b = 3;
    }

    /* JADX INFO: renamed from: d */
    public final void m1411d() {
        int i2 = this.f1668b;
        C0523M c0523m = this.f1674h;
        if (i2 != 2) {
            if (i2 == 3) {
                AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0523m.f1646c;
                View viewM1454C = abstractComponentCallbacksC0548r.m1454C();
                if (C0518H.m1330F(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewM1454C.findFocus() + " on view " + viewM1454C + " for Fragment " + abstractComponentCallbacksC0548r);
                }
                viewM1454C.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = c0523m.f1646c;
        View viewFindFocus = abstractComponentCallbacksC0548r2.f1763E.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC0548r2.m1457f().f1757k = viewFindFocus;
            if (C0518H.m1330F(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0548r2);
            }
        }
        View viewM1454C2 = this.f1669c.m1454C();
        if (viewM1454C2.getParent() == null) {
            c0523m.m1389b();
            viewM1454C2.setAlpha(0.0f);
        }
        if (viewM1454C2.getAlpha() == 0.0f && viewM1454C2.getVisibility() == 0) {
            viewM1454C2.setVisibility(4);
        }
        C0546p c0546p = abstractComponentCallbacksC0548r2.f1766H;
        viewM1454C2.setAlpha(c0546p == null ? 1.0f : c0546p.f1756j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC0529T.m1421j(this.f1667a) + "} {mLifecycleImpact = " + AbstractC0529T.m1420i(this.f1668b) + "} {mFragment = " + this.f1669c + "}";
    }
}
