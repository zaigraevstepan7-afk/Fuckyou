package p036T;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import p023M0.RunnableC0191D;
import p024N.AbstractC0240S;
import p074l.C0980x0;

/* JADX INFO: renamed from: T.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0377g implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f1022r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public final C0371a f1023a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f1024b;

    /* JADX INFO: renamed from: c */
    public final ListView f1025c;

    /* JADX INFO: renamed from: d */
    public RunnableC0191D f1026d;

    /* JADX INFO: renamed from: e */
    public final float[] f1027e;

    /* JADX INFO: renamed from: f */
    public final float[] f1028f;

    /* JADX INFO: renamed from: g */
    public final int f1029g;

    /* JADX INFO: renamed from: h */
    public final int f1030h;

    /* JADX INFO: renamed from: i */
    public final float[] f1031i;

    /* JADX INFO: renamed from: j */
    public final float[] f1032j;

    /* JADX INFO: renamed from: k */
    public final float[] f1033k;

    /* JADX INFO: renamed from: l */
    public boolean f1034l;

    /* JADX INFO: renamed from: m */
    public boolean f1035m;

    /* JADX INFO: renamed from: n */
    public boolean f1036n;

    /* JADX INFO: renamed from: o */
    public boolean f1037o;

    /* JADX INFO: renamed from: p */
    public boolean f1038p;

    /* JADX INFO: renamed from: q */
    public final C0980x0 f1039q;

    public ViewOnTouchListenerC0377g(C0980x0 c0980x0) {
        C0371a c0371a = new C0371a();
        c0371a.f1017e = Long.MIN_VALUE;
        c0371a.f1019g = -1L;
        c0371a.f1018f = 0L;
        this.f1023a = c0371a;
        this.f1024b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1027e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1028f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1031i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1032j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1033k = fArr5;
        this.f1025c = c0980x0;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f1029g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1030h = f1022r;
        c0371a.f1013a = 500;
        c0371a.f1014b = 500;
        this.f1039q = c0980x0;
    }

    /* JADX INFO: renamed from: b */
    public static float m1016b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m1017a(int i2, float f, float f2, float f3) {
        float fM1016b;
        float interpolation;
        float fM1016b2 = m1016b(this.f1027e[i2] * f2, 0.0f, this.f1028f[i2]);
        float fM1018c = m1018c(f2 - f, fM1016b2) - m1018c(f, fM1016b2);
        AccelerateInterpolator accelerateInterpolator = this.f1024b;
        if (fM1018c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM1018c);
        } else {
            if (fM1018c <= 0.0f) {
                fM1016b = 0.0f;
                if (fM1016b != 0.0f) {
                    return 0.0f;
                }
                float f4 = this.f1031i[i2];
                float f5 = this.f1032j[i2];
                float f6 = this.f1033k[i2];
                float f7 = f4 * f3;
                return fM1016b > 0.0f ? m1016b(fM1016b * f7, f5, f6) : -m1016b((-fM1016b) * f7, f5, f6);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM1018c);
        }
        fM1016b = m1016b(interpolation, -1.0f, 1.0f);
        if (fM1016b != 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m1018c(float f, float f2) {
        if (f2 != 0.0f) {
            int i2 = this.f1029g;
            if (i2 == 0 || i2 == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f1037o && i2 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i2 == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m1019d() {
        int i2 = 0;
        if (this.f1035m) {
            this.f1037o = false;
            return;
        }
        C0371a c0371a = this.f1023a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - c0371a.f1017e);
        int i4 = c0371a.f1014b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        c0371a.f1021i = i2;
        c0371a.f1020h = c0371a.m1002a(jCurrentAnimationTimeMillis);
        c0371a.f1019g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1020e() {
        C0980x0 c0980x0;
        int count;
        C0371a c0371a = this.f1023a;
        float f = c0371a.f1016d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0371a.f1015c);
        if (iAbs != 0 && (count = (c0980x0 = this.f1039q).getCount()) != 0) {
            int childCount = c0980x0.getChildCount();
            int firstVisiblePosition = c0980x0.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0980x0.getChildAt(0).getTop() >= 0)) : !(i2 >= count && c0980x0.getChildAt(childCount - 1).getBottom() <= c0980x0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r1 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        if (this.f1038p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m1019d();
                return false;
            }
            this.f1036n = true;
            this.f1034l = false;
            float x2 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f1025c;
            float fM1017a = m1017a(0, x2, width, listView.getWidth());
            float fM1017a2 = m1017a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            C0371a c0371a = this.f1023a;
            c0371a.f1015c = fM1017a;
            c0371a.f1016d = fM1017a2;
            if (!this.f1037o && m1020e()) {
                if (this.f1026d == null) {
                    this.f1026d = new RunnableC0191D(1, this);
                }
                this.f1037o = true;
                this.f1035m = true;
                if (this.f1034l || (i2 = this.f1030h) <= 0) {
                    this.f1026d.run();
                } else {
                    RunnableC0191D runnableC0191D = this.f1026d;
                    long j2 = i2;
                    WeakHashMap weakHashMap = AbstractC0240S.f777a;
                    listView.postOnAnimationDelayed(runnableC0191D, j2);
                }
                this.f1034l = true;
            }
        }
        return false;
    }
}
