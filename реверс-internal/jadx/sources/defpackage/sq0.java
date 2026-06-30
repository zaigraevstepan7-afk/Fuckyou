package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class sq0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        en1 en1Var = s22.p;
        a = s22.K;
        b = s22.c0;
        float f2 = s22.a0;
        c = f2;
        float f3 = s22.r;
        d = f3;
        e = s22.q;
        f = (((s22.Z + s22.e0) / 2.0f) - f2) - f3;
    }

    public static final void a(jx0 jx0Var, fy0 fy0Var, fy0 fy0Var2, fy0 fy0Var3, fy0 fy0Var4, ob0 ob0Var, int i) {
        ob0Var.X(844822063);
        int i2 = (ob0Var.f(jx0Var) ? 4 : 2) | i;
        if (ob0Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 14) == 4;
            Object objK = ob0Var.K();
            if (z || objK == kp.a) {
                objK = new l6(fy0Var, fy0Var2, fy0Var3, fy0Var4, jx0Var, null, 6);
                ob0Var.f0(objK);
            }
            wi0.i((wa0) objK, ob0Var, jx0Var);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new pq0(jx0Var, fy0Var, fy0Var2, fy0Var3, fy0Var4, i);
        }
    }

    public static final void b(long j, g32 g32Var, jo joVar, ob0 ob0Var, int i) {
        ob0Var.X(747020814);
        int i2 = i | (ob0Var.e(j) ? 4 : 2) | (ob0Var.h(joVar) ? 256 : 128);
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            uu0 uu0VarD = sg.d(v20.f, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, qv0.a);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, uu0VarD);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            bk.e(j, h32.a(g32Var, ob0Var), joVar, ob0Var, i2 & 910);
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new e5(j, g32Var, joVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0a36  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final jo joVar, final wa0 wa0Var, final wa0 wa0Var2, final wa0 wa0Var3, final a3 a3Var, final boolean z, final sa0 sa0Var, final ha0 ha0Var, final eq0 eq0Var, final tq0 tq0Var, final hq0 hq0Var, final c41 c41Var, ob0 ob0Var, final int i, final int i2) {
        int i3;
        int i4;
        ym1 ym1Var;
        boolean z2;
        ym1 ym1VarR;
        d22 d22VarF;
        em emVarF;
        boolean zF;
        Object objK;
        boolean z3;
        Object objC;
        boolean zF2;
        Object objK2;
        boolean zF3;
        Object objK3;
        em emVarF2;
        boolean zF4;
        Object r22Var;
        char c2;
        boolean z4;
        Object objC2;
        boolean zF5;
        Object objK4;
        boolean zF6;
        Object objK5;
        int i5;
        int i6;
        em emVarF3;
        boolean zF7;
        Object objK6;
        boolean z5;
        Object objC3;
        boolean zF8;
        Object objK7;
        boolean zF9;
        Object objK8;
        em emVarF4;
        boolean zF10;
        Object objK9;
        boolean z6;
        Object objC4;
        boolean zF11;
        Object objK10;
        boolean zF12;
        Object objK11;
        em emVarF5;
        boolean zF13;
        Object objK12;
        boolean z7;
        Object objC5;
        boolean zF14;
        Object objK13;
        boolean zF15;
        Object objK14;
        em emVarF6;
        boolean zF16;
        Object objK15;
        boolean z8;
        Object objC6;
        boolean zF17;
        Object objS;
        boolean zF18;
        Object objK16;
        float f2;
        tz tzVar;
        Object objK17;
        Object objK18;
        ph phVar;
        h9 h9Var;
        fy0 fy0VarD;
        fy0 fy0VarD2;
        Object objK19;
        mj mjVar;
        boolean zH;
        Object objK20;
        boolean zH2;
        Object objK21;
        ns1 ns1Var;
        sp1 sp1VarL;
        sa0 sa0VarE;
        sp1 sp1VarU;
        ob0 ob0Var2 = ob0Var;
        a4 a4Var = a4.t;
        ob0Var2.X(-1408227475);
        if ((i & 6) == 0) {
            i3 = (ob0Var2.f(qv0.a) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ob0Var2.h(joVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ob0Var2.h(wa0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ob0Var2.h(wa0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ob0Var2.h(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ob0Var2.h(wa0Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ob0Var2.f(a3Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ob0Var2.g(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ob0Var2.g(false) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ob0Var2.h(sa0Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ob0Var2.h(ha0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ob0Var2.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ob0Var2.f(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ob0Var2.f(null) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ob0Var2.f(eq0Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ob0Var2.f(tq0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ob0Var2.f(hq0Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= ob0Var2.f(c41Var) ? 8388608 : 4194304;
        }
        if (ob0Var2.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            ob0Var2.W(736607630);
            Object objK22 = ob0Var2.K();
            l91 l91Var = kp.a;
            if (objK22 == l91Var) {
                objK22 = new jx0();
                ob0Var2.f0(objK22);
            }
            final jx0 jx0Var = (jx0) objK22;
            ob0Var2.p(false);
            Object objK23 = ob0Var2.K();
            if (objK23 == l91Var) {
                objK23 = xc.B(Boolean.FALSE);
                ob0Var2.f0(objK23);
            }
            fy0 fy0Var = (fy0) objK23;
            Object objK24 = ob0Var2.K();
            if (objK24 == l91Var) {
                objK24 = xc.B(Boolean.FALSE);
                ob0Var2.f0(objK24);
            }
            fy0 fy0Var2 = (fy0) objK24;
            Object objK25 = ob0Var2.K();
            if (objK25 == l91Var) {
                objK25 = xc.B(Boolean.FALSE);
                ob0Var2.f0(objK25);
            }
            fy0 fy0Var3 = (fy0) objK25;
            Object objK26 = ob0Var2.K();
            if (objK26 == l91Var) {
                objK26 = xc.B(Boolean.FALSE);
                ob0Var2.f0(objK26);
            }
            fy0 fy0Var4 = (fy0) objK26;
            a(jx0Var, fy0Var, fy0Var2, fy0Var3, fy0Var4, ob0Var2, 28080);
            p60 p60VarW = bl.W(jw0.f, ob0Var2);
            jw0 jw0Var = jw0.e;
            p60 p60VarW2 = bl.W(jw0Var, ob0Var2);
            p60 p60VarW3 = bl.W(jw0Var, ob0Var2);
            boolean zBooleanValue = ((Boolean) fy0Var.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) fy0Var2.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) fy0Var3.getValue()).booleanValue();
            boolean zBooleanValue4 = ((Boolean) fy0Var4.getValue()).booleanValue();
            ob0Var2.W(2080718032);
            ym1 ym1Var2 = zBooleanValue ? tq0Var.c : zBooleanValue4 ? tq0Var.f : zBooleanValue2 ? tq0Var.d : zBooleanValue3 ? tq0Var.e : tq0Var.a;
            ym1 ym1Var3 = tq0Var.a;
            ym1 ym1Var4 = tq0Var.f;
            ym1 ym1Var5 = tq0Var.e;
            ym1 ym1Var6 = ym1Var2;
            ym1 ym1Var7 = tq0Var.d;
            ym1 ym1Var8 = tq0Var.c;
            ym1 ym1Var9 = tq0Var.b;
            if ((ym1Var3 instanceof kg1) && (ym1Var9 instanceof kg1) && (ym1Var8 instanceof kg1) && (ym1Var7 instanceof kg1) && (ym1Var5 instanceof kg1) && (ym1Var4 instanceof kg1)) {
                ob0Var2.W(1703365676);
                ob0Var2.U(-1884714849, tq0Var);
                ym1Var6.getClass();
                z2 = false;
                ym1VarR = u4.q((kg1) ym1Var6, p60VarW2, ob0Var2, 0);
                ob0Var2.p(false);
                ob0Var2.p(false);
            } else if ((ym1Var3 instanceof kg1) && (ym1Var9 instanceof kg1) && (ym1Var8 instanceof kg1) && (ym1Var7 instanceof kg1) && (ym1Var5 instanceof kg1) && (ym1Var4 instanceof kg1)) {
                ob0Var2.W(1703498542);
                ob0Var2.U(-1884710563, tq0Var);
                ym1Var6.getClass();
                z2 = false;
                ym1VarR = u4.r((kg1) ym1Var6, p60VarW2, ob0Var2, 0);
                ob0Var2.p(false);
                ob0Var2.p(false);
            } else {
                ob0Var2.W(1703594642);
                ob0Var2.p(false);
                ob0Var2.p(false);
                ym1Var = ym1Var6;
                d22VarF = kd1.F(new ci0(z, ((Boolean) fy0Var4.getValue()).booleanValue()), "ListColor", ob0Var2, 48);
                v41 v41Var = d22VarF.d;
                ci0 ci0Var = (ci0) v41Var.getValue();
                ob0Var2.W(519559029);
                long jA = eq0Var.a(ci0Var.a, false, ci0Var.b);
                ob0Var2.p(false);
                emVarF = vl.f(jA);
                zF = ob0Var2.f(emVarF);
                objK = ob0Var2.K();
                if (!zF || objK == l91Var) {
                    objK = new r22(a4Var, new g3(6, emVarF));
                    ob0Var2.f0(objK);
                }
                r22 r22Var2 = (r22) objK;
                if (d22VarF.g()) {
                    ob0Var2.W(1666573488);
                    boolean zF19 = ob0Var2.f(d22VarF);
                    objC = ob0Var2.K();
                    if (zF19 || objC == l91Var) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1VarU = uc1.u(sp1VarL);
                        try {
                            Object objC7 = d22VarF.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var2.f0(objC7);
                            objC = objC7;
                        } finally {
                        }
                    }
                    z3 = false;
                    ob0Var2.p(false);
                } else {
                    z3 = false;
                    ob0Var2.W(1666827533);
                    ob0Var2.p(false);
                    objC = d22VarF.c();
                }
                ci0 ci0Var2 = (ci0) objC;
                ob0Var2.W(519559029);
                long jA2 = eq0Var.a(ci0Var2.a, z3, ci0Var2.b);
                ob0Var2.p(z3);
                vl vlVar = new vl(jA2);
                zF2 = ob0Var2.f(d22VarF);
                objK2 = ob0Var2.K();
                if (!zF2 || objK2 == l91Var) {
                    objK2 = xc.s(new rq0(3, d22VarF));
                    ob0Var2.f0(objK2);
                }
                ci0 ci0Var3 = (ci0) ((ns1) objK2).getValue();
                ob0Var2.W(519559029);
                long jA3 = eq0Var.a(ci0Var3.a, false, ci0Var3.b);
                ob0Var2.p(false);
                vl vlVar2 = new vl(jA3);
                zF3 = ob0Var2.f(d22VarF);
                objK3 = ob0Var2.K();
                if (!zF3 || objK3 == l91Var) {
                    objK3 = xc.s(new rq0(4, d22VarF));
                    ob0Var2.f0(objK3);
                }
                ob0Var2.W(1215615335);
                ob0Var2.p(false);
                final c22 c22VarH = kd1.h(d22VarF, vlVar, vlVar2, p60VarW, r22Var2, ob0Var2, 0);
                ci0 ci0Var4 = (ci0) v41Var.getValue();
                ob0Var2.W(-154619267);
                long jB = eq0Var.b(ci0Var4.a, false, ci0Var4.b);
                ob0Var2.p(false);
                emVarF2 = vl.f(jB);
                zF4 = ob0Var2.f(emVarF2);
                Object objK27 = ob0Var2.K();
                if (!zF4 || objK27 == l91Var) {
                    r22Var = new r22(a4Var, new g3(6, emVarF2));
                    ob0Var2.f0(r22Var);
                } else {
                    r22Var = objK27;
                }
                r22 r22Var3 = (r22) r22Var;
                if (d22VarF.g()) {
                    ob0Var2.W(1666573488);
                    boolean zF20 = ob0Var2.f(d22VarF);
                    Object objK28 = ob0Var2.K();
                    if (zF20 || objK28 == l91Var) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1VarU = uc1.u(sp1VarL);
                        try {
                            Object objC8 = d22VarF.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var2.f0(objC8);
                            objK28 = objC8;
                        } finally {
                        }
                    }
                    z4 = false;
                    ob0Var2.p(false);
                    objC2 = objK28;
                    c2 = 50445;
                } else {
                    c2 = 50445;
                    z4 = false;
                    ob0Var2.W(1666827533);
                    ob0Var2.p(false);
                    objC2 = d22VarF.c();
                }
                ci0 ci0Var5 = (ci0) objC2;
                ob0Var2.W(-154619267);
                final ym1 ym1Var10 = ym1Var;
                long jB2 = eq0Var.b(ci0Var5.a, z4, ci0Var5.b);
                ob0Var2.p(z4);
                vl vlVar3 = new vl(jB2);
                zF5 = ob0Var2.f(d22VarF);
                objK4 = ob0Var2.K();
                if (!zF5 || objK4 == l91Var) {
                    objK4 = xc.s(new rq0(5, d22VarF));
                    ob0Var2.f0(objK4);
                }
                ci0 ci0Var6 = (ci0) ((ns1) objK4).getValue();
                ob0Var2.W(-154619267);
                long jB3 = eq0Var.b(ci0Var6.a, false, ci0Var6.b);
                ob0Var2.p(false);
                vl vlVar4 = new vl(jB3);
                zF6 = ob0Var2.f(d22VarF);
                objK5 = ob0Var2.K();
                if (!zF6 || objK5 == l91Var) {
                    i5 = 6;
                    objK5 = xc.s(new rq0(6, d22VarF));
                    ob0Var2.f0(objK5);
                } else {
                    i5 = 6;
                }
                ob0Var2.W(1119846639);
                ob0Var2.p(false);
                i6 = i5;
                final c22 c22VarH2 = kd1.h(d22VarF, vlVar3, vlVar4, p60VarW, r22Var3, ob0Var2, 0);
                ci0 ci0Var7 = (ci0) v41Var.getValue();
                ob0Var2.W(-836285680);
                long jC = eq0Var.c(ci0Var7.a, false, ci0Var7.b);
                ob0Var2.p(false);
                emVarF3 = vl.f(jC);
                zF7 = ob0Var2.f(emVarF3);
                objK6 = ob0Var2.K();
                if (!zF7 || objK6 == l91Var) {
                    objK6 = new r22(a4Var, new g3(i6, emVarF3));
                    ob0Var2.f0(objK6);
                }
                r22 r22Var4 = (r22) objK6;
                if (d22VarF.g()) {
                    ob0Var2.W(1666573488);
                    boolean zF21 = ob0Var2.f(d22VarF);
                    objC3 = ob0Var2.K();
                    if (zF21 || objC3 == l91Var) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1VarU = uc1.u(sp1VarL);
                        try {
                            Object objC9 = d22VarF.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var2.f0(objC9);
                            objC3 = objC9;
                        } finally {
                        }
                    }
                    z5 = false;
                    ob0Var2.p(false);
                } else {
                    z5 = false;
                    ob0Var2.W(1666827533);
                    ob0Var2.p(false);
                    objC3 = d22VarF.c();
                }
                ci0 ci0Var8 = (ci0) objC3;
                ob0Var2.W(-836285680);
                long jC2 = eq0Var.c(ci0Var8.a, z5, ci0Var8.b);
                ob0Var2.p(z5);
                vl vlVar5 = new vl(jC2);
                zF8 = ob0Var2.f(d22VarF);
                objK7 = ob0Var2.K();
                if (!zF8 || objK7 == l91Var) {
                    objK7 = xc.s(new rq0(7, d22VarF));
                    ob0Var2.f0(objK7);
                }
                ci0 ci0Var9 = (ci0) ((ns1) objK7).getValue();
                ob0Var2.W(-836285680);
                long jC3 = eq0Var.c(ci0Var9.a, false, ci0Var9.b);
                ob0Var2.p(false);
                vl vlVar6 = new vl(jC3);
                zF9 = ob0Var2.f(d22VarF);
                objK8 = ob0Var2.K();
                if (!zF9 || objK8 == l91Var) {
                    objK8 = xc.s(new rq0(8, d22VarF));
                    ob0Var2.f0(objK8);
                }
                ob0Var2.W(438180226);
                ob0Var2.p(false);
                final c22 c22VarH3 = kd1.h(d22VarF, vlVar5, vlVar6, p60VarW, r22Var4, ob0Var2, 0);
                ci0 ci0Var10 = (ci0) v41Var.getValue();
                ob0Var2.W(-1629003078);
                long jF = eq0Var.f(ci0Var10.a, false, ci0Var10.b);
                ob0Var2.p(false);
                emVarF4 = vl.f(jF);
                zF10 = ob0Var2.f(emVarF4);
                objK9 = ob0Var2.K();
                if (!zF10 || objK9 == l91Var) {
                    objK9 = new r22(a4Var, new g3(6, emVarF4));
                    ob0Var2.f0(objK9);
                }
                r22 r22Var5 = (r22) objK9;
                if (d22VarF.g()) {
                    ob0Var2.W(1666573488);
                    boolean zF22 = ob0Var2.f(d22VarF);
                    objC4 = ob0Var2.K();
                    if (zF22 || objC4 == l91Var) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1VarU = uc1.u(sp1VarL);
                        try {
                            Object objC10 = d22VarF.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var2.f0(objC10);
                            objC4 = objC10;
                        } finally {
                        }
                    }
                    z6 = false;
                    ob0Var2.p(false);
                } else {
                    z6 = false;
                    ob0Var2.W(1666827533);
                    ob0Var2.p(false);
                    objC4 = d22VarF.c();
                }
                ci0 ci0Var11 = (ci0) objC4;
                ob0Var2.W(-1629003078);
                long jF2 = eq0Var.f(ci0Var11.a, z6, ci0Var11.b);
                ob0Var2.p(z6);
                vl vlVar7 = new vl(jF2);
                zF11 = ob0Var2.f(d22VarF);
                objK10 = ob0Var2.K();
                if (!zF11 || objK10 == l91Var) {
                    objK10 = xc.s(new rq0(9, d22VarF));
                    ob0Var2.f0(objK10);
                }
                ci0 ci0Var12 = (ci0) ((ns1) objK10).getValue();
                ob0Var2.W(-1629003078);
                long jF3 = eq0Var.f(ci0Var12.a, false, ci0Var12.b);
                ob0Var2.p(false);
                vl vlVar8 = new vl(jF3);
                zF12 = ob0Var2.f(d22VarF);
                objK11 = ob0Var2.K();
                if (!zF12 || objK11 == l91Var) {
                    objK11 = xc.s(new rq0(10, d22VarF));
                    ob0Var2.f0(objK11);
                }
                ob0Var2.W(-775265656);
                ob0Var2.p(false);
                final c22 c22VarH4 = kd1.h(d22VarF, vlVar7, vlVar8, p60VarW, r22Var5, ob0Var2, 0);
                ci0 ci0Var13 = (ci0) v41Var.getValue();
                ob0Var2.W(984715150);
                long jD = eq0Var.d(ci0Var13.a, false, ci0Var13.b);
                ob0Var2.p(false);
                emVarF5 = vl.f(jD);
                zF13 = ob0Var2.f(emVarF5);
                objK12 = ob0Var2.K();
                if (!zF13 || objK12 == l91Var) {
                    objK12 = new r22(a4Var, new g3(6, emVarF5));
                    ob0Var2.f0(objK12);
                }
                r22 r22Var6 = (r22) objK12;
                if (d22VarF.g()) {
                    ob0Var2.W(1666573488);
                    boolean zF23 = ob0Var2.f(d22VarF);
                    objC5 = ob0Var2.K();
                    if (zF23 || objC5 == l91Var) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1VarU = uc1.u(sp1VarL);
                        try {
                            Object objC11 = d22VarF.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var2.f0(objC11);
                            objC5 = objC11;
                        } finally {
                        }
                    }
                    z7 = false;
                    ob0Var2.p(false);
                } else {
                    z7 = false;
                    ob0Var2.W(1666827533);
                    ob0Var2.p(false);
                    objC5 = d22VarF.c();
                }
                ci0 ci0Var14 = (ci0) objC5;
                ob0Var2.W(984715150);
                long jD2 = eq0Var.d(ci0Var14.a, z7, ci0Var14.b);
                ob0Var2.p(z7);
                vl vlVar9 = new vl(jD2);
                zF14 = ob0Var2.f(d22VarF);
                objK13 = ob0Var2.K();
                if (!zF14 || objK13 == l91Var) {
                    objK13 = xc.s(new rq0(11, d22VarF));
                    ob0Var2.f0(objK13);
                }
                ci0 ci0Var15 = (ci0) ((ns1) objK13).getValue();
                ob0Var2.W(984715150);
                long jD3 = eq0Var.d(ci0Var15.a, false, ci0Var15.b);
                ob0Var2.p(false);
                vl vlVar10 = new vl(jD3);
                zF15 = ob0Var2.f(d22VarF);
                objK14 = ob0Var2.K();
                if (!zF15 || objK14 == l91Var) {
                    objK14 = xc.s(new rq0(0, d22VarF));
                    ob0Var2.f0(objK14);
                }
                ob0Var2.W(1838452572);
                ob0Var2.p(false);
                final c22 c22VarH5 = kd1.h(d22VarF, vlVar9, vlVar10, p60VarW, r22Var6, ob0Var2, 0);
                ci0 ci0Var16 = (ci0) v41Var.getValue();
                ob0Var2.W(-1535703933);
                long jE = eq0Var.e(ci0Var16.a, false, ci0Var16.b);
                ob0Var2.p(false);
                emVarF6 = vl.f(jE);
                zF16 = ob0Var2.f(emVarF6);
                objK15 = ob0Var2.K();
                if (!zF16 || objK15 == l91Var) {
                    objK15 = new r22(a4Var, new g3(6, emVarF6));
                    ob0Var2.f0(objK15);
                }
                r22 r22Var7 = (r22) objK15;
                if (d22VarF.g()) {
                    ob0Var2.W(1666573488);
                    boolean zF24 = ob0Var2.f(d22VarF);
                    objC6 = ob0Var2.K();
                    if (zF24 || objC6 == l91Var) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1VarU = uc1.u(sp1VarL);
                        try {
                            Object objC12 = d22VarF.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var2.f0(objC12);
                            objC6 = objC12;
                        } finally {
                        }
                    }
                    z8 = false;
                    ob0Var2.p(false);
                } else {
                    z8 = false;
                    ob0Var2.W(1666827533);
                    ob0Var2.p(false);
                    objC6 = d22VarF.c();
                }
                ci0 ci0Var17 = (ci0) objC6;
                ob0Var2.W(-1535703933);
                long jE2 = eq0Var.e(ci0Var17.a, z8, ci0Var17.b);
                ob0Var2.p(z8);
                vl vlVar11 = new vl(jE2);
                zF17 = ob0Var2.f(d22VarF);
                Object objK29 = ob0Var2.K();
                if (!zF17 || objK29 == l91Var) {
                    objS = xc.s(new rq0(1, d22VarF));
                    ob0Var2.f0(objS);
                } else {
                    objS = objK29;
                }
                ci0 ci0Var18 = (ci0) ((ns1) objS).getValue();
                ob0Var2.W(-1535703933);
                long jE3 = eq0Var.e(ci0Var18.a, false, ci0Var18.b);
                ob0Var2.p(false);
                vl vlVar12 = new vl(jE3);
                zF18 = ob0Var2.f(d22VarF);
                objK16 = ob0Var2.K();
                if (!zF18 || objK16 == l91Var) {
                    objK16 = xc.s(new rq0(2, d22VarF));
                    ob0Var2.f0(objK16);
                }
                ob0Var2.W(-1432794927);
                ob0Var2.p(false);
                final c22 c22VarH6 = kd1.h(d22VarF, vlVar11, vlVar12, p60VarW, r22Var7, ob0Var2, 0);
                final g32 g32Var = s22.I;
                final g32 g32Var2 = s22.d0;
                final g32 g32Var3 = s22.N;
                final g32 g32Var4 = s22.Y;
                final g32 g32Var5 = s22.H;
                if (((Boolean) fy0Var4.getValue()).booleanValue()) {
                    hq0Var.getClass();
                    f2 = 0.0f;
                } else {
                    f2 = hq0Var.a;
                }
                int i7 = j9.a;
                tzVar = new tz(f2);
                r22 r22Var8 = c2.R;
                objK17 = ob0Var2.K();
                if (objK17 == l91Var) {
                    objK17 = xc.B(null);
                    ob0Var2.f0(objK17);
                }
                fy0 fy0Var5 = (fy0) objK17;
                objK18 = ob0Var2.K();
                if (objK18 != l91Var) {
                    phVar = null;
                    objK18 = new h9(tzVar, r22Var8, null);
                    ob0Var2.f0(objK18);
                } else {
                    phVar = null;
                }
                h9Var = (h9) objK18;
                fy0VarD = xc.D(phVar, ob0Var2);
                fy0VarD2 = xc.D(p60VarW3, ob0Var2);
                objK19 = ob0Var2.K();
                if (objK19 == l91Var) {
                    objK19 = nu0.d(-1, 6, phVar);
                    ob0Var2.f0(objK19);
                }
                mjVar = (mj) objK19;
                zH = ob0Var2.h(mjVar) | ob0Var2.h(tzVar);
                objK20 = ob0Var2.K();
                if (!zH || objK20 == l91Var) {
                    objK20 = new f8(1, mjVar, tzVar);
                    ob0Var2.f0(objK20);
                }
                wi0.m((ha0) objK20, ob0Var2);
                zH2 = ob0Var2.h(mjVar) | ob0Var2.h(h9Var) | ob0Var2.f(fy0VarD2) | ob0Var2.f(fy0VarD);
                objK21 = ob0Var2.K();
                if (!zH2 || objK21 == l91Var) {
                    objK21 = new i9(mjVar, h9Var, fy0VarD2, fy0VarD, (ks) null);
                    ob0Var2.f0(objK21);
                }
                wi0.i((wa0) objK21, ob0Var2, mjVar);
                ns1Var = (ns1) fy0Var5.getValue();
                if (ns1Var == null) {
                    ns1Var = h9Var.c;
                }
                final hx hxVar = (hx) ob0Var2.j(aq.h);
                final al0 al0Var = (al0) ob0Var2.j(aq.n);
                pb1 pb1VarA = rr.a.a(new vl(((vl) c22VarH2.l.getValue()).a));
                final ns1 ns1Var2 = ns1Var;
                wa0 wa0Var4 = new wa0() { // from class: mq0
                    @Override // defpackage.wa0
                    public final Object h(Object obj, Object obj2) {
                        ob0 ob0Var3 = (ob0) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (ob0Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            qv0 qv0Var = qv0.a;
                            tv0 tv0VarA = ko1.a(ol1.a(qv0Var, true, sa0Var), Float.NaN, s22.L);
                            ud0 ud0Var = bi0.a;
                            tv0 tv0VarC = tv0VarA.c(nv0.a);
                            final ns1 ns1Var3 = ns1Var2;
                            boolean zF25 = ob0Var3.f(ns1Var3);
                            Object objK30 = ob0Var3.K();
                            l91 l91Var2 = kp.a;
                            if (zF25 || objK30 == l91Var2) {
                                objK30 = new a70() { // from class: iq0
                                    @Override // defpackage.a70
                                    public final float a() {
                                        return tz.a(((tz) ns1Var3.getValue()).e, 0.0f) > 0 ? 1.0f : 0.0f;
                                    }
                                };
                                ob0Var3.f0(objK30);
                            }
                            tv0 tv0VarY = s22.y(tv0VarC, new wi(4, (a70) objK30));
                            hx hxVar2 = hxVar;
                            boolean zF26 = ob0Var3.f(hxVar2) | ob0Var3.f(ns1Var3);
                            ym1 ym1Var11 = ym1Var10;
                            boolean zF27 = zF26 | ob0Var3.f(ym1Var11);
                            Object objK31 = ob0Var3.K();
                            int i8 = 10;
                            if (zF27 || objK31 == l91Var2) {
                                objK31 = new kf(hxVar2, ym1Var11, ns1Var3, i8);
                                ob0Var3.f0(objK31);
                            }
                            tv0 tv0VarH = xk.h(xi0.p(c2.m(tv0VarY, (sa0) objK31), ((vl) c22VarH.getValue()).a, ym1Var11), ym1Var11);
                            vf1 vf1VarA = jf1.a(0.0f, ym1Var11, 247);
                            jx0 jx0Var2 = jx0Var;
                            boolean z9 = z;
                            ha0 ha0Var2 = ha0Var;
                            tv0 tv0VarC2 = tv0VarH.c(vf1VarA != null ? new dn(ha0Var2, vf1VarA, jx0Var2, z9) : vf1VarA == null ? new dn(ha0Var2, null, jx0Var2, z9) : jx0Var2 != null ? mf0.a(qv0Var, jx0Var2, vf1VarA).c(new dn(ha0Var2, null, jx0Var2, z9)) : bk.q(qv0Var, new tk(vf1VarA, z9, ha0Var2)));
                            final c41 c41Var2 = c41Var;
                            tv0 tv0VarB = xi0.B(tv0VarC2, c41Var2);
                            final int i9 = 0;
                            final al0 al0Var2 = al0Var;
                            final g32 g32Var6 = g32Var;
                            final wa0 wa0Var5 = wa0Var;
                            final ns1 ns1Var4 = c22VarH3;
                            jo joVarD0 = lk.d0(-334713283, new wa0() { // from class: oq0
                                @Override // defpackage.wa0
                                public final Object h(Object obj3, Object obj4) {
                                    int i10 = i9;
                                    t32 t32Var = t32.a;
                                    ns1 ns1Var5 = ns1Var4;
                                    al0 al0Var3 = al0Var2;
                                    c41 c41Var3 = c41Var2;
                                    switch (i10) {
                                        case 0:
                                            ob0 ob0Var4 = (ob0) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (!ob0Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                ob0Var4.Q();
                                            } else {
                                                sq0.e(xi0.r(c41Var3, al0Var3), ((vl) ns1Var5.getValue()).a, g32Var6, wa0Var5, ob0Var4, 384);
                                            }
                                            break;
                                        default:
                                            ob0 ob0Var5 = (ob0) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            if (!ob0Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                ob0Var5.Q();
                                            } else {
                                                sq0.i(xi0.q(c41Var3, al0Var3), ((vl) ns1Var5.getValue()).a, g32Var6, wa0Var5, ob0Var5, 384);
                                            }
                                            break;
                                    }
                                    return t32Var;
                                }
                            }, ob0Var3);
                            final int i10 = 1;
                            final g32 g32Var7 = g32Var2;
                            final wa0 wa0Var6 = wa0Var2;
                            final ns1 ns1Var5 = c22VarH4;
                            sq0.d(tv0VarB, a3Var, joVarD0, lk.d0(-1109808834, new wa0() { // from class: oq0
                                @Override // defpackage.wa0
                                public final Object h(Object obj3, Object obj4) {
                                    int i102 = i10;
                                    t32 t32Var = t32.a;
                                    ns1 ns1Var52 = ns1Var5;
                                    al0 al0Var3 = al0Var2;
                                    c41 c41Var3 = c41Var2;
                                    switch (i102) {
                                        case 0:
                                            ob0 ob0Var4 = (ob0) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (!ob0Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                ob0Var4.Q();
                                            } else {
                                                sq0.e(xi0.r(c41Var3, al0Var3), ((vl) ns1Var52.getValue()).a, g32Var7, wa0Var6, ob0Var4, 384);
                                            }
                                            break;
                                        default:
                                            ob0 ob0Var5 = (ob0) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            if (!ob0Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                ob0Var5.Q();
                                            } else {
                                                sq0.i(xi0.q(c41Var3, al0Var3), ((vl) ns1Var52.getValue()).a, g32Var7, wa0Var6, ob0Var5, 384);
                                            }
                                            break;
                                    }
                                    return t32Var;
                                }
                            }, ob0Var3), lk.d0(-1884904385, new fi(i8, g32Var3, c22VarH5), ob0Var3), lk.d0(1634967360, new o8(g32Var4, wa0Var3, c22VarH6, 5), ob0Var3), lk.d0(859871809, new o8(6, joVar, g32Var5, c22VarH2), ob0Var3), ob0Var3, 1797504);
                        } else {
                            ob0Var3.Q();
                        }
                        return t32.a;
                    }
                };
                ob0Var2 = ob0Var;
                lk.i(pb1VarA, lk.d0(-1377981779, wa0Var4, ob0Var2), ob0Var2, 56);
            }
            ob0Var2.p(z2);
            ym1Var = ym1VarR;
            d22VarF = kd1.F(new ci0(z, ((Boolean) fy0Var4.getValue()).booleanValue()), "ListColor", ob0Var2, 48);
            v41 v41Var2 = d22VarF.d;
            ci0 ci0Var19 = (ci0) v41Var2.getValue();
            ob0Var2.W(519559029);
            long jA4 = eq0Var.a(ci0Var19.a, false, ci0Var19.b);
            ob0Var2.p(false);
            emVarF = vl.f(jA4);
            zF = ob0Var2.f(emVarF);
            objK = ob0Var2.K();
            if (!zF) {
                objK = new r22(a4Var, new g3(6, emVarF));
                ob0Var2.f0(objK);
                r22 r22Var22 = (r22) objK;
                if (d22VarF.g()) {
                }
                ci0 ci0Var22 = (ci0) objC;
                ob0Var2.W(519559029);
                long jA22 = eq0Var.a(ci0Var22.a, z3, ci0Var22.b);
                ob0Var2.p(z3);
                vl vlVar13 = new vl(jA22);
                zF2 = ob0Var2.f(d22VarF);
                objK2 = ob0Var2.K();
                if (!zF2) {
                    objK2 = xc.s(new rq0(3, d22VarF));
                    ob0Var2.f0(objK2);
                    ci0 ci0Var32 = (ci0) ((ns1) objK2).getValue();
                    ob0Var2.W(519559029);
                    long jA32 = eq0Var.a(ci0Var32.a, false, ci0Var32.b);
                    ob0Var2.p(false);
                    vl vlVar22 = new vl(jA32);
                    zF3 = ob0Var2.f(d22VarF);
                    objK3 = ob0Var2.K();
                    if (!zF3) {
                        objK3 = xc.s(new rq0(4, d22VarF));
                        ob0Var2.f0(objK3);
                        ob0Var2.W(1215615335);
                        ob0Var2.p(false);
                        final c22 c22VarH7 = kd1.h(d22VarF, vlVar13, vlVar22, p60VarW, r22Var22, ob0Var2, 0);
                        ci0 ci0Var42 = (ci0) v41Var2.getValue();
                        ob0Var2.W(-154619267);
                        long jB4 = eq0Var.b(ci0Var42.a, false, ci0Var42.b);
                        ob0Var2.p(false);
                        emVarF2 = vl.f(jB4);
                        zF4 = ob0Var2.f(emVarF2);
                        Object objK272 = ob0Var2.K();
                        if (zF4) {
                            r22Var = new r22(a4Var, new g3(6, emVarF2));
                            ob0Var2.f0(r22Var);
                            r22 r22Var32 = (r22) r22Var;
                            if (d22VarF.g()) {
                            }
                            ci0 ci0Var52 = (ci0) objC2;
                            ob0Var2.W(-154619267);
                            final ym1 ym1Var102 = ym1Var;
                            long jB22 = eq0Var.b(ci0Var52.a, z4, ci0Var52.b);
                            ob0Var2.p(z4);
                            vl vlVar32 = new vl(jB22);
                            zF5 = ob0Var2.f(d22VarF);
                            objK4 = ob0Var2.K();
                            if (!zF5) {
                                objK4 = xc.s(new rq0(5, d22VarF));
                                ob0Var2.f0(objK4);
                                ci0 ci0Var62 = (ci0) ((ns1) objK4).getValue();
                                ob0Var2.W(-154619267);
                                long jB32 = eq0Var.b(ci0Var62.a, false, ci0Var62.b);
                                ob0Var2.p(false);
                                vl vlVar42 = new vl(jB32);
                                zF6 = ob0Var2.f(d22VarF);
                                objK5 = ob0Var2.K();
                                if (zF6) {
                                    i5 = 6;
                                    objK5 = xc.s(new rq0(6, d22VarF));
                                    ob0Var2.f0(objK5);
                                    ob0Var2.W(1119846639);
                                    ob0Var2.p(false);
                                    i6 = i5;
                                    final c22 c22VarH22 = kd1.h(d22VarF, vlVar32, vlVar42, p60VarW, r22Var32, ob0Var2, 0);
                                    ci0 ci0Var72 = (ci0) v41Var2.getValue();
                                    ob0Var2.W(-836285680);
                                    long jC4 = eq0Var.c(ci0Var72.a, false, ci0Var72.b);
                                    ob0Var2.p(false);
                                    emVarF3 = vl.f(jC4);
                                    zF7 = ob0Var2.f(emVarF3);
                                    objK6 = ob0Var2.K();
                                    if (!zF7) {
                                        objK6 = new r22(a4Var, new g3(i6, emVarF3));
                                        ob0Var2.f0(objK6);
                                        r22 r22Var42 = (r22) objK6;
                                        if (d22VarF.g()) {
                                        }
                                        ci0 ci0Var82 = (ci0) objC3;
                                        ob0Var2.W(-836285680);
                                        long jC22 = eq0Var.c(ci0Var82.a, z5, ci0Var82.b);
                                        ob0Var2.p(z5);
                                        vl vlVar52 = new vl(jC22);
                                        zF8 = ob0Var2.f(d22VarF);
                                        objK7 = ob0Var2.K();
                                        if (!zF8) {
                                            objK7 = xc.s(new rq0(7, d22VarF));
                                            ob0Var2.f0(objK7);
                                            ci0 ci0Var92 = (ci0) ((ns1) objK7).getValue();
                                            ob0Var2.W(-836285680);
                                            long jC32 = eq0Var.c(ci0Var92.a, false, ci0Var92.b);
                                            ob0Var2.p(false);
                                            vl vlVar62 = new vl(jC32);
                                            zF9 = ob0Var2.f(d22VarF);
                                            objK8 = ob0Var2.K();
                                            if (!zF9) {
                                                objK8 = xc.s(new rq0(8, d22VarF));
                                                ob0Var2.f0(objK8);
                                                ob0Var2.W(438180226);
                                                ob0Var2.p(false);
                                                final c22 c22VarH32 = kd1.h(d22VarF, vlVar52, vlVar62, p60VarW, r22Var42, ob0Var2, 0);
                                                ci0 ci0Var102 = (ci0) v41Var2.getValue();
                                                ob0Var2.W(-1629003078);
                                                long jF4 = eq0Var.f(ci0Var102.a, false, ci0Var102.b);
                                                ob0Var2.p(false);
                                                emVarF4 = vl.f(jF4);
                                                zF10 = ob0Var2.f(emVarF4);
                                                objK9 = ob0Var2.K();
                                                if (!zF10) {
                                                    objK9 = new r22(a4Var, new g3(6, emVarF4));
                                                    ob0Var2.f0(objK9);
                                                    r22 r22Var52 = (r22) objK9;
                                                    if (d22VarF.g()) {
                                                    }
                                                    ci0 ci0Var112 = (ci0) objC4;
                                                    ob0Var2.W(-1629003078);
                                                    long jF22 = eq0Var.f(ci0Var112.a, z6, ci0Var112.b);
                                                    ob0Var2.p(z6);
                                                    vl vlVar72 = new vl(jF22);
                                                    zF11 = ob0Var2.f(d22VarF);
                                                    objK10 = ob0Var2.K();
                                                    if (!zF11) {
                                                        objK10 = xc.s(new rq0(9, d22VarF));
                                                        ob0Var2.f0(objK10);
                                                        ci0 ci0Var122 = (ci0) ((ns1) objK10).getValue();
                                                        ob0Var2.W(-1629003078);
                                                        long jF32 = eq0Var.f(ci0Var122.a, false, ci0Var122.b);
                                                        ob0Var2.p(false);
                                                        vl vlVar82 = new vl(jF32);
                                                        zF12 = ob0Var2.f(d22VarF);
                                                        objK11 = ob0Var2.K();
                                                        if (!zF12) {
                                                            objK11 = xc.s(new rq0(10, d22VarF));
                                                            ob0Var2.f0(objK11);
                                                            ob0Var2.W(-775265656);
                                                            ob0Var2.p(false);
                                                            final c22 c22VarH42 = kd1.h(d22VarF, vlVar72, vlVar82, p60VarW, r22Var52, ob0Var2, 0);
                                                            ci0 ci0Var132 = (ci0) v41Var2.getValue();
                                                            ob0Var2.W(984715150);
                                                            long jD4 = eq0Var.d(ci0Var132.a, false, ci0Var132.b);
                                                            ob0Var2.p(false);
                                                            emVarF5 = vl.f(jD4);
                                                            zF13 = ob0Var2.f(emVarF5);
                                                            objK12 = ob0Var2.K();
                                                            if (!zF13) {
                                                                objK12 = new r22(a4Var, new g3(6, emVarF5));
                                                                ob0Var2.f0(objK12);
                                                                r22 r22Var62 = (r22) objK12;
                                                                if (d22VarF.g()) {
                                                                }
                                                                ci0 ci0Var142 = (ci0) objC5;
                                                                ob0Var2.W(984715150);
                                                                long jD22 = eq0Var.d(ci0Var142.a, z7, ci0Var142.b);
                                                                ob0Var2.p(z7);
                                                                vl vlVar92 = new vl(jD22);
                                                                zF14 = ob0Var2.f(d22VarF);
                                                                objK13 = ob0Var2.K();
                                                                if (!zF14) {
                                                                    objK13 = xc.s(new rq0(11, d22VarF));
                                                                    ob0Var2.f0(objK13);
                                                                    ci0 ci0Var152 = (ci0) ((ns1) objK13).getValue();
                                                                    ob0Var2.W(984715150);
                                                                    long jD32 = eq0Var.d(ci0Var152.a, false, ci0Var152.b);
                                                                    ob0Var2.p(false);
                                                                    vl vlVar102 = new vl(jD32);
                                                                    zF15 = ob0Var2.f(d22VarF);
                                                                    objK14 = ob0Var2.K();
                                                                    if (!zF15) {
                                                                        objK14 = xc.s(new rq0(0, d22VarF));
                                                                        ob0Var2.f0(objK14);
                                                                        ob0Var2.W(1838452572);
                                                                        ob0Var2.p(false);
                                                                        final c22 c22VarH52 = kd1.h(d22VarF, vlVar92, vlVar102, p60VarW, r22Var62, ob0Var2, 0);
                                                                        ci0 ci0Var162 = (ci0) v41Var2.getValue();
                                                                        ob0Var2.W(-1535703933);
                                                                        long jE4 = eq0Var.e(ci0Var162.a, false, ci0Var162.b);
                                                                        ob0Var2.p(false);
                                                                        emVarF6 = vl.f(jE4);
                                                                        zF16 = ob0Var2.f(emVarF6);
                                                                        objK15 = ob0Var2.K();
                                                                        if (!zF16) {
                                                                            objK15 = new r22(a4Var, new g3(6, emVarF6));
                                                                            ob0Var2.f0(objK15);
                                                                            r22 r22Var72 = (r22) objK15;
                                                                            if (d22VarF.g()) {
                                                                            }
                                                                            ci0 ci0Var172 = (ci0) objC6;
                                                                            ob0Var2.W(-1535703933);
                                                                            long jE22 = eq0Var.e(ci0Var172.a, z8, ci0Var172.b);
                                                                            ob0Var2.p(z8);
                                                                            vl vlVar112 = new vl(jE22);
                                                                            zF17 = ob0Var2.f(d22VarF);
                                                                            Object objK292 = ob0Var2.K();
                                                                            if (zF17) {
                                                                                objS = xc.s(new rq0(1, d22VarF));
                                                                                ob0Var2.f0(objS);
                                                                                ci0 ci0Var182 = (ci0) ((ns1) objS).getValue();
                                                                                ob0Var2.W(-1535703933);
                                                                                long jE32 = eq0Var.e(ci0Var182.a, false, ci0Var182.b);
                                                                                ob0Var2.p(false);
                                                                                vl vlVar122 = new vl(jE32);
                                                                                zF18 = ob0Var2.f(d22VarF);
                                                                                objK16 = ob0Var2.K();
                                                                                if (!zF18) {
                                                                                    objK16 = xc.s(new rq0(2, d22VarF));
                                                                                    ob0Var2.f0(objK16);
                                                                                    ob0Var2.W(-1432794927);
                                                                                    ob0Var2.p(false);
                                                                                    final c22 c22VarH62 = kd1.h(d22VarF, vlVar112, vlVar122, p60VarW, r22Var72, ob0Var2, 0);
                                                                                    final g32 g32Var6 = s22.I;
                                                                                    final g32 g32Var22 = s22.d0;
                                                                                    final g32 g32Var32 = s22.N;
                                                                                    final g32 g32Var42 = s22.Y;
                                                                                    final g32 g32Var52 = s22.H;
                                                                                    if (((Boolean) fy0Var4.getValue()).booleanValue()) {
                                                                                    }
                                                                                    int i72 = j9.a;
                                                                                    tzVar = new tz(f2);
                                                                                    r22 r22Var82 = c2.R;
                                                                                    objK17 = ob0Var2.K();
                                                                                    if (objK17 == l91Var) {
                                                                                    }
                                                                                    fy0 fy0Var52 = (fy0) objK17;
                                                                                    objK18 = ob0Var2.K();
                                                                                    if (objK18 != l91Var) {
                                                                                    }
                                                                                    h9Var = (h9) objK18;
                                                                                    fy0VarD = xc.D(phVar, ob0Var2);
                                                                                    fy0VarD2 = xc.D(p60VarW3, ob0Var2);
                                                                                    objK19 = ob0Var2.K();
                                                                                    if (objK19 == l91Var) {
                                                                                    }
                                                                                    mjVar = (mj) objK19;
                                                                                    zH = ob0Var2.h(mjVar) | ob0Var2.h(tzVar);
                                                                                    objK20 = ob0Var2.K();
                                                                                    if (!zH) {
                                                                                        objK20 = new f8(1, mjVar, tzVar);
                                                                                        ob0Var2.f0(objK20);
                                                                                        wi0.m((ha0) objK20, ob0Var2);
                                                                                        zH2 = ob0Var2.h(mjVar) | ob0Var2.h(h9Var) | ob0Var2.f(fy0VarD2) | ob0Var2.f(fy0VarD);
                                                                                        objK21 = ob0Var2.K();
                                                                                        if (!zH2) {
                                                                                            objK21 = new i9(mjVar, h9Var, fy0VarD2, fy0VarD, (ks) null);
                                                                                            ob0Var2.f0(objK21);
                                                                                            wi0.i((wa0) objK21, ob0Var2, mjVar);
                                                                                            ns1Var = (ns1) fy0Var52.getValue();
                                                                                            if (ns1Var == null) {
                                                                                            }
                                                                                            final hx hxVar2 = (hx) ob0Var2.j(aq.h);
                                                                                            final al0 al0Var2 = (al0) ob0Var2.j(aq.n);
                                                                                            pb1 pb1VarA2 = rr.a.a(new vl(((vl) c22VarH22.l.getValue()).a));
                                                                                            final ns1 ns1Var22 = ns1Var;
                                                                                            wa0 wa0Var42 = new wa0() { // from class: mq0
                                                                                                @Override // defpackage.wa0
                                                                                                public final Object h(Object obj, Object obj2) {
                                                                                                    ob0 ob0Var3 = (ob0) obj;
                                                                                                    int iIntValue = ((Integer) obj2).intValue();
                                                                                                    if (ob0Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                                        qv0 qv0Var = qv0.a;
                                                                                                        tv0 tv0VarA = ko1.a(ol1.a(qv0Var, true, sa0Var), Float.NaN, s22.L);
                                                                                                        ud0 ud0Var = bi0.a;
                                                                                                        tv0 tv0VarC = tv0VarA.c(nv0.a);
                                                                                                        final ns1 ns1Var3 = ns1Var22;
                                                                                                        boolean zF25 = ob0Var3.f(ns1Var3);
                                                                                                        Object objK30 = ob0Var3.K();
                                                                                                        l91 l91Var2 = kp.a;
                                                                                                        if (zF25 || objK30 == l91Var2) {
                                                                                                            objK30 = new a70() { // from class: iq0
                                                                                                                @Override // defpackage.a70
                                                                                                                public final float a() {
                                                                                                                    return tz.a(((tz) ns1Var3.getValue()).e, 0.0f) > 0 ? 1.0f : 0.0f;
                                                                                                                }
                                                                                                            };
                                                                                                            ob0Var3.f0(objK30);
                                                                                                        }
                                                                                                        tv0 tv0VarY = s22.y(tv0VarC, new wi(4, (a70) objK30));
                                                                                                        hx hxVar22 = hxVar2;
                                                                                                        boolean zF26 = ob0Var3.f(hxVar22) | ob0Var3.f(ns1Var3);
                                                                                                        ym1 ym1Var11 = ym1Var102;
                                                                                                        boolean zF27 = zF26 | ob0Var3.f(ym1Var11);
                                                                                                        Object objK31 = ob0Var3.K();
                                                                                                        int i8 = 10;
                                                                                                        if (zF27 || objK31 == l91Var2) {
                                                                                                            objK31 = new kf(hxVar22, ym1Var11, ns1Var3, i8);
                                                                                                            ob0Var3.f0(objK31);
                                                                                                        }
                                                                                                        tv0 tv0VarH = xk.h(xi0.p(c2.m(tv0VarY, (sa0) objK31), ((vl) c22VarH7.getValue()).a, ym1Var11), ym1Var11);
                                                                                                        vf1 vf1VarA = jf1.a(0.0f, ym1Var11, 247);
                                                                                                        jx0 jx0Var2 = jx0Var;
                                                                                                        boolean z9 = z;
                                                                                                        ha0 ha0Var2 = ha0Var;
                                                                                                        tv0 tv0VarC2 = tv0VarH.c(vf1VarA != null ? new dn(ha0Var2, vf1VarA, jx0Var2, z9) : vf1VarA == null ? new dn(ha0Var2, null, jx0Var2, z9) : jx0Var2 != null ? mf0.a(qv0Var, jx0Var2, vf1VarA).c(new dn(ha0Var2, null, jx0Var2, z9)) : bk.q(qv0Var, new tk(vf1VarA, z9, ha0Var2)));
                                                                                                        final c41 c41Var2 = c41Var;
                                                                                                        tv0 tv0VarB = xi0.B(tv0VarC2, c41Var2);
                                                                                                        final int i9 = 0;
                                                                                                        final al0 al0Var22 = al0Var2;
                                                                                                        final g32 g32Var62 = g32Var6;
                                                                                                        final wa0 wa0Var5 = wa0Var;
                                                                                                        final ns1 ns1Var4 = c22VarH32;
                                                                                                        jo joVarD0 = lk.d0(-334713283, new wa0() { // from class: oq0
                                                                                                            @Override // defpackage.wa0
                                                                                                            public final Object h(Object obj3, Object obj4) {
                                                                                                                int i102 = i9;
                                                                                                                t32 t32Var = t32.a;
                                                                                                                ns1 ns1Var52 = ns1Var4;
                                                                                                                al0 al0Var3 = al0Var22;
                                                                                                                c41 c41Var3 = c41Var2;
                                                                                                                switch (i102) {
                                                                                                                    case 0:
                                                                                                                        ob0 ob0Var4 = (ob0) obj3;
                                                                                                                        int iIntValue2 = ((Integer) obj4).intValue();
                                                                                                                        if (!ob0Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                                            ob0Var4.Q();
                                                                                                                        } else {
                                                                                                                            sq0.e(xi0.r(c41Var3, al0Var3), ((vl) ns1Var52.getValue()).a, g32Var62, wa0Var5, ob0Var4, 384);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        ob0 ob0Var5 = (ob0) obj3;
                                                                                                                        int iIntValue3 = ((Integer) obj4).intValue();
                                                                                                                        if (!ob0Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                                                            ob0Var5.Q();
                                                                                                                        } else {
                                                                                                                            sq0.i(xi0.q(c41Var3, al0Var3), ((vl) ns1Var52.getValue()).a, g32Var62, wa0Var5, ob0Var5, 384);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                return t32Var;
                                                                                                            }
                                                                                                        }, ob0Var3);
                                                                                                        final int i10 = 1;
                                                                                                        final g32 g32Var7 = g32Var22;
                                                                                                        final wa0 wa0Var6 = wa0Var2;
                                                                                                        final ns1 ns1Var5 = c22VarH42;
                                                                                                        sq0.d(tv0VarB, a3Var, joVarD0, lk.d0(-1109808834, new wa0() { // from class: oq0
                                                                                                            @Override // defpackage.wa0
                                                                                                            public final Object h(Object obj3, Object obj4) {
                                                                                                                int i102 = i10;
                                                                                                                t32 t32Var = t32.a;
                                                                                                                ns1 ns1Var52 = ns1Var5;
                                                                                                                al0 al0Var3 = al0Var22;
                                                                                                                c41 c41Var3 = c41Var2;
                                                                                                                switch (i102) {
                                                                                                                    case 0:
                                                                                                                        ob0 ob0Var4 = (ob0) obj3;
                                                                                                                        int iIntValue2 = ((Integer) obj4).intValue();
                                                                                                                        if (!ob0Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                                            ob0Var4.Q();
                                                                                                                        } else {
                                                                                                                            sq0.e(xi0.r(c41Var3, al0Var3), ((vl) ns1Var52.getValue()).a, g32Var7, wa0Var6, ob0Var4, 384);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        ob0 ob0Var5 = (ob0) obj3;
                                                                                                                        int iIntValue3 = ((Integer) obj4).intValue();
                                                                                                                        if (!ob0Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                                                            ob0Var5.Q();
                                                                                                                        } else {
                                                                                                                            sq0.i(xi0.q(c41Var3, al0Var3), ((vl) ns1Var52.getValue()).a, g32Var7, wa0Var6, ob0Var5, 384);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                return t32Var;
                                                                                                            }
                                                                                                        }, ob0Var3), lk.d0(-1884904385, new fi(i8, g32Var32, c22VarH52), ob0Var3), lk.d0(1634967360, new o8(g32Var42, wa0Var3, c22VarH62, 5), ob0Var3), lk.d0(859871809, new o8(6, joVar, g32Var52, c22VarH22), ob0Var3), ob0Var3, 1797504);
                                                                                                    } else {
                                                                                                        ob0Var3.Q();
                                                                                                    }
                                                                                                    return t32.a;
                                                                                                }
                                                                                            };
                                                                                            ob0Var2 = ob0Var;
                                                                                            lk.i(pb1VarA2, lk.d0(-1377981779, wa0Var42, ob0Var2), ob0Var2, 56);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0() { // from class: nq0
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = al.V(i | 1);
                    int iV2 = al.V(i2);
                    sq0.c(joVar, wa0Var, wa0Var2, wa0Var3, a3Var, z, sa0Var, ha0Var, eq0Var, tq0Var, hq0Var, c41Var, (ob0) obj, iV, iV2);
                    return t32.a;
                }
            };
        }
    }

    public static final void d(final tv0 tv0Var, final a3 a3Var, final jo joVar, final jo joVar2, final jo joVar3, final jo joVar4, final jo joVar5, ob0 ob0Var, final int i) {
        ob0Var.X(-1118275927);
        int i2 = i | (ob0Var.f(tv0Var) ? 4 : 2) | (ob0Var.f(a3Var) ? 32 : 16);
        if (ob0Var.N(i2 & 1, (599187 & i2) != 599186)) {
            boolean z = (i2 & 112) == 32;
            Object objK = ob0Var.K();
            Object obj = kp.a;
            if (z || objK == obj) {
                objK = new ii0(a3Var);
                ob0Var.f0(objK);
            }
            ii0 ii0Var = (ii0) objK;
            jo joVar6 = new jo(1271844412, true, new q(7, hk.H(joVar, joVar2, joVar3, joVar4, joVar5)));
            boolean zF = ob0Var.f(ii0Var);
            Object objK2 = ob0Var.K();
            if (zF || objK2 == obj) {
                objK2 = new uw0(ii0Var);
                ob0Var.f0(objK2);
            }
            uu0 uu0Var = (uu0) objK2;
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0Var);
            ep.c.getClass();
            ha0 ha0Var = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(ha0Var);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, uu0Var);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            joVar6.h(ob0Var, 0);
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(a3Var, joVar, joVar2, joVar3, joVar4, joVar5, i) { // from class: kq0
                public final /* synthetic */ a3 f;
                public final /* synthetic */ jo g;
                public final /* synthetic */ jo h;
                public final /* synthetic */ jo i;
                public final /* synthetic */ jo j;
                public final /* synthetic */ jo k;

                @Override // defpackage.wa0
                public final Object h(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iV = al.V(1797505);
                    sq0.d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ob0) obj2, iV);
                    return t32.a;
                }
            };
        }
    }

    public static final void e(float f2, long j, g32 g32Var, wa0 wa0Var, ob0 ob0Var, int i) {
        g32 g32Var2;
        ob0Var.X(748132977);
        int i2 = i | (ob0Var.c(f2) ? 4 : 2) | (ob0Var.e(j) ? 32 : 16) | (ob0Var.h(wa0Var) ? 2048 : 1024);
        if (!ob0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            g32Var2 = g32Var;
            ob0Var.Q();
        } else if (wa0Var != null) {
            ob0Var.W(1044406198);
            qv0 qv0Var = qv0.a;
            float f3 = e;
            tv0 tv0VarF = xi0.F(qv0Var, 0.0f, f3, 11);
            uu0 uu0VarD = sg.d(v20.f, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0VarF);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, uu0VarD);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            float f4 = f2 + f3;
            ys1 ys1Var = bi0.c;
            float f5 = ((tz) ob0Var.j(ys1Var)).e;
            if (Float.isNaN(f5)) {
                f5 = 0.0f;
            }
            tz tzVar = new tz(f5 - f4);
            tz tzVar2 = new tz(0.0f);
            if (tzVar.compareTo(tzVar2) < 0) {
                tzVar = tzVar2;
            }
            g32Var2 = g32Var;
            bk.f(j, h32.a(g32Var2, ob0Var), new pb1[]{ys1Var.a(new tz(tzVar.e))}, wa0Var, ob0Var, (i2 & 7168) | ((i2 >> 3) & 14) | 512);
            ob0Var.p(true);
            ob0Var.p(false);
        } else {
            g32Var2 = g32Var;
            ob0Var.W(1045077937);
            ob0Var.p(false);
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new jq0(f2, j, g32Var2, wa0Var, i, 1);
        }
    }

    public static final void f(long j, g32 g32Var, ob0 ob0Var, int i) {
        ob0Var.X(899793657);
        int i2 = (ob0Var.e(j) ? 4 : 2) | i | (ob0Var.h(null) ? 256 : 128);
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            ob0Var.W(862289545);
            ob0Var.p(false);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new d5(j, g32Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final ha0 ha0Var, final tq0 tq0Var, boolean z, final wa0 wa0Var, final wa0 wa0Var2, final wa0 wa0Var3, a3 a3Var, final eq0 eq0Var, hq0 hq0Var, c41 c41Var, final jo joVar, ob0 ob0Var, final int i, final int i2) {
        int i3;
        boolean z2;
        wa0 wa0Var4;
        wa0 wa0Var5;
        int i4;
        int i5;
        final a3 a3Var2;
        final hq0 hq0Var2;
        final c41 c41Var2;
        final boolean z3;
        dc1 dc1VarR;
        a3 a3Var3;
        int i6;
        int i7;
        c41 c41Var3;
        hq0 hq0Var3;
        ob0Var.X(-1701010568);
        if ((i & 6) == 0) {
            i3 = (ob0Var.h(ha0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ob0Var.f(tq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ob0Var.f(qv0.a) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= ob0Var.g(z2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                wa0Var4 = wa0Var;
                i3 |= ob0Var.h(wa0Var4) ? 16384 : 8192;
            } else {
                wa0Var4 = wa0Var;
            }
            if ((196608 & i) != 0) {
                wa0Var5 = wa0Var2;
                i3 |= ob0Var.h(wa0Var5) ? 131072 : 65536;
            } else {
                wa0Var5 = wa0Var2;
            }
            int i9 = i3 | 1572864;
            if ((i & 12582912) == 0) {
                i9 |= ob0Var.h(wa0Var3) ? 8388608 : 4194304;
            }
            if ((100663296 & i) == 0) {
                i9 |= 33554432;
            }
            i4 = i9 | 805306368;
            i5 = (ob0Var.f(eq0Var) ? 32 : 16) | 224390;
            if (ob0Var.N(i4 & 1, (306783379 & i4) == 306783378 || (74899 & i5) != 74898)) {
                ob0Var.Q();
                a3Var2 = a3Var;
                hq0Var2 = hq0Var;
                c41Var2 = c41Var;
                z3 = z2;
            } else {
                ob0Var.S();
                int i10 = i & 1;
                Object obj = kp.a;
                if (i10 == 0 || ob0Var.x()) {
                    if (i8 != 0) {
                        z2 = true;
                    }
                    e41 e41Var = gq0.a;
                    final hx hxVar = (hx) ob0Var.j(aq.h);
                    boolean zF = ob0Var.f(hxVar);
                    Object objK = ob0Var.K();
                    if (zF || objK == obj) {
                        objK = new a3() { // from class: fq0
                            @Override // defpackage.a3
                            public final int a(int i11, int i12) {
                                return (i12 < hxVar.N(sq0.f) ? v20.p : v20.o).a(i11, i12);
                            }
                        };
                        ob0Var.f0(objK);
                    }
                    a3Var3 = (a3) objK;
                    i6 = i4 & (-234881025);
                    hq0 hq0Var4 = new hq0(s22.D);
                    i7 = i5 & (-897);
                    c41Var3 = gq0.a;
                    hq0Var3 = hq0Var4;
                } else {
                    ob0Var.Q();
                    i6 = i4 & (-234881025);
                    hq0Var3 = hq0Var;
                    c41Var3 = c41Var;
                    i7 = i5 & (-897);
                    a3Var3 = a3Var;
                }
                ob0Var.q();
                Object objK2 = ob0Var.K();
                if (objK2 == obj) {
                    objK2 = new mt(15);
                    ob0Var.f0(objK2);
                }
                int i11 = i6 >> 6;
                int i12 = (i11 & 896) | (i11 & 14) | 905969712 | (i11 & 7168) | (i11 & 57344) | (i11 & 458752);
                int i13 = i6 << 12;
                int i14 = (i6 & 14) | ((i6 >> 24) & 112) | 3456 | ((i7 << 9) & 57344) | (i13 & 458752) | 12582912;
                boolean z4 = z2;
                a3 a3Var4 = a3Var3;
                c(joVar, wa0Var4, wa0Var5, wa0Var3, a3Var4, z4, (sa0) objK2, ha0Var, eq0Var, tq0Var, hq0Var3, c41Var3, ob0Var, i12 | (i13 & 29360128), i14);
                a3Var2 = a3Var4;
                z3 = z4;
                hq0Var2 = hq0Var3;
                c41Var2 = c41Var3;
            }
            dc1VarR = ob0Var.r();
            if (dc1VarR == null) {
                dc1VarR.d = new wa0() { // from class: lq0
                    @Override // defpackage.wa0
                    public final Object h(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iV = al.V(i | 1);
                        sq0.g(ha0Var, tq0Var, z3, wa0Var, wa0Var2, wa0Var3, a3Var2, eq0Var, hq0Var2, c41Var2, joVar, (ob0) obj2, iV, i2);
                        return t32.a;
                    }
                };
                return;
            }
            return;
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        int i92 = i3 | 1572864;
        if ((i & 12582912) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        i4 = i92 | 805306368;
        i5 = (ob0Var.f(eq0Var) ? 32 : 16) | 224390;
        if (ob0Var.N(i4 & 1, (306783379 & i4) == 306783378 || (74899 & i5) != 74898)) {
        }
        dc1VarR = ob0Var.r();
        if (dc1VarR == null) {
        }
    }

    public static final void h(long j, g32 g32Var, wa0 wa0Var, ob0 ob0Var, int i) {
        ob0Var.X(-3493404);
        int i2 = i | (ob0Var.e(j) ? 4 : 2) | (ob0Var.h(wa0Var) ? 256 : 128);
        if (!ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            ob0Var.Q();
        } else if (wa0Var != null) {
            ob0Var.W(-992630287);
            uu0 uu0VarD = sg.d(v20.f, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, qv0.a);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, uu0VarD);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            bk.e(j, h32.a(g32Var, ob0Var), wa0Var, ob0Var, i2 & 910);
            ob0Var.p(true);
            ob0Var.p(false);
        } else {
            ob0Var.W(-992433282);
            ob0Var.p(false);
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new e5(j, g32Var, wa0Var, i, 2);
        }
    }

    public static final void i(float f2, long j, g32 g32Var, wa0 wa0Var, ob0 ob0Var, int i) {
        g32 g32Var2;
        ob0Var.X(-2086562817);
        int i2 = i | (ob0Var.c(f2) ? 4 : 2) | (ob0Var.e(j) ? 32 : 16) | (ob0Var.h(wa0Var) ? 2048 : 1024);
        if (!ob0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            g32Var2 = g32Var;
            ob0Var.Q();
        } else if (wa0Var != null) {
            ob0Var.W(268980104);
            qv0 qv0Var = qv0.a;
            float f3 = e;
            tv0 tv0VarF = xi0.F(qv0Var, f3, 0.0f, 14);
            uu0 uu0VarD = sg.d(v20.f, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0VarF);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, uu0VarD);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            float f4 = f2 + f3;
            ys1 ys1Var = bi0.c;
            float f5 = ((tz) ob0Var.j(ys1Var)).e;
            if (Float.isNaN(f5)) {
                f5 = 0.0f;
            }
            tz tzVar = new tz(f5 - f4);
            tz tzVar2 = new tz(0.0f);
            if (tzVar.compareTo(tzVar2) < 0) {
                tzVar = tzVar2;
            }
            g32Var2 = g32Var;
            bk.f(j, h32.a(g32Var2, ob0Var), new pb1[]{ys1Var.a(new tz(tzVar.e))}, wa0Var, ob0Var, (i2 & 7168) | ((i2 >> 3) & 14) | 512);
            ob0Var.p(true);
            ob0Var.p(false);
        } else {
            g32Var2 = g32Var;
            ob0Var.W(269651843);
            ob0Var.p(false);
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new jq0(f2, j, g32Var2, wa0Var, i, 0);
        }
    }
}
