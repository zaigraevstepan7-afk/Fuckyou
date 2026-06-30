package p076m;

import java.util.concurrent.Executors;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1002a extends AbstractC0383m {

    /* JADX INFO: renamed from: q */
    public static volatile C1002a f3982q;

    /* JADX INFO: renamed from: p */
    public final Object f3983p;

    public C1002a(int i2) {
        switch (i2) {
            case 1:
                this.f3983p = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1003b());
                break;
            default:
                this.f3983p = new C1002a(1);
                break;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static C1002a m2447q0() {
        if (f3982q != null) {
            return f3982q;
        }
        synchronized (C1002a.class) {
            try {
                if (f3982q == null) {
                    f3982q = new C1002a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3982q;
    }
}
