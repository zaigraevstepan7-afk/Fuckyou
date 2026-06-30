package p066g0;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p024N.AbstractC0240S;
import p042W.InterpolatorC0403d;

/* JADX INFO: renamed from: g0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0739a0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f2921a;

    /* JADX INFO: renamed from: b */
    public int f2922b;

    /* JADX INFO: renamed from: c */
    public OverScroller f2923c;

    /* JADX INFO: renamed from: d */
    public Interpolator f2924d;

    /* JADX INFO: renamed from: e */
    public boolean f2925e;

    /* JADX INFO: renamed from: f */
    public boolean f2926f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f2927g;

    public RunnableC0739a0(RecyclerView recyclerView) {
        this.f2927g = recyclerView;
        InterpolatorC0403d interpolatorC0403d = RecyclerView.f1932G0;
        this.f2924d = interpolatorC0403d;
        this.f2925e = false;
        this.f2926f = false;
        this.f2923c = new OverScroller(recyclerView.getContext(), interpolatorC0403d);
    }

    /* JADX INFO: renamed from: a */
    public final void m2036a(int i2, int i3) {
        RecyclerView recyclerView = this.f2927g;
        recyclerView.setScrollState(2);
        this.f2922b = 0;
        this.f2921a = 0;
        Interpolator interpolator = this.f2924d;
        InterpolatorC0403d interpolatorC0403d = RecyclerView.f1932G0;
        if (interpolator != interpolatorC0403d) {
            this.f2924d = interpolatorC0403d;
            this.f2923c = new OverScroller(recyclerView.getContext(), interpolatorC0403d);
        }
        this.f2923c.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m2037b();
    }

    /* JADX INFO: renamed from: b */
    public final void m2037b() {
        if (this.f2925e) {
            this.f2926f = true;
            return;
        }
        RecyclerView recyclerView = this.f2927g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m2038c(int i2, int i3, int i4, Interpolator interpolator) {
        RecyclerView recyclerView = this.f2927g;
        if (i4 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z2 = iAbs > iAbs2;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                iAbs = iAbs2;
            }
            i4 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i5 = i4;
        if (interpolator == null) {
            interpolator = RecyclerView.f1932G0;
        }
        if (this.f2924d != interpolator) {
            this.f2924d = interpolator;
            this.f2923c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2922b = 0;
        this.f2921a = 0;
        recyclerView.setScrollState(2);
        this.f2923c.startScroll(0, 0, i2, i3, i5);
        if (Build.VERSION.SDK_INT < 23) {
            this.f2923c.computeScrollOffset();
        }
        m2037b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f2927g;
        if (recyclerView.f1982m == null) {
            recyclerView.removeCallbacks(this);
            this.f2923c.abortAnimation();
            return;
        }
        this.f2926f = false;
        this.f2925e = true;
        recyclerView.m1639p();
        OverScroller overScroller = this.f2923c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f2921a;
            int i7 = currY - this.f2922b;
            this.f2921a = currX;
            this.f2922b = currY;
            int iM1594o = RecyclerView.m1594o(i6, recyclerView.f1940F, recyclerView.f1942H, recyclerView.getWidth());
            int iM1594o2 = RecyclerView.m1594o(i7, recyclerView.f1941G, recyclerView.f1943I, recyclerView.getHeight());
            int[] iArr = recyclerView.f1991q0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zM1644u = recyclerView.m1644u(iM1594o, iM1594o2, 1, iArr, null);
            int[] iArr2 = recyclerView.f1991q0;
            if (zM1644u) {
                iM1594o -= iArr2[0];
                iM1594o2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1637n(iM1594o, iM1594o2);
            }
            if (recyclerView.f1980l != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m1623e0(iM1594o, iM1594o2, iArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[1];
                int i10 = iM1594o - i8;
                int i11 = iM1594o2 - i9;
                C0772w c0772w = recyclerView.f1982m.f2865e;
                if (c0772w != null && !c0772w.f3128d && c0772w.f3129e) {
                    int iM2035b = recyclerView.f1967e0.m2035b();
                    if (iM2035b == 0) {
                        c0772w.m2116i();
                    } else if (c0772w.f3125a >= iM2035b) {
                        c0772w.f3125a = iM2035b - 1;
                        c0772w.m2114g(i8, i9);
                    } else {
                        c0772w.m2114g(i8, i9);
                    }
                }
                i2 = i10;
                i4 = i8;
                i3 = i11;
                i5 = i9;
            } else {
                i2 = iM1594o;
                i3 = iM1594o2;
                i4 = 0;
                i5 = 0;
            }
            if (!recyclerView.f1986o.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1991q0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m1645v(i4, i5, i2, i3, null, 1, iArr3);
            int i12 = i2 - iArr2[0];
            int i13 = i3 - iArr2[1];
            if (i4 != 0 || i5 != 0) {
                recyclerView.m1646w(i4, i5);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0772w c0772w2 = recyclerView.f1982m.f2865e;
            if ((c0772w2 == null || !c0772w2.f3128d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.m1648y();
                        if (recyclerView.f1940F.isFinished()) {
                            recyclerView.f1940F.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.m1649z();
                        if (recyclerView.f1942H.isFinished()) {
                            recyclerView.f1942H.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1595A();
                        if (recyclerView.f1941G.isFinished()) {
                            recyclerView.f1941G.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1647x();
                        if (recyclerView.f1943I.isFinished()) {
                            recyclerView.f1943I.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1930E0) {
                    C0763n c0763n = recyclerView.f1965d0;
                    int[] iArr4 = c0763n.f3077c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0763n.f3078d = 0;
                }
            } else {
                m2037b();
                RunnableC0765p runnableC0765p = recyclerView.f1963c0;
                if (runnableC0765p != null) {
                    runnableC0765p.m2101a(recyclerView, i4, i5);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC0716D.m1976a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        C0772w c0772w3 = recyclerView.f1982m.f2865e;
        if (c0772w3 != null && c0772w3.f3128d) {
            c0772w3.m2114g(0, 0);
        }
        this.f2925e = false;
        if (!this.f2926f) {
            recyclerView.setScrollState(0);
            recyclerView.m1636m0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            recyclerView.postOnAnimation(this);
        }
    }
}
