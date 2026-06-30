package p017J0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0002c;
import p001A0.AbstractC0016e;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: J0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0142c extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f450p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ AbstractC0002c f451q;

    public /* synthetic */ C0142c(AbstractC0002c abstractC0002c, int i2) {
        this.f450p = i2;
        this.f451q = abstractC0002c;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: C */
    public int mo546C(View view) {
        switch (this.f450p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f451q;
                return sideSheetBehavior.f2318l + sideSheetBehavior.f2321o;
            default:
                return super.mo546C(view);
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: D */
    public int mo547D() {
        switch (this.f450p) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f451q;
                return bottomSheetBehavior.f2078I ? bottomSheetBehavior.f2089T : bottomSheetBehavior.f2076G;
            default:
                return super.mo547D();
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: R */
    public final void mo548R(int i2) {
        switch (this.f450p) {
            case 0:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f451q;
                    if (sideSheetBehavior.f2313g) {
                        sideSheetBehavior.m1757r(1);
                    }
                }
                break;
            default:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f451q;
                    if (bottomSheetBehavior.f2080K) {
                        bottomSheetBehavior.m1693C(1);
                    }
                }
                break;
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: S */
    public final void mo549S(View view, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f450p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f451q;
                WeakReference weakReference = sideSheetBehavior.f2323q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2307a.mo205A0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2327u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2307a.mo219f(i2);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f451q).m1703u(i3);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo550T(View view, float f, float f2) {
        int i2;
        switch (this.f450p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f451q;
                if (!sideSheetBehavior.f2307a.mo217c0(f)) {
                    if (sideSheetBehavior.f2307a.mo230z0(view, f)) {
                        i2 = (sideSheetBehavior.f2307a.mo221h0(f, f2) || sideSheetBehavior.f2307a.mo220g0(view)) ? 5 : 3;
                    } else {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            if (Math.abs(left - sideSheetBehavior.f2307a.mo208P()) < Math.abs(left - sideSheetBehavior.f2307a.mo209Q())) {
                            }
                        }
                    }
                }
                sideSheetBehavior.m1759t(view, i2, true);
                break;
            default:
                int i3 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f451q;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.f2098b) {
                        i3 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f2074E) {
                        }
                    }
                } else if (bottomSheetBehavior.f2078I && bottomSheetBehavior.m1694D(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f2102d) {
                        if (view.getTop() > (bottomSheetBehavior.m1704x() + bottomSheetBehavior.f2089T) / 2) {
                            i3 = 5;
                        } else if (bottomSheetBehavior.f2098b || Math.abs(view.getTop() - bottomSheetBehavior.m1704x()) < Math.abs(view.getTop() - bottomSheetBehavior.f2074E)) {
                        }
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f2098b) {
                        int i4 = bottomSheetBehavior.f2074E;
                        if (top2 < i4) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.f2076G)) {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i4) < Math.abs(top2 - bottomSheetBehavior.f2076G)) {
                            bottomSheetBehavior.getClass();
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f2073D) >= Math.abs(top2 - bottomSheetBehavior.f2076G)) {
                        i3 = 4;
                    }
                } else if (!bottomSheetBehavior.f2098b) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f2074E) < Math.abs(top3 - bottomSheetBehavior.f2076G)) {
                        bottomSheetBehavior.getClass();
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m1695E(view, i3, true);
                break;
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: l */
    public final int mo551l(View view, int i2) {
        switch (this.f450p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f451q;
                return AbstractC0016e.m183l(i2, sideSheetBehavior.f2307a.mo211V(), sideSheetBehavior.f2307a.mo210U());
            default:
                return view.getLeft();
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: m */
    public final int mo552m(View view, int i2) {
        switch (this.f450p) {
            case 0:
                return view.getTop();
            default:
                return AbstractC0016e.m183l(i2, ((BottomSheetBehavior) this.f451q).m1704x(), mo547D());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo553m0(View view, int i2) {
        WeakReference weakReference;
        switch (this.f450p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f451q;
                return (sideSheetBehavior.f2314h == 1 || (weakReference = sideSheetBehavior.f2322p) == null || weakReference.get() != view) ? false : true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f451q;
                int i3 = bottomSheetBehavior.f2081L;
                if (i3 != 1 && !bottomSheetBehavior.f2097a0) {
                    if (i3 == 3 && bottomSheetBehavior.f2094Y == i2) {
                        WeakReference weakReference2 = bottomSheetBehavior.f2091V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                        }
                    } else {
                        System.currentTimeMillis();
                        WeakReference weakReference3 = bottomSheetBehavior.f2090U;
                        if (weakReference3 != null && weakReference3.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}
