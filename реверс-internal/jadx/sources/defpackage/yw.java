package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw extends sv0 {
    public final int s = d01.e(this);
    public sv0 t;

    @Override // defpackage.sv0
    public final void B0() {
        super.B0();
        for (sv0 sv0Var = this.t; sv0Var != null; sv0Var = sv0Var.j) {
            sv0Var.K0(this.l);
            if (!sv0Var.r) {
                sv0Var.B0();
            }
        }
    }

    @Override // defpackage.sv0
    public final void C0() {
        for (sv0 sv0Var = this.t; sv0Var != null; sv0Var = sv0Var.j) {
            sv0Var.C0();
        }
        super.C0();
    }

    @Override // defpackage.sv0
    public final void G0() {
        super.G0();
        for (sv0 sv0Var = this.t; sv0Var != null; sv0Var = sv0Var.j) {
            sv0Var.G0();
        }
    }

    @Override // defpackage.sv0
    public final void H0() {
        for (sv0 sv0Var = this.t; sv0Var != null; sv0Var = sv0Var.j) {
            sv0Var.H0();
        }
        super.H0();
    }

    @Override // defpackage.sv0
    public final void I0() {
        super.I0();
        for (sv0 sv0Var = this.t; sv0Var != null; sv0Var = sv0Var.j) {
            sv0Var.I0();
        }
    }

    @Override // defpackage.sv0
    public final void J0(sv0 sv0Var) {
        this.e = sv0Var;
        for (sv0 sv0Var2 = this.t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
            sv0Var2.J0(sv0Var);
        }
    }

    @Override // defpackage.sv0
    public final void K0(c01 c01Var) {
        this.l = c01Var;
        for (sv0 sv0Var = this.t; sv0Var != null; sv0Var = sv0Var.j) {
            sv0Var.K0(c01Var);
        }
    }

    public final xw L0(xw xwVar) {
        sv0 sv0Var = ((sv0) xwVar).e;
        if (sv0Var != xwVar) {
            sv0 sv0Var2 = xwVar instanceof sv0 ? (sv0) xwVar : null;
            sv0 sv0Var3 = sv0Var2 != null ? sv0Var2.i : null;
            if (sv0Var != this.e || !xi0.o(sv0Var3, this)) {
                yc.l("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (sv0Var.r) {
                ng0.b("Cannot delegate to an already attached node");
            }
            sv0Var.J0(this.e);
            int i = this.g;
            int iF = d01.f(sv0Var);
            sv0Var.g = iF;
            int i2 = this.g;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof il0)) {
                ng0.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + sv0Var);
            }
            sv0Var.j = this.t;
            this.t = sv0Var;
            sv0Var.i = this;
            N0(iF | this.g, false);
            if (this.r) {
                if (i3 == 0 || (i & 2) != 0) {
                    K0(this.l);
                } else {
                    xz0 xz0Var = bl.P(this).I;
                    this.e.K0(null);
                    xz0Var.g();
                }
                sv0Var.B0();
                sv0Var.H0();
                if (!sv0Var.r) {
                    ng0.b("autoInvalidateInsertedNode called on unattached node");
                }
                d01.a(sv0Var, -1, 1);
            }
        }
        return xwVar;
    }

    public final void M0(xw xwVar) {
        sv0 sv0Var = null;
        for (sv0 sv0Var2 = this.t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
            if (sv0Var2 == xwVar) {
                boolean z = sv0Var2.r;
                if (z) {
                    ox0 ox0Var = d01.a;
                    if (!z) {
                        ng0.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    d01.a(sv0Var2, -1, 2);
                    sv0Var2.I0();
                    sv0Var2.C0();
                }
                sv0Var2.J0(sv0Var2);
                sv0Var2.h = 0;
                sv0 sv0Var3 = sv0Var2.j;
                if (sv0Var == null) {
                    this.t = sv0Var3;
                } else {
                    sv0Var.j = sv0Var3;
                }
                sv0Var2.j = null;
                sv0Var2.i = null;
                int i = this.g;
                int iF = d01.f(this);
                N0(iF, true);
                if (this.r && (i & 2) != 0 && (iF & 2) == 0) {
                    xz0 xz0Var = bl.P(this).I;
                    this.e.K0(null);
                    xz0Var.g();
                    return;
                }
                return;
            }
            sv0Var = sv0Var2;
        }
        yc.g(xwVar, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sv0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void N0(int i, boolean z) {
        sv0 sv0Var;
        int i2 = this.g;
        this.g = i;
        if (i2 != i) {
            sv0 sv0Var2 = this.e;
            if (sv0Var2 == this) {
                this.h = i;
            }
            boolean z2 = this.r;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.g;
                    r2.g = i;
                    if (r2 == sv0Var2) {
                        break;
                    } else {
                        r2 = r2.i;
                    }
                }
                if (z && r2 == sv0Var2) {
                    i = d01.f(sv0Var2);
                    sv0Var2.g = i;
                }
                int i3 = i | ((r2 == 0 || (sv0Var = r2.j) == null) ? 0 : sv0Var.h);
                for (?? r22 = r2; r22 != 0; r22 = r22.i) {
                    i3 |= r22.g;
                    r22.h = i3;
                }
            }
        }
    }
}
