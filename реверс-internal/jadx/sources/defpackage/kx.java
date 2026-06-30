package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kx implements hx {
    public final float e;
    public final float f;

    public kx(float f, float f2) {
        this.e = f;
        this.f = f2;
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        return Float.compare(this.e, kxVar.e) == 0 && Float.compare(this.f, kxVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + (Float.hashCode(this.e) * 31);
    }

    @Override // defpackage.hx
    public final float l() {
        return this.f;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.e + ", fontScale=" + this.f + ")";
    }
}
