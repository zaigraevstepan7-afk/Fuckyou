package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rl1 {
    public final sv0 a;
    public final boolean b;
    public final ql0 c;
    public final nl1 d;
    public rl1 e;
    public final int f;

    public rl1(sv0 sv0Var, boolean z, ql0 ql0Var, nl1 nl1Var) {
        this.a = sv0Var;
        this.b = z;
        this.c = ql0Var;
        this.d = nl1Var;
        this.f = ql0Var.f;
    }

    public static /* synthetic */ List j(int i, rl1 rl1Var) {
        return rl1Var.i((i & 1) != 0 ? !rl1Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [sv0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [sv0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [iy0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final pc1 a(c01 c01Var) {
        ?? K;
        rl1 rl1VarL = l();
        if (rl1VarL == null) {
            return pc1.e;
        }
        sv0 sv0Var = rl1VarL.c.I.f;
        if ((sv0Var.h & 8) != 0) {
            loop0: while (sv0Var != null) {
                if ((sv0Var.g & 8) != 0) {
                    K = sv0Var;
                    ?? iy0Var = 0;
                    while (K != 0) {
                        if (K instanceof pl1) {
                            if (((pl1) K).h()) {
                                break loop0;
                            }
                        } else if ((K.g & 8) != 0 && (K instanceof yw)) {
                            sv0 sv0Var2 = ((yw) K).t;
                            int i = 0;
                            K = K;
                            iy0Var = iy0Var;
                            while (sv0Var2 != null) {
                                if ((sv0Var2.g & 8) != 0) {
                                    i++;
                                    iy0Var = iy0Var;
                                    if (i == 1) {
                                        K = sv0Var2;
                                    } else {
                                        if (iy0Var == 0) {
                                            iy0Var = new iy0(new sv0[16]);
                                        }
                                        if (K != 0) {
                                            iy0Var.b(K);
                                            K = 0;
                                        }
                                        iy0Var.b(sv0Var2);
                                    }
                                }
                                sv0Var2 = sv0Var2.j;
                                K = K;
                                iy0Var = iy0Var;
                            }
                            if (i == 1) {
                            }
                        }
                        K = bl.k(iy0Var);
                    }
                }
                if ((sv0Var.h & 8) == 0) {
                    break;
                }
                sv0Var = sv0Var.j;
            }
            K = 0;
        } else {
            K = 0;
        }
        pl1 pl1Var = (pl1) K;
        c01 c01VarN = pl1Var != null ? bl.N(pl1Var, 8) : null;
        return c01VarN == null ? rl1VarL.a(c01Var) : c01VarN.I(c01Var, true);
    }

    public final rl1 b(yf1 yf1Var, sa0 sa0Var) {
        nl1 nl1Var = new nl1();
        nl1Var.g = false;
        nl1Var.h = false;
        sa0Var.i(nl1Var);
        rl1 rl1Var = new rl1(new ql1(sa0Var), false, new ql0(this.f + (yf1Var != null ? 1000000000 : 2000000000), true), nl1Var);
        rl1Var.e = this;
        return rl1Var;
    }

    public final void c(ql0 ql0Var, ArrayList arrayList) {
        iy0 iy0VarX = ql0Var.x();
        Object[] objArr = iy0VarX.e;
        int i = iy0VarX.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var2 = (ql0) objArr[i2];
            if (ql0Var2.J() && !ql0Var2.R) {
                if (ql0Var2.I.d(8)) {
                    arrayList.add(pd1.d(ql0Var2, this.b));
                } else {
                    c(ql0Var2, arrayList);
                }
            }
        }
    }

    public final c01 d() {
        if (!o()) {
            pl1 pl1VarF = f();
            return pl1VarF != null ? bl.N(pl1VarF, 8) : this.c.I.c;
        }
        rl1 rl1VarL = l();
        if (rl1VarL != null) {
            return rl1VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            rl1 rl1Var = (rl1) arrayList.get(size2);
            if (rl1Var.p()) {
                arrayList2.add(rl1Var);
            } else if (!rl1Var.d.h) {
                rl1Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [sv0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [sv0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [iy0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final pl1 f() {
        ?? K;
        boolean z;
        boolean z2 = this.d.g;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        ql0 ql0Var = this.c;
        if (z2) {
            sv0 sv0Var = ql0Var.I.f;
            if ((sv0Var.h & 8) != 0) {
                K = 0;
                while (sv0Var != null) {
                    if ((sv0Var.g & 8) != 0) {
                        sv0 sv0VarK = sv0Var;
                        iy0 iy0Var = null;
                        while (sv0VarK != null) {
                            if (sv0VarK instanceof pl1) {
                                pl1 pl1Var = (pl1) sv0VarK;
                                ?? r0 = K;
                                if (pl1Var.h()) {
                                    r0 = K;
                                    if (pl1Var.k0()) {
                                        return pl1Var;
                                    }
                                    if (K == 0) {
                                        r0 = pl1Var;
                                    }
                                }
                                z = false;
                                K = r0;
                            } else {
                                z = true;
                                K = K;
                            }
                            if (z && (sv0VarK.g & 8) != 0 && (sv0VarK instanceof yw)) {
                                int i = 0;
                                for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                    if ((sv0Var2.g & 8) != 0) {
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
                    if ((sv0Var.h & 8) == 0) {
                        break;
                    }
                    sv0Var = sv0Var.j;
                    K = K;
                }
                r4 = K;
            }
        } else {
            sv0 sv0Var3 = ql0Var.I.f;
            if ((sv0Var3.h & 8) != 0) {
                loop3: while (sv0Var3 != null) {
                    if ((sv0Var3.g & 8) != 0) {
                        K = sv0Var3;
                        ?? iy0Var2 = 0;
                        while (K != 0) {
                            if (K instanceof pl1) {
                                if (((pl1) K).h()) {
                                    r4 = K;
                                }
                            } else if ((K.g & 8) != 0 && (K instanceof yw)) {
                                sv0 sv0Var4 = ((yw) K).t;
                                int i2 = 0;
                                K = K;
                                iy0Var2 = iy0Var2;
                                while (sv0Var4 != null) {
                                    if ((sv0Var4.g & 8) != 0) {
                                        i2++;
                                        iy0Var2 = iy0Var2;
                                        if (i2 == 1) {
                                            K = sv0Var4;
                                        } else {
                                            if (iy0Var2 == 0) {
                                                iy0Var2 = new iy0(new sv0[16]);
                                            }
                                            if (K != 0) {
                                                iy0Var2.b(K);
                                                K = 0;
                                            }
                                            iy0Var2.b(sv0Var4);
                                        }
                                    }
                                    sv0Var4 = sv0Var4.j;
                                    K = K;
                                    iy0Var2 = iy0Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            K = bl.k(iy0Var2);
                        }
                    }
                    if ((sv0Var3.h & 8) == 0) {
                        break;
                    }
                    sv0Var3 = sv0Var3.j;
                }
            }
        }
        return (pl1) r4;
    }

    public final pc1 g() {
        c01 c01VarD = d();
        if (c01VarD != null) {
            if (!c01VarD.W0().r) {
                c01VarD = null;
            }
            if (c01VarD != null) {
                return al.w(c01VarD).I(c01VarD, true);
            }
        }
        return pc1.e;
    }

    public final pc1 h() {
        c01 c01VarD = d();
        if (c01VarD != null) {
            if (!c01VarD.W0().r) {
                c01VarD = null;
            }
            if (c01VarD != null) {
                return al.k(c01VarD, true);
            }
        }
        return pc1.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.h) {
            return f40.e;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final nl1 k() {
        boolean zP = p();
        nl1 nl1Var = this.d;
        if (!zP) {
            return nl1Var;
        }
        nl1 nl1VarB = nl1Var.b();
        r(new ArrayList(), nl1VarB);
        return nl1VarB;
    }

    public final rl1 l() {
        ql0 ql0VarU;
        rl1 rl1Var = this.e;
        if (rl1Var != null) {
            return rl1Var;
        }
        ql0 ql0Var = this.c;
        boolean z = this.b;
        if (z) {
            ql0VarU = ql0Var.u();
            while (ql0VarU != null) {
                nl1 nl1VarW = ql0VarU.w();
                if (nl1VarW != null && nl1VarW.g) {
                    break;
                }
                ql0VarU = ql0VarU.u();
            }
            ql0VarU = null;
        } else {
            ql0VarU = null;
        }
        if (ql0VarU == null) {
            ql0 ql0VarU2 = ql0Var.u();
            while (true) {
                if (ql0VarU2 == null) {
                    ql0VarU = null;
                    break;
                }
                if (ql0VarU2.I.d(8)) {
                    ql0VarU = ql0VarU2;
                    break;
                }
                ql0VarU2 = ql0VarU2.u();
            }
        }
        if (ql0VarU == null) {
            return null;
        }
        return pd1.d(ql0VarU, z);
    }

    public final pc1 m() {
        Object objF = f();
        if (objF == null) {
            return this.c.I.c.s1();
        }
        sv0 sv0Var = ((sv0) objF).e;
        Object objG = this.d.e.g(ml1.b);
        if (objG == null) {
            objG = null;
        }
        return kd1.j(sv0Var, objG != null, true);
    }

    public final nl1 n() {
        return this.d;
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.g;
    }

    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        ql0 ql0VarU = this.c.u();
        while (true) {
            if (ql0VarU == null) {
                ql0VarU = null;
                break;
            }
            nl1 nl1VarW = ql0VarU.w();
            if (nl1VarW != null && nl1VarW.g) {
                break;
            }
            ql0VarU = ql0VarU.u();
        }
        return ql0VarU == null;
    }

    public final void r(ArrayList arrayList, nl1 nl1Var) {
        if (this.d.h) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            rl1 rl1Var = (rl1) arrayList.get(size2);
            if (!rl1Var.p()) {
                nl1Var.e(rl1Var.d);
                rl1Var.r(arrayList, nl1Var);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        if (o()) {
            return f40.e;
        }
        c(this.c, arrayList);
        if (z) {
            nl1 nl1Var = this.d;
            zx0 zx0Var = nl1Var.e;
            Object objG = zx0Var.g(vl1.z);
            if (objG == null) {
                objG = null;
            }
            yf1 yf1Var = (yf1) objG;
            if (yf1Var != null && nl1Var.g && !arrayList.isEmpty()) {
                arrayList.add(b(yf1Var, new g3(16, yf1Var)));
            }
            zl1 zl1Var = vl1.a;
            if (zx0Var.c(zl1Var) && !arrayList.isEmpty() && nl1Var.g) {
                Object objG2 = zx0Var.g(zl1Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) pl.d0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new g3(17, str)));
                }
            }
        }
        return arrayList;
    }
}
