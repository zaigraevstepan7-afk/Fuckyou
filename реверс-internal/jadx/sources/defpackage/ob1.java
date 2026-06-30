package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob1 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ d02 g;
    public final /* synthetic */ wa0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ ob1(long j, d02 d02Var, wa0 wa0Var, int i, int i2) {
        this.e = i2;
        this.f = j;
        this.g = d02Var;
        this.h = wa0Var;
        this.i = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = al.V(i2 | 1);
                bk.e(this.f, this.g, this.h, (ob0) obj, iV);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV2 = al.V(i2 | 1);
                xc.c(this.f, this.g, this.h, (ob0) obj, iV2);
                break;
        }
        return t32Var;
    }
}
