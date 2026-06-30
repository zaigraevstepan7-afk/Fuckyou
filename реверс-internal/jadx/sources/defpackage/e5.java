package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e5 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e5(long j, c41 c41Var, jo joVar) {
        this.e = 1;
        this.f = j;
        this.g = c41Var;
        this.h = joVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i5.a((a11) obj4, (tv0) obj3, this.f, (ob0) obj, al.V(1));
                break;
            case 1:
                c41 c41Var = (c41) obj4;
                jo joVar = (jo) obj3;
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    bk.e(this.f, ((ju0) ob0Var.j(mu0.b)).b.m, lk.d0(-2115100680, new fi(i2, c41Var, joVar), ob0Var), ob0Var, 384);
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                sq0.h(this.f, (g32) obj4, (wa0) obj3, (ob0) obj, al.V(49));
                break;
            default:
                ((Integer) obj2).getClass();
                sq0.b(this.f, (g32) obj4, (jo) obj3, (ob0) obj, al.V(49));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ e5(long j, g32 g32Var, wa0 wa0Var, int i, int i2) {
        this.e = i2;
        this.f = j;
        this.g = g32Var;
        this.h = wa0Var;
    }

    public /* synthetic */ e5(a11 a11Var, tv0 tv0Var, long j, int i) {
        this.e = 0;
        this.g = a11Var;
        this.h = tv0Var;
        this.f = j;
    }
}
