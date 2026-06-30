package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d21 extends d31 {
    public static final d21 c = new d21(0, 2, 1);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        int i;
        th0 th0Var = (th0) llVar.e(0);
        int iC = mp1Var.c((jb0) llVar.e(1));
        if (mp1Var.t >= iC) {
            mp.a("Check failed");
        }
        xk.F(mp1Var, vcVar, iC);
        int i2 = mp1Var.t;
        int iE = mp1Var.v;
        while (iE >= 0 && !mp1Var.y(iE)) {
            iE = mp1Var.E(mp1Var.b, iE);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i2) {
            if (mp1Var.v(i2, iU)) {
                if (mp1Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += mp1Var.y(iU) ? 1 : mp1Var.b[(mp1Var.r(iU) * 5) + 1] & 67108863;
                iU += mp1Var.u(iU);
            }
        }
        while (true) {
            i = mp1Var.t;
            if (i >= iC) {
                break;
            }
            if (mp1Var.v(iC, i)) {
                int i3 = mp1Var.t;
                if (i3 < mp1Var.u && (mp1Var.b[(mp1Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    vcVar.d(mp1Var.D(mp1Var.t));
                    iL = 0;
                }
                mp1Var.P();
            } else {
                iL += mp1Var.L();
            }
        }
        if (i != iC) {
            mp.a("Check failed");
        }
        th0Var.a = iL;
    }
}
