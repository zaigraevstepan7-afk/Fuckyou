package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o51 extends t51 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public o51(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o51)) {
            return false;
        }
        o51 o51Var = (o51) obj;
        return Float.compare(this.c, o51Var.c) == 0 && Float.compare(this.d, o51Var.d) == 0 && Float.compare(this.e, o51Var.e) == 0 && Float.compare(this.f, o51Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + s91.a(this.e, s91.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = s91.m("RelativeQuadTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbM.append(this.e);
        sbM.append(", dy2=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
