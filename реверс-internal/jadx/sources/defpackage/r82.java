package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class r82 extends af1 {
    public final WindowInsetsController b;
    public final Window c;

    public r82(Window window) {
        this.b = window.getInsetsController();
        this.c = window;
    }

    @Override // defpackage.af1
    public void B(boolean z) {
        H(16, 16, z);
    }

    @Override // defpackage.af1
    public void C(boolean z) {
        H(8192, 8, z);
    }

    public final void H(int i, int i2, boolean z) {
        Window window = this.c;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.b;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
