package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e8 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l8 f;
    public final /* synthetic */ lw1 g;

    public /* synthetic */ e8(l8 l8Var, lw1 lw1Var, int i) {
        this.e = i;
        this.f = l8Var;
        this.g = lw1Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        int i2 = 0;
        lw1 lw1Var = this.g;
        l8 l8Var = this.f;
        switch (i) {
            case 0:
                d8 d8Var = l8Var.f;
                p7 p7Var = new p7(1, lw1Var);
                zc1 zc1Var = new zc1();
                l8Var.e.c("dataBuilder", d8Var, new f8(i2, zc1Var, p7Var));
                Object obj = zc1Var.e;
                if (obj != null) {
                    return (kw1) obj;
                }
                xi0.K("result");
                throw null;
            case 1:
                d8 d8Var2 = l8Var.g;
                e8 e8Var = new e8(l8Var, lw1Var, 2);
                zc1 zc1Var2 = new zc1();
                l8Var.e.c("positioner", d8Var2, new f8(i2, zc1Var2, e8Var));
                Object obj2 = zc1Var2.e;
                if (obj2 != null) {
                    return (pc1) obj2;
                }
                xi0.K("result");
                throw null;
            default:
                Object objA = l8Var.c.a();
                zk0 zk0Var = (zk0) (((zk0) objA).B() ? objA : null);
                return zk0Var == null ? pc1.e : lw1Var.m(zk0Var).i(zk0Var.M(0L));
        }
    }
}
