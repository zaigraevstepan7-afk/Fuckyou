package p017J0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: J0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0140a extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f446k;

    /* JADX INFO: renamed from: l */
    public final SideSheetBehavior f447l;

    public /* synthetic */ C0140a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f446k = i2;
        this.f447l = sideSheetBehavior;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: A0 */
    public final void mo205A0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        switch (this.f446k) {
            case 0:
                if (i2 <= this.f447l.f2319m) {
                    marginLayoutParams.leftMargin = i3;
                }
                break;
            default:
                int i4 = this.f447l.f2319m;
                if (i2 <= i4) {
                    marginLayoutParams.rightMargin = i4 - i2;
                }
                break;
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: P */
    public final int mo208P() {
        switch (this.f446k) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f447l;
                return Math.max(0, sideSheetBehavior.f2320n + sideSheetBehavior.f2321o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f447l;
                return Math.max(0, (sideSheetBehavior2.f2319m - sideSheetBehavior2.f2318l) - sideSheetBehavior2.f2321o);
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: Q */
    public final int mo209Q() {
        switch (this.f446k) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f447l;
                return (-sideSheetBehavior.f2318l) - sideSheetBehavior.f2321o;
            default:
                return this.f447l.f2319m;
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: U */
    public final int mo210U() {
        switch (this.f446k) {
            case 0:
                return this.f447l.f2321o;
            default:
                return this.f447l.f2319m;
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: V */
    public final int mo211V() {
        switch (this.f446k) {
            case 0:
                return -this.f447l.f2318l;
            default:
                return mo208P();
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: W */
    public final int mo212W(View view) {
        switch (this.f446k) {
            case 0:
                return view.getRight() + this.f447l.f2321o;
            default:
                return view.getLeft() - this.f447l.f2321o;
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: X */
    public final int mo213X(CoordinatorLayout coordinatorLayout) {
        switch (this.f446k) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: Y */
    public final int mo214Y() {
        switch (this.f446k) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: c0 */
    public final boolean mo217c0(float f) {
        switch (this.f446k) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: e */
    public final int mo218e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f446k) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: f */
    public final float mo219f(int i2) {
        switch (this.f446k) {
            case 0:
                float fMo209Q = mo209Q();
                return (i2 - fMo209Q) / (mo208P() - fMo209Q);
            default:
                float f = this.f447l.f2319m;
                return (f - i2) / (f - mo208P());
        }
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: g0 */
    public final boolean mo220g0(View view) {
        switch (this.f446k) {
            case 0:
                if (view.getRight() < (mo208P() - mo209Q()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo208P() + this.f447l.f2319m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: h0 */
    public final boolean mo221h0(float f, float f2) {
        switch (this.f446k) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs = Math.abs(f);
                    this.f447l.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs2 = Math.abs(f);
                    this.f447l.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: z0 */
    public final boolean mo230z0(View view, float f) {
        switch (this.f446k) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f447l;
                float fAbs = Math.abs((f * sideSheetBehavior.f2317k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f447l;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f2317k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }
}
