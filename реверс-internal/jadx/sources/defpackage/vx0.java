package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 implements bk0, Set, yj0 {
    public final tx0 e;
    public final tx0 f;

    public vx0(tx0 tx0Var) {
        tx0Var.getClass();
        this.e = tx0Var;
        this.f = tx0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        tx0 tx0Var = this.f;
        tx0Var.getClass();
        int i = tx0Var.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            tx0Var.g(it.next());
        }
        return i != tx0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.e.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vx0.class != obj.getClass()) {
            return false;
        }
        return xi0.o(this.e, ((vx0) obj).e);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new yb0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f.h(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int iNumberOfTrailingZeros;
        collection.getClass();
        tx0 tx0Var = this.f;
        tx0Var.getClass();
        int i2 = tx0Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i3 = 1;
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i5 = iHashCode ^ (iHashCode << 16);
            int i6 = i5 & 127;
            int i7 = tx0Var.f;
            int i8 = (i5 >>> 7) & i7;
            while (true) {
                long[] jArr = tx0Var.a;
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                long j = ((jArr[i9 + i3] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
                long j2 = (((long) i6) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i7;
                    int i11 = i3;
                    if (xi0.o(tx0Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i3 = i11;
                }
                i4 += 8;
                i8 = (i8 + i4) & i7;
                i3 = i;
            }
            if (iNumberOfTrailingZeros >= 0) {
                tx0Var.i(iNumberOfTrailingZeros);
            }
        }
        return i2 != tx0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return c2.t(this, objArr);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return c2.s(this);
    }
}
