package p024N;

import android.view.View;
import android.view.Window;
import p001A0.AbstractC0016e;
import p015I0.C0109e;

/* JADX INFO: renamed from: N.y0 */
/* JADX INFO: loaded from: classes.dex */
public class C0297y0 extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public final Window f884k;

    public C0297y0(Window window, C0109e c0109e) {
        this.f884k = window;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m926C0(int i2) {
        View decorView = this.f884k.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }
}
