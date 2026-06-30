package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk1 implements wa0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ wa0 f;
    public final /* synthetic */ jo g;
    public final /* synthetic */ c41 h;

    public /* synthetic */ mk1(wa0 wa0Var, jo joVar, c41 c41Var) {
        this.f = wa0Var;
        this.g = joVar;
        this.h = c41Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        c41 c41Var = this.h;
        jo joVar = this.g;
        wa0 wa0Var = this.f;
        ob0 ob0Var = (ob0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                pd1.c(wa0Var, joVar, c41Var, ob0Var, al.V(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    pd1.c(wa0Var, joVar, c41Var, ob0Var, 0);
                }
                break;
        }
        return t32Var;
    }

    public /* synthetic */ mk1(wa0 wa0Var, jo joVar, c41 c41Var, int i) {
        this.f = wa0Var;
        this.g = joVar;
        this.h = c41Var;
    }
}
