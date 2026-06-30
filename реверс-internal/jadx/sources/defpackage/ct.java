package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ et f;

    public /* synthetic */ ct(et etVar, int i) {
        this.e = i;
        this.f = etVar;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        t32 t32Var = t32.a;
        et etVar = this.f;
        switch (i) {
            case 0:
                bl.M(etVar);
                return t32Var;
            case 1:
                etVar.z.h(true);
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                etVar.z.d(true);
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                etVar.z.f();
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                bl.M(etVar);
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                etVar.z.p();
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                qs qsVar = etVar.w.w;
                qsVar.f.r.w(etVar.A.e);
                break;
            default:
                jo0 jo0Var = etVar.w;
                o80 o80Var = etVar.B;
                if (jo0Var.b()) {
                    rq1 rq1Var = jo0Var.c;
                    if (rq1Var != null) {
                        ((zw) rq1Var).b();
                    }
                } else {
                    o80.a(o80Var);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
