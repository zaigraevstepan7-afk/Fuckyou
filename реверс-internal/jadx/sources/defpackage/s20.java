package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class s20 extends r20 {
    @Override // defpackage.q20
    public void b(kv1 kv1Var, kv1 kv1Var2, Window window, View view, boolean z, boolean z2) {
        kv1Var.getClass();
        kv1Var2.getClass();
        window.getClass();
        view.getClass();
        pd1.p(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        af1 s82Var = i >= 35 ? new s82(window) : i >= 30 ? new r82(window) : new q82(window);
        s82Var.C(!z);
        s82Var.B(!z2);
    }
}
