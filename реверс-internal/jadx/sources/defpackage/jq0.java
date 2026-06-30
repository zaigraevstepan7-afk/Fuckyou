package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq0 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;
    public final /* synthetic */ g32 h;
    public final /* synthetic */ wa0 i;

    public /* synthetic */ jq0(float f, long j, g32 g32Var, wa0 wa0Var, int i, int i2) {
        this.e = i2;
        this.f = f;
        this.g = j;
        this.h = g32Var;
        this.i = wa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = al.V(385);
                sq0.i(this.f, this.g, this.h, this.i, (ob0) obj, iV);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV2 = al.V(385);
                sq0.e(this.f, this.g, this.h, this.i, (ob0) obj, iV2);
                break;
        }
        return t32Var;
    }
}
