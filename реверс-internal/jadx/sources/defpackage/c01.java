package defpackage;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c01 extends ws0 implements pu0, zk0 {
    public static final ue1 U = new ue1();
    public static final wk0 V = new wk0();
    public static final float[] W = ou0.a();
    public static final yz0 X = new yz0();
    public static final wr Y = new wr(27);
    public boolean A;
    public sa0 B;
    public hx C;
    public al0 D;
    public vu0 F;
    public ox0 G;
    public float I;
    public yx0 J;
    public wk0 K;
    public boolean M;
    public boolean N;
    public nc0 O;
    public cj P;
    public z4 Q;
    public boolean S;
    public v31 T;
    public final ql0 w;
    public c01 x;
    public c01 y;
    public boolean z;
    public float E = 0.8f;
    public long H = 0;
    public ym1 L = pv.w;
    public final b01 R = new b01(this, 1);

    public c01(ql0 ql0Var) {
        this.w = ql0Var;
        this.C = ql0Var.B;
        this.D = ql0Var.C;
    }

    public static c01 r1(zk0 zk0Var) {
        c01 c01Var;
        zs0 zs0Var = zk0Var instanceof zs0 ? (zs0) zk0Var : null;
        if (zs0Var != null && (c01Var = zs0Var.e.w) != null) {
            return c01Var;
        }
        zk0Var.getClass();
        return (c01) zk0Var;
    }

    @Override // defpackage.zk0
    public final boolean B() {
        return W0().r;
    }

    @Override // defpackage.ws0
    public final boolean B0() {
        return this.F != null;
    }

    @Override // defpackage.zk0
    public final void C(float[] fArr) {
        w31 w31VarA = tl0.a(this.w);
        c01 c01VarR1 = r1(al.w(this));
        u1(c01VarR1, fArr);
        if (w31VarA instanceof h4) {
            ((h4) w31VarA).p(fArr);
            return;
        }
        long jC = c01VarR1.c(0L);
        if ((9223372034707292159L & jC) != 9205357640488583168L) {
            ou0.i(fArr, Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jC & 4294967295L)));
        }
    }

    @Override // defpackage.ws0
    public final ql0 C0() {
        return this.w;
    }

    @Override // defpackage.zk0
    public final long D(zk0 zk0Var, long j) {
        if (zk0Var instanceof zs0) {
            zs0 zs0Var = (zs0) zk0Var;
            zs0Var.e.w.f1();
            return zs0Var.D(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        c01 c01VarR1 = r1(zk0Var);
        c01VarR1.f1();
        c01 c01VarS0 = S0(c01VarR1);
        while (c01VarR1 != c01VarS0) {
            v31 v31Var = c01VarR1.T;
            if (v31Var != null) {
                qc0 qc0Var = (qc0) v31Var;
                float[] fArrB = qc0Var.b();
                if (!qc0Var.w) {
                    j = ou0.b(j, fArrB);
                }
            }
            j = hk.M(j, c01VarR1.H);
            c01VarR1 = c01VarR1.y;
            c01VarR1.getClass();
        }
        return M0(c01VarS0, j);
    }

    @Override // defpackage.ws0
    public final vu0 D0() {
        vu0 vu0Var = this.F;
        if (vu0Var != null) {
            return vu0Var;
        }
        yc.l("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.ws0
    public final ws0 E0() {
        return this.y;
    }

    @Override // defpackage.zk0
    public final void F(zk0 zk0Var, float[] fArr) {
        c01 c01VarR1 = r1(zk0Var);
        c01VarR1.f1();
        c01 c01VarS0 = S0(c01VarR1);
        ou0.d(fArr);
        c01VarR1.u1(c01VarS0, fArr);
        t1(c01VarS0, fArr);
    }

    @Override // defpackage.ws0
    public final long F0() {
        return this.H;
    }

    @Override // defpackage.zk0
    public final pc1 I(zk0 zk0Var, boolean z) {
        if (!W0().r) {
            ng0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!zk0Var.B()) {
            ng0.b("LayoutCoordinates " + zk0Var + " is not attached!");
        }
        c01 c01VarR1 = r1(zk0Var);
        c01VarR1.f1();
        c01 c01VarS0 = S0(c01VarR1);
        yx0 yx0Var = this.J;
        if (yx0Var == null) {
            yx0Var = new yx0();
            this.J = yx0Var;
        }
        yx0Var.a = 0.0f;
        yx0Var.b = 0.0f;
        yx0Var.c = (int) (zk0Var.K() >> 32);
        yx0Var.d = (int) (zk0Var.K() & 4294967295L);
        while (c01VarR1 != c01VarS0) {
            c01VarR1.n1(yx0Var, z, false);
            if (yx0Var.b()) {
                return pc1.e;
            }
            c01VarR1 = c01VarR1.y;
            c01VarR1.getClass();
        }
        L0(c01VarS0, yx0Var, z);
        return new pc1(yx0Var.a, yx0Var.b, yx0Var.c, yx0Var.d);
    }

    @Override // defpackage.ws0
    public final void J0() {
        k0(this.H, this.I, this.B);
    }

    @Override // defpackage.zk0
    public final long K() {
        return this.g;
    }

    public final void L0(c01 c01Var, yx0 yx0Var, boolean z) {
        if (c01Var == this) {
            return;
        }
        c01 c01Var2 = this.y;
        if (c01Var2 != null) {
            c01Var2.L0(c01Var, yx0Var, z);
        }
        long j = this.H;
        float f = (int) (j >> 32);
        yx0Var.a -= f;
        yx0Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        yx0Var.b -= f2;
        yx0Var.d -= f2;
        v31 v31Var = this.T;
        if (v31Var != null) {
            qc0 qc0Var = (qc0) v31Var;
            float[] fArrA = qc0Var.a();
            if (!qc0Var.w) {
                if (fArrA == null) {
                    yx0Var.a = 0.0f;
                    yx0Var.b = 0.0f;
                    yx0Var.c = 0.0f;
                    yx0Var.d = 0.0f;
                } else {
                    ou0.c(fArrA, yx0Var);
                }
            }
            if (this.A && z) {
                long j2 = this.g;
                yx0Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // defpackage.zk0
    public final long M(long j) {
        if (!W0().r) {
            ng0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f1();
        while (this != null) {
            ql0 ql0Var = this.w;
            if (this == ql0Var.I.d && !ql0Var.g) {
                long jB = ((h4) tl0.a(ql0Var)).getRectManager().b(ql0Var);
                if (!oh0.a(jB, 9223372034707292159L)) {
                    return hk.M(j, jB);
                }
            }
            v31 v31Var = this.T;
            if (v31Var != null) {
                qc0 qc0Var = (qc0) v31Var;
                float[] fArrB = qc0Var.b();
                if (!qc0Var.w) {
                    j = ou0.b(j, fArrB);
                }
            }
            j = hk.M(j, this.H);
            this = this.y;
        }
        return j;
    }

    public final long M0(c01 c01Var, long j) {
        if (c01Var == this) {
            return j;
        }
        c01 c01Var2 = this.y;
        return (c01Var2 == null || xi0.o(c01Var, c01Var2)) ? T0(j) : T0(c01Var2.M0(c01Var, j));
    }

    public final long N0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - h0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - g0();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    public final float O0(long j, long j2) {
        if (h0() >= Float.intBitsToFloat((int) (j2 >> 32)) && g0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jN0 = N0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - h0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - g0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void P0(cj cjVar, nc0 nc0Var) {
        v31 v31Var = this.T;
        if (v31Var == null) {
            long j = this.H;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            cjVar.f(f, f2);
            Q0(cjVar, nc0Var);
            cjVar.f(-f, -f2);
            return;
        }
        qc0 qc0Var = (qc0) v31Var;
        ej ejVar = qc0Var.q;
        qc0Var.g();
        qc0Var.x = qc0Var.e.a.G() > 0.0f;
        oc ocVar = ejVar.f;
        ocVar.y(cjVar);
        ocVar.b = nc0Var;
        xk.o(ejVar, qc0Var.e);
    }

    public final void Q0(cj cjVar, nc0 nc0Var) {
        c01 c01Var;
        cj cjVar2;
        nc0 nc0Var2;
        sv0 sv0VarX0 = X0(4);
        if (sv0VarX0 == null) {
            l1(cjVar, nc0Var);
            return;
        }
        ql0 ql0Var = this.w;
        ql0Var.getClass();
        sl0 sharedDrawScope = ((h4) tl0.a(ql0Var)).getSharedDrawScope();
        long jP = xk.P(this.g);
        sharedDrawScope.getClass();
        iy0 iy0Var = null;
        while (sv0VarX0 != null) {
            if (sv0VarX0 instanceof o10) {
                c01Var = this;
                cjVar2 = cjVar;
                nc0Var2 = nc0Var;
                sharedDrawScope.c(cjVar2, jP, c01Var, (o10) sv0VarX0, nc0Var2);
            } else {
                c01Var = this;
                cjVar2 = cjVar;
                nc0Var2 = nc0Var;
                if ((sv0VarX0.g & 4) != 0 && (sv0VarX0 instanceof yw)) {
                    int i = 0;
                    for (sv0 sv0Var = ((yw) sv0VarX0).t; sv0Var != null; sv0Var = sv0Var.j) {
                        if ((sv0Var.g & 4) != 0) {
                            i++;
                            if (i == 1) {
                                sv0VarX0 = sv0Var;
                            } else {
                                if (iy0Var == null) {
                                    iy0Var = new iy0(new sv0[16]);
                                }
                                if (sv0VarX0 != null) {
                                    iy0Var.b(sv0VarX0);
                                    sv0VarX0 = null;
                                }
                                iy0Var.b(sv0Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                cjVar = cjVar2;
                this = c01Var;
                nc0Var = nc0Var2;
            }
            sv0VarX0 = bl.k(iy0Var);
            cjVar = cjVar2;
            this = c01Var;
            nc0Var = nc0Var2;
        }
    }

    public abstract void R0();

    public final c01 S0(c01 c01Var) {
        ql0 ql0VarU = c01Var.w;
        ql0 ql0Var = this.w;
        if (ql0VarU == ql0Var) {
            sv0 sv0VarW0 = c01Var.W0();
            sv0 sv0VarW02 = W0();
            if (!sv0VarW02.e.r) {
                ng0.b("visitLocalAncestors called on an unattached node");
            }
            for (sv0 sv0Var = sv0VarW02.e.i; sv0Var != null; sv0Var = sv0Var.i) {
                if ((sv0Var.g & 2) != 0 && sv0Var == sv0VarW0) {
                    return c01Var;
                }
            }
            return this;
        }
        while (ql0VarU.s > ql0Var.s) {
            ql0VarU = ql0VarU.u();
            ql0VarU.getClass();
        }
        ql0 ql0VarU2 = ql0Var;
        while (ql0VarU2.s > ql0VarU.s) {
            ql0VarU2 = ql0VarU2.u();
            ql0VarU2.getClass();
        }
        while (ql0VarU != ql0VarU2) {
            ql0VarU = ql0VarU.u();
            ql0VarU2 = ql0VarU2.u();
            if (ql0VarU == null || ql0VarU2 == null) {
                yc.p("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (ql0VarU2 != ql0Var) {
            if (ql0VarU != c01Var.w) {
                return ql0VarU.I.c;
            }
            return c01Var;
        }
        return this;
    }

    public final long T0(long j) {
        long j2 = this.H;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        v31 v31Var = this.T;
        if (v31Var != null) {
            qc0 qc0Var = (qc0) v31Var;
            float[] fArrA = qc0Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!qc0Var.w) {
                return ou0.b(jFloatToRawIntBits, fArrA);
            }
        }
        return jFloatToRawIntBits;
    }

    public abstract ys0 U0();

    public final long V0() {
        return this.C.X(this.w.D.g());
    }

    public abstract sv0 W0();

    public final sv0 X0(int i) {
        boolean zG = d01.g(i);
        sv0 sv0VarW0 = W0();
        if (!zG && (sv0VarW0 = sv0VarW0.i) == null) {
            return null;
        }
        for (sv0 sv0VarY0 = Y0(zG); sv0VarY0 != null && (sv0VarY0.h & i) != 0; sv0VarY0 = sv0VarY0.j) {
            if ((sv0VarY0.g & i) != 0) {
                return sv0VarY0;
            }
            if (sv0VarY0 == sv0VarW0) {
                return null;
            }
        }
        return null;
    }

    public final sv0 Y0(boolean z) {
        sv0 sv0VarW0;
        xz0 xz0Var = this.w.I;
        if (xz0Var.d == this) {
            return xz0Var.f;
        }
        c01 c01Var = this.y;
        if (!z) {
            if (c01Var != null) {
                return c01Var.W0();
            }
            return null;
        }
        if (c01Var == null || (sv0VarW0 = c01Var.W0()) == null) {
            return null;
        }
        return sv0VarW0.j;
    }

    public final void Z0(sv0 sv0Var, a01 a01Var, long j, td0 td0Var, int i, boolean z) {
        if (sv0Var == null) {
            c1(a01Var, j, td0Var, i, z);
            return;
        }
        if (!a01Var.c(sv0Var)) {
            Z0(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z);
            return;
        }
        int i2 = td0Var.g;
        sx0 sx0Var = td0Var.e;
        td0Var.b(i2 + 1, sx0Var.b);
        td0Var.g++;
        sx0Var.a(sv0Var);
        td0Var.f.a(xk.a(-1.0f, z, false));
        Z0(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z);
        td0Var.g = i2;
    }

    public final void a1(sv0 sv0Var, a01 a01Var, long j, td0 td0Var, int i, boolean z, float f) {
        if (sv0Var == null) {
            c1(a01Var, j, td0Var, i, z);
            return;
        }
        if (!a01Var.c(sv0Var)) {
            a1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z, f);
            return;
        }
        int i2 = td0Var.g;
        sx0 sx0Var = td0Var.e;
        td0Var.b(i2 + 1, sx0Var.b);
        td0Var.g++;
        sx0Var.a(sv0Var);
        td0Var.f.a(xk.a(f, z, false));
        k1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z, f, true);
        td0Var.g = i2;
    }

    @Override // defpackage.hx
    public final float b() {
        return this.w.B.b();
    }

    public final void b1(a01 a01Var, long j, td0 td0Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        sv0 sv0VarX0 = X0(a01Var.b());
        if (!x1(j)) {
            if (i == 1) {
                float fO0 = O0(j, V0());
                if ((Float.floatToRawIntBits(fO0) & Integer.MAX_VALUE) < 2139095040) {
                    if (td0Var.g != td0Var.e.b - 1) {
                        if (el.r(td0Var.a(), xk.a(fO0, false, false)) <= 0) {
                            return;
                        }
                    }
                    a1(sv0VarX0, a01Var, j, td0Var, i, false, fO0);
                    return;
                }
                return;
            }
            return;
        }
        if (sv0VarX0 == null) {
            c1(a01Var, j, td0Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < h0() && fIntBitsToFloat2 < g0()) {
            Z0(sv0VarX0, a01Var, j, td0Var, i, z);
            return;
        }
        float fO02 = i == 1 ? O0(j, V0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fO02) & Integer.MAX_VALUE) < 2139095040) {
            if (td0Var.g != td0Var.e.b - 1) {
                z2 = z;
                if (el.r(td0Var.a(), xk.a(fO02, z2, false)) > 0) {
                }
                k1(sv0VarX0, a01Var, j, td0Var, i, z2, fO02, z3);
            }
            z2 = z;
            z3 = true;
            k1(sv0VarX0, a01Var, j, td0Var, i, z2, fO02, z3);
        }
        z2 = z;
        z3 = false;
        k1(sv0VarX0, a01Var, j, td0Var, i, z2, fO02, z3);
    }

    @Override // defpackage.zk0
    public final long c(long j) {
        if (!W0().r) {
            ng0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((h4) tl0.a(this.w)).q(M(j));
    }

    public void c1(a01 a01Var, long j, td0 td0Var, int i, boolean z) {
        c01 c01Var = this.x;
        if (c01Var != null) {
            c01Var.b1(a01Var, c01Var.T0(j), td0Var, i, z);
        }
    }

    public final void d1() {
        v31 v31Var = this.T;
        if (v31Var != null) {
            ((qc0) v31Var).c();
            return;
        }
        c01 c01Var = this.y;
        if (c01Var != null) {
            c01Var.d1();
        }
    }

    public final boolean e1() {
        if (this.T != null && this.E <= 0.0f) {
            return true;
        }
        c01 c01Var = this.y;
        if (c01Var != null) {
            return c01Var.e1();
        }
        return false;
    }

    public final void f1() {
        this.w.J.b();
    }

    @Override // defpackage.zk0
    public final long g(long j) {
        if (!W0().r) {
            ng0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        zk0 zk0VarW = al.w(this);
        h4 h4Var = (h4) tl0.a(this.w);
        h4Var.y();
        return D(zk0VarW, w01.d(ou0.b(j, h4Var.a0), zk0VarW.M(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [iy0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void g1() {
        sv0 sv0VarW0;
        boolean zG = d01.g(128);
        sv0 sv0VarY0 = Y0(zG);
        if (sv0VarY0 == null || (sv0VarY0.e.h & 128) == 0) {
            return;
        }
        sp1 sp1VarL = uc1.l();
        sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
        sp1 sp1VarU = uc1.u(sp1VarL);
        try {
            if (!zG) {
                sv0VarW0 = W0().i;
                if (sv0VarW0 == null) {
                }
            }
            sv0VarW0 = W0();
            for (sv0 sv0VarY02 = Y0(zG); sv0VarY02 != null; sv0VarY02 = sv0VarY02.j) {
                if ((sv0VarY02.h & 128) == 0) {
                    break;
                }
                if ((sv0VarY02.g & 128) != 0) {
                    ?? K = sv0VarY02;
                    ?? iy0Var = 0;
                    while (K != 0) {
                        if (K instanceof av0) {
                            ((av0) K).c(this.g);
                        } else if ((K.g & 128) != 0 && (K instanceof yw)) {
                            sv0 sv0Var = ((yw) K).t;
                            int i = 0;
                            K = K;
                            iy0Var = iy0Var;
                            while (sv0Var != null) {
                                if ((sv0Var.g & 128) != 0) {
                                    i++;
                                    iy0Var = iy0Var;
                                    if (i == 1) {
                                        K = sv0Var;
                                    } else {
                                        if (iy0Var == 0) {
                                            iy0Var = new iy0(new sv0[16]);
                                        }
                                        if (K != 0) {
                                            iy0Var.b(K);
                                            K = 0;
                                        }
                                        iy0Var.b(sv0Var);
                                    }
                                }
                                sv0Var = sv0Var.j;
                                K = K;
                                iy0Var = iy0Var;
                            }
                            if (i == 1) {
                            }
                        }
                        K = bl.k(iy0Var);
                    }
                }
                if (sv0VarY02 == sv0VarW0) {
                    break;
                }
            }
        } finally {
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
        }
    }

    @Override // defpackage.pi0
    public final al0 getLayoutDirection() {
        return this.w.C;
    }

    @Override // defpackage.zk0
    public final long h(long j) {
        long jM = M(j);
        h4 h4Var = (h4) tl0.a(this.w);
        h4Var.y();
        return ou0.b(jM, h4Var.W);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [sv0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void h1() {
        boolean zG = d01.g(4194304);
        sv0 sv0VarW0 = W0();
        if (!zG && (sv0VarW0 = sv0VarW0.i) == null) {
            return;
        }
        for (sv0 sv0VarY0 = Y0(zG); sv0VarY0 != null && (sv0VarY0.h & 4194304) != 0; sv0VarY0 = sv0VarY0.j) {
            if ((sv0VarY0.g & 4194304) != 0) {
                ?? K = sv0VarY0;
                ?? iy0Var = 0;
                while (K != 0) {
                    if (K instanceof xk0) {
                        ((xk0) K).o(this);
                    } else if ((K.g & 4194304) != 0 && (K instanceof yw)) {
                        sv0 sv0Var = ((yw) K).t;
                        int i = 0;
                        K = K;
                        iy0Var = iy0Var;
                        while (sv0Var != null) {
                            if ((sv0Var.g & 4194304) != 0) {
                                i++;
                                iy0Var = iy0Var;
                                if (i == 1) {
                                    K = sv0Var;
                                } else {
                                    if (iy0Var == 0) {
                                        iy0Var = new iy0(new sv0[16]);
                                    }
                                    if (K != 0) {
                                        iy0Var.b(K);
                                        K = 0;
                                    }
                                    iy0Var.b(sv0Var);
                                }
                            }
                            sv0Var = sv0Var.j;
                            K = K;
                            iy0Var = iy0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    K = bl.k(iy0Var);
                }
            }
            if (sv0VarY0 == sv0VarW0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [sv0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [sv0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [iy0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.z61, defpackage.pu0
    public final Object i() {
        ql0 ql0Var = this.w;
        if (!ql0Var.I.d(64)) {
            return null;
        }
        W0();
        Object objN0 = null;
        for (sv0 sv0Var = ql0Var.I.e; sv0Var != null; sv0Var = sv0Var.i) {
            if ((sv0Var.g & 64) != 0) {
                ?? K = sv0Var;
                ?? iy0Var = 0;
                while (K != 0) {
                    if (K instanceof w41) {
                        objN0 = ((w41) K).n0(objN0);
                    } else if ((K.g & 64) != 0 && (K instanceof yw)) {
                        sv0 sv0Var2 = ((yw) K).t;
                        int i = 0;
                        K = K;
                        iy0Var = iy0Var;
                        while (sv0Var2 != null) {
                            if ((sv0Var2.g & 64) != 0) {
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
        }
        return objN0;
    }

    public final void i1() {
        this.z = true;
        this.R.a();
        o1();
        if (oh0.a(this.H, 0L)) {
            return;
        }
        this.w.P(this);
    }

    @Override // defpackage.zk0
    public final zk0 j() {
        boolean z = W0().r;
        ql0 ql0Var = this.w;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (ql0 ql0VarU = ql0Var; ql0VarU != null; ql0VarU = ql0VarU.u()) {
                sb.append("\n|");
                sb.append(ql0VarU);
                sb.append(" isAttached=");
                sb.append(ql0VarU.J());
                sb.append(" modifier=");
                sb.append(ql0VarU.N);
                sb.append(" tail=");
                sb.append(W0());
            }
            ng0.b(sb.toString());
        }
        f1();
        return ql0Var.I.d.y;
    }

    public final void j1() {
        boolean zG = d01.g(1048576);
        sv0 sv0VarY0 = Y0(zG);
        if (sv0VarY0 == null || (sv0VarY0.e.h & 1048576) == 0) {
            return;
        }
        sv0 sv0VarW0 = W0();
        if (!zG && (sv0VarW0 = sv0VarW0.i) == null) {
            return;
        }
        for (sv0 sv0VarY02 = Y0(zG); sv0VarY02 != null && (sv0VarY02.h & 1048576) != 0; sv0VarY02 = sv0VarY02.j) {
            if ((sv0VarY02.g & 1048576) != 0) {
                sv0 sv0VarK = sv0VarY02;
                iy0 iy0Var = null;
                while (sv0VarK != null) {
                    if (!(sv0VarK instanceof w80) && (sv0VarK.g & 1048576) != 0 && (sv0VarK instanceof yw)) {
                        int i = 0;
                        for (sv0 sv0Var = ((yw) sv0VarK).t; sv0Var != null; sv0Var = sv0Var.j) {
                            if ((sv0Var.g & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    sv0VarK = sv0Var;
                                } else {
                                    if (iy0Var == null) {
                                        iy0Var = new iy0(new sv0[16]);
                                    }
                                    if (sv0VarK != null) {
                                        iy0Var.b(sv0VarK);
                                        sv0VarK = null;
                                    }
                                    iy0Var.b(sv0Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    sv0VarK = bl.k(iy0Var);
                }
            }
            if (sv0VarY02 == sv0VarW0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0 A[PHI: r4
      0x01d0: PHI (r4v12 ??) = (r4v1 ??), (r4v1 ??), (r4v14 ??) binds: [B:55:0x019a, B:57:0x019e, B:71:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r3v18, types: [sv0] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [iy0] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [iy0] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1(sv0 sv0Var, a01 a01Var, long j, td0 td0Var, int i, boolean z, float f, boolean z2) {
        ?? K;
        if (sv0Var == null) {
            c1(a01Var, j, td0Var, i, z);
            return;
        }
        if (!a01Var.c(sv0Var)) {
            k1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        boolean z3 = z;
        char c = 3;
        if (i2 == 3 || i2 == 4) {
            ?? r3 = sv0Var;
            ?? iy0Var = 0;
            while (true) {
                if (r3 == 0) {
                    break;
                }
                int i3 = 0;
                if (r3 instanceof p81) {
                    long jR = ((p81) r3).r();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    ql0 ql0Var = this.w;
                    al0 al0Var = ql0Var.C;
                    int i5 = l12.b;
                    long j2 = Long.MIN_VALUE & jR;
                    al0 al0Var2 = al0.e;
                    if (fIntBitsToFloat >= (-((j2 == 0 || al0Var == al0Var2) ? t61.b(0, jR) : t61.b(2, jR)))) {
                        if (Float.intBitsToFloat(i4) < h0() + ((j2 == 0 || ql0Var.C == al0Var2) ? t61.b(2, jR) : t61.b(0, jR))) {
                            int i6 = (int) (j & 4294967295L);
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i6);
                            int i7 = l12.b;
                            if (fIntBitsToFloat2 >= (-t61.b(1, jR))) {
                                if (Float.intBitsToFloat(i6) < t61.b(3, jR) + g0()) {
                                    kx0 kx0Var = td0Var.f;
                                    sx0 sx0Var = td0Var.e;
                                    int i8 = td0Var.g;
                                    int i9 = sx0Var.b;
                                    if (i8 == i9 - 1) {
                                        td0Var.b(i8 + 1, i9);
                                        td0Var.g++;
                                        sx0Var.a(sv0Var);
                                        kx0Var.a(xk.a(0.0f, z3, true));
                                        k1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i2, z3, f, z2);
                                        td0Var.g = i8;
                                        return;
                                    }
                                    long jA = td0Var.a();
                                    int i10 = td0Var.g;
                                    if (!el.F(jA)) {
                                        if (el.B(jA) > 0.0f) {
                                            int i11 = td0Var.g;
                                            td0Var.b(i11 + 1, sx0Var.b);
                                            td0Var.g++;
                                            sx0Var.a(sv0Var);
                                            kx0Var.a(xk.a(0.0f, z3, true));
                                            k1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z3, f, z2);
                                            td0Var.g = i11;
                                            return;
                                        }
                                        return;
                                    }
                                    int i12 = sx0Var.b;
                                    int i13 = i12 - 1;
                                    td0Var.g = i13;
                                    td0Var.b(i12, sx0Var.b);
                                    td0Var.g++;
                                    sx0Var.a(sv0Var);
                                    kx0Var.a(xk.a(0.0f, z3, true));
                                    k1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z3, f, z2);
                                    td0Var.g = i13;
                                    if (el.B(td0Var.a()) < 0.0f) {
                                        td0Var.b(i10 + 1, td0Var.g + 1);
                                    }
                                    td0Var.g = i10;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    char c2 = c;
                    if ((r3.g & 16) == 0 || !(r3 instanceof yw)) {
                        K = bl.k(iy0Var);
                    } else {
                        sv0 sv0Var2 = ((yw) r3).t;
                        K = r3;
                        iy0Var = iy0Var;
                        while (sv0Var2 != null) {
                            if ((sv0Var2.g & 16) != 0) {
                                i3++;
                                iy0Var = iy0Var;
                                if (i3 == 1) {
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
                        if (i3 == 1) {
                        }
                    }
                    i2 = i;
                    z3 = z;
                    c = c2;
                    r3 = K;
                    iy0Var = iy0Var;
                }
            }
        }
        if (z2) {
            a1(sv0Var, a01Var, j, td0Var, i, z, f);
        } else {
            q1(sv0Var, a01Var, j, td0Var, i, z, f);
        }
    }

    @Override // defpackage.hx
    public final float l() {
        return this.w.B.l();
    }

    public abstract void l1(cj cjVar, nc0 nc0Var);

    public final void m1(long j, float f, sa0 sa0Var) {
        v1(sa0Var, false);
        boolean zA = oh0.a(this.H, j);
        ql0 ql0Var = this.w;
        if (!zA) {
            ((h4) tl0.a(ql0Var)).K(-4.0f);
            this.H = j;
            v31 v31Var = this.T;
            if (v31Var != null) {
                ((qc0) v31Var).d(j);
            } else {
                c01 c01Var = this.y;
                if (c01Var != null) {
                    c01Var.d1();
                }
            }
            ql0Var.P(this);
            ws0.H0(this);
            w31 w31Var = ql0Var.r;
            if (w31Var != null) {
                ((h4) w31Var).t(ql0Var);
            }
        }
        this.I = f;
        if (this == ql0Var.I.d) {
            ((h4) tl0.a(ql0Var)).getRectManager().h(ql0Var);
        }
        if (this.s) {
            return;
        }
        u0(D0());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n1(yx0 yx0Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        v31 v31Var = this.T;
        if (v31Var != null) {
            if (this.A) {
                if (z2) {
                    long jV0 = V0();
                    float f = yx0Var.a;
                    float f2 = yx0Var.b;
                    if (yx0Var.c >= 0.0f) {
                        long j = this.g;
                        if (f > ((int) (j >> 32)) || yx0Var.d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jV0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jV0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (yx0Var.c - yx0Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (yx0Var.d - yx0Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        long j2 = this.g;
                        float f7 = (int) (j2 >> 32);
                        int i = (int) (jV0 >> 32);
                        float f8 = (int) (j2 & 4294967295L);
                        int i2 = (int) (jV0 & 4294967295L);
                        yx0Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                    }
                } else if (z) {
                    long j3 = this.g;
                    yx0Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (yx0Var.b()) {
                    return;
                }
            }
            qc0 qc0Var = (qc0) v31Var;
            float[] fArrB = qc0Var.b();
            if (!qc0Var.w) {
                if (fArrB == null) {
                    yx0Var.a = 0.0f;
                    yx0Var.b = 0.0f;
                    yx0Var.c = 0.0f;
                    yx0Var.d = 0.0f;
                } else {
                    ou0.c(fArrB, yx0Var);
                }
            }
        }
        long j4 = this.H;
        float f9 = (int) (j4 >> 32);
        yx0Var.a += f9;
        yx0Var.c += f9;
        float f10 = (int) (j4 & 4294967295L);
        yx0Var.b += f10;
        yx0Var.d += f10;
    }

    public final void o1() {
        if (this.T != null) {
            v1(null, false);
            this.w.Y(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [sv0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [iy0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [iy0] */
    public final void p1(vu0 vu0Var) {
        c01 c01Var;
        vu0 vu0Var2 = this.F;
        if (vu0Var != vu0Var2) {
            this.F = vu0Var;
            ql0 ql0Var = this.w;
            int i = 0;
            if (vu0Var2 == null || vu0Var.g() != vu0Var2.g() || vu0Var.d() != vu0Var2.d()) {
                int iG = vu0Var.g();
                int iD = vu0Var.d();
                v31 v31Var = this.T;
                if (v31Var != null) {
                    ((qc0) v31Var).e((((long) iG) << 32) | (((long) iD) & 4294967295L));
                } else if (ql0Var.K() && (c01Var = this.y) != null) {
                    c01Var.d1();
                }
                n0((((long) iD) & 4294967295L) | (((long) iG) << 32));
                if (this.B != null) {
                    w1(false);
                }
                boolean zG = d01.g(4);
                sv0 sv0VarW0 = W0();
                if (zG || (sv0VarW0 = sv0VarW0.i) != null) {
                    for (sv0 sv0VarY0 = Y0(zG); sv0VarY0 != null && (sv0VarY0.h & 4) != 0; sv0VarY0 = sv0VarY0.j) {
                        if ((sv0VarY0.g & 4) != 0) {
                            ?? K = sv0VarY0;
                            ?? iy0Var = 0;
                            while (K != 0) {
                                if (K instanceof o10) {
                                    ((o10) K).o0();
                                } else if ((K.g & 4) != 0 && (K instanceof yw)) {
                                    sv0 sv0Var = ((yw) K).t;
                                    int i2 = 0;
                                    K = K;
                                    iy0Var = iy0Var;
                                    while (sv0Var != null) {
                                        if ((sv0Var.g & 4) != 0) {
                                            i2++;
                                            iy0Var = iy0Var;
                                            if (i2 == 1) {
                                                K = sv0Var;
                                            } else {
                                                if (iy0Var == 0) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (K != 0) {
                                                    iy0Var.b(K);
                                                    K = 0;
                                                }
                                                iy0Var.b(sv0Var);
                                            }
                                        }
                                        sv0Var = sv0Var.j;
                                        K = K;
                                        iy0Var = iy0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                K = bl.k(iy0Var);
                            }
                        }
                        if (sv0VarY0 == sv0VarW0) {
                            break;
                        }
                    }
                }
                w31 w31Var = ql0Var.r;
                if (w31Var != null) {
                    ((h4) w31Var).t(ql0Var);
                }
                ql0Var.P(this);
            }
            ox0 ox0Var = this.G;
            if ((ox0Var == null || ox0Var.e == 0) && vu0Var.a().isEmpty()) {
                return;
            }
            ox0 ox0Var2 = this.G;
            Map mapA = vu0Var.a();
            if (ox0Var2 != null && ox0Var2.e == mapA.size()) {
                Object[] objArr = ox0Var2.b;
                int[] iArr = ox0Var2.c;
                long[] jArr = ox0Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((c3) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            ql0Var.J.p.B.f();
            ox0 ox0Var3 = this.G;
            if (ox0Var3 == null) {
                ox0 ox0Var4 = r01.a;
                ox0Var3 = new ox0();
                this.G = ox0Var3;
            }
            ox0Var3.a();
            for (Map.Entry entry : vu0Var.a().entrySet()) {
                ox0Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void q1(sv0 sv0Var, a01 a01Var, long j, td0 td0Var, int i, boolean z, float f) {
        int i2;
        if (sv0Var == null) {
            c1(a01Var, j, td0Var, i, z);
            return;
        }
        if (!a01Var.c(sv0Var)) {
            q1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z, f);
            return;
        }
        if (!a01Var.a(sv0Var)) {
            k1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z, f, false);
            return;
        }
        kx0 kx0Var = td0Var.f;
        sx0 sx0Var = td0Var.e;
        int i3 = td0Var.g;
        int i4 = sx0Var.b;
        if (i3 != i4 - 1) {
            long jA = td0Var.a();
            int i5 = td0Var.g;
            int i6 = sx0Var.b;
            int i7 = i6 - 1;
            td0Var.g = i7;
            td0Var.b(i6, sx0Var.b);
            td0Var.g++;
            sx0Var.a(sv0Var);
            kx0Var.a(xk.a(f, z, false));
            k1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z, f, false);
            td0Var.g = i7;
            long jA2 = td0Var.a();
            if (td0Var.g + 1 >= sx0Var.b - 1 || el.r(jA, jA2) <= 0) {
                td0Var.b(td0Var.g + 1, sx0Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zF = el.F(jA2);
                int i9 = td0Var.g;
                td0Var.b(i8, zF ? i9 + 2 : i9 + 1);
            }
            td0Var.g = i5;
            return;
        }
        int i10 = i3 + 1;
        td0Var.b(i10, i4);
        td0Var.g++;
        sx0Var.a(sv0Var);
        kx0Var.a(xk.a(f, z, false));
        k1(el.k(sv0Var, a01Var.b()), a01Var, j, td0Var, i, z, f, false);
        td0Var.g = i3;
        if (i10 == sx0Var.b - 1 || el.F(td0Var.a())) {
            int i11 = td0Var.g;
            int i12 = i11 + 1;
            sx0Var.k(i12);
            if (i12 < 0 || i12 >= (i2 = kx0Var.b)) {
                yc.o("Index must be between 0 and size");
                return;
            }
            long[] jArr = kx0Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                nd.L(jArr, jArr, i12, i11 + 2, i2);
            }
            kx0Var.b--;
        }
    }

    @Override // defpackage.zk0
    public final long r(zk0 zk0Var, long j) {
        return D(zk0Var, j);
    }

    public final pc1 s1() {
        if (W0().r) {
            zk0 zk0VarW = al.w(this);
            yx0 yx0Var = this.J;
            if (yx0Var == null) {
                yx0Var = new yx0();
                this.J = yx0Var;
            }
            long jN0 = N0(V0());
            int i = (int) (jN0 >> 32);
            yx0Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jN0 & 4294967295L);
            yx0Var.b = -Float.intBitsToFloat(i2);
            yx0Var.c = Float.intBitsToFloat(i) + h0();
            yx0Var.d = Float.intBitsToFloat(i2) + g0();
            while (this != zk0VarW) {
                this.n1(yx0Var, false, true);
                if (!yx0Var.b()) {
                    this = this.y;
                    this.getClass();
                }
            }
            return new pc1(yx0Var.a, yx0Var.b, yx0Var.c, yx0Var.d);
        }
        return pc1.e;
    }

    @Override // defpackage.zk0
    public final long t(long j) {
        if (!W0().r) {
            ng0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return D(al.w(this), ((h4) tl0.a(this.w)).E(j));
    }

    public final void t1(c01 c01Var, float[] fArr) {
        float[] fArrA;
        if (xi0.o(c01Var, this)) {
            return;
        }
        c01 c01Var2 = this.y;
        c01Var2.getClass();
        c01Var2.t1(c01Var, fArr);
        if (!oh0.a(this.H, 0L)) {
            float[] fArr2 = W;
            ou0.d(fArr2);
            long j = this.H;
            ou0.i(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            ou0.h(fArr, fArr2);
        }
        v31 v31Var = this.T;
        if (v31Var == null || (fArrA = ((qc0) v31Var).a()) == null) {
            return;
        }
        ou0.h(fArr, fArrA);
    }

    public final void u1(c01 c01Var, float[] fArr) {
        while (!this.equals(c01Var)) {
            v31 v31Var = this.T;
            if (v31Var != null) {
                ou0.h(fArr, ((qc0) v31Var).b());
            }
            if (!oh0.a(this.H, 0L)) {
                float[] fArr2 = W;
                ou0.d(fArr2);
                ou0.i(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                ou0.h(fArr, fArr2);
            }
            this = this.y;
            this.getClass();
        }
    }

    public final void v1(sa0 sa0Var, boolean z) {
        w31 w31Var;
        iy0 iy0Var;
        Reference referencePoll;
        z4 z4Var;
        iy0 iy0Var2;
        Reference referencePoll2;
        Object obj;
        int i = 0;
        ql0 ql0Var = this.w;
        boolean z2 = (!z && this.B == sa0Var && xi0.o(this.C, ql0Var.B) && this.D == ql0Var.C) ? false : true;
        this.C = ql0Var.B;
        this.D = ql0Var.C;
        boolean zJ = ql0Var.J();
        b01 b01Var = this.R;
        if (!zJ || sa0Var == null) {
            this.B = null;
            v31 v31Var = this.T;
            if (v31Var != null) {
                qc0 qc0Var = (qc0) v31Var;
                if (!bl.H(qc0Var.b())) {
                    ql0Var.P(this);
                }
                qc0Var.h = null;
                qc0Var.i = null;
                qc0Var.k = true;
                qc0Var.f(false);
                mc0 mc0Var = qc0Var.f;
                if (mc0Var != null) {
                    mc0Var.a(qc0Var.e);
                    h4 h4Var = qc0Var.g;
                    n81 n81Var = h4Var.q0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) n81Var.c;
                        iy0Var = (iy0) n81Var.b;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            iy0Var.j(referencePoll);
                        }
                    } while (referencePoll != null);
                    iy0Var.b(new WeakReference(qc0Var, (ReferenceQueue) n81Var.c));
                    h4Var.D.j(qc0Var);
                }
                this.T = null;
                ql0Var.M = true;
                b01Var.a();
                if (W0().r && ql0Var.K() && (w31Var = ql0Var.r) != null) {
                    ((h4) w31Var).t(ql0Var);
                }
            }
            this.S = false;
            return;
        }
        this.B = sa0Var;
        if (this.T != null) {
            if (z2) {
                w1(true);
                return;
            }
            return;
        }
        w31 w31VarA = tl0.a(ql0Var);
        z4 z4Var2 = this.Q;
        if (z4Var2 == null) {
            z4 z4Var3 = new z4(3, this, new b01(this, i));
            this.Q = z4Var3;
            z4Var = z4Var3;
        } else {
            z4Var = z4Var2;
        }
        h4 h4Var2 = (h4) w31VarA;
        n81 n81Var2 = h4Var2.q0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) n81Var2.c;
            iy0Var2 = (iy0) n81Var2.b;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                iy0Var2.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i2 = iy0Var2.g;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) iy0Var2.k(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        v31 qc0Var2 = (v31) obj;
        if (qc0Var2 != null) {
            qc0 qc0Var3 = (qc0) qc0Var2;
            mc0 mc0Var2 = qc0Var3.f;
            if (mc0Var2 == null) {
                throw s91.g("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!qc0Var3.e.s) {
                ng0.a("layer should have been released before reuse");
            }
            qc0Var3.e = mc0Var2.c();
            qc0Var3.k = false;
            qc0Var3.h = z4Var;
            qc0Var3.i = b01Var;
            qc0Var3.u = false;
            qc0Var3.v = false;
            qc0Var3.w = true;
            ou0.d(qc0Var3.l);
            float[] fArr = qc0Var3.m;
            if (fArr != null) {
                ou0.d(fArr);
            }
            qc0Var3.s = u12.b;
            qc0Var3.x = false;
            qc0Var3.j = 9223372034707292159L;
            qc0Var3.t = null;
            qc0Var3.r = 0;
        } else {
            qc0Var2 = new qc0(h4Var2.getGraphicsContext().c(), h4Var2.getGraphicsContext(), h4Var2, z4Var, b01Var);
        }
        qc0 qc0Var4 = (qc0) qc0Var2;
        qc0Var4.e(this.g);
        qc0Var4.d(this.H);
        this.T = qc0Var2;
        w1(true);
        ql0Var.M = true;
        b01Var.a();
    }

    public final void w1(boolean z) {
        char c;
        int i;
        boolean z2;
        w31 w31Var;
        ha0 ha0Var;
        ha0 ha0Var2;
        v31 v31Var = this.T;
        sa0 sa0Var = this.B;
        if (v31Var == null) {
            if (sa0Var == null) {
                return;
            }
            ng0.b("null layer with a non-null layerBlock");
            return;
        }
        if (sa0Var == null) {
            throw s91.g("updateLayerParameters requires a non-null layerBlock");
        }
        ue1 ue1Var = U;
        ue1Var.a();
        ql0 ql0Var = this.w;
        ue1Var.w = ql0Var.B;
        ue1Var.x = ql0Var.C;
        ue1Var.u = xk.P(this.g);
        ((h4) tl0.a(ql0Var)).getSnapshotObserver().a.c(this, zz0.h, new y3(7, sa0Var, this));
        wk0 wk0Var = this.K;
        if (wk0Var == null) {
            wk0Var = new wk0();
            this.K = wk0Var;
        }
        wk0 wk0Var2 = V;
        wk0Var2.getClass();
        wk0Var2.a = wk0Var.a;
        wk0Var2.b = wk0Var.b;
        wk0Var2.c = wk0Var.c;
        wk0Var2.d = wk0Var.d;
        wk0Var2.e = wk0Var.e;
        wk0Var2.f = wk0Var.f;
        wk0Var2.g = wk0Var.g;
        wk0Var2.h = wk0Var.h;
        wk0Var2.i = wk0Var.i;
        wk0Var.a = ue1Var.f;
        wk0Var.b = ue1Var.g;
        wk0Var.c = ue1Var.i;
        wk0Var.d = ue1Var.j;
        wk0Var.e = ue1Var.n;
        wk0Var.f = ue1Var.o;
        wk0Var.g = ue1Var.p;
        wk0Var.h = ue1Var.q;
        wk0Var.i = ue1Var.r;
        qc0 qc0Var = (qc0) v31Var;
        h4 h4Var = qc0Var.g;
        int i2 = ue1Var.e | qc0Var.r;
        qc0Var.p = ue1Var.x;
        hx hxVar = ue1Var.w;
        qc0Var.o = hxVar;
        if ((1048576 & i2) != 0) {
            nc0 nc0Var = qc0Var.e;
            ue1Var.v.getClass();
            int iN = hxVar.N(0.0f);
            ue1Var.v.getClass();
            int iN2 = hxVar.N(0.0f);
            ue1Var.v.getClass();
            int iN3 = hxVar.N(0.0f);
            ue1Var.v.getClass();
            int iN4 = hxVar.N(0.0f);
            nc0Var.v = iN;
            nc0Var.w = iN2;
            nc0Var.x = iN3;
            nc0Var.y = iN4;
            nc0Var.a.g(iN, iN2, iN3, iN4);
            qc0Var.c();
        }
        int i3 = i2 & 4096;
        if (i3 != 0) {
            qc0Var.s = ue1Var.r;
        }
        if ((i2 & 1) != 0) {
            nc0 nc0Var2 = qc0Var.e;
            float f = ue1Var.f;
            pc0 pc0Var = nc0Var2.a;
            if (pc0Var.d() != f) {
                pc0Var.n(f);
            }
        }
        if ((i2 & 2) != 0) {
            nc0 nc0Var3 = qc0Var.e;
            float f2 = ue1Var.g;
            pc0 pc0Var2 = nc0Var3.a;
            if (pc0Var2.I() != f2) {
                pc0Var2.B(f2);
            }
        }
        if ((i2 & 4) != 0) {
            nc0 nc0Var4 = qc0Var.e;
            float f3 = ue1Var.h;
            pc0 pc0Var3 = nc0Var4.a;
            if (pc0Var3.a() != f3) {
                pc0Var3.c(f3);
            }
        }
        if ((i2 & 8) != 0) {
            nc0 nc0Var5 = qc0Var.e;
            float f4 = ue1Var.i;
            pc0 pc0Var4 = nc0Var5.a;
            if (pc0Var4.r() != f4) {
                pc0Var4.z(f4);
            }
        }
        if ((i2 & 16) != 0) {
            nc0 nc0Var6 = qc0Var.e;
            float f5 = ue1Var.j;
            pc0 pc0Var5 = nc0Var6.a;
            if (pc0Var5.h() != f5) {
                pc0Var5.j(f5);
            }
        }
        if ((i2 & 32) != 0) {
            nc0 nc0Var7 = qc0Var.e;
            float f6 = ue1Var.k;
            pc0 pc0Var6 = nc0Var7.a;
            if (pc0Var6.G() != f6) {
                pc0Var6.f(f6);
                nc0Var7.g = true;
                nc0Var7.a();
            }
            if (ue1Var.k > 0.0f && !qc0Var.x && (ha0Var2 = qc0Var.i) != null) {
                ha0Var2.a();
            }
        }
        if ((i2 & 64) != 0) {
            nc0 nc0Var8 = qc0Var.e;
            long j = ue1Var.l;
            pc0 pc0Var7 = nc0Var8.a;
            if (!vl.c(j, pc0Var7.N())) {
                pc0Var7.l(j);
            }
        }
        if ((i2 & 128) != 0) {
            nc0 nc0Var9 = qc0Var.e;
            long j2 = ue1Var.m;
            pc0 pc0Var8 = nc0Var9.a;
            if (!vl.c(j2, pc0Var8.k())) {
                pc0Var8.A(j2);
            }
        }
        if ((i2 & 1024) != 0) {
            nc0 nc0Var10 = qc0Var.e;
            float f7 = ue1Var.p;
            pc0 pc0Var9 = nc0Var10.a;
            if (pc0Var9.K() != f7) {
                pc0Var9.i(f7);
            }
        }
        if ((i2 & 256) != 0) {
            nc0 nc0Var11 = qc0Var.e;
            float f8 = ue1Var.n;
            pc0 pc0Var10 = nc0Var11.a;
            if (pc0Var10.v() != f8) {
                pc0Var10.J(f8);
            }
        }
        if ((i2 & 512) != 0) {
            nc0 nc0Var12 = qc0Var.e;
            float f9 = ue1Var.o;
            pc0 pc0Var11 = nc0Var12.a;
            if (pc0Var11.E() != f9) {
                pc0Var11.b(f9);
            }
        }
        if ((i2 & 2048) != 0) {
            nc0 nc0Var13 = qc0Var.e;
            float f10 = ue1Var.q;
            pc0 pc0Var12 = nc0Var13.a;
            if (pc0Var12.p() != f10) {
                pc0Var12.F(f10);
            }
        }
        if (i3 != 0) {
            c = ' ';
            boolean zA = u12.a(qc0Var.s, u12.b);
            nc0 nc0Var14 = qc0Var.e;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qc0Var.s >> 32)) * ((int) (qc0Var.j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qc0Var.s & 4294967295L)) * ((int) (qc0Var.j & 4294967295L)))) & 4294967295L);
                if (!w01.b(nc0Var14.z, jFloatToRawIntBits)) {
                    nc0Var14.z = jFloatToRawIntBits;
                    nc0Var14.a.M(jFloatToRawIntBits);
                }
            } else if (!w01.b(nc0Var14.z, 9205357640488583168L)) {
                nc0Var14.z = 9205357640488583168L;
                nc0Var14.a.M(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i2 & 16384) != 0) {
            nc0 nc0Var15 = qc0Var.e;
            boolean z3 = ue1Var.t;
            if (nc0Var15.A != z3) {
                nc0Var15.A = z3;
                nc0Var15.g = true;
                nc0Var15.a();
            }
        }
        if ((131072 & i2) != 0) {
            pc0 pc0Var13 = qc0Var.e.a;
        }
        if ((262144 & i2) != 0) {
            nc0 nc0Var16 = qc0Var.e;
            wl wlVar = ue1Var.y;
            pc0 pc0Var14 = nc0Var16.a;
            if (!xi0.o(pc0Var14.x(), wlVar)) {
                pc0Var14.e(wlVar);
            }
        }
        if ((524288 & i2) != 0) {
            nc0 nc0Var17 = qc0Var.e;
            int i4 = ue1Var.z;
            pc0 pc0Var15 = nc0Var17.a;
            if (pc0Var15.L() != i4) {
                pc0Var15.o(i4);
            }
        }
        if ((32768 & i2) != 0) {
            pc0 pc0Var16 = qc0Var.e.a;
            if (pc0Var16.u() != 0) {
                pc0Var16.y(0);
            }
        }
        if ((i2 & 7963) != 0) {
            qc0Var.u = true;
            qc0Var.v = true;
        }
        if (xi0.o(qc0Var.t, ue1Var.A)) {
            i = i2;
            z2 = false;
        } else {
            hk hkVar = ue1Var.A;
            qc0Var.t = hkVar;
            if (hkVar == null) {
                i = i2;
            } else {
                nc0 nc0Var18 = qc0Var.e;
                if (hkVar instanceof o31) {
                    pc1 pc1Var = ((o31) hkVar).b;
                    float f11 = pc1Var.a;
                    float f12 = pc1Var.b;
                    i = i2;
                    nc0Var18.f(0.0f, (((long) Float.floatToRawIntBits(f11)) << c) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L), (((long) Float.floatToRawIntBits(pc1Var.c - f11)) << c) | (((long) Float.floatToRawIntBits(pc1Var.d - f12)) & 4294967295L));
                } else {
                    i = i2;
                    if (hkVar instanceof n31) {
                        w6 w6Var = ((n31) hkVar).b;
                        nc0Var18.k = null;
                        nc0Var18.i = 9205357640488583168L;
                        nc0Var18.h = 0L;
                        nc0Var18.j = 0.0f;
                        nc0Var18.g = true;
                        nc0Var18.n = false;
                        nc0Var18.l = w6Var;
                        nc0Var18.a();
                    } else {
                        if (!(hkVar instanceof p31)) {
                            ez1.a();
                            return;
                        }
                        p31 p31Var = (p31) hkVar;
                        w6 w6Var2 = p31Var.c;
                        if (w6Var2 != null) {
                            nc0Var18.k = null;
                            nc0Var18.i = 9205357640488583168L;
                            nc0Var18.h = 0L;
                            nc0Var18.j = 0.0f;
                            nc0Var18.g = true;
                            nc0Var18.n = false;
                            nc0Var18.l = w6Var2;
                            nc0Var18.a();
                        } else {
                            hg1 hg1Var = p31Var.b;
                            nc0Var18.f(Float.intBitsToFloat((int) (hg1Var.h >> c)), (((long) Float.floatToRawIntBits(hg1Var.a)) << c) | (((long) Float.floatToRawIntBits(hg1Var.b)) & 4294967295L), (((long) Float.floatToRawIntBits(hg1Var.b())) << c) | (((long) Float.floatToRawIntBits(hg1Var.a())) & 4294967295L));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((hkVar instanceof n31) || ((hkVar instanceof p31) && !xc.A(((p31) hkVar).b))) && (ha0Var = qc0Var.i) != null)) {
                    ha0Var.a();
                }
            }
            z2 = true;
        }
        qc0Var.r = ue1Var.e;
        if (i != 0 || z2) {
            ViewParent parent = h4Var.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(h4Var, h4Var);
            }
            if (h4.l()) {
                h4Var.K(0.0f);
            }
        }
        boolean z4 = this.A;
        this.A = ue1Var.t;
        this.E = ue1Var.h;
        boolean z5 = wk0Var2.a == wk0Var.a && wk0Var2.b == wk0Var.b && wk0Var2.c == wk0Var.c && wk0Var2.d == wk0Var.d && wk0Var2.e == wk0Var.e && wk0Var2.f == wk0Var.f && wk0Var2.g == wk0Var.g && wk0Var2.h == wk0Var.h && u12.a(wk0Var2.i, wk0Var.i);
        if (z && ((!z5 || z4 != this.A) && (w31Var = ql0Var.r) != null)) {
            ((h4) w31Var).t(ql0Var);
        }
        if (z5) {
            return;
        }
        ql0Var.P(this);
        if (ql0Var.Q > 0) {
            h4 h4Var2 = (h4) tl0.a(ql0Var);
            xg0 xg0Var = h4Var2.R.e;
            xg0Var.getClass();
            if (ql0Var.Q > 0) {
                ((iy0) xg0Var.f).b(ql0Var);
                ql0Var.P = true;
            }
            h4Var2.D(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x1(long j) {
        boolean z;
        boolean z2;
        boolean zT;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        v31 v31Var = this.T;
        if (v31Var == null || !this.A) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        nc0 nc0Var = ((qc0) v31Var).e;
        if (nc0Var.A) {
            hk hkVarD = nc0Var.d();
            if (hkVarD instanceof o31) {
                pc1 pc1Var = ((o31) hkVarD).b;
                if (pc1Var.a > fIntBitsToFloat || fIntBitsToFloat >= pc1Var.c || pc1Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= pc1Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (hkVarD instanceof p31) {
                hg1 hg1Var = ((p31) hkVarD).b;
                float f = hg1Var.a;
                long j2 = hg1Var.f;
                long j3 = hg1Var.h;
                long j4 = hg1Var.g;
                float f2 = hg1Var.d;
                float f3 = hg1Var.b;
                z = false;
                float f4 = hg1Var.c;
                z2 = true;
                long j5 = hg1Var.e;
                if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                    int i = (int) (j5 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= hg1Var.b()) {
                        int i3 = (int) (j3 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= hg1Var.b()) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= hg1Var.a()) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= hg1Var.a()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i5) + f3;
                                    float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i7) + f3;
                                    float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat8 = f2 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat9 = f2 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat10 = Float.intBitsToFloat(i3) + f;
                                    zT = (fIntBitsToFloat >= fIntBitsToFloat3 || fIntBitsToFloat2 >= fIntBitsToFloat4) ? (fIntBitsToFloat >= fIntBitsToFloat10 || fIntBitsToFloat2 <= fIntBitsToFloat9) ? (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) ? (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z2 : uc1.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, hg1Var.g) : uc1.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, hg1Var.f) : uc1.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat10, fIntBitsToFloat9, hg1Var.h) : uc1.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, hg1Var.e);
                                } else {
                                    w6 w6VarA = y6.a();
                                    w6.c(w6VarA, hg1Var);
                                    zT = uc1.r(fIntBitsToFloat, fIntBitsToFloat2, w6VarA);
                                }
                            }
                        }
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(hkVarD instanceof n31)) {
                    ez1.a();
                    return false;
                }
                zT = uc1.r(fIntBitsToFloat, fIntBitsToFloat2, ((n31) hkVarD).b);
            }
            zT = z;
        } else {
            z = false;
            z2 = true;
        }
        return zT ? z2 : z;
    }

    @Override // defpackage.ws0, defpackage.x31
    public final boolean z() {
        return (this.T == null || this.z || !this.w.J()) ? false : true;
    }

    @Override // defpackage.ws0
    public final ws0 z0() {
        return this.x;
    }

    @Override // defpackage.ws0
    public final zk0 A0() {
        return this;
    }
}
