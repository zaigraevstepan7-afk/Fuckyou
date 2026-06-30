package p035S0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p001A0.AbstractC0016e;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: S0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0364a extends AbstractList implements List {

    /* JADX INFO: renamed from: d */
    public static final Object[] f1005d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f1006a;

    /* JADX INFO: renamed from: b */
    public Object[] f1007b = f1005d;

    /* JADX INFO: renamed from: c */
    public int f1008c;

    /* JADX INFO: renamed from: a */
    public final void m993a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1007b.length;
        while (i2 < length && it.hasNext()) {
            this.f1007b[i2] = it.next();
            i2++;
        }
        int i3 = this.f1006a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f1007b[i4] = it.next();
        }
        this.f1008c = collection.size() + this.f1008c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        int i3 = this.f1008c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == i3) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        m994b(i3 + 1);
        int iM996d = m996d(this.f1006a + i2);
        int i4 = this.f1008c;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iM996d == 0) {
                Object[] objArr = this.f1007b;
                AbstractC0451c.m1146e(objArr, "<this>");
                iM996d = objArr.length;
            }
            int i5 = iM996d - 1;
            int i6 = this.f1006a;
            if (i6 == 0) {
                Object[] objArr2 = this.f1007b;
                AbstractC0451c.m1146e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.f1006a;
            if (i5 >= i7) {
                Object[] objArr3 = this.f1007b;
                objArr3[length] = objArr3[i7];
                AbstractC0365b.m998D0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f1007b;
                AbstractC0365b.m998D0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f1007b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0365b.m998D0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f1007b[i5] = obj;
            this.f1006a = length;
        } else {
            int iM996d2 = m996d(this.f1006a + i4);
            if (iM996d < iM996d2) {
                Object[] objArr6 = this.f1007b;
                AbstractC0365b.m998D0(objArr6, objArr6, iM996d + 1, iM996d, iM996d2);
            } else {
                Object[] objArr7 = this.f1007b;
                AbstractC0365b.m998D0(objArr7, objArr7, 1, 0, iM996d2);
                Object[] objArr8 = this.f1007b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0365b.m998D0(objArr8, objArr8, iM996d + 1, iM996d, objArr8.length - 1);
            }
            this.f1007b[iM996d] = obj;
        }
        this.f1008c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        AbstractC0451c.m1146e(collection, "elements");
        int i3 = this.f1008c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i4 = this.f1008c;
        if (i2 == i4) {
            return addAll(collection);
        }
        m994b(collection.size() + i4);
        int iM996d = m996d(this.f1006a + this.f1008c);
        int iM996d2 = m996d(this.f1006a + i2);
        int size = collection.size();
        if (i2 >= ((this.f1008c + 1) >> 1)) {
            int i5 = iM996d2 + size;
            if (iM996d2 < iM996d) {
                int i6 = size + iM996d;
                Object[] objArr = this.f1007b;
                if (i6 <= objArr.length) {
                    AbstractC0365b.m998D0(objArr, objArr, i5, iM996d2, iM996d);
                } else if (i5 >= objArr.length) {
                    AbstractC0365b.m998D0(objArr, objArr, i5 - objArr.length, iM996d2, iM996d);
                } else {
                    int length = iM996d - (i6 - objArr.length);
                    AbstractC0365b.m998D0(objArr, objArr, 0, length, iM996d);
                    Object[] objArr2 = this.f1007b;
                    AbstractC0365b.m998D0(objArr2, objArr2, i5, iM996d2, length);
                }
            } else {
                Object[] objArr3 = this.f1007b;
                AbstractC0365b.m998D0(objArr3, objArr3, size, 0, iM996d);
                Object[] objArr4 = this.f1007b;
                if (i5 >= objArr4.length) {
                    AbstractC0365b.m998D0(objArr4, objArr4, i5 - objArr4.length, iM996d2, objArr4.length);
                } else {
                    AbstractC0365b.m998D0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f1007b;
                    AbstractC0365b.m998D0(objArr5, objArr5, i5, iM996d2, objArr5.length - size);
                }
            }
            m993a(iM996d2, collection);
            return true;
        }
        int i7 = this.f1006a;
        int length2 = i7 - size;
        if (iM996d2 < i7) {
            Object[] objArr6 = this.f1007b;
            AbstractC0365b.m998D0(objArr6, objArr6, length2, i7, objArr6.length);
            if (size >= iM996d2) {
                Object[] objArr7 = this.f1007b;
                AbstractC0365b.m998D0(objArr7, objArr7, objArr7.length - size, 0, iM996d2);
            } else {
                Object[] objArr8 = this.f1007b;
                AbstractC0365b.m998D0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f1007b;
                AbstractC0365b.m998D0(objArr9, objArr9, 0, size, iM996d2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f1007b;
            AbstractC0365b.m998D0(objArr10, objArr10, length2, i7, iM996d2);
        } else {
            Object[] objArr11 = this.f1007b;
            length2 += objArr11.length;
            int i8 = iM996d2 - i7;
            int length3 = objArr11.length - length2;
            if (length3 >= i8) {
                AbstractC0365b.m998D0(objArr11, objArr11, length2, i7, iM996d2);
            } else {
                AbstractC0365b.m998D0(objArr11, objArr11, length2, i7, i7 + length3);
                Object[] objArr12 = this.f1007b;
                AbstractC0365b.m998D0(objArr12, objArr12, 0, this.f1006a + length3, iM996d2);
            }
        }
        this.f1006a = length2;
        int length4 = iM996d2 - size;
        if (length4 < 0) {
            length4 += this.f1007b.length;
        }
        m993a(length4, collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m994b(this.f1008c + 1);
        int length = this.f1006a;
        if (length == 0) {
            Object[] objArr = this.f1007b;
            AbstractC0451c.m1146e(objArr, "<this>");
            length = objArr.length;
        }
        int i2 = length - 1;
        this.f1006a = i2;
        this.f1007b[i2] = obj;
        this.f1008c++;
    }

    public final void addLast(Object obj) {
        m994b(this.f1008c + 1);
        this.f1007b[m996d(this.f1006a + this.f1008c)] = obj;
        this.f1008c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m994b(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1007b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f1005d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f1007b = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        AbstractC0365b.m998D0(objArr, objArr2, 0, this.f1006a, objArr.length);
        Object[] objArr3 = this.f1007b;
        int length2 = objArr3.length;
        int i4 = this.f1006a;
        AbstractC0365b.m998D0(objArr3, objArr2, length2 - i4, 0, i4);
        this.f1006a = 0;
        this.f1007b = objArr2;
    }

    /* JADX INFO: renamed from: c */
    public final int m995c(int i2) {
        AbstractC0451c.m1146e(this.f1007b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iM996d = m996d(this.f1006a + this.f1008c);
        int i2 = this.f1006a;
        if (i2 < iM996d) {
            Object[] objArr = this.f1007b;
            AbstractC0451c.m1146e(objArr, "<this>");
            Arrays.fill(objArr, i2, iM996d, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1007b;
            Arrays.fill(objArr2, this.f1006a, objArr2.length, (Object) null);
            Object[] objArr3 = this.f1007b;
            AbstractC0451c.m1146e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, iM996d, (Object) null);
        }
        this.f1006a = 0;
        this.f1008c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m996d(int i2) {
        Object[] objArr = this.f1007b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f1008c;
        if (i2 >= 0 && i2 < i3) {
            return this.f1007b[m996d(this.f1006a + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iM996d = m996d(this.f1006a + this.f1008c);
        int length = this.f1006a;
        if (length < iM996d) {
            while (length < iM996d) {
                if (AbstractC0451c.m1142a(obj, this.f1007b[length])) {
                    i2 = this.f1006a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM996d) {
            return -1;
        }
        int length2 = this.f1007b.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iM996d; i3++) {
                    if (AbstractC0451c.m1142a(obj, this.f1007b[i3])) {
                        length = i3 + this.f1007b.length;
                        i2 = this.f1006a;
                    }
                }
                return -1;
            }
            if (AbstractC0451c.m1142a(obj, this.f1007b[length])) {
                i2 = this.f1006a;
                break;
            }
            length++;
        }
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1008c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iM996d = m996d(this.f1006a + this.f1008c);
        int i3 = this.f1006a;
        if (i3 < iM996d) {
            length = iM996d - 1;
            if (i3 <= length) {
                while (!AbstractC0451c.m1142a(obj, this.f1007b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f1006a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iM996d) {
            int i4 = iM996d - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f1007b;
                    AbstractC0451c.m1146e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f1006a;
                    if (i5 <= length) {
                        while (!AbstractC0451c.m1142a(obj, this.f1007b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f1006a;
                    }
                } else {
                    if (AbstractC0451c.m1142a(obj, this.f1007b[i4])) {
                        length = i4 + this.f1007b.length;
                        i2 = this.f1006a;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.f1008c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == AbstractC0016e.m166R(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        int iM996d = m996d(this.f1006a + i2);
        Object[] objArr = this.f1007b;
        Object obj = objArr[iM996d];
        if (i2 < (this.f1008c >> 1)) {
            int i4 = this.f1006a;
            if (iM996d >= i4) {
                AbstractC0365b.m998D0(objArr, objArr, i4 + 1, i4, iM996d);
            } else {
                AbstractC0365b.m998D0(objArr, objArr, 1, 0, iM996d);
                Object[] objArr2 = this.f1007b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f1006a;
                AbstractC0365b.m998D0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1007b;
            int i6 = this.f1006a;
            objArr3[i6] = null;
            this.f1006a = m995c(i6);
        } else {
            int iM996d2 = m996d(AbstractC0016e.m166R(this) + this.f1006a);
            if (iM996d <= iM996d2) {
                Object[] objArr4 = this.f1007b;
                AbstractC0365b.m998D0(objArr4, objArr4, iM996d, iM996d + 1, iM996d2 + 1);
            } else {
                Object[] objArr5 = this.f1007b;
                AbstractC0365b.m998D0(objArr5, objArr5, iM996d, iM996d + 1, objArr5.length);
                Object[] objArr6 = this.f1007b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0365b.m998D0(objArr6, objArr6, 0, 1, iM996d2 + 1);
            }
            this.f1007b[iM996d2] = null;
        }
        this.f1008c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM996d;
        AbstractC0451c.m1146e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1007b.length != 0) {
            int iM996d2 = m996d(this.f1006a + this.f1008c);
            int i2 = this.f1006a;
            if (i2 < iM996d2) {
                iM996d = i2;
                while (i2 < iM996d2) {
                    Object obj = this.f1007b[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f1007b[iM996d] = obj;
                        iM996d++;
                    }
                    i2++;
                }
                Object[] objArr = this.f1007b;
                AbstractC0451c.m1146e(objArr, "<this>");
                Arrays.fill(objArr, iM996d, iM996d2, (Object) null);
            } else {
                int length = this.f1007b.length;
                int i3 = i2;
                boolean z3 = false;
                while (i2 < length) {
                    Object[] objArr2 = this.f1007b;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f1007b[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iM996d = m996d(i3);
                for (int i4 = 0; i4 < iM996d2; i4++) {
                    Object[] objArr3 = this.f1007b;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f1007b[iM996d] = obj3;
                        iM996d = m995c(iM996d);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int length2 = iM996d - this.f1006a;
                if (length2 < 0) {
                    length2 += this.f1007b.length;
                }
                this.f1008c = length2;
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f1007b;
        int i2 = this.f1006a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f1006a = m995c(i2);
        this.f1008c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iM996d = m996d(AbstractC0016e.m166R(this) + this.f1006a);
        Object[] objArr = this.f1007b;
        Object obj = objArr[iM996d];
        objArr[iM996d] = null;
        this.f1008c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM996d;
        AbstractC0451c.m1146e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1007b.length != 0) {
            int iM996d2 = m996d(this.f1006a + this.f1008c);
            int i2 = this.f1006a;
            if (i2 < iM996d2) {
                iM996d = i2;
                while (i2 < iM996d2) {
                    Object obj = this.f1007b[i2];
                    if (collection.contains(obj)) {
                        this.f1007b[iM996d] = obj;
                        iM996d++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                Object[] objArr = this.f1007b;
                AbstractC0451c.m1146e(objArr, "<this>");
                Arrays.fill(objArr, iM996d, iM996d2, (Object) null);
            } else {
                int length = this.f1007b.length;
                int i3 = i2;
                boolean z3 = false;
                while (i2 < length) {
                    Object[] objArr2 = this.f1007b;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f1007b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iM996d = m996d(i3);
                for (int i4 = 0; i4 < iM996d2; i4++) {
                    Object[] objArr3 = this.f1007b;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f1007b[iM996d] = obj3;
                        iM996d = m995c(iM996d);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int length2 = iM996d - this.f1006a;
                if (length2 < 0) {
                    length2 += this.f1007b.length;
                }
                this.f1008c = length2;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f1008c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int iM996d = m996d(this.f1006a + i2);
        Object[] objArr = this.f1007b;
        Object obj2 = objArr[iM996d];
        objArr[iM996d] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1008c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f1008c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0451c.m1146e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f1008c;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            AbstractC0451c.m1144c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM996d = m996d(this.f1006a + this.f1008c);
        int i3 = this.f1006a;
        if (i3 < iM996d) {
            AbstractC0365b.m999E0(this.f1007b, objArr, i3, iM996d, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1007b;
            AbstractC0365b.m998D0(objArr2, objArr, 0, this.f1006a, objArr2.length);
            Object[] objArr3 = this.f1007b;
            AbstractC0365b.m998D0(objArr3, objArr, objArr3.length - this.f1006a, 0, iM996d);
        }
        int length2 = objArr.length;
        int i4 = this.f1008c;
        if (length2 > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0451c.m1146e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m994b(collection.size() + this.f1008c);
        m993a(m996d(this.f1006a + this.f1008c), collection);
        return true;
    }
}
