package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class fq {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(fq.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = yi.a;
        c = unsafe.objectFieldOffset(fq.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(fq.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(fq.class.getDeclaredField("_prev$volatile"));
    }

    public fq(ek1 ek1Var) {
        this._prev$volatile = ek1Var;
    }

    public final void a() {
        b.getClass();
        yi.a.putObjectVolatile(this, d, (Object) null);
    }

    public final fq b() {
        fq fqVarE = e();
        while (fqVarE != null && fqVarE.f()) {
            b.getClass();
            fqVarE = (fq) yi.a.getObjectVolatile(fqVarE, d);
        }
        return fqVarE;
    }

    public final fq c() {
        Object objD = d();
        if (objD == u4.i) {
            return null;
        }
        return (fq) objD;
    }

    public final Object d() {
        a.getClass();
        return yi.a.getObjectVolatile(this, c);
    }

    public final fq e() {
        b.getClass();
        return (fq) yi.a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        s30 s30Var = u4.i;
        while (true) {
            a.getClass();
            Unsafe unsafe = yi.a;
            long j = c;
            fq fqVar = this;
            if (unsafe.compareAndSwapObject(fqVar, j, (Object) null, s30Var)) {
                return true;
            }
            if (unsafe.getObjectVolatile(fqVar, j) != null) {
                return false;
            }
            this = fqVar;
        }
    }

    public final void h() {
        fq fqVar;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            fq fqVarB = b();
            fq fqVarC = c();
            fqVarC.getClass();
            do {
                fqVar = fqVarC;
                if (!fqVar.f()) {
                    break;
                } else {
                    fqVarC = fqVar.c();
                }
            } while (fqVarC != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = yi.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(fqVar, j);
                fq fqVar2 = ((fq) objectVolatile) == null ? null : fqVarB;
                do {
                    unsafe = yi.a;
                    if (unsafe.compareAndSwapObject(fqVar, d, objectVolatile, fqVar2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(fqVar, j) == objectVolatile);
            }
            if (fqVarB != null) {
                a.getClass();
                unsafe.putObjectVolatile(fqVarB, c, fqVar);
            }
            if (!fqVar.f() || fqVar.c() == null) {
                if (fqVarB == null || !fqVarB.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(ek1 ek1Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = yi.a;
            long j = c;
            fq fqVar = this;
            ek1 ek1Var2 = ek1Var;
            if (unsafe.compareAndSwapObject(fqVar, j, (Object) null, ek1Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(fqVar, j) != null) {
                return false;
            }
            this = fqVar;
            ek1Var = ek1Var2;
        }
    }
}
