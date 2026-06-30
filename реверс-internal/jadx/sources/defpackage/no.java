package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class no implements xa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ no(int i) {
        this.e = i;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        g40 g40Var = g40.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                cs csVar = (cs) obj;
                ob0 ob0Var = (ob0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ob0Var.f(csVar) ? 4 : 2;
                }
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ob0Var.Q();
                } else {
                    sg.a(xi0.p(ko1.b(xi0.E(qv0.a, 0.0f, es.g, 1).c(ko1.a), es.f), csVar.c, pv.w), ob0Var, 0);
                }
                break;
            case 1:
                xu0 xu0Var = (xu0) obj;
                int iN = xu0Var.N(10.0f);
                int i2 = iN * 2;
                z61 z61VarE = ((pu0) obj2).e(lr.i(i2, 0, ((kr) obj3).a));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                xu0 xu0Var2 = (xu0) obj;
                int iN2 = xu0Var2.N(10.0f);
                int i3 = iN2 * 2;
                z61 z61VarE2 = ((pu0) obj2).e(lr.i(0, i3, ((kr) obj3).a));
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ob0 ob0Var2 = (ob0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ug1) obj).getClass();
                if (!ob0Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ob0Var2.Q();
                } else {
                    mz1.b("Close", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var2, 6, 0, 262142);
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ob0 ob0Var3 = (ob0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ug1) obj).getClass();
                if (!ob0Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ob0Var3.Q();
                } else {
                    mz1.b("Cancel", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var3, 6, 0, 262142);
                }
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ob0 ob0Var4 = (ob0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ug1) obj).getClass();
                if (!ob0Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ob0Var4.Q();
                } else {
                    mz1.b("Save", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var4, 6, 0, 262142);
                }
                break;
            default:
                ((Integer) obj3).getClass();
                s22.c.h((ob0) obj2, 0);
                break;
        }
        return t32Var;
    }
}
