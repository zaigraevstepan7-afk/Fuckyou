package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gp extends sk0 implements wa0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ ip g;
    public final /* synthetic */ h4 h;
    public final /* synthetic */ wa0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(h4 h4Var, ip ipVar, wa0 wa0Var) {
        super(2);
        this.h = h4Var;
        this.g = ipVar;
        this.i = wa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.f;
        t32 t32Var = t32.a;
        wa0 wa0Var = this.i;
        h4 h4Var = this.h;
        ip ipVar = this.g;
        switch (i) {
            case 0:
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    ob0Var.W(866651995);
                    aq.a(h4Var, ipVar.l, wa0Var, ob0Var, 0);
                    ob0Var.p(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                ipVar.a(h4Var, wa0Var, (ob0) obj, al.V(1));
                break;
        }
        return t32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(ip ipVar, h4 h4Var, wa0 wa0Var, int i) {
        super(2);
        this.g = ipVar;
        this.h = h4Var;
        this.i = wa0Var;
    }
}
