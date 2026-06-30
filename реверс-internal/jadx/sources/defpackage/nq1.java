package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nq1 extends xs1 {
    public c61 c;
    public int d;

    public nq1(long j, c61 c61Var) {
        super(j);
        this.c = c61Var;
    }

    @Override // defpackage.xs1
    public final void a(xs1 xs1Var) {
        xs1Var.getClass();
        nq1 nq1Var = (nq1) xs1Var;
        synchronized (xi0.z) {
            this.c = nq1Var.c;
            this.d = nq1Var.d;
        }
    }

    @Override // defpackage.xs1
    public final xs1 b(long j) {
        return new nq1(j, this.c);
    }
}
