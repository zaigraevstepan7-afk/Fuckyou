package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f5 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f5(tv0 tv0Var, int i, int i2) {
        this.e = 0;
        this.g = tv0Var;
        this.f = i2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i5.b((tv0) obj3, (ob0) obj, al.V(1), i2);
                break;
            case 1:
                kn0 kn0Var = (kn0) obj3;
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    mi0 mi0VarA = kn0Var.b.a.a(i2);
                    ((jo) mi0VarA.c.c).n(kn0Var.c, Integer.valueOf(i2 - mi0VarA.a), ob0Var, 0);
                }
                break;
            default:
                ((Integer) obj2).intValue();
                uc1.f((x2) obj3, (ob0) obj, al.V(i2 | 1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ f5(int i, int i2, Object obj) {
        this.e = i2;
        this.g = obj;
        this.f = i;
    }
}
