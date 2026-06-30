package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cq1 extends xs1 {
    public float c;

    public cq1(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.xs1
    public final void a(xs1 xs1Var) {
        xs1Var.getClass();
        this.c = ((cq1) xs1Var).c;
    }

    @Override // defpackage.xs1
    public final xs1 b(long j) {
        return new cq1(this.c, j);
    }
}
