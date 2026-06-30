package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 implements w20 {
    public final int a;
    public final int b;

    public pm1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.w20
    public final void a(x20 x20Var) {
        boolean z = x20Var.d != -1;
        zb zbVar = x20Var.a;
        if (z) {
            x20Var.d = -1;
            x20Var.e = -1;
        }
        int iA = lk.A(this.a, 0, zbVar.c());
        int iA2 = lk.A(this.b, 0, zbVar.c());
        if (iA != iA2) {
            if (iA < iA2) {
                x20Var.e(iA, iA2);
            } else {
                x20Var.e(iA2, iA);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm1)) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        return this.a == pm1Var.a && this.b == pm1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return s91.k("SetComposingRegionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
