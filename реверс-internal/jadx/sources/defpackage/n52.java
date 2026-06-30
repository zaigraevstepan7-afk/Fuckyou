package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n52 extends sv0 implements o10 {
    public z12 s;
    public w40 t;
    public j50 u;
    public vn1 v;

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        sl0Var.a();
        z12 z12Var = this.s;
        m52 m52Var = new m52(this, 0);
        vn1 vn1Var = this.v;
        y12 y12VarA = z12Var.a(m52Var, vn1Var.a() ? new vl(vn1Var.e) : null, null, new m52(this, 1));
        vn1 vn1Var2 = this.v;
        long j = ((vl) y12VarA.getValue()).a;
        qm0 qm0Var = vn1Var2.c;
        if (vn1Var2.b() && ((Boolean) ((v41) qm0Var.g).getValue()).booleanValue()) {
            j = ((vl) ((v41) qm0Var.h).getValue()).a;
        }
        long j2 = j;
        if (vn1Var2.b()) {
            vn1Var2.e = j2;
        }
        if (vl.d(j2) == 0.0f) {
            return;
        }
        e22 e22Var = this.t.a;
        e22 e22Var2 = this.u.a;
        p10.e0(sl0Var, j2, 0L, 0L, 126);
    }
}
