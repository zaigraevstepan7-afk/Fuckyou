package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rn1 implements az {
    public final tn1 e;
    public final long f;
    public final Object g;
    public final xi h;

    public rn1(tn1 tn1Var, long j, Object obj, xi xiVar) {
        this.e = tn1Var;
        this.f = j;
        this.g = obj;
        this.h = xiVar;
    }

    @Override // defpackage.az
    public final void a() {
        tn1 tn1Var = this.e;
        synchronized (tn1Var) {
            if (this.f >= tn1Var.p()) {
                Object[] objArr = tn1Var.l;
                objArr.getClass();
                long j = this.f;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    s22.g(objArr, j, s22.k0);
                    tn1Var.j();
                }
            }
        }
    }
}
