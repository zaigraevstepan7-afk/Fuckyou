package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d82 extends m82 {
    public static boolean m;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public eh0[] d;
    public eh0 e;
    public p82 f;
    public eh0 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public d82(p82 p82Var, WindowInsets windowInsets) {
        super(p82Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private uy B(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return uy.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        jg1 jg1VarC = bl.C(display, 0);
        jg1 jg1VarC2 = bl.C(display, 1);
        jg1 jg1VarC3 = bl.C(display, 2);
        jg1 jg1VarC4 = bl.C(display, 3);
        return uy.a(point.x, point.y, false, jg1VarC != null ? jg1VarC.b : 0, jg1VarC2 != null ? jg1VarC2.b : 0, jg1VarC3 != null ? jg1VarC3.b : 0, jg1VarC4 != null ? jg1VarC4.b : 0);
    }

    private static List<Rect> C(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[xc.x(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] D(eh0 eh0Var) {
        ArrayList arrayList = new ArrayList();
        int i = eh0Var.a;
        int i2 = eh0Var.d;
        int i3 = eh0Var.c;
        int i4 = eh0Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, eh0Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private eh0 E(int i, boolean z) {
        eh0 eh0VarA = eh0.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                eh0VarA = eh0.a(eh0VarA, F(i2, z));
            }
        }
        return eh0VarA;
    }

    private eh0 G() {
        p82 p82Var = this.f;
        return p82Var != null ? p82Var.a.k() : eh0.e;
    }

    private eh0 H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!m) {
            J();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(objInvoke));
                if (rect != null) {
                    return eh0.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void J() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean L(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.m82
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    public eh0 F(int i, boolean z) {
        eh0 eh0VarK;
        int i2;
        eh0 eh0Var = eh0.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    eh0[] eh0VarArr = this.d;
                    eh0VarK = eh0VarArr != null ? eh0VarArr[xc.x(8)] : null;
                    if (eh0VarK != null) {
                        return eh0VarK;
                    }
                    eh0 eh0VarM = m();
                    eh0 eh0VarG = G();
                    int i3 = eh0VarM.d;
                    if (i3 > eh0VarG.d) {
                        return eh0.b(0, 0, 0, i3);
                    }
                    eh0 eh0Var2 = this.g;
                    if (eh0Var2 != null && !eh0Var2.equals(eh0Var) && (i2 = this.g.d) > eh0VarG.d) {
                        return eh0.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        p82 p82Var = this.f;
                        sy syVarG = p82Var != null ? p82Var.a.g() : g();
                        if (syVarG != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return eh0.b(i4 >= 28 ? ry.f(syVarG.a) : 0, i4 >= 28 ? ry.h(syVarG.a) : 0, i4 >= 28 ? ry.g(syVarG.a) : 0, i4 >= 28 ? ry.e(syVarG.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    eh0 eh0VarG2 = G();
                    eh0 eh0VarK2 = k();
                    return eh0.b(Math.max(eh0VarG2.a, eh0VarK2.a), 0, Math.max(eh0VarG2.c, eh0VarK2.c), Math.max(eh0VarG2.d, eh0VarK2.d));
                }
                if ((this.h & 2) == 0) {
                    eh0 eh0VarM2 = m();
                    p82 p82Var2 = this.f;
                    eh0VarK = p82Var2 != null ? p82Var2.a.k() : null;
                    int iMin = eh0VarM2.d;
                    if (eh0VarK != null) {
                        iMin = Math.min(iMin, eh0VarK.d);
                    }
                    return eh0.b(eh0VarM2.a, 0, eh0VarM2.c, iMin);
                }
            }
        } else {
            if (z) {
                return eh0.b(0, Math.max(G().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return eh0.b(0, m().b, 0, 0);
            }
        }
        return eh0Var;
    }

    public boolean I(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !F(i, false).equals(eh0.e);
    }

    public void K(eh0 eh0Var) {
        this.g = eh0Var;
    }

    @Override // defpackage.m82
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        eh0 eh0VarH = H(view);
        if (eh0VarH == null) {
            eh0VarH = eh0.e;
        }
        K(eh0VarH);
    }

    @Override // defpackage.m82
    public List<Rect> e(int i) {
        return C(this.k, i);
    }

    @Override // defpackage.m82
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        d82 d82Var = (d82) obj;
        return Objects.equals(this.g, d82Var.g) && L(this.h, d82Var.h);
    }

    @Override // defpackage.m82
    public List<Rect> f(int i) {
        return C(this.l, i);
    }

    @Override // defpackage.m82
    public eh0 h(int i) {
        return E(i, false);
    }

    @Override // defpackage.m82
    public eh0 i(int i) {
        return E(i, true);
    }

    @Override // defpackage.m82
    public final eh0 m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = eh0.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.m82
    public void o(View view) {
        B(view);
    }

    @Override // defpackage.m82
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iX = xc.x(i);
            this.k[iX] = D(h(i));
            if (i != 8) {
                this.l[iX] = D(i(i));
            }
        }
    }

    @Override // defpackage.m82
    public p82 q(int i, int i2, int i3, int i4) {
        p82 p82VarC = p82.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        c82 b82Var = i5 >= 36 ? new b82(p82VarC) : i5 >= 35 ? new a82(p82VarC) : i5 >= 34 ? new z72(p82VarC) : i5 >= 31 ? new y72(p82VarC) : i5 >= 30 ? new x72(p82VarC) : i5 >= 29 ? new w72(p82VarC) : new u72(p82VarC);
        b82Var.h(p82.a(m(), i, i2, i3, i4));
        b82Var.f(p82.a(k(), i, i2, i3, i4));
        return b82Var.b();
    }

    @Override // defpackage.m82
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.m82
    public boolean t(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !I(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.m82
    public void v(eh0[] eh0VarArr) {
        this.d = eh0VarArr;
    }

    @Override // defpackage.m82
    public void w(p82 p82Var) {
        this.f = p82Var;
    }

    @Override // defpackage.m82
    public void y(int i) {
        this.h = i;
    }

    @Override // defpackage.m82
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.m82
    public void u(uy uyVar) {
    }
}
