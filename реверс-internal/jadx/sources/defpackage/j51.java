package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j51 extends t51 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public j51(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j51)) {
            return false;
        }
        j51 j51Var = (j51) obj;
        return Float.compare(this.c, j51Var.c) == 0 && Float.compare(this.d, j51Var.d) == 0 && Float.compare(this.e, j51Var.e) == 0 && this.f == j51Var.f && this.g == j51Var.g && Float.compare(this.h, j51Var.h) == 0 && Float.compare(this.i, j51Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + s91.a(this.h, s91.d(s91.d(s91.a(this.e, s91.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbM = s91.m("RelativeArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbM.append(this.e);
        sbM.append(", isMoreThanHalf=");
        sbM.append(this.f);
        sbM.append(", isPositiveArc=");
        sbM.append(this.g);
        sbM.append(", arcStartDx=");
        sbM.append(this.h);
        sbM.append(", arcStartDy=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
