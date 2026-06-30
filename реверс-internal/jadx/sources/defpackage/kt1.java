package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 extends q10 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public kt1(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt1)) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return this.a == kt1Var.a && this.b == kt1Var.b && this.c == kt1Var.c && this.d == kt1Var.d;
    }

    public final int hashCode() {
        return s91.b(this.d, s91.b(this.c, s91.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = "Unknown";
        int i = this.c;
        String str2 = i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        StringBuilder sbM = s91.m("Stroke(width=", this.a, ", miter=", this.b, ", cap=");
        sbM.append(str2);
        sbM.append(", join=");
        sbM.append(str);
        sbM.append(", pathEffect=null)");
        return sbM.toString();
    }
}
