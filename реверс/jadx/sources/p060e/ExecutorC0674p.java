package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: e.p */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC0674p implements Executor {

    /* JADX INFO: renamed from: a */
    public final Object f2705a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f2706b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ExecutorC0675q f2707c;

    /* JADX INFO: renamed from: d */
    public Runnable f2708d;

    static {
        ZLoader.registerNativesForClass(111, ExecutorC0674p.class);
        Hidden0.special_clinit_111_00(ExecutorC0674p.class);
    }

    public ExecutorC0674p(ExecutorC0675q executorC0675q) {
        this.f2707c = executorC0675q;
    }

    /* JADX INFO: renamed from: a */
    public final native void m1903a();

    @Override // java.util.concurrent.Executor
    public final native void execute(Runnable runnable);
}
