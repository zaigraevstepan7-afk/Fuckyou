package p024N;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p001A0.AbstractC0016e;
import p009F.C0076c;

/* JADX INFO: renamed from: N.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0281q0 extends C0291v0 {

    /* JADX INFO: renamed from: h */
    public static boolean f859h;

    /* JADX INFO: renamed from: i */
    public static Method f860i;

    /* JADX INFO: renamed from: j */
    public static Class f861j;

    /* JADX INFO: renamed from: k */
    public static Field f862k;

    /* JADX INFO: renamed from: l */
    public static Field f863l;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f864c;

    /* JADX INFO: renamed from: d */
    public C0076c[] f865d;

    /* JADX INFO: renamed from: e */
    public C0076c f866e;

    /* JADX INFO: renamed from: f */
    public C0295x0 f867f;

    /* JADX INFO: renamed from: g */
    public C0076c f868g;

    public AbstractC0281q0(C0295x0 c0295x0, WindowInsets windowInsets) {
        super(c0295x0);
        this.f866e = null;
        this.f864c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private C0076c m891r(int i2, boolean z2) {
        C0076c c0076cM358a = C0076c.f237e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                c0076cM358a = C0076c.m358a(c0076cM358a, m902s(i3, z2));
            }
        }
        return c0076cM358a;
    }

    /* JADX INFO: renamed from: t */
    private C0076c m892t() {
        C0295x0 c0295x0 = this.f867f;
        return c0295x0 != null ? c0295x0.f882a.mo906h() : C0076c.f237e;
    }

    /* JADX INFO: renamed from: u */
    private C0076c m893u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f859h) {
            m894v();
        }
        Method method = f860i;
        if (method != null && f861j != null && f862k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f862k.get(f863l.get(objInvoke));
                if (rect != null) {
                    return C0076c.m359b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: v */
    private static void m894v() {
        try {
            f860i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f861j = cls;
            f862k = cls.getDeclaredField("mVisibleInsets");
            f863l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f862k.setAccessible(true);
            f863l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f859h = true;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: d */
    public void mo895d(View view) {
        C0076c c0076cM893u = m893u(view);
        if (c0076cM893u == null) {
            c0076cM893u = C0076c.f237e;
        }
        m903w(c0076cM893u);
    }

    @Override // p024N.C0291v0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f868g, ((AbstractC0281q0) obj).f868g);
        }
        return false;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: f */
    public C0076c mo896f(int i2) {
        return m891r(i2, false);
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: j */
    public final C0076c mo897j() {
        if (this.f866e == null) {
            WindowInsets windowInsets = this.f864c;
            this.f866e = C0076c.m359b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f866e;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: l */
    public C0295x0 mo898l(int i2, int i3, int i4, int i5) {
        C0295x0 c0295x0M920g = C0295x0.m920g(null, this.f864c);
        int i6 = Build.VERSION.SDK_INT;
        AbstractC0279p0 c0277o0 = i6 >= 30 ? new C0277o0(c0295x0M920g) : i6 >= 29 ? new C0275n0(c0295x0M920g) : new C0273m0(c0295x0M920g);
        c0277o0.mo870g(C0295x0.m919e(mo897j(), i2, i3, i4, i5));
        c0277o0.mo869e(C0295x0.m919e(mo906h(), i2, i3, i4, i5));
        return c0277o0.mo868b();
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: n */
    public boolean mo899n() {
        return this.f864c.isRound();
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: o */
    public void mo900o(C0076c[] c0076cArr) {
        this.f865d = c0076cArr;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: p */
    public void mo901p(C0295x0 c0295x0) {
        this.f867f = c0295x0;
    }

    /* JADX INFO: renamed from: s */
    public C0076c m902s(int i2, boolean z2) {
        C0076c c0076cMo906h;
        int i3;
        if (i2 == 1) {
            return z2 ? C0076c.m359b(0, Math.max(m892t().f239b, mo897j().f239b), 0, 0) : C0076c.m359b(0, mo897j().f239b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0076c c0076cM892t = m892t();
                C0076c c0076cMo906h2 = mo906h();
                return C0076c.m359b(Math.max(c0076cM892t.f238a, c0076cMo906h2.f238a), 0, Math.max(c0076cM892t.f240c, c0076cMo906h2.f240c), Math.max(c0076cM892t.f241d, c0076cMo906h2.f241d));
            }
            C0076c c0076cMo897j = mo897j();
            C0295x0 c0295x0 = this.f867f;
            c0076cMo906h = c0295x0 != null ? c0295x0.f882a.mo906h() : null;
            int iMin = c0076cMo897j.f241d;
            if (c0076cMo906h != null) {
                iMin = Math.min(iMin, c0076cMo906h.f241d);
            }
            return C0076c.m359b(c0076cMo897j.f238a, 0, c0076cMo897j.f240c, iMin);
        }
        C0076c c0076c = C0076c.f237e;
        if (i2 == 8) {
            C0076c[] c0076cArr = this.f865d;
            c0076cMo906h = c0076cArr != null ? c0076cArr[AbstractC0016e.m170a0(8)] : null;
            if (c0076cMo906h != null) {
                return c0076cMo906h;
            }
            C0076c c0076cMo897j2 = mo897j();
            C0076c c0076cM892t2 = m892t();
            int i4 = c0076cMo897j2.f241d;
            if (i4 > c0076cM892t2.f241d) {
                return C0076c.m359b(0, 0, 0, i4);
            }
            C0076c c0076c2 = this.f868g;
            return (c0076c2 == null || c0076c2.equals(c0076c) || (i3 = this.f868g.f241d) <= c0076cM892t2.f241d) ? c0076c : C0076c.m359b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return mo912i();
        }
        if (i2 == 32) {
            return mo911g();
        }
        if (i2 == 64) {
            return mo913k();
        }
        if (i2 != 128) {
            return c0076c;
        }
        C0295x0 c0295x02 = this.f867f;
        C0266j c0266jMo910e = c0295x02 != null ? c0295x02.f882a.mo910e() : mo910e();
        if (c0266jMo910e == null) {
            return c0076c;
        }
        int i5 = Build.VERSION.SDK_INT;
        return C0076c.m359b(i5 >= 28 ? AbstractC0264i.m830d(c0266jMo910e.f829a) : 0, i5 >= 28 ? AbstractC0264i.m832f(c0266jMo910e.f829a) : 0, i5 >= 28 ? AbstractC0264i.m831e(c0266jMo910e.f829a) : 0, i5 >= 28 ? AbstractC0264i.m829c(c0266jMo910e.f829a) : 0);
    }

    /* JADX INFO: renamed from: w */
    public void m903w(C0076c c0076c) {
        this.f868g = c0076c;
    }
}
