package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y11 extends d31 {
    public static final y11 c = new y11(0, 2, 1);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        jb0 jb0Var = (jb0) llVar.e(0);
        Object objE = llVar.e(1);
        if (objE instanceof sb0) {
            sb0 sb0Var = (sb0) objE;
            hd1Var.e.b(sb0Var);
            hd1Var.d.a(sb0Var);
        }
        if (mp1Var.n != 0) {
            mp.a("Can only append a slot if not current inserting");
        }
        int i = mp1Var.i;
        int i2 = mp1Var.j;
        int iC = mp1Var.c(jb0Var);
        int iG = mp1Var.g(mp1Var.b, mp1Var.r(iC + 1));
        mp1Var.i = iG;
        mp1Var.j = iG;
        mp1Var.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        mp1Var.c[iG] = objE;
        mp1Var.i = i;
        mp1Var.j = i2;
    }
}
