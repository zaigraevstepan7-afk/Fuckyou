package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yp1 implements Iterable, yj0 {
    public static final yp1 i = new yp1(0, 0, 0, null);
    public final long e;
    public final long f;
    public final long g;
    public final long[] h;

    public yp1(long j, long j2, long j3, long[] jArr) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = jArr;
    }

    public final yp1 a(yp1 yp1Var) {
        long[] jArr;
        yp1 yp1VarB = this;
        yp1 yp1Var2 = i;
        if (yp1Var == yp1Var2) {
            return yp1VarB;
        }
        if (yp1VarB == yp1Var2) {
            return yp1Var2;
        }
        long j = yp1Var.g;
        long j2 = yp1Var.g;
        long[] jArr2 = yp1Var.h;
        long j3 = yp1Var.f;
        long j4 = yp1Var.e;
        long j5 = yp1VarB.g;
        if (j == j5 && jArr2 == (jArr = yp1VarB.h)) {
            return new yp1(yp1VarB.e & (~j4), yp1VarB.f & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                yp1VarB = yp1VarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j3) != 0) {
                    yp1VarB = yp1VarB.b(((long) i2) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j4) != 0) {
                    yp1VarB = yp1VarB.b(((long) i3) + j2 + 64);
                }
            }
        }
        return yp1VarB;
    }

    public final yp1 b(long j) {
        long[] jArr;
        int i2;
        long[] jArr2;
        long j2 = j - this.g;
        if (xi0.u(j2, 0L) >= 0 && xi0.u(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f;
            if ((j4 & j3) != 0) {
                return new yp1(this.e, j4 & (~j3), this.g, this.h);
            }
        } else if (xi0.u(j2, 64L) >= 0 && xi0.u(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.e;
            if ((j6 & j5) != 0) {
                return new yp1(j6 & (~j5), this.f, this.g, this.h);
            }
        } else if (xi0.u(j2, 0L) < 0 && (jArr = this.h) != null && (i2 = pd1.i(jArr, j)) >= 0) {
            int length = jArr.length;
            int i3 = length - 1;
            if (i3 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i3];
                if (i2 > 0) {
                    nd.L(jArr, jArr3, 0, 0, i2);
                }
                if (i2 < i3) {
                    nd.L(jArr, jArr3, i2, i2 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new yp1(this.e, this.f, this.g, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.g;
        return (xi0.u(j2, 0L) < 0 || xi0.u(j2, 64L) >= 0) ? (xi0.u(j2, 64L) < 0 || xi0.u(j2, 128L) >= 0) ? xi0.u(j2, 0L) <= 0 && (jArr = this.h) != null && pd1.i(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.e) != 0 : ((1 << ((int) j2)) & this.f) != 0;
    }

    public final yp1 e(yp1 yp1Var) {
        yp1 yp1VarF;
        long[] jArr;
        yp1 yp1VarF2 = this;
        yp1 yp1Var2 = i;
        if (yp1Var == yp1Var2) {
            return yp1VarF2;
        }
        if (yp1VarF2 == yp1Var2) {
            return yp1Var;
        }
        long j = yp1Var.g;
        long j2 = yp1Var.g;
        long[] jArr2 = yp1Var.h;
        long j3 = yp1Var.f;
        long j4 = yp1Var.e;
        long j5 = yp1VarF2.g;
        long j6 = yp1VarF2.f;
        long j7 = yp1VarF2.e;
        if (j == j5 && jArr2 == (jArr = yp1VarF2.h)) {
            return new yp1(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = yp1VarF2.h;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    yp1VarF2 = yp1VarF2.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if (((1 << i3) & j3) != 0) {
                        yp1VarF2 = yp1VarF2.f(((long) i3) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j4) != 0) {
                        yp1VarF2 = yp1VarF2.f(((long) i2) + j2 + 64);
                    }
                    i2++;
                }
            }
            return yp1VarF2;
        }
        if (jArr3 != null) {
            yp1VarF = yp1Var;
            for (long j9 : jArr3) {
                yp1VarF = yp1VarF.f(j9);
            }
        } else {
            yp1VarF = yp1Var;
        }
        long j10 = yp1VarF2.g;
        if (j6 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j6) != 0) {
                    yp1VarF = yp1VarF.f(((long) i4) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j7) != 0) {
                    yp1VarF = yp1VarF.f(((long) i2) + j10 + 64);
                }
                i2++;
            }
        }
        return yp1VarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yp1 f(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        long j4;
        long j5 = this.g;
        long j6 = j - j5;
        long j7 = 0;
        int iU = xi0.u(j6, 0L);
        long j8 = this.f;
        if (iU < 0 || xi0.u(j6, 64L) >= 0) {
            int iU2 = xi0.u(j6, 64L);
            long j9 = this.e;
            int i3 = 64;
            if (iU2 < 0 || xi0.u(j6, 128L) >= 0) {
                int iU3 = xi0.u(j6, 128L);
                long[] jArr3 = this.h;
                if (iU3 < 0) {
                    if (jArr3 == null) {
                        return new yp1(this.e, this.f, this.g, new long[]{j});
                    }
                    int i4 = pd1.i(jArr3, j);
                    if (i4 < 0) {
                        int i5 = -(i4 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        nd.L(jArr3, jArr4, 0, 0, i5);
                        nd.L(jArr3, jArr4, i5 + 1, i5, length);
                        jArr4[i5] = j;
                        return new yp1(this.e, this.f, this.g, jArr4);
                    }
                } else if (!c(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (xi0.u(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    y41 y41Var = null;
                    while (true) {
                        if (xi0.u(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (y41Var == null) {
                                y41Var = new y41(jArr3);
                            }
                            int i6 = 0;
                            i2 = i3;
                            while (i6 < i2) {
                                if ((j8 & (1 << i6)) != j7) {
                                    j4 = j7;
                                    ((kx0) y41Var.f).a(((long) i6) + j5);
                                } else {
                                    j4 = j7;
                                }
                                i6++;
                                j7 = j4;
                            }
                        } else {
                            i2 = i3;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i3 = i2;
                        j11 = j7;
                    }
                    if (y41Var == null) {
                        jArr = jArr3;
                    } else {
                        kx0 kx0Var = (kx0) y41Var.f;
                        int i7 = kx0Var.b;
                        if (i7 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i7];
                            long[] jArr6 = kx0Var.a;
                            for (int i8 = 0; i8 < i7; i8++) {
                                jArr5[i8] = jArr6[i8];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                        }
                    }
                    return new yp1(j11, j3, j2, jArr).f(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new yp1(j9 | j13, this.f, this.g, this.h);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new yp1(this.e, j8 | j14, this.g, this.h);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return af1.x(new xp1(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(ql.Y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
