package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ld0 {
    public final int a;
    public final double b;
    public final double c;
    public final double d;

    public ld0(int i) {
        double d;
        int i2;
        this.a = i;
        x62 x62Var = x62.k;
        x62Var.getClass();
        int i3 = i & 255;
        double dV = pv.v((16711680 & i) >> 16);
        double dV2 = pv.v((65280 & i) >> 8);
        double dV3 = pv.v(i3);
        double d2 = (0.18051042d * dV3) + (0.35762064d * dV2) + (0.41233895d * dV);
        double d3 = (0.0722d * dV3) + (0.7152d * dV2) + (0.2126d * dV);
        double d4 = (dV3 * 0.95034478d) + (dV2 * 0.11916382d) + (dV * 0.01932141d);
        double d5 = x62Var.i;
        double d6 = x62Var.e;
        double d7 = x62Var.b;
        double[][] dArr = u4.e;
        double[] dArr2 = dArr[0];
        double d8 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d9 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        double d10 = (d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]);
        double[] dArr5 = x62Var.g;
        double d11 = dArr5[0] * d8;
        double d12 = dArr5[1] * d9;
        double d13 = dArr5[2] * d10;
        double d14 = x62Var.h;
        double dPow = Math.pow((Math.abs(d11) * d14) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d12) * d14) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d13) * d14) / 100.0d, 0.42d);
        double d15 = ((((double) (d11 < 0.0d ? -1 : d11 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
        if (d12 < 0.0d) {
            d = 0.0d;
            i2 = -1;
        } else if (d12 == 0.0d) {
            d = 0.0d;
            i2 = 0;
        } else {
            d = 0.0d;
            i2 = 1;
        }
        double d16 = ((((double) i2) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double d17 = ((((double) (d13 >= d ? d13 == d ? 0 : 1 : -1)) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d18 = ((((-12.0d) * d16) + (d15 * 11.0d)) + d17) / 11.0d;
        double d19 = ((d15 + d16) - (d17 * 2.0d)) / 9.0d;
        double d20 = d16 * 20.0d;
        double d21 = ((21.0d * d17) + ((d15 * 20.0d) + d20)) / 20.0d;
        double d22 = (((d15 * 40.0d) + d20) + d17) / 20.0d;
        double dAtan2 = (Math.atan2(d19, d18) * 57.29577951308232d) % 360.0d;
        dAtan2 = dAtan2 < d ? dAtan2 + 360.0d : dAtan2;
        double d23 = dAtan2 * 0.017453292519943295d;
        double dPow4 = (Math.pow((d22 * x62Var.c) / d7, x62Var.j * d6) * 100.0d) / 100.0d;
        Math.sqrt(dPow4);
        double d24 = d7 + 4.0d;
        double dPow5 = Math.pow((Math.hypot(d18, d19) * (((((Math.cos(((dAtan2 < 20.14d ? dAtan2 + 360.0d : dAtan2) * 0.017453292519943295d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * x62Var.f) * x62Var.d)) / (d21 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, x62Var.a), 0.73d);
        double dSqrt = Math.sqrt(dPow4) * dPow5;
        Math.sqrt((dPow5 * d6) / d24);
        Math.log1p(dSqrt * d5 * 0.0228d);
        Math.cos(d23);
        Math.sin(d23);
        this.b = dAtan2;
        this.c = dSqrt;
        this.d = (pv.u(al.G(new double[]{pv.v((i >> 16) & 255), pv.v((i >> 8) & 255), pv.v(i3)}, pv.j)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public final boolean a() {
        double d = this.b;
        return d >= 170.0d && d < 207.0d;
    }

    public final boolean b() {
        double d = this.b;
        return d >= 105.0d && d < 125.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld0) && this.a == ((ld0) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return s91.h(this.a, "Hct(argb=", ")");
    }
}
