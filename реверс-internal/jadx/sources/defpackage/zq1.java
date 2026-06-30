package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zq1 implements db {
    public final cz1 a;
    public final long b;
    public final aa0 c;
    public final y90 d;
    public final z90 e;
    public final lv1 f;
    public final String g;
    public final long h;
    public final df i;
    public final dz1 j;
    public final as0 k;
    public final long l;
    public final ax1 m;
    public final um1 n;
    public final v71 o;
    public final q10 p;

    public zq1(long j, long j2, aa0 aa0Var, y90 y90Var, z90 z90Var, lv1 lv1Var, String str, long j3, df dfVar, dz1 dz1Var, as0 as0Var, long j4, ax1 ax1Var, um1 um1Var, int i) {
        this((i & 1) != 0 ? vl.g : j, (i & 2) != 0 ? g02.c : j2, (i & 4) != 0 ? null : aa0Var, (i & 8) != 0 ? null : y90Var, (i & 16) != 0 ? null : z90Var, (i & 32) != 0 ? null : lv1Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? g02.c : j3, (i & 256) != 0 ? null : dfVar, (i & 512) != 0 ? null : dz1Var, (i & 1024) != 0 ? null : as0Var, (i & 2048) != 0 ? vl.g : j4, (i & 4096) != 0 ? null : ax1Var, (i & 8192) != 0 ? null : um1Var, (v71) null, (q10) null);
    }

    public final boolean a(zq1 zq1Var) {
        if (this == zq1Var) {
            return true;
        }
        return g02.a(this.b, zq1Var.b) && xi0.o(this.c, zq1Var.c) && xi0.o(this.d, zq1Var.d) && xi0.o(this.e, zq1Var.e) && xi0.o(this.f, zq1Var.f) && xi0.o(this.g, zq1Var.g) && g02.a(this.h, zq1Var.h) && xi0.o(this.i, zq1Var.i) && xi0.o(this.j, zq1Var.j) && xi0.o(this.k, zq1Var.k) && vl.c(this.l, zq1Var.l) && xi0.o(this.o, zq1Var.o);
    }

    public final boolean b(zq1 zq1Var) {
        return xi0.o(this.a, zq1Var.a) && xi0.o(this.m, zq1Var.m) && xi0.o(this.n, zq1Var.n) && xi0.o(this.p, zq1Var.p);
    }

    public final zq1 c(zq1 zq1Var) {
        if (zq1Var == null) {
            return this;
        }
        cz1 cz1Var = zq1Var.a;
        return ar1.a(this, cz1Var.b(), cz1Var.c(), cz1Var.a(), zq1Var.b, zq1Var.c, zq1Var.d, zq1Var.e, zq1Var.f, zq1Var.g, zq1Var.h, zq1Var.i, zq1Var.j, zq1Var.k, zq1Var.l, zq1Var.m, zq1Var.n, zq1Var.o, zq1Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq1)) {
            return false;
        }
        zq1 zq1Var = (zq1) obj;
        return a(zq1Var) && b(zq1Var);
    }

    public final int hashCode() {
        cz1 cz1Var = this.a;
        long jB = cz1Var.b();
        int i = vl.h;
        int iHashCode = Long.hashCode(jB) * 31;
        lh lhVarC = cz1Var.c();
        int iHashCode2 = (Float.hashCode(cz1Var.a()) + ((iHashCode + (lhVarC != null ? lhVarC.hashCode() : 0)) * 31)) * 31;
        h02[] h02VarArr = g02.b;
        int iC = s91.c(iHashCode2, 31, this.b);
        aa0 aa0Var = this.c;
        int i2 = (iC + (aa0Var != null ? aa0Var.e : 0)) * 31;
        y90 y90Var = this.d;
        int iHashCode3 = (i2 + (y90Var != null ? Integer.hashCode(y90Var.a) : 0)) * 31;
        z90 z90Var = this.e;
        int iHashCode4 = (iHashCode3 + (z90Var != null ? Integer.hashCode(z90Var.a) : 0)) * 31;
        lv1 lv1Var = this.f;
        int iHashCode5 = (iHashCode4 + (lv1Var != null ? lv1Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iC2 = s91.c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        df dfVar = this.i;
        int iHashCode6 = (iC2 + (dfVar != null ? Float.hashCode(dfVar.a) : 0)) * 31;
        dz1 dz1Var = this.j;
        int iHashCode7 = (iHashCode6 + (dz1Var != null ? dz1Var.hashCode() : 0)) * 31;
        as0 as0Var = this.k;
        int iC3 = s91.c((iHashCode7 + (as0Var != null ? as0Var.e.hashCode() : 0)) * 31, 31, this.l);
        ax1 ax1Var = this.m;
        int i3 = (iC3 + (ax1Var != null ? ax1Var.a : 0)) * 31;
        um1 um1Var = this.n;
        int iHashCode8 = (i3 + (um1Var != null ? um1Var.hashCode() : 0)) * 31;
        v71 v71Var = this.o;
        int iHashCode9 = (iHashCode8 + (v71Var != null ? v71Var.hashCode() : 0)) * 31;
        q10 q10Var = this.p;
        return iHashCode9 + (q10Var != null ? q10Var.hashCode() : 0);
    }

    public final String toString() {
        cz1 cz1Var = this.a;
        String strI = vl.i(cz1Var.b());
        lh lhVarC = cz1Var.c();
        float fA = cz1Var.a();
        String strD = g02.d(this.b);
        String strD2 = g02.d(this.h);
        String strI2 = vl.i(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strI);
        sb.append(", brush=");
        sb.append(lhVarC);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        s91.u(sb, this.g, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strI2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public zq1(cz1 cz1Var, long j, aa0 aa0Var, y90 y90Var, z90 z90Var, lv1 lv1Var, String str, long j2, df dfVar, dz1 dz1Var, as0 as0Var, long j3, ax1 ax1Var, um1 um1Var, v71 v71Var, q10 q10Var) {
        this.a = cz1Var;
        this.b = j;
        this.c = aa0Var;
        this.d = y90Var;
        this.e = z90Var;
        this.f = lv1Var;
        this.g = str;
        this.h = j2;
        this.i = dfVar;
        this.j = dz1Var;
        this.k = as0Var;
        this.l = j3;
        this.m = ax1Var;
        this.n = um1Var;
        this.o = v71Var;
        this.p = q10Var;
    }

    public zq1(long j, long j2, aa0 aa0Var, y90 y90Var, z90 z90Var, lv1 lv1Var, String str, long j3, df dfVar, dz1 dz1Var, as0 as0Var, long j4, ax1 ax1Var, um1 um1Var, v71 v71Var, q10 q10Var) {
        this(j != 16 ? new xm(j) : bz1.a, j2, aa0Var, y90Var, z90Var, lv1Var, str, j3, dfVar, dz1Var, as0Var, j4, ax1Var, um1Var, v71Var, q10Var);
    }
}
