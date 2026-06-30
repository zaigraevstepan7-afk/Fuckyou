package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k9 extends sk0 implements wa0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ sa0 h;
    public final /* synthetic */ jo i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(Object obj, tv0 tv0Var, sa0 sa0Var, b3 b3Var, String str, sa0 sa0Var2, jo joVar, int i) {
        super(2);
        this.g = obj;
        this.j = tv0Var;
        this.h = sa0Var;
        this.l = b3Var;
        this.m = str;
        this.k = sa0Var2;
        this.i = joVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.f;
        t32 t32Var = t32.a;
        Object obj3 = this.m;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = al.V(1597441);
                nu0.b(this.g, (tv0) obj5, this.h, (b3) obj6, (String) obj3, (sa0) obj4, this.i, (ob0) obj, iV);
                break;
            default:
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Number) obj2).intValue();
                ba baVar = (ba) obj6;
                d22 d22Var = (d22) obj5;
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    v41 v41Var = d22Var.e;
                    v41 v41Var2 = d22Var.d;
                    Object value = v41Var.getValue();
                    Object obj7 = this.g;
                    boolean zG = ob0Var.g(xi0.o(obj7, value));
                    y51 y51Var = (y51) obj4;
                    Object objK = ob0Var.K();
                    sa0 sa0Var = this.h;
                    l91 l91Var = kp.a;
                    if (zG || objK == l91Var) {
                        objK = (!xi0.o(obj7, v41Var.getValue()) || y51Var == null) ? (yr) sa0Var.i(baVar) : (yr) sa0Var.i(y51Var);
                        ob0Var.f0(objK);
                    }
                    yr yrVar = (yr) objK;
                    boolean zG2 = ob0Var.g(xi0.o(d22Var.f().c(), obj7));
                    Object objK2 = ob0Var.K();
                    if (zG2 || objK2 == l91Var) {
                        objK2 = xi0.o(d22Var.f().c(), obj7) ? j50.b : ((yr) sa0Var.i(baVar)).b;
                        ob0Var.f0(objK2);
                    }
                    j50 j50Var = (j50) objK2;
                    Object objK3 = ob0Var.K();
                    if (objK3 == l91Var) {
                        objK3 = new w9(xi0.o(obj7, v41Var2.getValue()));
                        ob0Var.f0(objK3);
                    }
                    w9 w9Var = (w9) objK3;
                    w40 w40Var = yrVar.a;
                    boolean zH = ob0Var.h(yrVar);
                    Object objK4 = ob0Var.K();
                    if (zH || objK4 == l91Var) {
                        objK4 = new m9(yrVar);
                        ob0Var.f0(objK4);
                    }
                    tv0 tv0VarY = s22.y(qv0.a, (xa0) objK4);
                    w9Var.a.setValue(Boolean.valueOf(xi0.o(obj7, v41Var2.getValue())));
                    w9Var.b.setValue(Boolean.valueOf((!xi0.o(obj7, v41Var.getValue()) || xi0.o(obj7, v41Var2.getValue()) || xi0.o(obj7, d22Var.c())) ? false : true));
                    tv0 tv0VarC = tv0VarY.c(w9Var);
                    boolean zH2 = ob0Var.h(obj7);
                    Object objK5 = ob0Var.K();
                    if (zH2 || objK5 == l91Var) {
                        objK5 = new g3(5, obj7);
                        ob0Var.f0(objK5);
                    }
                    sa0 sa0Var2 = (sa0) objK5;
                    boolean zF = ob0Var.f(j50Var);
                    Object objK6 = ob0Var.K();
                    if (zF || objK6 == l91Var) {
                        objK6 = new q(3, j50Var);
                        ob0Var.f0(objK6);
                    }
                    s22.a(d22Var, sa0Var2, tv0VarC, w40Var, j50Var, (wa0) objK6, lk.d0(1831990167, new p9((mq1) obj3, obj7, baVar, this.i), ob0Var), ob0Var, 100663296);
                }
                break;
        }
        return t32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(Object obj, d22 d22Var, y51 y51Var, sa0 sa0Var, ba baVar, mq1 mq1Var, jo joVar) {
        super(2);
        this.g = obj;
        this.j = d22Var;
        this.k = y51Var;
        this.h = sa0Var;
        this.l = baVar;
        this.m = mq1Var;
        this.i = joVar;
    }
}
