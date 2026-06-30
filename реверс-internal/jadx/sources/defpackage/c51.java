package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c51 extends t51 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public c51(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c51)) {
            return false;
        }
        c51 c51Var = (c51) obj;
        return Float.compare(this.c, c51Var.c) == 0 && Float.compare(this.d, c51Var.d) == 0 && Float.compare(this.e, c51Var.e) == 0 && Float.compare(this.f, c51Var.f) == 0 && Float.compare(this.g, c51Var.g) == 0 && Float.compare(this.h, c51Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + s91.a(this.g, s91.a(this.f, s91.a(this.e, s91.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = s91.m("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbM.append(this.e);
        sbM.append(", y2=");
        sbM.append(this.f);
        sbM.append(", x3=");
        sbM.append(this.g);
        sbM.append(", y3=");
        sbM.append(this.h);
        sbM.append(")");
        return sbM.toString();
    }
}
