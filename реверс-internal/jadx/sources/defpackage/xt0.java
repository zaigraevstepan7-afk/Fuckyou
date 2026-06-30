package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class xt0 implements Map.Entry, yj0 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public /* synthetic */ xt0(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.e) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && xi0.o(entry.getKey(), this.f) && xi0.o(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.e) {
        }
        return this.f;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.e) {
        }
        return this.g;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.e) {
            case 0:
                Object obj = this.f;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return this.f + "=" + getValue();
            default:
                return super.toString();
        }
    }
}
