package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b22 implements a22 {
    public final Object a;
    public final Object b;

    public b22(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.a22
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.a22
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a22)) {
            return false;
        }
        a22 a22Var = (a22) obj;
        return xi0.o(this.a, a22Var.b()) && xi0.o(this.b, a22Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
