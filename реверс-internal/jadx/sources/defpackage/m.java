package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends yw implements p81, jk0, pl1, vp, u01, cg0, ac0 {
    public ha0 A;
    public final z80 B;
    public pf0 C;
    public bc0 D;
    public String E = "idle";
    public xw F;
    public oa1 G;
    public ce0 H;
    public final lx0 I;
    public long J;
    public oa1 K;
    public jx0 L;
    public boolean M;
    public jr1 N;
    public jx0 u;
    public pf0 v;
    public boolean w;
    public String x;
    public yf1 y;
    public boolean z;

    public m(jx0 jx0Var, pf0 pf0Var, boolean z, boolean z2, String str, yf1 yf1Var, ha0 ha0Var) {
        this.u = jx0Var;
        this.v = pf0Var;
        this.w = z;
        this.x = str;
        this.y = yf1Var;
        this.z = z2;
        this.A = ha0Var;
        this.B = new z80(jx0Var, 0, new f(1, this, m.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = is0.a;
        this.I = new lx0(6);
        this.J = 0L;
        jx0 jx0Var2 = this.u;
        this.L = jx0Var2;
        this.M = jx0Var2 == null;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void D0() {
        K();
        if (!this.M) {
            W0();
        }
        if (this.z) {
            L0(this.B);
        }
    }

    @Override // defpackage.sv0
    public final void E0() {
        Q0();
        if (this.L == null) {
            this.u = null;
        }
        xw xwVar = this.F;
        if (xwVar != null) {
            M0(xwVar);
        }
        this.F = null;
        bc0 bc0Var = this.D;
        if (bc0Var != null) {
            M0(bc0Var);
        }
        this.D = null;
    }

    public void I(e81 e81Var, f81 f81Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.J = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        W0();
        if (this.z) {
            if (this.D == null) {
                bc0 bc0Var = new bc0(this);
                L0(bc0Var);
                this.D = bc0Var;
            }
            if (f81Var == f81.f) {
                int i = e81Var.f;
                ks ksVar = null;
                if (i == 4) {
                    nu0.A(z0(), null, null, new l(this, ksVar, 0), 3);
                } else if (i == 5) {
                    nu0.A(z0(), null, null, new l(this, ksVar, 1), 3);
                }
            }
        }
    }

    @Override // defpackage.u01
    public final void K() {
        if (this.w) {
            bk.R(this, new c(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P(KeyEvent keyEvent) {
        boolean z;
        W0();
        long jA = bl.A(keyEvent);
        boolean z2 = this.z;
        int i = 3;
        ks ksVar = null;
        lx0 lx0Var = this.I;
        if (z2) {
            int i2 = 2;
            if (bl.D(keyEvent) == 2 && s22.v(keyEvent)) {
                if (lx0Var.b(jA)) {
                    z = false;
                } else {
                    oa1 oa1Var = new oa1(this.J);
                    lx0Var.g(jA, oa1Var);
                    if (this.u != null) {
                        nu0.A(z0(), null, null, new k(this, oa1Var, ksVar, i2), 3);
                    }
                    z = true;
                }
                return Y0(keyEvent) || z;
            }
        }
        if (this.z && bl.D(keyEvent) == 1 && s22.v(keyEvent)) {
            oa1 oa1Var2 = (oa1) lx0Var.f(jA);
            if (oa1Var2 != null) {
                if (this.u != null) {
                    nu0.A(z0(), null, null, new k(this, oa1Var2, ksVar, i), 3);
                }
                Z0(keyEvent);
            }
            if (oa1Var2 != null) {
            }
        }
    }

    public final boolean P0() {
        zc1 zc1Var = new zc1();
        pd1.t(this, bc0.t, new tq(new rk(0, zc1Var), 2));
        if (zc1Var.e != null) {
            return true;
        }
        int i = vk.b;
        ViewParent parent = el.L(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0() {
        jx0 jx0Var = this.u;
        lx0 lx0Var = this.I;
        if (jx0Var != null) {
            oa1 oa1Var = this.G;
            if (oa1Var != null) {
                jx0Var.b(new na1(oa1Var));
            }
            oa1 oa1Var2 = this.K;
            if (oa1Var2 != null) {
                jx0Var.b(new na1(oa1Var2));
            }
            ce0 ce0Var = this.H;
            if (ce0Var != null) {
                jx0Var.b(new de0(ce0Var));
            }
            Object[] objArr = lx0Var.c;
            long[] jArr = lx0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                jx0Var.b(new na1((oa1) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.G = null;
        this.K = null;
        this.H = null;
        lx0Var.a();
    }

    public final long R0(long j) {
        long jX = bl.P(this).B.X(((j62) hk.o(this, aq.t)).g());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jX >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jX & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void S0(boolean z) {
        jx0 jx0Var = this.u;
        if (jx0Var != null) {
            jr1 jr1Var = this.N;
            ks ksVar = null;
            if (jr1Var == null || !jr1Var.b()) {
                oa1 oa1Var = z ? this.K : this.G;
                if (oa1Var != null) {
                    na1 na1Var = new na1(oa1Var);
                    oj0 oj0Var = (oj0) ((js) z0()).e.l(v20.O);
                    nu0.A(z0(), null, null, new g(jx0Var, na1Var, oj0Var != null ? oj0Var.s(new d(0, jx0Var, na1Var)) : null, ksVar, 0), 3);
                }
            } else {
                jr1 jr1Var2 = this.N;
                if (jr1Var2 != null) {
                    jr1Var2.a(null);
                }
            }
            if (z) {
                this.K = null;
            } else {
                this.G = null;
            }
        }
    }

    public final void T0(long j, boolean z) {
        jx0 jx0Var = this.u;
        if (jx0Var != null) {
            jr1 jr1Var = this.N;
            if (jr1Var == null || !jr1Var.b()) {
                oa1 oa1Var = z ? this.K : this.G;
                if (oa1Var != null) {
                    nu0.A(z0(), null, null, new i(oa1Var, jx0Var, null), 3);
                }
            } else {
                jr1Var.a(null);
                nu0.A(z0(), null, null, new h(jr1Var, j, jx0Var, (ks) null, 0), 3);
            }
            if (z) {
                this.K = null;
            } else {
                this.G = null;
            }
        }
    }

    public final void U0(uf0 uf0Var) {
        jx0 jx0Var = this.u;
        if (jx0Var != null) {
            oa1 oa1Var = new oa1(uf0Var.c);
            ks ksVar = null;
            if (P0()) {
                this.N = nu0.A(z0(), null, null, new j(jx0Var, oa1Var, this, ksVar, 0), 3);
            } else {
                this.K = oa1Var;
                nu0.A(z0(), null, null, new i(jx0Var, oa1Var, ksVar, 1), 3);
            }
        }
    }

    public final void V0(l81 l81Var) {
        jx0 jx0Var = this.u;
        if (jx0Var != null) {
            oa1 oa1Var = new oa1(l81Var.c);
            ks ksVar = null;
            if (P0()) {
                this.N = nu0.A(z0(), null, null, new j(jx0Var, oa1Var, this, ksVar, 1), 3);
            } else {
                this.G = oa1Var;
                nu0.A(z0(), null, null, new i(jx0Var, oa1Var, ksVar, 2), 3);
            }
        }
    }

    public final void W0() {
        if (this.F != null) {
            return;
        }
        pf0 pf0Var = this.w ? this.C : this.v;
        if (pf0Var != null) {
            if (this.u == null) {
                this.u = new jx0();
            }
            this.B.P0(this.u);
            jx0 jx0Var = this.u;
            jx0Var.getClass();
            xw xwVarA = pf0Var.a(jx0Var);
            L0(xwVarA);
            this.F = xwVarA;
        }
    }

    public abstract boolean Y0(KeyEvent keyEvent);

    public abstract void Z0(KeyEvent keyEvent);

    public final void a1() {
        wq1 wq1Var = (wq1) hk.o(this, aq.v);
        if (wq1Var != null) {
            wq1Var.a();
        }
        this.A.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(jx0 jx0Var, pf0 pf0Var, boolean z, boolean z2, String str, yf1 yf1Var, ha0 ha0Var) {
        boolean z3;
        xw xwVar;
        boolean z4 = true;
        if (xi0.o(this.L, jx0Var)) {
            z3 = false;
        } else {
            Q0();
            this.L = jx0Var;
            this.u = jx0Var;
            z3 = true;
        }
        if (!xi0.o(this.v, pf0Var)) {
            this.v = pf0Var;
            z3 = true;
        }
        if (this.w != z) {
            this.w = z;
            if (z) {
                K();
            }
            z3 = true;
        }
        boolean z5 = this.z;
        z80 z80Var = this.B;
        if (z5 != z2) {
            if (z2) {
                L0(z80Var);
            } else {
                M0(z80Var);
                Q0();
            }
            kd1.t(this);
            if (!z2) {
                xw xwVar2 = this.D;
                if (xwVar2 != null) {
                    M0(xwVar2);
                }
                this.D = null;
                this.E = "idle";
            }
            this.z = z2;
        }
        if (!xi0.o(this.x, str)) {
            this.x = str;
            kd1.t(this);
        }
        if (!xi0.o(this.y, yf1Var)) {
            this.y = yf1Var;
            kd1.t(this);
        }
        this.A = ha0Var;
        boolean z6 = this.M;
        jx0 jx0Var2 = this.L;
        if (z6 == (jx0Var2 == null)) {
            z4 = z3;
        } else {
            boolean z7 = jx0Var2 == null;
            this.M = z7;
            if (z7 || this.F != null) {
            }
        }
        if (z4 && ((xwVar = this.F) != null || !this.M)) {
            if (xwVar != null) {
                M0(xwVar);
            }
            this.F = null;
            W0();
        }
        z80Var.P0(this.u);
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        yf1 yf1Var = this.y;
        if (yf1Var != null) {
            yl1.b(am1Var, yf1Var.a);
        }
        String str = this.x;
        c cVar = new c(this, 1);
        ck0[] ck0VarArr = yl1.a;
        am1Var.a(ml1.b, new r0(str, cVar));
        if (this.z) {
            this.B.g0(am1Var);
        } else {
            am1Var.a(vl1.j, t32.a);
        }
        O0(am1Var);
    }

    @Override // defpackage.jk0
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.pl1
    public final boolean k0() {
        return true;
    }

    @Override // defpackage.ac0
    public final String r0() {
        return this.E;
    }

    public void X0() {
    }

    public void O0(am1 am1Var) {
    }
}
