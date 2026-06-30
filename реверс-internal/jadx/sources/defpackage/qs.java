package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jo0 f;

    public /* synthetic */ qs(jo0 jo0Var, int i) {
        this.e = i;
        this.f = jo0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        jo0 jo0Var = this.f;
        switch (i) {
            case 0:
                zk0 zk0Var = (zk0) obj;
                qz1 qz1VarD = jo0Var.d();
                if (qz1VarD != null) {
                    qz1VarD.c = zk0Var;
                }
                return t32Var;
            case 1:
                v41 v41Var = jo0Var.t;
                az1 az1Var = (az1) obj;
                String str = az1Var.a.f;
                hb hbVar = jo0Var.j;
                if (!xi0.o(str, hbVar != null ? hbVar.f : null)) {
                    jo0Var.k.setValue(cd0.e);
                    if (((Boolean) v41Var.getValue()).booleanValue()) {
                        v41Var.setValue(Boolean.FALSE);
                    } else {
                        jo0Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = wz1.b;
                jo0Var.f(j);
                jo0Var.e(j);
                jo0Var.u.i(az1Var);
                dc1 dc1Var = jo0Var.b;
                tp tpVar = dc1Var.a;
                if (tpVar != null) {
                    tpVar.s(dc1Var, null);
                }
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                jo0Var.r.w(((cf0) obj).a);
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(jo0Var.r.w(((cf0) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                jo0Var.q.setValue(bool);
                return t32Var;
        }
    }
}
