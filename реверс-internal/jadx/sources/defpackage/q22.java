package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q22 implements a20 {
    public final int a;
    public final int b;
    public final j20 c;

    public q22(int i, int i2, j20 j20Var) {
        this.a = i;
        this.b = i2;
        this.c = j20Var;
    }

    @Override // defpackage.wa
    public final e52 a(r22 r22Var) {
        return new x01(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q22) {
            q22 q22Var = (q22) obj;
            if (q22Var.a == this.a && q22Var.b == this.b && xi0.o(q22Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.a20, defpackage.wa
    public final g52 a(r22 r22Var) {
        return new x01(this.a, this.b, this.c);
    }
}
