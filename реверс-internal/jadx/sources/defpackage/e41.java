package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e41 implements c41 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public e41(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            lg0.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.c41
    public final float a(al0 al0Var) {
        return al0Var == al0.e ? this.a : this.c;
    }

    @Override // defpackage.c41
    public final float b(al0 al0Var) {
        return al0Var == al0.e ? this.c : this.a;
    }

    @Override // defpackage.c41
    public final float c() {
        return this.d;
    }

    @Override // defpackage.c41
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e41)) {
            return false;
        }
        e41 e41Var = (e41) obj;
        return tz.b(this.a, e41Var.a) && tz.b(this.b, e41Var.b) && tz.b(this.c, e41Var.c) && tz.b(this.d, e41Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + s91.a(this.c, s91.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String strC = tz.c(this.a);
        String strC2 = tz.c(this.b);
        String strC3 = tz.c(this.c);
        String strC4 = tz.c(this.d);
        StringBuilder sbO = s91.o("PaddingValues(start=", strC, ", top=", strC2, ", end=");
        sbO.append(strC3);
        sbO.append(", bottom=");
        sbO.append(strC4);
        sbO.append(")");
        return sbO.toString();
    }
}
