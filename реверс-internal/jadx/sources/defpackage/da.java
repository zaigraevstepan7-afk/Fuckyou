package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class da extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da(Object obj, Object obj2, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = obj;
        this.k = obj2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((da) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                da daVar = new da((ea) this.l, (kg1) this.k, ksVar, 0);
                daVar.j = obj;
                return daVar;
            case 1:
                da daVar2 = new da((ka) this.l, (kg1) this.k, ksVar, 1);
                daVar2.j = obj;
                return daVar2;
            default:
                da daVar3 = new da((q81) this.l, (ex1) this.k, ksVar, 2);
                daVar3.j = obj;
                return daVar3;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        int i2 = 2;
        Object obj2 = this.k;
        Object obj3 = this.l;
        ks ksVar = null;
        int i3 = 3;
        int i4 = 1;
        switch (i) {
            case 0:
                xc.G(obj);
                vt vtVar = (vt) this.j;
                ea eaVar = (ea) obj3;
                kg1 kg1Var = (kg1) obj2;
                nu0.A(vtVar, null, null, new ca(eaVar, kg1Var, ksVar, 0), 3);
                nu0.A(vtVar, null, null, new ca(eaVar, kg1Var, ksVar, i4), 3);
                nu0.A(vtVar, null, null, new ca(eaVar, kg1Var, ksVar, i2), 3);
                return nu0.A(vtVar, null, null, new ca(eaVar, kg1Var, ksVar, i3), 3);
            case 1:
                xc.G(obj);
                vt vtVar2 = (vt) this.j;
                ka kaVar = (ka) obj3;
                kg1 kg1Var2 = (kg1) obj2;
                nu0.A(vtVar2, null, null, new ia(kaVar, kg1Var2, ksVar, i4), 3);
                nu0.A(vtVar2, null, null, new ia(kaVar, kg1Var2, ksVar, i2), 3);
                nu0.A(vtVar2, null, null, new ia(kaVar, kg1Var2, ksVar, i3), 3);
                return nu0.A(vtVar2, null, null, new ia(kaVar, kg1Var2, ksVar, 4), 3);
            default:
                xc.G(obj);
                vt vtVar3 = (vt) this.j;
                q81 q81Var = (q81) obj3;
                ex1 ex1Var = (ex1) obj2;
                ys ysVar = new ys(q81Var, ex1Var, ksVar, i4);
                yt ytVar = yt.h;
                nu0.A(vtVar3, null, ytVar, ysVar, 1);
                return nu0.A(vtVar3, null, ytVar, new ys(q81Var, ex1Var, ksVar, i2), 1);
        }
    }
}
