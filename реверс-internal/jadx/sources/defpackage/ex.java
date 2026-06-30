package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ex implements w20 {
    public final int a;
    public final int b;

    public ex(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        og0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.w20
    public final void a(x20 x20Var) {
        int i = x20Var.c;
        zb zbVar = x20Var.a;
        int i2 = this.b;
        int iC = i + i2;
        if (((i ^ iC) & (i2 ^ iC)) < 0) {
            iC = zbVar.c();
        }
        x20Var.a(x20Var.c, Math.min(iC, zbVar.c()));
        int i3 = x20Var.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        x20Var.a(Math.max(0, i5), x20Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        return this.a == exVar.a && this.b == exVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return s91.k("DeleteSurroundingTextCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}
