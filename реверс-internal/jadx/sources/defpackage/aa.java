package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class aa extends si0 {
    public z12 t;
    public fy0 u;
    public ba v;
    public long w;

    @Override // defpackage.sv0
    public final void F0() {
        this.w = -9223372034707292160L;
    }

    @Override // defpackage.si0, defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        long j2;
        z61 z61VarE = pu0Var.e(j);
        if (xu0Var.s()) {
            j2 = (((long) z61VarE.e) << 32) | (((long) z61VarE.f) & 4294967295L);
        } else {
            z12 z12Var = this.t;
            int i = z61VarE.e;
            if (z12Var == null) {
                j2 = (((long) i) << 32) | (((long) z61VarE.f) & 4294967295L);
                this.w = j2;
            } else {
                long j3 = (((long) z61VarE.f) & 4294967295L) | (((long) i) << 32);
                y12 y12VarA = z12Var.a(new z9(this, j3, 0), null, null, new z9(this, j3, 1));
                this.v.getClass();
                j2 = ((vh0) y12VarA.getValue()).a;
                this.w = ((vh0) y12VarA.getValue()).a;
            }
        }
        return xu0Var.f0((int) (j2 >> 32), (int) (4294967295L & j2), g40.e, new y9(this, z61VarE, j2));
    }
}
