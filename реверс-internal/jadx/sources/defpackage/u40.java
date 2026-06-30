package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u40 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ v40 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(v40 v40Var, long j) {
        super(1);
        this.f = 0;
        this.g = v40Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        long j;
        int i = this.f;
        gr1 gr1Var = null;
        k40 k40Var = k40.f;
        k40 k40Var2 = k40.e;
        k40 k40Var3 = k40.g;
        v40 v40Var = this.g;
        switch (i) {
            case 0:
                k40 k40Var4 = (k40) obj;
                if (k40Var4 == k40Var3) {
                    e22 e22Var = v40Var.y.a;
                    j = v40Var.z.i;
                } else {
                    e22 e22Var2 = v40Var.y.a;
                    int iOrdinal = k40Var4.ordinal();
                    if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                        ez1.a();
                        return null;
                    }
                    j = 0;
                }
                return new oh0(j);
            case 1:
                a22 a22Var = (a22) obj;
                if (!a22Var.a(k40Var2, k40Var)) {
                    if (a22Var.a(k40Var, k40Var3)) {
                        e22 e22Var3 = v40Var.y.a;
                    } else {
                        gr1Var = r40.e;
                    }
                }
                return gr1Var == null ? r40.e : gr1Var;
            default:
                a22 a22Var2 = (a22) obj;
                if (a22Var2.a(k40Var2, k40Var)) {
                    return r40.d;
                }
                if (!a22Var2.a(k40Var, k40Var3)) {
                    return r40.d;
                }
                e22 e22Var4 = v40Var.y.a;
                return r40.d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u40(v40 v40Var, int i) {
        super(1);
        this.f = i;
        this.g = v40Var;
    }
}
