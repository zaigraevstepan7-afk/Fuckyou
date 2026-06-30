package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jc1 extends op {
    public final y8 a;
    public final oc b;
    public final Object c;
    public oj0 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public ay0 h;
    public final iy0 i;
    public final ArrayList j;
    public final ArrayList k;
    public final zx0 l;
    public final xg0 m;
    public final zx0 n;
    public final zx0 o;
    public ArrayList p;
    public ay0 q;
    public xi r;
    public final qs1 s;
    public boolean t;
    public final qs1 u;
    public final oc v;
    public final qj0 w;
    public final lt x;
    public final t61 y;
    public static final qs1 z = c2.g(n61.h);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public jc1(lt ltVar) {
        y8 y8Var = new y8(new ec1(this, 0));
        this.a = y8Var;
        ec1 ec1Var = new ec1(this, 1);
        oc ocVar = new oc();
        ocVar.a = new xd(0);
        ocVar.b = new me();
        ocVar.c = new f8(11, ocVar, ec1Var);
        this.b = ocVar;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new ay0();
        this.i = new iy0(new tp[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new zx0();
        this.m = new xg0(25);
        this.n = new zx0();
        this.o = new zx0();
        this.s = c2.g(null);
        this.u = c2.g(gc1.g);
        this.v = new oc(15);
        qj0 qj0Var = new qj0((oj0) ltVar.l(v20.O));
        qj0Var.s(new n(19, this));
        this.w = qj0Var;
        this.x = ltVar.j(y8Var).j(qj0Var);
        this.y = new t61(11);
    }

    public static final void G(ArrayList arrayList, jc1 jc1Var, tp tpVar) {
        arrayList.clear();
        synchronized (jc1Var.c) {
            Iterator it = jc1Var.k.iterator();
            if (it.hasNext()) {
                ((sw0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(ey0 ey0Var) {
        try {
            if (ey0Var.w() instanceof up1) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            ey0Var.c();
        }
    }

    public final boolean A() {
        return this.i.g != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((xd) ((me) this.b.b).c).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            if (this.h.h() || this.i.g != 0 || z()) {
                z2 = true;
            } else if (!B()) {
                z2 = false;
            }
        }
        return z2;
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? f40.e : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        vi viVarY;
        synchronized (this.c) {
            viVarY = y();
            if (((gc1) this.u.getValue()).compareTo(gc1.f) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (viVarY != null) {
            ((xi) viVarY).g(t32.a);
        }
    }

    public final void F(tp tpVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((sw0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013f, code lost:
    
        if (r4 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        if (((defpackage.j41) r11.get(r4)).f == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015c, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
    
        r12 = (defpackage.j41) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
    
        if (r12.f != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
    
        r12 = (defpackage.sw0) r12.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0175, code lost:
    
        defpackage.ul.a0(r18.k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017b, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        if (((defpackage.j41) r12).f == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List H(List list, ay0 ay0Var) {
        ey0 ey0VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((sw0) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            tp tpVar = (tp) entry.getKey();
            List list2 = (List) entry.getValue();
            if (tpVar.z.F) {
                mp.a("Check failed");
            }
            n nVar = new n(18, tpVar);
            d dVar = new d(17, tpVar, ay0Var);
            sp1 sp1VarJ = aq1.j();
            ey0 ey0Var = sp1VarJ instanceof ey0 ? (ey0) sp1VarJ : null;
            if (ey0Var == null || (ey0VarC = ey0Var.C(nVar, dVar)) == null) {
                yc.l("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                sp1 sp1VarJ2 = ey0VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                sw0 sw0Var = (sw0) list2.get(i2);
                                zx0 zx0Var = this.l;
                                sw0Var.getClass();
                                Object objA = bx0.a(zx0Var);
                                arrayList.add(new j41(sw0Var, objA));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                j41 j41Var = (j41) arrayList.get(i3);
                                if (j41Var.f == null) {
                                    xg0 xg0Var = this.m;
                                    ((sw0) j41Var.e).getClass();
                                    if (((zx0) xg0Var.f).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            j41 j41Var2 = (j41) arrayList.get(i4);
                                            if (j41Var2.f == null) {
                                                xg0 xg0Var2 = this.m;
                                                ((sw0) j41Var2.e).getClass();
                                                zx0 zx0Var2 = (zx0) xg0Var2.f;
                                                if (zx0Var2.i()) {
                                                    ((zx0) xg0Var2.g).a();
                                                }
                                            }
                                            arrayList3.add(j41Var2);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((j41) arrayList.get(i5)).f != null) {
                            break;
                        }
                        i5++;
                    }
                    tpVar.r(arrayList);
                    sp1.q(sp1VarJ2);
                } catch (Throwable th) {
                    sp1.q(sp1VarJ2);
                    throw th;
                }
            } finally {
                w(ey0VarC);
            }
        }
        return pl.o0(map.keySet());
    }

    public final tp I(tp tpVar, ay0 ay0Var) {
        ay0 ay0Var2;
        ey0 ey0VarC;
        if (!tpVar.z.F && !tpVar.v() && ((ay0Var2 = this.q) == null || !ay0Var2.c(tpVar))) {
            n nVar = new n(18, tpVar);
            d dVar = new d(17, tpVar, ay0Var);
            sp1 sp1VarJ = aq1.j();
            ey0 ey0Var = sp1VarJ instanceof ey0 ? (ey0) sp1VarJ : null;
            if (ey0Var == null || (ey0VarC = ey0Var.C(nVar, dVar)) == null) {
                yc.l("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    sp1 sp1VarJ2 = ey0VarC.j();
                    if (ay0Var != null) {
                        try {
                            if (ay0Var.h()) {
                                f8 f8Var = new f8(12, ay0Var, tpVar);
                                ob0 ob0Var = tpVar.z;
                                if (ob0Var.F) {
                                    mp.a("Preparing a composition while composing is not supported");
                                }
                                ob0Var.F = true;
                                try {
                                    f8Var.a();
                                    ob0Var.F = false;
                                } catch (Throwable th) {
                                    ob0Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            sp1.q(sp1VarJ2);
                            throw th2;
                        }
                    }
                    boolean zX = tpVar.x();
                    sp1.q(sp1VarJ2);
                    if (zX) {
                        return tpVar;
                    }
                } finally {
                    w(ey0VarC);
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, tp tpVar) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof wo)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                fc1 fc1Var = (fc1) this.s.getValue();
                if (fc1Var != null) {
                    throw fc1Var.a;
                }
                qs1 qs1Var = this.s;
                fc1 fc1Var2 = new fc1(th);
                qs1Var.getClass();
                qs1Var.k(null, fc1Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new ay0();
                this.k.clear();
                this.l.a();
                this.n.a();
                qs1 qs1Var2 = this.s;
                fc1 fc1Var3 = new fc1(th);
                qs1Var2.getClass();
                qs1Var2.k(null, fc1Var3);
                if (tpVar != null) {
                    L(tpVar);
                }
                if (y() != null) {
                    mp.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            ri1 ri1Var = new ri1(this.h);
            this.h = new ay0();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((tp) listD.get(i)).y(ri1Var);
                    if (((gc1) this.u.getValue()).compareTo(gc1.f) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    ay0 ay0Var = this.h;
                    ay0Var.getClass();
                    Iterator<E> it = ri1Var.iterator();
                    while (it.hasNext()) {
                        ay0Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(tp tpVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(tpVar)) {
            arrayList.add(tpVar);
        }
        if (this.f.remove(tpVar)) {
            this.g = null;
        }
    }

    @Override // defpackage.op
    public final void a(tp tpVar, wa0 wa0Var) throws Throwable {
        gc1 gc1Var;
        boolean zContains;
        ey0 ey0VarC;
        boolean z2 = tpVar.z.F;
        synchronized (this.c) {
            gc1 gc1Var2 = (gc1) this.u.getValue();
            gc1Var = gc1.f;
            zContains = gc1Var2.compareTo(gc1Var) > 0 ? true ^ D().contains(tpVar) : true;
        }
        try {
            n nVar = new n(18, tpVar);
            d dVar = new d(17, tpVar, null);
            sp1 sp1VarJ = aq1.j();
            ey0 ey0Var = sp1VarJ instanceof ey0 ? (ey0) sp1VarJ : null;
            if (ey0Var == null || (ey0VarC = ey0Var.C(nVar, dVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                sp1 sp1VarJ2 = ey0VarC.j();
                try {
                    tpVar.j(wa0Var);
                    synchronized (this.c) {
                        if (((gc1) this.u.getValue()).compareTo(gc1Var) > 0 && !D().contains(tpVar)) {
                            this.f.add(tpVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        aq1.j().m();
                    }
                    try {
                        F(tpVar);
                        try {
                            tpVar.d();
                            tpVar.f();
                            if (z2) {
                                return;
                            }
                            aq1.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, tpVar);
                    }
                } finally {
                    sp1.q(sp1VarJ2);
                }
            } finally {
                w(ey0VarC);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            J(th3, tpVar);
        }
    }

    @Override // defpackage.op
    public final ay0 b(tp tpVar, yn1 yn1Var, wa0 wa0Var) {
        oc ocVar = this.v;
        try {
            yn1 yn1Var2 = tpVar.t;
            tpVar.t = yn1Var;
            try {
                a(tpVar, wa0Var);
                ay0 ay0Var = (ay0) ocVar.h();
                if (ay0Var == null) {
                    ay0Var = qi1.a;
                    ay0Var.getClass();
                }
                return ay0Var;
            } finally {
                tpVar.t = yn1Var2;
            }
        } finally {
            ocVar.x(null);
        }
    }

    @Override // defpackage.op
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.op
    public final boolean e() {
        return false;
    }

    @Override // defpackage.op
    public final boolean f() {
        return false;
    }

    @Override // defpackage.op
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.op
    public final np h() {
        return null;
    }

    @Override // defpackage.op
    public final lt j() {
        return this.x;
    }

    @Override // defpackage.op
    public final boolean k() {
        return false;
    }

    @Override // defpackage.op
    public final void l(tp tpVar) throws IllegalAccessException, ly, InvocationTargetException {
        vi viVarY;
        synchronized (this.c) {
            if (this.i.h(tpVar)) {
                viVarY = null;
            } else {
                this.i.b(tpVar);
                viVarY = y();
            }
        }
        if (viVarY != null) {
            ((xi) viVarY).g(t32.a);
        }
    }

    @Override // defpackage.op
    public final rw0 m(sw0 sw0Var) {
        rw0 rw0Var;
        synchronized (this.c) {
            rw0Var = (rw0) this.n.k(sw0Var);
        }
        return rw0Var;
    }

    @Override // defpackage.op
    public final ay0 n(tp tpVar, yn1 yn1Var, ay0 ay0Var) {
        oc ocVar = this.v;
        try {
            K();
            tpVar.y(new ri1(ay0Var));
            yn1 yn1Var2 = tpVar.t;
            tpVar.t = yn1Var;
            try {
                tp tpVarI = I(tpVar, null);
                if (tpVarI != null) {
                    F(tpVar);
                    tpVarI.d();
                    tpVarI.f();
                }
                ay0 ay0Var2 = (ay0) ocVar.h();
                if (ay0Var2 == null) {
                    ay0Var2 = qi1.a;
                    ay0Var2.getClass();
                }
                return ay0Var2;
            } finally {
                tpVar.t = yn1Var2;
            }
        } finally {
            ocVar.x(null);
        }
    }

    @Override // defpackage.op
    public final void q(dc1 dc1Var) {
        oc ocVar = this.v;
        ay0 ay0Var = (ay0) ocVar.h();
        if (ay0Var == null) {
            ay0 ay0Var2 = qi1.a;
            ay0Var = new ay0();
            ocVar.x(ay0Var);
        }
        ay0Var.a(dc1Var);
    }

    @Override // defpackage.op
    public final void r(tp tpVar) {
        synchronized (this.c) {
            try {
                ay0 ay0Var = this.q;
                if (ay0Var == null) {
                    ay0 ay0Var2 = qi1.a;
                    ay0Var = new ay0();
                    this.q = ay0Var;
                }
                ay0Var.a(tpVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.op
    public final zi s(a7 a7Var) {
        oc ocVar = this.b;
        me meVar = (me) ocVar.b;
        sz0 sz0Var = new sz0();
        sz0Var.a = a7Var;
        return meVar.d(sz0Var, (f8) ocVar.c);
    }

    @Override // defpackage.op
    public final void v(tp tpVar) {
        synchronized (this.c) {
            if (this.f.remove(tpVar)) {
                this.g = null;
            }
            this.i.j(tpVar);
            this.j.remove(tpVar);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((gc1) this.u.getValue()).compareTo(gc1.i) >= 0) {
                qs1 qs1Var = this.u;
                gc1 gc1Var = gc1.f;
                qs1Var.getClass();
                qs1Var.k(null, gc1Var);
            }
        }
        this.w.a(null);
    }

    public final vi y() {
        qs1 qs1Var = this.u;
        int iCompareTo = ((gc1) qs1Var.getValue()).compareTo(gc1.f);
        qs1 qs1Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        iy0 iy0Var = this.i;
        if (iCompareTo > 0) {
            Object value = qs1Var2.getValue();
            gc1 gc1Var = gc1.j;
            gc1 gc1Var2 = gc1.g;
            if (value == null) {
                if (this.d == null) {
                    this.h = new ay0();
                    iy0Var.g();
                    if (z() || B()) {
                        gc1Var2 = gc1.h;
                    }
                } else {
                    gc1Var2 = (iy0Var.g != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? gc1Var : gc1.i;
                }
            }
            qs1Var.k(null, gc1Var2);
            if (gc1Var2 != gc1Var) {
                return null;
            }
            xi xiVar = this.r;
            this.r = null;
            return xiVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = f40.e;
        this.h = new ay0();
        iy0Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        xi xiVar2 = this.r;
        if (xiVar2 != null) {
            xiVar2.m(null);
        }
        this.r = null;
        qs1Var2.j(null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((xd) ((me) this.a.g).c).get() & 134217727) > 0;
    }

    @Override // defpackage.op
    public final void o(Set set) {
    }
}
