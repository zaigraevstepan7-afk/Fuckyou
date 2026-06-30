package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class my extends oy implements xt, ks {
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(my.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long m = yi.a.objectFieldOffset(my.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final ot h;
    public final ls i;
    public Object j;
    public final Object k;

    public my(ot otVar, ls lsVar) {
        super(-1);
        this.h = otVar;
        this.i = lsVar;
        this.j = s22.d;
        this.k = xi0.J(lsVar.e());
    }

    @Override // defpackage.xt
    public final xt d() {
        return this.i;
    }

    @Override // defpackage.ks
    public final lt e() {
        return this.i.e();
    }

    @Override // defpackage.ks
    public final void g(Object obj) throws ly {
        Throwable thA = pe1.a(obj);
        Object onVar = thA == null ? obj : new on(thA, false);
        ls lsVar = this.i;
        lt ltVarE = lsVar.e();
        ot otVar = this.h;
        if (s22.J(otVar, ltVarE)) {
            this.j = onVar;
            this.g = 0;
            s22.I(otVar, lsVar.e(), this);
            return;
        }
        b50 b50VarA = l02.a();
        if (b50VarA.g >= 4294967296L) {
            this.j = onVar;
            this.g = 0;
            b50VarA.m(this);
            return;
        }
        b50VarA.n(true);
        try {
            lt ltVarE2 = lsVar.e();
            Object objM = xi0.M(ltVarE2, this.k);
            try {
                lsVar.g(obj);
                while (b50VarA.t()) {
                }
            } finally {
                xi0.G(ltVarE2, objM);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.oy
    public final Object j() {
        Object obj = this.j;
        this.j = s22.d;
        return obj;
    }

    public final void l() {
        do {
            l.getClass();
        } while (yi.a.getObjectVolatile(this, m) == s22.e);
    }

    public final xi n() {
        my myVar;
        s30 s30Var = s22.e;
        while (true) {
            l.getClass();
            Unsafe unsafe = yi.a;
            long j = m;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, s30Var);
                return null;
            }
            if (objectVolatile instanceof xi) {
                while (true) {
                    Unsafe unsafe2 = yi.a;
                    my myVar2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(myVar2, m, objectVolatile, s30Var);
                    myVar = myVar2;
                    if (zCompareAndSwapObject) {
                        return (xi) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(myVar, j) != objectVolatile) {
                        break;
                    }
                    this = myVar;
                }
            } else {
                myVar = this;
                if (objectVolatile != s30Var && !(objectVolatile instanceof Throwable)) {
                    yc.g(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = myVar;
        }
    }

    public final xi o() {
        l.getClass();
        Object objectVolatile = yi.a.getObjectVolatile(this, m);
        if (objectVolatile instanceof xi) {
            return (xi) objectVolatile;
        }
        return null;
    }

    public final boolean p() {
        l.getClass();
        return yi.a.getObjectVolatile(this, m) != null;
    }

    public final boolean q(Throwable th) {
        my myVar;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            l.getClass();
            Unsafe unsafe2 = yi.a;
            long j = m;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            s30 s30Var = s22.e;
            if (xi0.o(objectVolatile, s30Var)) {
                while (true) {
                    Unsafe unsafe3 = yi.a;
                    my myVar2 = this;
                    th2 = th;
                    myVar = myVar2;
                    if (unsafe3.compareAndSwapObject(myVar2, m, s30Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(myVar, j) != s30Var) {
                        break;
                    }
                    this = myVar;
                    th = th2;
                }
            } else {
                myVar = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(myVar, m, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(myVar, j) == objectVolatile);
            }
            this = myVar;
            th = th2;
        }
    }

    public final Throwable r(xi xiVar) {
        Unsafe unsafe;
        my myVar;
        xi xiVar2;
        while (true) {
            l.getClass();
            Unsafe unsafe2 = yi.a;
            long j = m;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            s30 s30Var = s22.e;
            if (objectVolatile != s30Var) {
                my myVar2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    yc.g(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(myVar2, m, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(myVar2, j) == objectVolatile);
                yc.p("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = yi.a;
                myVar = this;
                xiVar2 = xiVar;
                if (unsafe3.compareAndSwapObject(myVar, m, s30Var, xiVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(myVar, j) != s30Var) {
                    break;
                }
                this = myVar;
                xiVar = xiVar2;
            }
            this = myVar;
            xiVar = xiVar2;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.h + ", " + pv.F(this.i) + ']';
    }

    @Override // defpackage.oy
    public final ks c() {
        return this;
    }
}
