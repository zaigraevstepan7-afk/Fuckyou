package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 implements Map.Entry, Comparable {
    public final Comparable e;
    public Object f;
    public final /* synthetic */ op1 g;

    public pp1(op1 op1Var, Comparable comparable, Object obj) {
        this.g = op1Var;
        this.e = comparable;
        this.f = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.e.compareTo(((pp1) obj).e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.e;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.e;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.g.b();
        Object obj2 = this.f;
        this.f = obj;
        return obj2;
    }

    public final String toString() {
        return this.e + "=" + this.f;
    }
}
