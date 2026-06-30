package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i30 extends bk {
    public final /* synthetic */ bk d;
    public final /* synthetic */ ThreadPoolExecutor e;

    public i30(bk bkVar, ThreadPoolExecutor threadPoolExecutor) {
        this.d = bkVar;
        this.e = threadPoolExecutor;
    }

    @Override // defpackage.bk
    public final void S(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.S(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.bk
    public final void T(vu vuVar) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.T(vuVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
