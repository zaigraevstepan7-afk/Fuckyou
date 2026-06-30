package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qi implements Runnable {
    public final /* synthetic */ int e = 1;

    public /* synthetic */ qi() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                return;
            default:
                try {
                    int i = o12.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (g30.d()) {
                        g30.a().e();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = o12.a;
                    Trace.endSection();
                    throw th;
                }
        }
    }

    public qi(y41 y41Var, int i) {
    }

    private final void a() {
    }
}
