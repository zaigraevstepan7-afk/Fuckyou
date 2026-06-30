package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ey1 {
    public final hb a;
    public final long b;
    public final pz1 c;
    public final z01 d;
    public final vz1 e;
    public long f;
    public final hb g;
    public final az1 h;
    public final qz1 i;

    public ey1(az1 az1Var, z01 z01Var, qz1 qz1Var, vz1 vz1Var) {
        hb hbVar = az1Var.a;
        long j = az1Var.b;
        pz1 pz1Var = qz1Var != null ? qz1Var.a : null;
        this.a = hbVar;
        this.b = j;
        this.c = pz1Var;
        this.d = z01Var;
        this.e = vz1Var;
        this.f = j;
        this.g = hbVar;
        this.h = az1Var;
        this.i = qz1Var;
    }

    public final List a(sa0 sa0Var) {
        if (!wz1.c(this.f)) {
            return hk.H(new in("", 0), new rm1(wz1.f(this.f), wz1.f(this.f)));
        }
        w20 w20Var = (w20) sa0Var.i(this);
        if (w20Var != null) {
            return hk.G(w20Var);
        }
        return null;
    }

    public final Integer b() {
        pz1 pz1Var = this.c;
        if (pz1Var == null) {
            return null;
        }
        vw0 vw0Var = pz1Var.b;
        int iE = wz1.e(this.f);
        z01 z01Var = this.d;
        return Integer.valueOf(z01Var.e(vw0Var.c(vw0Var.d(z01Var.g(iE)), true)));
    }

    public final Integer c() {
        pz1 pz1Var = this.c;
        if (pz1Var == null) {
            return null;
        }
        int iF = wz1.f(this.f);
        z01 z01Var = this.d;
        return Integer.valueOf(z01Var.e(pz1Var.f(pz1Var.b.d(z01Var.g(iF)))));
    }

    public final Integer d() {
        int length;
        pz1 pz1Var = this.c;
        if (pz1Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            hb hbVar = this.a;
            if (iR < hbVar.f.length()) {
                int length2 = this.g.f.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jI = pz1Var.i(length2);
                int i = wz1.c;
                int i2 = (int) (jI & 4294967295L);
                if (i2 > iR) {
                    length = this.d.e(i2);
                    break;
                }
                iR++;
            } else {
                length = hbVar.f.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iE;
        pz1 pz1Var = this.c;
        if (pz1Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                iE = 0;
                break;
            }
            int length = this.g.f.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jI = pz1Var.i(length);
            int i = wz1.c;
            int i2 = (int) (jI >> 32);
            if (i2 < iR) {
                iE = this.d.e(i2);
                break;
            }
            iR--;
        }
        return Integer.valueOf(iE);
    }

    public final boolean f() {
        pz1 pz1Var = this.c;
        return (pz1Var != null ? pz1Var.g(r()) : null) != ee1.f;
    }

    public final int g(pz1 pz1Var, int i) {
        int iR = r();
        vz1 vz1Var = this.e;
        if (vz1Var.a == null) {
            vz1Var.a = Float.valueOf(pz1Var.c(iR).a);
        }
        vw0 vw0Var = pz1Var.b;
        int iD = vw0Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= vw0Var.f) {
            return this.g.f.length();
        }
        float fB = vw0Var.b(iD) - 1.0f;
        Float f = vz1Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= pz1Var.e(iD)) || (!f() && fFloatValue <= pz1Var.d(iD))) {
            return vw0Var.c(iD, true);
        }
        return this.d.e(vw0Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(qz1 qz1Var, int i) {
        pc1 pc1VarI;
        zk0 zk0Var = qz1Var.b;
        pz1 pz1Var = qz1Var.a;
        if (zk0Var == null) {
            pc1VarI = pc1.e;
        } else {
            zk0 zk0Var2 = qz1Var.c;
            pc1VarI = zk0Var2 != null ? zk0Var2.I(zk0Var, true) : null;
            if (pc1VarI == null) {
            }
        }
        long j = this.h.b;
        int i2 = wz1.c;
        z01 z01Var = this.d;
        pc1 pc1VarC = pz1Var.c(z01Var.g((int) (j & 4294967295L)));
        float f = pc1VarC.a;
        return z01Var.e(pz1Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (pc1VarI.c() & 4294967295L)) * i) + pc1VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        vz1 vz1Var = this.e;
        vz1Var.a = null;
        hb hbVar = this.g;
        if (hbVar.f.length() > 0) {
            if (f()) {
                k();
                return;
            }
            vz1Var.a = null;
            if (hbVar.f.length() > 0) {
                String str = hbVar.f;
                long j = this.f;
                int i = wz1.c;
                int iL = qc1.l(str, (int) (j & 4294967295L));
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        hb hbVar = this.g;
        String str = hbVar.f;
        String str2 = hbVar.f;
        if (str.length() > 0) {
            int iF = ef1.f(str2, wz1.e(this.f));
            if (iF == wz1.e(this.f) && iF != str2.length()) {
                iF = ef1.f(str2, iF + 1);
            }
            q(iF, iF);
        }
    }

    public final void k() {
        this.e.a = null;
        hb hbVar = this.g;
        if (hbVar.f.length() > 0) {
            String str = hbVar.f;
            long j = this.f;
            int i = wz1.c;
            int iM = qc1.m(str, (int) (j & 4294967295L));
            if (iM != -1) {
                q(iM, iM);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        hb hbVar = this.g;
        String str = hbVar.f;
        String str2 = hbVar.f;
        if (str.length() > 0) {
            int iG = ef1.g(str2, wz1.f(this.f));
            if (iG == wz1.f(this.f) && iG != 0) {
                iG = ef1.g(str2, iG - 1);
            }
            q(iG, iG);
        }
    }

    public final void m() {
        vz1 vz1Var = this.e;
        vz1Var.a = null;
        hb hbVar = this.g;
        if (hbVar.f.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            vz1Var.a = null;
            if (hbVar.f.length() > 0) {
                String str = hbVar.f;
                long j = this.f;
                int i = wz1.c;
                int iL = qc1.l(str, (int) (j & 4294967295L));
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.f.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.f.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.f.length() > 0) {
            int i = wz1.c;
            this.f = af1.g((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = af1.g(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = wz1.c;
        return this.d.g((int) (j & 4294967295L));
    }
}
