package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kd implements Collection {
    public final /* synthetic */ ld e;

    public kd(ld ldVar) {
        this.e = ldVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new hd(this.e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        ld ldVar = this.e;
        int iA = ldVar.a(obj);
        if (iA < 0) {
            return false;
        }
        ldVar.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        ld ldVar = this.e;
        int i = ldVar.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(ldVar.h(i2))) {
                ldVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        ld ldVar = this.e;
        int i = ldVar.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(ldVar.h(i2))) {
                ldVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.e.g;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ld ldVar = this.e;
        int i = ldVar.g;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = ldVar.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        ld ldVar = this.e;
        int i = ldVar.g;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = ldVar.h(i2);
        }
        return objArr;
    }
}
