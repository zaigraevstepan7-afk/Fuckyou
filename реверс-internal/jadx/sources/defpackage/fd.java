package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fd extends c0 {
    public static final Object[] h = new Object[0];
    public int e;
    public Object[] f = h;
    public int g;

    @Override // defpackage.c0
    public final int a() {
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.g;
        if (i < 0 || i > i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        k();
        e(this.g + 1);
        int iJ = j(this.e + i);
        int i3 = this.g;
        if (i < ((i3 + 1) >> 1)) {
            if (iJ == 0) {
                Object[] objArr = this.f;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iJ - 1;
            }
            int length2 = this.e;
            if (length2 == 0) {
                Object[] objArr2 = this.f;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.e;
            Object[] objArr3 = this.f;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                nd.M(objArr3, objArr3, i5, i5 + 1, length + 1);
            } else {
                nd.M(objArr3, objArr3, i5 - 1, i5, objArr3.length);
                Object[] objArr4 = this.f;
                objArr4[objArr4.length - 1] = objArr4[0];
                nd.M(objArr4, objArr4, 0, 1, length + 1);
            }
            this.f[length] = obj;
            this.e = i4;
        } else {
            int iJ2 = j(i3 + this.e);
            Object[] objArr5 = this.f;
            if (iJ < iJ2) {
                nd.M(objArr5, objArr5, iJ + 1, iJ, iJ2);
            } else {
                nd.M(objArr5, objArr5, 1, 0, iJ2);
                Object[] objArr6 = this.f;
                objArr6[0] = objArr6[objArr6.length - 1];
                nd.M(objArr6, objArr6, iJ + 1, iJ, objArr6.length - 1);
            }
            this.f[iJ] = obj;
        }
        this.g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.g) {
            return addAll(collection);
        }
        k();
        e(collection.size() + this.g);
        int iJ = j(this.g + this.e);
        int iJ2 = j(this.e + i);
        int size = collection.size();
        if (i >= ((this.g + 1) >> 1)) {
            int i3 = iJ2 + size;
            Object[] objArr = this.f;
            if (iJ2 < iJ) {
                int i4 = size + iJ;
                if (i4 <= objArr.length) {
                    nd.M(objArr, objArr, i3, iJ2, iJ);
                } else if (i3 >= objArr.length) {
                    nd.M(objArr, objArr, i3 - objArr.length, iJ2, iJ);
                } else {
                    int length = iJ - (i4 - objArr.length);
                    nd.M(objArr, objArr, 0, length, iJ);
                    Object[] objArr2 = this.f;
                    nd.M(objArr2, objArr2, i3, iJ2, length);
                }
            } else {
                nd.M(objArr, objArr, size, 0, iJ);
                Object[] objArr3 = this.f;
                if (i3 >= objArr3.length) {
                    nd.M(objArr3, objArr3, i3 - objArr3.length, iJ2, objArr3.length);
                } else {
                    nd.M(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f;
                    nd.M(objArr4, objArr4, i3, iJ2, objArr4.length - size);
                }
            }
            c(iJ2, collection);
            return true;
        }
        int i5 = this.e;
        int length2 = i5 - size;
        Object[] objArr5 = this.f;
        if (iJ2 < i5) {
            nd.M(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.f;
            if (size >= iJ2) {
                nd.M(objArr6, objArr6, objArr6.length - size, 0, iJ2);
            } else {
                nd.M(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.f;
                nd.M(objArr7, objArr7, 0, size, iJ2);
            }
        } else if (length2 >= 0) {
            nd.M(objArr5, objArr5, length2, i5, iJ2);
        } else {
            length2 += objArr5.length;
            int i6 = iJ2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                nd.M(objArr5, objArr5, length2, i5, iJ2);
            } else {
                nd.M(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.f;
                nd.M(objArr8, objArr8, 0, this.e + length3, iJ2);
            }
        }
        this.e = length2;
        c(h(iJ2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        k();
        e(this.g + 1);
        int length = this.e;
        if (length == 0) {
            Object[] objArr = this.f;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.e = i;
        this.f[i] = obj;
        this.g++;
    }

    public final void addLast(Object obj) {
        k();
        e(a() + 1);
        this.f[j(a() + this.e)] = obj;
        this.g = a() + 1;
    }

    @Override // defpackage.c0
    public final Object b(int i) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        k();
        int iJ = j(this.e + i);
        Object[] objArr = this.f;
        Object obj = objArr[iJ];
        int i3 = this.g >> 1;
        int i4 = this.e;
        if (i < i3) {
            if (iJ >= i4) {
                nd.M(objArr, objArr, i4 + 1, i4, iJ);
            } else {
                nd.M(objArr, objArr, 1, 0, iJ);
                Object[] objArr2 = this.f;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.e;
                nd.M(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f;
            int i6 = this.e;
            objArr3[i6] = null;
            this.e = f(i6);
        } else {
            int iJ2 = j((a() - 1) + i4);
            Object[] objArr4 = this.f;
            if (iJ <= iJ2) {
                nd.M(objArr4, objArr4, iJ, iJ + 1, iJ2 + 1);
            } else {
                nd.M(objArr4, objArr4, iJ, iJ + 1, objArr4.length);
                Object[] objArr5 = this.f;
                objArr5[objArr5.length - 1] = objArr5[0];
                nd.M(objArr5, objArr5, 0, 1, iJ2 + 1);
            }
            this.f[iJ2] = null;
        }
        this.g--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f.length;
        while (i < length && it.hasNext()) {
            this.f[i] = it.next();
            i++;
        }
        int i2 = this.e;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f[i3] = it.next();
        }
        this.g = collection.size() + this.g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.e, j(a() + this.e));
        }
        this.e = 0;
        this.g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        if (i < 0) {
            yc.l("Deque is too big.");
            return;
        }
        Object[] objArr = this.f;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == h) {
            if (i < 10) {
                i = 10;
            }
            this.f = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        nd.M(objArr, objArr2, 0, this.e, objArr.length);
        Object[] objArr3 = this.f;
        int length2 = objArr3.length;
        int i3 = this.e;
        nd.M(objArr3, objArr2, length2 - i3, 0, i3);
        this.e = 0;
        this.f = objArr2;
    }

    public final int f(int i) {
        this.f.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.f[j((size() - 1) + this.e)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i >= 0 && i < iA) {
            return this.f[j(this.e + i)];
        }
        yc.o(s91.j("index: ", i, ", size: ", iA));
        return null;
    }

    public final int h(int i) {
        return i < 0 ? i + this.f.length : i;
    }

    public final void i(int i, int i2) {
        Object[] objArr = this.f;
        if (i < i2) {
            nd.R(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            nd.R(this.f, 0, i2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iJ = j(a() + this.e);
        int length = this.e;
        if (length < iJ) {
            while (length < iJ) {
                if (xi0.o(obj, this.f[length])) {
                    i = this.e;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.e) < iJ) {
            return -1;
        }
        int length2 = this.f.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iJ; i2++) {
                    if (xi0.o(obj, this.f[i2])) {
                        length = i2 + this.f.length;
                        i = this.e;
                    }
                }
                return -1;
            }
            if (xi0.o(obj, this.f[length])) {
                i = this.e;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(int i) {
        Object[] objArr = this.f;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            yc.h("ArrayDeque is empty.");
            return null;
        }
        return this.f[j((size() - 1) + this.e)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iJ = j(this.g + this.e);
        int i2 = this.e;
        if (i2 < iJ) {
            length = iJ - 1;
            if (i2 <= length) {
                while (!xi0.o(obj, this.f[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.e;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.e >= iJ) {
            while (true) {
                iJ--;
                Object[] objArr = this.f;
                if (-1 >= iJ) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.e;
                    if (i3 <= length) {
                        while (!xi0.o(obj, this.f[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.e;
                    }
                } else if (xi0.o(obj, objArr[iJ])) {
                    length = iJ + this.f.length;
                    i = this.e;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iJ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f.length != 0) {
            int iJ2 = j(this.g + this.e);
            int i = this.e;
            if (i < iJ2) {
                iJ = i;
                while (true) {
                    objArr = this.f;
                    if (i >= iJ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f[iJ] = obj;
                        iJ++;
                    }
                    i++;
                }
                nd.R(objArr, iJ, iJ2);
            } else {
                int length = this.f.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr3 = this.f;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f[iJ] = obj3;
                        iJ = f(iJ);
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.g = h(iJ - this.e);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            yc.h("ArrayDeque is empty.");
            return null;
        }
        k();
        Object[] objArr = this.f;
        int i = this.e;
        Object obj = objArr[i];
        objArr[i] = null;
        this.e = f(i);
        this.g = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            yc.h("ArrayDeque is empty.");
            return null;
        }
        k();
        int iJ = j((size() - 1) + this.e);
        Object[] objArr = this.f;
        Object obj = objArr[iJ];
        objArr[iJ] = null;
        this.g = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        xi0.s(i, i2, this.g);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.g) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        k();
        int i4 = this.g - i2;
        int i5 = this.e;
        if (i < i4) {
            int iJ = j((i - 1) + i5);
            int iJ2 = j(this.e + (i2 - 1));
            while (i > 0) {
                int i6 = iJ + 1;
                int iMin = Math.min(i, Math.min(i6, iJ2 + 1));
                Object[] objArr = this.f;
                int i7 = iJ2 - iMin;
                int i8 = iJ - iMin;
                nd.M(objArr, objArr, i7 + 1, i8 + 1, i6);
                iJ = h(i8);
                iJ2 = h(i7);
                i -= iMin;
            }
            int iJ3 = j(this.e + i3);
            i(this.e, iJ3);
            this.e = iJ3;
        } else {
            int iJ4 = j(i5 + i2);
            int iJ5 = j(this.e + i);
            int i9 = this.g;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f;
                i2 = Math.min(i9, Math.min(objArr2.length - iJ4, objArr2.length - iJ5));
                Object[] objArr3 = this.f;
                int i10 = iJ4 + i2;
                nd.M(objArr3, objArr3, iJ5, iJ4, i10);
                iJ4 = j(i10);
                iJ5 = j(iJ5 + i2);
            }
            int iJ6 = j(this.g + this.e);
            i(h(iJ6 - i3), iJ6);
        }
        this.g -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iJ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f.length != 0) {
            int iJ2 = j(this.g + this.e);
            int i = this.e;
            if (i < iJ2) {
                iJ = i;
                while (true) {
                    objArr = this.f;
                    if (i >= iJ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f[iJ] = obj;
                        iJ++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                nd.R(objArr, iJ, iJ2);
            } else {
                int length = this.f.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr3 = this.f;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f[iJ] = obj3;
                        iJ = f(iJ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.g = h(iJ - this.e);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            yc.o(s91.j("index: ", i, ", size: ", iA));
            return null;
        }
        int iJ = j(this.e + i);
        Object[] objArr = this.f;
        Object obj2 = objArr[iJ];
        objArr[iJ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.g;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iJ = j(this.g + this.e);
        int i2 = this.e;
        if (i2 < iJ) {
            nd.P(this.f, objArr, i2, iJ, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f;
            nd.M(objArr2, objArr, 0, this.e, objArr2.length);
            Object[] objArr3 = this.f;
            nd.M(objArr3, objArr, objArr3.length - this.e, 0, iJ);
        }
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        k();
        e(collection.size() + a());
        c(j(a() + this.e), collection);
        return true;
    }
}
