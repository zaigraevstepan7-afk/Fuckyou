package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c70 implements y60 {
    public final float a;
    public final fr1 b;

    public c70(float f, float f2, float f3) {
        this.a = f3;
        fr1 fr1Var = new fr1();
        fr1Var.a = 1.0f;
        fr1Var.b = Math.sqrt(50.0d);
        fr1Var.c = 1.0f;
        if (f < 0.0f) {
            g91.a("Damping ratio must be non-negative");
        }
        fr1Var.c = f;
        double d = fr1Var.b;
        if (((float) (d * d)) <= 0.0f) {
            g91.a("Spring stiffness constant must be positive.");
        }
        fr1Var.b = Math.sqrt(f2);
        this.b = fr1Var;
    }

    @Override // defpackage.y60
    public final float b(long j, float f, float f2, float f3) {
        fr1 fr1Var = this.b;
        fr1Var.a = f2;
        return Float.intBitsToFloat((int) (fr1Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.y60
    public final float c(long j, float f, float f2, float f3) {
        fr1 fr1Var = this.b;
        fr1Var.a = f2;
        return Float.intBitsToFloat((int) (fr1Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    @Override // defpackage.y60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(float f, float f2, float f3) {
        double dLog;
        long j;
        double d;
        fr1 fr1Var = this.b;
        double d2 = fr1Var.b;
        float f4 = (float) (d2 * d2);
        float f5 = fr1Var.c;
        float f6 = this.a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d3 = f4;
            double d4 = f5;
            double d5 = f8;
            double d6 = f7;
            double dSqrt = Math.sqrt(d3) * d4 * 2.0d;
            double d7 = (dSqrt * dSqrt) - (d3 * 4.0d);
            double dSqrt2 = d7 < 0.0d ? 0.0d : Math.sqrt(d7);
            double d8 = -dSqrt;
            double d9 = (d8 + dSqrt2) * 0.5d;
            double dSqrt3 = (d7 < 0.0d ? Math.sqrt(Math.abs(d7)) : 0.0d) * 0.5d;
            double d10 = (d8 - dSqrt2) * 0.5d;
            if (d6 == 0.0d && d5 == 0.0d) {
                j = 0;
            } else {
                if (d6 < 0.0d) {
                    d5 = -d5;
                }
                double dAbs = Math.abs(d6);
                double d11 = 1.0d;
                double d12 = -1.0d;
                double dAbs2 = Double.MAX_VALUE;
                if (d4 > 1.0d) {
                    double d13 = (d9 * dAbs) - d5;
                    double d14 = d9 - d10;
                    double d15 = d13 / d14;
                    double d16 = dAbs - d15;
                    dLog = Math.log(Math.abs(1.0d / d16)) / d9;
                    double dLog2 = Math.log(Math.abs(1.0d / d15)) / d10;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d17 = d16 * d9;
                    double dLog3 = Math.log(d17 / ((-d15) * d10)) / (d10 - d9);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d11 = -1.0d;
                        d = d15 * d10;
                        if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
                            int i = 0;
                            while (dAbs2 > 0.001d && i < 100) {
                                i++;
                                double d18 = d9 * dLog;
                                double d19 = d10 * dLog;
                                double dExp = dLog - ((((Math.exp(d19) * d15) + (Math.exp(d18) * d16)) + d11) / ((Math.exp(d19) * d) + (Math.exp(d18) * d17)));
                                dAbs2 = Math.abs(dLog - dExp);
                                dLog = dExp;
                            }
                        }
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d10) * d15) + (Math.exp(d9 * dLog3) * d16))) < 1.0d) {
                                dLog = (d15 <= 0.0d || d16 >= 0.0d) ? dLog : 0.0d;
                                d11 = -1.0d;
                                d = d15 * d10;
                                if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
                                }
                            }
                        }
                        dLog = Math.log((-((d15 * d10) * d10)) / (d17 * d9)) / d14;
                        d = d15 * d10;
                        if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
                        }
                    }
                } else if (d4 < 1.0d) {
                    double d20 = (d5 - (d9 * dAbs)) / dSqrt3;
                    dLog = Math.log(1.0d / Math.sqrt((d20 * d20) + (dAbs * dAbs))) / d9;
                } else {
                    double d21 = d9 * dAbs;
                    double d22 = d5 - d21;
                    double dLog4 = Math.log(Math.abs(1.0d / dAbs)) / d9;
                    double dLog5 = Math.log(Math.abs(1.0d / d22));
                    double dLog6 = dLog5;
                    for (int i2 = 0; i2 < 6; i2++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d9));
                    }
                    double d23 = dLog6 / d9;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d23;
                    } else if ((Double.doubleToRawLongBits(d23) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d23);
                    }
                    double d24 = (-(d21 + d22)) / (d9 * d22);
                    double d25 = d9 * d24;
                    double dExp2 = (Math.exp(d25) * d22 * d24) + (Math.exp(d25) * dAbs);
                    if (!Double.isNaN(d24) && d24 > 0.0d) {
                        if (d24 <= 0.0d || (-dExp2) >= 1.0d) {
                            dLog4 = (-(2.0d / d9)) - (dAbs / d22);
                            d12 = 1.0d;
                        } else {
                            dLog4 = (d22 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                        }
                    }
                    dLog = dLog4;
                    int i3 = 0;
                    while (dAbs2 > 0.001d && i3 < 100) {
                        i3++;
                        double d26 = d9 * dLog;
                        double dExp3 = dLog - (((Math.exp(d26) * ((d22 * dLog) + dAbs)) + d12) / (Math.exp(d26) * (((d26 + 1.0d) * d22) + d21)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // defpackage.y60
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }
}
