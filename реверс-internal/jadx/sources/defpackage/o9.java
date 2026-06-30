package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o9 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sa0
    public final Object i(Object obj) throws Throwable {
        o10 o10Var;
        int i = this.f;
        boolean zBooleanValue = false;
        Object[] objArr = 0;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                return new n9((mq1) obj4, obj3, (ba) obj2, objArr == true ? 1 : 0);
            case 1:
                i22 i22Var = (i22) obj;
                a00 a00Var = (a00) i22Var;
                if (!((r5) ((h4) bl.Q((a00) obj3)).m1912getDragAndDropManager()).b.contains(a00Var) || !hk.f(a00Var, lk.R((qt0) obj2))) {
                    return h22.e;
                }
                ((zc1) obj4).e = i22Var;
                return h22.g;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                w80 w80Var = (w80) obj;
                if (!xi0.o(w80Var, (w80) obj4)) {
                    if (xi0.o(w80Var, ((m80) obj3).c)) {
                        yc.l("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((sa0) obj2).i(w80Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                p10 p10Var = (p10) obj;
                sl0 sl0Var = (sl0) obj4;
                ej ejVar = sl0Var.e;
                o10 o10Var2 = sl0Var.f;
                sl0Var.f = (o10) obj3;
                try {
                    hx hxVarK = p10Var.E().k();
                    al0 al0VarO = p10Var.E().o();
                    cj cjVarI = p10Var.E().i();
                    long jQ = p10Var.E().q();
                    nc0 nc0Var = (nc0) p10Var.E().b;
                    sa0 sa0Var = (sa0) obj2;
                    hx hxVarK2 = ejVar.f.k();
                    al0 al0VarO2 = ejVar.f.o();
                    cj cjVarI2 = ejVar.f.i();
                    long jQ2 = ejVar.f.q();
                    oc ocVar = ejVar.f;
                    try {
                        nc0 nc0Var2 = (nc0) ocVar.b;
                        ocVar.z(hxVarK);
                        ocVar.A(al0VarO);
                        ocVar.y(cjVarI);
                        ocVar.B(jQ);
                        ocVar.b = nc0Var;
                        cjVarI.l();
                        try {
                            sa0Var.i(sl0Var);
                            cjVarI.i();
                            oc ocVar2 = ejVar.f;
                            ocVar2.z(hxVarK2);
                            ocVar2.A(al0VarO2);
                            ocVar2.y(cjVarI2);
                            ocVar2.B(jQ2);
                            ocVar2.b = nc0Var2;
                            sl0Var.f = o10Var2;
                            return t32.a;
                        } catch (Throwable th) {
                            o10Var = o10Var2;
                            try {
                                cjVarI.i();
                                oc ocVar3 = ejVar.f;
                                ocVar3.z(hxVarK2);
                                ocVar3.A(al0VarO2);
                                ocVar3.y(cjVarI2);
                                ocVar3.B(jQ2);
                                ocVar3.b = nc0Var2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                sl0Var.f = o10Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        o10Var = o10Var2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    o10Var = o10Var2;
                }
                break;
        }
    }
}
