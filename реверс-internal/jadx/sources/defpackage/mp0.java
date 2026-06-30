package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mp0 {
    public static final mp0 d = new mp0(jp0.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public mp0(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp0)) {
            return false;
        }
        mp0 mp0Var = (mp0) obj;
        float f = mp0Var.a;
        float f2 = jp0.b;
        return Float.compare(this.a, f) == 0 && this.b == mp0Var.b && this.c == mp0Var.c;
    }

    public final int hashCode() {
        float f = jp0.b;
        return Integer.hashCode(this.c) + s91.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strB = jp0.b(this.a);
        String str = "Invalid";
        int i = this.b;
        String str2 = i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        StringBuilder sbO = s91.o("LineHeightStyle(alignment=", strB, ", trim=", str2, ",mode=");
        sbO.append(str);
        sbO.append(")");
        return sbO.toString();
    }
}
