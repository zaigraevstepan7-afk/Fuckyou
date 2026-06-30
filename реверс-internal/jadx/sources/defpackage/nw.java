package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nw implements vj1 {
    public final sa0 a;
    public final mw b = new mw(this);
    public final qy0 c = new qy0();
    public final v41 d;
    public final v41 e;
    public final v41 f;

    public nw(sa0 sa0Var) {
        this.a = sa0Var;
        Boolean bool = Boolean.FALSE;
        this.d = xc.B(bool);
        this.e = xc.B(bool);
        this.f = xc.B(bool);
    }

    @Override // defpackage.vj1
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.vj1
    public final Object d(ly0 ly0Var, wa0 wa0Var, ls lsVar) {
        Object objR = bl.r(new g(this, ly0Var, wa0Var, null, 7), lsVar);
        return objR == wt.e ? objR : t32.a;
    }

    @Override // defpackage.vj1
    public final float e(float f) {
        return ((Number) this.a.i(Float.valueOf(f))).floatValue();
    }
}
