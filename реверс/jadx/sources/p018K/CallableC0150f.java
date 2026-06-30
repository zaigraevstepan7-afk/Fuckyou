package p018K;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: K.f */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0150f implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f472b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f473c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0149e f474d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f475e;

    public /* synthetic */ CallableC0150f(String str, Context context, C0149e c0149e, int i2, int i3) {
        this.f471a = i3;
        this.f472b = str;
        this.f473c = context;
        this.f474d = c0149e;
        this.f475e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f471a) {
            case 0:
                return AbstractC0153i.m568a(this.f472b, this.f473c, this.f474d, this.f475e);
            default:
                try {
                    return AbstractC0153i.m568a(this.f472b, this.f473c, this.f474d, this.f475e);
                } catch (Throwable unused) {
                    return new C0152h(-3);
                }
        }
    }
}
