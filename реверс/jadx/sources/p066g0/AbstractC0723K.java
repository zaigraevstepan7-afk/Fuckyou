package p066g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.AbstractC0529T;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p005C0.C0048n;
import p024N.AbstractC0240S;
import p026O.C0310j;
import p026O.C0311k;
import p063f0.AbstractC0697a;
import p084q.C1031j;

/* JADX INFO: renamed from: g0.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0723K {

    /* JADX INFO: renamed from: a */
    public C0742c f2861a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f2862b;

    /* JADX INFO: renamed from: c */
    public final C0048n f2863c;

    /* JADX INFO: renamed from: d */
    public final C0048n f2864d;

    /* JADX INFO: renamed from: e */
    public C0772w f2865e;

    /* JADX INFO: renamed from: f */
    public boolean f2866f;

    /* JADX INFO: renamed from: g */
    public boolean f2867g;

    /* JADX INFO: renamed from: h */
    public final boolean f2868h;

    /* JADX INFO: renamed from: i */
    public final boolean f2869i;

    /* JADX INFO: renamed from: j */
    public int f2870j;

    /* JADX INFO: renamed from: k */
    public boolean f2871k;

    /* JADX INFO: renamed from: l */
    public int f2872l;

    /* JADX INFO: renamed from: m */
    public int f2873m;

    /* JADX INFO: renamed from: n */
    public int f2874n;

    /* JADX INFO: renamed from: o */
    public int f2875o;

    public AbstractC0723K() {
        C0721I c0721i = new C0721I(this, 0);
        C0721I c0721i2 = new C0721I(this, 1);
        this.f2863c = new C0048n(c0721i);
        this.f2864d = new C0048n(c0721i2);
        this.f2866f = false;
        this.f2867g = false;
        this.f2868h = true;
        this.f2869i = true;
    }

    /* JADX INFO: renamed from: A */
    public static int m1988A(View view) {
        Rect rect = ((C0724L) view.getLayoutParams()).f2877b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: G */
    public static int m1989G(View view) {
        return ((C0724L) view.getLayoutParams()).f2876a.m2048b();
    }

    /* JADX INFO: renamed from: H */
    public static C0722J m1990H(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0722J c0722j = new C0722J();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0697a.f2778a, i2, i3);
        c0722j.f2857a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0722j.f2858b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0722j.f2859c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0722j.f2860d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0722j;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m1991M(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    public static void m1992N(View view, int i2, int i3, int i4, int i5) {
        C0724L c0724l = (C0724L) view.getLayoutParams();
        Rect rect = c0724l.f2877b;
        view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) c0724l).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) c0724l).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) c0724l).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0724l).bottomMargin);
    }

    /* JADX INFO: renamed from: g */
    public static int m1993g(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1994w(boolean z2, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, i2 - i4);
        if (z2) {
            if (i5 < 0) {
                if (i5 != -1 || (i3 != Integer.MIN_VALUE && (i3 == 0 || i3 != 1073741824))) {
                    i3 = 0;
                    i5 = 0;
                } else {
                    i5 = iMax;
                }
            }
            i3 = 1073741824;
        } else if (i5 >= 0) {
            i3 = 1073741824;
        } else if (i5 != -1) {
            if (i5 == -2) {
                if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                    i5 = iMax;
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = iMax;
                    i3 = 0;
                }
            }
        }
        return View.MeasureSpec.makeMeasureSpec(i5, i3);
    }

    /* JADX INFO: renamed from: z */
    public static int m1995z(View view) {
        Rect rect = ((C0724L) view.getLayoutParams()).f2877b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo1542A0(RecyclerView recyclerView, int i2);

    /* JADX INFO: renamed from: B */
    public final int m1996B() {
        RecyclerView recyclerView = this.f2862b;
        AbstractC0714B adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo985a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m1997B0(C0772w c0772w) {
        C0772w c0772w2 = this.f2865e;
        if (c0772w2 != null && c0772w != c0772w2 && c0772w2.f3129e) {
            c0772w2.m2116i();
        }
        this.f2865e = c0772w;
        RecyclerView recyclerView = this.f2862b;
        RunnableC0739a0 runnableC0739a0 = recyclerView.f1961b0;
        runnableC0739a0.f2927g.removeCallbacks(runnableC0739a0);
        runnableC0739a0.f2923c.abortAnimation();
        if (c0772w.f3132h) {
            Log.w("RecyclerView", "An instance of " + c0772w.getClass().getSimpleName() + " was started more than once. Each instance of" + c0772w.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0772w.f3126b = recyclerView;
        c0772w.f3127c = this;
        int i2 = c0772w.f3125a;
        if (i2 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1967e0.f2904a = i2;
        c0772w.f3129e = true;
        c0772w.f3128d = true;
        c0772w.f3130f = recyclerView.f1982m.mo1582q(i2);
        c0772w.f3126b.f1961b0.m2037b();
        c0772w.f3132h = true;
    }

    /* JADX INFO: renamed from: C */
    public final int m1998C() {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: C0 */
    public boolean mo1499C0() {
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final int m1999D() {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final int m2000E() {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: F */
    public final int m2001F() {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public int mo1501I(C0729Q c0729q, C0735X c0735x) {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView == null || recyclerView.f1980l == null || !mo1572e()) {
            return 1;
        }
        return this.f2862b.f1980l.mo985a();
    }

    /* JADX INFO: renamed from: J */
    public final void m2002J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0724L) view.getLayoutParams()).f2877b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2862b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2862b.f1978k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: K */
    public abstract boolean mo1549K();

    /* JADX INFO: renamed from: L */
    public boolean mo1551L() {
        return false;
    }

    /* JADX INFO: renamed from: O */
    public void mo1662O(int i2) {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView != null) {
            int iM2067e = recyclerView.f1968f.m2067e();
            for (int i3 = 0; i3 < iM2067e; i3++) {
                recyclerView.f1968f.m2066d(i3).offsetLeftAndRight(i2);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void mo1664P(int i2) {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView != null) {
            int iM2067e = recyclerView.f1968f.m2067e();
            for (int i3 = 0; i3 < iM2067e; i3++) {
                recyclerView.f1968f.m2066d(i3).offsetTopAndBottom(i2);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public abstract void mo1558S(RecyclerView recyclerView);

    /* JADX INFO: renamed from: T */
    public abstract View mo1503T(View view, int i2, C0729Q c0729q, C0735X c0735x);

    /* JADX INFO: renamed from: U */
    public void mo1561U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2862b;
        C0729Q c0729q = recyclerView.f1962c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2862b.canScrollVertically(-1) && !this.f2862b.canScrollHorizontally(-1) && !this.f2862b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0714B abstractC0714B = this.f2862b.f1980l;
        if (abstractC0714B != null) {
            accessibilityEvent.setItemCount(abstractC0714B.mo985a());
        }
    }

    /* JADX INFO: renamed from: V */
    public void mo1504V(C0729Q c0729q, C0735X c0735x, C0311k c0311k) {
        boolean zCanScrollVertically = this.f2862b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = c0311k.f911a;
        if (zCanScrollVertically || this.f2862b.canScrollHorizontally(-1)) {
            c0311k.m968a(8192);
            accessibilityNodeInfo.setScrollable(true);
            c0311k.m974h(67108864, true);
        }
        if (this.f2862b.canScrollVertically(1) || this.f2862b.canScrollHorizontally(1)) {
            c0311k.m968a(4096);
            accessibilityNodeInfo.setScrollable(true);
            c0311k.m974h(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo1501I(c0729q, c0735x), mo1541x(c0729q, c0735x), false, 0));
    }

    /* JADX INFO: renamed from: W */
    public final void m2003W(View view, C0311k c0311k) {
        AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
        if (abstractC0741b0M1586M == null || abstractC0741b0M1586M.m2054h() || this.f2861a.f2952c.contains(abstractC0741b0M1586M.f2931a)) {
            return;
        }
        RecyclerView recyclerView = this.f2862b;
        mo1506X(recyclerView.f1962c, recyclerView.f1967e0, view, c0311k);
    }

    /* JADX INFO: renamed from: X */
    public void mo1506X(C0729Q c0729q, C0735X c0735x, View view, C0311k c0311k) {
        c0311k.m976j(C0310j.m966a(false, mo1572e() ? m1989G(view) : 0, 1, mo1571d() ? m1989G(view) : 0, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2004b(View view, int i2, boolean z2) {
        int iM2040b;
        AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
        if (z2 || abstractC0741b0M1586M.m2054h()) {
            C1031j c1031j = (C1031j) this.f2862b.f1970g.f174b;
            C0761l0 c0761l0M2092a = (C0761l0) c1031j.get(abstractC0741b0M1586M);
            if (c0761l0M2092a == null) {
                c0761l0M2092a = C0761l0.m2092a();
                c1031j.put(abstractC0741b0M1586M, c0761l0M2092a);
            }
            c0761l0M2092a.f3042a |= 1;
        } else {
            this.f2862b.f1970g.m291I(abstractC0741b0M1586M);
        }
        C0724L c0724l = (C0724L) view.getLayoutParams();
        if (abstractC0741b0M1586M.m2062p() || abstractC0741b0M1586M.m2055i()) {
            if (abstractC0741b0M1586M.m2055i()) {
                abstractC0741b0M1586M.f2944n.m2031l(abstractC0741b0M1586M);
            } else {
                abstractC0741b0M1586M.f2940j &= -33;
            }
            this.f2861a.m2064b(view, i2, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2862b) {
                C0742c c0742c = this.f2861a;
                int iIndexOfChild = c0742c.f2950a.f2845a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    iM2040b = -1;
                    if (i2 == -1) {
                        i2 = this.f2861a.m2067e();
                    }
                    if (iM2040b != -1) {
                        StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb.append(this.f2862b.indexOfChild(view));
                        throw new IllegalStateException(AbstractC0529T.m1415d(this.f2862b, sb));
                    }
                    if (iM2040b != i2) {
                        AbstractC0723K abstractC0723K = this.f2862b.f1982m;
                        View viewM2013u = abstractC0723K.m2013u(iM2040b);
                        if (viewM2013u == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM2040b + abstractC0723K.f2862b.toString());
                        }
                        abstractC0723K.m2013u(iM2040b);
                        abstractC0723K.f2861a.m2065c(iM2040b);
                        C0724L c0724l2 = (C0724L) viewM2013u.getLayoutParams();
                        AbstractC0741b0 abstractC0741b0M1586M2 = RecyclerView.m1586M(viewM2013u);
                        if (abstractC0741b0M1586M2.m2054h()) {
                            C1031j c1031j2 = (C1031j) abstractC0723K.f2862b.f1970g.f174b;
                            C0761l0 c0761l0M2092a2 = (C0761l0) c1031j2.get(abstractC0741b0M1586M2);
                            if (c0761l0M2092a2 == null) {
                                c0761l0M2092a2 = C0761l0.m2092a();
                                c1031j2.put(abstractC0741b0M1586M2, c0761l0M2092a2);
                            }
                            c0761l0M2092a2.f3042a = 1 | c0761l0M2092a2.f3042a;
                        } else {
                            abstractC0723K.f2862b.f1970g.m291I(abstractC0741b0M1586M2);
                        }
                        abstractC0723K.f2861a.m2064b(viewM2013u, i2, c0724l2, abstractC0741b0M1586M2.m2054h());
                    }
                } else {
                    C0740b c0740b = c0742c.f2951b;
                    if (!c0740b.m2042d(iIndexOfChild)) {
                        iM2040b = iIndexOfChild - c0740b.m2040b(iIndexOfChild);
                    }
                    if (i2 == -1) {
                    }
                    if (iM2040b != -1) {
                    }
                }
            } else {
                this.f2861a.m2063a(view, i2, false);
                c0724l.f2878c = true;
                C0772w c0772w = this.f2865e;
                if (c0772w != null && c0772w.f3129e) {
                    c0772w.f3126b.getClass();
                    AbstractC0741b0 abstractC0741b0M1586M3 = RecyclerView.m1586M(view);
                    if ((abstractC0741b0M1586M3 != null ? abstractC0741b0M1586M3.m2048b() : -1) == c0772w.f3125a) {
                        c0772w.f3130f = view;
                        if (RecyclerView.f1926A0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c0724l.f2879d) {
            if (RecyclerView.f1926A0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c0724l.f2876a);
            }
            abstractC0741b0M1586M.f2931a.invalidate();
            c0724l.f2879d = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo1569c(String str) {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView != null) {
            recyclerView.m1632k(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo1571d();

    /* JADX INFO: renamed from: d0 */
    public abstract void mo1513d0(C0729Q c0729q, C0735X c0735x);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1572e();

    /* JADX INFO: renamed from: e0 */
    public abstract void mo1515e0(C0735X c0735x);

    /* JADX INFO: renamed from: f */
    public boolean mo1516f(C0724L c0724l) {
        return c0724l != null;
    }

    /* JADX INFO: renamed from: g0 */
    public Parcelable mo1576g0() {
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean mo1518i0(int i2, Bundle bundle) {
        int iM2001F;
        int iM1999D;
        float f;
        C0729Q c0729q = this.f2862b.f1962c;
        int iHeight = this.f2875o;
        int iWidth = this.f2874n;
        Rect rect = new Rect();
        if (this.f2862b.getMatrix().isIdentity() && this.f2862b.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i2 != 4096) {
            if (i2 != 8192) {
                iM2001F = 0;
            } else {
                iM2001F = this.f2862b.canScrollVertically(-1) ? -((iHeight - m2001F()) - m1998C()) : 0;
                if (this.f2862b.canScrollHorizontally(-1)) {
                    iM1999D = -((iWidth - m1999D()) - m2000E());
                }
            }
        } else {
            iM2001F = this.f2862b.canScrollVertically(1) ? (iHeight - m2001F()) - m1998C() : 0;
            iM1999D = this.f2862b.canScrollHorizontally(1) ? (iWidth - m1999D()) - m2000E() : 0;
        }
        if (iM2001F != 0 || iM1999D != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (RecyclerView.f1934z0) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    iM1999D = (int) (iM1999D * f);
                    iM2001F = (int) (iM2001F * f);
                }
                this.f2862b.m1627h0(iM1999D, iM2001F, true);
                return true;
            }
            RecyclerView recyclerView = this.f2862b;
            AbstractC0714B abstractC0714B = recyclerView.f1980l;
            if (abstractC0714B != null) {
                if (i2 == 4096) {
                    recyclerView.m1629i0(abstractC0714B.mo985a() - 1);
                    return true;
                }
                if (i2 != 8192) {
                    return true;
                }
                recyclerView.m1629i0(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo1580j(C0735X c0735x);

    /* JADX INFO: renamed from: j0 */
    public final void m2005j0(C0729Q c0729q) {
        for (int iM2014v = m2014v() - 1; iM2014v >= 0; iM2014v--) {
            if (!RecyclerView.m1586M(m2013u(iM2014v)).m2061o()) {
                View viewM2013u = m2013u(iM2014v);
                m2008m0(iM2014v);
                c0729q.m2027h(viewM2013u);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo1521k(C0735X c0735x);

    /* JADX INFO: renamed from: k0 */
    public final void m2006k0(C0729Q c0729q) {
        ArrayList arrayList;
        int size = c0729q.f2887a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = c0729q.f2887a;
            if (i2 < 0) {
                break;
            }
            View view = ((AbstractC0741b0) arrayList.get(i2)).f2931a;
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
            if (!abstractC0741b0M1586M.m2061o()) {
                abstractC0741b0M1586M.m2060n(false);
                if (abstractC0741b0M1586M.m2056j()) {
                    this.f2862b.removeDetachedView(view, false);
                }
                AbstractC0719G abstractC0719G = this.f2862b.f1944J;
                if (abstractC0719G != null) {
                    abstractC0719G.mo1980d(abstractC0741b0M1586M);
                }
                abstractC0741b0M1586M.m2060n(true);
                AbstractC0741b0 abstractC0741b0M1586M2 = RecyclerView.m1586M(view);
                abstractC0741b0M1586M2.f2944n = null;
                abstractC0741b0M1586M2.f2945o = false;
                abstractC0741b0M1586M2.f2940j &= -33;
                c0729q.m2028i(abstractC0741b0M1586M2);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0729q.f2888b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2862b.invalidate();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo1523l(C0735X c0735x);

    /* JADX INFO: renamed from: l0 */
    public final void m2007l0(View view, C0729Q c0729q) {
        C0742c c0742c = this.f2861a;
        C0713A c0713a = c0742c.f2950a;
        int i2 = c0742c.f2953d;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0742c.f2953d = 1;
            c0742c.f2954e = view;
            int iIndexOfChild = c0713a.f2845a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (c0742c.f2951b.m2044f(iIndexOfChild)) {
                    c0742c.m2072j(view);
                }
                c0713a.m1973h(iIndexOfChild);
            }
            c0742c.f2953d = 0;
            c0742c.f2954e = null;
            c0729q.m2027h(view);
        } catch (Throwable th) {
            c0742c.f2953d = 0;
            c0742c.f2954e = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo1581m(C0735X c0735x);

    /* JADX INFO: renamed from: m0 */
    public final void m2008m0(int i2) {
        if (m2013u(i2) != null) {
            C0742c c0742c = this.f2861a;
            C0713A c0713a = c0742c.f2950a;
            int i3 = c0742c.f2953d;
            if (i3 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i3 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iM2068f = c0742c.m2068f(i2);
                View childAt = c0713a.f2845a.getChildAt(iM2068f);
                if (childAt != null) {
                    c0742c.f2953d = 1;
                    c0742c.f2954e = childAt;
                    if (c0742c.f2951b.m2044f(iM2068f)) {
                        c0742c.m2072j(childAt);
                    }
                    c0713a.m1973h(iM2068f);
                }
                c0742c.f2953d = 0;
                c0742c.f2954e = null;
            } catch (Throwable th) {
                c0742c.f2953d = 0;
                c0742c.f2954e = null;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo1526n(C0735X c0735x);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX INFO: renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1721n0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int iM1999D = m1999D();
        int iM2001F = m2001F();
        int iM2000E = this.f2874n - m2000E();
        int iM1998C = this.f2875o - m1998C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i2 = left - iM1999D;
        int iMin = Math.min(0, i2);
        int i3 = top - iM2001F;
        int iMin2 = Math.min(0, i3);
        int i4 = iWidth - iM2000E;
        int iMax = Math.max(0, i4);
        int iMax2 = Math.max(0, iHeight - iM1998C);
        if (this.f2862b.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i2, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i4);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i3, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM1999D2 = m1999D();
                int iM2001F2 = m2001F();
                int iM2000E2 = this.f2874n - m2000E();
                int iM1998C2 = this.f2875o - m1998C();
                Rect rect2 = this.f2862b.f1974i;
                mo1722y(focusedChild, rect2);
                if (rect2.left - i5 < iM2000E2 && rect2.right - i5 > iM1999D2 && rect2.top - i6 < iM1998C2 && rect2.bottom - i6 > iM2001F2) {
                }
            }
        } else if (i5 != 0 || i6 != 0) {
            if (z2) {
                recyclerView.scrollBy(i5, i6);
                return true;
            }
            recyclerView.m1627h0(i5, i6, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo1528o(C0735X c0735x);

    /* JADX INFO: renamed from: o0 */
    public final void m2009o0() {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2010p(C0729Q c0729q) {
        for (int iM2014v = m2014v() - 1; iM2014v >= 0; iM2014v--) {
            View viewM2013u = m2013u(iM2014v);
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(viewM2013u);
            if (abstractC0741b0M1586M.m2061o()) {
                if (RecyclerView.f1926A0) {
                    Log.d("RecyclerView", "ignoring view " + abstractC0741b0M1586M);
                }
            } else if (!abstractC0741b0M1586M.m2052f() || abstractC0741b0M1586M.m2054h() || this.f2862b.f1980l.f2847b) {
                m2013u(iM2014v);
                this.f2861a.m2065c(iM2014v);
                c0729q.m2029j(viewM2013u);
                this.f2862b.f1970g.m291I(abstractC0741b0M1586M);
            } else {
                m2008m0(iM2014v);
                c0729q.m2028i(abstractC0741b0M1586M);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public abstract int mo1530p0(int i2, C0729Q c0729q, C0735X c0735x);

    /* JADX INFO: renamed from: q */
    public View mo1582q(int i2) {
        int iM2014v = m2014v();
        for (int i3 = 0; i3 < iM2014v; i3++) {
            View viewM2013u = m2013u(i3);
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(viewM2013u);
            if (abstractC0741b0M1586M != null && abstractC0741b0M1586M.m2048b() == i2 && !abstractC0741b0M1586M.m2061o() && (this.f2862b.f1967e0.f2910g || !abstractC0741b0M1586M.m2054h())) {
                return viewM2013u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public abstract void mo1583q0(int i2);

    /* JADX INFO: renamed from: r */
    public abstract C0724L mo1533r();

    /* JADX INFO: renamed from: r0 */
    public abstract int mo1534r0(int i2, C0729Q c0729q, C0735X c0735x);

    /* JADX INFO: renamed from: s */
    public C0724L mo1536s(Context context, AttributeSet attributeSet) {
        return new C0724L(context, attributeSet);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m2011s0(RecyclerView recyclerView) {
        m2012t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: t */
    public C0724L mo1538t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0724L ? new C0724L((C0724L) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0724L((ViewGroup.MarginLayoutParams) layoutParams) : new C0724L(layoutParams);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m2012t0(int i2, int i3) {
        this.f2874n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f2872l = mode;
        if (mode == 0 && !RecyclerView.f1929D0) {
            this.f2874n = 0;
        }
        this.f2875o = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f2873m = mode2;
        if (mode2 != 0 || RecyclerView.f1929D0) {
            return;
        }
        this.f2875o = 0;
    }

    /* JADX INFO: renamed from: u */
    public final View m2013u(int i2) {
        C0742c c0742c = this.f2861a;
        if (c0742c != null) {
            return c0742c.m2066d(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public void mo1540u0(Rect rect, int i2, int i3) {
        int iM2000E = m2000E() + m1999D() + rect.width();
        int iM1998C = m1998C() + m2001F() + rect.height();
        RecyclerView recyclerView = this.f2862b;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        this.f2862b.setMeasuredDimension(m1993g(i2, iM2000E, recyclerView.getMinimumWidth()), m1993g(i3, iM1998C, this.f2862b.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: v */
    public final int m2014v() {
        C0742c c0742c = this.f2861a;
        if (c0742c != null) {
            return c0742c.m2067e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m2015v0(int i2, int i3) {
        int iM2014v = m2014v();
        if (iM2014v == 0) {
            this.f2862b.m1640q(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < iM2014v; i8++) {
            View viewM2013u = m2013u(i8);
            Rect rect = this.f2862b.f1974i;
            mo1722y(viewM2013u, rect);
            int i9 = rect.left;
            if (i9 < i6) {
                i6 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i7) {
                i7 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i5) {
                i5 = i12;
            }
        }
        this.f2862b.f1974i.set(i6, i7, i4, i5);
        mo1540u0(this.f2862b.f1974i, i2, i3);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m2016w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2862b = null;
            this.f2861a = null;
            this.f2874n = 0;
            this.f2875o = 0;
        } else {
            this.f2862b = recyclerView;
            this.f2861a = recyclerView.f1968f;
            this.f2874n = recyclerView.getWidth();
            this.f2875o = recyclerView.getHeight();
        }
        this.f2872l = 1073741824;
        this.f2873m = 1073741824;
    }

    /* JADX INFO: renamed from: x */
    public int mo1541x(C0729Q c0729q, C0735X c0735x) {
        RecyclerView recyclerView = this.f2862b;
        if (recyclerView == null || recyclerView.f1980l == null || !mo1571d()) {
            return 1;
        }
        return this.f2862b.f1980l.mo985a();
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m2017x0(View view, int i2, int i3, C0724L c0724l) {
        return (!view.isLayoutRequested() && this.f2868h && m1991M(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) c0724l).width) && m1991M(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) c0724l).height)) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public void mo1722y(View view, Rect rect) {
        boolean z2 = RecyclerView.f1934z0;
        C0724L c0724l = (C0724L) view.getLayoutParams();
        Rect rect2 = c0724l.f2877b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0724l).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0724l).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0724l).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0724l).bottomMargin);
    }

    /* JADX INFO: renamed from: y0 */
    public boolean mo1584y0() {
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m2018z0(View view, int i2, int i3, C0724L c0724l) {
        return (this.f2868h && m1991M(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) c0724l).width) && m1991M(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) c0724l).height)) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    public void mo1720R(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: f0 */
    public void mo1574f0(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: h0 */
    public void mo1682h0(int i2) {
    }

    /* JADX INFO: renamed from: Q */
    public void mo1666Q() {
    }

    /* JADX INFO: renamed from: Z */
    public void mo1509Z() {
    }

    /* JADX INFO: renamed from: Y */
    public void mo1508Y(int i2, int i3) {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo1510a0(int i2, int i3) {
    }

    /* JADX INFO: renamed from: b0 */
    public void mo1511b0(int i2, int i3) {
    }

    /* JADX INFO: renamed from: c0 */
    public void mo1512c0(int i2, int i3) {
    }

    /* JADX INFO: renamed from: i */
    public void mo1579i(int i2, C0763n c0763n) {
    }

    /* JADX INFO: renamed from: h */
    public void mo1578h(int i2, int i3, C0735X c0735x, C0763n c0763n) {
    }
}
