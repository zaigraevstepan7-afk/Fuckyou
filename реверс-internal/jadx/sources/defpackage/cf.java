package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cf extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ sv0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf(sv0 sv0Var, int i, ks ksVar, int i2) {
        super(2, ksVar);
        this.i = i2;
        this.l = sv0Var;
        this.k = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((cf) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        int i2 = this.k;
        sv0 sv0Var = this.l;
        switch (i) {
            case 0:
                return new cf((sx) sv0Var, i2, ksVar, 0);
            default:
                return new cf((hn0) sv0Var, i2, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        int i = this.i;
        int i2 = this.k;
        sv0 sv0Var = this.l;
        wt wtVar = wt.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                sx sxVar = (sx) sv0Var;
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        xc.G(obj);
                    }
                    break;
                } else {
                    xc.G(obj);
                    float fG = sxVar.B.g();
                    h9 h9VarA = xi0.a(fG);
                    float f = 1.0f + fG;
                    Float f2 = new Float(fG);
                    Float f3 = new Float(f);
                    sa0 sa0Var = c2.P.a;
                    cb cbVar = (cb) sa0Var.i(f2);
                    if (cbVar == null) {
                        cbVar = h9VarA.g;
                    }
                    cb cbVar2 = (cb) sa0Var.i(f3);
                    if (cbVar2 == null) {
                        cbVar2 = h9VarA.h;
                    }
                    int iB = cbVar.b();
                    int i4 = 0;
                    for (int i5 = 0; i5 < iB; i5++) {
                        if (cbVar.a(i5) > cbVar2.a(i5)) {
                            g91.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + cbVar + " is greater than upper bound " + cbVar2 + " on index " + i5);
                        }
                    }
                    h9VarA.i = cbVar;
                    h9VarA.j = cbVar2;
                    if (!h9VarA.e()) {
                        Object objC = h9VarA.c(h9VarA.d());
                        if (!xi0.o(objC, h9VarA.d())) {
                            h9VarA.c.f.setValue(objC);
                        }
                    }
                    Float f4 = new Float(f);
                    fg0 fg0VarS = pv.s(pv.G(i2, 2, k20.b), 4);
                    bf bfVar = new bf(sxVar, i4);
                    this.j = 1;
                    if (h9.b(h9VarA, f4, fg0VarS, null, bfVar, this, 4) == wtVar) {
                    }
                }
                break;
            default:
                int i6 = this.j;
                if (i6 != 0) {
                    if (i6 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        xc.G(obj);
                    }
                    break;
                } else {
                    xc.G(obj);
                    dn0 dn0Var = ((hn0) sv0Var).t;
                    this.j = 1;
                    un0 un0Var = dn0Var.b;
                    n81 n81Var = un0.x;
                    un0Var.getClass();
                    Object objD = un0Var.d(ly0.e, new tv(un0Var, i2, (ks) null), this);
                    if (objD != wtVar) {
                        objD = t32Var;
                    }
                    if (objD != wtVar) {
                        objD = t32Var;
                    }
                    if (objD == wtVar) {
                    }
                }
                break;
        }
        return t32Var;
    }
}
