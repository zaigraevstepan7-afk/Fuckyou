package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0493g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p005C0.C0048n;
import p023M0.RunnableC0191D;
import p024N.AbstractC0240S;
import p026O.C0310j;
import p026O.C0311k;
import p036T.AbstractC0383m;
import p066g0.AbstractC0723K;
import p066g0.C0722J;
import p066g0.C0724L;
import p066g0.C0729Q;
import p066g0.C0735X;
import p066g0.C0749f0;
import p066g0.C0751g0;
import p066g0.C0753h0;
import p066g0.C0755i0;
import p066g0.C0757j0;
import p066g0.C0763n;
import p066g0.C0767r;
import p066g0.C0772w;
import p066g0.InterfaceC0734W;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0723K implements InterfaceC0734W {

    /* JADX INFO: renamed from: B */
    public final C0048n f2010B;

    /* JADX INFO: renamed from: C */
    public final int f2011C;

    /* JADX INFO: renamed from: D */
    public boolean f2012D;

    /* JADX INFO: renamed from: E */
    public boolean f2013E;

    /* JADX INFO: renamed from: F */
    public C0755i0 f2014F;

    /* JADX INFO: renamed from: G */
    public final Rect f2015G;

    /* JADX INFO: renamed from: H */
    public final C0749f0 f2016H;

    /* JADX INFO: renamed from: I */
    public final boolean f2017I;

    /* JADX INFO: renamed from: J */
    public int[] f2018J;

    /* JADX INFO: renamed from: K */
    public final RunnableC0191D f2019K;

    /* JADX INFO: renamed from: p */
    public final int f2020p;

    /* JADX INFO: renamed from: q */
    public final C0757j0[] f2021q;

    /* JADX INFO: renamed from: r */
    public final AbstractC0493g f2022r;

    /* JADX INFO: renamed from: s */
    public final AbstractC0493g f2023s;

    /* JADX INFO: renamed from: t */
    public final int f2024t;

    /* JADX INFO: renamed from: u */
    public int f2025u;

    /* JADX INFO: renamed from: v */
    public final C0767r f2026v;

    /* JADX INFO: renamed from: w */
    public boolean f2027w;

    /* JADX INFO: renamed from: y */
    public final BitSet f2029y;

    /* JADX INFO: renamed from: x */
    public boolean f2028x = false;

    /* JADX INFO: renamed from: z */
    public int f2030z = -1;

    /* JADX INFO: renamed from: A */
    public int f2009A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2020p = -1;
        this.f2027w = false;
        C0048n c0048n = new C0048n(13, false);
        this.f2010B = c0048n;
        this.f2011C = 2;
        this.f2015G = new Rect();
        this.f2016H = new C0749f0(this);
        this.f2017I = true;
        this.f2019K = new RunnableC0191D(10, this);
        C0722J c0722jM1990H = AbstractC0723K.m1990H(context, attributeSet, i2, i3);
        int i4 = c0722jM1990H.f2857a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1569c(null);
        if (i4 != this.f2024t) {
            this.f2024t = i4;
            AbstractC0493g abstractC0493g = this.f2022r;
            this.f2022r = this.f2023s;
            this.f2023s = abstractC0493g;
            m2009o0();
        }
        int i5 = c0722jM1990H.f2858b;
        mo1569c(null);
        if (i5 != this.f2020p) {
            c0048n.m295b();
            m2009o0();
            this.f2020p = i5;
            this.f2029y = new BitSet(this.f2020p);
            this.f2021q = new C0757j0[this.f2020p];
            for (int i6 = 0; i6 < this.f2020p; i6++) {
                this.f2021q[i6] = new C0757j0(this, i6);
            }
            m2009o0();
        }
        boolean z2 = c0722jM1990H.f2859c;
        mo1569c(null);
        C0755i0 c0755i0 = this.f2014F;
        if (c0755i0 != null && c0755i0.f3010h != z2) {
            c0755i0.f3010h = z2;
        }
        this.f2027w = z2;
        m2009o0();
        C0767r c0767r = new C0767r();
        c0767r.f3092a = true;
        c0767r.f3097f = 0;
        c0767r.f3098g = 0;
        this.f2026v = c0767r;
        this.f2022r = AbstractC0493g.m1288a(this, this.f2024t);
        this.f2023s = AbstractC0493g.m1288a(this, 1 - this.f2024t);
    }

    /* JADX INFO: renamed from: f1 */
    public static int m1650f1(int i2, int i3, int i4) {
        int mode;
        return (!(i3 == 0 && i4 == 0) && ((mode = View.MeasureSpec.getMode(i2)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: A0 */
    public final void mo1542A0(RecyclerView recyclerView, int i2) {
        C0772w c0772w = new C0772w(recyclerView.getContext());
        c0772w.f3125a = i2;
        m1997B0(c0772w);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: C0 */
    public final boolean mo1499C0() {
        return this.f2014F == null;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m1651D0() {
        int iM1660M0;
        if (m2014v() != 0 && this.f2011C != 0 && this.f2867g) {
            if (this.f2028x) {
                iM1660M0 = m1661N0();
                m1660M0();
            } else {
                iM1660M0 = m1660M0();
                m1661N0();
            }
            C0048n c0048n = this.f2010B;
            if (iM1660M0 == 0 && m1668R0() != null) {
                c0048n.m295b();
                this.f2866f = true;
                m2009o0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public final int m1652E0(C0735X c0735x) {
        if (m2014v() == 0) {
            return 0;
        }
        AbstractC0493g abstractC0493g = this.f2022r;
        boolean z2 = !this.f2017I;
        return AbstractC0383m.m1047n(c0735x, abstractC0493g, m1657J0(z2), m1656I0(z2), this, this.f2017I);
    }

    /* JADX INFO: renamed from: F0 */
    public final int m1653F0(C0735X c0735x) {
        if (m2014v() == 0) {
            return 0;
        }
        AbstractC0493g abstractC0493g = this.f2022r;
        boolean z2 = !this.f2017I;
        return AbstractC0383m.m1049o(c0735x, abstractC0493g, m1657J0(z2), m1656I0(z2), this, this.f2017I, this.f2028x);
    }

    /* JADX INFO: renamed from: G0 */
    public final int m1654G0(C0735X c0735x) {
        if (m2014v() == 0) {
            return 0;
        }
        AbstractC0493g abstractC0493g = this.f2022r;
        boolean z2 = !this.f2017I;
        return AbstractC0383m.m1051p(c0735x, abstractC0493g, m1657J0(z2), m1656I0(z2), this, this.f2017I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX INFO: renamed from: H0 */
    public final int m1655H0(C0729Q c0729q, C0767r c0767r, C0735X c0735x) {
        C0757j0 c0757j0;
        ?? r6;
        int i2;
        int iM2088i;
        int iMo1290c;
        int iMo1298k;
        int iMo1290c2;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        this.f2029y.set(0, this.f2020p, true);
        C0767r c0767r2 = this.f2026v;
        int i7 = c0767r2.f3100i ? c0767r.f3096e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0767r.f3096e == 1 ? c0767r.f3098g + c0767r.f3093b : c0767r.f3097f - c0767r.f3093b;
        int i8 = c0767r.f3096e;
        for (int i9 = 0; i9 < this.f2020p; i9++) {
            if (!((ArrayList) this.f2021q[i9].f3031f).isEmpty()) {
                m1681e1(this.f2021q[i9], i8, i7);
            }
        }
        int iMo1294g = this.f2028x ? this.f2022r.mo1294g() : this.f2022r.mo1298k();
        boolean z2 = false;
        while (true) {
            int i10 = c0767r.f3094c;
            if (!(i10 >= 0 && i10 < c0735x.m2035b()) || (!c0767r2.f3100i && this.f2029y.isEmpty())) {
                break;
            }
            View view = c0729q.m2030k(c0767r.f3094c, Long.MAX_VALUE).f2931a;
            c0767r.f3094c += c0767r.f3095d;
            C0751g0 c0751g0 = (C0751g0) view.getLayoutParams();
            int iM2048b = c0751g0.f2876a.m2048b();
            C0048n c0048n = this.f2010B;
            int[] iArr = (int[]) c0048n.f174b;
            int i11 = (iArr == null || iM2048b >= iArr.length) ? -1 : iArr[iM2048b];
            if (i11 == -1) {
                if (m1672V0(c0767r.f3096e)) {
                    i4 = this.f2020p - i6;
                    i3 = -1;
                    i5 = -1;
                } else {
                    i3 = this.f2020p;
                    i4 = 0;
                    i5 = 1;
                }
                C0757j0 c0757j02 = null;
                if (c0767r.f3096e == i6) {
                    int iMo1298k2 = this.f2022r.mo1298k();
                    int i12 = Integer.MAX_VALUE;
                    while (i4 != i3) {
                        C0757j0 c0757j03 = this.f2021q[i4];
                        int iM2086g = c0757j03.m2086g(iMo1298k2);
                        if (iM2086g < i12) {
                            i12 = iM2086g;
                            c0757j02 = c0757j03;
                        }
                        i4 += i5;
                    }
                } else {
                    int iMo1294g2 = this.f2022r.mo1294g();
                    int i13 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        C0757j0 c0757j04 = this.f2021q[i4];
                        int iM2088i2 = c0757j04.m2088i(iMo1294g2);
                        if (iM2088i2 > i13) {
                            c0757j02 = c0757j04;
                            i13 = iM2088i2;
                        }
                        i4 += i5;
                    }
                }
                c0757j0 = c0757j02;
                c0048n.m311v(iM2048b);
                ((int[]) c0048n.f174b)[iM2048b] = c0757j0.f3030e;
            } else {
                c0757j0 = this.f2021q[i11];
            }
            c0751g0.f2987e = c0757j0;
            if (c0767r.f3096e == 1) {
                r6 = 0;
                m2004b(view, -1, false);
            } else {
                r6 = 0;
                m2004b(view, 0, false);
            }
            if (this.f2024t == 1) {
                i2 = 1;
                m1670T0(view, AbstractC0723K.m1994w(r6, this.f2025u, this.f2872l, r6, ((ViewGroup.MarginLayoutParams) c0751g0).width), AbstractC0723K.m1994w(true, this.f2875o, this.f2873m, m1998C() + m2001F(), ((ViewGroup.MarginLayoutParams) c0751g0).height));
            } else {
                i2 = 1;
                m1670T0(view, AbstractC0723K.m1994w(true, this.f2874n, this.f2872l, m2000E() + m1999D(), ((ViewGroup.MarginLayoutParams) c0751g0).width), AbstractC0723K.m1994w(false, this.f2025u, this.f2873m, 0, ((ViewGroup.MarginLayoutParams) c0751g0).height));
            }
            if (c0767r.f3096e == i2) {
                iMo1290c = c0757j0.m2086g(iMo1294g);
                iM2088i = this.f2022r.mo1290c(view) + iMo1290c;
            } else {
                iM2088i = c0757j0.m2088i(iMo1294g);
                iMo1290c = iM2088i - this.f2022r.mo1290c(view);
            }
            if (c0767r.f3096e == 1) {
                C0757j0 c0757j05 = c0751g0.f2987e;
                c0757j05.getClass();
                C0751g0 c0751g02 = (C0751g0) view.getLayoutParams();
                c0751g02.f2987e = c0757j05;
                ArrayList arrayList = (ArrayList) c0757j05.f3031f;
                arrayList.add(view);
                c0757j05.f3028c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0757j05.f3027b = Integer.MIN_VALUE;
                }
                if (c0751g02.f2876a.m2054h() || c0751g02.f2876a.m2057k()) {
                    c0757j05.f3029d = ((StaggeredGridLayoutManager) c0757j05.f3032g).f2022r.mo1290c(view) + c0757j05.f3029d;
                }
            } else {
                C0757j0 c0757j06 = c0751g0.f2987e;
                c0757j06.getClass();
                C0751g0 c0751g03 = (C0751g0) view.getLayoutParams();
                c0751g03.f2987e = c0757j06;
                ArrayList arrayList2 = (ArrayList) c0757j06.f3031f;
                arrayList2.add(0, view);
                c0757j06.f3027b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0757j06.f3028c = Integer.MIN_VALUE;
                }
                if (c0751g03.f2876a.m2054h() || c0751g03.f2876a.m2057k()) {
                    c0757j06.f3029d = ((StaggeredGridLayoutManager) c0757j06.f3032g).f2022r.mo1290c(view) + c0757j06.f3029d;
                }
            }
            if (m1669S0() && this.f2024t == 1) {
                iMo1290c2 = this.f2023s.mo1294g() - (((this.f2020p - 1) - c0757j0.f3030e) * this.f2025u);
                iMo1298k = iMo1290c2 - this.f2023s.mo1290c(view);
            } else {
                iMo1298k = this.f2023s.mo1298k() + (c0757j0.f3030e * this.f2025u);
                iMo1290c2 = this.f2023s.mo1290c(view) + iMo1298k;
            }
            if (this.f2024t == 1) {
                AbstractC0723K.m1992N(view, iMo1298k, iMo1290c, iMo1290c2, iM2088i);
            } else {
                AbstractC0723K.m1992N(view, iMo1290c, iMo1298k, iM2088i, iMo1290c2);
            }
            m1681e1(c0757j0, c0767r2.f3096e, i7);
            m1674X0(c0729q, c0767r2);
            if (c0767r2.f3099h && view.hasFocusable()) {
                this.f2029y.set(c0757j0.f3030e, false);
            }
            i6 = 1;
            z2 = true;
        }
        if (!z2) {
            m1674X0(c0729q, c0767r2);
        }
        int iMo1298k3 = c0767r2.f3096e == -1 ? this.f2022r.mo1298k() - m1665P0(this.f2022r.mo1298k()) : m1663O0(this.f2022r.mo1294g()) - this.f2022r.mo1294g();
        if (iMo1298k3 > 0) {
            return Math.min(c0767r.f3093b, iMo1298k3);
        }
        return 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: I */
    public final int mo1501I(C0729Q c0729q, C0735X c0735x) {
        if (this.f2024t == 0) {
            return Math.min(this.f2020p, c0735x.m2035b());
        }
        return -1;
    }

    /* JADX INFO: renamed from: I0 */
    public final View m1656I0(boolean z2) {
        int iMo1298k = this.f2022r.mo1298k();
        int iMo1294g = this.f2022r.mo1294g();
        View view = null;
        for (int iM2014v = m2014v() - 1; iM2014v >= 0; iM2014v--) {
            View viewM2013u = m2013u(iM2014v);
            int iMo1292e = this.f2022r.mo1292e(viewM2013u);
            int iMo1289b = this.f2022r.mo1289b(viewM2013u);
            if (iMo1289b > iMo1298k && iMo1292e < iMo1294g) {
                if (iMo1289b <= iMo1294g || !z2) {
                    return viewM2013u;
                }
                if (view == null) {
                    view = viewM2013u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: J0 */
    public final View m1657J0(boolean z2) {
        int iMo1298k = this.f2022r.mo1298k();
        int iMo1294g = this.f2022r.mo1294g();
        int iM2014v = m2014v();
        View view = null;
        for (int i2 = 0; i2 < iM2014v; i2++) {
            View viewM2013u = m2013u(i2);
            int iMo1292e = this.f2022r.mo1292e(viewM2013u);
            if (this.f2022r.mo1289b(viewM2013u) > iMo1298k && iMo1292e < iMo1294g) {
                if (iMo1292e >= iMo1298k || !z2) {
                    return viewM2013u;
                }
                if (view == null) {
                    view = viewM2013u;
                }
            }
        }
        return view;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: K */
    public final boolean mo1549K() {
        return this.f2011C != 0;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m1658K0(C0729Q c0729q, C0735X c0735x, boolean z2) {
        int iMo1294g;
        int iM1663O0 = m1663O0(Integer.MIN_VALUE);
        if (iM1663O0 != Integer.MIN_VALUE && (iMo1294g = this.f2022r.mo1294g() - iM1663O0) > 0) {
            int i2 = iMo1294g - (-m1678b1(-iMo1294g, c0729q, c0735x));
            if (!z2 || i2 <= 0) {
                return;
            }
            this.f2022r.mo1302o(i2);
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: L */
    public final boolean mo1551L() {
        return this.f2027w;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m1659L0(C0729Q c0729q, C0735X c0735x, boolean z2) {
        int iMo1298k;
        int iM1665P0 = m1665P0(Integer.MAX_VALUE);
        if (iM1665P0 != Integer.MAX_VALUE && (iMo1298k = iM1665P0 - this.f2022r.mo1298k()) > 0) {
            int iM1678b1 = iMo1298k - m1678b1(iMo1298k, c0729q, c0735x);
            if (!z2 || iM1678b1 <= 0) {
                return;
            }
            this.f2022r.mo1302o(-iM1678b1);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final int m1660M0() {
        if (m2014v() == 0) {
            return 0;
        }
        return AbstractC0723K.m1989G(m2013u(0));
    }

    /* JADX INFO: renamed from: N0 */
    public final int m1661N0() {
        int iM2014v = m2014v();
        if (iM2014v == 0) {
            return 0;
        }
        return AbstractC0723K.m1989G(m2013u(iM2014v - 1));
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: O */
    public final void mo1662O(int i2) {
        super.mo1662O(i2);
        for (int i3 = 0; i3 < this.f2020p; i3++) {
            C0757j0 c0757j0 = this.f2021q[i3];
            int i4 = c0757j0.f3027b;
            if (i4 != Integer.MIN_VALUE) {
                c0757j0.f3027b = i4 + i2;
            }
            int i5 = c0757j0.f3028c;
            if (i5 != Integer.MIN_VALUE) {
                c0757j0.f3028c = i5 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final int m1663O0(int i2) {
        int iM2086g = this.f2021q[0].m2086g(i2);
        for (int i3 = 1; i3 < this.f2020p; i3++) {
            int iM2086g2 = this.f2021q[i3].m2086g(i2);
            if (iM2086g2 > iM2086g) {
                iM2086g = iM2086g2;
            }
        }
        return iM2086g;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: P */
    public final void mo1664P(int i2) {
        super.mo1664P(i2);
        for (int i3 = 0; i3 < this.f2020p; i3++) {
            C0757j0 c0757j0 = this.f2021q[i3];
            int i4 = c0757j0.f3027b;
            if (i4 != Integer.MIN_VALUE) {
                c0757j0.f3027b = i4 + i2;
            }
            int i5 = c0757j0.f3028c;
            if (i5 != Integer.MIN_VALUE) {
                c0757j0.f3028c = i5 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final int m1665P0(int i2) {
        int iM2088i = this.f2021q[0].m2088i(i2);
        for (int i3 = 1; i3 < this.f2020p; i3++) {
            int iM2088i2 = this.f2021q[i3].m2088i(i2);
            if (iM2088i2 < iM2088i) {
                iM2088i = iM2088i2;
            }
        }
        return iM2088i;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: Q */
    public final void mo1666Q() {
        this.f2010B.m295b();
        for (int i2 = 0; i2 < this.f2020p; i2++) {
            this.f2021q[i2].m2081b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1667Q0(int i2, int i3, int i4) {
        int i5;
        int i6;
        C0048n c0048n;
        int[] iArr;
        ArrayList arrayList;
        C0753h0 c0753h0;
        int size;
        int i7;
        int i8;
        int iM1661N0 = this.f2028x ? m1661N0() : m1660M0();
        if (i4 != 8) {
            i5 = i2 + i3;
        } else {
            if (i2 >= i3) {
                i5 = i2 + 1;
                i6 = i3;
                c0048n = this.f2010B;
                iArr = (int[]) c0048n.f174b;
                if (iArr != null && i6 < iArr.length) {
                    arrayList = (ArrayList) c0048n.f175c;
                    if (arrayList != null) {
                        if (arrayList == null) {
                            c0753h0 = null;
                            if (c0753h0 != null) {
                                ((ArrayList) c0048n.f175c).remove(c0753h0);
                            }
                            size = ((ArrayList) c0048n.f175c).size();
                            i7 = 0;
                            while (true) {
                                if (i7 < size) {
                                    i7 = -1;
                                    break;
                                } else if (((C0753h0) ((ArrayList) c0048n.f175c).get(i7)).f2994a >= i6) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            if (i7 == -1) {
                                C0753h0 c0753h02 = (C0753h0) ((ArrayList) c0048n.f175c).get(i7);
                                ((ArrayList) c0048n.f175c).remove(i7);
                                i8 = c0753h02.f2994a;
                            } else {
                                i8 = -1;
                            }
                            if (i8 != -1) {
                                int[] iArr2 = (int[]) c0048n.f174b;
                                Arrays.fill(iArr2, i6, iArr2.length, -1);
                                int length = ((int[]) c0048n.f174b).length;
                            } else {
                                Arrays.fill((int[]) c0048n.f174b, i6, Math.min(i8 + 1, ((int[]) c0048n.f174b).length), -1);
                            }
                        } else {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c0753h0 = (C0753h0) ((ArrayList) c0048n.f175c).get(size2);
                                if (c0753h0.f2994a == i6) {
                                    break;
                                }
                            }
                            c0753h0 = null;
                            if (c0753h0 != null) {
                            }
                            size = ((ArrayList) c0048n.f175c).size();
                            i7 = 0;
                            while (true) {
                                if (i7 < size) {
                                }
                                i7++;
                            }
                            if (i7 == -1) {
                            }
                            if (i8 != -1) {
                            }
                        }
                    }
                }
                if (i4 != 1) {
                    c0048n.m284B(i2, i3);
                } else if (i4 == 2) {
                    c0048n.m285C(i2, i3);
                } else if (i4 == 8) {
                    c0048n.m285C(i2, 1);
                    c0048n.m284B(i3, 1);
                }
                if (i5 > iM1661N0) {
                    return;
                }
                if (i6 <= (this.f2028x ? m1660M0() : m1661N0())) {
                    m2009o0();
                    return;
                }
                return;
            }
            i5 = i3 + 1;
        }
        i6 = i2;
        c0048n = this.f2010B;
        iArr = (int[]) c0048n.f174b;
        if (iArr != null) {
            arrayList = (ArrayList) c0048n.f175c;
            if (arrayList != null) {
            }
        }
        if (i4 != 1) {
        }
        if (i5 > iM1661N0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m1668R0() {
        int iM2014v = m2014v();
        int i2 = iM2014v - 1;
        BitSet bitSet = new BitSet(this.f2020p);
        bitSet.set(0, this.f2020p, true);
        byte b = (this.f2024t == 1 && m1669S0()) ? (byte) 1 : (byte) -1;
        if (this.f2028x) {
            iM2014v = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < iM2014v ? 1 : -1;
        while (i2 != iM2014v) {
            View viewM2013u = m2013u(i2);
            C0751g0 c0751g0 = (C0751g0) viewM2013u.getLayoutParams();
            if (bitSet.get(c0751g0.f2987e.f3030e)) {
                C0757j0 c0757j0 = c0751g0.f2987e;
                if (this.f2028x) {
                    int i4 = c0757j0.f3028c;
                    if (i4 == Integer.MIN_VALUE) {
                        c0757j0.m2080a();
                        i4 = c0757j0.f3028c;
                    }
                    if (i4 < this.f2022r.mo1294g()) {
                        ArrayList arrayList = (ArrayList) c0757j0.f3031f;
                        ((C0751g0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewM2013u;
                    }
                } else {
                    int i5 = c0757j0.f3027b;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) c0757j0.f3031f).get(0);
                        C0751g0 c0751g02 = (C0751g0) view.getLayoutParams();
                        c0757j0.f3027b = ((StaggeredGridLayoutManager) c0757j0.f3032g).f2022r.mo1292e(view);
                        c0751g02.getClass();
                        i5 = c0757j0.f3027b;
                    }
                    if (i5 > this.f2022r.mo1298k()) {
                        ((C0751g0) ((View) ((ArrayList) c0757j0.f3031f).get(0)).getLayoutParams()).getClass();
                        return viewM2013u;
                    }
                }
                bitSet.clear(c0751g0.f2987e.f3030e);
            }
            i2 += i3;
            if (i2 != iM2014v) {
                View viewM2013u2 = m2013u(i2);
                if (this.f2028x) {
                    int iMo1289b = this.f2022r.mo1289b(viewM2013u);
                    int iMo1289b2 = this.f2022r.mo1289b(viewM2013u2);
                    if (iMo1289b < iMo1289b2) {
                        return viewM2013u;
                    }
                    if (iMo1289b == iMo1289b2) {
                        if ((c0751g0.f2987e.f3030e - ((C0751g0) viewM2013u2.getLayoutParams()).f2987e.f3030e >= 0) == (b >= 0)) {
                            return viewM2013u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo1292e = this.f2022r.mo1292e(viewM2013u);
                    int iMo1292e2 = this.f2022r.mo1292e(viewM2013u2);
                    if (iMo1292e > iMo1292e2) {
                        return viewM2013u;
                    }
                    if (iMo1292e == iMo1292e2) {
                        if ((c0751g0.f2987e.f3030e - ((C0751g0) viewM2013u2.getLayoutParams()).f2987e.f3030e >= 0) == (b >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: S */
    public final void mo1558S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2862b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2019K);
        }
        for (int i2 = 0; i2 < this.f2020p; i2++) {
            this.f2021q[i2].m2081b();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m1669S0() {
        return this.f2862b.getLayoutDirection() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1503T(View view, int i2, C0729Q c0729q, C0735X c0735x) {
        View viewM1598D;
        int i3;
        if (m2014v() != 0) {
            RecyclerView recyclerView = this.f2862b;
            if (recyclerView == null || (viewM1598D = recyclerView.m1598D(view)) == null || this.f2861a.f2952c.contains(viewM1598D)) {
                viewM1598D = null;
            }
            if (viewM1598D != null) {
                m1677a1();
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 17) {
                            if (i2 != 33) {
                                if (i2 == 66 ? this.f2024t == 0 : !(i2 != 130 || this.f2024t != 1)) {
                                    i3 = 1;
                                }
                            } else if (this.f2024t == 1) {
                                i3 = -1;
                            }
                            i3 = Integer.MIN_VALUE;
                        } else if (this.f2024t != 0) {
                            i3 = Integer.MIN_VALUE;
                        }
                    } else if (this.f2024t != 1 && m1669S0()) {
                    }
                } else if (this.f2024t != 1 && m1669S0()) {
                }
                if (i3 != Integer.MIN_VALUE) {
                    C0751g0 c0751g0 = (C0751g0) viewM1598D.getLayoutParams();
                    c0751g0.getClass();
                    C0757j0 c0757j0 = c0751g0.f2987e;
                    int iM1661N0 = i3 == 1 ? m1661N0() : m1660M0();
                    m1680d1(iM1661N0, c0735x);
                    m1679c1(i3);
                    C0767r c0767r = this.f2026v;
                    c0767r.f3094c = c0767r.f3095d + iM1661N0;
                    c0767r.f3093b = (int) (this.f2022r.mo1299l() * 0.33333334f);
                    c0767r.f3099h = true;
                    c0767r.f3092a = false;
                    m1655H0(c0729q, c0767r, c0735x);
                    this.f2012D = this.f2028x;
                    View viewM2087h = c0757j0.m2087h(iM1661N0, i3);
                    if (viewM2087h != null && viewM2087h != viewM1598D) {
                        return viewM2087h;
                    }
                    if (m1672V0(i3)) {
                        for (int i4 = this.f2020p - 1; i4 >= 0; i4--) {
                            View viewM2087h2 = this.f2021q[i4].m2087h(iM1661N0, i3);
                            if (viewM2087h2 != null && viewM2087h2 != viewM1598D) {
                                return viewM2087h2;
                            }
                        }
                    } else {
                        for (int i5 = 0; i5 < this.f2020p; i5++) {
                            View viewM2087h3 = this.f2021q[i5].m2087h(iM1661N0, i3);
                            if (viewM2087h3 != null && viewM2087h3 != viewM1598D) {
                                return viewM2087h3;
                            }
                        }
                    }
                    boolean z2 = (this.f2027w ^ true) == (i3 == -1);
                    View viewMo1582q = mo1582q(z2 ? c0757j0.m2082c() : c0757j0.m2083d());
                    if (viewMo1582q != null && viewMo1582q != viewM1598D) {
                        return viewMo1582q;
                    }
                    if (m1672V0(i3)) {
                        for (int i6 = this.f2020p - 1; i6 >= 0; i6--) {
                            if (i6 != c0757j0.f3030e) {
                                View viewMo1582q2 = mo1582q(z2 ? this.f2021q[i6].m2082c() : this.f2021q[i6].m2083d());
                                if (viewMo1582q2 != null && viewMo1582q2 != viewM1598D) {
                                    return viewMo1582q2;
                                }
                            }
                        }
                    } else {
                        for (int i7 = 0; i7 < this.f2020p; i7++) {
                            View viewMo1582q3 = mo1582q(z2 ? this.f2021q[i7].m2082c() : this.f2021q[i7].m2083d());
                            if (viewMo1582q3 != null && viewMo1582q3 != viewM1598D) {
                                return viewMo1582q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m1670T0(View view, int i2, int i3) {
        RecyclerView recyclerView = this.f2862b;
        Rect rect = this.f2015G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1606N(view));
        }
        C0751g0 c0751g0 = (C0751g0) view.getLayoutParams();
        int iM1650f1 = m1650f1(i2, ((ViewGroup.MarginLayoutParams) c0751g0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0751g0).rightMargin + rect.right);
        int iM1650f12 = m1650f1(i3, ((ViewGroup.MarginLayoutParams) c0751g0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0751g0).bottomMargin + rect.bottom);
        if (m2017x0(view, iM1650f1, iM1650f12, c0751g0)) {
            view.measure(iM1650f1, iM1650f12);
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: U */
    public final void mo1561U(AccessibilityEvent accessibilityEvent) {
        super.mo1561U(accessibilityEvent);
        if (m2014v() > 0) {
            View viewM1657J0 = m1657J0(false);
            View viewM1656I0 = m1656I0(false);
            if (viewM1657J0 == null || viewM1656I0 == null) {
                return;
            }
            int iM1989G = AbstractC0723K.m1989G(viewM1657J0);
            int iM1989G2 = AbstractC0723K.m1989G(viewM1656I0);
            if (iM1989G < iM1989G2) {
                accessibilityEvent.setFromIndex(iM1989G);
                accessibilityEvent.setToIndex(iM1989G2);
            } else {
                accessibilityEvent.setFromIndex(iM1989G2);
                accessibilityEvent.setToIndex(iM1989G);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x041e  */
    /* JADX INFO: renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1671U0(C0729Q c0729q, C0735X c0735x, boolean z2) {
        C0755i0 c0755i0;
        int iM1989G;
        int i2;
        boolean z3;
        C0755i0 c0755i02 = this.f2014F;
        C0749f0 c0749f0 = this.f2016H;
        if (!(c0755i02 == null && this.f2030z == -1) && c0735x.m2035b() == 0) {
            m2005j0(c0729q);
            c0749f0.m2073a();
            return;
        }
        boolean z4 = true;
        boolean z5 = (c0749f0.f2979e && this.f2030z == -1 && this.f2014F == null) ? false : true;
        C0048n c0048n = this.f2010B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c0749f0.f2981g;
        if (z5) {
            c0749f0.m2073a();
            C0755i0 c0755i03 = this.f2014F;
            if (c0755i03 != null) {
                int i3 = c0755i03.f3005c;
                if (i3 > 0) {
                    if (i3 == this.f2020p) {
                        for (int i4 = 0; i4 < this.f2020p; i4++) {
                            this.f2021q[i4].m2081b();
                            C0755i0 c0755i04 = this.f2014F;
                            int iMo1294g = c0755i04.f3006d[i4];
                            if (iMo1294g != Integer.MIN_VALUE) {
                                iMo1294g += c0755i04.f3011i ? this.f2022r.mo1294g() : this.f2022r.mo1298k();
                            }
                            C0757j0 c0757j0 = this.f2021q[i4];
                            c0757j0.f3027b = iMo1294g;
                            c0757j0.f3028c = iMo1294g;
                        }
                    } else {
                        c0755i03.f3006d = null;
                        c0755i03.f3005c = 0;
                        c0755i03.f3007e = 0;
                        c0755i03.f3008f = null;
                        c0755i03.f3009g = null;
                        c0755i03.f3003a = c0755i03.f3004b;
                    }
                }
                C0755i0 c0755i05 = this.f2014F;
                this.f2013E = c0755i05.f3012j;
                boolean z6 = c0755i05.f3010h;
                mo1569c(null);
                C0755i0 c0755i06 = this.f2014F;
                if (c0755i06 != null && c0755i06.f3010h != z6) {
                    c0755i06.f3010h = z6;
                }
                this.f2027w = z6;
                m2009o0();
                m1677a1();
                C0755i0 c0755i07 = this.f2014F;
                int i5 = c0755i07.f3003a;
                if (i5 != -1) {
                    this.f2030z = i5;
                    c0749f0.f2977c = c0755i07.f3011i;
                } else {
                    c0749f0.f2977c = this.f2028x;
                }
                if (c0755i07.f3007e > 1) {
                    c0048n.f174b = c0755i07.f3008f;
                    c0048n.f175c = c0755i07.f3009g;
                }
            } else {
                m1677a1();
                c0749f0.f2977c = this.f2028x;
            }
            if (c0735x.f2910g || (i2 = this.f2030z) == -1) {
                if (this.f2012D) {
                    int iM2035b = c0735x.m2035b();
                    int iM2014v = m2014v();
                    for (int i6 = 0; i6 < iM2014v; i6++) {
                        int iM1989G2 = AbstractC0723K.m1989G(m2013u(i6));
                        if (iM1989G2 >= 0 && iM1989G2 < iM2035b) {
                            iM1989G = iM1989G2;
                            break;
                        }
                    }
                    iM1989G = 0;
                    c0749f0.f2975a = iM1989G;
                    c0749f0.f2976b = Integer.MIN_VALUE;
                    c0749f0.f2979e = true;
                } else {
                    int iM2035b2 = c0735x.m2035b();
                    for (int iM2014v2 = m2014v() - 1; iM2014v2 >= 0; iM2014v2--) {
                        iM1989G = AbstractC0723K.m1989G(m2013u(iM2014v2));
                        if (iM1989G >= 0 && iM1989G < iM2035b2) {
                            break;
                        }
                    }
                    iM1989G = 0;
                    c0749f0.f2975a = iM1989G;
                    c0749f0.f2976b = Integer.MIN_VALUE;
                    c0749f0.f2979e = true;
                }
            } else if (i2 < 0 || i2 >= c0735x.m2035b()) {
                this.f2030z = -1;
                this.f2009A = Integer.MIN_VALUE;
                if (this.f2012D) {
                }
            } else {
                C0755i0 c0755i08 = this.f2014F;
                if (c0755i08 == null || c0755i08.f3003a == -1 || c0755i08.f3005c < 1) {
                    View viewMo1582q = mo1582q(this.f2030z);
                    if (viewMo1582q != null) {
                        c0749f0.f2975a = this.f2028x ? m1661N0() : m1660M0();
                        if (this.f2009A != Integer.MIN_VALUE) {
                            if (c0749f0.f2977c) {
                                c0749f0.f2976b = (this.f2022r.mo1294g() - this.f2009A) - this.f2022r.mo1289b(viewMo1582q);
                            } else {
                                c0749f0.f2976b = (this.f2022r.mo1298k() + this.f2009A) - this.f2022r.mo1292e(viewMo1582q);
                            }
                        } else if (this.f2022r.mo1290c(viewMo1582q) > this.f2022r.mo1299l()) {
                            c0749f0.f2976b = c0749f0.f2977c ? this.f2022r.mo1294g() : this.f2022r.mo1298k();
                        } else {
                            int iMo1292e = this.f2022r.mo1292e(viewMo1582q) - this.f2022r.mo1298k();
                            if (iMo1292e < 0) {
                                c0749f0.f2976b = -iMo1292e;
                            } else {
                                int iMo1294g2 = this.f2022r.mo1294g() - this.f2022r.mo1289b(viewMo1582q);
                                if (iMo1294g2 < 0) {
                                    c0749f0.f2976b = iMo1294g2;
                                } else {
                                    c0749f0.f2976b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i7 = this.f2030z;
                        c0749f0.f2975a = i7;
                        int i8 = this.f2009A;
                        if (i8 == Integer.MIN_VALUE) {
                            if (m2014v() == 0) {
                                z3 = this.f2028x;
                            } else if ((i7 < m1660M0()) != this.f2028x) {
                            }
                            c0749f0.f2977c = z3;
                            c0749f0.f2976b = z3 ? staggeredGridLayoutManager.f2022r.mo1294g() : staggeredGridLayoutManager.f2022r.mo1298k();
                        } else if (c0749f0.f2977c) {
                            c0749f0.f2976b = staggeredGridLayoutManager.f2022r.mo1294g() - i8;
                        } else {
                            c0749f0.f2976b = staggeredGridLayoutManager.f2022r.mo1298k() + i8;
                        }
                        c0749f0.f2978d = true;
                    }
                } else {
                    c0749f0.f2976b = Integer.MIN_VALUE;
                    c0749f0.f2975a = this.f2030z;
                }
                c0749f0.f2979e = true;
            }
        }
        if (this.f2014F == null && this.f2030z == -1 && (c0749f0.f2977c != this.f2012D || m1669S0() != this.f2013E)) {
            c0048n.m295b();
            c0749f0.f2978d = true;
        }
        if (m2014v() > 0 && ((c0755i0 = this.f2014F) == null || c0755i0.f3005c < 1)) {
            if (c0749f0.f2978d) {
                for (int i9 = 0; i9 < this.f2020p; i9++) {
                    this.f2021q[i9].m2081b();
                    int i10 = c0749f0.f2976b;
                    if (i10 != Integer.MIN_VALUE) {
                        C0757j0 c0757j02 = this.f2021q[i9];
                        c0757j02.f3027b = i10;
                        c0757j02.f3028c = i10;
                    }
                }
            } else if (z5 || c0749f0.f2980f == null) {
                for (int i11 = 0; i11 < this.f2020p; i11++) {
                    C0757j0 c0757j03 = this.f2021q[i11];
                    boolean z7 = this.f2028x;
                    int i12 = c0749f0.f2976b;
                    int iM2086g = z7 ? c0757j03.m2086g(Integer.MIN_VALUE) : c0757j03.m2088i(Integer.MIN_VALUE);
                    c0757j03.m2081b();
                    if (iM2086g != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c0757j03.f3032g;
                        if ((!z7 || iM2086g >= staggeredGridLayoutManager2.f2022r.mo1294g()) && (z7 || iM2086g <= staggeredGridLayoutManager2.f2022r.mo1298k())) {
                            if (i12 != Integer.MIN_VALUE) {
                                iM2086g += i12;
                            }
                            c0757j03.f3028c = iM2086g;
                            c0757j03.f3027b = iM2086g;
                        }
                    }
                }
                C0757j0[] c0757j0Arr = this.f2021q;
                int length = c0757j0Arr.length;
                int[] iArr = c0749f0.f2980f;
                if (iArr == null || iArr.length < length) {
                    c0749f0.f2980f = new int[staggeredGridLayoutManager.f2021q.length];
                }
                for (int i13 = 0; i13 < length; i13++) {
                    c0749f0.f2980f[i13] = c0757j0Arr[i13].m2088i(Integer.MIN_VALUE);
                }
            } else {
                for (int i14 = 0; i14 < this.f2020p; i14++) {
                    C0757j0 c0757j04 = this.f2021q[i14];
                    c0757j04.m2081b();
                    int i15 = c0749f0.f2980f[i14];
                    c0757j04.f3027b = i15;
                    c0757j04.f3028c = i15;
                }
            }
        }
        m2010p(c0729q);
        C0767r c0767r = this.f2026v;
        c0767r.f3092a = false;
        int iMo1299l = this.f2023s.mo1299l();
        this.f2025u = iMo1299l / this.f2020p;
        View.MeasureSpec.makeMeasureSpec(iMo1299l, this.f2023s.mo1296i());
        m1680d1(c0749f0.f2975a, c0735x);
        if (c0749f0.f2977c) {
            m1679c1(-1);
            m1655H0(c0729q, c0767r, c0735x);
            m1679c1(1);
            c0767r.f3094c = c0749f0.f2975a + c0767r.f3095d;
            m1655H0(c0729q, c0767r, c0735x);
        } else {
            m1679c1(1);
            m1655H0(c0729q, c0767r, c0735x);
            m1679c1(-1);
            c0767r.f3094c = c0749f0.f2975a + c0767r.f3095d;
            m1655H0(c0729q, c0767r, c0735x);
        }
        if (this.f2023s.mo1296i() != 1073741824) {
            int iM2014v3 = m2014v();
            float fMax = 0.0f;
            for (int i16 = 0; i16 < iM2014v3; i16++) {
                View viewM2013u = m2013u(i16);
                float fMo1290c = this.f2023s.mo1290c(viewM2013u);
                if (fMo1290c >= fMax) {
                    ((C0751g0) viewM2013u.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo1290c);
                }
            }
            int i17 = this.f2025u;
            int iRound = Math.round(fMax * this.f2020p);
            if (this.f2023s.mo1296i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f2023s.mo1299l());
            }
            this.f2025u = iRound / this.f2020p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f2023s.mo1296i());
            if (this.f2025u != i17) {
                for (int i18 = 0; i18 < iM2014v3; i18++) {
                    View viewM2013u2 = m2013u(i18);
                    C0751g0 c0751g0 = (C0751g0) viewM2013u2.getLayoutParams();
                    c0751g0.getClass();
                    if (m1669S0() && this.f2024t == 1) {
                        int i19 = -((this.f2020p - 1) - c0751g0.f2987e.f3030e);
                        viewM2013u2.offsetLeftAndRight((this.f2025u * i19) - (i19 * i17));
                    } else {
                        int i20 = c0751g0.f2987e.f3030e;
                        int i21 = this.f2025u * i20;
                        int i22 = i20 * i17;
                        if (this.f2024t == 1) {
                            viewM2013u2.offsetLeftAndRight(i21 - i22);
                        } else {
                            viewM2013u2.offsetTopAndBottom(i21 - i22);
                        }
                    }
                }
            }
        }
        if (m2014v() > 0) {
            if (this.f2028x) {
                m1658K0(c0729q, c0735x, true);
                m1659L0(c0729q, c0735x, false);
            } else {
                m1659L0(c0729q, c0735x, true);
                m1658K0(c0729q, c0735x, false);
            }
        }
        if (!z2 || c0735x.f2910g || this.f2011C == 0 || m2014v() <= 0 || m1668R0() == null) {
            z4 = false;
        } else {
            RecyclerView recyclerView = this.f2862b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f2019K);
            }
            if (!m1651D0()) {
            }
        }
        if (c0735x.f2910g) {
            c0749f0.m2073a();
        }
        this.f2012D = c0749f0.f2977c;
        this.f2013E = m1669S0();
        if (z4) {
            c0749f0.m2073a();
            m1671U0(c0729q, c0735x, false);
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: V */
    public final void mo1504V(C0729Q c0729q, C0735X c0735x, C0311k c0311k) {
        super.mo1504V(c0729q, c0735x, c0311k);
        c0311k.m975i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m1672V0(int i2) {
        if (this.f2024t == 0) {
            return (i2 == -1) != this.f2028x;
        }
        return ((i2 == -1) == this.f2028x) == m1669S0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m1673W0(int i2, C0735X c0735x) {
        int iM1660M0;
        int i3;
        if (i2 > 0) {
            iM1660M0 = m1661N0();
            i3 = 1;
        } else {
            iM1660M0 = m1660M0();
            i3 = -1;
        }
        C0767r c0767r = this.f2026v;
        c0767r.f3092a = true;
        m1680d1(iM1660M0, c0735x);
        m1679c1(i3);
        c0767r.f3094c = iM1660M0 + c0767r.f3095d;
        c0767r.f3093b = Math.abs(i2);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: X */
    public final void mo1506X(C0729Q c0729q, C0735X c0735x, View view, C0311k c0311k) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0751g0)) {
            m2003W(view, c0311k);
            return;
        }
        C0751g0 c0751g0 = (C0751g0) layoutParams;
        if (this.f2024t == 0) {
            C0757j0 c0757j0 = c0751g0.f2987e;
            c0311k.m976j(C0310j.m966a(false, c0757j0 == null ? -1 : c0757j0.f3030e, 1, -1, -1));
        } else {
            C0757j0 c0757j02 = c0751g0.f2987e;
            c0311k.m976j(C0310j.m966a(false, -1, -1, c0757j02 == null ? -1 : c0757j02.f3030e, 1));
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m1674X0(C0729Q c0729q, C0767r c0767r) {
        if (!c0767r.f3092a || c0767r.f3100i) {
            return;
        }
        if (c0767r.f3093b == 0) {
            if (c0767r.f3096e == -1) {
                m1675Y0(c0729q, c0767r.f3098g);
                return;
            } else {
                m1676Z0(c0729q, c0767r.f3097f);
                return;
            }
        }
        int i2 = 1;
        if (c0767r.f3096e == -1) {
            int i3 = c0767r.f3097f;
            int iM2088i = this.f2021q[0].m2088i(i3);
            while (i2 < this.f2020p) {
                int iM2088i2 = this.f2021q[i2].m2088i(i3);
                if (iM2088i2 > iM2088i) {
                    iM2088i = iM2088i2;
                }
                i2++;
            }
            int i4 = i3 - iM2088i;
            m1675Y0(c0729q, i4 < 0 ? c0767r.f3098g : c0767r.f3098g - Math.min(i4, c0767r.f3093b));
            return;
        }
        int i5 = c0767r.f3098g;
        int iM2086g = this.f2021q[0].m2086g(i5);
        while (i2 < this.f2020p) {
            int iM2086g2 = this.f2021q[i2].m2086g(i5);
            if (iM2086g2 < iM2086g) {
                iM2086g = iM2086g2;
            }
            i2++;
        }
        int i6 = iM2086g - c0767r.f3098g;
        m1676Z0(c0729q, i6 < 0 ? c0767r.f3097f : Math.min(i6, c0767r.f3093b) + c0767r.f3097f);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: Y */
    public final void mo1508Y(int i2, int i3) {
        m1667Q0(i2, i3, 1);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m1675Y0(C0729Q c0729q, int i2) {
        for (int iM2014v = m2014v() - 1; iM2014v >= 0; iM2014v--) {
            View viewM2013u = m2013u(iM2014v);
            if (this.f2022r.mo1292e(viewM2013u) < i2 || this.f2022r.mo1301n(viewM2013u) < i2) {
                return;
            }
            C0751g0 c0751g0 = (C0751g0) viewM2013u.getLayoutParams();
            c0751g0.getClass();
            if (((ArrayList) c0751g0.f2987e.f3031f).size() == 1) {
                return;
            }
            C0757j0 c0757j0 = c0751g0.f2987e;
            ArrayList arrayList = (ArrayList) c0757j0.f3031f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C0751g0 c0751g02 = (C0751g0) view.getLayoutParams();
            c0751g02.f2987e = null;
            if (c0751g02.f2876a.m2054h() || c0751g02.f2876a.m2057k()) {
                c0757j0.f3029d -= ((StaggeredGridLayoutManager) c0757j0.f3032g).f2022r.mo1290c(view);
            }
            if (size == 1) {
                c0757j0.f3027b = Integer.MIN_VALUE;
            }
            c0757j0.f3028c = Integer.MIN_VALUE;
            m2007l0(viewM2013u, c0729q);
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: Z */
    public final void mo1509Z() {
        this.f2010B.m295b();
        m2009o0();
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m1676Z0(C0729Q c0729q, int i2) {
        while (m2014v() > 0) {
            View viewM2013u = m2013u(0);
            if (this.f2022r.mo1289b(viewM2013u) > i2 || this.f2022r.mo1300m(viewM2013u) > i2) {
                return;
            }
            C0751g0 c0751g0 = (C0751g0) viewM2013u.getLayoutParams();
            c0751g0.getClass();
            if (((ArrayList) c0751g0.f2987e.f3031f).size() == 1) {
                return;
            }
            C0757j0 c0757j0 = c0751g0.f2987e;
            ArrayList arrayList = (ArrayList) c0757j0.f3031f;
            View view = (View) arrayList.remove(0);
            C0751g0 c0751g02 = (C0751g0) view.getLayoutParams();
            c0751g02.f2987e = null;
            if (arrayList.size() == 0) {
                c0757j0.f3028c = Integer.MIN_VALUE;
            }
            if (c0751g02.f2876a.m2054h() || c0751g02.f2876a.m2057k()) {
                c0757j0.f3029d -= ((StaggeredGridLayoutManager) c0757j0.f3032g).f2022r.mo1290c(view);
            }
            c0757j0.f3027b = Integer.MIN_VALUE;
            m2007l0(viewM2013u, c0729q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // p066g0.InterfaceC0734W
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF mo1566a(int i2) {
        int i3 = -1;
        if (m2014v() != 0) {
            if ((i2 < m1660M0()) == this.f2028x) {
            }
        } else if (this.f2028x) {
            i3 = 1;
        }
        PointF pointF = new PointF();
        if (i3 == 0) {
            return null;
        }
        if (this.f2024t == 0) {
            pointF.x = i3;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i3;
        return pointF;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: a0 */
    public final void mo1510a0(int i2, int i3) {
        m1667Q0(i2, i3, 8);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m1677a1() {
        if (this.f2024t == 1 || !m1669S0()) {
            this.f2028x = this.f2027w;
        } else {
            this.f2028x = !this.f2027w;
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: b0 */
    public final void mo1511b0(int i2, int i3) {
        m1667Q0(i2, i3, 2);
    }

    /* JADX INFO: renamed from: b1 */
    public final int m1678b1(int i2, C0729Q c0729q, C0735X c0735x) {
        if (m2014v() == 0 || i2 == 0) {
            return 0;
        }
        m1673W0(i2, c0735x);
        C0767r c0767r = this.f2026v;
        int iM1655H0 = m1655H0(c0729q, c0767r, c0735x);
        if (c0767r.f3093b >= iM1655H0) {
            i2 = i2 < 0 ? -iM1655H0 : iM1655H0;
        }
        this.f2022r.mo1302o(-i2);
        this.f2012D = this.f2028x;
        c0767r.f3093b = 0;
        m1674X0(c0729q, c0767r);
        return i2;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: c */
    public final void mo1569c(String str) {
        if (this.f2014F == null) {
            super.mo1569c(str);
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: c0 */
    public final void mo1512c0(int i2, int i3) {
        m1667Q0(i2, i3, 4);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m1679c1(int i2) {
        C0767r c0767r = this.f2026v;
        c0767r.f3096e = i2;
        c0767r.f3095d = this.f2028x != (i2 == -1) ? -1 : 1;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: d */
    public final boolean mo1571d() {
        return this.f2024t == 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: d0 */
    public final void mo1513d0(C0729Q c0729q, C0735X c0735x) {
        m1671U0(c0729q, c0735x, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX INFO: renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1680d1(int i2, C0735X c0735x) {
        int iMo1299l;
        int iMo1299l2;
        RecyclerView recyclerView;
        int i3;
        C0767r c0767r = this.f2026v;
        boolean z2 = false;
        c0767r.f3093b = 0;
        c0767r.f3094c = i2;
        C0772w c0772w = this.f2865e;
        if (!(c0772w != null && c0772w.f3129e) || (i3 = c0735x.f2904a) == -1) {
            iMo1299l = 0;
        } else {
            if (this.f2028x != (i3 < i2)) {
                iMo1299l2 = this.f2022r.mo1299l();
                iMo1299l = 0;
                recyclerView = this.f2862b;
                if (recyclerView == null && recyclerView.f1972h) {
                    c0767r.f3097f = this.f2022r.mo1298k() - iMo1299l2;
                    c0767r.f3098g = this.f2022r.mo1294g() + iMo1299l;
                } else {
                    c0767r.f3098g = this.f2022r.mo1293f() + iMo1299l;
                    c0767r.f3097f = -iMo1299l2;
                }
                c0767r.f3099h = false;
                c0767r.f3092a = true;
                if (this.f2022r.mo1296i() == 0 && this.f2022r.mo1293f() == 0) {
                    z2 = true;
                }
                c0767r.f3100i = z2;
            }
            iMo1299l = this.f2022r.mo1299l();
        }
        iMo1299l2 = 0;
        recyclerView = this.f2862b;
        if (recyclerView == null) {
            c0767r.f3098g = this.f2022r.mo1293f() + iMo1299l;
            c0767r.f3097f = -iMo1299l2;
        }
        c0767r.f3099h = false;
        c0767r.f3092a = true;
        if (this.f2022r.mo1296i() == 0) {
            z2 = true;
        }
        c0767r.f3100i = z2;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: e */
    public final boolean mo1572e() {
        return this.f2024t == 1;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: e0 */
    public final void mo1515e0(C0735X c0735x) {
        this.f2030z = -1;
        this.f2009A = Integer.MIN_VALUE;
        this.f2014F = null;
        this.f2016H.m2073a();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m1681e1(C0757j0 c0757j0, int i2, int i3) {
        int i4 = c0757j0.f3029d;
        int i5 = c0757j0.f3030e;
        if (i2 != -1) {
            int i6 = c0757j0.f3028c;
            if (i6 == Integer.MIN_VALUE) {
                c0757j0.m2080a();
                i6 = c0757j0.f3028c;
            }
            if (i6 - i4 >= i3) {
                this.f2029y.set(i5, false);
                return;
            }
            return;
        }
        int i7 = c0757j0.f3027b;
        if (i7 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c0757j0.f3031f).get(0);
            C0751g0 c0751g0 = (C0751g0) view.getLayoutParams();
            c0757j0.f3027b = ((StaggeredGridLayoutManager) c0757j0.f3032g).f2022r.mo1292e(view);
            c0751g0.getClass();
            i7 = c0757j0.f3027b;
        }
        if (i7 + i4 <= i3) {
            this.f2029y.set(i5, false);
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: f */
    public final boolean mo1516f(C0724L c0724l) {
        return c0724l instanceof C0751g0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: f0 */
    public final void mo1574f0(Parcelable parcelable) {
        if (parcelable instanceof C0755i0) {
            C0755i0 c0755i0 = (C0755i0) parcelable;
            this.f2014F = c0755i0;
            if (this.f2030z != -1) {
                c0755i0.f3006d = null;
                c0755i0.f3005c = 0;
                c0755i0.f3003a = -1;
                c0755i0.f3004b = -1;
                c0755i0.f3006d = null;
                c0755i0.f3005c = 0;
                c0755i0.f3007e = 0;
                c0755i0.f3008f = null;
                c0755i0.f3009g = null;
            }
            m2009o0();
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: g0 */
    public final Parcelable mo1576g0() {
        int iM2088i;
        int iMo1298k;
        int[] iArr;
        C0755i0 c0755i0 = this.f2014F;
        if (c0755i0 != null) {
            C0755i0 c0755i02 = new C0755i0();
            c0755i02.f3005c = c0755i0.f3005c;
            c0755i02.f3003a = c0755i0.f3003a;
            c0755i02.f3004b = c0755i0.f3004b;
            c0755i02.f3006d = c0755i0.f3006d;
            c0755i02.f3007e = c0755i0.f3007e;
            c0755i02.f3008f = c0755i0.f3008f;
            c0755i02.f3010h = c0755i0.f3010h;
            c0755i02.f3011i = c0755i0.f3011i;
            c0755i02.f3012j = c0755i0.f3012j;
            c0755i02.f3009g = c0755i0.f3009g;
            return c0755i02;
        }
        C0755i0 c0755i03 = new C0755i0();
        c0755i03.f3010h = this.f2027w;
        c0755i03.f3011i = this.f2012D;
        c0755i03.f3012j = this.f2013E;
        C0048n c0048n = this.f2010B;
        if (c0048n == null || (iArr = (int[]) c0048n.f174b) == null) {
            c0755i03.f3007e = 0;
        } else {
            c0755i03.f3008f = iArr;
            c0755i03.f3007e = iArr.length;
            c0755i03.f3009g = (ArrayList) c0048n.f175c;
        }
        if (m2014v() <= 0) {
            c0755i03.f3003a = -1;
            c0755i03.f3004b = -1;
            c0755i03.f3005c = 0;
            return c0755i03;
        }
        c0755i03.f3003a = this.f2012D ? m1661N0() : m1660M0();
        View viewM1656I0 = this.f2028x ? m1656I0(true) : m1657J0(true);
        c0755i03.f3004b = viewM1656I0 != null ? AbstractC0723K.m1989G(viewM1656I0) : -1;
        int i2 = this.f2020p;
        c0755i03.f3005c = i2;
        c0755i03.f3006d = new int[i2];
        for (int i3 = 0; i3 < this.f2020p; i3++) {
            if (this.f2012D) {
                iM2088i = this.f2021q[i3].m2086g(Integer.MIN_VALUE);
                if (iM2088i != Integer.MIN_VALUE) {
                    iMo1298k = this.f2022r.mo1294g();
                    iM2088i -= iMo1298k;
                }
            } else {
                iM2088i = this.f2021q[i3].m2088i(Integer.MIN_VALUE);
                if (iM2088i != Integer.MIN_VALUE) {
                    iMo1298k = this.f2022r.mo1298k();
                    iM2088i -= iMo1298k;
                }
            }
            c0755i03.f3006d[i3] = iM2088i;
        }
        return c0755i03;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: h */
    public final void mo1578h(int i2, int i3, C0735X c0735x, C0763n c0763n) {
        C0767r c0767r;
        int iM2086g;
        int iM2088i;
        if (this.f2024t != 0) {
            i2 = i3;
        }
        if (m2014v() == 0 || i2 == 0) {
            return;
        }
        m1673W0(i2, c0735x);
        int[] iArr = this.f2018J;
        if (iArr == null || iArr.length < this.f2020p) {
            this.f2018J = new int[this.f2020p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f2020p;
            c0767r = this.f2026v;
            if (i4 >= i6) {
                break;
            }
            if (c0767r.f3095d == -1) {
                iM2086g = c0767r.f3097f;
                iM2088i = this.f2021q[i4].m2088i(iM2086g);
            } else {
                iM2086g = this.f2021q[i4].m2086g(c0767r.f3098g);
                iM2088i = c0767r.f3098g;
            }
            int i7 = iM2086g - iM2088i;
            if (i7 >= 0) {
                this.f2018J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f2018J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0767r.f3094c;
            if (i9 < 0 || i9 >= c0735x.m2035b()) {
                return;
            }
            c0763n.m2098a(c0767r.f3094c, this.f2018J[i8]);
            c0767r.f3094c += c0767r.f3095d;
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: h0 */
    public final void mo1682h0(int i2) {
        if (i2 == 0) {
            m1651D0();
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: j */
    public final int mo1580j(C0735X c0735x) {
        return m1652E0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: k */
    public final int mo1521k(C0735X c0735x) {
        return m1653F0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: l */
    public final int mo1523l(C0735X c0735x) {
        return m1654G0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: m */
    public final int mo1581m(C0735X c0735x) {
        return m1652E0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: n */
    public final int mo1526n(C0735X c0735x) {
        return m1653F0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: o */
    public final int mo1528o(C0735X c0735x) {
        return m1654G0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: p0 */
    public final int mo1530p0(int i2, C0729Q c0729q, C0735X c0735x) {
        return m1678b1(i2, c0729q, c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: q0 */
    public final void mo1583q0(int i2) {
        C0755i0 c0755i0 = this.f2014F;
        if (c0755i0 != null && c0755i0.f3003a != i2) {
            c0755i0.f3006d = null;
            c0755i0.f3005c = 0;
            c0755i0.f3003a = -1;
            c0755i0.f3004b = -1;
        }
        this.f2030z = i2;
        this.f2009A = Integer.MIN_VALUE;
        m2009o0();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: r */
    public final C0724L mo1533r() {
        return this.f2024t == 0 ? new C0751g0(-2, -1) : new C0751g0(-1, -2);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: r0 */
    public final int mo1534r0(int i2, C0729Q c0729q, C0735X c0735x) {
        return m1678b1(i2, c0729q, c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: s */
    public final C0724L mo1536s(Context context, AttributeSet attributeSet) {
        return new C0751g0(context, attributeSet);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: t */
    public final C0724L mo1538t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0751g0((ViewGroup.MarginLayoutParams) layoutParams) : new C0751g0(layoutParams);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: u0 */
    public final void mo1540u0(Rect rect, int i2, int i3) {
        int iM1993g;
        int iM1993g2;
        int i4 = this.f2020p;
        int iM2000E = m2000E() + m1999D();
        int iM1998C = m1998C() + m2001F();
        if (this.f2024t == 1) {
            int iHeight = rect.height() + iM1998C;
            RecyclerView recyclerView = this.f2862b;
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            iM1993g2 = AbstractC0723K.m1993g(i3, iHeight, recyclerView.getMinimumHeight());
            iM1993g = AbstractC0723K.m1993g(i2, (this.f2025u * i4) + iM2000E, this.f2862b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2000E;
            RecyclerView recyclerView2 = this.f2862b;
            WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
            iM1993g = AbstractC0723K.m1993g(i2, iWidth, recyclerView2.getMinimumWidth());
            iM1993g2 = AbstractC0723K.m1993g(i3, (this.f2025u * i4) + iM1998C, this.f2862b.getMinimumHeight());
        }
        this.f2862b.setMeasuredDimension(iM1993g, iM1993g2);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: x */
    public final int mo1541x(C0729Q c0729q, C0735X c0735x) {
        if (this.f2024t == 1) {
            return Math.min(this.f2020p, c0735x.m2035b());
        }
        return -1;
    }
}
