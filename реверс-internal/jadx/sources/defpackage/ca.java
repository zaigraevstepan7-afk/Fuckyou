package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ca extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ea k;
    public final /* synthetic */ kg1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca(ea eaVar, kg1 kg1Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = eaVar;
        this.l = kg1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((ca) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                return new ca(this.k, this.l, ksVar, 0);
            case 1:
                return new ca(this.k, this.l, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new ca(this.k, this.l, ksVar, 2);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new ca(this.k, this.l, ksVar, 3);
            default:
                return new ca(this.k, this.l, ksVar, 4);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        Object objB;
        Object objB2;
        Object objB3;
        Object objB4;
        int i = this.i;
        t32 t32Var = t32.a;
        kg1 kg1Var = this.l;
        ea eaVar = this.k;
        wt wtVar = wt.e;
        ks ksVar = null;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    h9 h9Var = eaVar.e;
                    if (h9Var == null) {
                        return t32Var;
                    }
                    Float f = new Float(kg1Var.a.a(eaVar.c, eaVar.d));
                    p60 p60Var = eaVar.b;
                    this.j = 1;
                    objB = h9.b(h9Var, f, p60Var, null, null, this, 12);
                    if (objB == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i2 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    objB = obj;
                }
                return t32Var;
            case 1:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    h9 h9Var2 = eaVar.f;
                    if (h9Var2 == null) {
                        return t32Var;
                    }
                    Float f2 = new Float(kg1Var.b.a(eaVar.c, eaVar.d));
                    p60 p60Var2 = eaVar.b;
                    this.j = 1;
                    objB2 = h9.b(h9Var2, f2, p60Var2, null, null, this, 12);
                    if (objB2 == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i3 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    objB2 = obj;
                }
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    h9 h9Var3 = eaVar.g;
                    if (h9Var3 == null) {
                        return t32Var;
                    }
                    Float f3 = new Float(kg1Var.d.a(eaVar.c, eaVar.d));
                    p60 p60Var3 = eaVar.b;
                    this.j = 1;
                    objB3 = h9.b(h9Var3, f3, p60Var3, null, null, this, 12);
                    if (objB3 == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i4 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    objB3 = obj;
                }
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                int i5 = this.j;
                if (i5 == 0) {
                    xc.G(obj);
                    h9 h9Var4 = eaVar.h;
                    if (h9Var4 == null) {
                        return t32Var;
                    }
                    Float f4 = new Float(kg1Var.c.a(eaVar.c, eaVar.d));
                    p60 p60Var4 = eaVar.b;
                    this.j = 1;
                    objB4 = h9.b(h9Var4, f4, p60Var4, null, null, this, 12);
                    if (objB4 == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i5 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    objB4 = obj;
                }
                return t32Var;
            default:
                int i6 = this.j;
                if (i6 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    eaVar.getClass();
                    return bl.r(new da(eaVar, kg1Var, ksVar, 0), this) == wtVar ? wtVar : t32Var;
                }
                if (i6 == 1) {
                    xc.G(obj);
                    return t32Var;
                }
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
