package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d50 extends e50 {
    public final x02 g;

    public d50(long j, x02 x02Var) {
        super(j);
        this.g = x02Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    @Override // defpackage.e50
    public final String toString() {
        return super.toString() + this.g;
    }
}
