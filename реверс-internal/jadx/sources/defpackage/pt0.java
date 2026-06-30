package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pt0 implements ev0 {
    public ev0[] a;

    @Override // defpackage.ev0
    public final xb1 a(Class cls) {
        for (ev0 ev0Var : this.a) {
            if (ev0Var.b(cls)) {
                return ev0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.ev0
    public final boolean b(Class cls) {
        for (ev0 ev0Var : this.a) {
            if (ev0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
