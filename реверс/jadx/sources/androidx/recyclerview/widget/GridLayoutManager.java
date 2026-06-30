package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.fragment.app.AbstractC0529T;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p005C0.C0048n;
import p024N.AbstractC0240S;
import p026O.C0306f;
import p026O.C0310j;
import p026O.C0311k;
import p066g0.AbstractC0714B;
import p066g0.AbstractC0723K;
import p066g0.AbstractC0741b0;
import p066g0.C0724L;
import p066g0.C0729Q;
import p066g0.C0735X;
import p066g0.C0763n;
import p066g0.C0766q;
import p066g0.C0768s;
import p066g0.C0769t;
import p066g0.C0770u;
import p066g0.C0771v;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: P */
    public static final Set f1899P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: E */
    public boolean f1900E;

    /* JADX INFO: renamed from: F */
    public int f1901F;

    /* JADX INFO: renamed from: G */
    public int[] f1902G;

    /* JADX INFO: renamed from: H */
    public View[] f1903H;

    /* JADX INFO: renamed from: I */
    public final SparseIntArray f1904I;

    /* JADX INFO: renamed from: J */
    public final SparseIntArray f1905J;

    /* JADX INFO: renamed from: K */
    public final C0048n f1906K;

    /* JADX INFO: renamed from: L */
    public final Rect f1907L;

    /* JADX INFO: renamed from: M */
    public int f1908M;

    /* JADX INFO: renamed from: N */
    public int f1909N;

    /* JADX INFO: renamed from: O */
    public int f1910O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1900E = false;
        this.f1901F = -1;
        this.f1904I = new SparseIntArray();
        this.f1905J = new SparseIntArray();
        this.f1906K = new C0048n(12);
        this.f1907L = new Rect();
        this.f1908M = -1;
        this.f1909N = -1;
        this.f1910O = -1;
        m1537s1(AbstractC0723K.m1990H(context, attributeSet, i2, i3).f2858b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: C0 */
    public final boolean mo1499C0() {
        return this.f1925z == null && !this.f1900E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: E0 */
    public final void mo1500E0(C0735X c0735x, C0770u c0770u, C0763n c0763n) {
        int i2;
        int i3 = this.f1901F;
        for (int i4 = 0; i4 < this.f1901F && (i2 = c0770u.f3113d) >= 0 && i2 < c0735x.m2035b() && i3 > 0; i4++) {
            c0763n.m2098a(c0770u.f3113d, Math.max(0, c0770u.f3116g));
            this.f1906K.getClass();
            i3--;
            c0770u.f3113d += c0770u.f3114e;
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: I */
    public final int mo1501I(C0729Q c0729q, C0735X c0735x) {
        if (this.f1915p == 0) {
            return Math.min(this.f1901F, m1996B());
        }
        if (c0735x.m2035b() < 1) {
            return 0;
        }
        return m1529o1(c0735x.m2035b() - 1, c0729q, c0735x) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: Q0 */
    public final View mo1502Q0(C0729Q c0729q, C0735X c0735x, boolean z2, boolean z3) {
        int i2;
        int iM2014v;
        int iM2014v2 = m2014v();
        int i3 = 1;
        if (z3) {
            iM2014v = m2014v() - 1;
            i2 = -1;
            i3 = -1;
        } else {
            i2 = iM2014v2;
            iM2014v = 0;
        }
        int iM2035b = c0735x.m2035b();
        m1548J0();
        int iMo1298k = this.f1917r.mo1298k();
        int iMo1294g = this.f1917r.mo1294g();
        View view = null;
        View view2 = null;
        while (iM2014v != i2) {
            View viewM2013u = m2013u(iM2014v);
            int iM1989G = AbstractC0723K.m1989G(viewM2013u);
            if (iM1989G >= 0 && iM1989G < iM2035b && m1531p1(iM1989G, c0729q, c0735x) == 0) {
                if (((C0724L) viewM2013u.getLayoutParams()).f2876a.m2054h()) {
                    if (view2 == null) {
                        view2 = viewM2013u;
                    }
                } else {
                    if (this.f1917r.mo1292e(viewM2013u) < iMo1294g && this.f1917r.mo1289b(viewM2013u) >= iMo1298k) {
                        return viewM2013u;
                    }
                    if (view == null) {
                        view = viewM2013u;
                    }
                }
            }
            iM2014v += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0143, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1503T(View view, int i2, C0729Q c0729q, C0735X c0735x) {
        View viewM1598D;
        int iM2014v;
        int iM2014v2;
        int i3;
        View view2;
        int i4;
        int i5;
        C0729Q c0729q2 = c0729q;
        C0735X c0735x2 = c0735x;
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView == null || (viewM1598D = recyclerView.m1598D(view)) == null || this.f2861a.f2952c.contains(viewM1598D)) {
            viewM1598D = null;
        }
        if (viewM1598D != null) {
            C0766q c0766q = (C0766q) viewM1598D.getLayoutParams();
            int i6 = c0766q.f3090e;
            int i7 = c0766q.f3091f + i6;
            if (super.mo1503T(view, i2, c0729q, c0735x) != null) {
                if ((m1547I0(i2) == 1) != this.f1920u) {
                    iM2014v2 = m2014v() - 1;
                    iM2014v = -1;
                    i3 = -1;
                } else {
                    iM2014v = m2014v();
                    iM2014v2 = 0;
                    i3 = 1;
                }
                boolean z2 = this.f1915p == 1 && m1563V0();
                int iM1529o1 = m1529o1(iM2014v2, c0729q2, c0735x2);
                View view3 = null;
                int i8 = iM2014v2;
                int i9 = -1;
                int iMin = 0;
                int i10 = -1;
                View view4 = null;
                int iMin2 = 0;
                while (true) {
                    View view5 = view4;
                    if (i8 == iM2014v) {
                        break;
                    }
                    int iM1529o12 = m1529o1(i8, c0729q2, c0735x2);
                    View viewM2013u = m2013u(i8);
                    if (viewM2013u == viewM1598D) {
                        break;
                    }
                    if (!viewM2013u.hasFocusable() || iM1529o12 == iM1529o1) {
                        C0766q c0766q2 = (C0766q) viewM2013u.getLayoutParams();
                        int i11 = c0766q2.f3090e;
                        view2 = viewM1598D;
                        int i12 = c0766q2.f3091f + i11;
                        if (viewM2013u.hasFocusable() && i11 == i6 && i12 == i7) {
                            return viewM2013u;
                        }
                        if (!(viewM2013u.hasFocusable() && view3 == null) && (viewM2013u.hasFocusable() || view5 != null)) {
                            i4 = iM2014v;
                            int iMin3 = Math.min(i12, i7) - Math.max(i11, i6);
                            if (viewM2013u.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i5 = iMin;
                                }
                                i5 = iMin;
                            } else if (view3 == null) {
                                i5 = iMin;
                                if (!this.f2863c.m283A(viewM2013u) || !this.f2864d.m283A(viewM2013u)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z2 == (i11 > i9)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i5 = iMin;
                            }
                            i8 += i3;
                            c0729q2 = c0729q;
                            c0735x2 = c0735x;
                            viewM1598D = view2;
                            iM2014v = i4;
                        } else {
                            i5 = iMin;
                            i4 = iM2014v;
                        }
                        if (viewM2013u.hasFocusable()) {
                            int i13 = c0766q2.f3090e;
                            iMin = Math.min(i12, i7) - Math.max(i11, i6);
                            view3 = viewM2013u;
                            i10 = i13;
                            view4 = view5;
                        } else {
                            int i14 = c0766q2.f3090e;
                            view4 = viewM2013u;
                            i9 = i14;
                            iMin = i5;
                            iMin2 = Math.min(i12, i7) - Math.max(i11, i6);
                        }
                        i8 += i3;
                        c0729q2 = c0729q;
                        c0735x2 = c0735x;
                        viewM1598D = view2;
                        iM2014v = i4;
                    } else {
                        if (view3 != null) {
                            break;
                        }
                        view2 = viewM1598D;
                        i5 = iMin;
                        i4 = iM2014v;
                    }
                    view4 = view5;
                    iMin = i5;
                    i8 += i3;
                    c0729q2 = c0729q;
                    c0735x2 = c0735x;
                    viewM1598D = view2;
                    iM2014v = i4;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: V */
    public final void mo1504V(C0729Q c0729q, C0735X c0735x, C0311k c0311k) {
        super.mo1504V(c0729q, c0735x, c0311k);
        c0311k.m975i(GridView.class.getName());
        AbstractC0714B abstractC0714B = this.f2862b.f1980l;
        if (abstractC0714B == null || abstractC0714B.mo985a() <= 1) {
            return;
        }
        c0311k.m969b(C0306f.f904o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: W0 */
    public final void mo1505W0(C0729Q c0729q, C0735X c0735x, C0770u c0770u, C0769t c0769t) {
        int i2;
        int i3;
        int i4;
        int iMo1291d;
        int iM1999D;
        int iM2001F;
        int iMo1291d2;
        int iM1994w;
        int iM1994w2;
        ?? r8;
        int i5;
        View viewM2108b;
        int iMo1297j = this.f1917r.mo1297j();
        boolean z2 = iMo1297j != 1073741824;
        int i6 = m2014v() > 0 ? this.f1902G[this.f1901F] : 0;
        if (z2) {
            m1539t1();
        }
        boolean z3 = c0770u.f3114e == 1;
        int iM1531p1 = this.f1901F;
        if (!z3) {
            iM1531p1 = m1531p1(c0770u.f3113d, c0729q, c0735x) + m1532q1(c0770u.f3113d, c0729q, c0735x);
        }
        int i7 = 0;
        while (i7 < this.f1901F && (i5 = c0770u.f3113d) >= 0 && i5 < c0735x.m2035b() && iM1531p1 > 0) {
            int i8 = c0770u.f3113d;
            int iM1532q1 = m1532q1(i8, c0729q, c0735x);
            if (iM1532q1 > this.f1901F) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iM1532q1 + " spans but GridLayoutManager has only " + this.f1901F + " spans.");
            }
            iM1531p1 -= iM1532q1;
            if (iM1531p1 < 0 || (viewM2108b = c0770u.m2108b(c0729q)) == null) {
                break;
            }
            this.f1903H[i7] = viewM2108b;
            i7++;
        }
        if (i7 == 0) {
            c0769t.f3107b = true;
            return;
        }
        if (z3) {
            i3 = i7;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = i7 - 1;
            i3 = -1;
            i4 = -1;
        }
        int i9 = 0;
        while (i2 != i3) {
            View view = this.f1903H[i2];
            C0766q c0766q = (C0766q) view.getLayoutParams();
            int iM1532q12 = m1532q1(AbstractC0723K.m1989G(view), c0729q, c0735x);
            c0766q.f3091f = iM1532q12;
            c0766q.f3090e = i9;
            i9 += iM1532q12;
            i2 += i4;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = this.f1903H[i11];
            if (c0770u.f3120k != null) {
                r8 = 0;
                r8 = 0;
                if (z3) {
                    m2004b(view2, -1, true);
                } else {
                    m2004b(view2, 0, true);
                }
            } else if (z3) {
                r8 = 0;
                m2004b(view2, -1, false);
            } else {
                r8 = 0;
                m2004b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f2862b;
            Rect rect = this.f1907L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.m1606N(view2));
            }
            m1535r1(view2, iMo1297j, r8);
            int iMo1290c = this.f1917r.mo1290c(view2);
            if (iMo1290c > i10) {
                i10 = iMo1290c;
            }
            float fMo1291d = (this.f1917r.mo1291d(view2) * 1.0f) / ((C0766q) view2.getLayoutParams()).f3091f;
            if (fMo1291d > f) {
                f = fMo1291d;
            }
        }
        if (z2) {
            m1517h1(Math.max(Math.round(f * this.f1901F), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = this.f1903H[i12];
                m1535r1(view3, 1073741824, true);
                int iMo1290c2 = this.f1917r.mo1290c(view3);
                if (iMo1290c2 > i10) {
                    i10 = iMo1290c2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = this.f1903H[i13];
            if (this.f1917r.mo1290c(view4) != i10) {
                C0766q c0766q2 = (C0766q) view4.getLayoutParams();
                Rect rect2 = c0766q2.f2877b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0766q2).topMargin + ((ViewGroup.MarginLayoutParams) c0766q2).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0766q2).leftMargin + ((ViewGroup.MarginLayoutParams) c0766q2).rightMargin;
                int iM1527n1 = m1527n1(c0766q2.f3090e, c0766q2.f3091f);
                if (this.f1915p == 1) {
                    iM1994w2 = AbstractC0723K.m1994w(false, iM1527n1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) c0766q2).width);
                    iM1994w = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iM1994w = AbstractC0723K.m1994w(false, iM1527n1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c0766q2).height);
                    iM1994w2 = iMakeMeasureSpec;
                }
                if (m2018z0(view4, iM1994w2, iM1994w, (C0724L) view4.getLayoutParams())) {
                    view4.measure(iM1994w2, iM1994w);
                }
            }
        }
        c0769t.f3106a = i10;
        if (this.f1915p != 1) {
            if (c0770u.f3115f == -1) {
                int i16 = c0770u.f3111b;
                iM1999D = i16 - i10;
                iMo1291d = i16;
            } else {
                int i17 = c0770u.f3111b;
                iMo1291d = i17 + i10;
                iM1999D = i17;
            }
            iM2001F = 0;
            iMo1291d2 = 0;
        } else if (c0770u.f3115f == -1) {
            iMo1291d2 = c0770u.f3111b;
            iM2001F = iMo1291d2 - i10;
            iM1999D = 0;
            iMo1291d = 0;
        } else {
            int i18 = c0770u.f3111b;
            iM2001F = i18;
            iMo1291d = 0;
            iMo1291d2 = i18 + i10;
            iM1999D = 0;
        }
        for (int i19 = 0; i19 < i7; i19++) {
            View view5 = this.f1903H[i19];
            C0766q c0766q3 = (C0766q) view5.getLayoutParams();
            if (this.f1915p != 1) {
                iM2001F = m2001F() + this.f1902G[c0766q3.f3090e];
                iMo1291d2 = this.f1917r.mo1291d(view5) + iM2001F;
            } else if (m1563V0()) {
                int iM1999D2 = m1999D() + this.f1902G[this.f1901F - c0766q3.f3090e];
                iMo1291d = iM1999D2;
                iM1999D = iM1999D2 - this.f1917r.mo1291d(view5);
            } else {
                iM1999D = m1999D() + this.f1902G[c0766q3.f3090e];
                iMo1291d = this.f1917r.mo1291d(view5) + iM1999D;
            }
            AbstractC0723K.m1992N(view5, iM1999D, iM2001F, iMo1291d, iMo1291d2);
            if (c0766q3.f2876a.m2054h() || c0766q3.f2876a.m2057k()) {
                c0769t.f3108c = true;
            }
            c0769t.f3109d = view5.hasFocusable() | c0769t.f3109d;
        }
        Arrays.fill(this.f1903H, (Object) null);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: X */
    public final void mo1506X(C0729Q c0729q, C0735X c0735x, View view, C0311k c0311k) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0766q)) {
            m2003W(view, c0311k);
            return;
        }
        C0766q c0766q = (C0766q) layoutParams;
        int iM1529o1 = m1529o1(c0766q.f2876a.m2048b(), c0729q, c0735x);
        if (this.f1915p == 0) {
            c0311k.m976j(C0310j.m966a(false, c0766q.f3090e, c0766q.f3091f, iM1529o1, 1));
        } else {
            c0311k.m976j(C0310j.m966a(false, iM1529o1, 1, c0766q.f3090e, c0766q.f3091f));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: X0 */
    public final void mo1507X0(C0729Q c0729q, C0735X c0735x, C0768s c0768s, int i2) {
        m1539t1();
        if (c0735x.m2035b() > 0 && !c0735x.f2910g) {
            boolean z2 = i2 == 1;
            int iM1531p1 = m1531p1(c0768s.f3102b, c0729q, c0735x);
            if (z2) {
                while (iM1531p1 > 0) {
                    int i3 = c0768s.f3102b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    c0768s.f3102b = i4;
                    iM1531p1 = m1531p1(i4, c0729q, c0735x);
                }
            } else {
                int iM2035b = c0735x.m2035b() - 1;
                int i5 = c0768s.f3102b;
                while (i5 < iM2035b) {
                    int i6 = i5 + 1;
                    int iM1531p12 = m1531p1(i6, c0729q, c0735x);
                    if (iM1531p12 <= iM1531p1) {
                        break;
                    }
                    i5 = i6;
                    iM1531p1 = iM1531p12;
                }
                c0768s.f3102b = i5;
            }
        }
        m1519i1();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: Y */
    public final void mo1508Y(int i2, int i3) {
        C0048n c0048n = this.f1906K;
        c0048n.m313z();
        ((SparseIntArray) c0048n.f175c).clear();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: Z */
    public final void mo1509Z() {
        C0048n c0048n = this.f1906K;
        c0048n.m313z();
        ((SparseIntArray) c0048n.f175c).clear();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: a0 */
    public final void mo1510a0(int i2, int i3) {
        C0048n c0048n = this.f1906K;
        c0048n.m313z();
        ((SparseIntArray) c0048n.f175c).clear();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: b0 */
    public final void mo1511b0(int i2, int i3) {
        C0048n c0048n = this.f1906K;
        c0048n.m313z();
        ((SparseIntArray) c0048n.f175c).clear();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: c0 */
    public final void mo1512c0(int i2, int i3) {
        C0048n c0048n = this.f1906K;
        c0048n.m313z();
        ((SparseIntArray) c0048n.f175c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: d0 */
    public final void mo1513d0(C0729Q c0729q, C0735X c0735x) {
        boolean z2 = c0735x.f2910g;
        SparseIntArray sparseIntArray = this.f1905J;
        SparseIntArray sparseIntArray2 = this.f1904I;
        if (z2) {
            int iM2014v = m2014v();
            for (int i2 = 0; i2 < iM2014v; i2++) {
                C0766q c0766q = (C0766q) m2013u(i2).getLayoutParams();
                int iM2048b = c0766q.f2876a.m2048b();
                sparseIntArray2.put(iM2048b, c0766q.f3091f);
                sparseIntArray.put(iM2048b, c0766q.f3090e);
            }
        }
        super.mo1513d0(c0729q, c0735x);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: d1 */
    public final void mo1514d1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1514d1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: e0 */
    public final void mo1515e0(C0735X c0735x) {
        View viewMo1582q;
        super.mo1515e0(c0735x);
        this.f1900E = false;
        int i2 = this.f1908M;
        if (i2 == -1 || (viewMo1582q = mo1582q(i2)) == null) {
            return;
        }
        viewMo1582q.sendAccessibilityEvent(67108864);
        this.f1908M = -1;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: f */
    public final boolean mo1516f(C0724L c0724l) {
        return c0724l instanceof C0766q;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m1517h1(int i2) {
        int i3;
        int[] iArr = this.f1902G;
        int i4 = this.f1901F;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f1902G = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01af A[EDGE_INSN: B:214:0x01af->B:126:0x01af BREAK  A[LOOP:2: B:130:0x01bf->B:139:0x01e8, LOOP_LABEL: LOOP:2: B:130:0x01bf->B:139:0x01e8], EDGE_INSN: B:220:0x01af->B:126:0x01af BREAK  A[LOOP:5: B:152:0x0226->B:163:0x0256, LOOP_LABEL: LOOP:5: B:152:0x0226->B:163:0x0256]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0283  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1518i0(int i2, Bundle bundle) {
        View viewM2013u;
        AbstractC0741b0 abstractC0741b0M1605L;
        int iIntValue;
        int i3;
        if (i2 == C0306f.f904o.m940a() && i2 != -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= m2014v()) {
                    viewM2013u = null;
                    break;
                }
                View viewM2013u2 = m2013u(i4);
                Objects.requireNonNull(viewM2013u2);
                if (viewM2013u2.isAccessibilityFocused()) {
                    viewM2013u = m2013u(i4);
                    break;
                }
                i4++;
            }
            if (viewM2013u != null && bundle != null) {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f1899P.contains(Integer.valueOf(i5)) && (abstractC0741b0M1605L = this.f2862b.m1605L(viewM2013u)) != null) {
                    RecyclerView recyclerView = abstractC0741b0M1605L.f2948r;
                    int iM1603J = recyclerView == null ? -1 : recyclerView.m1603J(abstractC0741b0M1605L);
                    int iM1522k1 = m1522k1(iM1603J);
                    int iM1520j1 = m1520j1(iM1603J);
                    if (iM1522k1 >= 0 && iM1520j1 >= 0) {
                        if (!m1524l1(iM1603J).contains(Integer.valueOf(this.f1909N)) || !m1525m1(m1520j1(iM1603J), iM1603J).contains(Integer.valueOf(this.f1910O))) {
                            this.f1909N = iM1522k1;
                            this.f1910O = iM1520j1;
                        }
                        int i6 = this.f1909N;
                        if (i6 == -1) {
                            i6 = iM1522k1;
                        }
                        int i7 = this.f1910O;
                        if (i7 != -1) {
                            iM1520j1 = i7;
                        }
                        if (i5 == 17) {
                            iIntValue = iM1603J - 1;
                            while (iIntValue >= 0) {
                                int iM1522k12 = m1522k1(iIntValue);
                                int iM1520j12 = m1520j1(iIntValue);
                                if (iM1522k12 < 0 || iM1520j12 < 0) {
                                    break;
                                }
                                if (this.f1915p != 1) {
                                    if (m1524l1(iIntValue).contains(Integer.valueOf(i6)) && iM1520j12 < iM1520j1) {
                                        this.f1910O = iM1520j12;
                                        break;
                                    }
                                    iIntValue--;
                                } else {
                                    if ((iM1522k12 == i6 && iM1520j12 < iM1520j1) || iM1522k12 < i6) {
                                        this.f1909N = iM1522k12;
                                        this.f1910O = iM1520j12;
                                        break;
                                    }
                                    iIntValue--;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1) {
                            }
                            if (iIntValue != -1) {
                            }
                        } else if (i5 == 33) {
                            iIntValue = iM1603J - 1;
                            while (iIntValue >= 0) {
                                int iM1522k13 = m1522k1(iIntValue);
                                int iM1520j13 = m1520j1(iIntValue);
                                if (iM1522k13 < 0 || iM1520j13 < 0) {
                                    break;
                                }
                                if (this.f1915p != 1) {
                                    if (iM1522k13 < i6 && iM1520j13 == iM1520j1) {
                                        this.f1909N = ((Integer) Collections.max(m1524l1(iIntValue))).intValue();
                                        break;
                                    }
                                    iIntValue--;
                                } else {
                                    if (iM1522k13 < i6 && m1525m1(m1520j1(iIntValue), iIntValue).contains(Integer.valueOf(iM1520j1))) {
                                        this.f1909N = iM1522k13;
                                        break;
                                    }
                                    iIntValue--;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1) {
                            }
                            if (iIntValue != -1) {
                            }
                        } else if (i5 == 66) {
                            iIntValue = iM1603J + 1;
                            while (iIntValue < m1996B()) {
                                int iM1522k14 = m1522k1(iIntValue);
                                int iM1520j14 = m1520j1(iIntValue);
                                if (iM1522k14 < 0 || iM1520j14 < 0) {
                                    break;
                                }
                                if (this.f1915p != 1) {
                                    if (iM1520j14 > iM1520j1 && m1524l1(iIntValue).contains(Integer.valueOf(i6))) {
                                        this.f1910O = iM1520j14;
                                        break;
                                    }
                                    iIntValue++;
                                } else {
                                    if ((iM1522k14 == i6 && iM1520j14 > iM1520j1) || iM1522k14 > i6) {
                                        this.f1909N = iM1522k14;
                                        this.f1910O = iM1520j14;
                                        break;
                                    }
                                    iIntValue++;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1) {
                                if (i5 != 17) {
                                }
                            }
                            if (iIntValue != -1) {
                            }
                        } else if (i5 == 130) {
                            iIntValue = iM1603J + 1;
                            while (iIntValue < m1996B()) {
                                int iM1522k15 = m1522k1(iIntValue);
                                int iM1520j15 = m1520j1(iIntValue);
                                if (iM1522k15 < 0 || iM1520j15 < 0) {
                                    break;
                                }
                                if (this.f1915p != 1) {
                                    if (iM1522k15 > i6 && iM1520j15 == iM1520j1) {
                                        this.f1909N = m1522k1(iIntValue);
                                        break;
                                    }
                                    iIntValue++;
                                } else {
                                    if (iM1522k15 > i6 && (iM1520j15 == iM1520j1 || m1525m1(m1520j1(iIntValue), iIntValue).contains(Integer.valueOf(iM1520j1)))) {
                                        this.f1909N = iM1522k15;
                                        break;
                                    }
                                    iIntValue++;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1 && (i3 = this.f1915p) == 0) {
                                if (i5 != 17) {
                                    if (iM1522k1 >= 0 && i3 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i8 = 0;
                                        loop2: while (true) {
                                            if (i8 >= m1996B()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int iIntValue2 = num.intValue();
                                                    if (iIntValue2 < iM1522k1) {
                                                        iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                        this.f1909N = iIntValue2;
                                                        this.f1910O = m1520j1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (Integer num2 : m1524l1(i8)) {
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i8));
                                                }
                                                i8++;
                                            }
                                        }
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else if (i5 == 66) {
                                    if (iM1522k1 >= 0 && i3 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i9 = 0;
                                        loop5: while (true) {
                                            if (i9 >= m1996B()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int iIntValue3 = num3.intValue();
                                                    if (iIntValue3 > iM1522k1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f1909N = iIntValue3;
                                                        this.f1910O = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (Integer num4 : m1524l1(i9)) {
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i9));
                                                    }
                                                }
                                                i9++;
                                            }
                                        }
                                        iIntValue = -1;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                mo1583q0(iIntValue);
                                this.f1908M = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i2 != 16908343 || bundle == null) {
                return super.mo1518i0(i2, bundle);
            }
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i10 != -1 && i11 != -1) {
                int iMo985a = this.f2862b.f1980l.mo985a();
                int i12 = 0;
                while (true) {
                    if (i12 >= iMo985a) {
                        i12 = -1;
                        break;
                    }
                    RecyclerView recyclerView2 = this.f2862b;
                    int iM1531p1 = m1531p1(i12, recyclerView2.f1962c, recyclerView2.f1967e0);
                    RecyclerView recyclerView3 = this.f2862b;
                    int iM1529o1 = m1529o1(i12, recyclerView3.f1962c, recyclerView3.f1967e0);
                    if (this.f1915p != 1) {
                        if (iM1531p1 == i10 && iM1529o1 == i11) {
                            break;
                        }
                        i12++;
                    } else {
                        if (iM1531p1 == i11 && iM1529o1 == i10) {
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 > -1) {
                    this.f1923x = i12;
                    this.f1924y = 0;
                    C0771v c0771v = this.f1925z;
                    if (c0771v != null) {
                        c0771v.f3122a = -1;
                    }
                    m2009o0();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m1519i1() {
        View[] viewArr = this.f1903H;
        if (viewArr == null || viewArr.length != this.f1901F) {
            this.f1903H = new View[this.f1901F];
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final int m1520j1(int i2) {
        if (this.f1915p == 0) {
            RecyclerView recyclerView = this.f2862b;
            return m1529o1(i2, recyclerView.f1962c, recyclerView.f1967e0);
        }
        RecyclerView recyclerView2 = this.f2862b;
        return m1531p1(i2, recyclerView2.f1962c, recyclerView2.f1967e0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: k */
    public final int mo1521k(C0735X c0735x) {
        return m1545G0(c0735x);
    }

    /* JADX INFO: renamed from: k1 */
    public final int m1522k1(int i2) {
        if (this.f1915p == 1) {
            RecyclerView recyclerView = this.f2862b;
            return m1529o1(i2, recyclerView.f1962c, recyclerView.f1967e0);
        }
        RecyclerView recyclerView2 = this.f2862b;
        return m1531p1(i2, recyclerView2.f1962c, recyclerView2.f1967e0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: l */
    public final int mo1523l(C0735X c0735x) {
        return m1546H0(c0735x);
    }

    /* JADX INFO: renamed from: l1 */
    public final HashSet m1524l1(int i2) {
        return m1525m1(m1522k1(i2), i2);
    }

    /* JADX INFO: renamed from: m1 */
    public final HashSet m1525m1(int i2, int i3) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f2862b;
        int iM1532q1 = m1532q1(i3, recyclerView.f1962c, recyclerView.f1967e0);
        for (int i4 = i2; i4 < i2 + iM1532q1; i4++) {
            hashSet.add(Integer.valueOf(i4));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: n */
    public final int mo1526n(C0735X c0735x) {
        return m1545G0(c0735x);
    }

    /* JADX INFO: renamed from: n1 */
    public final int m1527n1(int i2, int i3) {
        if (this.f1915p != 1 || !m1563V0()) {
            int[] iArr = this.f1902G;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f1902G;
        int i4 = this.f1901F;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: o */
    public final int mo1528o(C0735X c0735x) {
        return m1546H0(c0735x);
    }

    /* JADX INFO: renamed from: o1 */
    public final int m1529o1(int i2, C0729Q c0729q, C0735X c0735x) {
        boolean z2 = c0735x.f2910g;
        C0048n c0048n = this.f1906K;
        if (!z2) {
            int i3 = this.f1901F;
            c0048n.getClass();
            return C0048n.m282y(i2, i3);
        }
        int iM2021b = c0729q.m2021b(i2);
        if (iM2021b != -1) {
            int i4 = this.f1901F;
            c0048n.getClass();
            return C0048n.m282y(iM2021b, i4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: p0 */
    public final int mo1530p0(int i2, C0729Q c0729q, C0735X c0735x) {
        m1539t1();
        m1519i1();
        return super.mo1530p0(i2, c0729q, c0735x);
    }

    /* JADX INFO: renamed from: p1 */
    public final int m1531p1(int i2, C0729Q c0729q, C0735X c0735x) {
        boolean z2 = c0735x.f2910g;
        C0048n c0048n = this.f1906K;
        if (!z2) {
            int i3 = this.f1901F;
            c0048n.getClass();
            return i2 % i3;
        }
        int i4 = this.f1905J.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int iM2021b = c0729q.m2021b(i2);
        if (iM2021b != -1) {
            int i5 = this.f1901F;
            c0048n.getClass();
            return iM2021b % i5;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    /* JADX INFO: renamed from: q1 */
    public final int m1532q1(int i2, C0729Q c0729q, C0735X c0735x) {
        boolean z2 = c0735x.f2910g;
        C0048n c0048n = this.f1906K;
        if (!z2) {
            c0048n.getClass();
            return 1;
        }
        int i3 = this.f1904I.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (c0729q.m2021b(i2) != -1) {
            c0048n.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: r */
    public final C0724L mo1533r() {
        return this.f1915p == 0 ? new C0766q(-2, -1) : new C0766q(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p066g0.AbstractC0723K
    /* JADX INFO: renamed from: r0 */
    public final int mo1534r0(int i2, C0729Q c0729q, C0735X c0735x) {
        m1539t1();
        m1519i1();
        return super.mo1534r0(i2, c0729q, c0735x);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m1535r1(View view, int i2, boolean z2) {
        int iM1994w;
        int iM1994w2;
        C0766q c0766q = (C0766q) view.getLayoutParams();
        Rect rect = c0766q.f2877b;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0766q).topMargin + ((ViewGroup.MarginLayoutParams) c0766q).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0766q).leftMargin + ((ViewGroup.MarginLayoutParams) c0766q).rightMargin;
        int iM1527n1 = m1527n1(c0766q.f3090e, c0766q.f3091f);
        if (this.f1915p == 1) {
            iM1994w2 = AbstractC0723K.m1994w(false, iM1527n1, i2, i4, ((ViewGroup.MarginLayoutParams) c0766q).width);
            iM1994w = AbstractC0723K.m1994w(true, this.f1917r.mo1299l(), this.f2873m, i3, ((ViewGroup.MarginLayoutParams) c0766q).height);
        } else {
            int iM1994w3 = AbstractC0723K.m1994w(false, iM1527n1, i2, i3, ((ViewGroup.MarginLayoutParams) c0766q).height);
            int iM1994w4 = AbstractC0723K.m1994w(true, this.f1917r.mo1299l(), this.f2872l, i4, ((ViewGroup.MarginLayoutParams) c0766q).width);
            iM1994w = iM1994w3;
            iM1994w2 = iM1994w4;
        }
        C0724L c0724l = (C0724L) view.getLayoutParams();
        if (z2 ? m2018z0(view, iM1994w2, iM1994w, c0724l) : m2017x0(view, iM1994w2, iM1994w, c0724l)) {
            view.measure(iM1994w2, iM1994w);
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: s */
    public final C0724L mo1536s(Context context, AttributeSet attributeSet) {
        C0766q c0766q = new C0766q(context, attributeSet);
        c0766q.f3090e = -1;
        c0766q.f3091f = 0;
        return c0766q;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m1537s1(int i2) {
        if (i2 == this.f1901F) {
            return;
        }
        this.f1900E = true;
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("Span count should be at least 1. Provided ", i2));
        }
        this.f1901F = i2;
        this.f1906K.m313z();
        m2009o0();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: t */
    public final C0724L mo1538t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0766q c0766q = new C0766q((ViewGroup.MarginLayoutParams) layoutParams);
            c0766q.f3090e = -1;
            c0766q.f3091f = 0;
            return c0766q;
        }
        C0766q c0766q2 = new C0766q(layoutParams);
        c0766q2.f3090e = -1;
        c0766q2.f3091f = 0;
        return c0766q2;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m1539t1() {
        int iM1998C;
        int iM2001F;
        if (this.f1915p == 1) {
            iM1998C = this.f2874n - m2000E();
            iM2001F = m1999D();
        } else {
            iM1998C = this.f2875o - m1998C();
            iM2001F = m2001F();
        }
        m1517h1(iM1998C - iM2001F);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: u0 */
    public final void mo1540u0(Rect rect, int i2, int i3) {
        int iM1993g;
        int iM1993g2;
        if (this.f1902G == null) {
            super.mo1540u0(rect, i2, i3);
        }
        int iM2000E = m2000E() + m1999D();
        int iM1998C = m1998C() + m2001F();
        if (this.f1915p == 1) {
            int iHeight = rect.height() + iM1998C;
            RecyclerView recyclerView = this.f2862b;
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            iM1993g2 = AbstractC0723K.m1993g(i3, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f1902G;
            iM1993g = AbstractC0723K.m1993g(i2, iArr[iArr.length - 1] + iM2000E, this.f2862b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2000E;
            RecyclerView recyclerView2 = this.f2862b;
            WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
            iM1993g = AbstractC0723K.m1993g(i2, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1902G;
            iM1993g2 = AbstractC0723K.m1993g(i3, iArr2[iArr2.length - 1] + iM1998C, this.f2862b.getMinimumHeight());
        }
        this.f2862b.setMeasuredDimension(iM1993g, iM1993g2);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: x */
    public final int mo1541x(C0729Q c0729q, C0735X c0735x) {
        if (this.f1915p == 1) {
            return Math.min(this.f1901F, m1996B());
        }
        if (c0735x.m2035b() < 1) {
            return 0;
        }
        return m1529o1(c0735x.m2035b() - 1, c0729q, c0735x) + 1;
    }

    public GridLayoutManager(int i2) {
        super(1);
        this.f1900E = false;
        this.f1901F = -1;
        this.f1904I = new SparseIntArray();
        this.f1905J = new SparseIntArray();
        this.f1906K = new C0048n(12);
        this.f1907L = new Rect();
        this.f1908M = -1;
        this.f1909N = -1;
        this.f1910O = -1;
        m1537s1(i2);
    }
}
