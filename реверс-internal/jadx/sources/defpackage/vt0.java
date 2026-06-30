package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vt0 extends d0 {
    public final /* synthetic */ int e;
    public final ut0 f;

    public /* synthetic */ vt0(ut0 ut0Var, int i) {
        this.e = i;
        this.f = ut0Var;
    }

    @Override // defpackage.d0
    public final int a() {
        switch (this.e) {
        }
        return this.f.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.e) {
            case 0:
                this.f.clear();
                break;
            default:
                this.f.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.e;
        ut0 ut0Var = this.f;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ut0Var.getClass();
                int iF = ut0Var.f(entry.getKey());
                if (iF < 0) {
                    return false;
                }
                Object[] objArr = ut0Var.f;
                objArr.getClass();
                return xi0.o(objArr[iF], entry.getValue());
            default:
                return ut0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                return this.f.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.e) {
        }
        return this.f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        ut0 ut0Var = this.f;
        switch (i) {
            case 0:
                ut0Var.getClass();
                return new rt0(ut0Var, 0);
            default:
                ut0Var.getClass();
                return new rt0(ut0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.e;
        ut0 ut0Var = this.f;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ut0Var.getClass();
                    ut0Var.b();
                    int iF = ut0Var.f(entry.getKey());
                    if (iF >= 0) {
                        Object[] objArr = ut0Var.f;
                        objArr.getClass();
                        if (xi0.o(objArr[iF], entry.getValue())) {
                            ut0Var.j(iF);
                        }
                    }
                }
                break;
            default:
                ut0Var.b();
                int iF2 = ut0Var.f(obj);
                if (iF2 >= 0) {
                    ut0Var.j(iF2);
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        ut0 ut0Var = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                ut0Var.b();
                break;
            default:
                ut0Var.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        ut0 ut0Var = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                ut0Var.b();
                break;
            default:
                ut0Var.b();
                break;
        }
        return super.retainAll(collection);
    }
}
