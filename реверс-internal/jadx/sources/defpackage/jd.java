package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jd implements Iterator, Map.Entry {
    public int e;
    public int f = -1;
    public boolean g;
    public final /* synthetic */ ld h;

    public jd(ld ldVar) {
        this.h = ldVar;
        this.e = ldVar.g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.g) {
            yc.l("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f;
            ld ldVar = this.h;
            if (xi0.o(key, ldVar.e(i)) && xi0.o(entry.getValue(), ldVar.h(this.f))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.g) {
            return this.h.e(this.f);
        }
        yc.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.g) {
            return this.h.h(this.f);
        }
        yc.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.g) {
            yc.l("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f;
        ld ldVar = this.h;
        Object objE = ldVar.e(i);
        Object objH = ldVar.h(this.f);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yc.m();
            return null;
        }
        this.f++;
        this.g = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        this.h.f(this.f);
        this.f--;
        this.e--;
        this.g = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.g) {
            return this.h.g(this.f, obj);
        }
        yc.l("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
