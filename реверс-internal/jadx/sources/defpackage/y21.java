package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y21 extends d31 {
    public static final y21 c = new y21(1, 0, 2);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        int iD = llVar.d(0);
        int i = mp1Var.v;
        int iN = mp1Var.N(mp1Var.b, mp1Var.r(i));
        int iG = mp1Var.g(mp1Var.b, mp1Var.r(i + 1));
        for (int iMax = Math.max(iN, iG - iD); iMax < iG; iMax++) {
            Object obj = mp1Var.c[mp1Var.h(iMax)];
            if (obj instanceof sb0) {
                hd1Var.e((sb0) obj);
            } else if (obj instanceof dc1) {
                ((dc1) obj).c();
            }
        }
        if (iD <= 0) {
            mp.a("Check failed");
        }
        int i2 = mp1Var.v;
        int iN2 = mp1Var.N(mp1Var.b, mp1Var.r(i2));
        int iG2 = mp1Var.g(mp1Var.b, mp1Var.r(i2 + 1)) - iD;
        if (iG2 < iN2) {
            mp.a("Check failed");
        }
        mp1Var.J(iG2, iD, i2);
        int i3 = mp1Var.i;
        if (i3 >= iN2) {
            mp1Var.i = i3 - iD;
        }
    }
}
