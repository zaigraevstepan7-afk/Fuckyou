package defpackage;

import android.os.Trace;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xt1 extends yw implements il0, o10, i22, vp, u01, up {
    public p7 A;
    public final me B;
    public hy0 C;
    public jx0 D;
    public wt1 E;
    public long F;
    public al0 G;
    public ym1 H;
    public hk I;
    public tm1[] J;
    public vg0[] K;
    public tm1[] L;
    public y10[] M;
    public jr1 N;
    public st1 u;
    public mt1 v;
    public final ce1 w;
    public yt1 x;
    public yt1 y;
    public nc0 z;

    public xt1(hy0 hy0Var, mt1 mt1Var) {
        this.v = mt1Var;
        ce1 ce1Var = new ce1();
        ce1Var.e = 1.0f;
        i42 i42Var = i42.a;
        ce1Var.p = i42Var;
        ce1Var.q = i42Var;
        this.w = ce1Var;
        this.x = new yt1();
        this.B = new me();
        this.C = hy0Var == null ? new hy0(null) : hy0Var;
        this.F = 9205357640488583168L;
    }

    public static yt1 Q0(xt1 xt1Var, int i) {
        yt1 yt1Var = xt1Var.x;
        ce1 ce1Var = xt1Var.w;
        if ((ce1Var.e() & i) == 0) {
            return yt1Var;
        }
        yt1 yt1Var2 = new yt1();
        ce1Var.g(i, yt1Var2);
        return yt1Var2;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.up
    public final Object B(nb1 nb1Var) {
        return hk.o(this, nb1Var);
    }

    @Override // defpackage.sv0
    public final void E0() {
        nc0 nc0Var = this.z;
        if (nc0Var != null) {
            ((h4) bl.Q(this)).getGraphicsContext().a(nc0Var);
            this.z = null;
        }
        this.A = null;
    }

    @Override // defpackage.u01
    public final void K() {
        R0(false);
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        lh lhVar;
        lh lhVar2;
        lh lhVar3;
        Object obj;
        lh lhVar4;
        yt1 yt1Var;
        ej ejVar;
        float f;
        long j;
        y10[] y10VarArr;
        hk hkVarA;
        float f2;
        int length;
        Object obj2;
        vg0[] vg0VarArr;
        me meVar;
        sa0 kfVar;
        sa0 dgVar;
        ej ejVar2 = sl0Var.e;
        zd0 zd0Var = pv.w;
        yt1 yt1VarQ0 = Q0(this, 2);
        long j2 = vl.g;
        long j3 = yt1VarQ0.u((byte) 34) ? yt1VarQ0.z : j2;
        if (yt1VarQ0.v(51)) {
            lhVar = yt1VarQ0.A;
            lhVar.getClass();
        } else {
            lhVar = null;
        }
        if (yt1VarQ0.u((byte) 36)) {
            j2 = yt1VarQ0.B;
        }
        if (yt1VarQ0.v(52)) {
            lhVar2 = yt1VarQ0.C;
            lhVar2.getClass();
        } else {
            lhVar2 = null;
        }
        long j4 = vl.b;
        if (yt1VarQ0.u((byte) 35)) {
            j4 = yt1VarQ0.x;
        }
        if (yt1VarQ0.v(50)) {
            lhVar3 = yt1VarQ0.y;
            lhVar3.getClass();
        } else {
            lhVar3 = null;
        }
        float f3 = yt1VarQ0.u((byte) 8) ? yt1VarQ0.k : 0.0f;
        float f4 = f3 / 2.0f;
        ym1 ym1Var = yt1VarQ0.E;
        boolean z = f4 > 0.0f;
        boolean z2 = (j3 == 16 && lhVar == null) ? false : true;
        boolean z3 = (j2 == 16 && lhVar2 == null) ? false : true;
        if (yt1VarQ0.v(55) && (obj = yt1VarQ0.F) != null) {
            lhVar4 = lhVar3;
            ym1 ym1Var2 = yt1VarQ0.v(53) ? yt1VarQ0.E : zd0Var;
            yt1Var = yt1VarQ0;
            tm1[] tm1VarArr = this.L;
            ejVar = ejVar2;
            y10[] y10VarArr2 = this.M;
            f = f3;
            boolean z4 = obj instanceof Object[];
            int length2 = z4 ? ((Object[]) obj).length : 1;
            j = j4;
            if (tm1VarArr == null || !xi0.o(this.H, ym1Var2)) {
                tm1[] tm1VarArr2 = new tm1[length2];
                for (int i = 0; i < length2; i++) {
                    tm1VarArr2[i] = null;
                }
                this.L = tm1VarArr2;
                y10[] y10VarArr3 = new y10[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    y10VarArr3[i2] = null;
                }
                this.M = y10VarArr3;
            } else if (tm1VarArr.length != length2) {
                this.L = (tm1[]) Arrays.copyOf(tm1VarArr, length2);
                if (y10VarArr2 != null) {
                    y10VarArr = (y10[]) Arrays.copyOf(y10VarArr2, length2);
                } else {
                    y10VarArr = new y10[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        y10VarArr[i3] = null;
                    }
                }
                this.M = y10VarArr;
            }
            if (z4) {
                Object[] objArr = (Object[]) obj;
                int length3 = objArr.length;
                for (int i4 = 0; i4 < length3; i4++) {
                    Object obj3 = objArr[i4];
                    if (obj3 instanceof tm1) {
                        O0(sl0Var, i4, ym1Var2, (tm1) obj3);
                    }
                }
            } else if (obj instanceof tm1) {
                O0(sl0Var, 0, ym1Var2, (tm1) obj);
            }
        } else {
            ejVar = ejVar2;
            yt1Var = yt1VarQ0;
            f = f3;
            j = j4;
            lhVar4 = lhVar3;
        }
        long jD = ejVar.d();
        if (io1.a(this.F, jD) && this.G == sl0Var.getLayoutDirection() && xi0.o(this.H, ym1Var)) {
            hkVarA = this.I;
            hkVarA.getClass();
        } else {
            hkVarA = ym1Var.a(jD, sl0Var.getLayoutDirection(), sl0Var);
        }
        this.I = hkVarA;
        this.F = jD;
        this.G = sl0Var.getLayoutDirection();
        if (!z2) {
            f2 = 0.0f;
        } else if (lhVar != null) {
            f2 = 0.0f;
            lk.G(sl0Var, hkVarA, lhVar, 0.0f, 60);
        } else {
            f2 = 0.0f;
            lk.H(sl0Var, hkVarA, j3);
        }
        sl0Var.a();
        if (z3) {
            if (lhVar2 != null) {
                lk.G(sl0Var, hkVarA, lhVar2, f2, 60);
            } else {
                lk.H(sl0Var, hkVarA, j2);
            }
        }
        if (z) {
            lh uq1Var = lhVar4 == null ? new uq1(j) : lhVar4;
            tt1 tt1Var = new tt1(f);
            p7 p7Var = this.A;
            if (p7Var == null) {
                p7Var = new p7(23, this);
                this.A = p7Var;
            }
            final p7 p7Var2 = p7Var;
            final me meVar2 = this.B;
            meVar2.b = tt1Var;
            if (uq1Var.equals((lh) meVar2.c) && hkVarA.equals((hk) meVar2.d) && ((sa0) meVar2.e) != null) {
                meVar = meVar2;
                length = 1;
            } else {
                meVar2.c = uq1Var;
                meVar2.d = hkVarA;
                if (hkVarA instanceof n31) {
                    final n31 n31Var = (n31) hkVarA;
                    w6 w6Var = n31Var.b;
                    final pc1 pc1VarD = w6Var.d();
                    float f5 = pc1VarD.b;
                    float f6 = pc1VarD.d;
                    float f7 = pc1VarD.a;
                    final float fMin = Math.min(Math.abs(pc1VarD.c - f7), Math.abs(f6 - f5));
                    w6 w6VarA = (w6) meVar2.a;
                    if (w6VarA == null) {
                        w6VarA = y6.a();
                        meVar2.a = w6VarA;
                    }
                    w6VarA.g();
                    w6.b(w6VarA, pc1VarD);
                    w6VarA.f(w6VarA, w6Var, 0);
                    final long jCeil = (((long) ((int) Math.ceil(r10 - f7))) << 32) | (((long) ((int) Math.ceil(f6 - f5))) & 4294967295L);
                    final w6 w6Var2 = w6VarA;
                    final lh lhVar5 = uq1Var;
                    kfVar = new sa0() { // from class: eg
                        @Override // defpackage.sa0
                        public final Object i(Object obj4) {
                            long j5 = jCeil;
                            w6 w6Var3 = w6Var2;
                            p10 p10Var = (p10) obj4;
                            tt1 tt1Var2 = (tt1) meVar2.b;
                            tt1Var2.getClass();
                            float fFloatValue = Float.valueOf(tt1Var2.e).floatValue();
                            float f8 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                            float f9 = 2.0f * f8;
                            float f10 = fMin;
                            n31 n31Var2 = n31Var;
                            lh lhVar6 = lhVar5;
                            if (f9 > f10) {
                                p10.y0(p10Var, n31Var2.b, lhVar6, 0.0f, null, null, 60);
                            } else {
                                nc0 nc0Var = (nc0) p7Var2.a();
                                pc0 pc0Var = nc0Var.a;
                                if (pc0Var.u() != 1) {
                                    pc0Var.y(1);
                                }
                                pc1 pc1Var = pc1VarD;
                                float f11 = pc1Var.a;
                                float f12 = pc1Var.b;
                                ((qt0) p10Var.E().a).A(f11, f12);
                                try {
                                    p10Var.H(nc0Var, j5, new fg(pc1Var, n31Var2, lhVar6, f8, w6Var3));
                                    xk.o(p10Var, nc0Var);
                                } finally {
                                    ((qt0) p10Var.E().a).A(-f11, -f12);
                                }
                            }
                            return t32.a;
                        }
                    };
                    meVar = meVar2;
                    length = 1;
                } else {
                    meVar = meVar2;
                    if (hkVarA instanceof p31) {
                        hg1 hg1Var = ((p31) hkVarA).b;
                        if (xc.A(hg1Var)) {
                            length = 1;
                            dgVar = new kf(meVar, hg1Var, uq1Var, length);
                        } else {
                            length = 1;
                            w6 w6VarA2 = (w6) meVar.a;
                            if (w6VarA2 == null) {
                                w6VarA2 = y6.a();
                                meVar.a = w6VarA2;
                            }
                            w6 w6Var3 = w6VarA2;
                            wc1 wc1Var = new wc1();
                            wc1Var.e = Float.NaN;
                            dgVar = new dg(meVar, hg1Var, wc1Var, new zc1(), w6Var3, uq1Var, 0);
                        }
                        kfVar = dgVar;
                    } else {
                        length = 1;
                        if (!(hkVarA instanceof o31)) {
                            ez1.a();
                            return;
                        }
                        kfVar = new kf(meVar, ((o31) hkVarA).b, uq1Var, 2);
                    }
                }
                meVar.e = kfVar;
            }
            if (w01.b(0L, 0L)) {
                sa0 sa0Var = (sa0) meVar.e;
                sa0Var.getClass();
                sa0Var.i(sl0Var);
            } else {
                float fIntBitsToFloat = Float.intBitsToFloat(0);
                float fIntBitsToFloat2 = Float.intBitsToFloat(0);
                ej ejVar3 = ejVar;
                ((qt0) ejVar3.f.a).A(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    sa0 sa0Var2 = (sa0) meVar.e;
                    sa0Var2.getClass();
                    sa0Var2.i(sl0Var);
                } finally {
                    ((qt0) ejVar3.f.a).A(-fIntBitsToFloat, -fIntBitsToFloat2);
                }
            }
        } else {
            length = 1;
        }
        yt1 yt1Var2 = yt1Var;
        if (yt1Var2.v(56) && (obj2 = yt1Var2.G) != null) {
            ym1 ym1Var3 = yt1Var2.v(53) ? yt1Var2.E : zd0Var;
            tm1[] tm1VarArr3 = this.J;
            vg0[] vg0VarArr2 = this.K;
            boolean z5 = obj2 instanceof Object[];
            if (z5) {
                length = ((Object[]) obj2).length;
            }
            if (tm1VarArr3 == null || !xi0.o(this.H, ym1Var3)) {
                tm1[] tm1VarArr4 = new tm1[length];
                for (int i5 = 0; i5 < length; i5++) {
                    tm1VarArr4[i5] = null;
                }
                this.J = tm1VarArr4;
                vg0[] vg0VarArr3 = new vg0[length];
                for (int i6 = 0; i6 < length; i6++) {
                    vg0VarArr3[i6] = null;
                }
                this.K = vg0VarArr3;
            } else if (tm1VarArr3.length != length) {
                this.J = (tm1[]) Arrays.copyOf(tm1VarArr3, length);
                if (vg0VarArr2 != null) {
                    vg0VarArr = (vg0[]) Arrays.copyOf(vg0VarArr2, length);
                } else {
                    vg0VarArr = new vg0[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        vg0VarArr[i7] = null;
                    }
                }
                this.K = vg0VarArr;
            }
            if (z5) {
                Object[] objArr2 = (Object[]) obj2;
                int length4 = objArr2.length;
                for (int i8 = 0; i8 < length4; i8++) {
                    Object obj4 = objArr2[i8];
                    if (obj4 instanceof tm1) {
                        P0(sl0Var, i8, ym1Var3, (tm1) obj4);
                    }
                }
            } else if (obj2 instanceof tm1) {
                P0(sl0Var, 0, ym1Var3, (tm1) obj2);
            }
        }
        this.H = ym1Var;
    }

    public final void O0(sl0 sl0Var, int i, ym1 ym1Var, tm1 tm1Var) {
        tm1[] tm1VarArr = this.L;
        tm1 tm1Var2 = tm1VarArr != null ? (tm1) nd.U(i, tm1VarArr) : null;
        y10[] y10VarArr = this.M;
        y10 y10Var = y10VarArr != null ? (y10) nd.U(i, y10VarArr) : null;
        if (!xi0.o(tm1Var2, tm1Var) || y10Var == null) {
            xg0 xg0VarB = ((h4) bl.Q(this)).getGraphicsContext().b();
            xg0VarB.getClass();
            y10Var = new y10(ym1Var, tm1Var, xg0VarB);
        }
        tm1[] tm1VarArr2 = this.L;
        if (tm1VarArr2 != null) {
            tm1VarArr2[i] = tm1Var;
        }
        y10[] y10VarArr2 = this.M;
        if (y10VarArr2 != null) {
            y10VarArr2[i] = y10Var;
        }
        y10Var.c(sl0Var, sl0Var.e.d(), 1.0f, null);
    }

    public final void P0(sl0 sl0Var, int i, ym1 ym1Var, tm1 tm1Var) {
        tm1[] tm1VarArr = this.J;
        tm1 tm1Var2 = tm1VarArr != null ? (tm1) nd.U(i, tm1VarArr) : null;
        vg0[] vg0VarArr = this.K;
        vg0 vg0Var = vg0VarArr != null ? (vg0) nd.U(i, vg0VarArr) : null;
        if (!xi0.o(tm1Var2, tm1Var) || vg0Var == null) {
            xg0 xg0VarB = ((h4) bl.Q(this)).getGraphicsContext().b();
            xg0VarB.getClass();
            vg0Var = new vg0(ym1Var, tm1Var, xg0VarB);
        }
        tm1[] tm1VarArr2 = this.J;
        if (tm1VarArr2 != null) {
            tm1VarArr2[i] = tm1Var;
        }
        vg0[] vg0VarArr2 = this.K;
        if (vg0VarArr2 != null) {
            vg0VarArr2[i] = vg0Var;
        }
        vg0Var.c(sl0Var, sl0Var.e.d(), 1.0f, null);
    }

    public final void R0(boolean z) {
        yt1 yt1Var;
        int iQ;
        yt1 yt1Var2;
        if (this.r) {
            final yt1 yt1Var3 = z ? null : this.x;
            if (z) {
                yt1Var = this.x;
            } else {
                if (this.y == null) {
                    this.y = new yt1();
                }
                yt1Var = this.y;
                yt1Var.getClass();
            }
            final yt1 yt1Var4 = yt1Var;
            final hx hxVar = bl.P(this).B;
            final xc1 xc1Var = new xc1();
            ce1 ce1Var = this.w;
            n81 n81Var = ce1Var.r;
            yt1 yt1Var5 = ce1Var.g;
            if (n81Var == null || yt1Var5 == null) {
                ce1Var.i = null;
            } else {
                long j = n81Var.j();
                if (j != 0) {
                    long j2 = j & 2251799813685247L;
                    int i = (int) (j >> 50);
                    yt1 yt1Var6 = new yt1();
                    n81 n81Var2 = ce1Var.r;
                    if (n81Var2 != null && ((yt1Var2 = ce1Var.j) != null || (yt1Var2 = ce1Var.h) != null)) {
                        yt1 yt1Var7 = yt1Var2;
                        yt1 yt1Var8 = ce1Var.g;
                        if (yt1Var8 != null) {
                            zt1.a(yt1Var7, yt1Var8, n81Var2, j2, i, yt1Var6);
                        }
                    }
                    ce1Var.i = yt1Var6;
                } else {
                    ce1Var.i = null;
                }
            }
            bk.R(this, new ha0() { // from class: vt1
                @Override // defpackage.ha0
                public final Object a() {
                    hx hxVar2 = hxVar;
                    xt1 xt1Var = this.e;
                    ce1 ce1Var2 = xt1Var.w;
                    mt1 mt1Var = xt1Var.v;
                    ce1Var2.getClass();
                    Trace.beginSection("Compose:Styles:build");
                    try {
                        ce1Var2.f = xt1Var;
                        ce1Var2.e = hxVar2.b();
                        yt1 yt1Var9 = ce1Var2.g;
                        yt1 yt1Var10 = ce1Var2.h;
                        if (yt1Var10 != null) {
                            zt1.n.e(yt1Var10);
                        } else {
                            yt1Var10 = new yt1();
                        }
                        ce1Var2.g = yt1Var10;
                        ce1Var2.h = yt1Var9;
                        ce1Var2.m = null;
                        mt1Var.a(ce1Var2);
                        ce1Var2.c();
                        Trace.endSection();
                        yt1 yt1Var11 = yt1Var4;
                        ce1Var2.g(0, yt1Var11);
                        xt1Var.x = yt1Var11;
                        xt1Var.y = yt1Var3;
                        xc1Var.e = ce1Var2.e();
                        return t32.a;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            });
            int i2 = xc1Var.e;
            if (yt1Var3 != null) {
                long j3 = zt1.b | zt1.c | zt1.d;
                long j4 = zt1.e;
                long j5 = j3 | j4 | zt1.f | zt1.g;
                int i3 = zt1.h | zt1.i | zt1.j;
                int i4 = zt1.k;
                int i5 = i3 | i4 | zt1.l | zt1.m;
                long jH = yt1Var3.h(yt1Var4, j5);
                int iG = yt1Var3.g(i5, yt1Var4);
                iQ = zt1.g(jH) | zt1.e(iG);
                if ((iG & 8) != 0 && ((yt1Var3.a & j4) != 0 || (yt1Var3.b & i4) != 0 || (j4 & yt1Var4.a) != 0 || (yt1Var4.b & i4) != 0)) {
                    iQ |= 4;
                }
            } else {
                iQ = yt1Var4.q();
            }
            int i6 = i2 | iQ;
            if (!xi0.o(this.C.a, this.D)) {
                jr1 jr1Var = this.N;
                if (jr1Var != null) {
                    jr1Var.a(null);
                }
                jx0 jx0Var = this.C.a;
                this.D = jx0Var;
                if (jx0Var != null) {
                    this.N = nu0.A(z0(), null, null, new qk1(this, jx0Var, (ks) null), 3);
                }
            }
            if (z) {
                return;
            }
            if ((i6 & 1) != 0) {
                st1 st1Var = this.u;
                if (st1Var == null) {
                    yc.l("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                el.D(st1Var);
            }
            if ((i6 & 8) != 0) {
                el.D(this);
            }
            if ((i6 & 2) != 0) {
                al.C(this);
                st1 st1Var2 = this.u;
                if (st1Var2 == null) {
                    yc.l("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                el.C(st1Var2);
            }
            if ((i6 & 4) != 0) {
                wt1 wt1Var = this.E;
                if (wt1Var == null) {
                    wt1Var = new wt1(0, this);
                    this.E = wt1Var;
                }
                el.V(this, wt1Var);
            }
            if ((i6 & 16) != 0 && this.e.r) {
                bl.P(this).F();
            }
            if ((i6 & 32) == 0 || !this.e.r) {
                return;
            }
            bl.P(this).C(true);
        }
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, final long j) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4;
        yt1 yt1VarQ0 = Q0(this, 12);
        float f = yt1VarQ0.u((byte) 4) ? yt1VarQ0.g : 0.0f;
        float f2 = yt1VarQ0.u((byte) 13) ? yt1VarQ0.p : 0.0f;
        if (!Float.isNaN(f2)) {
            f += f2;
        }
        final float f3 = f;
        float f4 = yt1VarQ0.u((byte) 5) ? yt1VarQ0.h : 0.0f;
        float f5 = yt1VarQ0.u((byte) 15) ? yt1VarQ0.r : 0.0f;
        if (!Float.isNaN(f5)) {
            f4 += f5;
        }
        float f6 = yt1VarQ0.u((byte) 6) ? yt1VarQ0.i : 0.0f;
        float f7 = yt1VarQ0.u((byte) 14) ? yt1VarQ0.q : 0.0f;
        if (!Float.isNaN(f7)) {
            f6 += f7;
        }
        float f8 = yt1VarQ0.u((byte) 7) ? yt1VarQ0.j : 0.0f;
        float f9 = yt1VarQ0.u((byte) 16) ? yt1VarQ0.s : 0.0f;
        if (!Float.isNaN(f9)) {
            f8 += f9;
        }
        int iRound5 = Math.round(f3 + f4);
        int iRound6 = Math.round(f6 + f8);
        int iJ = kr.j(j) - iRound5;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = kr.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + iRound5) < 0) {
            iH = 0;
        }
        int i = kr.i(j) - iRound6;
        int i2 = i < 0 ? 0 : i;
        int iG = kr.g(j);
        if (iG != Integer.MAX_VALUE && (iG = iG + iRound6) < 0) {
            iG = 0;
        }
        if (yt1VarQ0.u((byte) 19)) {
            iRound = Math.round(yt1VarQ0.w);
            if (iRound < 0) {
                iRound = 0;
            }
        } else {
            iRound = Integer.MAX_VALUE;
        }
        if (yt1VarQ0.u((byte) 17)) {
            iRound2 = Math.round(yt1VarQ0.v);
            if (iRound2 < 0) {
                iRound2 = 0;
            }
            if (iRound2 > iRound) {
                iRound2 = iRound;
            }
        } else {
            iRound2 = 0;
        }
        if (yt1VarQ0.u((byte) 9)) {
            int iRound7 = Math.round(yt1VarQ0.l);
            if (iRound7 >= iRound2) {
                iRound2 = iRound7;
            }
            if (iRound2 <= iRound) {
                iRound = iRound2;
            }
            iRound2 = iRound;
        }
        if (iRound2 != 0) {
            if (iRound2 >= iJ) {
                iJ = iRound2;
            }
            if (iJ > iH) {
                iJ = iH;
            }
        }
        if (iRound != Integer.MAX_VALUE) {
            if (iRound < iJ) {
                iRound = iJ;
            }
            if (iRound <= iH) {
                iH = iRound;
            }
        }
        if (!yt1VarQ0.u((byte) 9)) {
            if (yt1VarQ0.u((byte) 11) && kr.d(j)) {
                int iRound8 = Math.round(iH * yt1VarQ0.n);
                if (iRound8 >= iJ) {
                    iJ = iRound8;
                }
                if (iJ > iH) {
                    iJ = iH;
                }
                iH = iJ;
            } else if (yt1VarQ0.u((byte) 13) && yt1VarQ0.u((byte) 15)) {
                iJ = iH;
            }
        }
        if (yt1VarQ0.u((byte) 20)) {
            iRound3 = Math.round(yt1VarQ0.u);
            if (iRound3 < 0) {
                iRound3 = 0;
            }
        } else {
            iRound3 = Integer.MAX_VALUE;
        }
        if (yt1VarQ0.u((byte) 18)) {
            iRound4 = Math.round(yt1VarQ0.t);
            if (iRound4 < 0) {
                iRound4 = 0;
            }
            if (iRound4 > iRound3) {
                iRound4 = iRound3;
            }
        } else {
            iRound4 = 0;
        }
        if (yt1VarQ0.u((byte) 10)) {
            int iRound9 = Math.round(yt1VarQ0.m);
            if (iRound9 >= iRound4) {
                iRound4 = iRound9;
            }
            if (iRound4 <= iRound3) {
                iRound3 = iRound4;
            }
            iRound4 = iRound3;
        }
        if (iRound4 != 0) {
            if (iRound4 >= i2) {
                i2 = iRound4;
            }
            if (i2 > iG) {
                i2 = iG;
            }
        }
        if (iRound3 != Integer.MAX_VALUE) {
            if (iRound3 < i2) {
                iRound3 = i2;
            }
            if (iRound3 <= iG) {
                iG = iRound3;
            }
        }
        if (!yt1VarQ0.u((byte) 10)) {
            if (yt1VarQ0.u((byte) 12) && kr.c(j)) {
                int iRound10 = Math.round(iG * yt1VarQ0.o);
                if (iRound10 >= i2) {
                    i2 = iRound10;
                }
                if (i2 > iG) {
                    i2 = iG;
                }
                iG = i2;
            } else if (yt1VarQ0.u((byte) 14) && yt1VarQ0.u((byte) 16)) {
                i2 = iG;
            }
        }
        final z61 z61VarE = pu0Var.e(lr.a(iJ, iH, i2, iG));
        final float f10 = f4;
        final float f11 = f6;
        final float f12 = f8;
        return xu0Var.f0(z61VarE.e + iRound5, z61VarE.f + iRound6, g40.e, new sa0() { // from class: ut1
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                y61 y61Var = (y61) obj;
                xt1 xt1Var = this.e;
                yt1 yt1VarQ02 = xt1.Q0(xt1Var, 12);
                boolean zU = yt1VarQ02.u((byte) 13);
                long j2 = j;
                z61 z61Var = z61VarE;
                int iRound11 = (zU || !yt1VarQ02.u((byte) 15)) ? Math.round(f3) : (kr.h(j2) - z61Var.e) - Math.round(f10);
                int iRound12 = (!yt1VarQ02.u((byte) 16) || yt1VarQ02.u((byte) 14)) ? Math.round(f11) : (kr.g(j2) - z61Var.f) - Math.round(f12);
                if ((yt1VarQ02.q() & 4) != 0) {
                    wt1 wt1Var = xt1Var.E;
                    if (wt1Var == null) {
                        wt1Var = new wt1(0, xt1Var);
                        xt1Var.E = wt1Var;
                    }
                    y61.m(y61Var, z61Var, iRound11, iRound12, wt1Var);
                } else {
                    y61Var.g(z61Var, iRound11, iRound12, 0.0f);
                }
                return t32.a;
            }
        });
    }

    @Override // defpackage.i22
    public final Object p() {
        return "StyleOuterNode";
    }
}
