package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class rh implements mj {
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(rh.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(rh.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(rh.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(rh.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(rh.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ AtomicReferenceFieldUpdater m;
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = yi.a;
        s = unsafe.objectFieldOffset(rh.class.getDeclaredField("sendSegment$volatile"));
        k = AtomicReferenceFieldUpdater.newUpdater(rh.class, Object.class, "receiveSegment$volatile");
        r = unsafe.objectFieldOffset(rh.class.getDeclaredField("receiveSegment$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(rh.class, Object.class, "bufferEndSegment$volatile");
        p = unsafe.objectFieldOffset(rh.class.getDeclaredField("bufferEndSegment$volatile"));
        m = AtomicReferenceFieldUpdater.newUpdater(rh.class, Object.class, "_closeCause$volatile");
        o = unsafe.objectFieldOffset(rh.class.getDeclaredField("_closeCause$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(rh.class, Object.class, "closeHandler$volatile");
        q = unsafe.objectFieldOffset(rh.class.getDeclaredField("closeHandler$volatile"));
    }

    public rh(int i2) {
        this.e = i2;
        if (i2 < 0) {
            yc.e(s91.h(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        yj yjVar = th.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = h.get(this);
        yj yjVar2 = new yj(0L, null, this, 3);
        this.sendSegment$volatile = yjVar2;
        this.receiveSegment$volatile = yjVar2;
        if (A()) {
            yjVar2 = th.a;
            yjVar2.getClass();
        }
        this.bufferEndSegment$volatile = yjVar2;
        this._closeCause$volatile = th.s;
    }

    public static Object D(rh rhVar, zu1 zu1Var) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        atomicReferenceFieldUpdater.getClass();
        if (rhVar == null) {
            yc.d();
            return null;
        }
        yj yjVar = (yj) yi.a.getObjectVolatile(rhVar, r);
        while (true) {
            rhVar.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            boolean z = true;
            if (rhVar.x(atomicLongFieldUpdater.get(rhVar), true)) {
                Throwable thP = rhVar.p();
                int i2 = ir1.a;
                throw thP;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(rhVar);
            long j2 = th.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (yjVar.e != j3) {
                yj yjVarL = rhVar.l(j3, yjVar);
                if (yjVarL == null) {
                    continue;
                } else {
                    yjVar = yjVarL;
                }
            }
            Object objI = rhVar.I(yjVar, i3, andIncrement, null);
            Object obj = th.m;
            if (objI == obj) {
                yc.l("unexpected");
                return null;
            }
            Object obj2 = th.o;
            if (objI != obj2) {
                if (objI != th.n) {
                    yjVar.a();
                    return objI;
                }
                xi xiVarU = s22.u(bl.E(zu1Var));
                try {
                    Object objI2 = rhVar.I(yjVar, i3, andIncrement, xiVarU);
                    if (objI2 == obj) {
                        xiVarU.a(yjVar, i3);
                    } else if (objI2 == obj2) {
                        if (andIncrement < rhVar.s()) {
                            yjVar.a();
                        }
                        yj yjVar2 = (yj) atomicReferenceFieldUpdater.get(rhVar);
                        while (true) {
                            if (rhVar.x(atomicLongFieldUpdater.get(rhVar), z)) {
                                xiVarU.g(new oe1(rhVar.p()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(rhVar);
                            long j4 = th.b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j5 = andIncrement2 / j4;
                            int i4 = (int) (andIncrement2 % j4);
                            if (yjVar2.e != j5) {
                                yj yjVarL2 = rhVar.l(j5, yjVar2);
                                if (yjVarL2 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    yjVar2 = yjVarL2;
                                }
                            }
                            Object objI3 = rhVar.I(yjVar2, i4, andIncrement2, xiVarU);
                            if (objI3 == th.m) {
                                xiVarU.a(yjVar2, i4);
                                break;
                            }
                            if (objI3 == th.o) {
                                if (andIncrement2 < rhVar.s()) {
                                    yjVar2.a();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (objI3 == th.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                yjVar2.a();
                                xiVarU.F(objI3, null);
                            }
                        }
                    } else {
                        yjVar.a();
                        xiVarU.F(objI2, null);
                    }
                    return xiVarU.t();
                } catch (Throwable th) {
                    xiVarU.D();
                    throw th;
                }
            }
            if (andIncrement < rhVar.s()) {
                yjVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object F(rh rhVar, Object obj, ks ksVar) throws IllegalAccessException, ly, InvocationTargetException {
        t32 t32Var;
        wt wtVar;
        Object objT;
        wt wtVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        atomicReferenceFieldUpdater.getClass();
        yj yjVar = (yj) yi.a.getObjectVolatile(rhVar, s);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(rhVar);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zX = rhVar.x(andIncrement, false);
            int i2 = th.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = yjVar.e;
            wt wtVar3 = wt.e;
            t32Var = t32.a;
            if (j5 != j4) {
                yj yjVarM = rhVar.m(j4, yjVar);
                if (yjVarM != null) {
                    yjVar = yjVarM;
                } else if (zX) {
                    Object objC = rhVar.C(ksVar, obj);
                    if (objC == wtVar3) {
                        return objC;
                    }
                }
            }
            int iD = d(rhVar, yjVar, i3, obj, j2, null, zX);
            if (iD == 0) {
                yjVar.a();
                return t32Var;
            }
            if (iD == 1) {
                break;
            }
            if (iD != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
                if (iD == 3) {
                    xi xiVarU = s22.u(bl.E(ksVar));
                    try {
                        int iD2 = d(rhVar, yjVar, i3, obj, j2, xiVarU, false);
                        if (iD2 != 0) {
                            if (iD2 == 1) {
                                wtVar = wtVar3;
                                xiVarU.g(t32Var);
                            } else if (iD2 != 2) {
                                if (iD2 == 4) {
                                    wtVar = wtVar3;
                                    if (j2 < atomicLongFieldUpdater2.get(rhVar)) {
                                        yjVar.a();
                                    }
                                } else {
                                    if (iD2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    yjVar.a();
                                    yj yjVar2 = (yj) atomicReferenceFieldUpdater.get(rhVar);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(rhVar);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean zX2 = rhVar.x(andIncrement2, false);
                                        int i4 = th.b;
                                        long j7 = i4;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        wtVar = wtVar3;
                                        if (yjVar2.e != j8) {
                                            yj yjVarM2 = rhVar.m(j8, yjVar2);
                                            if (yjVarM2 != null) {
                                                yjVar2 = yjVarM2;
                                            } else {
                                                if (zX2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                wtVar3 = wtVar;
                                            }
                                        }
                                        int iD3 = d(rhVar, yjVar2, i5, obj, j6, xiVarU, zX2);
                                        if (iD3 == 0) {
                                            yjVar2.a();
                                            break;
                                        }
                                        if (iD3 == 1) {
                                            break;
                                        }
                                        if (iD3 != 2) {
                                            if (iD3 == 3) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            if (iD3 != 4) {
                                                if (iD3 == 5) {
                                                    yjVar2.a();
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                wtVar3 = wtVar;
                                            } else if (j6 < atomicLongFieldUpdater2.get(rhVar)) {
                                                yjVar2.a();
                                            }
                                        } else if (zX2) {
                                            yjVar2.m();
                                        } else {
                                            xiVarU.a(yjVar2, i5 + i4);
                                        }
                                    }
                                }
                                b(rhVar, obj, xiVarU);
                            } else {
                                wtVar = wtVar3;
                                xiVarU.a(yjVar, i3 + i2);
                            }
                            objT = xiVarU.t();
                            wtVar2 = wtVar;
                            if (objT != wtVar2) {
                                objT = t32Var;
                            }
                            if (objT != wtVar2) {
                                return objT;
                            }
                        } else {
                            wtVar = wtVar3;
                            yjVar.a();
                        }
                        xiVarU.g(t32Var);
                        objT = xiVarU.t();
                        wtVar2 = wtVar;
                        if (objT != wtVar2) {
                        }
                        if (objT != wtVar2) {
                            break;
                        }
                    } catch (Throwable th) {
                        xiVarU.D();
                        throw th;
                    }
                } else if (iD == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(rhVar)) {
                        yjVar.a();
                    }
                    Object objC2 = rhVar.C(ksVar, obj);
                    if (objC2 == wtVar3) {
                        return objC2;
                    }
                } else if (iD == 5) {
                    yjVar.a();
                }
            } else if (zX) {
                yjVar.m();
                Object objC3 = rhVar.C(ksVar, obj);
                if (objC3 == wtVar3) {
                    return objC3;
                }
            }
        }
        return t32Var;
    }

    public static boolean H(Object obj) {
        if (!(obj instanceof vi)) {
            yc.g(obj, "Unexpected waiter: ");
            return false;
        }
        vi viVar = (vi) obj;
        yj yjVar = th.a;
        s30 s30VarK = viVar.k(t32.a, null);
        if (s30VarK == null) {
            return false;
        }
        viVar.z(s30VarK);
        return true;
    }

    public static final void b(rh rhVar, Object obj, xi xiVar) throws IllegalAccessException, ly, InvocationTargetException {
        xiVar.g(new oe1(rhVar.q()));
    }

    public static final int d(rh rhVar, yj yjVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        yjVar.r(i2, obj);
        if (z) {
            return rhVar.J(yjVar, i2, obj, j2, obj2, z);
        }
        Object objP = yjVar.p(i2);
        if (objP == null) {
            if (rhVar.e(j2)) {
                if (yjVar.o(i2, null, th.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (yjVar.o(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objP instanceof a72) {
            yjVar.r(i2, null);
            if (rhVar.G(objP, obj)) {
                yjVar.s(i2, th.i);
                return 0;
            }
            s30 s30Var = th.k;
            if (yjVar.h.getAndSet((i2 * 2) + 1, s30Var) == s30Var) {
                return 5;
            }
            yjVar.q(i2, true);
            return 5;
        }
        return rhVar.J(yjVar, i2, obj, j2, obj2, z);
    }

    public static void v(rh rhVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if ((atomicLongFieldUpdater.addAndGet(rhVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(rhVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j2 = h.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r5.j() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r5.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j2, yj yjVar) {
        rh rhVar;
        yj yjVar2;
        yj yjVar3;
        while (yjVar.e < j2 && (yjVar3 = (yj) yjVar.c()) != null) {
            yjVar = yjVar3;
        }
        while (true) {
            yj yjVar4 = yjVar;
            while (yjVar4.f() && (yjVar2 = (yj) yjVar4.c()) != null) {
                yjVar4 = yjVar2;
            }
            while (true) {
                l.getClass();
                Unsafe unsafe = yi.a;
                long j3 = p;
                ek1 ek1Var = (ek1) unsafe.getObjectVolatile(this, j3);
                if (ek1Var.e >= yjVar4.e) {
                    return;
                }
                if (!yjVar4.n()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = yi.a;
                    rhVar = this;
                    if (unsafe2.compareAndSwapObject(rhVar, p, ek1Var, yjVar4)) {
                        if (ek1Var.j()) {
                            ek1Var.h();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(rhVar, j3) != ek1Var) {
                        break;
                    } else {
                        this = rhVar;
                    }
                }
                this = rhVar;
            }
            yjVar = yjVar4;
        }
    }

    public final Object C(ks ksVar, Object obj) throws IllegalAccessException, ly, InvocationTargetException {
        xi xiVar = new xi(1, bl.E(ksVar));
        xiVar.v();
        xiVar.g(new oe1(q()));
        Object objT = xiVar.t();
        return objT == wt.e ? objT : t32.a;
    }

    public final void E(a72 a72Var, boolean z) throws IllegalAccessException, ly, InvocationTargetException {
        if (a72Var instanceof vi) {
            ((ks) a72Var).g(new oe1(z ? p() : q()));
            return;
        }
        if (!(a72Var instanceof qh)) {
            yc.g(a72Var, "Unexpected waiter: ");
            return;
        }
        qh qhVar = (qh) a72Var;
        xi xiVar = qhVar.f;
        xiVar.getClass();
        qhVar.f = null;
        qhVar.e = th.l;
        Throwable thO = qhVar.g.o();
        if (thO == null) {
            xiVar.g(Boolean.FALSE);
        } else {
            xiVar.g(new oe1(thO));
        }
    }

    public final boolean G(Object obj, Object obj2) throws ly {
        if (!(obj instanceof qh)) {
            if (!(obj instanceof vi)) {
                yc.g(obj, "Unexpected receiver type: ");
                return false;
            }
            vi viVar = (vi) obj;
            yj yjVar = th.a;
            s30 s30VarK = viVar.k(obj2, null);
            if (s30VarK == null) {
                return false;
            }
            viVar.z(s30VarK);
            return true;
        }
        qh qhVar = (qh) obj;
        xi xiVar = qhVar.f;
        xiVar.getClass();
        qhVar.f = null;
        qhVar.e = obj2;
        Boolean bool = Boolean.TRUE;
        yj yjVar2 = th.a;
        s30 s30VarK2 = xiVar.k(bool, null);
        if (s30VarK2 == null) {
            return false;
        }
        xiVar.z(s30VarK2);
        return true;
    }

    public final Object I(yj yjVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = yjVar.h;
        Object objP = yjVar.p(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if (objP == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return th.n;
                }
                if (yjVar.o(i2, objP, obj)) {
                    j();
                    return th.m;
                }
            }
        } else if (objP == th.d && yjVar.o(i2, objP, th.i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            yjVar.r(i2, null);
            return obj2;
        }
        while (true) {
            Object objP2 = yjVar.p(i2);
            if (objP2 == null || objP2 == th.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (yjVar.o(i2, objP2, th.h)) {
                        j();
                        return th.o;
                    }
                } else {
                    if (obj == null) {
                        return th.n;
                    }
                    if (yjVar.o(i2, objP2, obj)) {
                        j();
                        return th.m;
                    }
                }
            } else if (objP2 != th.d) {
                s30 s30Var = th.j;
                if (objP2 == s30Var) {
                    return th.o;
                }
                if (objP2 == th.h) {
                    return th.o;
                }
                if (objP2 == th.l) {
                    j();
                    return th.o;
                }
                if (objP2 != th.g && yjVar.o(i2, objP2, th.f)) {
                    boolean z = objP2 instanceof b72;
                    if (z) {
                        objP2 = ((b72) objP2).a;
                    }
                    if (H(objP2)) {
                        yjVar.s(i2, th.i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        yjVar.r(i2, null);
                        return obj3;
                    }
                    yjVar.s(i2, s30Var);
                    yjVar.m();
                    if (z) {
                        j();
                    }
                    return th.o;
                }
            } else if (yjVar.o(i2, objP2, th.i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                yjVar.r(i2, null);
                return obj4;
            }
        }
    }

    public final int J(yj yjVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objP = yjVar.p(i2);
            if (objP == null) {
                if (!e(j2) || z) {
                    if (z) {
                        if (yjVar.o(i2, null, th.j)) {
                            yjVar.m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (yjVar.o(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (yjVar.o(i2, null, th.d)) {
                    break;
                }
            } else {
                if (objP != th.e) {
                    s30 s30Var = th.k;
                    if (objP == s30Var) {
                        yjVar.r(i2, null);
                        return 5;
                    }
                    if (objP == th.h) {
                        yjVar.r(i2, null);
                        return 5;
                    }
                    if (objP == th.l) {
                        yjVar.r(i2, null);
                        y();
                        return 4;
                    }
                    yjVar.r(i2, null);
                    if (objP instanceof b72) {
                        objP = ((b72) objP).a;
                    }
                    if (G(objP, obj)) {
                        yjVar.s(i2, th.i);
                        return 0;
                    }
                    if (yjVar.h.getAndSet((i2 * 2) + 1, s30Var) != s30Var) {
                        yjVar.q(i2, true);
                    }
                    return 5;
                }
                if (yjVar.o(i2, objP, th.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void K(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        rh rhVar = this;
        if (rhVar.A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = h;
            if (atomicLongFieldUpdater.get(rhVar) > j2) {
                break;
            } else {
                rhVar = this;
            }
        }
        int i2 = th.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(rhVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(rhVar)) && j3 == atomicLongFieldUpdater.get(rhVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(rhVar);
                    if (atomicLongFieldUpdater2.compareAndSet(rhVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        rhVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(rhVar);
                    long j6 = atomicLongFieldUpdater2.get(rhVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(rhVar)) {
                        break;
                    }
                    if (z) {
                        rhVar = this;
                    } else {
                        rhVar = this;
                        atomicLongFieldUpdater2.compareAndSet(rhVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(rhVar);
                    if (atomicLongFieldUpdater2.compareAndSet(rhVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        rhVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.mj
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    @Override // defpackage.im1
    public Object c(ks ksVar, Object obj) {
        return F(this, obj, ksVar);
    }

    public final boolean e(long j2) {
        return j2 < h.get(this) || j2 < g.get(this) + ((long) this.e);
    }

    public final yj f() {
        l.getClass();
        Unsafe unsafe = yi.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, p);
        j.getClass();
        yj yjVar = (yj) unsafe.getObjectVolatile(this, s);
        if (yjVar.e > ((yj) objectVolatile).e) {
            objectVolatile = yjVar;
        }
        k.getClass();
        yj yjVar2 = (yj) unsafe.getObjectVolatile(this, r);
        if (yjVar2.e > ((yj) objectVolatile).e) {
            objectVolatile = yjVar2;
        }
        fq fqVar = (fq) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fq.a;
            Object objD = fqVar.d();
            if (objD == u4.i) {
                break;
            }
            fq fqVar2 = (fq) objD;
            if (fqVar2 != null) {
                fqVar = fqVar2;
            } else if (fqVar.g()) {
                break;
            }
        }
        return (yj) fqVar;
    }

    public final boolean g(Throwable th, boolean z) {
        rh rhVar;
        boolean z2;
        long j2;
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if (z) {
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                yj yjVar = th.a;
                rhVar = this;
                if (atomicLongFieldUpdater.compareAndSet(rhVar, j5, (j5 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = rhVar;
            }
        } else {
            rhVar = this;
        }
        s30 s30Var = th.s;
        while (true) {
            m.getClass();
            rh rhVar2 = rhVar;
            Unsafe unsafe = yi.a;
            long j6 = o;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(rhVar2, j6, s30Var, th2);
            rhVar = rhVar2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(rhVar, j6) != s30Var) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(rhVar);
            } while (!atomicLongFieldUpdater.compareAndSet(rhVar, j4, 3458764513820540928L + (j4 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(rhVar);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = (j2 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (j2 & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(rhVar, j2, j3));
        }
        rhVar.y();
        if (z2) {
            rhVar.w();
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = (defpackage.yj) r1.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yj h(long j2) throws IllegalAccessException, ly, InvocationTargetException {
        long j3;
        yj yjVarF = f();
        if (z()) {
            yj yjVar = yjVarF;
            loop0: do {
                int i2 = th.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (yjVar.e * ((long) th.b)) + ((long) i2);
                    if (j3 < g.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object objP = yjVar.p(i2);
                        if (objP != null && objP != th.e) {
                            if (objP == th.d) {
                                break loop0;
                            }
                        } else {
                            if (yjVar.o(i2, objP, th.l)) {
                                yjVar.m();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (yjVar != null);
            j3 = -1;
            if (j3 != -1) {
                i(j3);
            }
        }
        Object objJ = null;
        loop3: for (yj yjVar2 = yjVarF; yjVar2 != null; yjVar2 = (yj) yjVar2.e()) {
            for (int i3 = th.b - 1; -1 < i3; i3--) {
                if ((yjVar2.e * ((long) th.b)) + ((long) i3) < j2) {
                    break loop3;
                }
                while (true) {
                    Object objP2 = yjVar2.p(i3);
                    if (objP2 != null && objP2 != th.e) {
                        if (!(objP2 instanceof b72)) {
                            if (!(objP2 instanceof a72)) {
                                break;
                            }
                            if (yjVar2.o(i3, objP2, th.l)) {
                                objJ = el.J(objJ, objP2);
                                yjVar2.q(i3, true);
                                break;
                            }
                        } else {
                            if (yjVar2.o(i3, objP2, th.l)) {
                                objJ = el.J(objJ, ((b72) objP2).a);
                                yjVar2.q(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (yjVar2.o(i3, objP2, th.l)) {
                            yjVar2.m();
                            break;
                        }
                    }
                }
            }
        }
        if (objJ != null) {
            if (!(objJ instanceof ArrayList)) {
                E((a72) objJ, true);
                return yjVarF;
            }
            ArrayList arrayList = (ArrayList) objJ;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                E((a72) arrayList.get(size), true);
            }
        }
        return yjVarF;
    }

    public final void i(long j2) {
        k.getClass();
        yj yjVar = (yj) yi.a.getObjectVolatile(this, r);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.e) + j3, h.get(this))) {
                return;
            }
            rh rhVar = this;
            if (atomicLongFieldUpdater.compareAndSet(rhVar, j3, 1 + j3)) {
                long j4 = th.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (yjVar.e != j5) {
                    yj yjVarL = rhVar.l(j5, yjVar);
                    if (yjVarL != null) {
                        yjVar = yjVarL;
                    }
                }
                yj yjVar2 = yjVar;
                if (rhVar.I(yjVar2, i2, j3, null) != th.o || j3 < rhVar.s()) {
                    yjVar2.a();
                }
                this = rhVar;
                yjVar = yjVar2;
            }
            this = rhVar;
        }
    }

    @Override // defpackage.mj
    public final qh iterator() {
        return new qh(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        v(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        int i2;
        boolean z;
        Object objP;
        if (A()) {
            return;
        }
        l.getClass();
        yj yjVar = (yj) yi.a.getObjectVolatile(this, p);
        loop0: while (true) {
            long andIncrement = h.getAndIncrement(this);
            long j2 = th.b;
            long j3 = andIncrement / j2;
            if (this.s() <= andIncrement) {
                if (yjVar.e < j3 && yjVar.c() != null) {
                    this.B(j3, yjVar);
                }
                v(this);
                return;
            }
            rh rhVar = this;
            if (yjVar.e == j3) {
                i2 = (int) (andIncrement % j2);
                Object objP2 = yjVar.p(i2);
                z = objP2 instanceof a72;
                AtomicLongFieldUpdater atomicLongFieldUpdater = g;
                if (z || andIncrement < atomicLongFieldUpdater.get(rhVar) || !yjVar.o(i2, objP2, th.g)) {
                    while (true) {
                        objP = yjVar.p(i2);
                        if (objP instanceof a72) {
                            if (objP != th.j) {
                                if (objP != null) {
                                    if (objP == th.d || objP == th.h || objP == th.i || objP == th.k || objP == th.l) {
                                        break loop0;
                                    } else if (objP != th.f) {
                                        yc.g(objP, "Unexpected cell state: ");
                                        return;
                                    }
                                } else if (yjVar.o(i2, objP, th.e)) {
                                    break loop0;
                                }
                            } else {
                                break;
                            }
                        } else if (andIncrement < atomicLongFieldUpdater.get(rhVar)) {
                            if (yjVar.o(i2, objP, new b72((a72) objP))) {
                                break loop0;
                            }
                        } else if (yjVar.o(i2, objP, th.g)) {
                            if (H(objP)) {
                                yjVar.s(i2, th.d);
                                break;
                            } else {
                                yjVar.s(i2, th.j);
                                yjVar.m();
                            }
                        }
                    }
                } else if (H(objP2)) {
                    yjVar.s(i2, th.d);
                    break;
                } else {
                    yjVar.s(i2, th.j);
                    yjVar.m();
                    v(rhVar);
                }
            } else {
                yj yjVarK = rhVar.k(j3, yjVar, andIncrement);
                if (yjVarK == null) {
                    continue;
                } else {
                    yjVar = yjVarK;
                    i2 = (int) (andIncrement % j2);
                    Object objP22 = yjVar.p(i2);
                    z = objP22 instanceof a72;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
                    if (z) {
                        while (true) {
                            objP = yjVar.p(i2);
                            if (objP instanceof a72) {
                            }
                        }
                    }
                }
            }
            this = rhVar;
        }
    }

    public final yj k(long j2, yj yjVar, long j3) {
        Object objH;
        Unsafe unsafe;
        yj yjVar2 = th.a;
        sh shVar = sh.l;
        loop0: while (true) {
            objH = u4.h(yjVar, j2, shVar);
            if (!kd1.u(objH)) {
                ek1 ek1VarN = kd1.n(objH);
                while (true) {
                    l.getClass();
                    Unsafe unsafe2 = yi.a;
                    long j4 = p;
                    ek1 ek1Var = (ek1) unsafe2.getObjectVolatile(this, j4);
                    if (ek1Var.e >= ek1VarN.e) {
                        break loop0;
                    }
                    if (!ek1VarN.n()) {
                        break;
                    }
                    do {
                        unsafe = yi.a;
                        if (unsafe.compareAndSwapObject(this, p, ek1Var, ek1VarN)) {
                            if (ek1Var.j()) {
                                ek1Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == ek1Var);
                    if (ek1VarN.j()) {
                        ek1VarN.h();
                    }
                }
            } else {
                break;
            }
        }
        if (kd1.u(objH)) {
            y();
            B(j2, yjVar);
            v(this);
            return null;
        }
        yj yjVar3 = (yj) kd1.n(objH);
        long j5 = yjVar3.e;
        if (j5 <= j2) {
            return yjVar3;
        }
        long j6 = j5 * ((long) th.b);
        if (!h.compareAndSet(this, j3 + 1, j6)) {
            v(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if ((atomicLongFieldUpdater.addAndGet(this, j6 - j3) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r8.j() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r8.h();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yj l(long j2, yj yjVar) {
        Object objH;
        yj yjVar2;
        long j3;
        Unsafe unsafe;
        yj yjVar3 = th.a;
        sh shVar = sh.l;
        loop0: while (true) {
            objH = u4.h(yjVar, j2, shVar);
            if (!kd1.u(objH)) {
                ek1 ek1VarN = kd1.n(objH);
                while (true) {
                    k.getClass();
                    Unsafe unsafe2 = yi.a;
                    long j4 = r;
                    ek1 ek1Var = (ek1) unsafe2.getObjectVolatile(this, j4);
                    if (ek1Var.e >= ek1VarN.e) {
                        break loop0;
                    }
                    if (!ek1VarN.n()) {
                        break;
                    }
                    do {
                        unsafe = yi.a;
                        if (unsafe.compareAndSwapObject(this, r, ek1Var, ek1VarN)) {
                            if (ek1Var.j()) {
                                ek1Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == ek1Var);
                    if (ek1VarN.j()) {
                        ek1VarN.h();
                    }
                }
            } else {
                break;
            }
        }
        if (kd1.u(objH)) {
            y();
            if (yjVar.e * ((long) th.b) < s()) {
                yjVar.a();
                return null;
            }
        } else {
            yj yjVar4 = (yj) kd1.n(objH);
            long j5 = yjVar4.e;
            if (A() || j2 > h.get(this) / ((long) th.b)) {
                yjVar2 = yjVar4;
                if (j5 > j2) {
                    return yjVar2;
                }
                long j6 = j5 * ((long) th.b);
                do {
                    j3 = g.get(this);
                    if (j3 >= j6) {
                        break;
                    }
                } while (!g.compareAndSet(this, j3, j6));
                if (j5 * ((long) th.b) < s()) {
                    yjVar2.a();
                }
            } else {
                while (true) {
                    l.getClass();
                    Unsafe unsafe3 = yi.a;
                    long j7 = p;
                    ek1 ek1Var2 = (ek1) unsafe3.getObjectVolatile(this, j7);
                    if (ek1Var2.e >= j5 || !yjVar4.n()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = yi.a;
                        yjVar2 = yjVar4;
                        if (unsafe4.compareAndSwapObject(this, p, ek1Var2, yjVar4)) {
                            if (ek1Var2.j()) {
                                ek1Var2.h();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j7) != ek1Var2) {
                                break;
                            }
                            yjVar4 = yjVar2;
                        }
                    }
                    yjVar4 = yjVar2;
                }
                if (j5 > j2) {
                }
            }
        }
        return null;
    }

    public final yj m(long j2, yj yjVar) {
        Object objH;
        long j3;
        long j4;
        Unsafe unsafe;
        yj yjVar2 = th.a;
        sh shVar = sh.l;
        loop0: while (true) {
            objH = u4.h(yjVar, j2, shVar);
            if (!kd1.u(objH)) {
                ek1 ek1VarN = kd1.n(objH);
                while (true) {
                    j.getClass();
                    Unsafe unsafe2 = yi.a;
                    long j5 = s;
                    ek1 ek1Var = (ek1) unsafe2.getObjectVolatile(this, j5);
                    if (ek1Var.e >= ek1VarN.e) {
                        break loop0;
                    }
                    if (!ek1VarN.n()) {
                        break;
                    }
                    do {
                        unsafe = yi.a;
                        if (unsafe.compareAndSwapObject(this, s, ek1Var, ek1VarN)) {
                            if (ek1Var.j()) {
                                ek1Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j5) == ek1Var);
                    if (ek1VarN.j()) {
                        ek1VarN.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean zU = kd1.u(objH);
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if (zU) {
            y();
            if (yjVar.e * ((long) th.b) < atomicLongFieldUpdater.get(this)) {
                yjVar.a();
                return null;
            }
        } else {
            yj yjVar3 = (yj) kd1.n(objH);
            long j6 = yjVar3.e;
            if (j6 <= j2) {
                return yjVar3;
            }
            long j7 = j6 * ((long) th.b);
            do {
                j3 = f.get(this);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j7) {
                    break;
                }
            } while (!f.compareAndSet(this, j3, j4 + (((long) ((int) (j3 >> 60))) << 60)));
            if (j6 * ((long) th.b) < atomicLongFieldUpdater.get(this)) {
                yjVar3.a();
            }
        }
        return null;
    }

    @Override // defpackage.mj
    public final Object n(zu1 zu1Var) {
        return D(this, zu1Var);
    }

    public final Throwable o() {
        m.getClass();
        return (Throwable) yi.a.getObjectVolatile(this, o);
    }

    public final Throwable p() {
        Throwable thO = o();
        return thO == null ? new gl("Channel was closed") : thO;
    }

    public final Throwable q() {
        Throwable thO = o();
        return thO == null ? new hl("Channel was closed") : thO;
    }

    @Override // defpackage.mj
    public final Object r() {
        yj yjVar;
        xj xjVar = nu0.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (x(j3, true)) {
            return new wj(o());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return xjVar;
        }
        Object obj = th.k;
        k.getClass();
        yj yjVar2 = (yj) yi.a.getObjectVolatile(this, r);
        while (!this.x(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = th.b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (yjVar2.e != j5) {
                yj yjVarL = this.l(j5, yjVar2);
                if (yjVarL == null) {
                    continue;
                } else {
                    yjVar = yjVarL;
                }
            } else {
                yjVar = yjVar2;
            }
            rh rhVar = this;
            Object objI = rhVar.I(yjVar, i2, andIncrement, obj);
            yjVar2 = yjVar;
            if (objI == th.m) {
                a72 a72Var = obj instanceof a72 ? (a72) obj : null;
                if (a72Var != null) {
                    a72Var.a(yjVar2, i2);
                }
                rhVar.K(andIncrement);
                yjVar2.m();
                return xjVar;
            }
            if (objI != th.o) {
                if (objI != th.n) {
                    yjVar2.a();
                    return objI;
                }
                yc.l("unexpected");
                return null;
            }
            if (andIncrement < rhVar.s()) {
                yjVar2.a();
            }
            this = rhVar;
        }
        return new wj(this.o());
    }

    public final long s() {
        return f.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3 A[SYNTHETIC] */
    @Override // defpackage.im1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Object obj) throws IllegalAccessException, ly, InvocationTargetException {
        int iD;
        xj xjVar = nu0.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        boolean z = false;
        long j2 = 1152921504606846975L;
        if (x(atomicLongFieldUpdater.get(this), false) ? false : !e(r1 & 1152921504606846975L)) {
            return xjVar;
        }
        Object obj2 = th.j;
        j.getClass();
        yj yjVar = (yj) yi.a.getObjectVolatile(this, s);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zX = x(andIncrement, z);
            int i2 = th.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (yjVar.e == j5) {
                iD = d(this, yjVar, i3, obj, j3, obj2, zX);
                t32 t32Var = t32.a;
                if (iD != 0) {
                    yjVar.a();
                    return t32Var;
                }
                if (iD == 1) {
                    return t32Var;
                }
                if (iD == 2) {
                    if (zX) {
                        yjVar.m();
                        return new wj(q());
                    }
                    a72 a72Var = obj2 instanceof a72 ? (a72) obj2 : null;
                    if (a72Var != null) {
                        a72Var.a(yjVar, i3 + i2);
                    }
                    yjVar.m();
                    return xjVar;
                }
                if (iD == 3) {
                    yc.l("unexpected");
                    return null;
                }
                if (iD == 4) {
                    if (j3 < g.get(this)) {
                        yjVar.a();
                    }
                    return new wj(q());
                }
                if (iD == 5) {
                    yjVar.a();
                }
                z = false;
            } else {
                yj yjVarM = m(j5, yjVar);
                if (yjVarM != null) {
                    yjVar = yjVarM;
                    iD = d(this, yjVar, i3, obj, j3, obj2, zX);
                    t32 t32Var2 = t32.a;
                    if (iD != 0) {
                    }
                } else {
                    if (zX) {
                        return new wj(q());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a9, code lost:
    
        r15 = r8;
        r16 = null;
        r3 = (defpackage.yj) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b3, code lost:
    
        if (r3 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i2;
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.e + ',');
        sb.append("data=[");
        k.getClass();
        Unsafe unsafe = yi.a;
        int i4 = 0;
        j.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, s);
        int i5 = 1;
        l.getClass();
        List listH = hk.H(unsafe.getObjectVolatile(this, r), objectVolatile, unsafe.getObjectVolatile(this, p));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (((yj) obj) != th.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            yc.m();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((yj) next).e;
            do {
                Object next2 = it.next();
                long j3 = ((yj) next2).e;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        yj yjVar = (yj) next;
        long j4 = g.get(this);
        long jS = s();
        loop2: while (true) {
            int i6 = th.b;
            int i7 = i4;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                i2 = i5;
                long j5 = (yjVar.e * ((long) th.b)) + ((long) i7);
                if (j5 >= jS && j5 >= j4) {
                    str = null;
                    break loop2;
                }
                Object objP = yjVar.p(i7);
                Object obj2 = yjVar.h.get(i7 * 2);
                if (objP instanceof vi) {
                    string = (jS > j5 || j5 >= j4) ? (j4 > j5 || j5 >= jS) ? "cont" : "send" : "receive";
                } else if (objP instanceof b72) {
                    string = "EB(" + objP + ')';
                } else if (xi0.o(objP, th.f) || xi0.o(objP, th.g)) {
                    string = "resuming_sender";
                } else if (objP == null || objP.equals(th.e) || objP.equals(th.i) || objP.equals(th.h) || objP.equals(th.k) || objP.equals(th.j) || objP.equals(th.l)) {
                    i7++;
                    i5 = i2;
                } else {
                    string = objP.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i7++;
                i5 = i2;
            }
            i5 = i2;
            i4 = 0;
        }
        if (sb.length() == 0) {
            yc.h("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - i2) == ',') {
            sb.deleteCharAt(sb.length() - i2).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        while (true) {
            k.getClass();
            Unsafe unsafe = yi.a;
            long j2 = r;
            yj yjVarL = (yj) unsafe.getObjectVolatile(this, j2);
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (s() <= j3) {
                return false;
            }
            long j4 = th.b;
            long j5 = j3 / j4;
            if (yjVarL.e == j5 || (yjVarL = l(j5, yjVarL)) != null) {
                yjVarL.a();
                int i2 = (int) (j3 % j4);
                while (true) {
                    Object objP = yjVarL.p(i2);
                    if (objP == null || objP == th.e) {
                        if (yjVarL.o(i2, objP, th.h)) {
                            j();
                            break;
                        }
                    } else {
                        if (objP == th.d) {
                            return true;
                        }
                        if (objP != th.j && objP != th.l && objP != th.i && objP != th.h) {
                            if (objP == th.g) {
                                return true;
                            }
                            if (objP != th.f && j3 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                g.compareAndSet(this, j3, j3 + 1);
            } else if (((yj) unsafe.getObjectVolatile(this, j2)).e < j5) {
                return false;
            }
        }
    }

    public final void w() {
        Object objectVolatile;
        rh rhVar;
        loop0: while (true) {
            n.getClass();
            Unsafe unsafe = yi.a;
            long j2 = q;
            objectVolatile = unsafe.getObjectVolatile(this, j2);
            s30 s30Var = objectVolatile == null ? th.q : th.r;
            while (true) {
                Unsafe unsafe2 = yi.a;
                rhVar = this;
                if (unsafe2.compareAndSwapObject(rhVar, q, objectVolatile, s30Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(rhVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = rhVar;
                }
            }
            this = rhVar;
        }
        if (objectVolatile == null) {
            return;
        }
        s22.i(1, objectVolatile);
        ((sa0) objectVolatile).i(rhVar.o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        r10 = (defpackage.yj) r10.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(long j2, boolean z) throws IllegalAccessException, ly, InvocationTargetException {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                h(j2 & 1152921504606846975L);
                if (!z || !u()) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(s91.i("unexpected close status: ", i2).toString());
                }
                yj yjVarH = h(j2 & 1152921504606846975L);
                Object objJ = null;
                loop0: do {
                    int i3 = th.b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j3 = (yjVarH.e * ((long) th.b)) + ((long) i3);
                        while (true) {
                            Object objP = yjVarH.p(i3);
                            if (objP == th.i) {
                                break loop0;
                            }
                            s30 s30Var = th.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
                            if (objP != s30Var) {
                                if (objP != th.e && objP != null) {
                                    if (!(objP instanceof a72) && !(objP instanceof b72)) {
                                        s30 s30Var2 = th.g;
                                        if (objP == s30Var2 || objP == th.f) {
                                            break loop0;
                                        }
                                        if (objP != s30Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j3 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        a72 a72Var = objP instanceof b72 ? ((b72) objP).a : (a72) objP;
                                        if (yjVarH.o(i3, objP, th.l)) {
                                            objJ = el.J(objJ, a72Var);
                                            yjVarH.r(i3, null);
                                            yjVarH.m();
                                            break;
                                        }
                                    }
                                } else {
                                    if (yjVarH.o(i3, objP, th.l)) {
                                        yjVarH.m();
                                        break;
                                    }
                                }
                            } else {
                                if (j3 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (yjVarH.o(i3, objP, th.l)) {
                                    yjVarH.r(i3, null);
                                    yjVarH.m();
                                    break;
                                }
                            }
                        }
                        i3--;
                    }
                } while (yjVarH != null);
                if (objJ != null) {
                    if (objJ instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objJ;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            E((a72) arrayList.get(size), false);
                        }
                    } else {
                        E((a72) objJ, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean y() {
        return x(f.get(this), false);
    }

    public boolean z() {
        return false;
    }
}
