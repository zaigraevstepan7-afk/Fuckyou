package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ss1 extends xs1 {
    public f0 c;
    public int d;
    public int e;

    public ss1(long j, f0 f0Var) {
        super(j);
        this.c = f0Var;
    }

    @Override // defpackage.xs1
    public final void a(xs1 xs1Var) {
        synchronized (wi0.G) {
            xs1Var.getClass();
            this.c = ((ss1) xs1Var).c;
            this.d = ((ss1) xs1Var).d;
            this.e = ((ss1) xs1Var).e;
        }
    }

    @Override // defpackage.xs1
    public final xs1 b(long j) {
        return new ss1(j, this.c);
    }
}
