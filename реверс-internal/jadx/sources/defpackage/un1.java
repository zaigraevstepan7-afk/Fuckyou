package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class un1 extends q0 {
    public long a;
    public xi b;

    @Override // defpackage.q0
    public final boolean a(p0 p0Var) {
        tn1 tn1Var = (tn1) p0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = tn1Var.m;
        if (j < tn1Var.n) {
            tn1Var.n = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.q0
    public final ks[] b(p0 p0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((tn1) p0Var).w(j);
    }
}
