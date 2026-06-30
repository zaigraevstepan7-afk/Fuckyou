package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qz1 {
    public final pz1 a;
    public zk0 b = null;
    public zk0 c;

    public qz1(pz1 pz1Var, zk0 zk0Var) {
        this.a = pz1Var;
        this.c = zk0Var;
    }

    public final long a(long j) {
        pc1 pc1VarI;
        zk0 zk0Var = this.b;
        pc1 pc1Var = pc1.e;
        if (zk0Var != null) {
            if (zk0Var.B()) {
                zk0 zk0Var2 = this.c;
                pc1VarI = zk0Var2 != null ? zk0Var2.I(zk0Var, true) : null;
            } else {
                pc1VarI = pc1Var;
            }
            if (pc1VarI != null) {
                pc1Var = pc1VarI;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = pc1Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = pc1Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = pc1Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = pc1Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        pz1 pz1Var = this.a;
        int iE = pz1Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= pz1Var.d(iE) && Float.intBitsToFloat(i) <= pz1Var.e(iE);
    }

    public final long d(long j) {
        zk0 zk0Var;
        zk0 zk0Var2 = this.b;
        if (zk0Var2 != null) {
            if (!zk0Var2.B()) {
                zk0Var2 = null;
            }
            if (zk0Var2 != null && (zk0Var = this.c) != null) {
                zk0 zk0Var3 = zk0Var.B() ? zk0Var : null;
                if (zk0Var3 != null) {
                    return zk0Var2.r(zk0Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        zk0 zk0Var;
        zk0 zk0Var2 = this.b;
        if (zk0Var2 != null) {
            if (!zk0Var2.B()) {
                zk0Var2 = null;
            }
            if (zk0Var2 != null && (zk0Var = this.c) != null) {
                zk0 zk0Var3 = zk0Var.B() ? zk0Var : null;
                if (zk0Var3 != null) {
                    return zk0Var3.r(zk0Var2, j);
                }
            }
        }
        return j;
    }
}
