package p024N;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p005C0.C0048n;
import p009F.C0076c;
import p018K.RunnableC0158n;

/* JADX INFO: renamed from: N.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0259f0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final C0254d f811a;

    /* JADX INFO: renamed from: b */
    public C0295x0 f812b;

    public ViewOnApplyWindowInsetsListenerC0259f0(View view, C0254d c0254d) {
        C0295x0 c0295x0Mo868b;
        this.f811a = c0254d;
        C0295x0 c0295x0M777h = AbstractC0240S.m777h(view);
        if (c0295x0M777h != null) {
            int i2 = Build.VERSION.SDK_INT;
            c0295x0Mo868b = (i2 >= 30 ? new C0277o0(c0295x0M777h) : i2 >= 29 ? new C0275n0(c0295x0M777h) : new C0273m0(c0295x0M777h)).mo868b();
        } else {
            c0295x0Mo868b = null;
        }
        this.f812b = c0295x0Mo868b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0291v0 c0291v0;
        if (!view.isLaidOut()) {
            this.f812b = C0295x0.m920g(view, windowInsets);
            return C0261g0.m824i(view, windowInsets);
        }
        C0295x0 c0295x0M920g = C0295x0.m920g(view, windowInsets);
        if (this.f812b == null) {
            this.f812b = AbstractC0240S.m777h(view);
        }
        if (this.f812b == null) {
            this.f812b = c0295x0M920g;
            return C0261g0.m824i(view, windowInsets);
        }
        C0254d c0254dM825j = C0261g0.m825j(view);
        if (c0254dM825j != null && Objects.equals((WindowInsets) c0254dM825j.f797b, windowInsets)) {
            return C0261g0.m824i(view, windowInsets);
        }
        C0295x0 c0295x0 = this.f812b;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            c0291v0 = c0295x0M920g.f882a;
            if (i2 > 256) {
                break;
            }
            if (!c0291v0.mo896f(i2).equals(c0295x0.f882a.mo896f(i2))) {
                i3 |= i2;
            }
            i2 <<= 1;
        }
        if (i3 == 0) {
            return C0261g0.m824i(view, windowInsets);
        }
        C0295x0 c0295x02 = this.f812b;
        C0269k0 c0269k0 = new C0269k0(i3, (i3 & 8) != 0 ? c0291v0.mo896f(8).f241d > c0295x02.f882a.mo896f(8).f241d ? C0261g0.f821e : C0261g0.f822f : C0261g0.f823g, 160L);
        c0269k0.f834a.mo836d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0269k0.f834a.mo833a());
        C0076c c0076cMo896f = c0291v0.mo896f(i3);
        C0076c c0076cMo896f2 = c0295x02.f882a.mo896f(i3);
        int iMin = Math.min(c0076cMo896f.f238a, c0076cMo896f2.f238a);
        int i4 = c0076cMo896f.f239b;
        int i5 = c0076cMo896f2.f239b;
        int iMin2 = Math.min(i4, i5);
        int i6 = c0076cMo896f.f240c;
        int i7 = c0076cMo896f2.f240c;
        int iMin3 = Math.min(i6, i7);
        int i8 = c0076cMo896f.f241d;
        int i9 = c0076cMo896f2.f241d;
        int i10 = i3;
        C0048n c0048n = new C0048n(C0076c.m359b(iMin, iMin2, iMin3, Math.min(i8, i9)), 3, C0076c.m359b(Math.max(c0076cMo896f.f238a, c0076cMo896f2.f238a), Math.max(i4, i5), Math.max(i6, i7), Math.max(i8, i9)));
        C0261g0.m821f(view, windowInsets, false);
        duration.addUpdateListener(new C0255d0(c0269k0, c0295x0M920g, c0295x02, i10, view));
        duration.addListener(new C0257e0(c0269k0, view));
        ViewTreeObserverOnPreDrawListenerC0288u.m914a(view, new RunnableC0158n(view, c0269k0, c0048n, duration));
        this.f812b = c0295x0M920g;
        return C0261g0.m824i(view, windowInsets);
    }
}
