package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y7 implements wa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ y7(tv0 tv0Var, ha0 ha0Var, boolean z, int i) {
        this.h = tv0Var;
        this.i = ha0Var;
        this.f = z;
        this.g = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.g;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xi0.i((tv0) obj4, (ha0) obj3, z, (ob0) obj, al.V(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                qc1.c(z, (ee1) obj4, (ry1) obj3, (ob0) obj, al.V(i2 | 1));
                break;
        }
        return t32Var;
    }

    public /* synthetic */ y7(boolean z, ee1 ee1Var, ry1 ry1Var, int i) {
        this.f = z;
        this.h = ee1Var;
        this.i = ry1Var;
        this.g = i;
    }
}
