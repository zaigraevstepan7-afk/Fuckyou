package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 implements a01 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [iy0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.a01
    public final boolean a(sv0 sv0Var) {
        ?? iy0Var = 0;
        while (true) {
            int i = 0;
            if (sv0Var == 0) {
                return false;
            }
            if (sv0Var instanceof p81) {
                if (((p81) sv0Var).q0()) {
                    return true;
                }
            } else if ((sv0Var.g & 16) != 0 && (sv0Var instanceof yw)) {
                sv0 sv0Var2 = ((yw) sv0Var).t;
                iy0Var = iy0Var;
                sv0Var = sv0Var;
                while (sv0Var2 != null) {
                    if ((sv0Var2.g & 16) != 0) {
                        i++;
                        iy0Var = iy0Var;
                        if (i == 1) {
                            sv0Var = sv0Var2;
                        } else {
                            if (iy0Var == 0) {
                                iy0Var = new iy0(new sv0[16]);
                            }
                            if (sv0Var != 0) {
                                iy0Var.b(sv0Var);
                                sv0Var = 0;
                            }
                            iy0Var.b(sv0Var2);
                        }
                    }
                    sv0Var2 = sv0Var2.j;
                    iy0Var = iy0Var;
                    sv0Var = sv0Var;
                }
                if (i == 1) {
                }
            }
            sv0Var = bl.k(iy0Var);
        }
    }

    @Override // defpackage.a01
    public final int b() {
        return 16;
    }

    @Override // defpackage.a01
    public final void d(ql0 ql0Var, long j, td0 td0Var, int i, boolean z) {
        ql0Var.A(j, td0Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [sv0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [iy0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.a01
    public final boolean f(td0 td0Var, ql0 ql0Var) {
        c01 c01Var = ql0Var.I.d;
        c01Var.getClass();
        sv0 sv0VarY0 = c01Var.Y0(d01.g(16));
        if (sv0VarY0 != null && sv0VarY0.r) {
            if (!sv0VarY0.e.r) {
                ng0.b("visitLocalDescendants called on an unattached node");
            }
            sv0 sv0Var = sv0VarY0.e;
            if ((sv0Var.h & 16) != 0) {
                while (sv0Var != null) {
                    if ((sv0Var.g & 16) != 0) {
                        ?? K = sv0Var;
                        ?? iy0Var = 0;
                        while (K != 0) {
                            if (K instanceof p81) {
                                if (((p81) K).U()) {
                                    td0Var.g = td0Var.e.b - 1;
                                    return true;
                                }
                            } else if ((K.g & 16) != 0 && (K instanceof yw)) {
                                sv0 sv0Var2 = ((yw) K).t;
                                int i = 0;
                                K = K;
                                iy0Var = iy0Var;
                                while (sv0Var2 != null) {
                                    if ((sv0Var2.g & 16) != 0) {
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
                    sv0Var = sv0Var.j;
                }
            }
        }
        return false;
    }

    @Override // defpackage.a01
    public final boolean h(ql0 ql0Var) {
        return true;
    }
}
