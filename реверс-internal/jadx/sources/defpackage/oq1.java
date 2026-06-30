package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oq1 implements vs1, Map, ak0 {
    public nq1 e;
    public final bq1 f;
    public final bq1 g;
    public final bq1 h;

    public oq1() {
        c61 c61Var = c61.g;
        sp1 sp1VarJ = aq1.j();
        nq1 nq1Var = new nq1(sp1VarJ.g(), c61Var);
        if (!(sp1VarJ instanceof gc0)) {
            nq1Var.b = new nq1(1L, c61Var);
        }
        this.e = nq1Var;
        this.f = new bq1(this, 0);
        this.g = new bq1(this, 1);
        this.h = new bq1(this, 2);
    }

    public static final boolean d(oq1 oq1Var, nq1 nq1Var, int i, c61 c61Var) {
        boolean z;
        synchronized (xi0.z) {
            int i2 = nq1Var.d;
            if (i2 == i) {
                nq1Var.c = c61Var;
                z = true;
                nq1Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.vs1
    public final xs1 a() {
        return this.e;
    }

    @Override // defpackage.vs1
    public final void c(xs1 xs1Var) {
        xs1Var.getClass();
        this.e = (nq1) xs1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        sp1 sp1VarJ;
        nq1 nq1Var = this.e;
        nq1Var.getClass();
        nq1 nq1Var2 = (nq1) aq1.h(nq1Var);
        c61 c61Var = c61.g;
        if (c61Var != nq1Var2.c) {
            nq1 nq1Var3 = this.e;
            nq1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                nq1 nq1Var4 = (nq1) aq1.w(nq1Var3, this, sp1VarJ);
                synchronized (xi0.z) {
                    nq1Var4.c = c61Var;
                    nq1Var4.d++;
                }
            }
            aq1.n(sp1VarJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().c.containsValue(obj);
    }

    public final nq1 e() {
        nq1 nq1Var = this.e;
        nq1Var.getClass();
        return (nq1) aq1.t(nq1Var, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.g;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c61 c61Var;
        int i;
        Object objPut;
        sp1 sp1VarJ;
        boolean zD;
        do {
            synchronized (xi0.z) {
                nq1 nq1Var = this.e;
                nq1Var.getClass();
                nq1 nq1Var2 = (nq1) aq1.h(nq1Var);
                c61Var = nq1Var2.c;
                i = nq1Var2.d;
            }
            c61Var.getClass();
            e61 e61VarB = c61Var.b();
            objPut = e61VarB.put(obj, obj2);
            c61 c61VarB = e61VarB.b();
            if (xi0.o(c61VarB, c61Var)) {
                break;
            }
            nq1 nq1Var3 = this.e;
            nq1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zD = d(this, (nq1) aq1.w(nq1Var3, this, sp1VarJ), i, c61VarB);
            }
            aq1.n(sp1VarJ, this);
        } while (!zD);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c61 c61Var;
        int i;
        sp1 sp1VarJ;
        boolean zD;
        do {
            synchronized (xi0.z) {
                nq1 nq1Var = this.e;
                nq1Var.getClass();
                nq1 nq1Var2 = (nq1) aq1.h(nq1Var);
                c61Var = nq1Var2.c;
                i = nq1Var2.d;
            }
            c61Var.getClass();
            e61 e61VarB = c61Var.b();
            e61VarB.putAll(map);
            c61 c61VarB = e61VarB.b();
            if (xi0.o(c61VarB, c61Var)) {
                return;
            }
            nq1 nq1Var3 = this.e;
            nq1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zD = d(this, (nq1) aq1.w(nq1Var3, this, sp1VarJ), i, c61VarB);
            }
            aq1.n(sp1VarJ, this);
        } while (!zD);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c61 c61Var;
        int i;
        V vRemove;
        sp1 sp1VarJ;
        boolean zD;
        do {
            synchronized (xi0.z) {
                nq1 nq1Var = this.e;
                nq1Var.getClass();
                nq1 nq1Var2 = (nq1) aq1.h(nq1Var);
                c61Var = nq1Var2.c;
                i = nq1Var2.d;
            }
            c61Var.getClass();
            e61 e61VarB = c61Var.b();
            vRemove = e61VarB.remove(obj);
            c61 c61VarB = e61VarB.b();
            if (xi0.o(c61VarB, c61Var)) {
                break;
            }
            nq1 nq1Var3 = this.e;
            nq1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zD = d(this, (nq1) aq1.w(nq1Var3, this, sp1VarJ), i, c61VarB);
            }
            aq1.n(sp1VarJ, this);
        } while (!zD);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        c61 c61Var = e().c;
        c61Var.getClass();
        return c61Var.f;
    }

    public final String toString() {
        nq1 nq1Var = this.e;
        nq1Var.getClass();
        return "SnapshotStateMap(value=" + ((nq1) aq1.h(nq1Var)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.h;
    }
}
