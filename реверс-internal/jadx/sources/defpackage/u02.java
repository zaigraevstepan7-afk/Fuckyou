package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u02 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ v02 k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u02(v02 v02Var, float f, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = v02Var;
        this.l = f;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((u02) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        float f = this.l;
        v02 v02Var = this.k;
        switch (i) {
            case 0:
                return new u02(v02Var, f, ksVar, 0);
            default:
                return new u02(v02Var, f, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        Object objB;
        Object objB2;
        int i = this.i;
        t32 t32Var = t32.a;
        float f = this.l;
        wt wtVar = wt.e;
        v02 v02Var = this.k;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    h9 h9Var = v02Var.x;
                    if (h9Var != null) {
                        Float f2 = new Float(f);
                        wa waVar = v02Var.v ? iv1.f : v02Var.u;
                        this.j = 1;
                        objB = h9.b(h9Var, f2, waVar, null, null, this, 12);
                        if (objB == wtVar) {
                        }
                    }
                } else if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                    objB = obj;
                }
                break;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    h9 h9Var2 = v02Var.w;
                    if (h9Var2 != null) {
                        Float f3 = new Float(f);
                        wa waVar2 = v02Var.v ? iv1.f : v02Var.u;
                        this.j = 1;
                        objB2 = h9.b(h9Var2, f3, waVar2, null, null, this, 12);
                        if (objB2 == wtVar) {
                        }
                    }
                } else if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                    objB2 = obj;
                }
                break;
        }
        return t32Var;
    }
}
