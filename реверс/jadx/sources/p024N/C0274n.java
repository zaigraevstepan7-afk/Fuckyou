package p024N;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: N.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0274n {

    /* JADX INFO: renamed from: a */
    public ViewParent f849a;

    /* JADX INFO: renamed from: b */
    public ViewParent f850b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f851c;

    /* JADX INFO: renamed from: d */
    public boolean f852d;

    /* JADX INFO: renamed from: e */
    public int[] f853e;

    public C0274n(ViewGroup viewGroup) {
        this.f851c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m871a(float f, float f2, boolean z2) {
        ViewParent viewParentM875e;
        if (this.f852d && (viewParentM875e = m875e(0)) != null) {
            try {
                return AbstractC0247Z.m798a(viewParentM875e, this.f851c, f, f2, z2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM875e + " does not implement interface method onNestedFling", e2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m872b(float f, float f2) {
        ViewParent viewParentM875e;
        if (this.f852d && (viewParentM875e = m875e(0)) != null) {
            try {
                return AbstractC0247Z.m799b(viewParentM875e, this.f851c, f, f2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM875e + " does not implement interface method onNestedPreFling", e2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m873c(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        ViewParent viewParentM875e;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f852d || (viewParentM875e = m875e(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f851c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f853e == null) {
                this.f853e = new int[2];
            }
            iArr3 = this.f853e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM875e instanceof InterfaceC0276o) {
            ((InterfaceC0276o) viewParentM875e).mo885e(viewGroup, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                AbstractC0247Z.m800c(viewParentM875e, viewGroup, i2, i3, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM875e + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m874d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentM875e;
        int i7;
        int i8;
        int[] iArr3;
        if (this.f852d && (viewParentM875e = m875e(i6)) != null) {
            if (i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
                ViewGroup viewGroup = this.f851c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i7 = iArr[0];
                    i8 = iArr[1];
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (iArr2 == null) {
                    if (this.f853e == null) {
                        this.f853e = new int[2];
                    }
                    int[] iArr4 = this.f853e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM875e instanceof InterfaceC0278p) {
                    ((InterfaceC0278p) viewParentM875e).mo888b(viewGroup, i2, i3, i4, i5, i6, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i4;
                    iArr3[1] = iArr3[1] + i5;
                    if (viewParentM875e instanceof InterfaceC0276o) {
                        ((InterfaceC0276o) viewParentM875e).mo883c(viewGroup, i2, i3, i4, i5, i6);
                    } else if (i6 == 0) {
                        try {
                            AbstractC0247Z.m801d(viewParentM875e, viewGroup, i2, i3, i4, i5);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM875e + " does not implement interface method onNestedScroll", e2);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i8;
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

    /* JADX INFO: renamed from: e */
    public final ViewParent m875e(int i2) {
        if (i2 == 0) {
            return this.f849a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f850b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m876f(int i2) {
        return m875e(i2) != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m877g(int i2, int i3) {
        boolean zM803f;
        if (!m876f(i3)) {
            if (this.f852d) {
                ViewGroup viewGroup = this.f851c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof InterfaceC0276o;
                    if (z2) {
                        zM803f = ((InterfaceC0276o) parent).mo886f(view, viewGroup, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            zM803f = AbstractC0247Z.m803f(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                            zM803f = false;
                        }
                    } else {
                        zM803f = false;
                    }
                    if (zM803f) {
                        if (i3 == 0) {
                            this.f849a = parent;
                        } else if (i3 == 1) {
                            this.f850b = parent;
                        }
                        if (z2) {
                            ((InterfaceC0276o) parent).mo882a(view, viewGroup, i2, i3);
                        } else if (i3 == 0) {
                            try {
                                AbstractC0247Z.m802e(parent, view, viewGroup, i2);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m878h(int i2) {
        ViewParent viewParentM875e = m875e(i2);
        if (viewParentM875e != null) {
            boolean z2 = viewParentM875e instanceof InterfaceC0276o;
            ViewGroup viewGroup = this.f851c;
            if (z2) {
                ((InterfaceC0276o) viewParentM875e).mo884d(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    AbstractC0247Z.m804g(viewParentM875e, viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM875e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f849a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f850b = null;
            }
        }
    }
}
