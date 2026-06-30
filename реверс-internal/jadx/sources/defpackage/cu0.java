package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cu0 implements Map, yj0 {
    public final zx0 e;
    public y40 f;
    public y40 g;
    public mu1 h;

    public cu0(zx0 zx0Var) {
        zx0Var.getClass();
        this.e = zx0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.e.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.e.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        y40 y40Var = this.f;
        if (y40Var != null) {
            return y40Var;
        }
        y40 y40Var2 = new y40(this.e, 0);
        this.f = y40Var2;
        return y40Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cu0.class != obj.getClass()) {
            return false;
        }
        return xi0.o(this.e, ((cu0) obj).e);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.e.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.e.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        y40 y40Var = this.g;
        if (y40Var != null) {
            return y40Var;
        }
        y40 y40Var2 = new y40(this.e, 1);
        this.g = y40Var2;
        return y40Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.e.e;
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        mu1 mu1Var = this.h;
        if (mu1Var != null) {
            return mu1Var;
        }
        mu1 mu1Var2 = new mu1(this.e);
        this.h = mu1Var2;
        return mu1Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
