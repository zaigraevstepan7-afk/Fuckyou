package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qx0 implements List, yj0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ qx0(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.e;
        Object obj2 = this.f;
        switch (i3) {
            case 0:
                sx0 sx0Var = (sx0) obj2;
                if (i < 0 || i > (i2 = sx0Var.b)) {
                    sx0Var.p(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = sx0Var.a;
                if (objArr.length < i4) {
                    sx0Var.m(i4, objArr);
                }
                Object[] objArr2 = sx0Var.a;
                int i5 = sx0Var.b;
                if (i != i5) {
                    nd.M(objArr2, objArr2, i + 1, i, i5);
                }
                objArr2[i] = obj;
                sx0Var.b++;
                return;
            default:
                ((iy0) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                collection.getClass();
                sx0 sx0Var = (sx0) obj;
                if (i < 0 || i > sx0Var.b) {
                    sx0Var.p(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + sx0Var.b;
                Object[] objArr = sx0Var.a;
                if (objArr.length < size) {
                    sx0Var.m(size, objArr);
                }
                Object[] objArr2 = sx0Var.a;
                if (i != sx0Var.b) {
                    nd.M(objArr2, objArr2, collection.size() + i, i, sx0Var.b);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        hk.V();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                sx0Var.b = collection.size() + sx0Var.b;
                return true;
            default:
                return ((iy0) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((sx0) obj).d();
                break;
            default:
                ((iy0) obj).g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((sx0) obj2).g(obj) >= 0;
            default:
                return ((iy0) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                sx0 sx0Var = (sx0) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (sx0Var.g(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                iy0 iy0Var = (iy0) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!iy0Var.h(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                s01.a(i, this);
                return ((sx0) obj).f(i);
            default:
                jy0.a(i, this);
                return ((iy0) obj).e[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((sx0) obj2).g(obj);
            default:
                return ((iy0) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((sx0) obj).h();
            default:
                return ((iy0) obj).g == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new px0(this, 0, 0);
            default:
                return new px0(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.e;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                sx0 sx0Var = (sx0) obj2;
                Object[] objArr = sx0Var.a;
                int i3 = sx0Var.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                iy0 iy0Var = (iy0) obj2;
                Object[] objArr2 = iy0Var.e;
                for (int i4 = iy0Var.g - 1; i4 >= 0; i4--) {
                    if (xi0.o(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.e) {
            case 0:
                return new px0(this, 0, 0);
            default:
                return new px0(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                s01.a(i, this);
                return ((sx0) obj).k(i);
            default:
                jy0.a(i, this);
                return ((iy0) obj).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                sx0 sx0Var = (sx0) obj;
                int i2 = sx0Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    sx0Var.j(it.next());
                }
                if (i2 == sx0Var.b) {
                    break;
                }
                break;
            default:
                iy0 iy0Var = (iy0) obj;
                if (!collection.isEmpty()) {
                    int i3 = iy0Var.g;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        iy0Var.j(it2.next());
                    }
                    if (i3 != iy0Var.g) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                sx0 sx0Var = (sx0) obj;
                int i2 = sx0Var.b;
                Object[] objArr = sx0Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        sx0Var.k(i3);
                    }
                }
                if (i2 != sx0Var.b) {
                }
                break;
            default:
                iy0 iy0Var = (iy0) obj;
                int i4 = iy0Var.g;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(iy0Var.e[i5])) {
                        iy0Var.k(i5);
                    }
                }
                if (i4 != iy0Var.g) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.e;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                s01.a(i, this);
                return ((sx0) obj2).n(i, obj);
            default:
                jy0.a(i, this);
                Object[] objArr = ((iy0) obj2).e;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((sx0) obj).b;
            default:
                return ((iy0) obj).g;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.e) {
            case 0:
                s01.b(this, i, i2);
                return new rx0(this, i, i2, 0);
            default:
                jy0.b(this, i, i2);
                return new rx0(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                objArr.getClass();
                break;
        }
        return c2.t(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
        }
        return c2.s(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.e) {
            case 0:
                return new px0(this, i, 0);
            default:
                return new px0(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((sx0) obj2).j(obj);
            default:
                return ((iy0) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((sx0) obj2).a(obj);
                break;
            default:
                ((iy0) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                sx0 sx0Var = (sx0) obj;
                int i2 = sx0Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    sx0Var.a(it.next());
                }
                return i2 != sx0Var.b;
            default:
                iy0 iy0Var = (iy0) obj;
                return iy0Var.e(iy0Var.g, collection);
        }
    }
}
