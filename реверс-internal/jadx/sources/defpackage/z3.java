package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z3 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ zc1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(int i, zc1 zc1Var) {
        super(1);
        this.f = i;
        this.g = zc1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        boolean z;
        int i = this.f;
        zc1 zc1Var = this.g;
        switch (i) {
            case 0:
                zc1Var.e = (w80) obj;
                return Boolean.TRUE;
            case 1:
                be0 be0Var = (be0) obj;
                Object obj2 = zc1Var.e;
                if (obj2 == null && be0Var.u) {
                    zc1Var.e = be0Var;
                } else if (obj2 != null) {
                    be0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                Object obj3 = (i22) obj;
                if (((sv0) obj3).e.r) {
                    zc1Var.e = obj3;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
