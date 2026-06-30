package p024N;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: N.z0 */
/* JADX INFO: loaded from: classes.dex */
public class C0299z0 extends C0297y0 {
    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: u0 */
    public final void mo226u0(boolean z2) {
        if (!z2) {
            m926C0(8192);
            return;
        }
        Window window = this.f884k;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }
}
