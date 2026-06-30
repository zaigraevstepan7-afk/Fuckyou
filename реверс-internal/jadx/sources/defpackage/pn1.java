package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pn1 {
    public final kg1 a;
    public final kg1 b;
    public final kg1 c;
    public final kg1 d;
    public final kg1 e;
    public final kg1 f;
    public final kg1 g;
    public final kg1 h;
    public gi i;
    public re0 j;
    public tq0 k;

    public pn1() {
        kg1 kg1Var = cn1.a;
        kg1 kg1Var2 = cn1.b;
        kg1 kg1Var3 = cn1.c;
        kg1 kg1Var4 = cn1.d;
        kg1 kg1Var5 = cn1.f;
        kg1 kg1Var6 = cn1.e;
        kg1 kg1Var7 = cn1.g;
        kg1 kg1Var8 = cn1.h;
        this.a = kg1Var;
        this.b = kg1Var2;
        this.c = kg1Var3;
        this.d = kg1Var4;
        this.e = kg1Var5;
        this.f = kg1Var6;
        this.g = kg1Var7;
        this.h = kg1Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn1)) {
            return false;
        }
        pn1 pn1Var = (pn1) obj;
        return xi0.o(this.a, pn1Var.a) && xi0.o(this.b, pn1Var.b) && xi0.o(this.c, pn1Var.c) && xi0.o(this.d, pn1Var.d) && xi0.o(this.e, pn1Var.e) && xi0.o(this.f, pn1Var.f) && xi0.o(this.g, pn1Var.g) && xi0.o(this.h, pn1Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ")";
    }
}
