package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n21 extends d31 {
    public static final n21 c = new n21(0, 3, 1);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        xg0 xg0Var;
        jp1 jp1Var = (jp1) llVar.e(1);
        jb0 jb0Var = (jb0) llVar.e(0);
        s60 s60Var = (s60) llVar.e(2);
        mp1 mp1VarE = jp1Var.e();
        if (e31Var != null) {
            try {
                xg0Var = new xg0(28, e31Var, mp1Var);
            } catch (Throwable th) {
                mp1VarE.e(false);
                throw th;
            }
        } else {
            xg0Var = null;
        }
        if (!s60Var.e.a0()) {
            mp.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        s60Var.d.Z(vcVar, mp1VarE, hd1Var, xg0Var);
        mp1VarE.e(true);
        mp1Var.d();
        jb0Var.getClass();
        mp1Var.A(jp1Var, jp1Var.a(jb0Var));
        mp1Var.k();
    }
}
