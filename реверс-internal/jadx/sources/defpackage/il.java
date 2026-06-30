package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class il extends kl {
    public final byte[] g;
    public int h;
    public int i;
    public int j;
    public final int k;
    public int l;
    public int m = Integer.MAX_VALUE;

    public il(byte[] bArr, int i, int i2, boolean z) {
        this.g = bArr;
        this.h = i2 + i;
        this.j = i;
        this.k = i;
    }

    @Override // defpackage.kl
    public final int A() {
        return G();
    }

    @Override // defpackage.kl
    public final long B() {
        return H();
    }

    @Override // defpackage.kl
    public final boolean C(int i) throws fj0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                K(8);
                return true;
            }
            if (i2 == 2) {
                K(G());
                return true;
            }
            if (i2 == 3) {
                D();
                b(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw fj0.b();
            }
            K(4);
            return true;
        }
        int i4 = this.h - this.j;
        byte[] bArr = this.g;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.j;
                this.j = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw fj0.c();
        }
        while (i3 < 10) {
            int i6 = this.j;
            if (i6 == this.h) {
                throw fj0.e();
            }
            this.j = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw fj0.c();
        return true;
    }

    public final int E() throws fj0 {
        int i = this.j;
        if (this.h - i < 4) {
            throw fj0.e();
        }
        this.j = i + 4;
        byte[] bArr = this.g;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() throws fj0 {
        int i = this.j;
        if (this.h - i < 8) {
            throw fj0.e();
        }
        this.j = i + 8;
        byte[] bArr = this.g;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int G() {
        int i;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.g;
            byte b = bArr[i2];
            if (b >= 0) {
                this.j = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.j = i5;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.j;
        int i2 = this.h;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.g;
            byte b = bArr[i];
            if (b >= 0) {
                this.j = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.j = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() throws fj0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.j;
            if (i2 == this.h) {
                throw fj0.e();
            }
            this.j = i2 + 1;
            byte b = this.g[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw fj0.c();
    }

    public final void J() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = i - this.k;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    public final void K(int i) throws fj0 {
        if (i >= 0) {
            int i2 = this.h;
            int i3 = this.j;
            if (i <= i2 - i3) {
                this.j = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw fj0.e();
        }
        throw fj0.d();
    }

    @Override // defpackage.kl
    public final void b(int i) throws fj0 {
        if (this.l != i) {
            throw new fj0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.kl
    public final int c() {
        return this.j - this.k;
    }

    @Override // defpackage.kl
    public final boolean d() {
        return this.j == this.h;
    }

    @Override // defpackage.kl
    public final void i(int i) {
        this.m = i;
        J();
    }

    @Override // defpackage.kl
    public final int j(int i) {
        if (i < 0) {
            throw fj0.d();
        }
        int iC = c() + i;
        if (iC < 0) {
            throw new fj0("Failed to parse the message.");
        }
        int i2 = this.m;
        if (iC > i2) {
            throw fj0.e();
        }
        this.m = iC;
        J();
        return i2;
    }

    @Override // defpackage.kl
    public final boolean k() {
        return H() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // defpackage.kl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ji l() throws fj0 {
        byte[] bArrCopyOfRange;
        int iG = G();
        byte[] bArr = this.g;
        if (iG > 0) {
            int i = this.h;
            int i2 = this.j;
            if (iG <= i - i2) {
                ji jiVarC = ji.c(bArr, i2, iG);
                this.j += iG;
                return jiVarC;
            }
        }
        if (iG == 0) {
            return ji.g;
        }
        if (iG > 0) {
            int i3 = this.h;
            int i4 = this.j;
            if (iG <= i3 - i4) {
                int i5 = iG + i4;
                this.j = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iG > 0) {
                    throw fj0.e();
                }
                if (iG != 0) {
                    throw fj0.d();
                }
                bArrCopyOfRange = ki0.b;
            }
        }
        ji jiVar = ji.g;
        return new ji(bArrCopyOfRange);
    }

    @Override // defpackage.kl
    public final double m() {
        return Double.longBitsToDouble(F());
    }

    @Override // defpackage.kl
    public final int n() {
        return G();
    }

    @Override // defpackage.kl
    public final int o() {
        return E();
    }

    @Override // defpackage.kl
    public final long p() {
        return F();
    }

    @Override // defpackage.kl
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // defpackage.kl
    public final int r() {
        return G();
    }

    @Override // defpackage.kl
    public final long s() {
        return H();
    }

    @Override // defpackage.kl
    public final int t() {
        return E();
    }

    @Override // defpackage.kl
    public final long u() {
        return F();
    }

    @Override // defpackage.kl
    public final int v() {
        int iG = G();
        return (-(iG & 1)) ^ (iG >>> 1);
    }

    @Override // defpackage.kl
    public final long w() {
        long jH = H();
        return (-(jH & 1)) ^ (jH >>> 1);
    }

    @Override // defpackage.kl
    public final String x() throws fj0 {
        int iG = G();
        if (iG > 0) {
            int i = this.h;
            int i2 = this.j;
            if (iG <= i - i2) {
                String str = new String(this.g, i2, iG, ki0.a);
                this.j += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw fj0.d();
        }
        throw fj0.e();
    }

    @Override // defpackage.kl
    public final String y() throws fj0 {
        int iG = G();
        if (iG > 0) {
            int i = this.h;
            int i2 = this.j;
            if (iG <= i - i2) {
                String strD = p42.a.d(this.g, i2, iG);
                this.j += iG;
                return strD;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw fj0.d();
        }
        throw fj0.e();
    }

    @Override // defpackage.kl
    public final int z() throws fj0 {
        if (d()) {
            this.l = 0;
            return 0;
        }
        int iG = G();
        this.l = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new fj0("Protocol message contained an invalid tag (zero).");
    }
}
