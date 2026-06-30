package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gq1 extends xs1 {
    public Object c;

    public gq1(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.xs1
    public final void a(xs1 xs1Var) {
        xs1Var.getClass();
        this.c = ((gq1) xs1Var).c;
    }

    @Override // defpackage.xs1
    public final xs1 b(long j) {
        return new gq1(aq1.j().g(), this.c);
    }
}
