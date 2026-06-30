package defpackage;

import defpackage.sx;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
abstract class ze<N extends sx> extends xv0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        rx rxVar = (rx) this;
        rx rxVar2 = (rx) ((ze) obj);
        return vl.c(rxVar.c, rxVar2.c) && vl.c(rxVar.d, rxVar2.d) && xi0.o(rxVar.e, rxVar2.e) && xi0.o(rxVar.f, rxVar2.f) && tz.b(rxVar.g, rxVar2.g) && tz.b(rxVar.i, rxVar2.i) && tz.b(rxVar.j, rxVar2.j);
    }

    public int hashCode() {
        rx rxVar = (rx) this;
        int i = vl.h;
        return Float.hashCode(rxVar.j) + s91.a(rxVar.i, s91.a(rxVar.g, (rxVar.f.hashCode() + ((rxVar.e.hashCode() + s91.c(Long.hashCode(rxVar.c) * 31, 31, rxVar.d)) * 31)) * 31, 31), 31);
    }
}
