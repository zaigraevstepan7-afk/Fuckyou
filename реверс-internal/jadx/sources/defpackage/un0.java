package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class un0 implements vj1 {
    public static final n81 x;
    public final hw a;
    public boolean b;
    public pn0 c;
    public boolean d;
    public final gk e;
    public final v41 f;
    public final jx0 g;
    public float h;
    public final nw i;
    public final boolean j;
    public ql0 k;
    public final sn0 l;
    public final je m;
    public final qm0 n;
    public final wg o;
    public final bn0 p;
    public final qt0 q;
    public final ym0 r;
    public final fy0 s;
    public final v41 t;
    public final v41 u;
    public final fy0 v;
    public final xg0 w;

    static {
        pc pcVar = new pc(22, (byte) 0);
        mt mtVar = new mt(10);
        uq0 uq0Var = new uq0(0, pcVar);
        s22.i(1, mtVar);
        x = new n81(4, uq0Var, mtVar);
    }

    public un0(int i, int i2) {
        hw hwVar = new hw();
        hwVar.a = -1;
        hwVar.d = -1;
        this.a = hwVar;
        gk gkVar = new gk();
        gkVar.b = new s41(i);
        gkVar.c = new s41(i2);
        gkVar.e = new wm0(i);
        this.e = gkVar;
        pn0 pn0Var = wn0.a;
        v20 v20Var = v20.S;
        this.f = new v41(pn0Var, v20Var);
        this.g = new jx0();
        this.i = new nw(new n(15, this));
        this.j = true;
        this.l = new sn0(this);
        this.m = new je();
        this.n = new qm0(0);
        this.o = new wg(1);
        this.p = new bn0(new rn0(this, i));
        this.q = new qt0(25, this);
        this.r = new ym0();
        t32 t32Var = t32.a;
        this.s = new v41(t32Var, v20Var);
        Boolean bool = Boolean.FALSE;
        this.t = xc.B(bool);
        this.u = xc.B(bool);
        this.v = new v41(t32Var, v20Var);
        xg0 xg0Var = new xg0(21, false);
        r22 r22Var = c2.P;
        Float fValueOf = Float.valueOf(0.0f);
        xg0Var.g = new xa(r22Var, fValueOf, (cb) r22Var.a.i(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.w = xg0Var;
    }

    @Override // defpackage.vj1
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.vj1
    public final boolean b() {
        return this.i.b();
    }

    @Override // defpackage.vj1
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
    
        if (r3 == r8) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
    @Override // defpackage.vj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ly0 ly0Var, wa0 wa0Var, ls lsVar) throws Throwable {
        tn0 tn0Var;
        ly0 ly0Var2;
        wa0 wa0Var2;
        if (lsVar instanceof tn0) {
            tn0Var = (tn0) lsVar;
            int i = tn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn0Var.l = i - Integer.MIN_VALUE;
            } else {
                tn0Var = new tn0(this, lsVar);
            }
        }
        Object obj = tn0Var.j;
        int i2 = tn0Var.l;
        Object obj2 = t32.a;
        int i3 = 1;
        Object obj3 = wt.e;
        if (i2 == 0) {
            xc.G(obj);
            if (this.f.getValue() == wn0.a) {
                ly0Var2 = ly0Var;
                tn0Var.h = ly0Var2;
                tn0Var.i = (zu1) wa0Var;
                tn0Var.l = 1;
                je jeVar = this.m;
                ln lnVarA = jeVar.b;
                if (lnVarA == null) {
                    lnVarA = bk.a();
                    jeVar.b = lnVarA;
                    ie ieVar = jeVar.a;
                    if (ieVar != null && ieVar.r) {
                        d dVar = new d(i3, ieVar, ieVar.t);
                        ql0 ql0VarP = bl.P(ieVar);
                        int i4 = ql0VarP.f;
                        sc1 rectManager = ((h4) tl0.a(ql0VarP)).getRectManager();
                        r02 r02Var = rectManager.d;
                        r02Var.getClass();
                        hx0 hx0Var = r02Var.a;
                        q02 q02Var = new q02(r02Var, i4, ieVar, dVar);
                        Object objB = hx0Var.b(i4);
                        if (objB == null) {
                            hx0Var.i(i4, q02Var);
                            objB = q02Var;
                        }
                        q02 q02Var2 = (q02) objB;
                        if (q02Var2 != q02Var) {
                            while (true) {
                                q02 q02Var3 = q02Var2.d;
                                if (q02Var3 == null) {
                                    break;
                                }
                                q02Var2 = q02Var3;
                            }
                            q02Var2.d = q02Var;
                        }
                        ql0 ql0VarP2 = bl.P(ieVar.e);
                        if (sc1.d(ql0VarP2)) {
                            g6 g6Var = rectManager.c;
                            int iE = rectManager.e(ql0VarP2);
                            long[] jArr = (long[]) g6Var.b;
                            int i5 = iE + 2;
                            jArr[i5] = (jArr[i5] & 8070450532247928831L) | (-8070450532247928832L);
                        }
                        rectManager.f = true;
                        rectManager.k();
                        ieVar.s = q02Var;
                    }
                }
                Object objB2 = lnVarA.B(tn0Var);
                if (objB2 != obj3) {
                    objB2 = obj2;
                }
            } else {
                ly0Var2 = ly0Var;
            }
            wa0Var2 = wa0Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    xc.G(obj);
                    return obj2;
                }
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wa0 wa0Var3 = (wa0) tn0Var.i;
            ly0 ly0Var3 = tn0Var.h;
            xc.G(obj);
            ly0Var2 = ly0Var3;
            wa0Var2 = wa0Var3;
        }
        tn0Var.h = null;
        tn0Var.i = null;
        tn0Var.l = 2;
        return this.i.d(ly0Var2, wa0Var2, tn0Var) == obj3 ? obj3 : obj2;
    }

    @Override // defpackage.vj1
    public final float e(float f) {
        return this.i.e(f);
    }

    public final void f(pn0 pn0Var, boolean z, boolean z2) {
        String str;
        long j;
        sp1 sp1VarL;
        sa0 sa0VarE;
        sp1 sp1VarU;
        r22 r22Var = c2.P;
        List list = pn0Var.k;
        int i = pn0Var.n;
        int i2 = pn0Var.b;
        qn0 qn0Var = pn0Var.a;
        this.p.e = list.size();
        xg0 xg0Var = this.w;
        gk gkVar = this.e;
        ks ksVar = null;
        if (!z && this.b) {
            this.c = pn0Var;
            sp1VarL = uc1.l();
            sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1VarU = uc1.u(sp1VarL);
            try {
                if (((Number) ((xa) xg0Var.g).f.getValue()).floatValue() != 0.0f && qn0Var != null && qn0Var.a == ((s41) gkVar.b).g() && i2 == ((s41) gkVar.c).g()) {
                    jr1 jr1Var = (jr1) xg0Var.f;
                    if (jr1Var != null) {
                        jr1Var.a(null);
                    }
                    xg0Var.g = new xa(r22Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.u.setValue(Boolean.valueOf(((qn0Var != null ? qn0Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(pn0Var.c));
        this.h -= pn0Var.d;
        this.f.setValue(pn0Var);
        if (z2) {
            gkVar.getClass();
            if (i2 < 0.0f) {
                qg0.c("scrollOffset should be non-negative");
            }
            ((s41) gkVar.c).h(i2);
        } else {
            qn0 qn0Var2 = (qn0) pl.d0(list);
            qn0 qn0Var3 = (qn0) pl.j0(list);
            if (qn0Var2 != null) {
                str = "scrollOffset should be non-negative";
                j = qn0Var2.a;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            c2.w("firstVisibleItem:index", j);
            c2.w("lastVisibleItem:index", qn0Var3 != null ? qn0Var3.a : -1L);
            gkVar.getClass();
            gkVar.d = qn0Var != null ? qn0Var.g : null;
            if (gkVar.a || i > 0) {
                gkVar.a = true;
                if (i2 < 0.0f) {
                    qg0.c(str);
                }
                gkVar.e(qn0Var != null ? qn0Var.a : 0, i2);
            }
            if (this.j) {
                hw hwVar = this.a;
                int i3 = hwVar.a;
                boolean z3 = hwVar.c;
                if (i3 != -1 && !list.isEmpty() && i3 != hw.a(pn0Var, z3)) {
                    hwVar.a = -1;
                    an0 an0Var = hwVar.b;
                    if (an0Var != null) {
                        an0Var.cancel();
                    }
                    hwVar.b = null;
                }
                int i4 = hwVar.d;
                if (i4 != -1 && hwVar.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = hw.a(pn0Var, hwVar.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        hwVar.a = iA;
                        hwVar.b = qt0.y(this.q, iA);
                    }
                }
                hwVar.d = i;
            }
        }
        if (z) {
            float f = pn0Var.f;
            hx hxVar = pn0Var.i;
            vt vtVar = pn0Var.h;
            xg0Var.getClass();
            if (f <= hxVar.y(1.0f)) {
                return;
            }
            sp1VarL = uc1.l();
            sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1VarU = uc1.u(sp1VarL);
            try {
                float fFloatValue = ((Number) ((xa) xg0Var.g).f.getValue()).floatValue();
                jr1 jr1Var2 = (jr1) xg0Var.f;
                if (jr1Var2 != null) {
                    jr1Var2.a(null);
                }
                xa xaVar = (xa) xg0Var.g;
                if (xaVar.j) {
                    xg0Var.g = wi0.u(xaVar, fFloatValue - f);
                } else {
                    xg0Var.g = new xa(r22Var, Float.valueOf(-f), null, 60);
                }
                xg0Var.f = nu0.A(vtVar, null, null, new tv(xg0Var, ksVar, 2), 3);
            } finally {
            }
        }
    }

    public final pn0 g() {
        return (pn0) this.f.getValue();
    }

    public final void h(float f, pn0 pn0Var) {
        an0 an0Var;
        an0 an0Var2;
        if (this.j) {
            boolean zIsEmpty = pn0Var.k.isEmpty();
            hw hwVar = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = hw.a(pn0Var, z);
                if (iA >= 0 && iA < pn0Var.n) {
                    if (iA != hwVar.a) {
                        if (hwVar.c != z) {
                            hwVar.a = -1;
                            an0 an0Var3 = hwVar.b;
                            if (an0Var3 != null) {
                                an0Var3.cancel();
                            }
                            hwVar.b = null;
                        }
                        hwVar.c = z;
                        hwVar.a = iA;
                        hwVar.b = qt0.y(this.q, iA);
                    }
                    List list = pn0Var.k;
                    if (z) {
                        qn0 qn0Var = (qn0) pl.i0(list);
                        if (((qn0Var.j + qn0Var.k) + pn0Var.q) - pn0Var.m < (-f) && (an0Var2 = hwVar.b) != null) {
                            an0Var2.a();
                        }
                    } else if (pn0Var.l - ((qn0) pl.c0(list)).j < f && (an0Var = hwVar.b) != null) {
                        an0Var.a();
                    }
                }
            }
            hwVar.e = f;
        }
    }
}
