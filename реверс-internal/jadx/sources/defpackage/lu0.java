package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lu0 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ lu0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.f = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.f;
        Object obj3 = this.k;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mu0.b((bm) obj5, (iw0) obj4, (pn1) this.i, (f32) this.j, (jo) obj3, (ob0) obj, al.V(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iV = al.V(i2 | 1);
                kd1.b((d22) obj5, (c22) obj4, this.i, this.j, (p60) obj3, (ob0) obj, iV);
                break;
        }
        return t32Var;
    }
}
