package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wy extends sv0 implements o10 {
    public qm0 s;

    @Override // defpackage.sv0
    public final void D0() {
        this.s.getClass();
    }

    @Override // defpackage.sv0
    public final void E0() {
        qm0 qm0Var = this.s;
        qm0Var.c();
        qm0Var.b = null;
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        ArrayList arrayList = (ArrayList) this.s.h;
        if (arrayList.size() <= 0) {
            sl0Var.a();
        } else {
            s91.t(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy) && xi0.o(this.s, ((wy) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.s + ")";
    }
}
