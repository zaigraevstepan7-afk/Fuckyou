package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mu1 implements Collection, yj0 {
    public final /* synthetic */ int e;
    public final Object f;

    public mu1() {
        this.e = 0;
        this.f = j31.a();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                return ((tx0) this.f).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                ((tx0) this.f).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return ((tx0) this.f).c(obj);
            default:
                return ((zx0) this.f).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((tx0) obj).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((zx0) obj).d(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                return ((tx0) this.f).g == 0;
            default:
                return ((zx0) this.f).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                tx0 tx0Var = (tx0) this.f;
                tx0Var.getClass();
                return new yb0(new vx0(tx0Var));
            default:
                return af1.x(new x40(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                return ((tx0) this.f).h(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                return ((tx0) this.f).h(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                return ((tx0) this.f).j(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.e) {
            case 0:
                return ((tx0) this.f).g;
            default:
                return ((zx0) this.f).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return c2.t(this, objArr);
    }

    public mu1(zx0 zx0Var) {
        this.e = 1;
        zx0Var.getClass();
        this.f = zx0Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
        }
        return c2.s(this);
    }
}
