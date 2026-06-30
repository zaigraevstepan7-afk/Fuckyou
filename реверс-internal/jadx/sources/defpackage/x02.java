package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x02 extends ui1 implements Runnable {
    public final long k;

    /* JADX WARN: Illegal instructions before constructor call */
    public x02(long j, y02 y02Var) {
        lt ltVar = y02Var.f;
        ltVar.getClass();
        super(y02Var, ltVar);
        this.k = j;
    }

    @Override // defpackage.vj0
    public final String X() {
        return super.X() + "(timeMillis=" + this.k + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt ltVar = this.i;
        al.y(ltVar);
        if (ltVar.l(rt.f) != null) {
            yc.d();
            return;
        }
        C(new w02("Timed out waiting for " + this.k + " ms", this));
    }
}
