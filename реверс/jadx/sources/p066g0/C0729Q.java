package p066g0;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.AbstractC0529T;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p016J.AbstractC0139k;
import p024N.AbstractC0240S;
import p024N.C0248a;
import p024N.C0250b;
import p024N.C0280q;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: g0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0729Q {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2887a;

    /* JADX INFO: renamed from: b */
    public ArrayList f2888b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2889c;

    /* JADX INFO: renamed from: d */
    public final List f2890d;

    /* JADX INFO: renamed from: e */
    public int f2891e;

    /* JADX INFO: renamed from: f */
    public int f2892f;

    /* JADX INFO: renamed from: g */
    public C0728P f2893g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f2894h;

    public C0729Q(RecyclerView recyclerView) {
        this.f2894h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2887a = arrayList;
        this.f2888b = null;
        this.f2889c = new ArrayList();
        this.f2890d = Collections.unmodifiableList(arrayList);
        this.f2891e = 2;
        this.f2892f = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2020a(AbstractC0741b0 abstractC0741b0, boolean z2) {
        RecyclerView.m1593l(abstractC0741b0);
        RecyclerView recyclerView = this.f2894h;
        C0745d0 c0745d0 = recyclerView.f1981l0;
        View view = abstractC0741b0.f2931a;
        if (c0745d0 != null) {
            C0743c0 c0743c0 = c0745d0.f2961e;
            AbstractC0240S.m785p(view, c0743c0 != null ? (C0250b) c0743c0.f2956e.remove(view) : null);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.f1984n;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f1967e0 != null) {
                recyclerView.f1970g.m292J(abstractC0741b0);
            }
            if (RecyclerView.f1926A0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC0741b0);
            }
        }
        abstractC0741b0.f2949s = null;
        abstractC0741b0.f2948r = null;
        C0728P c0728pM2022c = m2022c();
        c0728pM2022c.getClass();
        int i2 = abstractC0741b0.f2936f;
        ArrayList arrayList2 = c0728pM2022c.m2019a(i2).f2880a;
        if (((C0727O) c0728pM2022c.f2884a.get(i2)).f2881b <= arrayList2.size()) {
            AbstractC0383m.m1042g(view);
        } else {
            if (RecyclerView.f1934z0 && arrayList2.contains(abstractC0741b0)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC0741b0.m2059m();
            arrayList2.add(abstractC0741b0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2021b(int i2) {
        RecyclerView recyclerView = this.f2894h;
        if (i2 >= 0 && i2 < recyclerView.f1967e0.m2035b()) {
            return !recyclerView.f1967e0.f2910g ? i2 : recyclerView.f1966e.m561e(i2, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f1967e0.m2035b() + recyclerView.m1596B());
    }

    /* JADX INFO: renamed from: c */
    public final C0728P m2022c() {
        if (this.f2893g == null) {
            C0728P c0728p = new C0728P();
            c0728p.f2884a = new SparseArray();
            c0728p.f2885b = 0;
            c0728p.f2886c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2893g = c0728p;
            m2023d();
        }
        return this.f2893g;
    }

    /* JADX INFO: renamed from: d */
    public final void m2023d() {
        RecyclerView recyclerView;
        AbstractC0714B abstractC0714B;
        C0728P c0728p = this.f2893g;
        if (c0728p == null || (abstractC0714B = (recyclerView = this.f2894h).f1980l) == null || !recyclerView.f1992r) {
            return;
        }
        c0728p.f2886c.add(abstractC0714B);
    }

    /* JADX INFO: renamed from: e */
    public final void m2024e(AbstractC0714B abstractC0714B, boolean z2) {
        C0728P c0728p = this.f2893g;
        if (c0728p == null) {
            return;
        }
        Set set = c0728p.f2886c;
        set.remove(abstractC0714B);
        if (set.size() != 0 || z2) {
            return;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = c0728p.f2884a;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((C0727O) sparseArray.get(sparseArray.keyAt(i2))).f2880a;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                AbstractC0383m.m1042g(((AbstractC0741b0) arrayList.get(i3)).f2931a);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2025f() {
        ArrayList arrayList = this.f2889c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2026g(size);
        }
        arrayList.clear();
        if (RecyclerView.f1930E0) {
            C0763n c0763n = this.f2894h.f1965d0;
            int[] iArr = c0763n.f3077c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0763n.f3078d = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2026g(int i2) {
        if (RecyclerView.f1926A0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i2);
        }
        ArrayList arrayList = this.f2889c;
        AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList.get(i2);
        if (RecyclerView.f1926A0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC0741b0);
        }
        m2020a(abstractC0741b0, true);
        arrayList.remove(i2);
    }

    /* JADX INFO: renamed from: h */
    public final void m2027h(View view) {
        AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
        boolean zM2056j = abstractC0741b0M1586M.m2056j();
        RecyclerView recyclerView = this.f2894h;
        if (zM2056j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC0741b0M1586M.m2055i()) {
            abstractC0741b0M1586M.f2944n.m2031l(abstractC0741b0M1586M);
        } else if (abstractC0741b0M1586M.m2062p()) {
            abstractC0741b0M1586M.f2940j &= -33;
        }
        m2028i(abstractC0741b0M1586M);
        if (recyclerView.f1944J == null || abstractC0741b0M1586M.m2053g()) {
            return;
        }
        recyclerView.f1944J.mo1980d(abstractC0741b0M1586M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2028i(AbstractC0741b0 abstractC0741b0) {
        boolean z2;
        boolean z3;
        int i2;
        boolean zM2055i = abstractC0741b0.m2055i();
        boolean z4 = true;
        RecyclerView recyclerView = this.f2894h;
        View view = abstractC0741b0.f2931a;
        if (zM2055i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC0741b0.m2055i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m1596B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC0741b0.m2056j()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(abstractC0741b0);
            throw new IllegalArgumentException(AbstractC0529T.m1415d(recyclerView, sb2));
        }
        if (abstractC0741b0.m2061o()) {
            throw new IllegalArgumentException(AbstractC0529T.m1415d(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((abstractC0741b0.f2940j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            z2 = view.hasTransientState();
        }
        AbstractC0714B abstractC0714B = recyclerView.f1980l;
        boolean z5 = RecyclerView.f1934z0;
        ArrayList arrayList = this.f2889c;
        if (z5 && arrayList.contains(abstractC0741b0)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(abstractC0741b0);
            throw new IllegalArgumentException(AbstractC0529T.m1415d(recyclerView, sb3));
        }
        if (abstractC0741b0.m2053g()) {
            if (this.f2892f <= 0 || (abstractC0741b0.f2940j & 526) != 0) {
                z3 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f2892f && size > 0) {
                    m2026g(0);
                    size--;
                }
                if (RecyclerView.f1930E0 && size > 0) {
                    C0763n c0763n = recyclerView.f1965d0;
                    int i3 = abstractC0741b0.f2933c;
                    if (c0763n.f3077c != null) {
                        int i4 = c0763n.f3078d * 2;
                        for (int i5 = 0; i5 < i4; i5 += 2) {
                            if (c0763n.f3077c[i5] == i3) {
                                break;
                            }
                        }
                        i2 = size - 1;
                        loop1: while (i2 >= 0) {
                            int i6 = ((AbstractC0741b0) arrayList.get(i2)).f2933c;
                            C0763n c0763n2 = recyclerView.f1965d0;
                            if (c0763n2.f3077c == null) {
                                break;
                            }
                            int i7 = c0763n2.f3078d * 2;
                            for (int i8 = 0; i8 < i7; i8 += 2) {
                                if (c0763n2.f3077c[i8] == i6) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        size = i2 + 1;
                    } else {
                        i2 = size - 1;
                        loop1: while (i2 >= 0) {
                        }
                        size = i2 + 1;
                    }
                    recyclerView.f1970g.m292J(abstractC0741b0);
                    if (z || z4 || !z2) {
                        return;
                    }
                    AbstractC0383m.m1042g(view);
                    abstractC0741b0.f2949s = null;
                    abstractC0741b0.f2948r = null;
                    return;
                }
                arrayList.add(size, abstractC0741b0);
                z3 = true;
            }
            if (!z3) {
                m2020a(abstractC0741b0, true);
                z = z3;
                recyclerView.f1970g.m292J(abstractC0741b0);
                if (z) {
                    return;
                } else {
                    return;
                }
            }
            z = z3;
        } else if (RecyclerView.f1926A0) {
            Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.m1596B());
        }
        z4 = false;
        recyclerView.f1970g.m292J(abstractC0741b0);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2029j(View view) {
        AbstractC0719G abstractC0719G;
        AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
        boolean z2 = (abstractC0741b0M1586M.f2940j & 12) != 0;
        RecyclerView recyclerView = this.f2894h;
        if (!z2 && abstractC0741b0M1586M.m2057k() && (abstractC0719G = recyclerView.f1944J) != null) {
            C0756j c0756j = (C0756j) abstractC0719G;
            if (abstractC0741b0M1586M.m2049c().isEmpty() && c0756j.f3014g && !abstractC0741b0M1586M.m2052f()) {
                if (this.f2888b == null) {
                    this.f2888b = new ArrayList();
                }
                abstractC0741b0M1586M.f2944n = this;
                abstractC0741b0M1586M.f2945o = true;
                this.f2888b.add(abstractC0741b0M1586M);
                return;
            }
        }
        if (abstractC0741b0M1586M.m2052f() && !abstractC0741b0M1586M.m2054h() && !recyclerView.f1980l.f2847b) {
            throw new IllegalArgumentException(AbstractC0529T.m1415d(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        abstractC0741b0M1586M.f2944n = this;
        abstractC0741b0M1586M.f2945o = false;
        this.f2887a.add(abstractC0741b0M1586M);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0741b0 m2030k(int i2, long j2) {
        boolean z2;
        AbstractC0741b0 abstractC0741b0Mo987d;
        long j3;
        boolean z3;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams;
        C0724L c0724l;
        RecyclerView recyclerViewM1585G;
        AbstractC0741b0 abstractC0741b0;
        AbstractC0741b0 abstractC0741b02;
        View view;
        int iM2040b;
        boolean z6;
        int size;
        int iM561e;
        boolean z7 = false;
        RecyclerView recyclerView = this.f2894h;
        if (i2 < 0 || i2 >= recyclerView.f1967e0.m2035b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f1967e0.m2035b() + recyclerView.m1596B());
        }
        C0735X c0735x = recyclerView.f1967e0;
        if (c0735x.f2910g) {
            ArrayList arrayList = this.f2888b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                abstractC0741b0Mo987d = null;
                z2 = abstractC0741b0Mo987d == null;
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        abstractC0741b0Mo987d = (AbstractC0741b0) this.f2888b.get(i3);
                        if (!abstractC0741b0Mo987d.m2062p() && abstractC0741b0Mo987d.m2048b() == i2) {
                            abstractC0741b0Mo987d.m2047a(32);
                            break;
                        }
                        i3++;
                    } else if (recyclerView.f1980l.f2847b && (iM561e = recyclerView.f1966e.m561e(i2, 0)) > 0 && iM561e < recyclerView.f1980l.mo985a()) {
                        long jMo1747b = recyclerView.f1980l.mo1747b(iM561e);
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC0741b0 abstractC0741b03 = (AbstractC0741b0) this.f2888b.get(i4);
                            if (!abstractC0741b03.m2062p() && abstractC0741b03.f2935e == jMo1747b) {
                                abstractC0741b03.m2047a(32);
                                abstractC0741b0Mo987d = abstractC0741b03;
                                break;
                            }
                        }
                    }
                }
                abstractC0741b0Mo987d = null;
                if (abstractC0741b0Mo987d == null) {
                }
            }
        } else {
            z2 = false;
            abstractC0741b0Mo987d = null;
        }
        ArrayList arrayList2 = this.f2889c;
        ArrayList arrayList3 = this.f2887a;
        if (abstractC0741b0Mo987d == null) {
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AbstractC0741b0 abstractC0741b04 = (AbstractC0741b0) arrayList3.get(i5);
                if (!abstractC0741b04.m2062p() && abstractC0741b04.m2048b() == i2 && !abstractC0741b04.m2052f() && (c0735x.f2910g || !abstractC0741b04.m2054h())) {
                    abstractC0741b04.m2047a(32);
                    abstractC0741b0Mo987d = abstractC0741b04;
                    break;
                }
            }
            ArrayList arrayList4 = recyclerView.f1968f.f2952c;
            int size3 = arrayList4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i6);
                AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
                if (abstractC0741b0M1586M.m2048b() == i2 && !abstractC0741b0M1586M.m2052f() && !abstractC0741b0M1586M.m2054h()) {
                    break;
                }
                i6++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        abstractC0741b0Mo987d = null;
                        break;
                    }
                    abstractC0741b0Mo987d = (AbstractC0741b0) arrayList2.get(i7);
                    if (abstractC0741b0Mo987d.m2052f() || abstractC0741b0Mo987d.m2048b() != i2 || abstractC0741b0Mo987d.m2050d()) {
                        i7++;
                    } else {
                        arrayList2.remove(i7);
                        if (RecyclerView.f1926A0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i2 + ") found match in cache: " + abstractC0741b0Mo987d);
                        }
                    }
                }
            } else {
                AbstractC0741b0 abstractC0741b0M1586M2 = RecyclerView.m1586M(view);
                C0742c c0742c = recyclerView.f1968f;
                int iIndexOfChild = c0742c.f2950a.f2845a.indexOfChild(view);
                if (iIndexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                C0740b c0740b = c0742c.f2951b;
                if (!c0740b.m2042d(iIndexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                c0740b.m2039a(iIndexOfChild);
                c0742c.m2072j(view);
                C0742c c0742c2 = recyclerView.f1968f;
                int iIndexOfChild2 = c0742c2.f2950a.f2845a.indexOfChild(view);
                if (iIndexOfChild2 == -1) {
                    iM2040b = -1;
                    if (iM2040b != -1) {
                        StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb.append(abstractC0741b0M1586M2);
                        throw new IllegalStateException(AbstractC0529T.m1415d(recyclerView, sb));
                    }
                    recyclerView.f1968f.m2065c(iM2040b);
                    m2029j(view);
                    abstractC0741b0M1586M2.m2047a(8224);
                    abstractC0741b0Mo987d = abstractC0741b0M1586M2;
                } else {
                    C0740b c0740b2 = c0742c2.f2951b;
                    if (!c0740b2.m2042d(iIndexOfChild2)) {
                        iM2040b = iIndexOfChild2 - c0740b2.m2040b(iIndexOfChild2);
                    }
                    if (iM2040b != -1) {
                    }
                }
            }
            if (abstractC0741b0Mo987d != null) {
                if (!abstractC0741b0Mo987d.m2054h()) {
                    int i8 = abstractC0741b0Mo987d.f2933c;
                    if (i8 < 0 || i8 >= recyclerView.f1980l.mo985a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(abstractC0741b0Mo987d);
                        throw new IndexOutOfBoundsException(AbstractC0529T.m1415d(recyclerView, sb2));
                    }
                    if (!c0735x.f2910g) {
                        recyclerView.f1980l.getClass();
                        if (abstractC0741b0Mo987d.f2936f != 0) {
                            z6 = false;
                        } else {
                            AbstractC0714B abstractC0714B = recyclerView.f1980l;
                            if (!abstractC0714B.f2847b || abstractC0741b0Mo987d.f2935e == abstractC0714B.mo1747b(abstractC0741b0Mo987d.f2933c)) {
                                z6 = true;
                            }
                        }
                    }
                } else {
                    if (RecyclerView.f1934z0 && !c0735x.f2910g) {
                        throw new IllegalStateException(AbstractC0529T.m1415d(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z6 = c0735x.f2910g;
                }
                if (z6) {
                    z2 = true;
                } else {
                    abstractC0741b0Mo987d.m2047a(4);
                    if (abstractC0741b0Mo987d.m2055i()) {
                        recyclerView.removeDetachedView(abstractC0741b0Mo987d.f2931a, false);
                        abstractC0741b0Mo987d.f2944n.m2031l(abstractC0741b0Mo987d);
                    } else if (abstractC0741b0Mo987d.m2062p()) {
                        abstractC0741b0Mo987d.f2940j &= -33;
                    }
                    m2028i(abstractC0741b0Mo987d);
                    abstractC0741b0Mo987d = null;
                }
            }
        }
        if (abstractC0741b0Mo987d == null) {
            int iM561e2 = recyclerView.f1966e.m561e(i2, 0);
            if (iM561e2 < 0 || iM561e2 >= recyclerView.f1980l.mo985a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + iM561e2 + ").state:" + c0735x.m2035b() + recyclerView.m1596B());
            }
            recyclerView.f1980l.getClass();
            AbstractC0714B abstractC0714B2 = recyclerView.f1980l;
            if (abstractC0714B2.f2847b) {
                long jMo1747b2 = abstractC0714B2.mo1747b(iM561e2);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        abstractC0741b02 = (AbstractC0741b0) arrayList3.get(size5);
                        j3 = 3;
                        if (abstractC0741b02.f2935e == jMo1747b2 && !abstractC0741b02.m2062p()) {
                            if (abstractC0741b02.f2936f == 0) {
                                abstractC0741b02.m2047a(32);
                                if (abstractC0741b02.m2054h() && !c0735x.f2910g) {
                                    abstractC0741b02.f2940j = (abstractC0741b02.f2940j & (-15)) | 2;
                                }
                            } else {
                                arrayList3.remove(size5);
                                View view2 = abstractC0741b02.f2931a;
                                recyclerView.removeDetachedView(view2, false);
                                AbstractC0741b0 abstractC0741b0M1586M3 = RecyclerView.m1586M(view2);
                                abstractC0741b0M1586M3.f2944n = null;
                                abstractC0741b0M1586M3.f2945o = false;
                                abstractC0741b0M1586M3.f2940j &= -33;
                                m2028i(abstractC0741b0M1586M3);
                            }
                        }
                        size5--;
                    } else {
                        j3 = 3;
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            abstractC0741b02 = (AbstractC0741b0) arrayList2.get(size6);
                            if (abstractC0741b02.f2935e != jMo1747b2 || abstractC0741b02.m2050d()) {
                                size6--;
                            } else if (abstractC0741b02.f2936f == 0) {
                                arrayList2.remove(size6);
                            } else {
                                m2026g(size6);
                            }
                        }
                        abstractC0741b02 = null;
                    }
                }
                if (abstractC0741b02 != null) {
                    abstractC0741b02.f2933c = iM561e2;
                    abstractC0741b0Mo987d = abstractC0741b02;
                    z2 = true;
                } else {
                    abstractC0741b0Mo987d = abstractC0741b02;
                }
            } else {
                j3 = 3;
            }
            if (abstractC0741b0Mo987d == null) {
                if (RecyclerView.f1926A0) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i2 + ") fetching from shared pool");
                }
                C0727O c0727o = (C0727O) m2022c().f2884a.get(0);
                if (c0727o != null) {
                    ArrayList arrayList5 = c0727o.f2880a;
                    if (arrayList5.isEmpty()) {
                        abstractC0741b0 = null;
                        if (abstractC0741b0 != null) {
                        }
                        abstractC0741b0Mo987d = abstractC0741b0;
                    } else {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((AbstractC0741b0) arrayList5.get(size7)).m2050d()) {
                                abstractC0741b0 = (AbstractC0741b0) arrayList5.remove(size7);
                                break;
                            }
                        }
                        abstractC0741b0 = null;
                        if (abstractC0741b0 != null) {
                            abstractC0741b0.m2059m();
                            boolean z8 = RecyclerView.f1934z0;
                        }
                        abstractC0741b0Mo987d = abstractC0741b0;
                    }
                }
            }
            if (abstractC0741b0Mo987d == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j4 = this.f2893g.m2019a(0).f2882c;
                    if (!(j4 == 0 || j4 + nanoTime < j2)) {
                        return null;
                    }
                }
                AbstractC0714B abstractC0714B3 = recyclerView.f1980l;
                abstractC0714B3.getClass();
                try {
                    if (AbstractC0139k.m545a()) {
                        Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", 0));
                    }
                    abstractC0741b0Mo987d = abstractC0714B3.mo987d(recyclerView);
                    View view3 = abstractC0741b0Mo987d.f2931a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC0741b0Mo987d.f2936f = 0;
                    Trace.endSection();
                    if (RecyclerView.f1930E0 && (recyclerViewM1585G = RecyclerView.m1585G(view3)) != null) {
                        abstractC0741b0Mo987d.f2932b = new WeakReference(recyclerViewM1585G);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C0727O c0727oM2019a = this.f2893g.m2019a(0);
                    long j5 = c0727oM2019a.f2882c;
                    if (j5 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * j3);
                    }
                    c0727oM2019a.f2882c = nanoTime2;
                    if (RecyclerView.f1926A0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        } else {
            j3 = 3;
        }
        if (z2 && !c0735x.f2910g) {
            int i9 = abstractC0741b0Mo987d.f2940j;
            if ((i9 & 8192) != 0) {
                abstractC0741b0Mo987d.f2940j = i9 & (-8193);
                if (c0735x.f2913j) {
                    AbstractC0719G.m1977b(abstractC0741b0Mo987d);
                    AbstractC0719G abstractC0719G = recyclerView.f1944J;
                    abstractC0741b0Mo987d.m2049c();
                    abstractC0719G.getClass();
                    C0280q c0280q = new C0280q();
                    c0280q.m890a(abstractC0741b0Mo987d);
                    recyclerView.m1617Y(abstractC0741b0Mo987d, c0280q);
                }
            }
        }
        boolean z9 = c0735x.f2910g;
        View view4 = abstractC0741b0Mo987d.f2931a;
        if (!z9 || !abstractC0741b0Mo987d.m2051e()) {
            if (!abstractC0741b0Mo987d.m2051e()) {
                if (RecyclerView.f1934z0 && abstractC0741b0Mo987d.m2054h()) {
                    StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb3.append(abstractC0741b0Mo987d);
                    throw new IllegalStateException(AbstractC0529T.m1415d(recyclerView, sb3));
                }
                int iM561e3 = recyclerView.f1966e.m561e(i2, 0);
                abstractC0741b0Mo987d.f2949s = null;
                abstractC0741b0Mo987d.f2948r = recyclerView;
                int i10 = abstractC0741b0Mo987d.f2936f;
                long nanoTime3 = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j6 = this.f2893g.m2019a(i10).f2883d;
                    if (j6 == 0 || j6 + nanoTime3 < j2) {
                    }
                }
                if (abstractC0741b0Mo987d.m2056j()) {
                    recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0714B abstractC0714B4 = recyclerView.f1980l;
                abstractC0714B4.getClass();
                boolean z10 = abstractC0741b0Mo987d.f2949s == null;
                if (z10) {
                    abstractC0741b0Mo987d.f2933c = iM561e3;
                    z4 = z3;
                    if (abstractC0714B4.f2847b) {
                        abstractC0741b0Mo987d.f2935e = abstractC0714B4.mo1747b(iM561e3);
                    }
                    abstractC0741b0Mo987d.f2940j = (abstractC0741b0Mo987d.f2940j & (-520)) | 1;
                    if (AbstractC0139k.m545a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC0741b0Mo987d.f2936f)));
                    }
                } else {
                    z4 = z3;
                }
                abstractC0741b0Mo987d.f2949s = abstractC0714B4;
                if (RecyclerView.f1934z0) {
                    if (view4.getParent() == null && view4.isAttachedToWindow() != abstractC0741b0Mo987d.m2056j()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC0741b0Mo987d.m2056j() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + abstractC0741b0Mo987d);
                    }
                    if (view4.getParent() == null && view4.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC0741b0Mo987d);
                    }
                }
                abstractC0741b0Mo987d.m2049c();
                abstractC0714B4.mo986c(abstractC0741b0Mo987d, iM561e3);
                if (z10) {
                    ArrayList arrayList6 = abstractC0741b0Mo987d.f2941k;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    abstractC0741b0Mo987d.f2940j &= -1025;
                    ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                    if (layoutParams2 instanceof C0724L) {
                        ((C0724L) layoutParams2).f2878c = true;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view4);
                }
                long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                C0727O c0727oM2019a2 = this.f2893g.m2019a(abstractC0741b0Mo987d.f2936f);
                long j7 = c0727oM2019a2.f2883d;
                if (j7 != 0) {
                    nanoTime4 = (nanoTime4 / 4) + ((j7 / 4) * j3);
                }
                c0727oM2019a2.f2883d = nanoTime4;
                AccessibilityManager accessibilityManager = recyclerView.f2008z;
                if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                    if (view4.getImportantForAccessibility() == 0) {
                        view4.setImportantForAccessibility(1);
                    }
                    C0745d0 c0745d0 = recyclerView.f1981l0;
                    if (c0745d0 != null) {
                        C0743c0 c0743c0 = c0745d0.f2961e;
                        if (c0743c0 != null) {
                            c0743c0.getClass();
                            View.AccessibilityDelegate accessibilityDelegateM772c = AbstractC0240S.m772c(view4);
                            C0250b c0250b = accessibilityDelegateM772c == null ? null : accessibilityDelegateM772c instanceof C0248a ? ((C0248a) accessibilityDelegateM772c).f791a : new C0250b(accessibilityDelegateM772c);
                            if (c0250b != null && c0250b != c0743c0) {
                                c0743c0.f2956e.put(view4, c0250b);
                            }
                        }
                        AbstractC0240S.m785p(view4, c0743c0);
                    }
                }
                if (c0735x.f2910g) {
                    abstractC0741b0Mo987d.f2937g = i2;
                }
                z5 = true;
            } else if (((abstractC0741b0Mo987d.f2940j & 2) != 0) || abstractC0741b0Mo987d.m2052f()) {
            }
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                c0724l = (C0724L) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(c0724l);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                c0724l = (C0724L) layoutParams;
            } else {
                c0724l = (C0724L) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(c0724l);
            }
            c0724l.f2876a = abstractC0741b0Mo987d;
            if (z2 && z5) {
                z7 = true;
            }
            c0724l.f2879d = z7;
            return abstractC0741b0Mo987d;
        }
        abstractC0741b0Mo987d.f2937g = i2;
        z5 = false;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        c0724l.f2876a = abstractC0741b0Mo987d;
        if (z2) {
            z7 = true;
        }
        c0724l.f2879d = z7;
        return abstractC0741b0Mo987d;
    }

    /* JADX INFO: renamed from: l */
    public final void m2031l(AbstractC0741b0 abstractC0741b0) {
        if (abstractC0741b0.f2945o) {
            this.f2888b.remove(abstractC0741b0);
        } else {
            this.f2887a.remove(abstractC0741b0);
        }
        abstractC0741b0.f2944n = null;
        abstractC0741b0.f2945o = false;
        abstractC0741b0.f2940j &= -33;
    }

    /* JADX INFO: renamed from: m */
    public final void m2032m() {
        AbstractC0723K abstractC0723K = this.f2894h.f1982m;
        this.f2892f = this.f2891e + (abstractC0723K != null ? abstractC0723K.f2870j : 0);
        ArrayList arrayList = this.f2889c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2892f; size--) {
            m2026g(size);
        }
    }
}
