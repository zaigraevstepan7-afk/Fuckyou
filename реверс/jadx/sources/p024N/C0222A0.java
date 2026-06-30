package p024N;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: N.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0222A0 extends C0299z0 {
    @Override // p001A0.AbstractC0016e
    /* JADX INFO: renamed from: t0 */
    public final void mo224t0(boolean z2) {
        if (!z2) {
            m926C0(16);
            return;
        }
        Window window = this.f884k;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
