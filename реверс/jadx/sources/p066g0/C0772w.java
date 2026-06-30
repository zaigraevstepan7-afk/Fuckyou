package p066g0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: g0.w */
/* JADX INFO: loaded from: classes.dex */
public class C0772w {

    /* JADX INFO: renamed from: a */
    public int f3125a = -1;

    /* JADX INFO: renamed from: b */
    public RecyclerView f3126b;

    /* JADX INFO: renamed from: c */
    public AbstractC0723K f3127c;

    /* JADX INFO: renamed from: d */
    public boolean f3128d;

    /* JADX INFO: renamed from: e */
    public boolean f3129e;

    /* JADX INFO: renamed from: f */
    public View f3130f;

    /* JADX INFO: renamed from: g */
    public final C0733V f3131g;

    /* JADX INFO: renamed from: h */
    public boolean f3132h;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f3133i;

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f3134j;

    /* JADX INFO: renamed from: k */
    public PointF f3135k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f3136l;

    /* JADX INFO: renamed from: m */
    public boolean f3137m;

    /* JADX INFO: renamed from: n */
    public float f3138n;

    /* JADX INFO: renamed from: o */
    public int f3139o;

    /* JADX INFO: renamed from: p */
    public int f3140p;

    public C0772w(Context context) {
        C0733V c0733v = new C0733V();
        c0733v.f2900d = -1;
        c0733v.f2902f = false;
        c0733v.f2903g = 0;
        c0733v.f2897a = 0;
        c0733v.f2898b = 0;
        c0733v.f2899c = Integer.MIN_VALUE;
        c0733v.f2901e = null;
        this.f3131g = c0733v;
        this.f3133i = new LinearInterpolator();
        this.f3134j = new DecelerateInterpolator();
        this.f3137m = false;
        this.f3139o = 0;
        this.f3140p = 0;
        this.f3136l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: a */
    public static int m2109a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int mo2110b(View view, int i2) {
        AbstractC0723K abstractC0723K = this.f3127c;
        if (abstractC0723K == null || !abstractC0723K.mo1571d()) {
            return 0;
        }
        C0724L c0724l = (C0724L) view.getLayoutParams();
        return m2109a((view.getLeft() - ((C0724L) view.getLayoutParams()).f2877b.left) - ((ViewGroup.MarginLayoutParams) c0724l).leftMargin, view.getRight() + ((C0724L) view.getLayoutParams()).f2877b.right + ((ViewGroup.MarginLayoutParams) c0724l).rightMargin, abstractC0723K.m1999D(), abstractC0723K.f2874n - abstractC0723K.m2000E(), i2);
    }

    /* JADX INFO: renamed from: c */
    public int mo2111c(View view, int i2) {
        AbstractC0723K abstractC0723K = this.f3127c;
        if (abstractC0723K == null || !abstractC0723K.mo1572e()) {
            return 0;
        }
        C0724L c0724l = (C0724L) view.getLayoutParams();
        return m2109a((view.getTop() - ((C0724L) view.getLayoutParams()).f2877b.top) - ((ViewGroup.MarginLayoutParams) c0724l).topMargin, view.getBottom() + ((C0724L) view.getLayoutParams()).f2877b.bottom + ((ViewGroup.MarginLayoutParams) c0724l).bottomMargin, abstractC0723K.m2001F(), abstractC0723K.f2875o - abstractC0723K.m1998C(), i2);
    }

    /* JADX INFO: renamed from: d */
    public float mo1748d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: e */
    public int mo2112e(int i2) {
        float fAbs = Math.abs(i2);
        if (!this.f3137m) {
            this.f3138n = mo1748d(this.f3136l);
            this.f3137m = true;
        }
        return (int) Math.ceil(fAbs * this.f3138n);
    }

    /* JADX INFO: renamed from: f */
    public PointF mo2113f(int i2) {
        Object obj = this.f3127c;
        if (obj instanceof InterfaceC0734W) {
            return ((InterfaceC0734W) obj).mo1566a(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0734W.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2114g(int i2, int i3) {
        PointF pointFMo2113f;
        RecyclerView recyclerView = this.f3126b;
        if (this.f3125a == -1 || recyclerView == null) {
            m2116i();
        }
        if (this.f3128d && this.f3130f == null && this.f3127c != null && (pointFMo2113f = mo2113f(this.f3125a)) != null) {
            float f = pointFMo2113f.x;
            if (f != 0.0f || pointFMo2113f.y != 0.0f) {
                recyclerView.m1623e0((int) Math.signum(f), (int) Math.signum(pointFMo2113f.y), null);
            }
        }
        this.f3128d = false;
        View view = this.f3130f;
        C0733V c0733v = this.f3131g;
        if (view != null) {
            this.f3126b.getClass();
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
            if ((abstractC0741b0M1586M != null ? abstractC0741b0M1586M.m2048b() : -1) == this.f3125a) {
                View view2 = this.f3130f;
                C0735X c0735x = recyclerView.f1967e0;
                mo2115h(view2, c0733v);
                c0733v.m2033a(recyclerView);
                m2116i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3130f = null;
            }
        }
        if (this.f3129e) {
            C0735X c0735x2 = recyclerView.f1967e0;
            if (this.f3126b.f1982m.m2014v() == 0) {
                m2116i();
            } else {
                int i4 = this.f3139o;
                int i5 = i4 - i2;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.f3139o = i5;
                int i6 = this.f3140p;
                int i7 = i6 - i3;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f3140p = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF pointFMo2113f2 = mo2113f(this.f3125a);
                    if (pointFMo2113f2 != null) {
                        if (pointFMo2113f2.x == 0.0f && pointFMo2113f2.y == 0.0f) {
                            c0733v.f2900d = this.f3125a;
                            m2116i();
                        } else {
                            float f2 = pointFMo2113f2.y;
                            float fSqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = pointFMo2113f2.x / fSqrt;
                            pointFMo2113f2.x = f3;
                            float f4 = pointFMo2113f2.y / fSqrt;
                            pointFMo2113f2.y = f4;
                            this.f3135k = pointFMo2113f2;
                            this.f3139o = (int) (f3 * 10000.0f);
                            this.f3140p = (int) (f4 * 10000.0f);
                            int iMo2112e = mo2112e(10000);
                            LinearInterpolator linearInterpolator = this.f3133i;
                            c0733v.f2897a = (int) (this.f3139o * 1.2f);
                            c0733v.f2898b = (int) (this.f3140p * 1.2f);
                            c0733v.f2899c = (int) (iMo2112e * 1.2f);
                            c0733v.f2901e = linearInterpolator;
                            c0733v.f2902f = true;
                        }
                    }
                }
            }
            boolean z2 = c0733v.f2900d >= 0;
            c0733v.m2033a(recyclerView);
            if (z2 && this.f3129e) {
                this.f3128d = true;
                recyclerView.f1961b0.m2037b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2115h(View view, C0733V c0733v) {
        int i2;
        PointF pointF = this.f3135k;
        int i3 = 0;
        if (pointF != null) {
            float f = pointF.x;
            i2 = f == 0.0f ? 0 : f > 0.0f ? 1 : -1;
        }
        int iMo2110b = mo2110b(view, i2);
        PointF pointF2 = this.f3135k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i3 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iMo2111c = mo2111c(view, i3);
        int iCeil = (int) Math.ceil(((double) mo2112e((int) Math.sqrt((iMo2111c * iMo2111c) + (iMo2110b * iMo2110b)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f3134j;
            c0733v.f2897a = -iMo2110b;
            c0733v.f2898b = -iMo2111c;
            c0733v.f2899c = iCeil;
            c0733v.f2901e = decelerateInterpolator;
            c0733v.f2902f = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2116i() {
        if (this.f3129e) {
            this.f3129e = false;
            this.f3140p = 0;
            this.f3139o = 0;
            this.f3135k = null;
            this.f3126b.f1967e0.f2904a = -1;
            this.f3130f = null;
            this.f3125a = -1;
            this.f3128d = false;
            AbstractC0723K abstractC0723K = this.f3127c;
            if (abstractC0723K.f2865e == this) {
                abstractC0723K.f2865e = null;
            }
            this.f3127c = null;
            this.f3126b = null;
        }
    }
}
