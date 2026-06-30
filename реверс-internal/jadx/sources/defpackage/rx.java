package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class rx extends ze<sx> {
    public final ha0 a;
    public final sa0 b;
    public final long c;
    public final long d;
    public final kt1 e;
    public final kt1 f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;

    public rx(float f, float f2, float f3, float f4, long j, long j2, ha0 ha0Var, sa0 sa0Var, kt1 kt1Var, kt1 kt1Var2) {
        this.a = ha0Var;
        this.b = sa0Var;
        this.c = j;
        this.d = j2;
        this.e = kt1Var;
        this.f = kt1Var2;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new sx(this.h, this.g, this.i, this.j, this.c, this.d, this.a, this.b, this.e, this.f);
    }

    @Override // defpackage.ze
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        return tz.b(this.h, rxVar.h) && this.a == rxVar.a && this.b == rxVar.b;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        sx sxVar = (sx) sv0Var;
        long j = sxVar.u;
        ki kiVar = sxVar.K;
        long j2 = this.c;
        if (!vl.c(j, j2)) {
            sxVar.u = j2;
            al.C(kiVar);
        }
        long j3 = sxVar.v;
        long j4 = this.d;
        if (!vl.c(j3, j4)) {
            sxVar.v = j4;
            al.C(kiVar);
        }
        kt1 kt1Var = sxVar.w;
        kt1 kt1Var2 = this.e;
        if (!xi0.o(kt1Var, kt1Var2)) {
            sxVar.w = kt1Var2;
            kiVar.L0();
        }
        kt1 kt1Var3 = sxVar.x;
        kt1 kt1Var4 = this.f;
        if (!xi0.o(kt1Var3, kt1Var4)) {
            sxVar.x = kt1Var4;
            kiVar.L0();
        }
        float f = sxVar.y;
        float f2 = this.g;
        if (!tz.b(f, f2)) {
            sxVar.y = f2;
            kiVar.L0();
        }
        float f3 = sxVar.z;
        float f4 = this.i;
        if (!tz.b(f3, f4)) {
            sxVar.z = f4;
            sxVar.P0();
            kiVar.L0();
        }
        float f5 = sxVar.A;
        float f6 = this.j;
        if (!tz.b(f5, f6)) {
            sxVar.A = f6;
            sxVar.P0();
            kiVar.L0();
        }
        float f7 = sxVar.I;
        float f8 = this.h;
        if (!tz.b(f7, f8)) {
            sxVar.I = f8;
            al.C(kiVar);
        }
        ha0 ha0Var = sxVar.G;
        sa0 sa0Var = this.b;
        ha0 ha0Var2 = this.a;
        if (ha0Var == ha0Var2 && sxVar.H == sa0Var) {
            return;
        }
        sxVar.G = ha0Var2;
        sxVar.H = sa0Var;
        kiVar.L0();
    }

    @Override // defpackage.ze
    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + s91.a(this.h, super.hashCode() * 31, 31)) * 31);
    }
}
