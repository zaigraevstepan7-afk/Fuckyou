package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fw extends i50 implements Executor {
    public static final fw g = new fw();
    public static final ot h;

    static {
        w32 w32Var = w32.g;
        int i = mv1.a;
        if (64 >= i) {
            i = 64;
        }
        h = w32Var.g(pd1.r(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.ot
    public final void e(lt ltVar, Runnable runnable) {
        h.e(ltVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(d40.e, runnable);
    }

    @Override // defpackage.ot
    public final String toString() {
        return "Dispatchers.IO";
    }
}
