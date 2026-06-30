package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh0 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ nr f;

    public /* synthetic */ fh0(nr nrVar, int i) {
        this.e = i;
        this.f = nrVar;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        nr nrVar = this.f;
        i22 i22Var = (i22) obj;
        switch (i) {
            case 0:
                i22Var.getClass();
                nr nrVar2 = (nr) i22Var;
                k72 k72Var = nrVar.t;
                if (!xi0.o(nrVar2.s, k72Var)) {
                    nrVar2.s = k72Var;
                    nrVar2.u.i(k72Var);
                    nrVar2.t = k72Var;
                    pd1.v(nrVar2, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new fh0(nrVar2, 0));
                }
                return h22.f;
            default:
                i22Var.getClass();
                nrVar.s = ((nr) i22Var).t;
                return Boolean.FALSE;
        }
    }
}
