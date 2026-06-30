package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg implements sa0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ z61 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ tg(z61 z61Var, int i, int i2, z61 z61Var2, xc1 xc1Var, xc1 xc1Var2) {
        this.f = z61Var;
        this.g = i;
        this.h = i2;
        this.i = z61Var2;
        this.j = xc1Var;
        this.k = xc1Var2;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                al0 layoutDirection = ((xu0) obj3).getLayoutDirection();
                uf ufVar = ((ug) obj2).a;
                sg.b((y61) obj, this.f, (pu0) obj4, layoutDirection, this.g, this.h, ufVar);
                break;
            default:
                y61 y61Var = (y61) obj;
                y61.j(y61Var, this.f, this.g, this.h);
                y61.j(y61Var, (z61) obj4, ((xc1) obj3).e, ((xc1) obj2).e);
                break;
        }
        return t32Var;
    }

    public /* synthetic */ tg(z61 z61Var, pu0 pu0Var, xu0 xu0Var, int i, int i2, ug ugVar) {
        this.f = z61Var;
        this.i = pu0Var;
        this.j = xu0Var;
        this.g = i;
        this.h = i2;
        this.k = ugVar;
    }
}
