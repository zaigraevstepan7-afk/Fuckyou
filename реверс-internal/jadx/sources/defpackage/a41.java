package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class a41 extends xv0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public a41(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            lg0.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        b41 b41Var = new b41();
        b41Var.s = this.a;
        b41Var.t = this.b;
        b41Var.u = this.c;
        b41Var.v = this.d;
        b41Var.w = true;
        return b41Var;
    }

    public final boolean equals(Object obj) {
        a41 a41Var = obj instanceof a41 ? (a41) obj : null;
        return a41Var != null && tz.b(this.a, a41Var.a) && tz.b(this.b, a41Var.b) && tz.b(this.c, a41Var.c) && tz.b(this.d, a41Var.d);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        b41 b41Var = (b41) sv0Var;
        b41Var.s = this.a;
        b41Var.t = this.b;
        b41Var.u = this.c;
        b41Var.v = this.d;
        b41Var.w = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s91.a(this.d, s91.a(this.c, s91.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
