package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d52 extends b52 {
    public final String e;
    public final List f;
    public final int g;
    public final lh h;
    public final float i;
    public final lh j;
    public final float k;
    public final float l;
    public final int m;
    public final int n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;

    public d52(String str, List list, int i, lh lhVar, float f, lh lhVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.e = str;
        this.f = list;
        this.g = i;
        this.h = lhVar;
        this.i = f;
        this.j = lhVar2;
        this.k = f2;
        this.l = f3;
        this.m = i2;
        this.n = i3;
        this.o = f4;
        this.p = f5;
        this.q = f6;
        this.r = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d52.class != obj.getClass()) {
            return false;
        }
        d52 d52Var = (d52) obj;
        return this.e.equals(d52Var.e) && xi0.o(this.h, d52Var.h) && this.i == d52Var.i && xi0.o(this.j, d52Var.j) && this.k == d52Var.k && this.l == d52Var.l && this.m == d52Var.m && this.n == d52Var.n && this.o == d52Var.o && this.p == d52Var.p && this.q == d52Var.q && this.r == d52Var.r && this.g == d52Var.g && xi0.o(this.f, d52Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + (this.e.hashCode() * 31)) * 31;
        lh lhVar = this.h;
        int iA = s91.a(this.i, (iHashCode + (lhVar != null ? lhVar.hashCode() : 0)) * 31, 31);
        lh lhVar2 = this.j;
        return Integer.hashCode(this.g) + s91.a(this.r, s91.a(this.q, s91.a(this.p, s91.a(this.o, s91.b(this.n, s91.b(this.m, s91.a(this.l, s91.a(this.k, (iA + (lhVar2 != null ? lhVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
