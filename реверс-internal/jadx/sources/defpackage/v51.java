package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v51 {
    public final tp a;
    public final op b;
    public final ob0 c;
    public final wa0 d;
    public final boolean e;
    public final k32 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(x51.g);
    public long i = xc.q();
    public ay0 j;
    public final hd1 k;
    public final kc1 l;

    public v51(tp tpVar, op opVar, ob0 ob0Var, cy0 cy0Var, wa0 wa0Var, boolean z, k32 k32Var, Object obj) {
        this.a = tpVar;
        this.b = opVar;
        this.c = ob0Var;
        this.d = wa0Var;
        this.e = z;
        this.f = k32Var;
        this.g = obj;
        ay0 ay0Var = qi1.a;
        ay0Var.getClass();
        this.j = ay0Var;
        hd1 hd1Var = new hd1();
        hd1Var.g(cy0Var, ob0Var.y());
        this.k = hd1Var;
        this.l = new kc1(k32Var.g);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((x51) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case t91.FLOAT_FIELD_NUMBER /* 2 */:
                case t91.INTEGER_FIELD_NUMBER /* 3 */:
                case t91.LONG_FIELD_NUMBER /* 4 */:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case t91.STRING_FIELD_NUMBER /* 5 */:
                    b();
                    x51 x51Var = x51.j;
                    x51 x51Var2 = x51.k;
                    while (!atomicReference.compareAndSet(x51Var, x51Var2)) {
                        if (atomicReference.get() != x51Var) {
                            e91.b("Unexpected state change from: " + x51Var + " to: " + x51Var2 + ".");
                            return;
                        }
                    }
                    return;
                case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new pn();
            }
        } catch (Exception e) {
            atomicReference.set(x51.e);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.u = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((x51) this.h.get()).compareTo(x51.j) >= 0;
    }

    public final void d() {
        x51 x51Var;
        x51 x51Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            x51Var = x51.h;
            x51Var2 = x51.j;
            if (atomicReference.compareAndSet(x51Var, x51Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != x51Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        e91.b("Unexpected state change from: " + x51Var + " to: " + x51Var2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean e(yn1 yn1Var) throws Exception {
        x51 x51Var = x51.i;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((x51) atomicReference.get()).ordinal();
            x51 x51Var2 = x51.h;
            tp tpVar = this.a;
            op opVar = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case t91.FLOAT_FIELD_NUMBER /* 2 */:
                    ob0 ob0Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        ob0Var.z = 0;
                        ob0Var.y = true;
                    }
                    this.j = opVar.b(tpVar, yn1Var, this.d);
                    if (z) {
                        if (ob0Var.F || ob0Var.z != 0) {
                            e91.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        ob0Var.z = -1;
                        ob0Var.y = false;
                    }
                    x51 x51Var3 = x51.g;
                    while (true) {
                        if (!atomicReference.compareAndSet(x51Var3, x51Var2)) {
                            if (atomicReference.get() != x51Var3) {
                                e91.b("Unexpected state change from: " + x51Var3 + " to: " + x51Var2 + ".");
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case t91.INTEGER_FIELD_NUMBER /* 3 */:
                    while (true) {
                        if (!atomicReference.compareAndSet(x51Var2, x51Var)) {
                            if (atomicReference.get() != x51Var2) {
                                e91.b("Unexpected state change from: " + x51Var2 + " to: " + x51Var + ".");
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = xc.q();
                        this.j = opVar.n(tpVar, yn1Var, this.j);
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(x51Var, x51Var2)) {
                                if (atomicReference.get() != x51Var) {
                                    e91.b("Unexpected state change from: " + x51Var + " to: " + x51Var2 + ".");
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(x51Var, x51Var2)) {
                                if (atomicReference.get() != x51Var) {
                                    e91.b("Unexpected state change from: " + x51Var + " to: " + x51Var2 + ".");
                                }
                            }
                        }
                        throw th;
                    }
                case t91.LONG_FIELD_NUMBER /* 4 */:
                    mp.b("Recursive call to resume()");
                    throw new pn();
                case t91.STRING_FIELD_NUMBER /* 5 */:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new pn();
            }
        } catch (Exception e) {
            atomicReference.set(x51.e);
            throw e;
        }
    }
}
