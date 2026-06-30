package p087s;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1035a {

    /* JADX INFO: renamed from: b */
    public static final C1035a f4113b;

    /* JADX INFO: renamed from: c */
    public static final C1035a f4114c;

    /* JADX INFO: renamed from: a */
    public final CancellationException f4115a;

    static {
        if (AbstractFutureC1041g.f4126d) {
            f4114c = null;
            f4113b = null;
        } else {
            f4114c = new C1035a(false, null);
            f4113b = new C1035a(true, null);
        }
    }

    public C1035a(boolean z2, CancellationException cancellationException) {
        this.f4115a = cancellationException;
    }
}
