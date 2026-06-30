package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t40 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ v40 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t40(v40 v40Var, long j, int i) {
        super(1);
        this.f = i;
        this.g = v40Var;
        this.h = j;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int iOrdinal;
        int i = this.f;
        v40 v40Var = this.g;
        switch (i) {
            case 0:
                int iOrdinal2 = ((k40) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        ez1.a();
                        return null;
                    }
                    e22 e22Var = v40Var.y.a;
                }
                return new vh0(this.h);
            default:
                k40 k40Var = (k40) obj;
                if (v40Var.D != null && v40Var.N0() != null && !xi0.o(v40Var.D, v40Var.N0()) && (iOrdinal = k40Var.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        ez1.a();
                        return null;
                    }
                    e22 e22Var2 = v40Var.y.a;
                }
                return new oh0(0L);
        }
    }
}
