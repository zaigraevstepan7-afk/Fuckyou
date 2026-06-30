package defpackage;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gk {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public boolean a(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentC;
        int i4;
        int i5;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (!this.a || (viewParentC = c(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (((int[]) this.e) == null) {
                this.e = new int[2];
            }
            iArr3 = (int[]) this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentC instanceof NestedScrollView) {
            ((NestedScrollView) viewParentC).D.a(i, i2, i3, iArr3, null);
        } else if (i3 == 0) {
            try {
                viewParentC.onNestedPreScroll(nestedScrollView, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentC;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (viewParentC = c(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.e) == null) {
                        this.e = new int[2];
                    }
                    iArr3 = (int[]) this.e;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentC instanceof NestedScrollView) {
                    ((NestedScrollView) viewParentC).g(i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentC instanceof NestedScrollView) {
                        ((NestedScrollView) viewParentC).g(i4, i5, null);
                    } else if (i5 == 0) {
                        try {
                            viewParentC.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent c(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int d(n81 n81Var, h4 h4Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        qd0 qd0Var = (qd0) this.c;
        td0 td0Var = (td0) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            xg0 xg0VarZ = ((y41) this.d).z(n81Var, h4Var);
            qs0 qs0Var = (qs0) xg0VarZ.f;
            int iE = qs0Var.e();
            for (int i3 = 0; i3 < iE; i3++) {
                l81 l81Var = (l81) qs0Var.f(i3);
                if (!l81Var.d && !l81Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iE2 = qs0Var.e();
            for (int i4 = 0; i4 < iE2; i4++) {
                l81 l81Var2 = (l81) qs0Var.f(i4);
                if (objArr != false || lk.r(l81Var2)) {
                    ((ql0) this.b).A(l81Var2.c, (td0) this.e, l81Var2.i, true);
                    if (!td0Var.e.h()) {
                        qd0Var.a(l81Var2.a, td0Var, lk.r(l81Var2));
                        td0Var.clear();
                    }
                }
            }
            boolean zB = qd0Var.b(xg0VarZ, z);
            int iE3 = qs0Var.e();
            int i5 = 0;
            while (true) {
                if (i5 >= iE3) {
                    i = 0;
                    break;
                }
                l81 l81Var3 = (l81) qs0Var.f(i5);
                if (!w01.b(lk.a0(l81Var3, true), 0L) && l81Var3.c()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int iE4 = qs0Var.e();
            int i6 = 0;
            while (true) {
                if (i6 >= iE4) {
                    i2 = 0;
                    break;
                }
                if (((l81) qs0Var.f(i6)).c()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public void e(int i, int i2) {
        if (i < 0.0f) {
            qg0.a("Index should be non-negative (" + i + ")");
        }
        ((s41) this.b).h(i);
        wm0 wm0Var = (wm0) this.e;
        if (i != wm0Var.f) {
            wm0Var.f = i;
            int i3 = (i / 30) * 30;
            wm0Var.e.setValue(lk.o0(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((s41) this.c).h(i2);
    }
}
