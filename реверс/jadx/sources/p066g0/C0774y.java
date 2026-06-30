package p066g0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: g0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0774y extends C0772w {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f3142q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f3143r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0774y(Object obj, Context context, int i2) {
        super(context);
        this.f3142q = i2;
        this.f3143r = obj;
    }

    @Override // p066g0.C0772w
    /* JADX INFO: renamed from: b */
    public int mo2110b(View view, int i2) {
        switch (this.f3142q) {
            case 1:
                ((CarouselLayoutManager) this.f3143r).getClass();
                return 0;
            default:
                return super.mo2110b(view, i2);
        }
    }

    @Override // p066g0.C0772w
    /* JADX INFO: renamed from: c */
    public int mo2111c(View view, int i2) {
        switch (this.f3142q) {
            case 1:
                ((CarouselLayoutManager) this.f3143r).getClass();
                return 0;
            default:
                return super.mo2111c(view, i2);
        }
    }

    @Override // p066g0.C0772w
    /* JADX INFO: renamed from: d */
    public float mo1748d(DisplayMetrics displayMetrics) {
        switch (this.f3142q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo1748d(displayMetrics);
        }
    }

    @Override // p066g0.C0772w
    /* JADX INFO: renamed from: e */
    public int mo2112e(int i2) {
        switch (this.f3142q) {
            case 0:
                return Math.min(100, super.mo2112e(i2));
            default:
                return super.mo2112e(i2);
        }
    }

    @Override // p066g0.C0772w
    /* JADX INFO: renamed from: f */
    public PointF mo2113f(int i2) {
        switch (this.f3142q) {
            case 1:
                ((CarouselLayoutManager) this.f3143r).getClass();
                return null;
            default:
                return super.mo2113f(i2);
        }
    }

    @Override // p066g0.C0772w
    /* JADX INFO: renamed from: h */
    public void mo2115h(View view, C0733V c0733v) {
        switch (this.f3142q) {
            case 0:
                C0775z c0775z = (C0775z) this.f3143r;
                int[] iArrM2119a = c0775z.m2119a(c0775z.f3144a.getLayoutManager(), view);
                int i2 = iArrM2119a[0];
                int i3 = iArrM2119a[1];
                int iCeil = (int) Math.ceil(((double) mo2112e(Math.max(Math.abs(i2), Math.abs(i3)))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f3134j;
                    c0733v.f2897a = i2;
                    c0733v.f2898b = i3;
                    c0733v.f2899c = iCeil;
                    c0733v.f2901e = decelerateInterpolator;
                    c0733v.f2902f = true;
                }
                break;
            default:
                super.mo2115h(view, c0733v);
                break;
        }
    }
}
