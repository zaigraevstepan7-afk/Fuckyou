package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 {
    public final ql0 a;
    public boolean c;
    public boolean d;
    public kr i;
    public final oc b = new oc(4);
    public final xg0 e = new xg0(26);
    public final iy0 f = new iy0(new ql0[16]);
    public final long g = 1;
    public final iy0 h = new iy0(new qu0[16]);

    public ru0(ql0 ql0Var) {
        this.a = ql0Var;
    }

    public static final boolean a(ru0 ru0Var, ql0 ql0Var, boolean z) {
        kr krVar;
        y61 placementScope;
        tg0 tg0Var;
        ql0 ql0VarU;
        ql0 ql0Var2 = ru0Var.a;
        boolean z2 = ql0Var.R;
        ul0 ul0Var = ql0Var.J;
        if (!z2 && k(ql0Var)) {
            if (ql0Var == ql0Var2) {
                krVar = ru0Var.i;
                krVar.getClass();
            } else {
                krVar = null;
            }
            if (z) {
                zC = ul0Var.e ? c(ql0Var, krVar) : false;
                if ((zC || ul0Var.f) && xi0.o(ql0Var.L(), Boolean.TRUE)) {
                    ql0Var.M();
                }
            } else {
                boolean zD = ql0Var.q() ? d(ql0Var, krVar) : false;
                if (ql0Var.p() && (ql0Var == ql0Var2 || ((ql0VarU = ql0Var.u()) != null && ql0VarU.K() && ul0Var.p.x))) {
                    if (ql0Var == ql0Var2) {
                        if (ql0Var.F == ol0.g) {
                            ql0Var.f();
                        }
                        ql0 ql0VarU2 = ql0Var.u();
                        if (ql0VarU2 == null || (tg0Var = ql0VarU2.I.c) == null || (placementScope = tg0Var.t) == null) {
                            placementScope = ((h4) tl0.a(ql0Var)).getPlacementScope();
                        }
                        y61.j(placementScope, ul0Var.p, 0, 0);
                    } else {
                        ql0Var.V();
                    }
                    xg0 xg0Var = ru0Var.e;
                    xg0Var.getClass();
                    if (ql0Var.Q > 0) {
                        ((iy0) xg0Var.f).b(ql0Var);
                        ql0Var.P = true;
                    }
                }
                zC = zD;
            }
            ru0Var.e();
        }
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(ql0 ql0Var, kr krVar) {
        boolean zC0;
        ql0 ql0Var2 = ql0Var.l;
        ul0 ul0Var = ql0Var.J;
        if (ql0Var2 == null) {
            return false;
        }
        if (krVar == null) {
            ct0 ct0Var = ul0Var.q;
            kr krVar2 = ct0Var != null ? ct0Var.r : null;
            if (krVar2 != null && ql0Var2 != null) {
                ct0Var.getClass();
                zC0 = ct0Var.C0(krVar2.a);
            }
        } else if (ql0Var2 != null) {
            ct0 ct0Var2 = ul0Var.q;
            ct0Var2.getClass();
            zC0 = ct0Var2.C0(krVar.a);
        } else {
            zC0 = false;
        }
        ql0 ql0VarU = ql0Var.u();
        if (zC0 && ql0VarU != null) {
            if (ql0VarU.l == null) {
                ql0.Z(ql0VarU, false, 3);
                return zC0;
            }
            if (ql0Var.s() == ol0.e) {
                ql0.X(ql0VarU, false, 3);
                return zC0;
            }
            if (ql0Var.s() == ol0.f) {
                ql0VarU.W(false);
            }
        }
        return zC0;
    }

    public static boolean d(ql0 ql0Var, kr krVar) {
        boolean zR = krVar != null ? ql0Var.R(krVar) : ql0.S(ql0Var);
        ql0 ql0VarU = ql0Var.u();
        if (zR && ql0VarU != null) {
            if (ql0Var.r() == ol0.e) {
                ql0.Z(ql0VarU, false, 3);
                return zR;
            }
            if (ql0Var.r() == ol0.f) {
                ql0VarU.Y(false);
            }
        }
        return zR;
    }

    public static boolean i(ql0 ql0Var) {
        ct0 ct0Var;
        rl0 rl0Var;
        if (ql0Var.J.e) {
            return (ql0Var.s() == ol0.g && ((ct0Var = ql0Var.J.q) == null || (rl0Var = ct0Var.v) == null || !rl0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean j(ql0 ql0Var) {
        if (!ql0Var.q()) {
            return false;
        }
        do {
            if (ql0Var.r() == ol0.g && !ql0Var.J.p.B.e()) {
                ql0 ql0VarU = ql0Var.u();
                if ((ql0VarU != null ? ql0VarU.J.d : null) != ml0.e) {
                    return false;
                }
            }
            ql0Var = ql0Var.u();
            if (ql0Var == null) {
                return false;
            }
        } while (!ql0Var.K());
        return true;
    }

    public static boolean k(ql0 ql0Var) {
        ct0 ct0Var;
        rl0 rl0Var;
        ul0 ul0Var = ql0Var.J;
        return ql0Var.K() || ul0Var.p.x || j(ql0Var) || xi0.o(ql0Var.L(), Boolean.TRUE) || i(ql0Var) || ul0Var.p.B.e() || !((ct0Var = ul0Var.q) == null || (rl0Var = ct0Var.v) == null || !rl0Var.e());
    }

    public final void b(boolean z) {
        xg0 xg0Var = this.e;
        if (z) {
            iy0 iy0Var = (iy0) xg0Var.f;
            ql0 ql0Var = this.a;
            if (ql0Var.Q > 0) {
                iy0Var.g();
                iy0Var.b(ql0Var);
                ql0Var.P = true;
            }
        }
        if (((iy0) xg0Var.f).g != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                xg0Var.r();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        iy0 iy0Var = this.h;
        int i = iy0Var.g;
        if (i != 0) {
            Object[] objArr = iy0Var.e;
            for (int i2 = 0; i2 < i; i2++) {
                qu0 qu0Var = (qu0) objArr[i2];
                if (qu0Var.a.J()) {
                    boolean z = qu0Var.b;
                    ql0 ql0Var = qu0Var.a;
                    boolean z2 = qu0Var.c;
                    if (z) {
                        ql0.X(ql0Var, z2, 2);
                    } else {
                        ql0.Z(ql0Var, z2, 2);
                    }
                }
            }
            iy0Var.g();
        }
    }

    public final void f(ql0 ql0Var) {
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var2 = (ql0) objArr[i2];
            if (xi0.o(ql0Var2.L(), Boolean.TRUE) && !ql0Var2.R) {
                if (this.b.d(ql0Var2)) {
                    ql0Var2.M();
                }
                f(ql0Var2);
            }
        }
    }

    public final void g(ql0 ql0Var, boolean z) {
        if (!this.c) {
            ng0.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? ql0Var.J.e : ql0Var.q()) {
            ng0.a("node not yet measured");
        }
        h(ql0Var, z);
    }

    public final void h(ql0 ql0Var, boolean z) {
        ct0 ct0Var;
        rl0 rl0Var;
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var2 = (ql0) objArr[i2];
            ol0 ol0Var = ol0.e;
            if ((!z && (ql0Var2.r() == ol0Var || ql0Var2.J.p.B.e())) || (z && (ql0Var2.s() == ol0Var || ((ct0Var = ql0Var2.J.q) != null && (rl0Var = ct0Var.v) != null && rl0Var.e())))) {
                boolean zK = bk.K(ql0Var2);
                ul0 ul0Var = ql0Var2.J;
                if (zK && !z) {
                    if (ul0Var.e && this.b.d(ql0Var2)) {
                        o(ql0Var2, true);
                    } else {
                        g(ql0Var2, true);
                    }
                }
                if (z ? ul0Var.e : ql0Var2.q()) {
                    o(ql0Var2, z);
                }
                if (!(z ? ul0Var.e : ql0Var2.q())) {
                    h(ql0Var2, z);
                }
            }
        }
        if (z ? ql0Var.J.e : ql0Var.q()) {
            o(ql0Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [sv0] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [sv0] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [iy0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [iy0] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean l(ha0 ha0Var) {
        boolean z;
        sv0 sv0Var;
        ?? K;
        boolean z2;
        ql0 ql0Var;
        boolean z3;
        boolean zO;
        oc ocVar = this.b;
        ql0 ql0Var2 = this.a;
        if (!ql0Var2.J()) {
            ng0.a("performMeasureAndLayout called with unattached root");
        }
        if (!ql0Var2.K()) {
            ng0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            ng0.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zS = ocVar.s();
                qt0 qt0Var = (qt0) ocVar.a;
                if (zS) {
                    z = false;
                    while (true) {
                        qt0 qt0Var2 = (qt0) ocVar.c;
                        qt0 qt0Var3 = (qt0) ocVar.b;
                        if (!((vq1) qt0Var.f).isEmpty()) {
                            ql0Var = (ql0) ((vq1) qt0Var.f).first();
                            qt0Var.v(ql0Var);
                            z3 = ql0Var.l != null;
                            z2 = false;
                        } else if (!((vq1) qt0Var3.f).isEmpty()) {
                            ql0Var = (ql0) ((vq1) qt0Var3.f).first();
                            qt0Var3.v(ql0Var);
                            z3 = ql0Var.l != null;
                            z2 = true;
                        } else {
                            if (((vq1) qt0Var2.f).isEmpty()) {
                                break;
                            }
                            ql0 ql0Var3 = (ql0) ((vq1) qt0Var2.f).first();
                            qt0Var2.v(ql0Var3);
                            z2 = true;
                            ql0Var = ql0Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zO = a(this, ql0Var, z3);
                        } else {
                            zO = o(ql0Var, z3);
                            if (ql0Var.J.f) {
                                ocVar.c(ql0Var, gj0.f);
                            }
                            if (ql0Var.p()) {
                                ocVar.c(ql0Var, gj0.h);
                            }
                        }
                        if (ql0Var == ql0Var2 && zO) {
                            z = true;
                        }
                    }
                    if (ha0Var != null) {
                        ha0Var.a();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        iy0 iy0Var = this.f;
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        int i2 = 0;
        while (i2 < i) {
            xz0 xz0Var = ((ql0) objArr[i2]).I;
            tg0 tg0Var = xz0Var.c;
            boolean zG = d01.g(4194304);
            if (zG) {
                sv0Var = tg0Var.Z;
            } else {
                sv0Var = tg0Var.Z.i;
                if (sv0Var == null) {
                }
                i2++;
                z4 = false;
            }
            ue1 ue1Var = c01.U;
            sv0 sv0VarY0 = tg0Var.Y0(zG);
            while (sv0VarY0 != null && (sv0VarY0.h & 4194304) != 0) {
                if ((sv0VarY0.g & 4194304) != 0) {
                    ?? r12 = sv0VarY0;
                    ?? iy0Var2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof xk0) {
                            ((xk0) r12).o(xz0Var.c);
                        } else {
                            if ((r12.g & 4194304) != 0 && (r12 instanceof yw)) {
                                sv0 sv0Var2 = ((yw) r12).t;
                                ?? r15 = z4;
                                K = r12;
                                iy0Var2 = iy0Var2;
                                while (sv0Var2 != null) {
                                    if ((sv0Var2.g & 4194304) != 0) {
                                        r15++;
                                        iy0Var2 = iy0Var2;
                                        if (r15 == 1) {
                                            K = sv0Var2;
                                        } else {
                                            if (iy0Var2 == 0) {
                                                iy0Var2 = new iy0(new sv0[16]);
                                            }
                                            if (K != 0) {
                                                iy0Var2.b(K);
                                                K = 0;
                                            }
                                            iy0Var2.b(sv0Var2);
                                        }
                                    }
                                    sv0Var2 = sv0Var2.j;
                                    K = K;
                                    iy0Var2 = iy0Var2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z4 = false;
                            r12 = K;
                            iy0Var2 = iy0Var2;
                        }
                        K = bl.k(iy0Var2);
                        z4 = false;
                        r12 = K;
                        iy0Var2 = iy0Var2;
                    }
                }
                if (sv0VarY0 != sv0Var) {
                    sv0VarY0 = sv0VarY0.j;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        iy0Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [iy0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void m(ql0 ql0Var, long j) {
        sv0 sv0Var;
        if (ql0Var.R) {
            return;
        }
        ql0 ql0Var2 = this.a;
        if (ql0Var == ql0Var2) {
            ng0.a("measureAndLayout called on root");
        }
        if (!ql0Var2.J()) {
            ng0.a("performMeasureAndLayout called with unattached root");
        }
        if (!ql0Var2.K()) {
            ng0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            ng0.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                oc ocVar = this.b;
                ((qt0) ocVar.a).v(ql0Var);
                ((qt0) ocVar.b).v(ql0Var);
                ((qt0) ocVar.c).v(ql0Var);
                if ((c(ql0Var, new kr(j)) || ql0Var.J.f) && xi0.o(ql0Var.L(), Boolean.TRUE)) {
                    ql0Var.M();
                }
                f(ql0Var);
                d(ql0Var, new kr(j));
                if (ql0Var.p() && ql0Var.K()) {
                    ql0Var.V();
                    xg0 xg0Var = this.e;
                    xg0Var.getClass();
                    if (ql0Var.Q > 0) {
                        ((iy0) xg0Var.f).b(ql0Var);
                        ql0Var.P = true;
                    }
                }
                e();
            } finally {
            }
        }
        iy0 iy0Var = this.f;
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            xz0 xz0Var = ((ql0) objArr[i2]).I;
            tg0 tg0Var = xz0Var.c;
            boolean zG = d01.g(4194304);
            if (zG) {
                sv0Var = tg0Var.Z;
            } else {
                sv0Var = tg0Var.Z.i;
                if (sv0Var == null) {
                }
            }
            ue1 ue1Var = c01.U;
            for (sv0 sv0VarY0 = tg0Var.Y0(zG); sv0VarY0 != null && (sv0VarY0.h & 4194304) != 0; sv0VarY0 = sv0VarY0.j) {
                if ((sv0VarY0.g & 4194304) != 0) {
                    ?? K = sv0VarY0;
                    ?? iy0Var2 = 0;
                    while (K != 0) {
                        if (K instanceof xk0) {
                            ((xk0) K).o(xz0Var.c);
                        } else if ((K.g & 4194304) != 0 && (K instanceof yw)) {
                            sv0 sv0Var2 = ((yw) K).t;
                            int i3 = 0;
                            K = K;
                            iy0Var2 = iy0Var2;
                            while (sv0Var2 != null) {
                                if ((sv0Var2.g & 4194304) != 0) {
                                    i3++;
                                    iy0Var2 = iy0Var2;
                                    if (i3 == 1) {
                                        K = sv0Var2;
                                    } else {
                                        if (iy0Var2 == 0) {
                                            iy0Var2 = new iy0(new sv0[16]);
                                        }
                                        if (K != 0) {
                                            iy0Var2.b(K);
                                            K = 0;
                                        }
                                        iy0Var2.b(sv0Var2);
                                    }
                                }
                                sv0Var2 = sv0Var2.j;
                                K = K;
                                iy0Var2 = iy0Var2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        K = bl.k(iy0Var2);
                    }
                }
                if (sv0VarY0 != sv0Var) {
                }
            }
        }
        iy0Var.g();
    }

    public final void n() {
        oc ocVar = this.b;
        if (ocVar.s()) {
            ql0 ql0Var = this.a;
            if (!ql0Var.J()) {
                ng0.a("performMeasureAndLayout called with unattached root");
            }
            if (!ql0Var.K()) {
                ng0.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                ng0.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((vq1) ((qt0) ocVar.c).f).isEmpty() || ((vq1) ((qt0) ocVar.a).f).isEmpty()) ? false : true) {
                        if (ql0Var.l != null) {
                            q(ql0Var, true);
                        } else {
                            p(ql0Var);
                        }
                    }
                    q(ql0Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean o(ql0 ql0Var, boolean z) {
        kr krVar;
        boolean zD = false;
        if (!ql0Var.R && k(ql0Var)) {
            if (ql0Var == this.a) {
                krVar = this.i;
                krVar.getClass();
            } else {
                krVar = null;
            }
            if (z) {
                if (ql0Var.J.e) {
                    zD = c(ql0Var, krVar);
                }
            } else if (ql0Var.q()) {
                zD = d(ql0Var, krVar);
            }
            e();
        }
        return zD;
    }

    public final void p(ql0 ql0Var) {
        iy0 iy0VarY = ql0Var.y();
        Object[] objArr = iy0VarY.e;
        int i = iy0VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var2 = (ql0) objArr[i2];
            if (ql0Var2.r() == ol0.e || ql0Var2.J.p.B.e()) {
                if (bk.K(ql0Var2)) {
                    q(ql0Var2, true);
                } else {
                    p(ql0Var2);
                }
            }
        }
    }

    public final void q(ql0 ql0Var, boolean z) {
        kr krVar;
        if (ql0Var.R) {
            return;
        }
        if (ql0Var == this.a) {
            krVar = this.i;
            krVar.getClass();
        } else {
            krVar = null;
        }
        if (z) {
            c(ql0Var, krVar);
        } else {
            d(ql0Var, krVar);
        }
    }

    public final boolean r(ql0 ql0Var, boolean z) {
        int iOrdinal = ql0Var.J.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new qu0(ql0Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    ez1.a();
                    return false;
                }
                if (!ql0Var.q() || z) {
                    ql0Var.J.p.y = true;
                    if (!ql0Var.R && (ql0Var.K() || j(ql0Var))) {
                        ql0 ql0VarU = ql0Var.u();
                        if (ql0VarU == null || !ql0VarU.q()) {
                            this.b.c(ql0Var, gj0.g);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        kr krVar = this.i;
        if (krVar == null ? false : kr.b(krVar.a, j)) {
            return;
        }
        if (this.c) {
            ng0.a("updateRootConstraints called while measuring");
        }
        this.i = new kr(j);
        ql0 ql0Var = this.a;
        boolean zJ = ql0Var.J();
        ul0 ul0Var = ql0Var.J;
        if (zJ) {
            ql0 ql0Var2 = ql0Var.l;
            if (ql0Var2 != null) {
                ul0Var.e = true;
            }
            ul0Var.p.y = true;
            this.b.c(ql0Var, ql0Var2 != null ? gj0.e : gj0.g);
        }
    }
}
