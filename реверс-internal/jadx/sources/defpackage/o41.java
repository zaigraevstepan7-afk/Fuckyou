package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o41 {
    public String a;
    public d02 b;
    public c90 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public hx i;
    public r6 j;
    public boolean k;
    public lv0 m;
    public n41 n;
    public al0 o;
    public long s;
    public long h = rg0.a;
    public long l = 0;
    public long p = lr.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public o41(String str, d02 d02Var, c90 c90Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = d02Var;
        this.c = c90Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long f(o41 o41Var, long j, al0 al0Var) {
        int i;
        d02 d02Var = o41Var.b;
        lv0 lv0Var = o41Var.m;
        hx hxVar = o41Var.i;
        hxVar.getClass();
        c90 c90Var = o41Var.c;
        if ((lv0Var == null || al0Var != lv0Var.a || !qc1.x(d02Var, al0Var).equals(lv0Var.b) || hxVar.b() != lv0Var.c.e || c90Var != lv0Var.d) && ((lv0Var = lv0.h) == null || al0Var != lv0Var.a || !qc1.x(d02Var, al0Var).equals(lv0Var.b) || hxVar.b() != lv0Var.c.e || c90Var != lv0Var.d)) {
            lv0Var = new lv0(al0Var, qc1.x(d02Var, al0Var), new kx(hxVar.b(), hxVar.l()), c90Var);
            lv0.h = lv0Var;
        }
        o41Var.m = lv0Var;
        int i2 = o41Var.g;
        kx kxVar = lv0Var.c;
        float f = lv0Var.g;
        float f2 = lv0Var.f;
        int i3 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = mv0.a;
            d02 d02Var2 = lv0Var.e;
            c90 c90Var2 = lv0Var.d;
            f40 f40Var = f40.e;
            float fB = new r6(new v6(str, d02Var2, f40Var, f40Var, c90Var2, kxVar), 1, 1, lr.b(0, 0, 0, 0, 15)).b();
            i3 = 1;
            float fB2 = new r6(new v6(mv0.b, lv0Var.e, f40Var, f40Var, lv0Var.d, kxVar), 2, 1, lr.b(0, 0, 0, 0, 15)).b() - fB;
            lv0Var.g = fB;
            lv0Var.f = fB2;
            f2 = fB2;
            f = fB;
        }
        if (i2 != i3) {
            int iRound = Math.round((f2 * (i2 - i3)) + f);
            i = iRound >= 0 ? iRound : 0;
            int iG = kr.g(j);
            if (i > iG) {
                i = iG;
            }
        } else {
            i = kr.i(j);
        }
        return lr.a(kr.j(j), kr.h(j), i, kr.g(j));
    }

    public final int a(int i, al0 al0Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = lr.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, al0Var);
        }
        n41 n41VarE = e(al0Var);
        long jI = lk.I(jA, this.e, this.d, n41VarE.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iF = qc1.f(new r6((v6) n41VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jI).b());
        int i6 = kr.i(jA);
        if (iF < i6) {
            iF = i6;
        }
        this.q = i;
        this.r = iF;
        return iF;
    }

    public final boolean b(long j, al0 al0Var) {
        n41 n41Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, al0Var) : j;
        r6 r6Var = this.j;
        boolean z2 = false;
        if (r6Var != null && (n41Var = this.n) != null && !n41Var.b() && al0Var == this.o && (kr.b(jF, this.p) || (kr.h(jF) == kr.h(this.p) && kr.j(jF) == kr.j(this.p) && kr.g(jF) >= r6Var.b() && !r6Var.d.d))) {
            if (!kr.b(jF, this.p)) {
                r6 r6Var2 = this.j;
                r6Var2.getClass();
                this.l = lr.d(jF, (((long) qc1.f(Math.min(r6Var2.a.i.c(), r6Var2.d()))) << 32) | (((long) qc1.f(r6Var2.b())) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= r6Var2.d() && ((int) (4294967295L & r12)) >= r6Var2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        n41 n41VarE = e(al0Var);
        long jI = lk.I(jF, this.e, this.d, n41VarE.c());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        r6 r6Var3 = new r6((v6) n41VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jI);
        this.p = jF;
        this.l = lr.d(jF, (((long) qc1.f(r6Var3.b())) & 4294967295L) | (((long) qc1.f(r6Var3.d())) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < r6Var3.d() || ((int) (r1 & 4294967295L)) < r6Var3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = r6Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = lr.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(hx hxVar) {
        long jA;
        hx hxVar2 = this.i;
        if (hxVar != null) {
            int i = rg0.b;
            jA = rg0.a(hxVar.b(), hxVar.l());
        } else {
            jA = rg0.a;
        }
        if (hxVar2 == null) {
            this.i = hxVar;
            this.h = jA;
        } else if (hxVar == null || this.h != jA) {
            this.i = hxVar;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final n41 e(al0 al0Var) {
        n41 v6Var = this.n;
        if (v6Var == null || al0Var != this.o || v6Var.b()) {
            this.o = al0Var;
            String str = this.a;
            d02 d02VarX = qc1.x(this.b, al0Var);
            hx hxVar = this.i;
            hxVar.getClass();
            c90 c90Var = this.c;
            f40 f40Var = f40.e;
            v6Var = new v6(str, d02VarX, f40Var, f40Var, c90Var, hxVar);
        }
        this.n = v6Var;
        return v6Var;
    }

    public final String toString() {
        String str = this.j != null ? "<paragraph>" : "null";
        String strB = rg0.b(this.h);
        long j = this.s;
        StringBuilder sbO = s91.o("ParagraphLayoutCache(paragraph=", str, ", lastDensity=", strB, ", history=");
        sbO.append(j);
        sbO.append(", constraints=$)");
        return sbO.toString();
    }
}
