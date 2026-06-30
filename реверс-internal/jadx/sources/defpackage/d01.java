package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d01 {
    public static final ox0 a;

    static {
        ox0 ox0Var = r01.a;
        a = new ox0();
    }

    public static final void a(sv0 sv0Var, int i, int i2) {
        if (!(sv0Var instanceof yw)) {
            b(sv0Var, i & sv0Var.g, i2);
            return;
        }
        yw ywVar = (yw) sv0Var;
        int i3 = ywVar.s;
        b(sv0Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (sv0 sv0Var2 = ywVar.t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
            a(sv0Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(sv0 sv0Var, int i, int i2) {
        if (i2 != 0 || sv0Var.A0()) {
            if ((i & 2) != 0 && (sv0Var instanceof il0)) {
                el.D((il0) sv0Var);
                if (i2 == 2) {
                    bl.N(sv0Var, 2).i1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                bl.P(sv0Var).G();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                bl.P(sv0Var).Y(false);
            }
            if ((i & 256) != 0 && (sv0Var instanceof cc0)) {
                if (i2 == 1) {
                    ql0 ql0VarP = bl.P(sv0Var);
                    ql0VarP.e0(ql0VarP.Q + 1);
                } else if (i2 == 2) {
                    bl.P(sv0Var).e0(r0.Q - 1);
                }
                if (i2 != 2) {
                    ql0 ql0VarP2 = bl.P(sv0Var);
                    if (ql0VarP2.Q != 0 && !ql0VarP2.p() && !ql0VarP2.q() && !ql0VarP2.P) {
                        h4 h4Var = (h4) tl0.a(ql0VarP2);
                        xg0 xg0Var = h4Var.R.e;
                        xg0Var.getClass();
                        if (ql0VarP2.Q > 0) {
                            ((iy0) xg0Var.f).b(ql0VarP2);
                            ql0VarP2.P = true;
                        }
                        h4Var.D(null);
                    }
                }
            }
            if ((i & 4) != 0 && (sv0Var instanceof o10)) {
                al.C((o10) sv0Var);
            }
            if ((i & 8) != 0 && (sv0Var instanceof pl1)) {
                bl.P(sv0Var).u = true;
            }
            if ((i & 64) != 0 && (sv0Var instanceof w41)) {
                ul0 ul0Var = bl.P((w41) sv0Var).J;
                ul0Var.p.u = true;
                ct0 ct0Var = ul0Var.q;
                if (ct0Var != null) {
                    ct0Var.A = true;
                }
            }
            if ((i & 2048) != 0 && (sv0Var instanceof xe)) {
                rv0 rv0Var = ((xe) sv0Var).s;
                ng0.b("applyFocusProperties called on wrong node");
                rv0Var.getClass();
                yc.d();
                return;
            }
            if ((i & 4096) != 0 && (sv0Var instanceof b80)) {
                b80 b80Var = (b80) sv0Var;
                h80 h80Var = ((m80) ((h4) bl.Q(b80Var)).getFocusOwner()).d;
                if (h80Var.d.a(b80Var)) {
                    h80Var.a();
                }
            }
            if ((i & 2097152) != 0 && (sv0Var instanceof cg0) && i2 == 2) {
                ((cg0) sv0Var).C();
            }
        }
    }

    public static final void c(sv0 sv0Var) {
        if (!sv0Var.r) {
            ng0.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(sv0Var, -1, 0);
    }

    public static final int d(rv0 rv0Var) {
        int i = rv0Var instanceof gl0 ? 3 : 1;
        if (rv0Var instanceof n10) {
            i |= 4;
        }
        if (rv0Var instanceof uc) {
            i |= 8;
        }
        if (rv0Var instanceof w9) {
            i |= 64;
        }
        return rv0Var instanceof vg ? 524288 | i : i;
    }

    public static final int e(sv0 sv0Var) {
        int i = sv0Var.g;
        if (i != 0) {
            return i;
        }
        Class<?> cls = sv0Var.getClass();
        ox0 ox0Var = a;
        int iD = ox0Var.d(cls);
        if (iD >= 0) {
            return ox0Var.c[iD];
        }
        int i2 = sv0Var instanceof il0 ? 3 : 1;
        if (sv0Var instanceof o10) {
            i2 |= 4;
        }
        if (sv0Var instanceof pl1) {
            i2 |= 8;
        }
        if (sv0Var instanceof p81) {
            i2 |= 16;
        }
        if (sv0Var instanceof vv0) {
            i2 |= 32;
        }
        if (sv0Var instanceof w41) {
            i2 |= 64;
        }
        if (sv0Var instanceof xk0) {
            i2 |= 4194432;
        } else if (sv0Var instanceof av0) {
            i2 |= 128;
        }
        if (sv0Var instanceof cc0) {
            i2 |= 256;
        }
        boolean z = sv0Var instanceof w80;
        if (z) {
            i2 |= 1024;
        }
        if (sv0Var instanceof xe) {
            i2 |= 2048;
        }
        if (sv0Var instanceof b80) {
            i2 |= 4096;
        }
        if (sv0Var instanceof jk0) {
            i2 |= 8192;
        }
        if (sv0Var instanceof v3) {
            i2 |= 16384;
        }
        if (sv0Var instanceof vp) {
            i2 |= 32768;
        }
        if (sv0Var instanceof i22) {
            i2 |= 262144;
        }
        if (sv0Var instanceof vg) {
            i2 |= 524288;
        }
        if (z) {
            i2 |= 1048576;
        }
        if (sv0Var instanceof cg0) {
            i2 |= 2097152;
        }
        if (sv0Var instanceof om0) {
            i2 |= 8388608;
        }
        ox0Var.g(i2, cls);
        return i2;
    }

    public static final int f(sv0 sv0Var) {
        if (!(sv0Var instanceof yw)) {
            return e(sv0Var);
        }
        yw ywVar = (yw) sv0Var;
        int iF = ywVar.s;
        for (sv0 sv0Var2 = ywVar.t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
            iF |= f(sv0Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
