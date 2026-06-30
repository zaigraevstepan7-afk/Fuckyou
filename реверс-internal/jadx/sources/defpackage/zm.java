package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class zm {
    public static final bn a = new bn(pv.d, v20.q);

    public static final bn a(dd ddVar, sf sfVar, ob0 ob0Var, int i) {
        if (ddVar.equals(pv.d) && sfVar.equals(v20.q)) {
            ob0Var.W(-1446604504);
            ob0Var.p(false);
            return a;
        }
        ob0Var.W(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ob0Var.f(ddVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ob0Var.f(sfVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = ob0Var.K();
        if (z3 || objK == kp.a) {
            objK = new bn(ddVar, sfVar);
            ob0Var.f0(objK);
        }
        bn bnVar = (bn) objK;
        ob0Var.p(false);
        return bnVar;
    }
}
