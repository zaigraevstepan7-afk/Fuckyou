package p024N;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p001A0.AbstractC0016e;
import p015I0.C0109e;

/* JADX INFO: renamed from: N.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0224B0 extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public final WindowInsetsController f762k;

    /* JADX INFO: renamed from: l */
    public Window f763l;

    public C0224B0(WindowInsetsController windowInsetsController, C0109e c0109e) {
        this.f762k = windowInsetsController;
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: t0 */
    public final void mo224t0(boolean z2) {
        Window window = this.f763l;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f762k.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f762k.setSystemBarsAppearance(0, 16);
    }

    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: u0 */
    public final void mo226u0(boolean z2) {
        Window window = this.f763l;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f762k.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f762k.setSystemBarsAppearance(0, 8);
    }
}
