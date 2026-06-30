package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q02 {
    public final int a;
    public final ie b;
    public final d c;
    public q02 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ r02 h;

    public q02(r02 r02Var, int i, ie ieVar, d dVar) {
        this.h = r02Var;
        this.a = i;
        this.b = ieVar;
        this.c = dVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        fd1 fd1Var;
        fd1 fd1Var2;
        long j5 = this.h.f;
        ie ieVar = this.b;
        c01 c01VarN = bl.N(ieVar, 2);
        ql0 ql0VarP = bl.P(ieVar);
        boolean zK = ql0VarP.K();
        xz0 xz0Var = ql0VarP.I;
        if (zK) {
            if (xz0Var.d != c01VarN) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = c01VarN.g;
                c01 c01Var = xz0Var.d;
                c01Var.getClass();
                long jS = hk.S(c01Var.D(c01VarN, jFloatToRawIntBits));
                fd1Var = new fd1(jS, (4294967295L & ((long) (((int) (jS & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jS >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, ieVar);
            } else {
                fd1Var = new fd1(j, j2, j3, j4, j5, fArr, ieVar);
            }
            fd1Var2 = fd1Var;
        } else {
            fd1Var2 = null;
        }
        if (fd1Var2 == null) {
            return;
        }
        this.c.i(fd1Var2);
    }

    public final void b() {
        r02 r02Var = this.h;
        hx0 hx0Var = r02Var.a;
        int i = this.a;
        q02 q02Var = (q02) hx0Var.g(i);
        if (q02Var != null) {
            if (q02Var == this) {
                q02 q02Var2 = this.d;
                this.d = null;
                if (q02Var2 != null) {
                    int iD = hx0Var.d(i);
                    Object[] objArr = hx0Var.c;
                    Object obj = objArr[iD];
                    hx0Var.b[iD] = i;
                    objArr[iD] = q02Var2;
                    return;
                }
                ql0 ql0VarP = bl.P(this.b.e);
                if (ql0VarP.J()) {
                    sc1 rectManager = ((h4) tl0.a(ql0VarP)).getRectManager();
                    rectManager.getClass();
                    if (ql0VarP.k != -4) {
                        g6 g6Var = rectManager.c;
                        int iE = rectManager.e(ql0VarP);
                        long[] jArr = (long[]) g6Var.b;
                        int i2 = iE + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iD2 = hx0Var.d(i);
            Object[] objArr2 = hx0Var.c;
            Object obj2 = objArr2[iD2];
            hx0Var.b[iD2] = i;
            objArr2[iD2] = q02Var;
            while (true) {
                q02 q02Var3 = q02Var.d;
                if (q02Var3 == null) {
                    break;
                }
                if (q02Var3 == this) {
                    q02Var.d = this.d;
                    this.d = null;
                    return;
                }
                q02Var = q02Var3;
            }
        }
        q02 q02Var4 = r02Var.b;
        if (q02Var4 == this) {
            r02Var.b = q02Var4.d;
            this.d = null;
            return;
        }
        q02 q02Var5 = q02Var4 != null ? q02Var4.d : null;
        while (true) {
            q02 q02Var6 = q02Var4;
            q02Var4 = q02Var5;
            if (q02Var4 == null) {
                return;
            }
            if (q02Var4 == this) {
                if (q02Var6 != null) {
                    q02Var6.d = q02Var4.d;
                }
                this.d = null;
                return;
            }
            q02Var5 = q02Var4.d;
        }
    }
}
