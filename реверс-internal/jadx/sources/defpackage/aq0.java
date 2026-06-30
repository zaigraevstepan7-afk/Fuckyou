package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class aq0 extends c0 implements RandomAccess, Serializable {
    public static final aq0 h;
    public Object[] e;
    public int f;
    public boolean g;

    static {
        aq0 aq0Var = new aq0(0);
        aq0Var.g = true;
        h = aq0Var;
    }

    public aq0(int i) {
        if (i >= 0) {
            this.e = new Object[i];
        } else {
            yc.p("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.c0
    public final int a() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return;
        }
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.e[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        e(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.c0
    public final Object b(int i) {
        g();
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            return i(i);
        }
        yc.o(s91.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        h(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.e[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.e;
            int i = this.f;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (xi0.o(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.e[i] = obj;
    }

    public final void g() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            return this.e[i];
        }
        yc.o(s91.j("index: ", i, ", size: ", i2));
        return null;
    }

    public final void h(int i, int i2) {
        int i3 = this.f + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.e;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.e = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.e;
        nd.M(objArr2, objArr2, i + i2, i, this.f);
        this.f += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.e;
        int i = this.f;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.e;
        Object obj = objArr[i];
        nd.M(objArr, objArr, i, i + 1, this.f);
        Object[] objArr2 = this.e;
        int i2 = this.f - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.f--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f; i++) {
            if (xi0.o(this.e[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.e;
        nd.M(objArr, objArr, i, i + i2, this.f);
        Object[] objArr2 = this.e;
        int i3 = this.f;
        hk.R(objArr2, i3 - i2, i3);
        this.f -= i2;
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.e;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.e;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        nd.M(objArr, objArr, i + i4, i2 + i, this.f);
        Object[] objArr3 = this.e;
        int i7 = this.f;
        hk.R(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f - 1; i >= 0; i--) {
            if (xi0.o(this.e[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f;
        if (i >= 0 && i <= i2) {
            return new rd0(this, i);
        }
        yc.o(s91.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        g();
        return k(0, this.f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        return k(0, this.f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        xi0.s(i, i2, this.f);
        return new zp0(this.e, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f;
        Object[] objArr2 = this.e;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        nd.M(objArr2, objArr, 0, 0, i);
        int i2 = this.f;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return hk.h(this.e, 0, this.f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.f;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.e[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return nd.Q(this.e, 0, this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        int size = collection.size();
        e(this.f, collection, size);
        return size > 0;
    }
}
