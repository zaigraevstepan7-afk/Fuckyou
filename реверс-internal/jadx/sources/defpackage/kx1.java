package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx1 implements wa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ ns1 f;
    public final /* synthetic */ fx1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ d22 k;
    public final /* synthetic */ d02 l;
    public final /* synthetic */ d02 m;
    public final /* synthetic */ xa0 n;

    public /* synthetic */ kx1(ns1 ns1Var, fx1 fx1Var, boolean z, boolean z2, boolean z3, d22 d22Var, d02 d02Var, d02 d02Var2, xa0 xa0Var, int i) {
        this.f = ns1Var;
        this.g = fx1Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = d22Var;
        this.l = d02Var;
        this.m = d02Var2;
        this.n = xa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ob0Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    xc.b(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, ob0Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xc.b(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (ob0) obj, al.V(1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ kx1(c22 c22Var, fx1 fx1Var, boolean z, boolean z2, boolean z3, d22 d22Var, d02 d02Var, d02 d02Var2, xa0 xa0Var) {
        this.f = c22Var;
        this.g = fx1Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = d22Var;
        this.l = d02Var;
        this.m = d02Var2;
        this.n = xa0Var;
    }
}
