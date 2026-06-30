package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hn0 extends sv0 implements pl1 {
    public ha0 s;
    public dn0 t;
    public k31 u;
    public boolean v;
    public wi1 w;
    public final fn0 x = new fn0(this, 0);
    public fn0 y;

    public hn0(ha0 ha0Var, dn0 dn0Var, k31 k31Var, boolean z) {
        this.s = ha0Var;
        this.t = dn0Var;
        this.u = k31Var;
        this.v = z;
        L0();
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    public final void L0() {
        this.w = new wi1(new gn0(this, 0), new gn0(this, 1));
        this.y = this.v ? new fn0(this, 1) : null;
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        ck0[] ck0VarArr = yl1.a;
        zl1 zl1Var = vl1.n;
        ck0[] ck0VarArr2 = yl1.a;
        ck0 ck0Var = ck0VarArr2[6];
        am1Var.a(zl1Var, Boolean.TRUE);
        am1Var.a(vl1.N, this.x);
        k31 k31Var = this.u;
        wi1 wi1Var = this.w;
        if (k31Var == k31.e) {
            if (wi1Var == null) {
                xi0.K("scrollAxisRange");
                throw null;
            }
            zl1 zl1Var2 = vl1.w;
            ck0 ck0Var2 = ck0VarArr2[13];
            am1Var.a(zl1Var2, wi1Var);
        } else {
            if (wi1Var == null) {
                xi0.K("scrollAxisRange");
                throw null;
            }
            zl1 zl1Var3 = vl1.v;
            ck0 ck0Var3 = ck0VarArr2[12];
            am1Var.a(zl1Var3, wi1Var);
        }
        fn0 fn0Var = this.y;
        if (fn0Var != null) {
            am1Var.a(ml1.f, new r0(null, fn0Var));
        }
        am1Var.a(ml1.C, new r0(null, new g3(18, new gn0(this, 2))));
        dn0 dn0Var = this.t;
        dn0Var.getClass();
        ol olVar = new ol(((Number) dn0Var.a.getValue()).intValue(), 1);
        zl1 zl1Var4 = vl1.f;
        ck0 ck0Var4 = ck0VarArr2[24];
        am1Var.a(zl1Var4, olVar);
    }
}
