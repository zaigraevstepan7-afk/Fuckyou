package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jg extends xv0 {
    public final float a;
    public final uq1 b;
    public final ym1 c;

    public jg(float f, uq1 uq1Var, ym1 ym1Var) {
        this.a = f;
        this.b = uq1Var;
        this.c = ym1Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new ig(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg)) {
            return false;
        }
        jg jgVar = (jg) obj;
        return tz.b(this.a, jgVar.a) && this.b.equals(jgVar.b) && xi0.o(this.c, jgVar.c);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ig igVar = (ig) sv0Var;
        float f = igVar.v;
        ki kiVar = igVar.y;
        float f2 = this.a;
        if (!tz.b(f, f2)) {
            igVar.v = f2;
            kiVar.L0();
        }
        uq1 uq1Var = igVar.w;
        uq1 uq1Var2 = this.b;
        if (!xi0.o(uq1Var, uq1Var2)) {
            igVar.w = uq1Var2;
            kiVar.L0();
        }
        ym1 ym1Var = igVar.x;
        ym1 ym1Var2 = this.c;
        if (xi0.o(ym1Var, ym1Var2)) {
            return;
        }
        igVar.x = ym1Var2;
        kiVar.L0();
        kd1.t(igVar);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + tz.c(this.a) + ", brush=" + this.b + ", shape=" + this.c + ")";
    }
}
