package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bq extends nb1 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public bq(sa0 sa0Var) {
        super(new e2(9));
        this.c = new cq(sa0Var);
    }

    @Override // defpackage.nb1
    public final pb1 a(Object obj) {
        switch (this.b) {
            case 0:
                return new pb1(this, obj, obj == null, null, null, true);
            default:
                return new pb1(this, obj, obj == null, (hq1) this.c, null, true);
        }
    }

    @Override // defpackage.nb1
    public s42 b() {
        switch (this.b) {
            case 0:
                return (cq) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(ha0 ha0Var) {
        super(ha0Var);
        l91 l91Var = l91.p;
        this.c = l91Var;
    }
}
