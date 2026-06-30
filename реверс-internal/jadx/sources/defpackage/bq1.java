package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bq1 implements Set, bk0 {
    public final oq1 e;
    public final /* synthetic */ int f;

    public bq1(oq1 oq1Var, int i) {
        this.f = i;
        this.e = oq1Var;
    }

    private final boolean a(Collection collection) {
        c61 c61Var;
        int i;
        sp1 sp1VarJ;
        boolean zD;
        Set setP0 = pl.p0(collection);
        oq1 oq1Var = this.e;
        boolean z = false;
        do {
            synchronized (xi0.z) {
                nq1 nq1Var = oq1Var.e;
                nq1Var.getClass();
                nq1 nq1Var2 = (nq1) aq1.h(nq1Var);
                c61Var = nq1Var2.c;
                i = nq1Var2.d;
            }
            c61Var.getClass();
            e61 e61VarB = c61Var.b();
            Iterator it = oq1Var.f.iterator();
            while (((us1) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((us1) it).next();
                if (!setP0.contains(entry.getKey())) {
                    e61VarB.remove(entry.getKey());
                    z = true;
                }
            }
            c61 c61VarB = e61VarB.b();
            if (xi0.o(c61VarB, c61Var)) {
                break;
            }
            nq1 nq1Var3 = oq1Var.e;
            nq1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zD = oq1.d(oq1Var, (nq1) aq1.w(nq1Var3, oq1Var, sp1VarJ), i, c61VarB);
            }
            aq1.n(sp1VarJ, oq1Var);
        } while (!zD);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                xi0.L();
                throw null;
            case 1:
                xi0.L();
                throw null;
            default:
                xi0.L();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f) {
            case 0:
                xi0.L();
                throw null;
            case 1:
                xi0.L();
                throw null;
            default:
                xi0.L();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f;
        oq1 oq1Var = this.e;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof yj0) && !(obj instanceof zj0))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return xi0.o(oq1Var.get(entry.getKey()), entry.getValue());
            case 1:
                return oq1Var.containsKey(obj);
            default:
                return oq1Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f;
        oq1 oq1Var = this.e;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!oq1Var.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!oq1Var.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f;
        oq1 oq1Var = this.e;
        switch (i) {
            case 0:
                return new us1(oq1Var, ((gf0) oq1Var.e().c.entrySet()).iterator(), 0);
            case 1:
                return new us1(oq1Var, ((gf0) oq1Var.e().c.entrySet()).iterator(), 1);
            default:
                return new us1(oq1Var, ((gf0) oq1Var.e().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.f;
        oq1 oq1Var = this.e;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof yj0) || (obj instanceof zj0)) && oq1Var.remove(((Map.Entry) obj).getKey()) != null) {
                    }
                }
                break;
            case 1:
                if (oq1Var.remove(obj) != null) {
                }
                break;
            default:
                Iterator it = oq1Var.f.iterator();
                while (true) {
                    if (((us1) it).hasNext()) {
                        next = ((us1) it).next();
                        if (xi0.o(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    oq1Var.remove(entry.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        c61 c61Var;
        int i;
        sp1 sp1VarJ;
        boolean zD;
        boolean z = false;
        switch (this.f) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.e.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.e.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
                break;
            default:
                Set setP0 = pl.p0(collection);
                oq1 oq1Var = this.e;
                do {
                    synchronized (xi0.z) {
                        nq1 nq1Var = oq1Var.e;
                        nq1Var.getClass();
                        nq1 nq1Var2 = (nq1) aq1.h(nq1Var);
                        c61Var = nq1Var2.c;
                        i = nq1Var2.d;
                    }
                    c61Var.getClass();
                    e61 e61VarB = c61Var.b();
                    Iterator it3 = oq1Var.f.iterator();
                    while (((us1) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((us1) it3).next();
                        if (setP0.contains(entry.getValue())) {
                            e61VarB.remove(entry.getKey());
                            z = true;
                        }
                    }
                    c61 c61VarB = e61VarB.b();
                    if (!xi0.o(c61VarB, c61Var)) {
                        nq1 nq1Var3 = oq1Var.e;
                        nq1Var3.getClass();
                        synchronized (aq1.c) {
                            sp1VarJ = aq1.j();
                            zD = oq1.d(oq1Var, (nq1) aq1.w(nq1Var3, oq1Var, sp1VarJ), i, c61VarB);
                        }
                        aq1.n(sp1VarJ, oq1Var);
                    }
                    return z;
                } while (!zD);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        c61 c61Var;
        int i;
        sp1 sp1VarJ;
        boolean zD;
        c61 c61Var2;
        int i2;
        sp1 sp1VarJ2;
        boolean zD2;
        boolean z = false;
        switch (this.f) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int I = bl.I(ql.Y(collection2, 10));
                if (I < 16) {
                    I = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(I);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                oq1 oq1Var = this.e;
                do {
                    synchronized (xi0.z) {
                        nq1 nq1Var = oq1Var.e;
                        nq1Var.getClass();
                        nq1 nq1Var2 = (nq1) aq1.h(nq1Var);
                        c61Var = nq1Var2.c;
                        i = nq1Var2.d;
                    }
                    c61Var.getClass();
                    e61 e61VarB = c61Var.b();
                    Iterator it = oq1Var.f.iterator();
                    while (((us1) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((us1) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !xi0.o(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            e61VarB.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    c61 c61VarB = e61VarB.b();
                    if (!xi0.o(c61VarB, c61Var)) {
                        nq1 nq1Var3 = oq1Var.e;
                        nq1Var3.getClass();
                        synchronized (aq1.c) {
                            sp1VarJ = aq1.j();
                            zD = oq1.d(oq1Var, (nq1) aq1.w(nq1Var3, oq1Var, sp1VarJ), i, c61VarB);
                        }
                        aq1.n(sp1VarJ, oq1Var);
                    }
                    return z;
                } while (!zD);
                return z;
            case 1:
                return a(collection);
            default:
                Set setP0 = pl.p0(collection);
                oq1 oq1Var2 = this.e;
                do {
                    synchronized (xi0.z) {
                        nq1 nq1Var4 = oq1Var2.e;
                        nq1Var4.getClass();
                        nq1 nq1Var5 = (nq1) aq1.h(nq1Var4);
                        c61Var2 = nq1Var5.c;
                        i2 = nq1Var5.d;
                    }
                    c61Var2.getClass();
                    e61 e61VarB2 = c61Var2.b();
                    Iterator it2 = oq1Var2.f.iterator();
                    while (((us1) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((us1) it2).next();
                        if (!setP0.contains(entry3.getValue())) {
                            e61VarB2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    c61 c61VarB2 = e61VarB2.b();
                    if (!xi0.o(c61VarB2, c61Var2)) {
                        nq1 nq1Var6 = oq1Var2.e;
                        nq1Var6.getClass();
                        synchronized (aq1.c) {
                            sp1VarJ2 = aq1.j();
                            zD2 = oq1.d(oq1Var2, (nq1) aq1.w(nq1Var6, oq1Var2, sp1VarJ2), i2, c61VarB2);
                        }
                        aq1.n(sp1VarJ2, oq1Var2);
                    }
                    return z;
                } while (!zD2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return c2.s(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return c2.t(this, objArr);
    }
}
