package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z52 implements gl0 {
    public final ky1 a;
    public final int b;
    public final v12 c;
    public final ha0 d;

    public z52(ky1 ky1Var, int i, v12 v12Var, ha0 ha0Var) {
        this.a = ky1Var;
        this.b = i;
        this.c = v12Var;
        this.d = ha0Var;
    }

    @Override // defpackage.gl0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        z61 z61VarE = pu0Var.e(kr.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(z61VarE.f, kr.g(j));
        return xu0Var.f0(z61VarE.e, iMin, g40.e, new cc1(this, z61VarE, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z52) {
            z52 z52Var = (z52) obj;
            if (this.a == z52Var.a && this.b == z52Var.b && this.c.equals(z52Var.c) && xi0.o(this.d, z52Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + s91.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
