package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe0 implements wa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ tv0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ jx0 h;
    public final /* synthetic */ jo i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ pe0(ha0 ha0Var, tv0 tv0Var, boolean z, ym1 ym1Var, me0 me0Var, jx0 jx0Var, jo joVar, int i) {
        this.k = ha0Var;
        this.f = tv0Var;
        this.g = z;
        this.l = ym1Var;
        this.m = me0Var;
        this.h = jx0Var;
        this.i = joVar;
        this.j = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.j;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = al.V(i2 | 1);
                wi0.o((ha0) obj5, this.f, this.g, (ym1) obj4, (me0) obj3, this.h, this.i, (ob0) obj, iV);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV2 = al.V(i2 | 1);
                fp1.c((hp1) obj5, this.f, this.g, (no1) obj4, this.h, this.i, (jo) obj3, (ob0) obj, iV2);
                break;
        }
        return t32Var;
    }

    public /* synthetic */ pe0(hp1 hp1Var, tv0 tv0Var, boolean z, no1 no1Var, jx0 jx0Var, jo joVar, jo joVar2, int i) {
        this.k = hp1Var;
        this.f = tv0Var;
        this.g = z;
        this.l = no1Var;
        this.h = jx0Var;
        this.i = joVar;
        this.m = joVar2;
        this.j = i;
    }
}
