package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class es0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(es0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = yi.a;
        h = unsafe.objectFieldOffset(es0.class.getDeclaredField("_next$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(es0.class, Object.class, "_prev$volatile");
        i = unsafe.objectFieldOffset(es0.class.getDeclaredField("_prev$volatile"));
        g = AtomicReferenceFieldUpdater.newUpdater(es0.class, Object.class, "_removedRef$volatile");
        j = unsafe.objectFieldOffset(es0.class.getDeclaredField("_removedRef$volatile"));
    }

    public static es0 i(es0 es0Var) {
        while (es0Var.n()) {
            f.getClass();
            es0Var = (es0) yi.a.getObjectVolatile(es0Var, i);
        }
        return es0Var;
    }

    public final boolean e(es0 es0Var, int i2) {
        es0 es0VarM;
        do {
            es0VarM = m();
            if (es0VarM instanceof bq0) {
                return (((bq0) es0VarM).k & i2) == 0 && es0VarM.e(es0Var, i2);
            }
        } while (!es0VarM.f(es0Var, this));
        return true;
    }

    public final boolean f(es0 es0Var, es0 es0Var2) {
        f.getClass();
        Unsafe unsafe = yi.a;
        unsafe.putObjectVolatile(es0Var, i, this);
        e.getClass();
        long j2 = h;
        unsafe.putObjectVolatile(es0Var, j2, es0Var2);
        while (true) {
            Unsafe unsafe2 = yi.a;
            es0 es0Var3 = this;
            es0 es0Var4 = es0Var;
            es0 es0Var5 = es0Var2;
            if (unsafe2.compareAndSwapObject(es0Var3, h, es0Var5, es0Var4)) {
                es0Var4.j(es0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(es0Var3, j2) != es0Var5) {
                return false;
            }
            this = es0Var3;
            es0Var2 = es0Var5;
            es0Var = es0Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(e01 e01Var) {
        f.getClass();
        Unsafe unsafe = yi.a;
        unsafe.putObjectVolatile(e01Var, i, this);
        e.getClass();
        long j2 = h;
        unsafe.putObjectVolatile(e01Var, j2, this);
        while (this.k() == this) {
            while (true) {
                Unsafe unsafe2 = yi.a;
                es0 es0Var = this;
                e01 e01Var2 = e01Var;
                if (unsafe2.compareAndSwapObject(es0Var, h, this, e01Var2)) {
                    e01Var2.j(es0Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(es0Var, j2) != es0Var) {
                        break;
                    }
                    this = es0Var;
                    e01Var = e01Var2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final es0 h() {
        es0 es0Var;
        Unsafe unsafe;
        loop0: while (true) {
            f.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = i;
            es0 es0Var2 = (es0) unsafe2.getObjectVolatile(this, j2);
            es0 es0Var3 = null;
            es0 es0Var4 = es0Var2;
            while (true) {
                e.getClass();
                if (es0Var4 == null) {
                    yc.d();
                    return null;
                }
                Unsafe unsafe3 = yi.a;
                long j3 = h;
                Object objectVolatile = unsafe3.getObjectVolatile(es0Var4, j3);
                if (objectVolatile != this) {
                    es0 es0Var5 = es0Var2;
                    es0Var = this;
                    if (es0Var.n()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof nd1)) {
                        objectVolatile.getClass();
                        es0Var3 = es0Var4;
                        es0Var4 = (es0) objectVolatile;
                    } else if (es0Var3 != null) {
                        es0 es0Var6 = ((nd1) objectVolatile).a;
                        do {
                            es0 es0Var7 = es0Var4;
                            unsafe = yi.a;
                            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(es0Var3, h, es0Var7, es0Var6);
                            es0Var4 = es0Var7;
                            if (zCompareAndSwapObject) {
                                this = es0Var;
                                es0Var4 = es0Var3;
                                es0Var2 = es0Var5;
                                es0Var3 = null;
                            }
                        } while (unsafe.getObjectVolatile(es0Var3, j3) == es0Var4);
                    } else {
                        if (es0Var4 == null) {
                            yc.d();
                            return null;
                        }
                        es0Var4 = (es0) unsafe3.getObjectVolatile(es0Var4, j2);
                    }
                    this = es0Var;
                    es0Var2 = es0Var5;
                } else {
                    if (es0Var2 == es0Var4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = yi.a;
                        es0 es0Var8 = this;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(es0Var8, i, es0Var2, es0Var4);
                        es0 es0Var9 = es0Var2;
                        es0Var = es0Var8;
                        if (zCompareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(es0Var, j2) != es0Var9) {
                            break;
                        }
                        this = es0Var;
                        es0Var2 = es0Var9;
                    }
                }
            }
            this = es0Var;
        }
    }

    public final void j(es0 es0Var) {
        es0 es0Var2;
        while (true) {
            f.getClass();
            if (es0Var == null) {
                yc.d();
                return;
            }
            Unsafe unsafe = yi.a;
            long j2 = i;
            es0 es0Var3 = (es0) unsafe.getObjectVolatile(es0Var, j2);
            if (this.k() != es0Var) {
                return;
            }
            while (es0Var != null) {
                Unsafe unsafe2 = yi.a;
                es0Var2 = this;
                es0 es0Var4 = es0Var;
                if (unsafe2.compareAndSwapObject(es0Var4, i, es0Var3, es0Var2)) {
                    if (es0Var2.n()) {
                        es0Var4.h();
                        return;
                    }
                    return;
                } else {
                    if (es0Var4 == null) {
                        yc.d();
                        return;
                    }
                    es0Var = es0Var4;
                    if (unsafe2.getObjectVolatile(es0Var4, j2) != es0Var3) {
                        break;
                    } else {
                        this = es0Var2;
                    }
                }
            }
            yc.d();
            return;
            this = es0Var2;
        }
    }

    public final Object k() {
        e.getClass();
        return yi.a.getObjectVolatile(this, h);
    }

    public final es0 l() {
        Object objK = k();
        nd1 nd1Var = objK instanceof nd1 ? (nd1) objK : null;
        if (nd1Var != null) {
            return nd1Var.a;
        }
        objK.getClass();
        return (es0) objK;
    }

    public final es0 m() {
        es0 es0VarH = h();
        if (es0VarH != null) {
            return es0VarH;
        }
        f.getClass();
        return i((es0) yi.a.getObjectVolatile(this, i));
    }

    public boolean n() {
        return k() instanceof nd1;
    }

    public final es0 o() {
        es0 es0Var;
        while (true) {
            Object objK = this.k();
            if (objK instanceof nd1) {
                return ((nd1) objK).a;
            }
            if (objK == this) {
                return (es0) objK;
            }
            objK.getClass();
            es0 es0Var2 = (es0) objK;
            nd1 nd1VarP = es0Var2.p();
            while (true) {
                e.getClass();
                Unsafe unsafe = yi.a;
                long j2 = h;
                es0Var = this;
                if (unsafe.compareAndSwapObject(es0Var, j2, objK, nd1VarP)) {
                    es0Var2.h();
                    return null;
                }
                if (unsafe.getObjectVolatile(es0Var, j2) != objK) {
                    break;
                }
                this = es0Var;
            }
            this = es0Var;
        }
    }

    public final nd1 p() {
        g.getClass();
        Unsafe unsafe = yi.a;
        long j2 = j;
        nd1 nd1Var = (nd1) unsafe.getObjectVolatile(this, j2);
        if (nd1Var != null) {
            return nd1Var;
        }
        nd1 nd1Var2 = new nd1(this);
        unsafe.putObjectVolatile(this, j2, nd1Var2);
        return nd1Var2;
    }

    public String toString() {
        return new ln0(1, 1, pv.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + pv.n(this);
    }
}
