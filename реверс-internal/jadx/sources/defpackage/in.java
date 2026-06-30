package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class in implements w20 {
    public final hb a;
    public final int b;

    public in(String str, int i) {
        this(new hb(str), i);
    }

    @Override // defpackage.w20
    public final void a(x20 x20Var) {
        int i = x20Var.d;
        hb hbVar = this.a;
        if (i != -1) {
            x20Var.d(i, x20Var.e, hbVar.f);
        } else {
            x20Var.d(x20Var.b, x20Var.c, hbVar.f);
        }
        int i2 = x20Var.b;
        int i3 = x20Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iA = lk.A(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - hbVar.f.length(), 0, x20Var.a.c());
        x20Var.f(iA, iA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in)) {
            return false;
        }
        in inVar = (in) obj;
        return xi0.o(this.a.f, inVar.a.f) && this.b == inVar.b;
    }

    public final int hashCode() {
        return (this.a.f.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.f + "', newCursorPosition=" + this.b + ")";
    }

    public in(hb hbVar, int i) {
        this.a = hbVar;
        this.b = i;
    }
}
