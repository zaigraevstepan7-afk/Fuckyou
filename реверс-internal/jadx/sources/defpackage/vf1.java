package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vf1 implements pf0 {
    public final boolean a;
    public final float b;
    public final long c;
    public final ym1 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public vf1(boolean z, float f, long j, ym1 ym1Var, boolean z2) {
        if (ym1Var == null) {
            tz tzVar = tz.b(f, Float.NaN) ? null : new tz(f);
            ym1Var = tzVar != null ? mg1.a(tzVar.e) : null;
            if (ym1Var == null) {
                ym1Var = pv.w;
            }
        }
        this.a = z;
        this.b = f;
        this.c = j;
        this.d = ym1Var;
        this.e = true;
        this.f = z2;
        this.g = true;
        this.h = true;
    }

    @Override // defpackage.pf0
    public final xw a(jx0 jx0Var) {
        return new cx(jx0Var, this.a, this.b, new y41(7, this), this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf1)) {
            return false;
        }
        vf1 vf1Var = (vf1) obj;
        return this.a == vf1Var.a && tz.b(this.b, vf1Var.b) && vl.c(this.c, vf1Var.c) && xi0.o(this.d, vf1Var.d) && this.e == vf1Var.e && this.f == vf1Var.f && this.g == vf1Var.g && this.h == vf1Var.h;
    }

    @Override // defpackage.pf0
    public final int hashCode() {
        int iA = s91.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = vl.h;
        return Boolean.hashCode(this.h) + s91.d(s91.d(s91.d((this.d.hashCode() + s91.c(iA, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
