package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends w0 {
    public static y0 e;
    public static final ee1 f = ee1.f;
    public static final ee1 g = ee1.e;
    public pz1 c;
    public rl1 d;

    @Override // defpackage.w0
    public final int[] a(int i) {
        int iE;
        if (c().length() > 0 && i < c().length()) {
            try {
                rl1 rl1Var = this.d;
                if (rl1Var == null) {
                    xi0.K("node");
                    throw null;
                }
                pc1 pc1VarG = rl1Var.g();
                int iRound = Math.round(pc1VarG.d - pc1VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                pz1 pz1Var = this.c;
                if (pz1Var == null) {
                    xi0.K("layoutResult");
                    throw null;
                }
                int iD = pz1Var.b.d(i);
                pz1 pz1Var2 = this.c;
                if (pz1Var2 == null) {
                    xi0.K("layoutResult");
                    throw null;
                }
                float f2 = pz1Var2.b.f(iD) + iRound;
                pz1 pz1Var3 = this.c;
                if (pz1Var3 == null) {
                    xi0.K("layoutResult");
                    throw null;
                }
                float f3 = pz1Var3.b.f(r0.f - 1);
                pz1 pz1Var4 = this.c;
                if (f2 < f3) {
                    if (pz1Var4 == null) {
                        xi0.K("layoutResult");
                        throw null;
                    }
                    iE = pz1Var4.b.e(f2);
                } else {
                    if (pz1Var4 == null) {
                        xi0.K("layoutResult");
                        throw null;
                    }
                    iE = pz1Var4.b.f;
                }
                return b(i, e(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.w0
    public final int[] d(int i) {
        int iE;
        if (c().length() > 0 && i > 0) {
            try {
                rl1 rl1Var = this.d;
                if (rl1Var == null) {
                    xi0.K("node");
                    throw null;
                }
                pc1 pc1VarG = rl1Var.g();
                int iRound = Math.round(pc1VarG.d - pc1VarG.b);
                int length = c().length();
                if (length <= i) {
                    i = length;
                }
                pz1 pz1Var = this.c;
                if (pz1Var == null) {
                    xi0.K("layoutResult");
                    throw null;
                }
                int iD = pz1Var.b.d(i);
                pz1 pz1Var2 = this.c;
                if (pz1Var2 == null) {
                    xi0.K("layoutResult");
                    throw null;
                }
                float f2 = pz1Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    pz1 pz1Var3 = this.c;
                    if (pz1Var3 == null) {
                        xi0.K("layoutResult");
                        throw null;
                    }
                    iE = pz1Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == c().length() && iE < iD) {
                    iE++;
                }
                return b(e(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int e(int i, ee1 ee1Var) {
        pz1 pz1Var = this.c;
        if (pz1Var == null) {
            xi0.K("layoutResult");
            throw null;
        }
        int iF = pz1Var.f(i);
        pz1 pz1Var2 = this.c;
        if (pz1Var2 == null) {
            xi0.K("layoutResult");
            throw null;
        }
        ee1 ee1VarG = pz1Var2.g(iF);
        pz1 pz1Var3 = this.c;
        if (ee1Var != ee1VarG) {
            if (pz1Var3 != null) {
                return pz1Var3.f(i);
            }
            xi0.K("layoutResult");
            throw null;
        }
        if (pz1Var3 != null) {
            return pz1Var3.b.c(i, false) - 1;
        }
        xi0.K("layoutResult");
        throw null;
    }
}
