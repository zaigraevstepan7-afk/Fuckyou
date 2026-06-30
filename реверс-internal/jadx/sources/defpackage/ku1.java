package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ku1 {
    public final nu1 a;
    public em0 b;
    public final ju1 c = new ju1(this, 2);
    public final ju1 d = new ju1(this, 0);
    public final ju1 e = new ju1(this, 1);

    public ku1(nu1 nu1Var) {
        this.a = nu1Var;
    }

    public final em0 a() {
        em0 em0Var = this.b;
        if (em0Var != null) {
            return em0Var;
        }
        yc.p("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
