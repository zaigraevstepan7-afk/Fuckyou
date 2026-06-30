package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class od extends xv0 {
    @Override // defpackage.xv0
    public final sv0 d() {
        qd qdVar = new qd();
        qdVar.s = 1.0f;
        qdVar.t = true;
        return qdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof od ? (od) obj : null) == null) {
            return false;
        }
        ((od) obj).getClass();
        return true;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        qd qdVar = (qd) sv0Var;
        qdVar.s = 1.0f;
        qdVar.t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(1.0f) * 31);
    }
}
