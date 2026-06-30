package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 {
    public final ym1 a;
    public final ym1 b;
    public final ym1 c;
    public final ym1 d;
    public final ym1 e;
    public final ym1 f;

    public tq0(ym1 ym1Var, ym1 ym1Var2, ym1 ym1Var3, ym1 ym1Var4, ym1 ym1Var5, ym1 ym1Var6) {
        this.a = ym1Var;
        this.b = ym1Var2;
        this.c = ym1Var3;
        this.d = ym1Var4;
        this.e = ym1Var5;
        this.f = ym1Var6;
    }

    public final tq0 a(ym1 ym1Var, ym1 ym1Var2, ym1 ym1Var3, ym1 ym1Var4, ym1 ym1Var5, ym1 ym1Var6) {
        if (ym1Var == null) {
            ym1Var = this.a;
        }
        if (ym1Var2 == null) {
            ym1Var2 = this.b;
        }
        if (ym1Var3 == null) {
            ym1Var3 = this.c;
        }
        if (ym1Var4 == null) {
            ym1Var4 = this.d;
        }
        if (ym1Var5 == null) {
            ym1Var5 = this.e;
        }
        if (ym1Var6 == null) {
            ym1Var6 = this.f;
        }
        return new tq0(ym1Var, ym1Var2, ym1Var3, ym1Var4, ym1Var5, ym1Var6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tq0)) {
            return false;
        }
        tq0 tq0Var = (tq0) obj;
        return xi0.o(this.a, tq0Var.a) && xi0.o(this.b, tq0Var.b) && xi0.o(this.c, tq0Var.c) && xi0.o(this.d, tq0Var.d) && xi0.o(this.e, tq0Var.e) && xi0.o(this.f, tq0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
