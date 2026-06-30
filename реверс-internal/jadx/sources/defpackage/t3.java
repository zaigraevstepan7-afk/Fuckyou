package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int e = 0;

    public /* synthetic */ t3() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                sx0 sx0Var = h4.N0;
                synchronized (sx0Var) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = sx0Var.a;
                        int i2 = sx0Var.b;
                        int i3 = 0;
                        if (i < 30) {
                            while (i3 < i2) {
                                h4 h4Var = (h4) objArr[i3];
                                boolean showLayoutBounds = h4Var.getShowLayoutBounds();
                                l91 l91Var = h4.J0;
                                h4Var.setShowLayoutBounds(l91.r());
                                if (showLayoutBounds != h4Var.getShowLayoutBounds()) {
                                    h4Var.post(new q3(h4Var, 2));
                                }
                                i3++;
                            }
                        } else {
                            while (i3 < i2) {
                                h4 h4Var2 = (h4) objArr[i3];
                                h4Var2.post(new q3(h4Var2, 3));
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ t3(zb zbVar, int i) {
    }

    private final void a() {
    }
}
