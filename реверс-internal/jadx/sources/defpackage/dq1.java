package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 extends xs1 {
    public int c;

    public dq1(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.xs1
    public final void a(xs1 xs1Var) {
        xs1Var.getClass();
        this.c = ((dq1) xs1Var).c;
    }

    @Override // defpackage.xs1
    public final xs1 b(long j) {
        return new dq1(this.c, j);
    }
}
