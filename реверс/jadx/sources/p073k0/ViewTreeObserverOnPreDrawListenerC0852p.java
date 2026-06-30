package p073k0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p000A.C0010k;
import p084q.C1027f;
import p084q.C1029h;

/* JADX INFO: renamed from: k0.p */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0852p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public AbstractC0849m f3481a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f3482b;

    /* JADX WARN: Removed duplicated region for block: B:101:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f3 A[EDGE_INSN: B:135:0x01f3->B:91:0x01f3 BREAK  A[LOOP:1: B:19:0x0087->B:90:0x01ea], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC0849m abstractC0849m;
        C0010k c0010k;
        C1027f c1027f;
        C1027f c1027f2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        C0846j c0846j;
        View view;
        C0010k c0010k2;
        C0857u c0857u;
        View view2;
        C0010k c0010k3;
        FrameLayout frameLayout = this.f3482b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC0853q.f3485c;
        FrameLayout frameLayout2 = this.f3482b;
        int i6 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        C1027f c1027fM2261b = AbstractC0853q.m2261b();
        ArrayList arrayList3 = (ArrayList) c1027fM2261b.get(frameLayout2);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            abstractC0849m = this.f3481a;
            arrayList3.add(abstractC0849m);
            abstractC0849m.m2250a(new C0851o(this, c1027fM2261b));
            abstractC0849m.m2252h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0849m) it.next()).mo2235y(frameLayout2);
                }
            }
            abstractC0849m.f3467k = new ArrayList();
            abstractC0849m.f3468l = new ArrayList();
            c0010k = abstractC0849m.f3463g;
            C0010k c0010k4 = abstractC0849m.f3464h;
            c1027f = new C1027f((C1027f) c0010k.f22a);
            c1027f2 = new C1027f((C1027f) c0010k4.f22a);
            i2 = 0;
            while (true) {
                iArr = abstractC0849m.f3466j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    c0010k2 = c0010k;
                    for (int i8 = c1027f.f4104c - 1; i8 >= 0; i8--) {
                        View view3 = (View) c1027f.m2490f(i8);
                        if (view3 != null && abstractC0849m.m2258t(view3) && (c0857u = (C0857u) c1027f2.remove(view3)) != null && abstractC0849m.m2258t(c0857u.f3490b)) {
                            abstractC0849m.f3467k.add((C0857u) c1027f.m2491g(i8));
                            abstractC0849m.f3468l.add(c0857u);
                        }
                    }
                } else if (i7 == 2) {
                    c0010k2 = c0010k;
                    C1027f c1027f3 = (C1027f) c0010k2.f25d;
                    int i9 = c1027f3.f4104c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) c1027f3.m2493i(i10);
                        if (view4 != null && abstractC0849m.m2258t(view4)) {
                            View view5 = (View) ((C1027f) c0010k4.f25d).get(c1027f3.m2490f(i10));
                            if (view5 != null && abstractC0849m.m2258t(view5)) {
                                C0857u c0857u2 = (C0857u) c1027f.get(view4);
                                C0857u c0857u3 = (C0857u) c1027f2.get(view5);
                                if (c0857u2 != null && c0857u3 != null) {
                                    abstractC0849m.f3467k.add(c0857u2);
                                    abstractC0849m.f3468l.add(c0857u3);
                                    c1027f.remove(view4);
                                    c1027f2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 == 3) {
                    c0010k2 = c0010k;
                    SparseArray sparseArray = (SparseArray) c0010k2.f23b;
                    SparseArray sparseArray2 = (SparseArray) c0010k4.f23b;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        View view6 = (View) sparseArray.valueAt(i11);
                        if (view6 != null && abstractC0849m.m2258t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && abstractC0849m.m2258t(view2)) {
                            C0857u c0857u4 = (C0857u) c1027f.get(view6);
                            C0857u c0857u5 = (C0857u) c1027f2.get(view2);
                            if (c0857u4 != null && c0857u5 != null) {
                                abstractC0849m.f3467k.add(c0857u4);
                                abstractC0849m.f3468l.add(c0857u5);
                                c1027f.remove(view6);
                                c1027f2.remove(view2);
                            }
                        }
                    }
                } else if (i7 != 4) {
                    c0010k2 = c0010k;
                } else {
                    C1029h c1029h = (C1029h) c0010k.f24c;
                    int iM2482h = c1029h.m2482h();
                    int i12 = 0;
                    while (i12 < iM2482h) {
                        View view7 = (View) c1029h.m2483i(i12);
                        if (view7 == null || !abstractC0849m.m2258t(view7)) {
                            c0010k3 = c0010k;
                        } else {
                            c0010k3 = c0010k;
                            View view8 = (View) ((C1029h) c0010k4.f24c).m2478d(c1029h.m2480f(i12));
                            if (view8 != null && abstractC0849m.m2258t(view8)) {
                                C0857u c0857u6 = (C0857u) c1027f.get(view7);
                                C0857u c0857u7 = (C0857u) c1027f2.get(view8);
                                if (c0857u6 != null && c0857u7 != null) {
                                    abstractC0849m.f3467k.add(c0857u6);
                                    abstractC0849m.f3468l.add(c0857u7);
                                    c1027f.remove(view7);
                                    c1027f2.remove(view8);
                                }
                            }
                            i12++;
                            c0010k = c0010k3;
                        }
                        i12++;
                        c0010k = c0010k3;
                    }
                    c0010k2 = c0010k;
                }
                i2++;
                c0010k = c0010k2;
                i6 = 1;
            }
            for (i3 = 0; i3 < c1027f.f4104c; i3++) {
                C0857u c0857u8 = (C0857u) c1027f.m2493i(i3);
                if (abstractC0849m.m2258t(c0857u8.f3490b)) {
                    abstractC0849m.f3467k.add(c0857u8);
                    abstractC0849m.f3468l.add(null);
                }
            }
            for (i4 = 0; i4 < c1027f2.f4104c; i4++) {
                C0857u c0857u9 = (C0857u) c1027f2.m2493i(i4);
                if (abstractC0849m.m2258t(c0857u9.f3490b)) {
                    abstractC0849m.f3468l.add(c0857u9);
                    abstractC0849m.f3467k.add(null);
                }
            }
            C1027f c1027fM2247p = AbstractC0849m.m2247p();
            int i13 = c1027fM2247p.f4104c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) c1027fM2247p.m2490f(i5);
                if (animator != null && (c0846j = (C0846j) c1027fM2247p.get(animator)) != null && (view = c0846j.f3442a) != null && windowId.equals(c0846j.f3445d)) {
                    C0857u c0857uM2257r = abstractC0849m.m2257r(view, true);
                    C0857u c0857uM2255n = abstractC0849m.m2255n(view, true);
                    if (c0857uM2257r == null && c0857uM2255n == null) {
                        c0857uM2255n = (C0857u) ((C1027f) abstractC0849m.f3464h.f22a).get(view);
                    }
                    if (c0857uM2257r != null || c0857uM2255n != null) {
                        C0857u c0857u10 = c0846j.f3444c;
                        AbstractC0849m abstractC0849m2 = c0846j.f3446e;
                        if (abstractC0849m2.mo2244s(c0857u10, c0857uM2255n)) {
                            abstractC0849m2.m2256o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c1027fM2247p.remove(animator);
                            }
                        }
                    }
                }
            }
            abstractC0849m.mo2232l(frameLayout2, abstractC0849m.f3463g, abstractC0849m.f3464h, abstractC0849m.f3467k, abstractC0849m.f3468l);
            abstractC0849m.mo2236z();
            return true;
        }
        arrayList3 = new ArrayList();
        c1027fM2261b.put(frameLayout2, arrayList3);
        abstractC0849m = this.f3481a;
        arrayList3.add(abstractC0849m);
        abstractC0849m.m2250a(new C0851o(this, c1027fM2261b));
        abstractC0849m.m2252h(frameLayout2, false);
        if (arrayList != null) {
        }
        abstractC0849m.f3467k = new ArrayList();
        abstractC0849m.f3468l = new ArrayList();
        c0010k = abstractC0849m.f3463g;
        C0010k c0010k42 = abstractC0849m.f3464h;
        c1027f = new C1027f((C1027f) c0010k.f22a);
        c1027f2 = new C1027f((C1027f) c0010k42.f22a);
        i2 = 0;
        while (true) {
            iArr = abstractC0849m.f3466j;
            if (i2 < iArr.length) {
            }
            i2++;
            c0010k = c0010k2;
            i6 = 1;
        }
        while (i3 < c1027f.f4104c) {
        }
        while (i4 < c1027f2.f4104c) {
        }
        C1027f c1027fM2247p2 = AbstractC0849m.m2247p();
        int i132 = c1027fM2247p2.f4104c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i5 >= 0) {
        }
        abstractC0849m.mo2232l(frameLayout2, abstractC0849m.f3463g, abstractC0849m.f3464h, abstractC0849m.f3467k, abstractC0849m.f3468l);
        abstractC0849m.mo2236z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f3482b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC0853q.f3485c;
        FrameLayout frameLayout2 = this.f3482b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) AbstractC0853q.m2261b().get(frameLayout2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0849m) it.next()).mo2235y(frameLayout2);
            }
        }
        this.f3481a.m2253i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
