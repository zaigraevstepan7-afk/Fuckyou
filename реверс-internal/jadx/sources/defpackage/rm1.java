package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rm1 implements w20 {
    public final int a;
    public final int b;

    public rm1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.w20
    public final void a(x20 x20Var) {
        int iA = lk.A(this.a, 0, x20Var.a.c());
        int iA2 = lk.A(this.b, 0, x20Var.a.c());
        if (iA < iA2) {
            x20Var.f(iA, iA2);
        } else {
            x20Var.f(iA2, iA);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm1)) {
            return false;
        }
        rm1 rm1Var = (rm1) obj;
        return this.a == rm1Var.a && this.b == rm1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return s91.k("SetSelectionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
