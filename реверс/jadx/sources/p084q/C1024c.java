package p084q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: q.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1024c implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1027f f4084a;

    public C1024c(C1027f c1027f) {
        this.f4084a = c1027f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f4084a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4084a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f4084a.m2472j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C1027f c1027f = this.f4084a;
        try {
            if (c1027f.f4104c == set.size()) {
                return c1027f.m2472j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C1027f c1027f = this.f4084a;
        int iHashCode = 0;
        for (int i2 = c1027f.f4104c - 1; i2 >= 0; i2--) {
            Object objM2490f = c1027f.m2490f(i2);
            iHashCode += objM2490f == null ? 0 : objM2490f.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f4084a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1023b(this.f4084a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1027f c1027f = this.f4084a;
        int iM2488d = c1027f.m2488d(obj);
        if (iM2488d < 0) {
            return false;
        }
        c1027f.m2491g(iM2488d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f4084a.m2473k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1027f c1027f = this.f4084a;
        int i2 = c1027f.f4104c;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (!collection.contains(c1027f.m2490f(i3))) {
                c1027f.m2491g(i3);
            }
        }
        return i2 != c1027f.f4104c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f4084a.f4104c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1027f c1027f = this.f4084a;
        int i2 = c1027f.f4104c;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c1027f.m2490f(i3);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1027f c1027f = this.f4084a;
        int i2 = c1027f.f4104c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c1027f.m2490f(i3);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
