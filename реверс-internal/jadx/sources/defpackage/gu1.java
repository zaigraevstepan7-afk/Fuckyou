package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gu1 implements List, yj0 {
    public final mq1 e;
    public final int f;
    public int g;
    public int h;

    public gu1(mq1 mq1Var, int i, int i2) {
        this.e = mq1Var;
        this.f = i;
        this.g = wi0.z(mq1Var);
        this.h = i2 - i;
    }

    public final void a() {
        if (wi0.z(this.e) != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.f + this.h;
        mq1 mq1Var = this.e;
        mq1Var.add(i, obj);
        this.h++;
        this.g = wi0.z(mq1Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.f;
        mq1 mq1Var = this.e;
        boolean zAddAll = mq1Var.addAll(i2, collection);
        if (zAddAll) {
            this.h = collection.size() + this.h;
            this.g = wi0.z(mq1Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        if (this.h > 0) {
            a();
            mq1 mq1Var = this.e;
            int i2 = this.f;
            int i3 = this.h + i2;
            do {
                synchronized (wi0.G) {
                    ss1 ss1Var = mq1Var.e;
                    ss1Var.getClass();
                    ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                    i = ss1Var2.d;
                    f0Var = ss1Var2.c;
                }
                f0Var.getClass();
                p61 p61VarF = f0Var.f();
                p61VarF.subList(i2, i3).clear();
                f0 f0VarC = p61VarF.c();
                if (xi0.o(f0VarC, f0Var)) {
                    break;
                }
                ss1 ss1Var3 = mq1Var.e;
                ss1Var3.getClass();
                synchronized (aq1.c) {
                    sp1VarJ = aq1.j();
                    zQ = wi0.q((ss1) aq1.w(ss1Var3, mq1Var, sp1VarJ), i, f0VarC, true);
                }
                aq1.n(sp1VarJ, mq1Var);
            } while (!zQ);
            this.h = 0;
            this.g = wi0.z(this.e);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        wi0.p(i, this.h);
        return this.e.get(this.f + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        a();
        int i = this.h;
        int i2 = this.f;
        Iterator it = lk.o0(i2, i + i2).iterator();
        do {
            qh0 qh0Var = (qh0) it;
            if (!qh0Var.g) {
                return -1;
            }
            iNextInt = qh0Var.nextInt();
        } while (!xi0.o(obj, this.e.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.f;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (xi0.o(obj, this.e.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        xc1 xc1Var = new xc1();
        xc1Var.e = i - 1;
        return new ve1(xc1Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.f + i;
        mq1 mq1Var = this.e;
        Object objRemove = mq1Var.remove(i2);
        this.h--;
        this.g = wi0.z(mq1Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        a();
        mq1 mq1Var = this.e;
        int i2 = this.f;
        int i3 = this.h + i2;
        int size = mq1Var.size();
        do {
            synchronized (wi0.G) {
                ss1 ss1Var = mq1Var.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            p61 p61VarF = f0Var.f();
            p61VarF.subList(i2, i3).retainAll(collection);
            f0 f0VarC = p61VarF.c();
            if (xi0.o(f0VarC, f0Var)) {
                break;
            }
            ss1 ss1Var3 = mq1Var.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = wi0.q((ss1) aq1.w(ss1Var3, mq1Var, sp1VarJ), i, f0VarC, true);
            }
            aq1.n(sp1VarJ, mq1Var);
        } while (!zQ);
        int size2 = size - mq1Var.size();
        if (size2 > 0) {
            this.g = wi0.z(this.e);
            this.h -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        wi0.p(i, this.h);
        a();
        int i2 = i + this.f;
        mq1 mq1Var = this.e;
        Object obj2 = mq1Var.set(i2, obj);
        this.g = wi0.z(mq1Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.h) {
            e91.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.f;
        return new gu1(this.e, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return c2.s(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return c2.t(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.f + i;
        mq1 mq1Var = this.e;
        mq1Var.add(i2, obj);
        this.h++;
        this.g = wi0.z(mq1Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.h, collection);
    }
}
