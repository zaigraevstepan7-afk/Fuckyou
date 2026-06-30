package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qm1 implements w20 {
    public final hb a;
    public final int b;

    public qm1(String str, int i) {
        this.a = new hb(str);
        this.b = i;
    }

    @Override // defpackage.w20
    public final void a(x20 x20Var) {
        int i = x20Var.d;
        hb hbVar = this.a;
        if (i != -1) {
            int i2 = x20Var.e;
            String str = hbVar.f;
            String str2 = hbVar.f;
            x20Var.d(i, i2, str);
            if (str2.length() > 0) {
                x20Var.e(i, str2.length() + i);
            }
        } else {
            int i3 = x20Var.b;
            int i4 = x20Var.c;
            String str3 = hbVar.f;
            String str4 = hbVar.f;
            x20Var.d(i3, i4, str3);
            if (str4.length() > 0) {
                x20Var.e(i3, str4.length() + i3);
            }
        }
        int i5 = x20Var.b;
        int i6 = x20Var.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iA = lk.A(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - hbVar.f.length(), 0, x20Var.a.c());
        x20Var.f(iA, iA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm1)) {
            return false;
        }
        qm1 qm1Var = (qm1) obj;
        return xi0.o(this.a.f, qm1Var.a.f) && this.b == qm1Var.b;
    }

    public final int hashCode() {
        return (this.a.f.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.f + "', newCursorPosition=" + this.b + ")";
    }
}
