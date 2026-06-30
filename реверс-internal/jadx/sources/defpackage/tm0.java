package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tm0 implements wa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ kn0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tm0(int i, kn0 kn0Var, Object obj) {
        this.f = kn0Var;
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj3 = this.h;
        int i2 = this.g;
        kn0 kn0Var = this.f;
        ob0 ob0Var = (ob0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    kn0Var.a(i2, obj3, ob0Var, 0);
                }
                break;
            default:
                num.getClass();
                kn0Var.a(i2, obj3, ob0Var, al.V(1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ tm0(kn0 kn0Var, int i, Object obj, int i2) {
        this.f = kn0Var;
        this.g = i;
        this.h = obj;
    }
}
