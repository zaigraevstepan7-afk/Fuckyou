package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 implements ns1 {
    public Float e;
    public Float f;
    public final v41 g;
    public yv1 h;
    public boolean i;
    public boolean j;
    public long k;
    public final /* synthetic */ ig0 l;

    public gg0(ig0 ig0Var, Float f, Float f2, fg0 fg0Var) {
        this.l = ig0Var;
        this.e = f;
        this.f = f2;
        this.g = xc.B(f);
        this.h = new yv1(fg0Var, c2.P, this.e, this.f, null);
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        return this.g.getValue();
    }
}
