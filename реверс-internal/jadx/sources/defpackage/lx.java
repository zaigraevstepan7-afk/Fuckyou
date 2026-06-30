package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lx implements hx {
    public final float e;
    public final float f;
    public final v90 g;

    public lx(float f, float f2, v90 v90Var) {
        this.e = f;
        this.f = f2;
        this.g = v90Var;
    }

    @Override // defpackage.hx
    public final float J(long j) {
        if (h02.a(g02.b(j), 4294967296L)) {
            return this.g.b(g02.c(j));
        }
        yc.l("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        return Float.compare(this.e, lxVar.e) == 0 && Float.compare(this.f, lxVar.f) == 0 && this.g.equals(lxVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + s91.a(this.f, Float.hashCode(this.e) * 31, 31);
    }

    @Override // defpackage.hx
    public final float l() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sbM = s91.m("DensityWithConverter(density=", this.e, ", fontScale=", this.f, ", converter=");
        sbM.append(this.g);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // defpackage.hx
    public final long v(float f) {
        return uc1.y(this.g.a(f), 4294967296L);
    }
}
