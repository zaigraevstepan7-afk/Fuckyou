package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ho implements wa0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ int f;
    public final /* synthetic */ jo g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ho(int i, wa0 wa0Var, jo joVar, wa0 wa0Var2, wa0 wa0Var3, ky0 ky0Var, wa0 wa0Var4) {
        this.f = i;
        this.h = wa0Var;
        this.g = joVar;
        this.i = wa0Var2;
        this.j = wa0Var3;
        this.k = ky0Var;
        this.l = wa0Var4;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        t32 t32Var = t32.a;
        Object obj7 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                this.g.k(this.h, (Boolean) obj7, this.i, this.j, this.k, (ob0) obj, al.V(this.f) | 1);
                break;
            case 1:
                wa0 wa0Var = (wa0) obj6;
                wa0 wa0Var2 = (wa0) obj5;
                wa0 wa0Var3 = (wa0) obj4;
                ky0 ky0Var = (ky0) obj3;
                wa0 wa0Var4 = (wa0) obj7;
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    af1.c(this.f, wa0Var, this.g, wa0Var2, wa0Var3, ky0Var, wa0Var4, ob0Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                af1.c(this.f, (wa0) obj6, this.g, (wa0) obj5, (wa0) obj4, (k72) obj3, (wa0) obj7, (ob0) obj, al.V(1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ ho(int i, wa0 wa0Var, jo joVar, wa0 wa0Var2, wa0 wa0Var3, k72 k72Var, wa0 wa0Var4, int i2) {
        this.f = i;
        this.h = wa0Var;
        this.g = joVar;
        this.i = wa0Var2;
        this.j = wa0Var3;
        this.k = k72Var;
        this.l = wa0Var4;
    }

    public /* synthetic */ ho(jo joVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.g = joVar;
        this.h = obj;
        this.l = bool;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.f = i;
    }
}
