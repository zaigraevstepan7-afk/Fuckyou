package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d10 extends xv0 {
    public static final mt i = new mt(2);
    public final hp1 a;
    public final k31 b;
    public final boolean c;
    public final jx0 d;
    public final boolean e;
    public final xa0 f;
    public final xa0 g;
    public final boolean h;

    public d10(hp1 hp1Var, k31 k31Var, boolean z, jx0 jx0Var, boolean z2, xa0 xa0Var, xa0 xa0Var2, boolean z3) {
        this.a = hp1Var;
        this.b = k31Var;
        this.c = z;
        this.d = jx0Var;
        this.e = z2;
        this.f = xa0Var;
        this.g = xa0Var2;
        this.h = z3;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        i10 i10Var = new i10(i, this.c, this.d, this.b);
        i10Var.N = this.a;
        i10Var.O = this.e;
        i10Var.P = this.f;
        i10Var.Q = this.g;
        i10Var.R = this.h;
        return i10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d10.class == obj.getClass()) {
            d10 d10Var = (d10) obj;
            if (this.a == d10Var.a && this.b == d10Var.b && this.c == d10Var.c && xi0.o(this.d, d10Var.d) && this.e == d10Var.e && xi0.o(this.f, d10Var.f) && xi0.o(this.g, d10Var.g) && this.h == d10Var.h) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        boolean z;
        boolean z2;
        i10 i10Var = (i10) sv0Var;
        hp1 hp1Var = i10Var.N;
        hp1 hp1Var2 = this.a;
        if (xi0.o(hp1Var, hp1Var2)) {
            z = false;
        } else {
            i10Var.N = hp1Var2;
            z = true;
        }
        boolean z3 = i10Var.R;
        boolean z4 = this.h;
        if (z3 != z4) {
            i10Var.R = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        i10Var.P = this.f;
        i10Var.Q = this.g;
        i10Var.O = this.e;
        i10Var.f1(i, this.c, this.d, this.b, z2);
    }

    public final int hashCode() {
        int iD = s91.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        jx0 jx0Var = this.d;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + s91.d((iD + (jx0Var != null ? jx0Var.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }
}
