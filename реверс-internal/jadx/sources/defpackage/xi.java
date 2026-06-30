package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class xi extends oy implements vi, xt, a72 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(xi.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(xi.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final ks h;
    public final lt i;

    static {
        Unsafe unsafe = yi.a;
        n = unsafe.objectFieldOffset(xi.class.getDeclaredField("_state$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(xi.class, Object.class, "_parentHandle$volatile");
        m = unsafe.objectFieldOffset(xi.class.getDeclaredField("_parentHandle$volatile"));
    }

    public xi(int i, ks ksVar) {
        super(i);
        this.h = ksVar;
        this.i = ksVar.e();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = z1.a;
    }

    public static void B(n01 n01Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + n01Var + ", already has " + obj).toString());
    }

    public static Object I(n01 n01Var, Object obj, int i, xa0 xa0Var) {
        if (obj instanceof on) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (xa0Var != null || (n01Var instanceof si)) {
            return new mn(obj, n01Var instanceof si ? (si) n01Var : null, xa0Var, (Throwable) null, 16);
        }
        return obj;
    }

    public final boolean A() {
        return this.g == 2 && ((my) this.h).p();
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        Throwable thR;
        ks ksVar = this.h;
        my myVar = ksVar instanceof my ? (my) ksVar : null;
        if (myVar == null || (thR = myVar.r(this)) == null) {
            return;
        }
        p();
        m(thR);
    }

    public final boolean E() {
        k.getClass();
        Unsafe unsafe = yi.a;
        long j2 = n;
        Object objectVolatile = unsafe.getObjectVolatile(this, j2);
        if ((objectVolatile instanceof mn) && ((mn) objectVolatile).d != null) {
            p();
            return false;
        }
        j.set(this, 536870911);
        unsafe.putObjectVolatile(this, j2, z1.a);
        return true;
    }

    public final void F(Object obj, xa0 xa0Var) throws IllegalAccessException, ly, InvocationTargetException {
        G(obj, this.g, xa0Var);
    }

    public final void G(Object obj, int i, xa0 xa0Var) throws IllegalAccessException, ly, InvocationTargetException {
        xi xiVar;
        while (true) {
            k.getClass();
            Unsafe unsafe = yi.a;
            long j2 = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof n01)) {
                xi xiVar2 = this;
                if (objectVolatile instanceof aj) {
                    aj ajVar = (aj) objectVolatile;
                    if (aj.c.compareAndSet(ajVar, 0, 1)) {
                        if (xa0Var != null) {
                            xiVar2.n(xa0Var, ajVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                yc.g(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objI = I((n01) objectVolatile, obj, i, xa0Var);
            while (true) {
                Unsafe unsafe2 = yi.a;
                xiVar = this;
                if (unsafe2.compareAndSwapObject(xiVar, n, objectVolatile, objI)) {
                    if (!xiVar.A()) {
                        xiVar.p();
                    }
                    xiVar.q(i);
                    return;
                } else if (unsafe2.getObjectVolatile(xiVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = xiVar;
                }
            }
            this = xiVar;
        }
    }

    public final void H(ot otVar) throws IllegalAccessException, ly, InvocationTargetException {
        ks ksVar = this.h;
        my myVar = ksVar instanceof my ? (my) ksVar : null;
        G(t32.a, (myVar != null ? myVar.h : null) == otVar ? 4 : this.g, null);
    }

    public final s30 J(Object obj, xa0 xa0Var) {
        xi xiVar;
        s30 s30Var = wi0.e;
        while (true) {
            k.getClass();
            Unsafe unsafe = yi.a;
            long j2 = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof n01)) {
                return null;
            }
            Object objI = I((n01) objectVolatile, obj, this.g, xa0Var);
            while (true) {
                Unsafe unsafe2 = yi.a;
                xiVar = this;
                if (unsafe2.compareAndSwapObject(xiVar, n, objectVolatile, objI)) {
                    if (!xiVar.A()) {
                        xiVar.p();
                    }
                    return s30Var;
                }
                if (unsafe2.getObjectVolatile(xiVar, j2) != objectVolatile) {
                    break;
                }
                this = xiVar;
            }
            this = xiVar;
        }
    }

    @Override // defpackage.a72
    public final void a(ek1 ek1Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = j;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                yc.l("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        y(ek1Var);
    }

    @Override // defpackage.oy
    public final void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        xi xiVar;
        while (true) {
            k.getClass();
            Unsafe unsafe = yi.a;
            long j2 = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (objectVolatile instanceof n01) {
                yc.l("Not completed");
                return;
            }
            if (objectVolatile instanceof on) {
                return;
            }
            if (objectVolatile instanceof mn) {
                mn mnVar = (mn) objectVolatile;
                if (mnVar.e != null) {
                    yc.l("Must be called at most once");
                    return;
                }
                mn mnVarA = mn.a(mnVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = yi.a;
                    xi xiVar2 = this;
                    if (unsafe2.compareAndSwapObject(xiVar2, n, objectVolatile, mnVarA)) {
                        si siVar = mnVar.b;
                        if (siVar != null) {
                            xiVar2.l(siVar, cancellationException);
                        }
                        xa0 xa0Var = mnVar.c;
                        if (xa0Var != null) {
                            xiVar2.n(xa0Var, cancellationException, mnVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(xiVar2, j2) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        xiVar = xiVar2;
                        break;
                    }
                    this = xiVar2;
                }
            } else {
                xi xiVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                mn mnVar2 = new mn(objectVolatile, (si) null, (xa0) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    mn mnVar3 = mnVar2;
                    Unsafe unsafe3 = yi.a;
                    xiVar = xiVar3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(xiVar, n, objectVolatile, mnVar3);
                    mnVar2 = mnVar3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(xiVar, j2) != objectVolatile) {
                        break;
                    } else {
                        xiVar3 = xiVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = xiVar;
        }
    }

    @Override // defpackage.oy
    public final ks c() {
        return this.h;
    }

    @Override // defpackage.xt
    public final xt d() {
        ks ksVar = this.h;
        if (ksVar instanceof xt) {
            return (xt) ksVar;
        }
        return null;
    }

    @Override // defpackage.ks
    public final lt e() {
        return this.i;
    }

    @Override // defpackage.oy
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.ks
    public final void g(Object obj) throws IllegalAccessException, ly, InvocationTargetException {
        Throwable thA = pe1.a(obj);
        if (thA != null) {
            obj = new on(thA, false);
        }
        G(obj, this.g, null);
    }

    @Override // defpackage.oy
    public final Object h(Object obj) {
        return obj instanceof mn ? ((mn) obj).a : obj;
    }

    @Override // defpackage.oy
    public final Object j() {
        return u();
    }

    @Override // defpackage.vi
    public final s30 k(Object obj, xa0 xa0Var) {
        return J(obj, xa0Var);
    }

    public final void l(si siVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            switch (siVar.a) {
                case 0:
                    ((sa0) siVar.b).i(th);
                    break;
                default:
                    ((az) siVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            al.B(this.i, new pn("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.vi
    public final boolean m(Throwable th) {
        Throwable cancellationException;
        xi xiVar;
        while (true) {
            k.getClass();
            Unsafe unsafe = yi.a;
            long j2 = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof n01)) {
                return false;
            }
            boolean z = (objectVolatile instanceof si) || (objectVolatile instanceof ek1);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            aj ajVar = new aj(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = yi.a;
                xiVar = this;
                if (unsafe2.compareAndSwapObject(xiVar, n, objectVolatile, ajVar)) {
                    n01 n01Var = (n01) objectVolatile;
                    if (n01Var instanceof si) {
                        xiVar.l((si) objectVolatile, th);
                    } else if (n01Var instanceof ek1) {
                        xiVar.o((ek1) objectVolatile, th);
                    }
                    if (!xiVar.A()) {
                        xiVar.p();
                    }
                    xiVar.q(xiVar.g);
                    return true;
                }
                if (unsafe2.getObjectVolatile(xiVar, j2) != objectVolatile) {
                    break;
                }
                this = xiVar;
            }
            this = xiVar;
        }
    }

    public final void n(xa0 xa0Var, Throwable th, Object obj) throws IllegalAccessException, InvocationTargetException {
        lt ltVar = this.i;
        try {
            xa0Var.f(th, obj, ltVar);
        } catch (Throwable th2) {
            al.B(ltVar, new pn("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void o(ek1 ek1Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        lt ltVar = this.i;
        int i = j.get(this) & 536870911;
        if (i == 536870911) {
            yc.l("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            ek1Var.l(i, ltVar);
        } catch (Throwable th2) {
            al.B(ltVar, new pn("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p() {
        az azVarS = s();
        if (azVarS == null) {
            return;
        }
        azVarS.a();
        l.getClass();
        yi.a.putObjectVolatile(this, m, j01.e);
    }

    public final void q(int i) throws ly {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    yc.l("Already resumed");
                    return;
                }
                boolean z = i == 4;
                ks ksVar = this.h;
                if (!z && (ksVar instanceof my)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.g;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        my myVar = (my) ksVar;
                        ot otVar = myVar.h;
                        lt ltVarE = myVar.i.e();
                        if (s22.J(otVar, ltVarE)) {
                            s22.I(otVar, ltVarE, this);
                            return;
                        }
                        b50 b50VarA = l02.a();
                        if (b50VarA.g >= 4294967296L) {
                            b50VarA.m(this);
                            return;
                        }
                        b50VarA.n(true);
                        try {
                            al.N(this, ksVar, true);
                            do {
                            } while (b50VarA.t());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                al.N(this, ksVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable r(vj0 vj0Var) {
        return vj0Var.p();
    }

    public final az s() {
        l.getClass();
        return (az) yi.a.getObjectVolatile(this, m);
    }

    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        oj0 oj0Var;
        boolean zA = A();
        do {
            atomicIntegerFieldUpdater = j;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    yc.l("Already suspended");
                    return null;
                }
                if (zA) {
                    D();
                }
                Object objU = u();
                if (objU instanceof on) {
                    throw ((on) objU).a;
                }
                int i3 = this.g;
                if ((i3 != 1 && i3 != 2) || (oj0Var = (oj0) this.i.l(v20.O)) == null || oj0Var.b()) {
                    return h(objU);
                }
                CancellationException cancellationExceptionP = oj0Var.p();
                b(cancellationExceptionP);
                throw cancellationExceptionP;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (s() == null) {
            w();
        }
        if (zA) {
            D();
        }
        return wt.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C());
        sb.append('(');
        sb.append(pv.F(this.h));
        sb.append("){");
        Object objU = u();
        sb.append(objU instanceof n01 ? "Active" : objU instanceof aj ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(pv.n(this));
        return sb.toString();
    }

    public final Object u() {
        k.getClass();
        return yi.a.getObjectVolatile(this, n);
    }

    public final void v() {
        az azVarW = w();
        if (azVarW == null || (u() instanceof n01)) {
            return;
        }
        azVarW.a();
        l.getClass();
        yi.a.putObjectVolatile(this, m, j01.e);
    }

    public final az w() {
        oj0 oj0Var = (oj0) this.i.l(v20.O);
        if (oj0Var == null) {
            return null;
        }
        az azVarI = bk.I(oj0Var, true, new dk(this));
        while (true) {
            l.getClass();
            Unsafe unsafe = yi.a;
            long j2 = m;
            xi xiVar = this;
            if (unsafe.compareAndSwapObject(xiVar, j2, (Object) null, azVarI) || unsafe.getObjectVolatile(xiVar, j2) != null) {
                break;
            }
            this = xiVar;
        }
        return azVarI;
    }

    public final void x(sa0 sa0Var) {
        y(new si(0, sa0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c5, code lost:
    
        B(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(n01 n01Var) {
        xi xiVar;
        Unsafe unsafe;
        xi xiVar2;
        while (true) {
            k.getClass();
            Unsafe unsafe2 = yi.a;
            long j2 = n;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile instanceof z1) {
                while (true) {
                    Unsafe unsafe3 = yi.a;
                    xiVar = this;
                    if (unsafe3.compareAndSwapObject(xiVar, n, objectVolatile, n01Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(xiVar, j2) != objectVolatile) {
                        break;
                    } else {
                        this = xiVar;
                    }
                }
            } else {
                xiVar = this;
                if ((objectVolatile instanceof si) || (objectVolatile instanceof ek1)) {
                    break;
                }
                if (objectVolatile instanceof on) {
                    on onVar = (on) objectVolatile;
                    if (!on.b.compareAndSet(onVar, 0, 1)) {
                        B(n01Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof aj) {
                        Throwable th = onVar.a;
                        if (n01Var instanceof si) {
                            xiVar.l((si) n01Var, th);
                            return;
                        } else {
                            xiVar.o((ek1) n01Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof mn) {
                    mn mnVar = (mn) objectVolatile;
                    if (mnVar.b != null) {
                        B(n01Var, objectVolatile);
                        throw null;
                    }
                    if (n01Var instanceof ek1) {
                        return;
                    }
                    si siVar = (si) n01Var;
                    Throwable th2 = mnVar.e;
                    if (th2 != null) {
                        xiVar.l(siVar, th2);
                        return;
                    }
                    mn mnVarA = mn.a(mnVar, siVar, null, 29);
                    do {
                        unsafe = yi.a;
                        xiVar2 = xiVar;
                        if (unsafe.compareAndSwapObject(xiVar, n, objectVolatile, mnVarA)) {
                            return;
                        } else {
                            xiVar = xiVar2;
                        }
                    } while (unsafe.getObjectVolatile(xiVar2, j2) == objectVolatile);
                } else {
                    xi xiVar3 = xiVar;
                    if (n01Var instanceof ek1) {
                        return;
                    }
                    mn mnVar2 = new mn(objectVolatile, (si) n01Var, (xa0) null, (Throwable) null, 28);
                    while (true) {
                        mn mnVar3 = mnVar2;
                        Unsafe unsafe4 = yi.a;
                        xiVar = xiVar3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(xiVar, n, objectVolatile, mnVar3);
                        mnVar2 = mnVar3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(xiVar, j2) != objectVolatile) {
                            break;
                        } else {
                            xiVar3 = xiVar;
                        }
                    }
                }
            }
            this = xiVar;
        }
    }

    @Override // defpackage.vi
    public final void z(Object obj) throws ly {
        q(this.g);
    }
}
