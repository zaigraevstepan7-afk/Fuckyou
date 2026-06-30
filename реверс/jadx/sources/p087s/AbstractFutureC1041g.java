package p087s;

import androidx.fragment.app.AbstractC0529T;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: s.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC1041g implements Future {

    /* JADX INFO: renamed from: d */
    public static final boolean f4126d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f4127e = Logger.getLogger(AbstractFutureC1041g.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC0383m f4128f;

    /* JADX INFO: renamed from: g */
    public static final Object f4129g;

    /* JADX INFO: renamed from: a */
    public volatile Object f4130a;

    /* JADX INFO: renamed from: b */
    public volatile C1037c f4131b;

    /* JADX INFO: renamed from: c */
    public volatile C1040f f4132c;

    static {
        AbstractC0383m c1039e;
        try {
            c1039e = new C1038d(AtomicReferenceFieldUpdater.newUpdater(C1040f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1040f.class, C1040f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1041g.class, C1040f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1041g.class, C1037c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1041g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1039e = new C1039e();
        }
        f4128f = c1039e;
        if (th != null) {
            f4127e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4129g = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m2501b(AbstractFutureC1041g abstractFutureC1041g) {
        C1040f c1040f;
        C1037c c1037c;
        do {
            c1040f = abstractFutureC1041g.f4132c;
        } while (!f4128f.mo1078k(abstractFutureC1041g, c1040f, C1040f.f4123c));
        while (c1040f != null) {
            Thread thread = c1040f.f4124a;
            if (thread != null) {
                c1040f.f4124a = null;
                LockSupport.unpark(thread);
            }
            c1040f = c1040f.f4125b;
        }
        do {
            c1037c = abstractFutureC1041g.f4131b;
        } while (!f4128f.mo1074i(abstractFutureC1041g, c1037c));
        C1037c c1037c2 = null;
        while (c1037c != null) {
            C1037c c1037c3 = c1037c.f4117a;
            c1037c.f4117a = c1037c2;
            c1037c2 = c1037c;
            c1037c = c1037c3;
        }
        while (c1037c2 != null) {
            c1037c2 = c1037c2.f4117a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f4127e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m2502c(Object obj) throws ExecutionException {
        if (obj instanceof C1035a) {
            CancellationException cancellationException = ((C1035a) obj).f4115a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC1036b) {
            ((AbstractC1036b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f4129g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m2503d(AbstractFutureC1041g abstractFutureC1041g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC1041g.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m2504a(StringBuilder sb) {
        try {
            Object objM2503d = m2503d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM2503d == this ? "this future" : String.valueOf(objM2503d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f4130a;
        if (obj != null) {
            return false;
        }
        if (!f4128f.mo1076j(this, obj, f4126d ? new C1035a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C1035a.f4113b : C1035a.f4114c)) {
            return false;
        }
        m2501b(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m2505e(C1040f c1040f) {
        c1040f.f4124a = null;
        while (true) {
            C1040f c1040f2 = this.f4132c;
            if (c1040f2 == C1040f.f4123c) {
                return;
            }
            C1040f c1040f3 = null;
            while (c1040f2 != null) {
                C1040f c1040f4 = c1040f2.f4125b;
                if (c1040f2.f4124a != null) {
                    c1040f3 = c1040f2;
                } else if (c1040f3 != null) {
                    c1040f3.f4125b = c1040f4;
                    if (c1040f3.f4124a == null) {
                        break;
                    }
                } else if (!f4128f.mo1078k(this, c1040f2, c1040f4)) {
                    break;
                }
                c1040f2 = c1040f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4130a;
        if (obj != null) {
            return m2502c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1040f c1040f = this.f4132c;
            C1040f c1040f2 = C1040f.f4123c;
            if (c1040f != c1040f2) {
                C1040f c1040f3 = new C1040f();
                do {
                    AbstractC0383m abstractC0383m = f4128f;
                    abstractC0383m.mo1068V(c1040f3, c1040f);
                    if (abstractC0383m.mo1078k(this, c1040f, c1040f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2505e(c1040f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4130a;
                            if (obj2 != null) {
                                return m2502c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2505e(c1040f3);
                    } else {
                        c1040f = this.f4132c;
                    }
                } while (c1040f != c1040f2);
            }
            return m2502c(this.f4130a);
        }
        while (nanos > 0) {
            Object obj3 = this.f4130a;
            if (obj3 != null) {
                return m2502c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strM1417f = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM1417f2 = AbstractC0529T.m1417f(strM1417f, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM1417f3 = strM1417f2 + jConvert + " " + lowerCase;
                if (z2) {
                    strM1417f3 = AbstractC0529T.m1417f(strM1417f3, ",");
                }
                strM1417f2 = AbstractC0529T.m1417f(strM1417f3, " ");
            }
            if (z2) {
                strM1417f2 = strM1417f2 + nanos2 + " nanoseconds ";
            }
            strM1417f = AbstractC0529T.m1417f(strM1417f2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0529T.m1417f(strM1417f, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM1417f + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4130a instanceof C1035a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4130a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4130a instanceof C1035a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2504a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m2504a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4130a;
            if (obj2 != null) {
                return m2502c(obj2);
            }
            C1040f c1040f = this.f4132c;
            C1040f c1040f2 = C1040f.f4123c;
            if (c1040f != c1040f2) {
                C1040f c1040f3 = new C1040f();
                do {
                    AbstractC0383m abstractC0383m = f4128f;
                    abstractC0383m.mo1068V(c1040f3, c1040f);
                    if (abstractC0383m.mo1078k(this, c1040f, c1040f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4130a;
                            } else {
                                m2505e(c1040f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m2502c(obj);
                    }
                    c1040f = this.f4132c;
                } while (c1040f != c1040f2);
            }
            return m2502c(this.f4130a);
        }
        throw new InterruptedException();
    }
}
