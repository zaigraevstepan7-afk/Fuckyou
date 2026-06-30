package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xv extends g50 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final xv p;
    public static final long q;

    static {
        Long l;
        xv xvVar = new xv();
        p = xvVar;
        xvVar.n(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        q = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.g50
    public final void A(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A(runnable);
    }

    @Override // defpackage.g50
    public final Thread E() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(p.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.g50
    public final void G(long j, e50 e50Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void M() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            I();
            notifyAll();
        }
    }

    @Override // defpackage.vw
    public final az c(long j, x02 x02Var, lt ltVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return j01.e;
        }
        long jNanoTime = System.nanoTime();
        d50 d50Var = new d50(j2 + jNanoTime, x02Var);
        J(jNanoTime, d50Var);
        return d50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zF;
        l02.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zF) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jR = r();
                    if (jR == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = q + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            M();
                            if (F()) {
                                return;
                            }
                            E();
                            return;
                        }
                        if (jR > j2) {
                            jR = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jR > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            M();
                            if (F()) {
                                return;
                            }
                            E();
                            return;
                        }
                        LockSupport.parkNanos(this, jR);
                    }
                }
            }
        } finally {
            _thread = null;
            M();
            if (!F()) {
                E();
            }
        }
    }

    @Override // defpackage.g50, defpackage.b50
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.ot
    public final String toString() {
        return "DefaultExecutor";
    }
}
