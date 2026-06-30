package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0493g;
import androidx.fragment.app.AbstractC0529T;
import java.util.List;
import p026O.C0306f;
import p026O.C0311k;
import p036T.AbstractC0383m;
import p066g0.AbstractC0714B;
import p066g0.AbstractC0723K;
import p066g0.AbstractC0741b0;
import p066g0.C0722J;
import p066g0.C0724L;
import p066g0.C0729Q;
import p066g0.C0735X;
import p066g0.C0763n;
import p066g0.C0768s;
import p066g0.C0769t;
import p066g0.C0770u;
import p066g0.C0771v;
import p066g0.C0772w;
import p066g0.InterfaceC0734W;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0723K implements InterfaceC0734W {

    /* JADX INFO: renamed from: A */
    public final C0768s f1911A;

    /* JADX INFO: renamed from: B */
    public final C0769t f1912B;

    /* JADX INFO: renamed from: C */
    public final int f1913C;

    /* JADX INFO: renamed from: D */
    public final int[] f1914D;

    /* JADX INFO: renamed from: p */
    public int f1915p;

    /* JADX INFO: renamed from: q */
    public C0770u f1916q;

    /* JADX INFO: renamed from: r */
    public AbstractC0493g f1917r;

    /* JADX INFO: renamed from: s */
    public boolean f1918s;

    /* JADX INFO: renamed from: t */
    public final boolean f1919t;

    /* JADX INFO: renamed from: u */
    public boolean f1920u;

    /* JADX INFO: renamed from: v */
    public boolean f1921v;

    /* JADX INFO: renamed from: w */
    public final boolean f1922w;

    /* JADX INFO: renamed from: x */
    public int f1923x;

    /* JADX INFO: renamed from: y */
    public int f1924y;

    /* JADX INFO: renamed from: z */
    public C0771v f1925z;

    public LinearLayoutManager(int i2) {
        this.f1915p = 1;
        this.f1919t = false;
        this.f1920u = false;
        this.f1921v = false;
        this.f1922w = true;
        this.f1923x = -1;
        this.f1924y = Integer.MIN_VALUE;
        this.f1925z = null;
        this.f1911A = new C0768s();
        this.f1912B = new C0769t();
        this.f1913C = 2;
        this.f1914D = new int[2];
        m1570c1(i2);
        mo1569c(null);
        if (this.f1919t) {
            this.f1919t = false;
            m2009o0();
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: A0 */
    public void mo1542A0(RecyclerView recyclerView, int i2) {
        C0772w c0772w = new C0772w(recyclerView.getContext());
        c0772w.f3125a = i2;
        m1997B0(c0772w);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: C0 */
    public boolean mo1499C0() {
        return this.f1925z == null && this.f1918s == this.f1921v;
    }

    /* JADX INFO: renamed from: D0 */
    public void mo1543D0(C0735X c0735x, int[] iArr) {
        int i2;
        int iMo1299l = c0735x.f2904a != -1 ? this.f1917r.mo1299l() : 0;
        if (this.f1916q.f3115f == -1) {
            i2 = 0;
        } else {
            i2 = iMo1299l;
            iMo1299l = 0;
        }
        iArr[0] = iMo1299l;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: E0 */
    public void mo1500E0(C0735X c0735x, C0770u c0770u, C0763n c0763n) {
        int i2 = c0770u.f3113d;
        if (i2 < 0 || i2 >= c0735x.m2035b()) {
            return;
        }
        c0763n.m2098a(i2, Math.max(0, c0770u.f3116g));
    }

    /* JADX INFO: renamed from: F0 */
    public final int m1544F0(C0735X c0735x) {
        if (m2014v() == 0) {
            return 0;
        }
        m1548J0();
        AbstractC0493g abstractC0493g = this.f1917r;
        boolean z2 = !this.f1922w;
        return AbstractC0383m.m1047n(c0735x, abstractC0493g, m1553M0(z2), m1552L0(z2), this, this.f1922w);
    }

    /* JADX INFO: renamed from: G0 */
    public final int m1545G0(C0735X c0735x) {
        if (m2014v() == 0) {
            return 0;
        }
        m1548J0();
        AbstractC0493g abstractC0493g = this.f1917r;
        boolean z2 = !this.f1922w;
        return AbstractC0383m.m1049o(c0735x, abstractC0493g, m1553M0(z2), m1552L0(z2), this, this.f1922w, this.f1920u);
    }

    /* JADX INFO: renamed from: H0 */
    public final int m1546H0(C0735X c0735x) {
        if (m2014v() == 0) {
            return 0;
        }
        m1548J0();
        AbstractC0493g abstractC0493g = this.f1917r;
        boolean z2 = !this.f1922w;
        return AbstractC0383m.m1051p(c0735x, abstractC0493g, m1553M0(z2), m1552L0(z2), this, this.f1922w);
    }

    /* JADX INFO: renamed from: I0 */
    public final int m1547I0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f1915p == 1) ? 1 : Integer.MIN_VALUE : this.f1915p == 0 ? 1 : Integer.MIN_VALUE : this.f1915p == 1 ? -1 : Integer.MIN_VALUE : this.f1915p == 0 ? -1 : Integer.MIN_VALUE : (this.f1915p != 1 && m1563V0()) ? -1 : 1 : (this.f1915p != 1 && m1563V0()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m1548J0() {
        if (this.f1916q == null) {
            C0770u c0770u = new C0770u();
            c0770u.f3110a = true;
            c0770u.f3117h = 0;
            c0770u.f3118i = 0;
            c0770u.f3120k = null;
            this.f1916q = c0770u;
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: K */
    public final boolean mo1549K() {
        return true;
    }

    /* JADX INFO: renamed from: K0 */
    public final int m1550K0(C0729Q c0729q, C0770u c0770u, C0735X c0735x, boolean z2) {
        int i2;
        int i3 = c0770u.f3112c;
        int i4 = c0770u.f3116g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                c0770u.f3116g = i4 + i3;
            }
            m1564Y0(c0729q, c0770u);
        }
        int i5 = c0770u.f3112c + c0770u.f3117h;
        while (true) {
            if ((!c0770u.f3121l && i5 <= 0) || (i2 = c0770u.f3113d) < 0 || i2 >= c0735x.m2035b()) {
                break;
            }
            C0769t c0769t = this.f1912B;
            c0769t.f3106a = 0;
            c0769t.f3107b = false;
            c0769t.f3108c = false;
            c0769t.f3109d = false;
            mo1505W0(c0729q, c0735x, c0770u, c0769t);
            if (!c0769t.f3107b) {
                int i6 = c0770u.f3111b;
                int i7 = c0769t.f3106a;
                c0770u.f3111b = (c0770u.f3115f * i7) + i6;
                if (!c0769t.f3108c || c0770u.f3120k != null || !c0735x.f2910g) {
                    c0770u.f3112c -= i7;
                    i5 -= i7;
                }
                int i8 = c0770u.f3116g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + i7;
                    c0770u.f3116g = i9;
                    int i10 = c0770u.f3112c;
                    if (i10 < 0) {
                        c0770u.f3116g = i9 + i10;
                    }
                    m1564Y0(c0729q, c0770u);
                }
                if (z2 && c0769t.f3109d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - c0770u.f3112c;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: L */
    public final boolean mo1551L() {
        return this.f1919t;
    }

    /* JADX INFO: renamed from: L0 */
    public final View m1552L0(boolean z2) {
        return this.f1920u ? m1556P0(0, m2014v(), z2) : m1556P0(m2014v() - 1, -1, z2);
    }

    /* JADX INFO: renamed from: M0 */
    public final View m1553M0(boolean z2) {
        return this.f1920u ? m1556P0(m2014v() - 1, -1, z2) : m1556P0(0, m2014v(), z2);
    }

    /* JADX INFO: renamed from: N0 */
    public final int m1554N0() {
        View viewM1556P0 = m1556P0(m2014v() - 1, -1, false);
        if (viewM1556P0 == null) {
            return -1;
        }
        return AbstractC0723K.m1989G(viewM1556P0);
    }

    /* JADX INFO: renamed from: O0 */
    public final View m1555O0(int i2, int i3) {
        int i4;
        int i5;
        m1548J0();
        if (i3 <= i2 && i3 >= i2) {
            return m2013u(i2);
        }
        if (this.f1917r.mo1292e(m2013u(i2)) < this.f1917r.mo1298k()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.f1915p == 0 ? this.f2863c.m312w(i2, i3, i4, i5) : this.f2864d.m312w(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: P0 */
    public final View m1556P0(int i2, int i3, boolean z2) {
        m1548J0();
        int i4 = z2 ? 24579 : 320;
        return this.f1915p == 0 ? this.f2863c.m312w(i2, i3, i4, 320) : this.f2864d.m312w(i2, i3, i4, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX INFO: renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo1502Q0(C0729Q c0729q, C0735X c0735x, boolean z2, boolean z3) {
        int i2;
        int iM2014v;
        int i3;
        m1548J0();
        int iM2014v2 = m2014v();
        if (z3) {
            iM2014v = m2014v() - 1;
            i2 = -1;
            i3 = -1;
        } else {
            i2 = iM2014v2;
            iM2014v = 0;
            i3 = 1;
        }
        int iM2035b = c0735x.m2035b();
        int iMo1298k = this.f1917r.mo1298k();
        int iMo1294g = this.f1917r.mo1294g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM2014v != i2) {
            View viewM2013u = m2013u(iM2014v);
            int iM1989G = AbstractC0723K.m1989G(viewM2013u);
            int iMo1292e = this.f1917r.mo1292e(viewM2013u);
            int iMo1289b = this.f1917r.mo1289b(viewM2013u);
            if (iM1989G >= 0 && iM1989G < iM2035b) {
                if (!((C0724L) viewM2013u.getLayoutParams()).f2876a.m2054h()) {
                    boolean z4 = iMo1289b <= iMo1298k && iMo1292e < iMo1298k;
                    boolean z5 = iMo1292e >= iMo1294g && iMo1289b > iMo1294g;
                    if (!z4 && !z5) {
                        return viewM2013u;
                    }
                    if (z2) {
                        if (z5) {
                            view2 = viewM2013u;
                        } else if (view == null) {
                            view = viewM2013u;
                        }
                    } else if (!z4) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewM2013u;
                }
            }
            iM2014v += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: R0 */
    public final int m1557R0(int i2, C0729Q c0729q, C0735X c0735x, boolean z2) {
        int iMo1294g;
        int iMo1294g2 = this.f1917r.mo1294g() - i2;
        if (iMo1294g2 <= 0) {
            return 0;
        }
        int i3 = -m1568b1(-iMo1294g2, c0729q, c0735x);
        int i4 = i2 + i3;
        if (!z2 || (iMo1294g = this.f1917r.mo1294g() - i4) <= 0) {
            return i3;
        }
        this.f1917r.mo1302o(iMo1294g);
        return iMo1294g + i3;
    }

    /* JADX INFO: renamed from: S0 */
    public final int m1559S0(int i2, C0729Q c0729q, C0735X c0735x, boolean z2) {
        int iMo1298k;
        int iMo1298k2 = i2 - this.f1917r.mo1298k();
        if (iMo1298k2 <= 0) {
            return 0;
        }
        int i3 = -m1568b1(iMo1298k2, c0729q, c0735x);
        int i4 = i2 + i3;
        if (!z2 || (iMo1298k = i4 - this.f1917r.mo1298k()) <= 0) {
            return i3;
        }
        this.f1917r.mo1302o(-iMo1298k);
        return i3 - iMo1298k;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: T */
    public View mo1503T(View view, int i2, C0729Q c0729q, C0735X c0735x) {
        int iM1547I0;
        m1567a1();
        if (m2014v() != 0 && (iM1547I0 = m1547I0(i2)) != Integer.MIN_VALUE) {
            m1548J0();
            m1573e1(iM1547I0, (int) (this.f1917r.mo1299l() * 0.33333334f), false, c0735x);
            C0770u c0770u = this.f1916q;
            c0770u.f3116g = Integer.MIN_VALUE;
            c0770u.f3110a = false;
            m1550K0(c0729q, c0770u, c0735x, true);
            View viewM1555O0 = iM1547I0 == -1 ? this.f1920u ? m1555O0(m2014v() - 1, -1) : m1555O0(0, m2014v()) : this.f1920u ? m1555O0(0, m2014v()) : m1555O0(m2014v() - 1, -1);
            View viewM1562U0 = iM1547I0 == -1 ? m1562U0() : m1560T0();
            if (!viewM1562U0.hasFocusable()) {
                return viewM1555O0;
            }
            if (viewM1555O0 != null) {
                return viewM1562U0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public final View m1560T0() {
        return m2013u(this.f1920u ? 0 : m2014v() - 1);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: U */
    public final void mo1561U(AccessibilityEvent accessibilityEvent) {
        super.mo1561U(accessibilityEvent);
        if (m2014v() > 0) {
            View viewM1556P0 = m1556P0(0, m2014v(), false);
            accessibilityEvent.setFromIndex(viewM1556P0 == null ? -1 : AbstractC0723K.m1989G(viewM1556P0));
            accessibilityEvent.setToIndex(m1554N0());
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final View m1562U0() {
        return m2013u(this.f1920u ? m2014v() - 1 : 0);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: V */
    public void mo1504V(C0729Q c0729q, C0735X c0735x, C0311k c0311k) {
        super.mo1504V(c0729q, c0735x, c0311k);
        AbstractC0714B abstractC0714B = this.f2862b.f1980l;
        if (abstractC0714B == null || abstractC0714B.mo985a() <= 0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        c0311k.m969b(C0306f.f900k);
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m1563V0() {
        return this.f2862b.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: W0 */
    public void mo1505W0(C0729Q c0729q, C0735X c0735x, C0770u c0770u, C0769t c0769t) {
        int iM1999D;
        int i2;
        int i3;
        int iMo1291d;
        View viewM2108b = c0770u.m2108b(c0729q);
        if (viewM2108b == null) {
            c0769t.f3107b = true;
            return;
        }
        C0724L c0724l = (C0724L) viewM2108b.getLayoutParams();
        if (c0770u.f3120k == null) {
            if (this.f1920u == (c0770u.f3115f == -1)) {
                m2004b(viewM2108b, -1, false);
            } else {
                m2004b(viewM2108b, 0, false);
            }
        } else {
            if (this.f1920u == (c0770u.f3115f == -1)) {
                m2004b(viewM2108b, -1, true);
            } else {
                m2004b(viewM2108b, 0, true);
            }
        }
        C0724L c0724l2 = (C0724L) viewM2108b.getLayoutParams();
        Rect rectM1606N = this.f2862b.m1606N(viewM2108b);
        int i4 = rectM1606N.left + rectM1606N.right;
        int i5 = rectM1606N.top + rectM1606N.bottom;
        int iM1994w = AbstractC0723K.m1994w(mo1571d(), this.f2874n, this.f2872l, m2000E() + m1999D() + ((ViewGroup.MarginLayoutParams) c0724l2).leftMargin + ((ViewGroup.MarginLayoutParams) c0724l2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c0724l2).width);
        int iM1994w2 = AbstractC0723K.m1994w(mo1572e(), this.f2875o, this.f2873m, m1998C() + m2001F() + ((ViewGroup.MarginLayoutParams) c0724l2).topMargin + ((ViewGroup.MarginLayoutParams) c0724l2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c0724l2).height);
        if (m2017x0(viewM2108b, iM1994w, iM1994w2, c0724l2)) {
            viewM2108b.measure(iM1994w, iM1994w2);
        }
        c0769t.f3106a = this.f1917r.mo1290c(viewM2108b);
        if (this.f1915p == 1) {
            if (m1563V0()) {
                iMo1291d = this.f2874n - m2000E();
                iM1999D = iMo1291d - this.f1917r.mo1291d(viewM2108b);
            } else {
                iM1999D = m1999D();
                iMo1291d = this.f1917r.mo1291d(viewM2108b) + iM1999D;
            }
            if (c0770u.f3115f == -1) {
                i2 = c0770u.f3111b;
                i3 = i2 - c0769t.f3106a;
            } else {
                i3 = c0770u.f3111b;
                i2 = c0769t.f3106a + i3;
            }
        } else {
            int iM2001F = m2001F();
            int iMo1291d2 = this.f1917r.mo1291d(viewM2108b) + iM2001F;
            if (c0770u.f3115f == -1) {
                int i6 = c0770u.f3111b;
                int i7 = i6 - c0769t.f3106a;
                iMo1291d = i6;
                i2 = iMo1291d2;
                iM1999D = i7;
                i3 = iM2001F;
            } else {
                int i8 = c0770u.f3111b;
                int i9 = c0769t.f3106a + i8;
                iM1999D = i8;
                i2 = iMo1291d2;
                i3 = iM2001F;
                iMo1291d = i9;
            }
        }
        AbstractC0723K.m1992N(viewM2108b, iM1999D, i3, iMo1291d, i2);
        if (c0724l.f2876a.m2054h() || c0724l.f2876a.m2057k()) {
            c0769t.f3108c = true;
        }
        c0769t.f3109d = viewM2108b.hasFocusable();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m1564Y0(C0729Q c0729q, C0770u c0770u) {
        if (!c0770u.f3110a || c0770u.f3121l) {
            return;
        }
        int i2 = c0770u.f3116g;
        int i3 = c0770u.f3118i;
        if (c0770u.f3115f == -1) {
            int iM2014v = m2014v();
            if (i2 < 0) {
                return;
            }
            int iMo1293f = (this.f1917r.mo1293f() - i2) + i3;
            if (this.f1920u) {
                for (int i4 = 0; i4 < iM2014v; i4++) {
                    View viewM2013u = m2013u(i4);
                    if (this.f1917r.mo1292e(viewM2013u) < iMo1293f || this.f1917r.mo1301n(viewM2013u) < iMo1293f) {
                        m1565Z0(c0729q, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = iM2014v - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View viewM2013u2 = m2013u(i6);
                if (this.f1917r.mo1292e(viewM2013u2) < iMo1293f || this.f1917r.mo1301n(viewM2013u2) < iMo1293f) {
                    m1565Z0(c0729q, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i2 < 0) {
            return;
        }
        int i7 = i2 - i3;
        int iM2014v2 = m2014v();
        if (!this.f1920u) {
            for (int i8 = 0; i8 < iM2014v2; i8++) {
                View viewM2013u3 = m2013u(i8);
                if (this.f1917r.mo1289b(viewM2013u3) > i7 || this.f1917r.mo1300m(viewM2013u3) > i7) {
                    m1565Z0(c0729q, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = iM2014v2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View viewM2013u4 = m2013u(i10);
            if (this.f1917r.mo1289b(viewM2013u4) > i7 || this.f1917r.mo1300m(viewM2013u4) > i7) {
                m1565Z0(c0729q, i9, i10);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m1565Z0(C0729Q c0729q, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                View viewM2013u = m2013u(i2);
                m2008m0(i2);
                c0729q.m2027h(viewM2013u);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            View viewM2013u2 = m2013u(i4);
            m2008m0(i4);
            c0729q.m2027h(viewM2013u2);
        }
    }

    @Override // p066g0.InterfaceC0734W
    /* JADX INFO: renamed from: a */
    public final PointF mo1566a(int i2) {
        if (m2014v() == 0) {
            return null;
        }
        int i3 = (i2 < AbstractC0723K.m1989G(m2013u(0))) != this.f1920u ? -1 : 1;
        return this.f1915p == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m1567a1() {
        if (this.f1915p == 1 || !m1563V0()) {
            this.f1920u = this.f1919t;
        } else {
            this.f1920u = !this.f1919t;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final int m1568b1(int i2, C0729Q c0729q, C0735X c0735x) {
        if (m2014v() != 0 && i2 != 0) {
            m1548J0();
            this.f1916q.f3110a = true;
            int i3 = i2 > 0 ? 1 : -1;
            int iAbs = Math.abs(i2);
            m1573e1(i3, iAbs, true, c0735x);
            C0770u c0770u = this.f1916q;
            int iM1550K0 = m1550K0(c0729q, c0770u, c0735x, false) + c0770u.f3116g;
            if (iM1550K0 >= 0) {
                if (iAbs > iM1550K0) {
                    i2 = i3 * iM1550K0;
                }
                this.f1917r.mo1302o(-i2);
                this.f1916q.f3119j = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: c */
    public final void mo1569c(String str) {
        if (this.f1925z == null) {
            super.mo1569c(str);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m1570c1(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("invalid orientation:", i2));
        }
        mo1569c(null);
        if (i2 != this.f1915p || this.f1917r == null) {
            AbstractC0493g abstractC0493gM1288a = AbstractC0493g.m1288a(this, i2);
            this.f1917r = abstractC0493gM1288a;
            this.f1911A.f3101a = abstractC0493gM1288a;
            this.f1915p = i2;
            m2009o0();
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: d */
    public final boolean mo1571d() {
        return this.f1915p == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1513d0(C0729Q c0729q, C0735X c0735x) {
        View focusedChild;
        View focusedChild2;
        View viewMo1502Q0;
        int i2;
        int iMo1292e;
        int i3;
        int i4;
        List list;
        int i5;
        int i6;
        int iM1557R0;
        int i7;
        View viewMo1582q;
        int iMo1292e2;
        int iMo1294g;
        int i8;
        int i9 = -1;
        if (!(this.f1925z == null && this.f1923x == -1) && c0735x.m2035b() == 0) {
            m2005j0(c0729q);
            return;
        }
        C0771v c0771v = this.f1925z;
        if (c0771v != null && (i8 = c0771v.f3122a) >= 0) {
            this.f1923x = i8;
        }
        m1548J0();
        this.f1916q.f3110a = false;
        m1567a1();
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2861a.f2952c.contains(focusedChild)) {
            focusedChild = null;
        }
        C0768s c0768s = this.f1911A;
        if (!c0768s.f3105e || this.f1923x != -1 || this.f1925z != null) {
            c0768s.m2106d();
            c0768s.f3104d = this.f1920u ^ this.f1921v;
            if (c0735x.f2910g || (i2 = this.f1923x) == -1) {
                if (m2014v() != 0) {
                    RecyclerView recyclerView2 = this.f2862b;
                    if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f2861a.f2952c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        C0724L c0724l = (C0724L) focusedChild2.getLayoutParams();
                        if (c0724l.f2876a.m2054h() || c0724l.f2876a.m2048b() < 0 || c0724l.f2876a.m2048b() >= c0735x.m2035b()) {
                            boolean z2 = this.f1918s;
                            boolean z3 = this.f1921v;
                            if (z2 == z3 && (viewMo1502Q0 = mo1502Q0(c0729q, c0735x, c0768s.f3104d, z3)) != null) {
                                c0768s.m2104b(viewMo1502Q0, AbstractC0723K.m1989G(viewMo1502Q0));
                                if (!c0735x.f2910g && mo1499C0()) {
                                    int iMo1292e3 = this.f1917r.mo1292e(viewMo1502Q0);
                                    int iMo1289b = this.f1917r.mo1289b(viewMo1502Q0);
                                    int iMo1298k = this.f1917r.mo1298k();
                                    int iMo1294g2 = this.f1917r.mo1294g();
                                    boolean z4 = iMo1289b <= iMo1298k && iMo1292e3 < iMo1298k;
                                    boolean z5 = iMo1292e3 >= iMo1294g2 && iMo1289b > iMo1294g2;
                                    if (z4 || z5) {
                                        if (c0768s.f3104d) {
                                            iMo1298k = iMo1294g2;
                                        }
                                        c0768s.f3103c = iMo1298k;
                                    }
                                }
                            } else {
                                c0768s.m2103a();
                                c0768s.f3102b = this.f1921v ? c0735x.m2035b() - 1 : 0;
                            }
                        } else {
                            c0768s.m2105c(focusedChild2, AbstractC0723K.m1989G(focusedChild2));
                        }
                        c0768s.f3105e = true;
                    }
                }
            } else if (i2 < 0 || i2 >= c0735x.m2035b()) {
                this.f1923x = -1;
                this.f1924y = Integer.MIN_VALUE;
                if (m2014v() != 0) {
                }
            } else {
                int i10 = this.f1923x;
                c0768s.f3102b = i10;
                C0771v c0771v2 = this.f1925z;
                if (c0771v2 != null && c0771v2.f3122a >= 0) {
                    boolean z6 = c0771v2.f3124c;
                    c0768s.f3104d = z6;
                    if (z6) {
                        c0768s.f3103c = this.f1917r.mo1294g() - this.f1925z.f3123b;
                    } else {
                        c0768s.f3103c = this.f1917r.mo1298k() + this.f1925z.f3123b;
                    }
                } else if (this.f1924y == Integer.MIN_VALUE) {
                    View viewMo1582q2 = mo1582q(i10);
                    if (viewMo1582q2 == null) {
                        if (m2014v() > 0) {
                            c0768s.f3104d = (this.f1923x < AbstractC0723K.m1989G(m2013u(0))) == this.f1920u;
                        }
                        c0768s.m2103a();
                    } else if (this.f1917r.mo1290c(viewMo1582q2) > this.f1917r.mo1299l()) {
                        c0768s.m2103a();
                    } else if (this.f1917r.mo1292e(viewMo1582q2) - this.f1917r.mo1298k() < 0) {
                        c0768s.f3103c = this.f1917r.mo1298k();
                        c0768s.f3104d = false;
                    } else if (this.f1917r.mo1294g() - this.f1917r.mo1289b(viewMo1582q2) < 0) {
                        c0768s.f3103c = this.f1917r.mo1294g();
                        c0768s.f3104d = true;
                    } else {
                        if (c0768s.f3104d) {
                            int iMo1289b2 = this.f1917r.mo1289b(viewMo1582q2);
                            AbstractC0493g abstractC0493g = this.f1917r;
                            iMo1292e = (Integer.MIN_VALUE == abstractC0493g.f1516a ? 0 : abstractC0493g.mo1299l() - abstractC0493g.f1516a) + iMo1289b2;
                        } else {
                            iMo1292e = this.f1917r.mo1292e(viewMo1582q2);
                        }
                        c0768s.f3103c = iMo1292e;
                    }
                } else {
                    boolean z7 = this.f1920u;
                    c0768s.f3104d = z7;
                    if (z7) {
                        c0768s.f3103c = this.f1917r.mo1294g() - this.f1924y;
                    } else {
                        c0768s.f3103c = this.f1917r.mo1298k() + this.f1924y;
                    }
                }
                c0768s.f3105e = true;
            }
        } else if (focusedChild != null && (this.f1917r.mo1292e(focusedChild) >= this.f1917r.mo1294g() || this.f1917r.mo1289b(focusedChild) <= this.f1917r.mo1298k())) {
            c0768s.m2105c(focusedChild, AbstractC0723K.m1989G(focusedChild));
        }
        C0770u c0770u = this.f1916q;
        c0770u.f3115f = c0770u.f3119j >= 0 ? 1 : -1;
        int[] iArr = this.f1914D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1543D0(c0735x, iArr);
        int iMo1298k2 = this.f1917r.mo1298k() + Math.max(0, iArr[0]);
        int iMo1295h = this.f1917r.mo1295h() + Math.max(0, iArr[1]);
        if (c0735x.f2910g && (i7 = this.f1923x) != -1 && this.f1924y != Integer.MIN_VALUE && (viewMo1582q = mo1582q(i7)) != null) {
            if (this.f1920u) {
                iMo1294g = this.f1917r.mo1294g() - this.f1917r.mo1289b(viewMo1582q);
                iMo1292e2 = this.f1924y;
            } else {
                iMo1292e2 = this.f1917r.mo1292e(viewMo1582q) - this.f1917r.mo1298k();
                iMo1294g = this.f1924y;
            }
            int i11 = iMo1294g - iMo1292e2;
            if (i11 > 0) {
                iMo1298k2 += i11;
            } else {
                iMo1295h -= i11;
            }
        }
        if (!c0768s.f3104d ? !this.f1920u : this.f1920u) {
            i9 = 1;
        }
        mo1507X0(c0729q, c0735x, c0768s, i9);
        m2010p(c0729q);
        this.f1916q.f3121l = this.f1917r.mo1296i() == 0 && this.f1917r.mo1293f() == 0;
        this.f1916q.getClass();
        this.f1916q.f3118i = 0;
        if (c0768s.f3104d) {
            m1577g1(c0768s.f3102b, c0768s.f3103c);
            C0770u c0770u2 = this.f1916q;
            c0770u2.f3117h = iMo1298k2;
            m1550K0(c0729q, c0770u2, c0735x, false);
            C0770u c0770u3 = this.f1916q;
            i4 = c0770u3.f3111b;
            int i12 = c0770u3.f3113d;
            int i13 = c0770u3.f3112c;
            if (i13 > 0) {
                iMo1295h += i13;
            }
            m1575f1(c0768s.f3102b, c0768s.f3103c);
            C0770u c0770u4 = this.f1916q;
            c0770u4.f3117h = iMo1295h;
            c0770u4.f3113d += c0770u4.f3114e;
            m1550K0(c0729q, c0770u4, c0735x, false);
            C0770u c0770u5 = this.f1916q;
            i3 = c0770u5.f3111b;
            int i14 = c0770u5.f3112c;
            if (i14 > 0) {
                m1577g1(i12, i4);
                C0770u c0770u6 = this.f1916q;
                c0770u6.f3117h = i14;
                m1550K0(c0729q, c0770u6, c0735x, false);
                i4 = this.f1916q.f3111b;
            }
        } else {
            m1575f1(c0768s.f3102b, c0768s.f3103c);
            C0770u c0770u7 = this.f1916q;
            c0770u7.f3117h = iMo1295h;
            m1550K0(c0729q, c0770u7, c0735x, false);
            C0770u c0770u8 = this.f1916q;
            i3 = c0770u8.f3111b;
            int i15 = c0770u8.f3113d;
            int i16 = c0770u8.f3112c;
            if (i16 > 0) {
                iMo1298k2 += i16;
            }
            m1577g1(c0768s.f3102b, c0768s.f3103c);
            C0770u c0770u9 = this.f1916q;
            c0770u9.f3117h = iMo1298k2;
            c0770u9.f3113d += c0770u9.f3114e;
            m1550K0(c0729q, c0770u9, c0735x, false);
            C0770u c0770u10 = this.f1916q;
            int i17 = c0770u10.f3111b;
            int i18 = c0770u10.f3112c;
            if (i18 > 0) {
                m1575f1(i15, i3);
                C0770u c0770u11 = this.f1916q;
                c0770u11.f3117h = i18;
                m1550K0(c0729q, c0770u11, c0735x, false);
                i3 = this.f1916q.f3111b;
            }
            i4 = i17;
        }
        if (m2014v() > 0) {
            if (this.f1920u ^ this.f1921v) {
                int iM1557R02 = m1557R0(i3, c0729q, c0735x, true);
                i5 = i4 + iM1557R02;
                i6 = i3 + iM1557R02;
                iM1557R0 = m1559S0(i5, c0729q, c0735x, false);
            } else {
                int iM1559S0 = m1559S0(i4, c0729q, c0735x, true);
                i5 = i4 + iM1559S0;
                i6 = i3 + iM1559S0;
                iM1557R0 = m1557R0(i6, c0729q, c0735x, false);
            }
            i4 = i5 + iM1557R0;
            i3 = i6 + iM1557R0;
        }
        if (c0735x.f2914k && m2014v() != 0 && !c0735x.f2910g && mo1499C0()) {
            List list2 = c0729q.f2890d;
            int size = list2.size();
            int iM1989G = AbstractC0723K.m1989G(m2013u(0));
            int iMo1290c = 0;
            int iMo1290c2 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) list2.get(i19);
                if (!abstractC0741b0.m2054h()) {
                    boolean z8 = abstractC0741b0.m2048b() < iM1989G;
                    boolean z9 = this.f1920u;
                    View view = abstractC0741b0.f2931a;
                    if (z8 != z9) {
                        iMo1290c += this.f1917r.mo1290c(view);
                    } else {
                        iMo1290c2 += this.f1917r.mo1290c(view);
                    }
                }
            }
            this.f1916q.f3120k = list2;
            if (iMo1290c > 0) {
                m1577g1(AbstractC0723K.m1989G(m1562U0()), i4);
                C0770u c0770u12 = this.f1916q;
                c0770u12.f3117h = iMo1290c;
                c0770u12.f3112c = 0;
                c0770u12.m2107a(null);
                m1550K0(c0729q, this.f1916q, c0735x, false);
            }
            if (iMo1290c2 > 0) {
                m1575f1(AbstractC0723K.m1989G(m1560T0()), i3);
                C0770u c0770u13 = this.f1916q;
                c0770u13.f3117h = iMo1290c2;
                c0770u13.f3112c = 0;
                list = null;
                c0770u13.m2107a(null);
                m1550K0(c0729q, this.f1916q, c0735x, false);
            } else {
                list = null;
            }
            this.f1916q.f3120k = list;
        }
        if (c0735x.f2910g) {
            c0768s.m2106d();
        } else {
            AbstractC0493g abstractC0493g2 = this.f1917r;
            abstractC0493g2.f1516a = abstractC0493g2.mo1299l();
        }
        this.f1918s = this.f1921v;
    }

    /* JADX INFO: renamed from: d1 */
    public void mo1514d1(boolean z2) {
        mo1569c(null);
        if (this.f1921v == z2) {
            return;
        }
        this.f1921v = z2;
        m2009o0();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: e */
    public final boolean mo1572e() {
        return this.f1915p == 1;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: e0 */
    public void mo1515e0(C0735X c0735x) {
        this.f1925z = null;
        this.f1923x = -1;
        this.f1924y = Integer.MIN_VALUE;
        this.f1911A.m2106d();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m1573e1(int i2, int i3, boolean z2, C0735X c0735x) {
        int iMo1298k;
        this.f1916q.f3121l = this.f1917r.mo1296i() == 0 && this.f1917r.mo1293f() == 0;
        this.f1916q.f3115f = i2;
        int[] iArr = this.f1914D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1543D0(c0735x, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z3 = i2 == 1;
        C0770u c0770u = this.f1916q;
        int i4 = z3 ? iMax2 : iMax;
        c0770u.f3117h = i4;
        if (!z3) {
            iMax = iMax2;
        }
        c0770u.f3118i = iMax;
        if (z3) {
            c0770u.f3117h = this.f1917r.mo1295h() + i4;
            View viewM1560T0 = m1560T0();
            C0770u c0770u2 = this.f1916q;
            c0770u2.f3114e = this.f1920u ? -1 : 1;
            int iM1989G = AbstractC0723K.m1989G(viewM1560T0);
            C0770u c0770u3 = this.f1916q;
            c0770u2.f3113d = iM1989G + c0770u3.f3114e;
            c0770u3.f3111b = this.f1917r.mo1289b(viewM1560T0);
            iMo1298k = this.f1917r.mo1289b(viewM1560T0) - this.f1917r.mo1294g();
        } else {
            View viewM1562U0 = m1562U0();
            C0770u c0770u4 = this.f1916q;
            c0770u4.f3117h = this.f1917r.mo1298k() + c0770u4.f3117h;
            C0770u c0770u5 = this.f1916q;
            c0770u5.f3114e = this.f1920u ? 1 : -1;
            int iM1989G2 = AbstractC0723K.m1989G(viewM1562U0);
            C0770u c0770u6 = this.f1916q;
            c0770u5.f3113d = iM1989G2 + c0770u6.f3114e;
            c0770u6.f3111b = this.f1917r.mo1292e(viewM1562U0);
            iMo1298k = (-this.f1917r.mo1292e(viewM1562U0)) + this.f1917r.mo1298k();
        }
        C0770u c0770u7 = this.f1916q;
        c0770u7.f3112c = i3;
        if (z2) {
            c0770u7.f3112c = i3 - iMo1298k;
        }
        c0770u7.f3116g = iMo1298k;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: f0 */
    public final void mo1574f0(Parcelable parcelable) {
        if (parcelable instanceof C0771v) {
            C0771v c0771v = (C0771v) parcelable;
            this.f1925z = c0771v;
            if (this.f1923x != -1) {
                c0771v.f3122a = -1;
            }
            m2009o0();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m1575f1(int i2, int i3) {
        this.f1916q.f3112c = this.f1917r.mo1294g() - i3;
        C0770u c0770u = this.f1916q;
        c0770u.f3114e = this.f1920u ? -1 : 1;
        c0770u.f3113d = i2;
        c0770u.f3115f = 1;
        c0770u.f3111b = i3;
        c0770u.f3116g = Integer.MIN_VALUE;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: g0 */
    public final Parcelable mo1576g0() {
        C0771v c0771v = this.f1925z;
        if (c0771v != null) {
            C0771v c0771v2 = new C0771v();
            c0771v2.f3122a = c0771v.f3122a;
            c0771v2.f3123b = c0771v.f3123b;
            c0771v2.f3124c = c0771v.f3124c;
            return c0771v2;
        }
        C0771v c0771v3 = new C0771v();
        if (m2014v() <= 0) {
            c0771v3.f3122a = -1;
            return c0771v3;
        }
        m1548J0();
        boolean z2 = this.f1918s ^ this.f1920u;
        c0771v3.f3124c = z2;
        if (z2) {
            View viewM1560T0 = m1560T0();
            c0771v3.f3123b = this.f1917r.mo1294g() - this.f1917r.mo1289b(viewM1560T0);
            c0771v3.f3122a = AbstractC0723K.m1989G(viewM1560T0);
            return c0771v3;
        }
        View viewM1562U0 = m1562U0();
        c0771v3.f3122a = AbstractC0723K.m1989G(viewM1562U0);
        c0771v3.f3123b = this.f1917r.mo1292e(viewM1562U0) - this.f1917r.mo1298k();
        return c0771v3;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m1577g1(int i2, int i3) {
        this.f1916q.f3112c = i3 - this.f1917r.mo1298k();
        C0770u c0770u = this.f1916q;
        c0770u.f3113d = i2;
        c0770u.f3114e = this.f1920u ? 1 : -1;
        c0770u.f3115f = -1;
        c0770u.f3111b = i3;
        c0770u.f3116g = Integer.MIN_VALUE;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: h */
    public final void mo1578h(int i2, int i3, C0735X c0735x, C0763n c0763n) {
        if (this.f1915p != 0) {
            i2 = i3;
        }
        if (m2014v() == 0 || i2 == 0) {
            return;
        }
        m1548J0();
        m1573e1(i2 > 0 ? 1 : -1, Math.abs(i2), true, c0735x);
        mo1500E0(c0735x, this.f1916q, c0763n);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: i */
    public final void mo1579i(int i2, C0763n c0763n) {
        boolean z2;
        int i3;
        C0771v c0771v = this.f1925z;
        if (c0771v == null || (i3 = c0771v.f3122a) < 0) {
            m1567a1();
            z2 = this.f1920u;
            i3 = this.f1923x;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            z2 = c0771v.f3124c;
        }
        int i4 = z2 ? -1 : 1;
        for (int i5 = 0; i5 < this.f1913C && i3 >= 0 && i3 < i2; i5++) {
            c0763n.m2098a(i3, 0);
            i3 += i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1518i0(int i2, Bundle bundle) {
        int iMin;
        if (super.mo1518i0(i2, bundle)) {
            return true;
        }
        if (i2 == 16908343 && bundle != null) {
            if (this.f1915p == 1) {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i3 >= 0) {
                    RecyclerView recyclerView = this.f2862b;
                    iMin = Math.min(i3, mo1501I(recyclerView.f1962c, recyclerView.f1967e0) - 1);
                    if (iMin >= 0) {
                        this.f1923x = iMin;
                        this.f1924y = 0;
                        C0771v c0771v = this.f1925z;
                        if (c0771v != null) {
                            c0771v.f3122a = -1;
                        }
                        m2009o0();
                        return true;
                    }
                }
            } else {
                int i4 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i4 >= 0) {
                    RecyclerView recyclerView2 = this.f2862b;
                    iMin = Math.min(i4, mo1541x(recyclerView2.f1962c, recyclerView2.f1967e0) - 1);
                    if (iMin >= 0) {
                    }
                }
            }
        }
        return false;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: j */
    public final int mo1580j(C0735X c0735x) {
        return m1544F0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: k */
    public int mo1521k(C0735X c0735x) {
        return m1545G0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: l */
    public int mo1523l(C0735X c0735x) {
        return m1546H0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: m */
    public final int mo1581m(C0735X c0735x) {
        return m1544F0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: n */
    public int mo1526n(C0735X c0735x) {
        return m1545G0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: o */
    public int mo1528o(C0735X c0735x) {
        return m1546H0(c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: p0 */
    public int mo1530p0(int i2, C0729Q c0729q, C0735X c0735x) {
        if (this.f1915p == 1) {
            return 0;
        }
        return m1568b1(i2, c0729q, c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: q */
    public final View mo1582q(int i2) {
        int iM2014v = m2014v();
        if (iM2014v == 0) {
            return null;
        }
        int iM1989G = i2 - AbstractC0723K.m1989G(m2013u(0));
        if (iM1989G >= 0 && iM1989G < iM2014v) {
            View viewM2013u = m2013u(iM1989G);
            if (AbstractC0723K.m1989G(viewM2013u) == i2) {
                return viewM2013u;
            }
        }
        return super.mo1582q(i2);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: q0 */
    public final void mo1583q0(int i2) {
        this.f1923x = i2;
        this.f1924y = Integer.MIN_VALUE;
        C0771v c0771v = this.f1925z;
        if (c0771v != null) {
            c0771v.f3122a = -1;
        }
        m2009o0();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: r */
    public C0724L mo1533r() {
        return new C0724L(-2, -2);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: r0 */
    public int mo1534r0(int i2, C0729Q c0729q, C0735X c0735x) {
        if (this.f1915p == 0) {
            return 0;
        }
        return m1568b1(i2, c0729q, c0735x);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: y0 */
    public final boolean mo1584y0() {
        if (this.f2873m != 1073741824 && this.f2872l != 1073741824) {
            int iM2014v = m2014v();
            for (int i2 = 0; i2 < iM2014v; i2++) {
                ViewGroup.LayoutParams layoutParams = m2013u(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1915p = 1;
        this.f1919t = false;
        this.f1920u = false;
        this.f1921v = false;
        this.f1922w = true;
        this.f1923x = -1;
        this.f1924y = Integer.MIN_VALUE;
        this.f1925z = null;
        this.f1911A = new C0768s();
        this.f1912B = new C0769t();
        this.f1913C = 2;
        this.f1914D = new int[2];
        C0722J c0722jM1990H = AbstractC0723K.m1990H(context, attributeSet, i2, i3);
        m1570c1(c0722jM1990H.f2857a);
        boolean z2 = c0722jM1990H.f2859c;
        mo1569c(null);
        if (z2 != this.f1919t) {
            this.f1919t = z2;
            m2009o0();
        }
        mo1514d1(c0722jM1990H.f2860d);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: S */
    public final void mo1558S(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: X0 */
    public void mo1507X0(C0729Q c0729q, C0735X c0735x, C0768s c0768s, int i2) {
    }
}
