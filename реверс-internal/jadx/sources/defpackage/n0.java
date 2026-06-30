package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 implements Future {
    public static final boolean h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger i = Logger.getLogger(n0.class.getName());
    public static final nu0 j;
    public static final Object k;
    public volatile Object e;
    public volatile j0 f;
    public volatile m0 g;

    static {
        nu0 l0Var;
        try {
            l0Var = new k0(AtomicReferenceFieldUpdater.newUpdater(m0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(m0.class, m0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n0.class, m0.class, "g"), AtomicReferenceFieldUpdater.newUpdater(n0.class, j0.class, "f"), AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "e"));
            th = null;
        } catch (Throwable th) {
            th = th;
            l0Var = new l0();
        }
        j = l0Var;
        if (th != null) {
            i.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        k = new Object();
    }

    public static void b(n0 n0Var) {
        m0 m0Var;
        j0 j0Var;
        do {
            m0Var = n0Var.g;
        } while (!j.m(n0Var, m0Var, m0.c));
        while (m0Var != null) {
            Thread thread = m0Var.a;
            if (thread != null) {
                m0Var.a = null;
                LockSupport.unpark(thread);
            }
            m0Var = m0Var.b;
        }
        do {
            j0Var = n0Var.f;
        } while (!j.k(n0Var, j0Var));
        j0 j0Var2 = null;
        while (j0Var != null) {
            j0 j0Var3 = j0Var.a;
            j0Var.a = j0Var2;
            j0Var2 = j0Var;
            j0Var = j0Var3;
        }
        while (j0Var2 != null) {
            j0Var2 = j0Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                i.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof h0) {
            Throwable th = ((h0) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof i0) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    public static Object d(n0 n0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = n0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.e;
        if (obj != null) {
            return false;
        }
        if (!j.l(this, obj, h ? new h0(new CancellationException("Future.cancel() was called."), z) : z ? h0.b : h0.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(m0 m0Var) {
        m0Var.a = null;
        while (true) {
            m0 m0Var2 = this.g;
            if (m0Var2 == m0.c) {
                return;
            }
            m0 m0Var3 = null;
            while (m0Var2 != null) {
                m0 m0Var4 = m0Var2.b;
                if (m0Var2.a != null) {
                    m0Var3 = m0Var2;
                } else if (m0Var3 != null) {
                    m0Var3.b = m0Var4;
                    if (m0Var3.a == null) {
                        break;
                    }
                } else if (!j.m(this, m0Var2, m0Var4)) {
                    break;
                }
                m0Var2 = m0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        m0 m0Var = m0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.e;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            m0 m0Var2 = this.g;
            if (m0Var2 != m0Var) {
                m0 m0Var3 = new m0();
                do {
                    nu0 nu0Var = j;
                    nu0Var.G(m0Var3, m0Var2);
                    if (nu0Var.m(this, m0Var2, m0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(m0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.e;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(m0Var3);
                    } else {
                        m0Var2 = this.g;
                    }
                } while (m0Var2 != m0Var);
            }
            return c(this.e);
        }
        while (nanos > 0) {
            Object obj3 = this.e;
            if (obj3 != null) {
                return c(obj3);
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
        String strConcat = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e instanceof h0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.e != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.e instanceof h0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
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
        m0 m0Var = m0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if (obj2 != null) {
                return c(obj2);
            }
            m0 m0Var2 = this.g;
            if (m0Var2 != m0Var) {
                m0 m0Var3 = new m0();
                do {
                    nu0 nu0Var = j;
                    nu0Var.G(m0Var3, m0Var2);
                    if (nu0Var.m(this, m0Var2, m0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                e(m0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    m0Var2 = this.g;
                } while (m0Var2 != m0Var);
            }
            return c(this.e);
        }
        throw new InterruptedException();
    }
}
