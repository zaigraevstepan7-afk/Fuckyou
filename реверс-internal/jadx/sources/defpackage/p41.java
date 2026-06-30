package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p41 implements db {
    public final int a;
    public final int b;
    public final long c;
    public final fz1 d;
    public final m71 e;
    public final mp0 f;
    public final int g;
    public final int h;
    public final uz1 i;

    public p41(int i, int i2, long j, fz1 fz1Var, m71 m71Var, mp0 mp0Var, int i3, int i4, uz1 uz1Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = fz1Var;
        this.e = m71Var;
        this.f = mp0Var;
        this.g = i3;
        this.h = i4;
        this.i = uz1Var;
        if (g02.a(j, g02.c) || g02.c(j) >= 0.0f) {
            return;
        }
        og0.b("lineHeight can't be negative (" + g02.c(j) + ")");
    }

    public final p41 a(p41 p41Var) {
        return p41Var == null ? this : q41.a(this, p41Var.a, p41Var.b, p41Var.c, p41Var.d, p41Var.e, p41Var.f, p41Var.g, p41Var.h, p41Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p41)) {
            return false;
        }
        p41 p41Var = (p41) obj;
        return this.a == p41Var.a && this.b == p41Var.b && g02.a(this.c, p41Var.c) && xi0.o(this.d, p41Var.d) && xi0.o(this.e, p41Var.e) && xi0.o(this.f, p41Var.f) && this.g == p41Var.g && this.h == p41Var.h && xi0.o(this.i, p41Var.i);
    }

    public final int hashCode() {
        int iB = s91.b(this.b, Integer.hashCode(this.a) * 31, 31);
        h02[] h02VarArr = g02.b;
        int iC = s91.c(iB, 31, this.c);
        fz1 fz1Var = this.d;
        int iHashCode = (iC + (fz1Var != null ? fz1Var.hashCode() : 0)) * 31;
        m71 m71Var = this.e;
        int iHashCode2 = (iHashCode + (m71Var != null ? m71Var.hashCode() : 0)) * 31;
        mp0 mp0Var = this.f;
        int iB2 = s91.b(this.h, s91.b(this.g, (iHashCode2 + (mp0Var != null ? mp0Var.hashCode() : 0)) * 31, 31), 31);
        uz1 uz1Var = this.i;
        return iB2 + (uz1Var != null ? uz1Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = dw1.a(this.a);
        String strA2 = dx1.a(this.b);
        String strD = g02.d(this.c);
        String strA3 = hp0.a(this.g);
        String strA4 = le0.a(this.h);
        StringBuilder sbO = s91.o("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbO.append(strD);
        sbO.append(", textIndent=");
        sbO.append(this.d);
        sbO.append(", platformStyle=");
        sbO.append(this.e);
        sbO.append(", lineHeightStyle=");
        sbO.append(this.f);
        sbO.append(", lineBreak=");
        s91.u(sbO, strA3, ", hyphens=", strA4, ", textMotion=");
        sbO.append(this.i);
        sbO.append(")");
        return sbO.toString();
    }
}
