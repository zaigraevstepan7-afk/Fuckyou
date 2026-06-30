package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ cb1(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Context context = this.f;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new cb1(context, 1));
                break;
            default:
                nu0.Q(context, new za1(), nu0.m, false);
                break;
        }
    }
}
