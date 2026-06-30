package p073k0;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: k0.C */
/* JADX INFO: loaded from: classes.dex */
public class C0832C extends C0830A {

    /* JADX INFO: renamed from: k */
    public static boolean f3399k = true;

    @Override // p015I0.C0109e
    /* JADX INFO: renamed from: q */
    public void mo467q(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo467q(view, i2);
        } else if (f3399k) {
            try {
                AbstractC0831B.m2209a(view, i2);
            } catch (NoSuchMethodError unused) {
                f3399k = false;
            }
        }
    }
}
