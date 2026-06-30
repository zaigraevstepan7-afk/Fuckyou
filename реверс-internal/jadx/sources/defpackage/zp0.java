package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zp0 extends c0 implements RandomAccess, Serializable {
    public Object[] e;
    public final int f;
    public int g;
    public final zp0 h;
    public final aq0 i;

    public zp0(Object[] objArr, int i, int i2, zp0 zp0Var, aq0 aq0Var) {
        objArr.getClass();
        aq0Var.getClass();
        this.e = objArr;
        this.f = i;
        this.g = i2;
        this.h = zp0Var;
        this.i = aq0Var;
        ((AbstractList) this).modCount = ((AbstractList) aq0Var).modCount;
    }

    @Override // defpackage.c0
    public final int a() {
        g();
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
        } else {
            f(this.f + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        g();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        e(this.f + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.c0
    public final Object b(int i) {
        h();
        g();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return i(this.f + i);
        }
        yc.o(s91.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f, this.g);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        aq0 aq0Var = this.i;
        zp0 zp0Var = this.h;
        if (zp0Var != null) {
            zp0Var.e(i, collection, i2);
        } else {
            aq0 aq0Var2 = aq0.h;
            aq0Var.e(i, collection, i2);
        }
        this.e = aq0Var.e;
        this.g += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.e;
            int i = this.g;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (xi0.o(objArr[this.f + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        aq0 aq0Var = this.i;
        zp0 zp0Var = this.h;
        if (zp0Var != null) {
            zp0Var.f(i, obj);
        } else {
            aq0 aq0Var2 = aq0.h;
            aq0Var.f(i, obj);
        }
        this.e = aq0Var.e;
        this.g++;
    }

    public final void g() {
        if (((AbstractList) this.i).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return this.e[this.f + i];
        }
        yc.o(s91.j("index: ", i, ", size: ", i2));
        return null;
    }

    public final void h() {
        if (this.i.g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.e;
        int i = this.g;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        Object objI;
        ((AbstractList) this).modCount++;
        zp0 zp0Var = this.h;
        if (zp0Var != null) {
            objI = zp0Var.i(i);
        } else {
            aq0 aq0Var = aq0.h;
            objI = this.i.i(i);
        }
        this.g--;
        return objI;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.g; i++) {
            if (xi0.o(this.e[this.f + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        zp0 zp0Var = this.h;
        if (zp0Var != null) {
            zp0Var.j(i, i2);
        } else {
            aq0 aq0Var = aq0.h;
            this.i.j(i, i2);
        }
        this.g -= i2;
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        int iK;
        zp0 zp0Var = this.h;
        if (zp0Var != null) {
            iK = zp0Var.k(i, i2, collection, z);
        } else {
            aq0 aq0Var = aq0.h;
            iK = this.i.k(i, i2, collection, z);
        }
        if (iK > 0) {
            ((AbstractList) this).modCount++;
        }
        this.g -= iK;
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.g - 1; i >= 0; i--) {
            if (xi0.o(this.e[this.f + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i2 = this.g;
        if (i >= 0 && i <= i2) {
            return new rd0(this, i);
        }
        yc.o(s91.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.f, this.g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.f, this.g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.e;
        int i3 = this.f;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        xi0.s(i, i2, this.g);
        return new zp0(this.e, this.f + i, i2 - i, this, this.i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        g();
        int length = objArr.length;
        int i = this.g;
        Object[] objArr2 = this.e;
        int i2 = this.f;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        nd.M(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return hk.h(this.e, this.f, this.g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f + this.g, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.e;
        int i = this.g;
        int i2 = this.f;
        return nd.Q(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        g();
        int size = collection.size();
        e(this.f + this.g, collection, size);
        return size > 0;
    }
}
