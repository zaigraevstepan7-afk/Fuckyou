package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ts0 extends sk0 implements ha0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts0(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.f;
        t32 t32Var = t32.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                wa0 wa0Var = (wa0) obj3;
                ws0 ws0Var = (ws0) ((zc1) obj2).e;
                xd0 xd0Var = (xd0) obj;
                zx0 zx0Var = ws0Var.q;
                if (zx0Var == null) {
                    long[] jArr = pi1.a;
                    zx0Var = new zx0();
                    ws0Var.q = zx0Var;
                }
                Object objG = zx0Var.g(xd0Var);
                if (objG == null) {
                    objG = new rs0(ws0Var);
                    zx0Var.m(xd0Var, objG);
                }
                rs0 rs0Var = (rs0) objG;
                rs0Var.e = false;
                wa0Var.h(rs0Var, xd0Var);
                break;
            default:
                r rVar = (r) obj3;
                rVar.removeOnAttachStateChangeListener((d6) obj2);
                bl.B(rVar).a.remove((ez1) obj);
                break;
        }
        return t32Var;
    }
}
