package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d02 {
    public static final d02 d = new d02(0, 0, null, 0, 0, 0, 16777215);
    public final zq1 a;
    public final p41 b;
    public final a81 c;

    public d02(long j, long j2, aa0 aa0Var, long j3, int i, long j4, int i2) {
        this(new zq1((i2 & 1) != 0 ? vl.g : j, (i2 & 2) != 0 ? g02.c : j2, (i2 & 4) != 0 ? null : aa0Var, (y90) null, (z90) null, (lv1) null, (String) null, (i2 & 128) != 0 ? g02.c : j3, (df) null, (dz1) null, (as0) null, vl.g, (ax1) null, (um1) null, (v71) null, (q10) null), new p41((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? g02.c : j4, null, null, null, 0, 0, null), null);
    }

    public static d02 a(d02 d02Var, long j, long j2, aa0 aa0Var, lv1 lv1Var, long j3, long j4, mp0 mp0Var, int i) {
        df dfVar;
        dz1 dz1Var;
        long j5;
        a81 a81Var = xi0.o;
        long jB = (i & 1) != 0 ? d02Var.a.a.b() : j;
        long j6 = (i & 2) != 0 ? d02Var.a.b : j2;
        aa0 aa0Var2 = (i & 4) != 0 ? d02Var.a.c : aa0Var;
        zq1 zq1Var = d02Var.a;
        y90 y90Var = zq1Var.d;
        z90 z90Var = zq1Var.e;
        lv1 lv1Var2 = (i & 32) != 0 ? zq1Var.f : lv1Var;
        String str = zq1Var.g;
        long j7 = (i & 128) != 0 ? zq1Var.h : j3;
        df dfVar2 = zq1Var.i;
        dz1 dz1Var2 = zq1Var.j;
        as0 as0Var = zq1Var.k;
        long j8 = zq1Var.l;
        ax1 ax1Var = zq1Var.m;
        um1 um1Var = zq1Var.n;
        q10 q10Var = zq1Var.p;
        p41 p41Var = d02Var.b;
        int i2 = p41Var.a;
        int i3 = (i & 65536) != 0 ? p41Var.b : 1;
        if ((i & 131072) != 0) {
            dfVar = dfVar2;
            dz1Var = dz1Var2;
            j5 = p41Var.c;
        } else {
            dfVar = dfVar2;
            dz1Var = dz1Var2;
            j5 = j4;
        }
        fz1 fz1Var = p41Var.d;
        a81 a81Var2 = (i & 524288) != 0 ? d02Var.c : a81Var;
        return new d02(new zq1(vl.c(jB, zq1Var.a.b()) ? zq1Var.a : jB != 16 ? new xm(jB) : bz1.a, j6, aa0Var2, y90Var, z90Var, lv1Var2, str, j7, dfVar, dz1Var, as0Var, j8, ax1Var, um1Var, a81Var2 != null ? a81Var2.a : null, q10Var), new p41(i2, i3, j5, fz1Var, a81Var2 != null ? a81Var2.b : null, (i & 1048576) != 0 ? p41Var.f : mp0Var, p41Var.g, p41Var.h, p41Var.i), a81Var2);
    }

    public static d02 e(d02 d02Var, long j, long j2, aa0 aa0Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? g02.c : j2;
        aa0 aa0Var2 = (i2 & 4) != 0 ? null : aa0Var;
        long j6 = (i2 & 128) != 0 ? g02.c : j3;
        long j7 = vl.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? g02.c : j4;
        zq1 zq1VarA = ar1.a(d02Var.a, j, null, Float.NaN, j5, aa0Var2, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        p41 p41VarA = q41.a(d02Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (d02Var.a == zq1VarA && d02Var.b == p41VarA) ? d02Var : new d02(zq1VarA, p41VarA);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(d02 d02Var) {
        if (this != d02Var) {
            return xi0.o(this.b, d02Var.b) && this.a.a(d02Var.a);
        }
        return true;
    }

    public final d02 d(d02 d02Var) {
        return (d02Var == null || d02Var.equals(d)) ? this : new d02(this.a.c(d02Var.a), this.b.a(d02Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d02)) {
            return false;
        }
        d02 d02Var = (d02) obj;
        return xi0.o(this.a, d02Var.a) && xi0.o(this.b, d02Var.b) && xi0.o(this.c, d02Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a81 a81Var = this.c;
        return iHashCode + (a81Var != null ? a81Var.hashCode() : 0);
    }

    public final String toString() {
        String strI = vl.i(b());
        zq1 zq1Var = this.a;
        lh lhVarC = zq1Var.a.c();
        float fA = zq1Var.a.a();
        String strD = g02.d(zq1Var.b);
        aa0 aa0Var = zq1Var.c;
        y90 y90Var = zq1Var.d;
        z90 z90Var = zq1Var.e;
        lv1 lv1Var = zq1Var.f;
        String str = zq1Var.g;
        String strD2 = g02.d(zq1Var.h);
        df dfVar = zq1Var.i;
        dz1 dz1Var = zq1Var.j;
        as0 as0Var = zq1Var.k;
        String strI2 = vl.i(zq1Var.l);
        ax1 ax1Var = zq1Var.m;
        um1 um1Var = zq1Var.n;
        q10 q10Var = zq1Var.p;
        p41 p41Var = this.b;
        String strA = dw1.a(p41Var.a);
        String strA2 = dx1.a(p41Var.b);
        String strD3 = g02.d(p41Var.c);
        fz1 fz1Var = p41Var.d;
        mp0 mp0Var = p41Var.f;
        String strA3 = hp0.a(p41Var.g);
        String strA4 = le0.a(p41Var.h);
        uz1 uz1Var = p41Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strI);
        sb.append(", brush=");
        sb.append(lhVarC);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(aa0Var);
        sb.append(", fontStyle=");
        sb.append(y90Var);
        sb.append(", fontSynthesis=");
        sb.append(z90Var);
        sb.append(", fontFamily=");
        sb.append(lv1Var);
        sb.append(", fontFeatureSettings=");
        s91.u(sb, str, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(dfVar);
        sb.append(", textGeometricTransform=");
        sb.append(dz1Var);
        sb.append(", localeList=");
        sb.append(as0Var);
        sb.append(", background=");
        sb.append(strI2);
        sb.append(", textDecoration=");
        sb.append(ax1Var);
        sb.append(", shadow=");
        sb.append(um1Var);
        sb.append(", drawStyle=");
        sb.append(q10Var);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        s91.u(sb, strA2, ", lineHeight=", strD3, ", textIndent=");
        sb.append(fz1Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(mp0Var);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(uz1Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d02(zq1 zq1Var, p41 p41Var) {
        v71 v71Var = zq1Var.o;
        m71 m71Var = p41Var.e;
        this(zq1Var, p41Var, (v71Var == null && m71Var == null) ? null : new a81(v71Var, m71Var));
    }

    public d02(zq1 zq1Var, p41 p41Var, a81 a81Var) {
        this.a = zq1Var;
        this.b = p41Var;
        this.c = a81Var;
    }
}
