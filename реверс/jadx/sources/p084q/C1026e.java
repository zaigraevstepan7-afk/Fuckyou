package p084q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: q.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1026e implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1027f f4089a;

    public C1026e(C1027f c1027f) {
        this.f4089a = c1027f;
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
        this.f4089a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4089a.m2485a(obj) >= 0;
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
        return this.f4089a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1023b(this.f4089a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1027f c1027f = this.f4089a;
        int iM2485a = c1027f.m2485a(obj);
        if (iM2485a < 0) {
            return false;
        }
        c1027f.m2491g(iM2485a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1027f c1027f = this.f4089a;
        int i2 = c1027f.f4104c;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (collection.contains(c1027f.m2493i(i3))) {
                c1027f.m2491g(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1027f c1027f = this.f4089a;
        int i2 = c1027f.f4104c;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (!collection.contains(c1027f.m2493i(i3))) {
                c1027f.m2491g(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4089a.f4104c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1027f c1027f = this.f4089a;
        int i2 = c1027f.f4104c;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c1027f.m2493i(i3);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1027f c1027f = this.f4089a;
        int i2 = c1027f.f4104c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c1027f.m2493i(i3);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
