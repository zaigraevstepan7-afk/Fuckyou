package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yd0 implements gl0 {
    public final ky1 a;
    public final int b;
    public final v12 c;
    public final ha0 d;

    public yd0(ky1 ky1Var, int i, v12 v12Var, ha0 ha0Var) {
        this.a = ky1Var;
        this.b = i;
        this.c = v12Var;
        this.d = ha0Var;
    }

    @Override // defpackage.gl0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        long j2;
        if (pu0Var.U(kr.g(j)) < kr.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = kr.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        z61 z61VarE = pu0Var.e(j);
        int iMin = Math.min(z61VarE.e, kr.h(j2));
        return xu0Var.f0(iMin, z61VarE.f, g40.e, new ox(this, xu0Var, z61VarE, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yd0) {
            yd0 yd0Var = (yd0) obj;
            if (this.a == yd0Var.a && this.b == yd0Var.b && this.c.equals(yd0Var.c) && xi0.o(this.d, yd0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + s91.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
