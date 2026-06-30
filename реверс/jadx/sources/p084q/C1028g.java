package p084q;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p035S0.AbstractC0365b;
import p051a1.AbstractC0451c;
import p086r.AbstractC1034a;

/* JADX INFO: renamed from: q.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1028g implements Collection, Set {

    /* JADX INFO: renamed from: a */
    public int[] f4093a = AbstractC1034a.f4111a;

    /* JADX INFO: renamed from: b */
    public Object[] f4094b = AbstractC1034a.f4112b;

    /* JADX INFO: renamed from: c */
    public int f4095c;

    /* JADX INFO: renamed from: a */
    public final void m2474a(int i2) {
        int i3 = this.f4095c;
        Object[] objArr = this.f4094b;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
            return;
        }
        int i4 = i3 - 1;
        int[] iArr = this.f4093a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i2 < i4) {
                int i5 = i2 + 1;
                AbstractC0365b.m997C0(i2, i5, i3, iArr, iArr);
                Object[] objArr2 = this.f4094b;
                AbstractC0365b.m998D0(objArr2, objArr2, i2, i5, i3);
            }
            this.f4094b[i4] = null;
        } else {
            int i6 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArr2 = new int[i6];
            this.f4093a = iArr2;
            this.f4094b = new Object[i6];
            if (i2 > 0) {
                AbstractC0365b.m997C0(0, 0, i2, iArr, iArr2);
                AbstractC0365b.m999E0(objArr, this.f4094b, 0, i2, 6);
            }
            if (i2 < i4) {
                int i7 = i2 + 1;
                AbstractC0365b.m997C0(i2, i7, i3, iArr, this.f4093a);
                AbstractC0365b.m998D0(objArr, this.f4094b, i2, i7, i3);
            }
        }
        if (i3 != this.f4095c) {
            throw new ConcurrentModificationException();
        }
        this.f4095c = i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iM2484a;
        int i3 = this.f4095c;
        if (obj == null) {
            iM2484a = AbstractC1030i.m2484a(this, null, 0);
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iM2484a = AbstractC1030i.m2484a(this, obj, iHashCode);
        }
        if (iM2484a >= 0) {
            return false;
        }
        int i4 = ~iM2484a;
        int[] iArr = this.f4093a;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f4094b;
            int[] iArr2 = new int[i5];
            this.f4093a = iArr2;
            this.f4094b = new Object[i5];
            if (i3 != this.f4095c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC0365b.m997C0(0, 0, iArr.length, iArr, iArr2);
                AbstractC0365b.m999E0(objArr, this.f4094b, 0, objArr.length, 6);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f4093a;
            int i6 = i4 + 1;
            AbstractC0365b.m997C0(i6, i4, i3, iArr3, iArr3);
            Object[] objArr2 = this.f4094b;
            AbstractC0365b.m998D0(objArr2, objArr2, i6, i4, i3);
        }
        int i7 = this.f4095c;
        if (i3 == i7) {
            int[] iArr4 = this.f4093a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f4094b[i4] = obj;
                this.f4095c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC0451c.m1146e(collection, "elements");
        int size = collection.size() + this.f4095c;
        int i2 = this.f4095c;
        int[] iArr = this.f4093a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4094b;
            int[] iArr2 = new int[size];
            this.f4093a = iArr2;
            this.f4094b = new Object[size];
            int i3 = this.f4095c;
            if (i3 > 0) {
                AbstractC0365b.m997C0(0, 0, i3, iArr, iArr2);
                AbstractC0365b.m999E0(objArr, this.f4094b, 0, this.f4095c, 6);
            }
        }
        if (this.f4095c != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f4095c != 0) {
            this.f4093a = AbstractC1034a.f4111a;
            this.f4094b = AbstractC1034a.f4112b;
            this.f4095c = 0;
        }
        if (this.f4095c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1030i.m2484a(this, null, 0) : AbstractC1030i.m2484a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC0451c.m1146e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f4095c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i2 = this.f4095c;
            for (int i3 = 0; i3 < i2; i3++) {
                if (!((Set) obj).contains(this.f4094b[i3])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f4093a;
        int i2 = this.f4095c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4095c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1023b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM2484a = obj == null ? AbstractC1030i.m2484a(this, null, 0) : AbstractC1030i.m2484a(this, obj, obj.hashCode());
        if (iM2484a < 0) {
            return false;
        }
        m2474a(iM2484a);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC0451c.m1146e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC0451c.m1146e(collection, "elements");
        boolean z2 = false;
        for (int i2 = this.f4095c - 1; -1 < i2; i2--) {
            if (!collection.contains(this.f4094b[i2])) {
                m2474a(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4095c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f4094b;
        int i2 = this.f4095c;
        AbstractC0451c.m1146e(objArr, "<this>");
        int length = objArr.length;
        if (i2 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i2);
            AbstractC0451c.m1145d(objArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4095c * 14);
        sb.append('{');
        int i2 = this.f4095c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4094b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0451c.m1145d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC0451c.m1146e(objArr, "array");
        int i2 = this.f4095c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        AbstractC0365b.m998D0(this.f4094b, objArr, 0, 0, this.f4095c);
        return objArr;
    }
}
