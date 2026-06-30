package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 extends zu1 implements wa0 {
    public final /* synthetic */ int i = 1;
    public float j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf1(q7 q7Var, float f, wa waVar, ks ksVar) {
        super(2, ksVar);
        this.l = q7Var;
        this.j = f;
        this.m = waVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((lf1) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new lf1((q7) this.l, this.j, (wa) obj2, ksVar);
            default:
                lf1 lf1Var = new lf1((d22) obj2, ksVar);
                lf1Var.l = obj;
                return lf1Var;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        float fL;
        vt vtVar;
        int i = this.i;
        t32 t32Var = t32.a;
        Object obj2 = this.m;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    xc.G(obj);
                    this.k = 1;
                    if (h9.b(((q7) this.l).B, new Float(this.j), (wa) obj2, null, null, this, 12) == wtVar) {
                    }
                } else if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    xc.G(obj);
                    vt vtVar2 = (vt) this.l;
                    fL = kd1.l(vtVar2.f());
                    vtVar = vtVar2;
                } else if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fL = this.j;
                    vtVar = (vt) this.l;
                    xc.G(obj);
                }
                while (bl.G(vtVar)) {
                    t00 t00Var = new t00((d22) obj2, fL);
                    this.l = vtVar;
                    this.j = fL;
                    this.k = 1;
                    lt ltVar = this.f;
                    ltVar.getClass();
                    if (al.z(ltVar).c(t00Var, this) == wtVar) {
                        break;
                    }
                }
                break;
        }
        return wtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf1(d22 d22Var, ks ksVar) {
        super(2, ksVar);
        this.m = d22Var;
    }
}
