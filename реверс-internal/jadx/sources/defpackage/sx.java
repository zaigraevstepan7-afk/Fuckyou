package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sx extends yw {
    public float A;
    public jr1 C;
    public h9 D;
    public jr1 E;
    public ha0 G;
    public sa0 H;
    public float I;
    public final ki K;
    public long u;
    public long v;
    public kt1 w;
    public kt1 x;
    public float y;
    public float z;
    public final r41 B = new r41(0.0f);
    public final rp0 F = new rp0();
    public final float[] J = {0.0f, 0.0f};

    public sx(float f, float f2, float f3, float f4, long j, long j2, ha0 ha0Var, sa0 sa0Var, kt1 kt1Var, kt1 kt1Var2) {
        this.u = j;
        this.v = j2;
        this.w = kt1Var;
        this.x = kt1Var2;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.G = ha0Var;
        this.H = sa0Var;
        this.I = f;
        ki kiVar = new ki(new li(), new bf(this, 2));
        L0(kiVar);
        this.K = kiVar;
    }

    @Override // defpackage.sv0
    public final void D0() {
        P0();
    }

    @Override // defpackage.sv0
    public final void E0() {
        this.D = null;
    }

    public final float[] O0() {
        float[] fArr = this.J;
        fArr[0] = 0.0f;
        float fFloatValue = ((Number) this.G.a()).floatValue();
        float f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[1] = f;
        return fArr;
    }

    public final void P0() {
        jr1 jr1Var = this.C;
        ks ksVar = null;
        if (jr1Var != null) {
            jr1Var.a(null);
        }
        this.C = null;
        if (this.r) {
            if (tz.a(this.A, 0.0f) <= 0 || tz.a(this.z, 0.0f) <= 0) {
                this.B.h(0.0f);
                return;
            }
            int iRound = Math.round((this.z / this.A) * 1000.0f);
            if (iRound < 50) {
                iRound = 50;
            }
            this.C = nu0.A(z0(), null, null, new cf(this, iRound, ksVar, 0), 3);
        }
    }
}
