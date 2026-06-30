package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class oj1 {
    public static final fi1 a = new fi1(5);
    public static final lj1 b = new lj1();
    public static final ky c = new ky(1);
    public static final mj1 d = new mj1();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(bk1 bk1Var, long j, ls lsVar) {
        nj1 nj1Var;
        wc1 wc1Var;
        bk1 bk1Var2;
        if (lsVar instanceof nj1) {
            nj1Var = (nj1) lsVar;
            int i = nj1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj1Var.k = i - Integer.MIN_VALUE;
            } else {
                nj1Var = new nj1(lsVar);
            }
        }
        Object obj = nj1Var.j;
        int i2 = nj1Var.k;
        if (i2 == 0) {
            xc.G(obj);
            wc1Var = new wc1();
            h hVar = new h(bk1Var, j, wc1Var, (ks) null, 2);
            nj1Var.h = bk1Var;
            nj1Var.i = wc1Var;
            nj1Var.k = 1;
            Object objG = bk1Var.g(ly0.e, hVar, nj1Var);
            wt wtVar = wt.e;
            if (objG == wtVar) {
                return wtVar;
            }
            bk1Var2 = bk1Var;
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wc1 wc1Var2 = nj1Var.i;
            bk1 bk1Var3 = nj1Var.h;
            xc.G(obj);
            wc1Var = wc1Var2;
            bk1Var2 = bk1Var3;
        }
        return new w01(bk1Var2.i(wc1Var.e));
    }

    public static tv0 b(jy1 jy1Var, k31 k31Var, boolean z, boolean z2, jx0 jx0Var) {
        return new kj1(jy1Var, k31Var, z, z2, jx0Var);
    }
}
