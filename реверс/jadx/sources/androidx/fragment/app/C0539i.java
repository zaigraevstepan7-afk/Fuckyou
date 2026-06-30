package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000A.C0010k;
import p005C0.C0048n;
import p015I0.C0109e;
import p016J.C0130b;
import p018K.RunnableC0158n;
import p024N.AbstractC0240S;
import p089t.AbstractC1048e;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0539i {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f1723a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1724b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f1725c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f1726d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1727e = false;

    public C0539i(ViewGroup viewGroup) {
        this.f1723a = viewGroup;
    }

    /* JADX INFO: renamed from: f */
    public static C0539i m1433f(ViewGroup viewGroup, C0109e c0109e) {
        Object tag = viewGroup.getTag(R.id.resc);
        if (tag instanceof C0539i) {
            return (C0539i) tag;
        }
        c0109e.getClass();
        C0539i c0539i = new C0539i(viewGroup);
        viewGroup.setTag(R.id.resc, c0539i);
        return c0539i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1434a(int i2, int i3, C0523M c0523m) {
        synchronized (this.f1724b) {
            try {
                C0130b c0130b = new C0130b();
                C0528S c0528sM1437d = m1437d(c0523m.f1646c);
                if (c0528sM1437d != null) {
                    c0528sM1437d.m1410c(i2, i3);
                    return;
                }
                C0528S c0528s = new C0528S(i2, i3, c0523m, c0130b);
                this.f1724b.add(c0528s);
                c0528s.f1670d.add(new RunnableC0527Q(this, c0528s, 0));
                c0528s.f1670d.add(new RunnableC0527Q(this, c0528s, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1435b(ArrayList arrayList, boolean z2) {
        Iterator it;
        ViewGroup viewGroup;
        Iterator it2 = arrayList.iterator();
        C0528S c0528s = null;
        C0528S c0528s2 = null;
        while (it2.hasNext()) {
            C0528S c0528s3 = (C0528S) it2.next();
            int iM1414c = AbstractC0529T.m1414c(c0528s3.f1669c.f1763E);
            int iM2545a = AbstractC1048e.m2545a(c0528s3.f1667a);
            if (iM2545a != 0) {
                if (iM2545a != 1) {
                    if (iM2545a == 2 || iM2545a == 3) {
                    }
                } else if (iM1414c != 2) {
                    c0528s2 = c0528s3;
                }
            }
            if (iM1414c == 2 && c0528s == null) {
                c0528s = c0528s3;
            }
        }
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Executing operations from " + c0528s + " to " + c0528s2);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0538h> arrayList3 = new ArrayList();
        ArrayList<C0528S> arrayList4 = new ArrayList(arrayList);
        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = ((C0528S) arrayList.get(arrayList.size() - 1)).f1669c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0546p c0546p = ((C0528S) it3.next()).f1669c.f1766H;
            C0546p c0546p2 = abstractComponentCallbacksC0548r.f1766H;
            c0546p.f1748b = c0546p2.f1748b;
            c0546p.f1749c = c0546p2.f1749c;
            c0546p.f1750d = c0546p2.f1750d;
            c0546p.f1751e = c0546p2.f1751e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it4.hasNext()) {
                break;
            }
            C0528S c0528s4 = (C0528S) it4.next();
            C0130b c0130b = new C0130b();
            c0528s4.m1411d();
            HashSet hashSet = c0528s4.f1671e;
            hashSet.add(c0130b);
            C0536f c0536f = new C0536f(c0528s4, c0130b);
            c0536f.f1719d = false;
            c0536f.f1718c = z2;
            arrayList2.add(c0536f);
            C0130b c0130b2 = new C0130b();
            c0528s4.m1411d();
            hashSet.add(c0130b2);
            if (!z2 ? c0528s4 == c0528s2 : c0528s4 == c0528s) {
                z3 = true;
            }
            C0538h c0538h = new C0538h(c0528s4, c0130b2);
            int i2 = c0528s4.f1667a;
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r2 = c0528s4.f1669c;
            if (i2 == 2) {
                if (z2) {
                    C0546p c0546p3 = abstractComponentCallbacksC0548r2.f1766H;
                } else {
                    abstractComponentCallbacksC0548r2.getClass();
                }
                if (z2) {
                    C0546p c0546p4 = abstractComponentCallbacksC0548r2.f1766H;
                } else {
                    C0546p c0546p5 = abstractComponentCallbacksC0548r2.f1766H;
                }
            } else if (z2) {
                C0546p c0546p6 = abstractComponentCallbacksC0548r2.f1766H;
            } else {
                abstractComponentCallbacksC0548r2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0546p c0546p7 = abstractComponentCallbacksC0548r2.f1766H;
                } else {
                    abstractComponentCallbacksC0548r2.getClass();
                }
            }
            arrayList3.add(c0538h);
            c0528s4.f1670d.add(new RunnableC0158n(this, arrayList4, c0528s4));
        }
        HashMap map = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            C0528S c0528s5 = (C0528S) ((C0538h) it5.next()).f1721a;
            AbstractC0529T.m1414c(c0528s5.f1669c.f1763E);
            int i3 = c0528s5.f1667a;
        }
        for (C0538h c0538h2 : arrayList3) {
            map.put((C0528S) c0538h2.f1721a, Boolean.FALSE);
            c0538h2.m1427d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f1723a;
        Context context = viewGroup2.getContext();
        ArrayList<C0536f> arrayList5 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        boolean z4 = false;
        while (it6.hasNext()) {
            C0536f c0536f2 = (C0536f) it6.next();
            C0528S c0528s6 = (C0528S) c0536f2.f1721a;
            int iM1414c2 = AbstractC0529T.m1414c(c0528s6.f1669c.f1763E);
            int i4 = c0528s6.f1667a;
            boolean z5 = zContainsValue;
            if (iM1414c2 == i4 || !(iM1414c2 == 2 || i4 == 2)) {
                it = it6;
                viewGroup = viewGroup2;
                c0536f2.m1427d();
            } else {
                C0048n c0048nM1425j = c0536f2.m1425j(context);
                if (c0048nM1425j == null) {
                    c0536f2.m1427d();
                } else {
                    Animator animator = (Animator) c0048nM1425j.f175c;
                    if (animator == null) {
                        arrayList5.add(c0536f2);
                    } else {
                        C0528S c0528s7 = (C0528S) c0536f2.f1721a;
                        it = it6;
                        boolean zEquals = Boolean.TRUE.equals(map.get(c0528s7));
                        AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r3 = c0528s7.f1669c;
                        if (zEquals) {
                            if (C0518H.m1330F(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0548r3 + " as this Fragment was involved in a Transition.");
                            }
                            c0536f2.m1427d();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z6 = c0528s7.f1667a == 3;
                            if (z6) {
                                arrayList4.remove(c0528s7);
                            }
                            View view = abstractComponentCallbacksC0548r3.f1763E;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new C0534d(viewGroup3, view, z6, c0528s7, c0536f2));
                            animator.setTarget(view);
                            animator.start();
                            if (C0518H.m1330F(2)) {
                                Log.v("FragmentManager", "Animator from operation " + c0528s7 + " has started.");
                            }
                            ((C0130b) c0536f2.f1722b).m505a(new C0048n(animator, 6, c0528s7));
                            viewGroup2 = viewGroup3;
                            it6 = it;
                            z4 = true;
                            zContainsValue = z5;
                        }
                    }
                }
                it = it6;
                viewGroup = viewGroup2;
            }
            viewGroup2 = viewGroup;
            it6 = it;
            zContainsValue = z5;
        }
        boolean z7 = zContainsValue;
        ViewGroup viewGroup4 = viewGroup2;
        for (C0536f c0536f3 : arrayList5) {
            C0528S c0528s8 = (C0528S) c0536f3.f1721a;
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r4 = c0528s8.f1669c;
            if (z7) {
                if (C0518H.m1330F(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0548r4 + " as Animations cannot run alongside Transitions.");
                }
                c0536f3.m1427d();
            } else if (z4) {
                if (C0518H.m1330F(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0548r4 + " as Animations cannot run alongside Animators.");
                }
                c0536f3.m1427d();
            } else {
                View view2 = abstractComponentCallbacksC0548r4.f1763E;
                C0048n c0048nM1425j2 = c0536f3.m1425j(context);
                c0048nM1425j2.getClass();
                Animation animation = (Animation) c0048nM1425j2.f174b;
                animation.getClass();
                if (c0528s8.f1667a != 1) {
                    view2.startAnimation(animation);
                    c0536f3.m1427d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    RunnableC0551u runnableC0551u = new RunnableC0551u(animation, viewGroup4, view2);
                    runnableC0551u.setAnimationListener(new AnimationAnimationListenerC0535e(view2, viewGroup4, c0536f3, c0528s8));
                    view2.startAnimation(runnableC0551u);
                    if (C0518H.m1330F(2)) {
                        Log.v("FragmentManager", "Animation from operation " + c0528s8 + " has started.");
                    }
                }
                ((C0130b) c0536f3.f1722b).m505a(new C0010k(view2, viewGroup4, c0536f3, c0528s8));
            }
        }
        for (C0528S c0528s9 : arrayList4) {
            AbstractC0529T.m1412a(c0528s9.f1669c.f1763E, c0528s9.f1667a);
        }
        arrayList4.clear();
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c0528s + " to " + c0528s2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1436c() {
        if (this.f1727e) {
            return;
        }
        ViewGroup viewGroup = this.f1723a;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (!viewGroup.isAttachedToWindow()) {
            m1438e();
            this.f1726d = false;
            return;
        }
        synchronized (this.f1724b) {
            try {
                if (!this.f1724b.isEmpty()) {
                    ArrayList<C0528S> arrayList = new ArrayList(this.f1725c);
                    this.f1725c.clear();
                    for (C0528S c0528s : arrayList) {
                        if (C0518H.m1330F(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0528s);
                        }
                        c0528s.m1408a();
                        if (!c0528s.f1673g) {
                            this.f1725c.add(c0528s);
                        }
                    }
                    m1439g();
                    ArrayList arrayList2 = new ArrayList(this.f1724b);
                    this.f1724b.clear();
                    this.f1725c.addAll(arrayList2);
                    if (C0518H.m1330F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((C0528S) it.next()).m1411d();
                    }
                    m1435b(arrayList2, this.f1726d);
                    this.f1726d = false;
                    if (C0518H.m1330F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C0528S m1437d(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        for (C0528S c0528s : this.f1724b) {
            if (c0528s.f1669c.equals(abstractComponentCallbacksC0548r) && !c0528s.f1672f) {
                return c0528s;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m1438e() {
        if (C0518H.m1330F(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1723a;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1724b) {
            try {
                m1439g();
                Iterator it = this.f1724b.iterator();
                while (it.hasNext()) {
                    ((C0528S) it.next()).m1411d();
                }
                for (C0528S c0528s : new ArrayList(this.f1725c)) {
                    if (C0518H.m1330F(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zIsAttachedToWindow ? "" : "Container " + this.f1723a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(c0528s);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c0528s.m1408a();
                }
                for (C0528S c0528s2 : new ArrayList(this.f1724b)) {
                    if (C0518H.m1330F(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zIsAttachedToWindow ? "" : "Container " + this.f1723a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(c0528s2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    c0528s2.m1408a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1439g() {
        for (C0528S c0528s : this.f1724b) {
            if (c0528s.f1668b == 2) {
                c0528s.m1410c(AbstractC0529T.m1413b(c0528s.f1669c.m1454C().getVisibility()), 1);
            }
        }
    }
}
