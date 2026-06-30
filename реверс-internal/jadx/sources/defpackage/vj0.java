package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class vj0 implements oj0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(vj0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = yi.a;
        h = unsafe.objectFieldOffset(vj0.class.getDeclaredField("_state$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(vj0.class, Object.class, "_parentHandle$volatile");
        g = unsafe.objectFieldOffset(vj0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public vj0(boolean z) {
        this._state$volatile = z ? s22.o : s22.n;
    }

    public static fk Y(es0 es0Var) {
        while (es0Var.n()) {
            es0Var = es0Var.m();
        }
        while (true) {
            es0Var = es0Var.l();
            if (!es0Var.n()) {
                if (es0Var instanceof fk) {
                    return (fk) es0Var;
                }
                if (es0Var instanceof e01) {
                    return null;
                }
            }
        }
    }

    public static String h0(Object obj) {
        if (!(obj instanceof uj0)) {
            return obj instanceof if0 ? ((if0) obj).b() ? "Active" : "New" : obj instanceof on ? "Cancelled" : "Completed";
        }
        uj0 uj0Var = (uj0) obj;
        return uj0Var.f() ? "Cancelling" : uj0.f.get(uj0Var) == 1 ? "Completing" : "Active";
    }

    public void A(Object obj) {
        y(obj);
    }

    public final Object B(ls lsVar) throws Throwable {
        Object objP;
        do {
            objP = P();
            if (!(objP instanceof if0)) {
                if (objP instanceof on) {
                    throw ((on) objP).a;
                }
                return s22.S(objP);
            }
        } while (g0(objP) < 0);
        sj0 sj0Var = new sj0(bl.E(lsVar), this);
        sj0Var.v();
        sj0Var.y(new si(1, bk.I(this, true, new qe1(sj0Var))));
        return sj0Var.t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r0
      0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Object obj) {
        s30 s30Var;
        Object objK0 = s22.i;
        if (M()) {
            do {
                Object objP = P();
                if (objP instanceof if0) {
                    if (objP instanceof uj0) {
                        if (uj0.f.get((uj0) objP) == 1) {
                        }
                    }
                    objK0 = k0(objP, new on(I(obj), false));
                }
                objK0 = s22.i;
                break;
            } while (objK0 == s22.k);
            if (objK0 != s22.j) {
                if (objK0 == s22.i) {
                    Throwable thI = null;
                    while (true) {
                        Object objP2 = P();
                        if (!(objP2 instanceof uj0)) {
                            if (!(objP2 instanceof if0)) {
                                s30Var = s22.l;
                                break;
                            }
                            if (thI == null) {
                                thI = I(obj);
                            }
                            if0 if0Var = (if0) objP2;
                            if (!if0Var.b()) {
                                Object objK02 = k0(objP2, new on(thI, false));
                                if (objK02 == s22.i) {
                                    yc.g(objP2, "Cannot happen in ");
                                    return false;
                                }
                                if (objK02 != s22.k) {
                                    objK0 = objK02;
                                    break;
                                }
                            } else if (j0(if0Var, thI)) {
                                s30Var = s22.i;
                                break;
                            }
                        } else {
                            synchronized (objP2) {
                                if (((uj0) objP2).c() == s22.m) {
                                    s30Var = s22.l;
                                } else {
                                    boolean zF = ((uj0) objP2).f();
                                    if (thI == null) {
                                        thI = I(obj);
                                    }
                                    ((uj0) objP2).a(thI);
                                    Throwable thE = zF ? null : ((uj0) objP2).e();
                                    if (thE != null) {
                                        Z(((uj0) objP2).e, thE);
                                    }
                                    s30Var = s22.i;
                                }
                            }
                        }
                    }
                }
                if (objK0 != s22.i && objK0 != s22.j) {
                    if (objK0 == s22.l) {
                        return false;
                    }
                    y(objK0);
                    return true;
                }
            }
        }
        return true;
    }

    public void D(CancellationException cancellationException) {
        C(cancellationException);
    }

    public final boolean E(Throwable th) {
        if (U()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ek ekVarO = O();
        return (ekVarO == null || ekVarO == j01.e) ? z : ekVarO.c(th) || z;
    }

    public String F() {
        return "Job was cancelled";
    }

    public boolean G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return C(th) && L();
    }

    public final void H(if0 if0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        ek ekVarO = O();
        if (ekVarO != null) {
            ekVarO.a();
            f0(j01.e);
        }
        pn pnVar = null;
        on onVar = obj instanceof on ? (on) obj : null;
        Throwable th = onVar != null ? onVar.a : null;
        if (if0Var instanceof rj0) {
            try {
                ((rj0) if0Var).s(th);
                return;
            } catch (Throwable th2) {
                R(new pn("Exception in completion handler " + if0Var + " for " + this, th2));
                return;
            }
        }
        e01 e01VarD = if0Var.d();
        if (e01VarD != null) {
            e01VarD.e(new bq0(1), 1);
            Object objK = e01VarD.k();
            objK.getClass();
            for (es0 es0VarL = (es0) objK; !es0VarL.equals(e01VarD); es0VarL = es0VarL.l()) {
                if (es0VarL instanceof rj0) {
                    try {
                        ((rj0) es0VarL).s(th);
                    } catch (Throwable th3) {
                        if (pnVar != null) {
                            al.h(pnVar, th3);
                        } else {
                            pnVar = new pn("Exception in completion handler " + es0VarL + " for " + this, th3);
                        }
                    }
                }
            }
            if (pnVar != null) {
                R(pnVar);
            }
        }
    }

    public final Throwable I(Object obj) {
        Throwable thE;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        vj0 vj0Var = (vj0) obj;
        Object objP = vj0Var.P();
        if (objP instanceof uj0) {
            thE = ((uj0) objP).e();
        } else if (objP instanceof on) {
            thE = ((on) objP).a;
        } else {
            if (objP instanceof if0) {
                yc.g(objP, "Cannot be cancelling child in this state: ");
                return null;
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        return cancellationException == null ? new pj0("Parent job is ".concat(h0(objP)), thE, vj0Var) : cancellationException;
    }

    public final Object J(uj0 uj0Var, Object obj) throws Throwable {
        uj0 uj0Var2;
        Throwable th;
        Throwable thK;
        vj0 vj0Var;
        uj0 uj0Var3;
        on onVar = obj instanceof on ? (on) obj : null;
        Throwable th2 = onVar != null ? onVar.a : null;
        synchronized (uj0Var) {
            try {
                uj0Var.f();
                ArrayList arrayListG = uj0Var.g(th2);
                thK = K(uj0Var, arrayListG);
                if (thK != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            int size = arrayListG.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListG.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thK && th3 != thK && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    al.h(thK, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        uj0Var2 = uj0Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                uj0Var2 = uj0Var;
                th = th5;
            }
        }
        if (thK != null && thK != th2) {
            obj = new on(thK, false);
        }
        if (thK != null && (E(thK) || Q(thK))) {
            obj.getClass();
            on.b.compareAndSet((on) obj, 0, 1);
        }
        a0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        Object jf0Var = obj instanceof if0 ? new jf0((if0) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = yi.a;
            long j = h;
            vj0Var = this;
            uj0Var3 = uj0Var;
            if (unsafe.compareAndSwapObject(vj0Var, j, uj0Var3, jf0Var) || unsafe.getObjectVolatile(vj0Var, j) != uj0Var3) {
                break;
            }
            this = vj0Var;
            uj0Var = uj0Var3;
        }
        vj0Var.H(uj0Var3, obj);
        return obj;
    }

    public final Throwable K(uj0 uj0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (uj0Var.f()) {
                return new pj0(F(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof w02) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof w02)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return this instanceof ln;
    }

    public final e01 N(if0 if0Var) {
        e01 e01VarD = if0Var.d();
        if (e01VarD != null) {
            return e01VarD;
        }
        if (if0Var instanceof a40) {
            return new e01();
        }
        if (if0Var instanceof rj0) {
            d0((rj0) if0Var);
            return null;
        }
        yc.g(if0Var, "State should have list: ");
        return null;
    }

    public final ek O() {
        f.getClass();
        return (ek) yi.a.getObjectVolatile(this, g);
    }

    public final Object P() {
        e.getClass();
        return yi.a.getObjectVolatile(this, h);
    }

    public boolean Q(Throwable th) {
        return false;
    }

    public final void S(oj0 oj0Var) {
        j01 j01Var = j01.e;
        if (oj0Var == null) {
            f0(j01Var);
            return;
        }
        oj0Var.start();
        ek ekVarI = oj0Var.i(this);
        f0(ekVarI);
        if (P() instanceof if0) {
            return;
        }
        ekVarI.a();
        f0(j01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final az T(boolean z, rj0 rj0Var) {
        vj0 vj0Var;
        rj0 rj0Var2;
        boolean zE;
        rj0Var.k = this;
        loop0: while (true) {
            Object objP = this.P();
            if (objP instanceof a40) {
                a40 a40Var = (a40) objP;
                if (a40Var.e) {
                    while (true) {
                        e.getClass();
                        Unsafe unsafe = yi.a;
                        long j = h;
                        vj0Var = this;
                        rj0Var2 = rj0Var;
                        if (unsafe.compareAndSwapObject(vj0Var, j, objP, rj0Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(vj0Var, j) != objP) {
                            break;
                        }
                        this = vj0Var;
                        rj0Var = rj0Var2;
                    }
                } else {
                    vj0Var = this;
                    rj0Var2 = rj0Var;
                    vj0Var.c0(a40Var);
                }
                this = vj0Var;
                rj0Var = rj0Var2;
            } else {
                vj0Var = this;
                rj0Var2 = rj0Var;
                boolean z2 = objP instanceof if0;
                j01 j01Var = j01.e;
                if (z2) {
                    if0 if0Var = (if0) objP;
                    e01 e01VarD = if0Var.d();
                    if (e01VarD == null) {
                        vj0Var.d0((rj0) objP);
                    } else {
                        if (rj0Var2.r()) {
                            uj0 uj0Var = if0Var instanceof uj0 ? (uj0) if0Var : null;
                            Throwable thE = uj0Var != null ? uj0Var.e() : null;
                            if (thE == null) {
                                zE = e01VarD.e(rj0Var2, 5);
                            } else if (z) {
                                rj0Var2.s(thE);
                                return j01Var;
                            }
                        } else {
                            zE = e01VarD.e(rj0Var2, 1);
                        }
                        if (zE) {
                            break;
                        }
                    }
                    this = vj0Var;
                    rj0Var = rj0Var2;
                } else if (z) {
                    Object objP2 = vj0Var.P();
                    on onVar = objP2 instanceof on ? (on) objP2 : null;
                    rj0Var2.s(onVar != null ? onVar.a : null);
                }
            }
        }
        return rj0Var2;
    }

    public boolean U() {
        return this instanceof zf;
    }

    public final boolean V(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objK0;
        do {
            objK0 = k0(P(), obj);
            if (objK0 == s22.i) {
                return false;
            }
            if (objK0 == s22.j) {
                return true;
            }
        } while (objK0 == s22.k);
        y(objK0);
        return true;
    }

    public final Object W(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objK0;
        do {
            objK0 = k0(P(), obj);
            if (objK0 == s22.i) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                on onVar = obj instanceof on ? (on) obj : null;
                throw new IllegalStateException(str, onVar != null ? onVar.a : null);
            }
        } while (objK0 == s22.k);
        return objK0;
    }

    public String X() {
        return getClass().getSimpleName();
    }

    public final void Z(e01 e01Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        e01Var.e(new bq0(4), 4);
        Object objK = e01Var.k();
        objK.getClass();
        pn pnVar = null;
        for (es0 es0VarL = (es0) objK; !es0VarL.equals(e01Var); es0VarL = es0VarL.l()) {
            if ((es0VarL instanceof rj0) && ((rj0) es0VarL).r()) {
                try {
                    ((rj0) es0VarL).s(th);
                } catch (Throwable th2) {
                    if (pnVar != null) {
                        al.h(pnVar, th2);
                    } else {
                        pnVar = new pn("Exception in completion handler " + es0VarL + " for " + this, th2);
                    }
                }
            }
        }
        if (pnVar != null) {
            R(pnVar);
        }
        E(th);
    }

    @Override // defpackage.oj0
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new pj0(F(), null, this);
        }
        D(cancellationException);
    }

    @Override // defpackage.oj0
    public boolean b() {
        Object objP = P();
        return (objP instanceof if0) && ((if0) objP).b();
    }

    public final void c0(a40 a40Var) {
        e01 e01Var = new e01();
        Object hf0Var = a40Var.e ? e01Var : new hf0(e01Var);
        while (true) {
            e.getClass();
            Unsafe unsafe = yi.a;
            long j = h;
            vj0 vj0Var = this;
            a40 a40Var2 = a40Var;
            if (unsafe.compareAndSwapObject(vj0Var, j, a40Var2, hf0Var) || unsafe.getObjectVolatile(vj0Var, j) != a40Var2) {
                return;
            }
            this = vj0Var;
            a40Var = a40Var2;
        }
    }

    public final void d0(rj0 rj0Var) {
        rj0Var.g(new e01());
        es0 es0VarL = rj0Var.l();
        while (true) {
            e.getClass();
            Unsafe unsafe = yi.a;
            long j = h;
            vj0 vj0Var = this;
            rj0 rj0Var2 = rj0Var;
            if (unsafe.compareAndSwapObject(vj0Var, j, rj0Var2, es0VarL) || unsafe.getObjectVolatile(vj0Var, j) != rj0Var2) {
                return;
            }
            this = vj0Var;
            rj0Var = rj0Var2;
        }
    }

    public final void e0(rj0 rj0Var) {
        vj0 vj0Var;
        while (true) {
            Object objP = this.P();
            if (!(objP instanceof rj0)) {
                if (!(objP instanceof if0) || ((if0) objP).d() == null) {
                    return;
                }
                rj0Var.o();
                return;
            }
            if (objP != rj0Var) {
                return;
            }
            a40 a40Var = s22.o;
            while (true) {
                e.getClass();
                Unsafe unsafe = yi.a;
                long j = h;
                vj0Var = this;
                if (unsafe.compareAndSwapObject(vj0Var, j, objP, a40Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(vj0Var, j) != objP) {
                    break;
                } else {
                    this = vj0Var;
                }
            }
            this = vj0Var;
        }
    }

    public final void f0(ek ekVar) {
        f.getClass();
        yi.a.putObjectVolatile(this, g, ekVar);
    }

    public final int g0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof a40;
        long j = h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        if (z) {
            if (((a40) obj).e) {
                return 0;
            }
            a40 a40Var = s22.o;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = yi.a;
                if (unsafe2.compareAndSwapObject(this, h, obj, a40Var)) {
                    b0();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof hf0)) {
            return 0;
        }
        e01 e01Var = ((hf0) obj).e;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = yi.a;
            if (unsafe.compareAndSwapObject(this, h, obj, e01Var)) {
                b0();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // defpackage.jt
    public final kt getKey() {
        return v20.O;
    }

    public Object h(pr0 pr0Var) {
        return B(pr0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.oj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ek i(vj0 vj0Var) {
        vj0 vj0Var2;
        fk fkVar = new fk(vj0Var);
        fkVar.k = this;
        loop0: while (true) {
            Object objP = this.P();
            if (objP instanceof a40) {
                a40 a40Var = (a40) objP;
                if (a40Var.e) {
                    while (true) {
                        e.getClass();
                        Unsafe unsafe = yi.a;
                        long j = h;
                        vj0Var2 = this;
                        if (unsafe.compareAndSwapObject(vj0Var2, j, objP, fkVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(vj0Var2, j) != objP) {
                            break;
                        }
                        this = vj0Var2;
                    }
                } else {
                    vj0Var2 = this;
                    vj0Var2.c0(a40Var);
                }
                this = vj0Var2;
            } else {
                vj0Var2 = this;
                boolean z = objP instanceof if0;
                j01 j01Var = j01.e;
                if (!z) {
                    Object objP2 = vj0Var2.P();
                    on onVar = objP2 instanceof on ? (on) objP2 : null;
                    fkVar.s(onVar != null ? onVar.a : null);
                    return j01Var;
                }
                e01 e01VarD = ((if0) objP).d();
                if (e01VarD == null) {
                    vj0Var2.d0((rj0) objP);
                    this = vj0Var2;
                } else if (!e01VarD.e(fkVar, 7)) {
                    boolean zE = e01VarD.e(fkVar, 3);
                    Object objP3 = vj0Var2.P();
                    if (objP3 instanceof uj0) {
                        thE = ((uj0) objP3).e();
                    } else {
                        on onVar2 = objP3 instanceof on ? (on) objP3 : null;
                        if (onVar2 != null) {
                            thE = onVar2.a;
                        }
                    }
                    fkVar.s(thE);
                    if (zE) {
                        break loop0;
                    }
                    return j01Var;
                }
            }
        }
    }

    public final boolean i0(if0 if0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object jf0Var = obj instanceof if0 ? new jf0((if0) obj) : obj;
        while (true) {
            e.getClass();
            Unsafe unsafe = yi.a;
            long j = h;
            vj0 vj0Var = this;
            if0 if0Var2 = if0Var;
            if (unsafe.compareAndSwapObject(vj0Var, j, if0Var2, jf0Var)) {
                vj0Var.a0(obj);
                vj0Var.H(if0Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(vj0Var, j) != if0Var2) {
                return false;
            }
            this = vj0Var;
            if0Var = if0Var2;
        }
    }

    @Override // defpackage.oj0
    public final boolean isCancelled() {
        Object objP = P();
        if (objP instanceof on) {
            return true;
        }
        return (objP instanceof uj0) && ((uj0) objP).f();
    }

    @Override // defpackage.lt
    public final lt j(lt ltVar) {
        return hk.L(this, ltVar);
    }

    public final boolean j0(if0 if0Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        e01 e01VarN = N(if0Var);
        if (e01VarN == null) {
            return false;
        }
        uj0 uj0Var = new uj0(e01VarN, th);
        while (true) {
            e.getClass();
            Unsafe unsafe = yi.a;
            long j = h;
            vj0 vj0Var = this;
            if0 if0Var2 = if0Var;
            if (unsafe.compareAndSwapObject(vj0Var, j, if0Var2, uj0Var)) {
                vj0Var.Z(e01VarN, th);
                return true;
            }
            if (unsafe.getObjectVolatile(vj0Var, j) != if0Var2) {
                return false;
            }
            this = vj0Var;
            if0Var = if0Var2;
        }
    }

    public final Object k0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof if0)) {
            return s22.i;
        }
        if (((obj instanceof a40) || (obj instanceof rj0)) && !(obj instanceof fk) && !(obj2 instanceof on)) {
            return i0((if0) obj, obj2) ? obj2 : s22.k;
        }
        if0 if0Var = (if0) obj;
        e01 e01VarN = N(if0Var);
        if (e01VarN == null) {
            return s22.k;
        }
        uj0 uj0Var = if0Var instanceof uj0 ? (uj0) if0Var : null;
        if (uj0Var == null) {
            uj0Var = new uj0(e01VarN, null);
        }
        synchronized (uj0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = uj0.f;
            if (atomicIntegerFieldUpdater.get(uj0Var) == 1) {
                return s22.i;
            }
            atomicIntegerFieldUpdater.set(uj0Var, 1);
            if (uj0Var != if0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, if0Var, uj0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != if0Var) {
                        return s22.k;
                    }
                }
            }
            boolean zF = uj0Var.f();
            on onVar = obj2 instanceof on ? (on) obj2 : null;
            if (onVar != null) {
                uj0Var.a(onVar.a);
            }
            Throwable thE = zF ? null : uj0Var.e();
            if (thE != null) {
                Z(e01VarN, thE);
            }
            fk fkVarY = Y(e01VarN);
            if (fkVarY != null && l0(uj0Var, fkVarY, obj2)) {
                return s22.j;
            }
            e01VarN.e(new bq0(2), 2);
            fk fkVarY2 = Y(e01VarN);
            return (fkVarY2 == null || !l0(uj0Var, fkVarY2, obj2)) ? J(uj0Var, obj2) : s22.j;
        }
    }

    @Override // defpackage.lt
    public final jt l(kt ktVar) {
        return hk.v(this, ktVar);
    }

    public final boolean l0(uj0 uj0Var, fk fkVar, Object obj) {
        while (bk.I(fkVar.l, false, new tj0(this, uj0Var, fkVar, obj)) == j01.e) {
            fkVar = Y(fkVar);
            if (fkVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.oj0
    public final CancellationException p() {
        CancellationException cancellationException;
        Object objP = P();
        if (objP instanceof uj0) {
            Throwable thE = ((uj0) objP).e();
            if (thE == null) {
                yc.g(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
            return cancellationException == null ? new pj0(strConcat, thE, this) : cancellationException;
        }
        if (objP instanceof if0) {
            yc.g(this, "Job is still new or active: ");
            return null;
        }
        if (!(objP instanceof on)) {
            return new pj0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((on) objP).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new pj0(F(), th, this) : cancellationException;
    }

    @Override // defpackage.lt
    public final Object q(wa0 wa0Var, Object obj) {
        return wa0Var.h(obj, this);
    }

    @Override // defpackage.oj0
    public final az s(sa0 sa0Var) {
        return T(true, new kj0(sa0Var));
    }

    @Override // defpackage.oj0
    public final boolean start() {
        int iG0;
        do {
            iG0 = g0(P());
            if (iG0 == 0) {
                return false;
            }
        } while (iG0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(X() + '{' + h0(P()) + '}');
        sb.append('@');
        sb.append(pv.n(this));
        return sb.toString();
    }

    @Override // defpackage.lt
    public final lt u(kt ktVar) {
        return hk.J(this, ktVar);
    }

    @Override // defpackage.oj0
    public final Object w(ls lsVar) {
        Object objP;
        t32 t32Var;
        do {
            objP = P();
            boolean z = objP instanceof if0;
            t32Var = t32.a;
            if (!z) {
                bk.t(lsVar.e());
                return t32Var;
            }
        } while (g0(objP) < 0);
        xi xiVar = new xi(1, bl.E(lsVar));
        xiVar.v();
        xiVar.y(new si(1, bk.I(this, true, new re1(xiVar))));
        Object objT = xiVar.t();
        wt wtVar = wt.e;
        if (objT != wtVar) {
            objT = t32Var;
        }
        return objT == wtVar ? objT : t32Var;
    }

    @Override // defpackage.oj0
    public final az x(boolean z, boolean z2, f fVar) {
        return T(z2, z ? new jj0(fVar) : new kj0(fVar));
    }

    public void b0() {
    }

    public void R(pn pnVar) {
        throw pnVar;
    }

    public void a0(Object obj) {
    }

    public void y(Object obj) {
    }
}
