package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractC0529T;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.reddit.frontpage.R;
import p004C.RunnableC0020a;
import p066g0.AbstractC0723K;
import p066g0.C0724L;
import p066g0.C0729Q;
import p066g0.C0735X;
import p066g0.C0774y;
import p066g0.InterfaceC0734W;
import p079n0.AbstractC1013a;
import p094v0.C1071b;
import p094v0.C1072c;
import p094v0.C1074e;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0723K implements InterfaceC0734W {

    /* JADX INFO: renamed from: p */
    public final C1074e f2160p;

    /* JADX INFO: renamed from: q */
    public C1072c f2161q;

    /* JADX INFO: renamed from: r */
    public final View.OnLayoutChangeListener f2162r;

    public CarouselLayoutManager() {
        C1074e c1074e = new C1074e();
        new C1071b();
        this.f2162r = new View.OnLayoutChangeListener() { // from class: v0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = this.f4426a;
                if (i2 == i6 && i3 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new RunnableC0020a(12, carouselLayoutManager));
            }
        };
        this.f2160p = c1074e;
        m2009o0();
        m1719F0(0);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: A0 */
    public final void mo1542A0(RecyclerView recyclerView, int i2) {
        C0774y c0774y = new C0774y(this, recyclerView.getContext(), 1);
        c0774y.f3125a = i2;
        m1997B0(c0774y);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m1717D0() {
        return this.f2161q.f4429a == 0;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m1718E0() {
        return m1717D0() && this.f2862b.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m1719F0(int i2) {
        C1072c c1072c;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("invalid orientation:", i2));
        }
        mo1569c(null);
        C1072c c1072c2 = this.f2161q;
        if (c1072c2 == null || i2 != c1072c2.f4429a) {
            if (i2 == 0) {
                c1072c = new C1072c(this, 1);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c1072c = new C1072c(this, 0);
            }
            this.f2161q = c1072c;
            m2009o0();
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: K */
    public final boolean mo1549K() {
        return true;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: R */
    public final void mo1720R(RecyclerView recyclerView) {
        C1074e c1074e = this.f2160p;
        Context context = recyclerView.getContext();
        float dimension = c1074e.f4432a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.resc);
        }
        c1074e.f4432a = dimension;
        float dimension2 = c1074e.f4433b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.resc);
        }
        c1074e.f4433b = dimension2;
        m2009o0();
        recyclerView.addOnLayoutChangeListener(this.f2162r);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: S */
    public final void mo1558S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2162r);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1503T(View view, int i2, C0729Q c0729q, C0735X c0735x) {
        byte b;
        if (m2014v() == 0) {
            return null;
        }
        int i3 = this.f2161q.f4429a;
        if (i2 == 1) {
            b = -1;
        } else if (i2 == 2) {
            b = 1;
        } else if (i2 == 17) {
            if (i3 == 0) {
                if (m1718E0()) {
                }
            }
            b = -2147483648;
        } else if (i2 != 33) {
            if (i2 != 66) {
                if (i2 != 130) {
                    Log.d("CarouselLayoutManager", "Unknown focus request:" + i2);
                } else if (i3 == 1) {
                }
                b = -2147483648;
            } else {
                if (i3 == 0) {
                    if (m1718E0()) {
                    }
                }
                b = -2147483648;
            }
        } else if (i3 != 1) {
            b = -2147483648;
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (AbstractC0723K.m1989G(view) == 0) {
                return null;
            }
            int iM1989G = AbstractC0723K.m1989G(m2013u(0)) - 1;
            if (iM1989G < 0 || iM1989G >= m1996B()) {
                return m2013u(m1718E0() ? m2014v() - 1 : 0);
            }
            this.f2161q.m2649a();
            throw null;
        }
        if (AbstractC0723K.m1989G(view) == m1996B() - 1) {
            return null;
        }
        int iM1989G2 = AbstractC0723K.m1989G(m2013u(m2014v() - 1)) + 1;
        if (iM1989G2 < 0 || iM1989G2 >= m1996B()) {
            return m2013u(m1718E0() ? 0 : m2014v() - 1);
        }
        this.f2161q.m2649a();
        throw null;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: U */
    public final void mo1561U(AccessibilityEvent accessibilityEvent) {
        super.mo1561U(accessibilityEvent);
        if (m2014v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0723K.m1989G(m2013u(0)));
            accessibilityEvent.setToIndex(AbstractC0723K.m1989G(m2013u(m2014v() - 1)));
        }
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: Y */
    public final void mo1508Y(int i2, int i3) {
        m1996B();
    }

    @Override // p066g0.InterfaceC0734W
    /* JADX INFO: renamed from: a */
    public final PointF mo1566a(int i2) {
        return null;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: b0 */
    public final void mo1511b0(int i2, int i3) {
        m1996B();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: d */
    public final boolean mo1571d() {
        return m1717D0();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: d0 */
    public final void mo1513d0(C0729Q c0729q, C0735X c0735x) {
        if (c0735x.m2035b() > 0) {
            if ((m1717D0() ? this.f2874n : this.f2875o) > 0.0f) {
                m1718E0();
                View view = c0729q.m2030k(0, Long.MAX_VALUE).f2931a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m2005j0(c0729q);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: e */
    public final boolean mo1572e() {
        return !m1717D0();
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: e0 */
    public final void mo1515e0(C0735X c0735x) {
        if (m2014v() == 0) {
            return;
        }
        AbstractC0723K.m1989G(m2013u(0));
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: j */
    public final int mo1580j(C0735X c0735x) {
        m2014v();
        return 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: k */
    public final int mo1521k(C0735X c0735x) {
        return 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: l */
    public final int mo1523l(C0735X c0735x) {
        return 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: m */
    public final int mo1581m(C0735X c0735x) {
        m2014v();
        return 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: n */
    public final int mo1526n(C0735X c0735x) {
        return 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: n0 */
    public final boolean mo1721n0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: o */
    public final int mo1528o(C0735X c0735x) {
        return 0;
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: p0 */
    public final int mo1530p0(int i2, C0729Q c0729q, C0735X c0735x) {
        if (!m1717D0() || m2014v() == 0 || i2 == 0) {
            return 0;
        }
        View view = c0729q.m2030k(0, Long.MAX_VALUE).f2931a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: q0 */
    public final void mo1583q0(int i2) {
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: r */
    public final C0724L mo1533r() {
        return new C0724L(-2, -2);
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: r0 */
    public final int mo1534r0(int i2, C0729Q c0729q, C0735X c0735x) {
        if (!mo1572e() || m2014v() == 0 || i2 == 0) {
            return 0;
        }
        View view = c0729q.m2030k(0, Long.MAX_VALUE).f2931a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p066g0.AbstractC0723K
    /* JADX INFO: renamed from: y */
    public final void mo1722y(View view, Rect rect) {
        super.mo1722y(view, rect);
        rect.centerY();
        if (m1717D0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        new C1071b();
        this.f2162r = new View.OnLayoutChangeListener() { // from class: v0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i32, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = this.f4426a;
                if (i22 == i6 && i32 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new RunnableC0020a(12, carouselLayoutManager));
            }
        };
        this.f2160p = new C1074e();
        m2009o0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4021c);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m2009o0();
            m1719F0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
