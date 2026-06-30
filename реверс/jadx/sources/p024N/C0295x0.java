package p024N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p009F.C0076c;

/* JADX INFO: renamed from: N.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0295x0 {

    /* JADX INFO: renamed from: b */
    public static final C0295x0 f881b;

    /* JADX INFO: renamed from: a */
    public final C0291v0 f882a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f881b = C0289u0.f876q;
        } else {
            f881b = C0291v0.f877b;
        }
    }

    public C0295x0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f882a = new C0289u0(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f882a = new C0287t0(this, windowInsets);
        } else if (i2 >= 28) {
            this.f882a = new C0285s0(this, windowInsets);
        } else {
            this.f882a = new C0283r0(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0076c m919e(C0076c c0076c, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, c0076c.f238a - i2);
        int iMax2 = Math.max(0, c0076c.f239b - i3);
        int iMax3 = Math.max(0, c0076c.f240c - i4);
        int iMax4 = Math.max(0, c0076c.f241d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? c0076c : C0076c.m359b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: g */
    public static C0295x0 m920g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0295x0 c0295x0 = new C0295x0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            C0295x0 c0295x0M777h = AbstractC0240S.m777h(view);
            C0291v0 c0291v0 = c0295x0.f882a;
            c0291v0.mo901p(c0295x0M777h);
            c0291v0.mo895d(view.getRootView());
        }
        return c0295x0;
    }

    /* JADX INFO: renamed from: a */
    public final int m921a() {
        return this.f882a.mo897j().f241d;
    }

    /* JADX INFO: renamed from: b */
    public final int m922b() {
        return this.f882a.mo897j().f238a;
    }

    /* JADX INFO: renamed from: c */
    public final int m923c() {
        return this.f882a.mo897j().f240c;
    }

    /* JADX INFO: renamed from: d */
    public final int m924d() {
        return this.f882a.mo897j().f239b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0295x0)) {
            return false;
        }
        return Objects.equals(this.f882a, ((C0295x0) obj).f882a);
    }

    /* JADX INFO: renamed from: f */
    public final WindowInsets m925f() {
        C0291v0 c0291v0 = this.f882a;
        if (c0291v0 instanceof AbstractC0281q0) {
            return ((AbstractC0281q0) c0291v0).f864c;
        }
        return null;
    }

    public final int hashCode() {
        C0291v0 c0291v0 = this.f882a;
        if (c0291v0 == null) {
            return 0;
        }
        return c0291v0.hashCode();
    }

    public C0295x0() {
        this.f882a = new C0291v0(this);
    }
}
