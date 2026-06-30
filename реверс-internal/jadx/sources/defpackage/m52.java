package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m52 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ n52 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m52(n52 n52Var, int i) {
        super(1);
        this.f = i;
        this.g = n52Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        long j;
        int i = this.f;
        n52 n52Var = this.g;
        switch (i) {
            case 0:
                a22 a22Var = (a22) obj;
                k40 k40Var = k40.e;
                k40 k40Var2 = k40.f;
                if (a22Var.a(k40Var, k40Var2)) {
                    e22 e22Var = n52Var.t.a;
                    return r40.c;
                }
                if (!a22Var.a(k40Var2, k40.g)) {
                    return r40.c;
                }
                e22 e22Var2 = n52Var.u.a;
                return r40.c;
            default:
                int iOrdinal = ((k40) obj).ordinal();
                if (iOrdinal == 0) {
                    e22 e22Var3 = n52Var.t.a;
                    j = vl.f;
                } else if (iOrdinal == 1) {
                    e22 e22Var4 = n52Var.t.a;
                    e22 e22Var5 = n52Var.u.a;
                    j = vl.f;
                } else {
                    if (iOrdinal != 2) {
                        ez1.a();
                        return null;
                    }
                    e22 e22Var6 = n52Var.u.a;
                    j = n52Var.v.e;
                }
                return new vl(j);
        }
    }
}
