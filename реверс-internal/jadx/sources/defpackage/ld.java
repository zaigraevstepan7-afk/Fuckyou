package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ld extends zn1 implements Map {
    public gd h;
    public id i;
    public kd j;

    @Override // java.util.Map
    public final Set entrySet() {
        gd gdVar = this.h;
        if (gdVar != null) {
            return gdVar;
        }
        gd gdVar2 = new gd(this, 0);
        this.h = gdVar2;
        return gdVar2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        id idVar = this.i;
        if (idVar != null) {
            return idVar;
        }
        id idVar2 = new id(this);
        this.i = idVar2;
        return idVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.g;
        int i = this.g;
        int[] iArr = this.e;
        if (iArr.length < size) {
            this.e = Arrays.copyOf(iArr, size);
            this.f = Arrays.copyOf(this.f, size * 2);
        }
        if (this.g != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        kd kdVar = this.j;
        if (kdVar != null) {
            return kdVar;
        }
        kd kdVar2 = new kd(this);
        this.j = kdVar2;
        return kdVar2;
    }
}
