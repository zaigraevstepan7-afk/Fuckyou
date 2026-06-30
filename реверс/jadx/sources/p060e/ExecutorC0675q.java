package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: e.q */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC0675q implements Executor {
    static {
        ZLoader.registerNativesForClass(112, ExecutorC0675q.class);
        Hidden0.special_clinit_112_00(ExecutorC0675q.class);
    }

    @Override // java.util.concurrent.Executor
    public final native void execute(Runnable runnable);
}
