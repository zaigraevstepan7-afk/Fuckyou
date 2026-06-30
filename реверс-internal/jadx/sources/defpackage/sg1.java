package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class sg1 {
    public static final tg1 a = new tg1(pv.b, v20.o);

    public static final tg1 a(bd bdVar, a3 a3Var, ob0 ob0Var, int i) {
        if (bdVar.equals(pv.b) && xi0.o(a3Var, v20.o)) {
            ob0Var.W(-1073830487);
            ob0Var.p(false);
            return a;
        }
        ob0Var.W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ob0Var.f(bdVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ob0Var.f(a3Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = ob0Var.K();
        if (z3 || objK == kp.a) {
            objK = new tg1(bdVar, a3Var);
            ob0Var.f0(objK);
        }
        tg1 tg1Var = (tg1) objK;
        ob0Var.p(false);
        return tg1Var;
    }
}
