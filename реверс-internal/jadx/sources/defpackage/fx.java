package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fx implements w20 {
    public final int a;
    public final int b;

    public fx(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        og0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.w20
    public final void a(x20 x20Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = x20Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(x20Var.b((i5 - i4) + (-1))) && Character.isLowSurrogate(x20Var.b(x20Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iC = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iC + 1;
            int i7 = x20Var.c;
            zb zbVar = x20Var.a;
            if (i7 + i6 >= zbVar.c()) {
                iC = zbVar.c() - x20Var.c;
                break;
            } else {
                iC = (Character.isHighSurrogate(x20Var.b((x20Var.c + i6) + (-1))) && Character.isLowSurrogate(x20Var.b(x20Var.c + i6))) ? iC + 2 : i6;
                i++;
            }
        }
        int i8 = x20Var.c;
        x20Var.a(i8, iC + i8);
        int i9 = x20Var.b;
        x20Var.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        return this.a == fxVar.a && this.b == fxVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return s91.k("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}
