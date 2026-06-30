package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b01 extends sk0 implements ha0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ c01 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b01(c01 c01Var, int i) {
        super(0);
        this.f = i;
        this.g = c01Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.f;
        t32 t32Var = t32.a;
        c01 c01Var = this.g;
        switch (i) {
            case 0:
                cj cjVar = c01Var.P;
                cjVar.getClass();
                c01Var.Q0(cjVar, c01Var.O);
                break;
            default:
                c01 c01Var2 = c01Var.y;
                if (c01Var2 != null) {
                    c01Var2.d1();
                }
                break;
        }
        return t32Var;
    }
}
