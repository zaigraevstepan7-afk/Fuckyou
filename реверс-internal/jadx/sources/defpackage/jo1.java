package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class jo1 extends xv0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ jo1(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        lo1 lo1Var = new lo1();
        lo1Var.s = this.a;
        lo1Var.t = this.b;
        lo1Var.u = this.c;
        lo1Var.v = this.d;
        lo1Var.w = this.e;
        return lo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo1)) {
            return false;
        }
        jo1 jo1Var = (jo1) obj;
        return tz.b(this.a, jo1Var.a) && tz.b(this.b, jo1Var.b) && tz.b(this.c, jo1Var.c) && tz.b(this.d, jo1Var.d) && this.e == jo1Var.e;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        lo1 lo1Var = (lo1) sv0Var;
        lo1Var.s = this.a;
        lo1Var.t = this.b;
        lo1Var.u = this.c;
        lo1Var.v = this.d;
        lo1Var.w = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + s91.a(this.d, s91.a(this.c, s91.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public jo1(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
