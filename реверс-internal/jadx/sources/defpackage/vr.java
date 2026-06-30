package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vr extends sv0 implements vp, av0 {
    public k31 s;
    public final bk1 t;
    public boolean u;
    public final rj1 v;
    public boolean x;
    public boolean z;
    public final wg w = new wg(0);
    public long y = -1;

    public vr(k31 k31Var, bk1 bk1Var, boolean z, rj1 rj1Var) {
        this.s = k31Var;
        this.t = bk1Var;
        this.u = z;
        this.v = rj1Var;
    }

    public static final float L0(vr vrVar, gh ghVar, long j) {
        float f;
        pc1 pc1Var;
        int iCompare;
        long j2 = vrVar.y;
        iy0 iy0Var = vrVar.w.a;
        int i = iy0Var.g - 1;
        Object[] objArr = iy0Var.e;
        if (i < objArr.length) {
            pc1Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                pc1 pc1Var2 = (pc1) ((sr) objArr[i]).a.a();
                if (pc1Var2 != null) {
                    long jC = pc1Var2.c();
                    long jP = xk.P(vrVar.M0());
                    f = 0.0f;
                    int iOrdinal = vrVar.s.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jP & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            ez1.a();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jP >> 32)));
                    }
                    if (iCompare <= 0) {
                        pc1Var = pc1Var2;
                    } else if (pc1Var == null) {
                        pc1Var = pc1Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            pc1Var = null;
        }
        if (pc1Var == null) {
            pc1 pc1Var3 = vrVar.x ? (pc1) vrVar.v.a() : null;
            if (pc1Var3 == null) {
                return f;
            }
            pc1Var = pc1Var3;
        }
        long jP2 = xk.P(j2);
        int iOrdinal2 = vrVar.s.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = pc1Var.b;
            return ghVar.a(f2 - ((int) (j & 4294967295L)), pc1Var.d - f2, Float.intBitsToFloat((int) (jP2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = pc1Var.a;
            return ghVar.a(f3 - ((int) (j >> 32)), pc1Var.c - f3, Float.intBitsToFloat((int) (jP2 >> 32)));
        }
        ez1.a();
        return f;
    }

    public static boolean N0(vr vrVar, pc1 pc1Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = vrVar.M0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jP0 = vrVar.P0(pc1Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jP0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jP0 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    public final long M0() {
        long j = this.y;
        if (vh0.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void O0(long j) {
        bq bqVar = ih.a;
        gh ghVar = (gh) hk.o(this, bqVar);
        if (this.z) {
            qg0.c("launchAnimation called when previous animation was running");
        }
        ((gh) hk.o(this, bqVar)).getClass();
        gh.a.getClass();
        k42 k42Var = new k42(fh.b);
        nu0.A(z0(), null, yt.h, new ur(this, k42Var, ghVar, j, null), 1);
    }

    public final long P0(pc1 pc1Var, long j, long j2) {
        long jP = xk.P(j);
        int iOrdinal = this.s.ordinal();
        if (iOrdinal == 0) {
            gh ghVar = (gh) hk.o(this, ih.a);
            float f = pc1Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ghVar.a(f - ((int) (j2 & 4294967295L)), pc1Var.d - f, Float.intBitsToFloat((int) (jP & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            ez1.a();
            return 0L;
        }
        gh ghVar2 = (gh) hk.o(this, ih.a);
        float f2 = pc1Var.a;
        return (((long) Float.floatToRawIntBits(ghVar2.a(f2 - ((int) (j2 >> 32)), pc1Var.c - f2, Float.intBitsToFloat((int) (jP >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // defpackage.av0
    public final void c(long j) {
        int iT;
        long jM0 = M0();
        this.y = j;
        int iOrdinal = this.s.ordinal();
        if (iOrdinal == 0) {
            iT = xi0.t((int) (j & 4294967295L), (int) (jM0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                ez1.a();
                return;
            }
            iT = xi0.t((int) (j >> 32), (int) (jM0 >> 32));
        }
        if (iT >= 0) {
            return;
        }
        long j2 = !this.u ? this.s == k31.e ? ((long) (((int) (jM0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM0 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        pc1 pc1Var = (pc1) this.v.a();
        if (pc1Var == null || this.z || this.x || !N0(this, pc1Var, jM0, 0L, 2) || N0(this, pc1Var, 0L, j2, 1)) {
            return;
        }
        this.x = true;
        O0(j2);
    }
}
