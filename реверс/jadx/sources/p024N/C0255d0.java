package p024N;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p009F.C0076c;

/* JADX INFO: renamed from: N.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0255d0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0269k0 f802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0295x0 f803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0295x0 f804c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f805d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f806e;

    public C0255d0(C0269k0 c0269k0, C0295x0 c0295x0, C0295x0 c0295x02, int i2, View view) {
        this.f802a = c0269k0;
        this.f803b = c0295x0;
        this.f804c = c0295x02;
        this.f805d = i2;
        this.f806e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int i2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0269k0 c0269k0 = this.f802a;
        c0269k0.f834a.mo836d(animatedFraction);
        float fMo834b = c0269k0.f834a.mo834b();
        PathInterpolator pathInterpolator = C0261g0.f821e;
        int i3 = Build.VERSION.SDK_INT;
        C0295x0 c0295x0 = this.f803b;
        AbstractC0279p0 c0277o0 = i3 >= 30 ? new C0277o0(c0295x0) : i3 >= 29 ? new C0275n0(c0295x0) : new C0273m0(c0295x0);
        int i4 = 1;
        while (i4 <= 256) {
            int i5 = this.f805d & i4;
            C0291v0 c0291v0 = c0295x0.f882a;
            if (i5 == 0) {
                c0277o0.mo887c(i4, c0291v0.mo896f(i4));
                f = fMo834b;
                i2 = 1;
            } else {
                C0076c c0076cMo896f = c0291v0.mo896f(i4);
                C0076c c0076cMo896f2 = this.f804c.f882a.mo896f(i4);
                float f2 = 1.0f - fMo834b;
                f = fMo834b;
                i2 = 1;
                c0277o0.mo887c(i4, C0295x0.m919e(c0076cMo896f, (int) (((double) ((c0076cMo896f.f238a - c0076cMo896f2.f238a) * f2)) + 0.5d), (int) (((double) ((c0076cMo896f.f239b - c0076cMo896f2.f239b) * f2)) + 0.5d), (int) (((double) ((c0076cMo896f.f240c - c0076cMo896f2.f240c) * f2)) + 0.5d), (int) (((double) ((c0076cMo896f.f241d - c0076cMo896f2.f241d) * f2)) + 0.5d)));
            }
            i4 <<= i2;
            fMo834b = f;
        }
        C0261g0.m822g(this.f806e, c0277o0.mo868b(), Collections.singletonList(c0269k0));
    }
}
