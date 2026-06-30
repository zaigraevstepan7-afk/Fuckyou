package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class st0 implements Map.Entry, zj0 {
    public final ut0 e;
    public final int f;
    public final int g;

    public st0(ut0 ut0Var, int i) {
        ut0Var.getClass();
        this.e = ut0Var;
        this.f = i;
        this.g = ut0Var.l;
    }

    public final void a() {
        if (this.e.l != this.g) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return xi0.o(entry.getKey(), getKey()) && xi0.o(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.e.e[this.f];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.e.f;
        objArr.getClass();
        return objArr[this.f];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        ut0 ut0Var = this.e;
        ut0Var.b();
        Object[] objArr = ut0Var.f;
        if (objArr == null) {
            int length = ut0Var.e.length;
            if (length < 0) {
                yc.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            ut0Var.f = objArr;
        }
        int i = this.f;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
