package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht0 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ it0 f;

    public /* synthetic */ ht0(it0 it0Var, int i) {
        this.e = i;
        this.f = it0Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        it0 it0Var = this.f;
        switch (i) {
            case 0:
                it0Var.N0();
                return t32.a;
            case 1:
                return new w01(it0Var.A);
            default:
                zk0 zk0Var = (zk0) it0Var.y.getValue();
                return new w01(zk0Var != null ? zk0Var.M(0L) : 9205357640488583168L);
        }
    }
}
