package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w80 extends sv0 implements vp, u01, vv0, xw {
    public final wa0 s;
    public boolean t;
    public boolean u;
    public final int v;
    public oc w;

    public w80(int i, wa0 wa0Var, int i2) {
        this.s = (i2 & 4) != 0 ? null : wa0Var;
        this.v = i;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // defpackage.sv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0() {
        int iOrdinal = Q0().ordinal();
        if (iOrdinal == 0) {
            m80 m80Var = (m80) ((h4) bl.Q(this)).getFocusOwner();
            m80Var.b(8, true, false);
            m80Var.d.a();
        } else if (iOrdinal == 1) {
            ((h4) bl.Q(this)).getFocusOwner();
            hk.s(this);
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                ez1.a();
                return;
            }
        }
        oc ocVar = this.w;
        if (ocVar != null) {
            ocVar.C();
        }
        this.w = null;
    }

    @Override // defpackage.sv0
    public final void F0() {
        if (Q0().a()) {
            ((m80) ((h4) bl.Q(this)).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // defpackage.u01
    public final void K() {
        R0();
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027a A[ADDED_TO_REGION, LOOP:9: B:167:0x027a->B:174:0x028c, LOOP_START, PHI: r14
      0x027a: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:166:0x0278, B:174:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L0() {
        iy0 iy0Var;
        int i;
        xz0 xz0Var;
        m80 m80Var;
        boolean z;
        int i2;
        iy0 iy0Var2;
        int i3;
        int i4;
        xz0 xz0Var2;
        int iOrdinal = bk.W(this).ordinal();
        if (iOrdinal == 0) {
            m80 m80Var2 = (m80) ((h4) bl.Q(this)).getFocusOwner();
            w80 w80VarF = m80Var2.f();
            v80 v80VarQ0 = Q0();
            if (w80VarF == this) {
                M0(v80VarQ0, v80VarQ0);
                return true;
            }
            if (w80VarF != null || ((m80) ((h4) bl.Q(this)).getFocusOwner()).a.B()) {
                if (w80VarF != null) {
                    iy0Var = new iy0(new w80[16]);
                    if (!w80VarF.e.r) {
                        ng0.b("visitAncestors called on an unattached node");
                    }
                    sv0 sv0Var = w80VarF.e.i;
                    ql0 ql0VarP = bl.P(w80VarF);
                    while (ql0VarP != null) {
                        if ((ql0VarP.I.f.h & 1024) != 0) {
                            while (sv0Var != null) {
                                if ((sv0Var.g & 1024) != 0) {
                                    sv0 sv0VarK = sv0Var;
                                    iy0 iy0Var3 = null;
                                    while (sv0VarK != null) {
                                        if (sv0VarK instanceof w80) {
                                            iy0Var.b((w80) sv0VarK);
                                        } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                            int i5 = 0;
                                            for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                                if ((sv0Var2.g & 1024) != 0) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        sv0VarK = sv0Var2;
                                                    } else {
                                                        if (iy0Var3 == null) {
                                                            iy0Var3 = new iy0(new sv0[16]);
                                                        }
                                                        if (sv0VarK != null) {
                                                            iy0Var3.b(sv0VarK);
                                                            sv0VarK = null;
                                                        }
                                                        iy0Var3.b(sv0Var2);
                                                    }
                                                }
                                            }
                                            if (i5 == 1) {
                                            }
                                        }
                                        sv0VarK = bl.k(iy0Var3);
                                    }
                                }
                                sv0Var = sv0Var.i;
                            }
                        }
                        ql0VarP = ql0VarP.u();
                        sv0Var = (ql0VarP == null || (xz0Var2 = ql0VarP.I) == null) ? null : xz0Var2.e;
                    }
                } else {
                    iy0Var = null;
                }
                Object[] objArr = new w80[16];
                Object[] objArr2 = new w80[16];
                if (!this.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var3 = this.e.i;
                ql0 ql0VarP2 = bl.P(this);
                int i6 = 0;
                int i7 = 0;
                boolean z2 = true;
                while (ql0VarP2 != null) {
                    if ((ql0VarP2.I.f.h & 1024) != 0) {
                        while (sv0Var3 != null) {
                            if ((sv0Var3.g & 1024) != 0) {
                                sv0 sv0VarK2 = sv0Var3;
                                iy0 iy0Var4 = null;
                                while (sv0VarK2 != null) {
                                    if (sv0VarK2 instanceof w80) {
                                        w80 w80Var = (w80) sv0VarK2;
                                        if (xi0.o(iy0Var != null ? Boolean.valueOf(iy0Var.j(w80Var)) : null, Boolean.TRUE)) {
                                            int i8 = i6 + 1;
                                            if (objArr.length < i8) {
                                                int length = objArr.length;
                                                m80Var = m80Var2;
                                                Object[] objArr3 = new Object[Math.max(i8, length * 2)];
                                                i4 = i8;
                                                System.arraycopy(objArr, 0, objArr3, 0, length);
                                                objArr = objArr3;
                                            } else {
                                                m80Var = m80Var2;
                                                i4 = i8;
                                            }
                                            objArr[i6] = w80Var;
                                            i6 = i4;
                                        } else {
                                            m80Var = m80Var2;
                                            int i9 = i7 + 1;
                                            if (objArr2.length < i9) {
                                                int length2 = objArr2.length;
                                                Object[] objArr4 = new Object[Math.max(i9, length2 * 2)];
                                                i3 = i9;
                                                System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                                objArr2 = objArr4;
                                            } else {
                                                i3 = i9;
                                            }
                                            objArr2[i7] = w80Var;
                                            i7 = i3;
                                        }
                                        if (w80Var == w80VarF) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        m80Var = m80Var2;
                                        z = true;
                                    }
                                    if (z && (sv0VarK2.g & 1024) != 0 && (sv0VarK2 instanceof yw)) {
                                        int i10 = 0;
                                        for (sv0 sv0Var4 = ((yw) sv0VarK2).t; sv0Var4 != null; sv0Var4 = sv0Var4.j) {
                                            if ((sv0Var4.g & 1024) != 0) {
                                                int i11 = i10 + 1;
                                                if (i11 == 1) {
                                                    sv0VarK2 = sv0Var4;
                                                    i2 = i11;
                                                } else {
                                                    if (iy0Var4 == null) {
                                                        i2 = i11;
                                                        iy0Var2 = new iy0(new sv0[16]);
                                                    } else {
                                                        i2 = i11;
                                                        iy0Var2 = iy0Var4;
                                                    }
                                                    if (sv0VarK2 != null) {
                                                        iy0Var2.b(sv0VarK2);
                                                        sv0VarK2 = null;
                                                    }
                                                    iy0Var2.b(sv0Var4);
                                                    iy0Var4 = iy0Var2;
                                                }
                                                i10 = i2;
                                            }
                                        }
                                        if (i10 == 1) {
                                            m80Var2 = m80Var;
                                        } else {
                                            sv0VarK2 = bl.k(iy0Var4);
                                            m80Var2 = m80Var;
                                        }
                                    } else {
                                        sv0VarK2 = bl.k(iy0Var4);
                                        m80Var2 = m80Var;
                                    }
                                }
                            }
                            sv0Var3 = sv0Var3.i;
                            m80Var2 = m80Var2;
                        }
                    }
                    m80 m80Var3 = m80Var2;
                    ql0VarP2 = ql0VarP2.u();
                    sv0Var3 = (ql0VarP2 == null || (xz0Var = ql0VarP2.I) == null) ? null : xz0Var.e;
                    m80Var2 = m80Var3;
                }
                m80 m80Var4 = m80Var2;
                if (!z2 || w80VarF == null || bk.X(w80VarF, false)) {
                    bk.R(this, new a7(5, this));
                    int iOrdinal2 = Q0().ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            ((m80) ((h4) bl.Q(this)).getFocusOwner()).i(this);
                        } else if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                ez1.a();
                                return false;
                            }
                            ((m80) ((h4) bl.Q(this)).getFocusOwner()).i(this);
                        }
                    }
                    v80 v80Var = v80.g;
                    v80 v80Var2 = v80.e;
                    if (z2 && w80VarF != null) {
                        w80VarF.M0(v80Var2, v80Var);
                    }
                    v80 v80Var3 = v80.f;
                    if (iy0Var != null) {
                        int i12 = iy0Var.g - 1;
                        Object[] objArr5 = iy0Var.e;
                        if (i12 < objArr5.length) {
                            while (i12 >= 0) {
                                w80 w80Var2 = (w80) objArr5[i12];
                                if (m80Var4.f() != this) {
                                    break;
                                }
                                w80Var2.M0(v80Var3, v80Var);
                                i12--;
                            }
                            i = i7 - 1;
                            if (i >= objArr2.length) {
                                while (i >= 0) {
                                    w80 w80Var3 = (w80) objArr2[i];
                                    if (m80Var4.f() != this) {
                                        break;
                                    }
                                    w80Var3.M0(w80Var3 == w80VarF ? v80Var2 : v80Var, v80Var3);
                                    i--;
                                }
                                if (m80Var4.f() == this) {
                                    M0(v80VarQ0, v80Var2);
                                    if (m80Var4.f() != this) {
                                        break;
                                    }
                                    return true;
                                }
                            } else if (m80Var4.f() == this) {
                            }
                        } else {
                            i = i7 - 1;
                            if (i >= objArr2.length) {
                            }
                        }
                    }
                }
                return false;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                ez1.a();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [sv0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [sv0] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [iy0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [iy0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void M0(v80 v80Var, v80 v80Var2) {
        xz0 xz0Var;
        wa0 wa0Var;
        m80 m80Var = (m80) ((h4) bl.Q(this)).getFocusOwner();
        w80 w80VarF = m80Var.f();
        if (!v80Var.equals(v80Var2) && (wa0Var = this.s) != null) {
            wa0Var.h(v80Var, v80Var2);
        }
        sv0 sv0Var = this.e;
        if (!sv0Var.r) {
            ng0.b("visitAncestors called on an unattached node");
        }
        sv0 sv0Var2 = this.e;
        ql0 ql0VarP = bl.P(this);
        while (ql0VarP != null) {
            if ((ql0VarP.I.f.h & 5120) != 0) {
                while (sv0Var2 != null) {
                    int i = sv0Var2.g;
                    if ((i & 5120) != 0) {
                        if (sv0Var2 != sv0Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? K = sv0Var2;
                            ?? iy0Var = 0;
                            while (K != 0) {
                                if (K instanceof b80) {
                                    b80 b80Var = (b80) K;
                                    if (w80VarF == m80Var.f()) {
                                        b80Var.R(v80Var2);
                                    }
                                } else if ((K.g & 4096) != 0 && (K instanceof yw)) {
                                    sv0 sv0Var3 = ((yw) K).t;
                                    int i2 = 0;
                                    K = K;
                                    iy0Var = iy0Var;
                                    while (sv0Var3 != null) {
                                        if ((sv0Var3.g & 4096) != 0) {
                                            i2++;
                                            iy0Var = iy0Var;
                                            if (i2 == 1) {
                                                K = sv0Var3;
                                            } else {
                                                if (iy0Var == 0) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (K != 0) {
                                                    iy0Var.b(K);
                                                    K = 0;
                                                }
                                                iy0Var.b(sv0Var3);
                                            }
                                        }
                                        sv0Var3 = sv0Var3.j;
                                        K = K;
                                        iy0Var = iy0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                K = bl.k(iy0Var);
                            }
                        }
                    }
                    sv0Var2 = sv0Var2.i;
                }
            }
            ql0VarP = ql0VarP.u();
            sv0Var2 = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
        }
    }

    public final n80 N0() {
        boolean z;
        xz0 xz0Var;
        n80 n80Var = new n80();
        n80Var.a = true;
        o80 o80Var = o80.b;
        n80Var.b = o80Var;
        n80Var.c = o80Var;
        n80Var.d = o80Var;
        n80Var.e = o80Var;
        n80Var.f = o80Var;
        n80Var.g = o80Var;
        n80Var.h = o80Var;
        n80Var.i = o80Var;
        n80Var.j = a4.E;
        n80Var.k = a4.F;
        n80Var.l = v20.K;
        int i = this.v;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((zg0) ((bh0) ((ah0) hk.o(this, aq.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                yc.l("Unknown Focusability");
                return null;
            }
            z = false;
        }
        n80Var.a = z;
        sv0 sv0Var = this.e;
        if (!sv0Var.r) {
            ng0.b("visitAncestors called on an unattached node");
        }
        sv0 sv0Var2 = this.e;
        ql0 ql0VarP = bl.P(this);
        loop0: while (ql0VarP != null) {
            if ((ql0VarP.I.f.h & 3072) != 0) {
                while (sv0Var2 != null) {
                    int i2 = sv0Var2.g;
                    if ((i2 & 3072) != 0) {
                        if (sv0Var2 != sv0Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            iy0 iy0Var = null;
                            sv0 sv0VarK = sv0Var2;
                            while (sv0VarK != null) {
                                if (sv0VarK instanceof xe) {
                                    rv0 rv0Var = ((xe) sv0VarK).s;
                                    ng0.b("applyFocusProperties called on wrong node");
                                    rv0Var.getClass();
                                    yc.d();
                                    return null;
                                }
                                if ((sv0VarK.g & 2048) != 0 && (sv0VarK instanceof yw)) {
                                    int i3 = 0;
                                    for (sv0 sv0Var3 = ((yw) sv0VarK).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                        if ((sv0Var3.g & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                sv0VarK = sv0Var3;
                                            } else {
                                                if (iy0Var == null) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (sv0VarK != null) {
                                                    iy0Var.b(sv0VarK);
                                                    sv0VarK = null;
                                                }
                                                iy0Var.b(sv0Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                sv0VarK = bl.k(iy0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    sv0Var2 = sv0Var2.i;
                }
            }
            ql0VarP = ql0VarP.u();
            sv0Var2 = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
        }
        return n80Var;
    }

    public final pc1 O0(zk0 zk0Var) {
        pc1 pc1Var = N0().l;
        return pc1Var != v20.K ? zk0Var == null ? pc1Var : pc1Var.i(zk0Var.D(bl.O(this), 0L)) : zk0Var != null ? zk0Var.I(bl.O(this), false) : qc1.a(0L, xk.P(bl.O(this).g));
    }

    public final om0 P0() {
        xz0 xz0Var;
        Object obj;
        if (!this.e.r) {
            ng0.b("visitAncestors called on an unattached node");
        }
        sv0 sv0Var = this.e.i;
        ql0 ql0VarP = bl.P(this);
        while (true) {
            if (ql0VarP == null) {
                break;
            }
            if ((ql0VarP.I.f.h & 8388640) != 0) {
                while (sv0Var != null) {
                    int i = sv0Var.g;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(sv0Var instanceof om0)) {
                                if (sv0Var instanceof yw) {
                                    sv0Var = null;
                                    for (sv0 sv0Var2 = ((yw) sv0Var).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                        if (sv0Var2 instanceof om0) {
                                            sv0Var = sv0Var2;
                                        }
                                    }
                                } else {
                                    sv0Var = null;
                                }
                            }
                            om0 om0Var = (om0) sv0Var;
                            if (om0Var != null) {
                                return om0Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (sv0Var instanceof vv0) {
                                obj = sv0Var;
                            } else if (sv0Var instanceof yw) {
                                obj = null;
                                for (sv0 sv0Var3 = ((yw) sv0Var).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                    if (sv0Var3 instanceof vv0) {
                                        obj = sv0Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            vv0 vv0Var = (vv0) obj;
                            if (vv0Var != null) {
                                vv0Var.i();
                            }
                        }
                    }
                    sv0Var = sv0Var.i;
                }
            }
            ql0VarP = ql0VarP.u();
            sv0Var = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
        }
        return null;
    }

    public final v80 Q0() {
        w80 w80VarF;
        xz0 xz0Var;
        boolean z = this.r;
        v80 v80Var = v80.g;
        if (!z || (w80VarF = ((m80) ((h4) bl.Q(this)).getFocusOwner()).f()) == null) {
            return v80Var;
        }
        if (this == w80VarF) {
            return v80.e;
        }
        if (w80VarF.r) {
            if (!w80VarF.e.r) {
                ng0.b("visitAncestors called on an unattached node");
            }
            sv0 sv0Var = w80VarF.e.i;
            ql0 ql0VarP = bl.P(w80VarF);
            while (ql0VarP != null) {
                if ((ql0VarP.I.f.h & 1024) != 0) {
                    while (sv0Var != null) {
                        if ((sv0Var.g & 1024) != 0) {
                            sv0 sv0VarK = sv0Var;
                            iy0 iy0Var = null;
                            while (sv0VarK != null) {
                                if (sv0VarK instanceof w80) {
                                    if (this == ((w80) sv0VarK)) {
                                        return v80.f;
                                    }
                                } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                    int i = 0;
                                    for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                        if ((sv0Var2.g & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                sv0VarK = sv0Var2;
                                            } else {
                                                if (iy0Var == null) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (sv0VarK != null) {
                                                    iy0Var.b(sv0VarK);
                                                    sv0VarK = null;
                                                }
                                                iy0Var.b(sv0Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                sv0VarK = bl.k(iy0Var);
                            }
                        }
                        sv0Var = sv0Var.i;
                    }
                }
                ql0VarP = ql0VarP.u();
                sv0Var = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
            }
        }
        return v80Var;
    }

    public final void R0() {
        int iOrdinal = Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                ez1.a();
                return;
            }
        }
        zc1 zc1Var = new zc1();
        bk.R(this, new y3(4, zc1Var, this));
        Object obj = zc1Var.e;
        if (obj == null) {
            xi0.K("focusProperties");
            throw null;
        }
        if (((n80) obj).a) {
            return;
        }
        ((m80) ((h4) bl.Q(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean S0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return N0().a ? L0() : af1.q(this, i, new zz0(i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.sv0
    public final void D0() {
    }
}
