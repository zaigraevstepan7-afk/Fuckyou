package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class fp1 {
    public static final float a = u4.t0;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final x52 f;

    static {
        float f2 = u4.r0;
        b = f2;
        float f3 = u4.p0;
        c = bk.c(f2, f3);
        bk.c(f3, f2);
        d = 6.0f;
        e = 2.0f;
        f = new x52(ap1.l);
    }

    public static final void a(final float f2, final sa0 sa0Var, tv0 tv0Var, boolean z, final fl flVar, final ha0 ha0Var, no1 no1Var, jx0 jx0Var, ob0 ob0Var, final int i) {
        final tv0 tv0Var2;
        final boolean z2;
        final no1 no1Var2;
        final jx0 jx0Var2;
        int i2;
        tv0 tv0Var3;
        no1 no1Var3;
        jx0 jx0Var3;
        ob0Var.X(-202044027);
        int i3 = i | (ob0Var.c(f2) ? 4 : 2) | (ob0Var.h(sa0Var) ? 32 : 16) | 3456 | (ob0Var.f(flVar) ? 16384 : 8192) | 196608 | (ob0Var.h(ha0Var) ? 1048576 : 524288) | 104857600;
        boolean z3 = true;
        if (ob0Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                uo1 uo1Var = uo1.a;
                no1 no1VarD = uo1.d(ob0Var);
                i2 = i3 & (-29360129);
                Object objK = ob0Var.K();
                if (objK == kp.a) {
                    objK = new jx0();
                    ob0Var.f0(objK);
                }
                tv0Var3 = qv0.a;
                no1Var3 = no1VarD;
                jx0Var3 = (jx0) objK;
            } else {
                ob0Var.Q();
                i2 = i3 & (-29360129);
                tv0Var3 = tv0Var;
                z3 = z;
                no1Var3 = no1Var;
                jx0Var3 = jx0Var;
            }
            ob0Var.q();
            b(f2, sa0Var, tv0Var3, z3, ha0Var, no1Var3, jx0Var3, lk.d0(308249025, new zo1(jx0Var3, no1Var3, z3), ob0Var), lk.d0(-1843234110, new z7(no1Var3, z3), ob0Var), flVar, ob0Var, (i2 & 14) | 905969664 | (i2 & 112) | 3456 | (57344 & (i2 >> 6)) | 14155776, (i2 >> 12) & 14);
            tv0Var2 = tv0Var3;
            no1Var2 = no1Var3;
            jx0Var2 = jx0Var3;
            z2 = z3;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            z2 = z;
            no1Var2 = no1Var;
            jx0Var2 = jx0Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(f2, sa0Var, tv0Var2, z2, flVar, ha0Var, no1Var2, jx0Var2, i) { // from class: wo1
                public final /* synthetic */ float e;
                public final /* synthetic */ sa0 f;
                public final /* synthetic */ tv0 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ fl i;
                public final /* synthetic */ ha0 j;
                public final /* synthetic */ no1 k;
                public final /* synthetic */ jx0 l;

                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = al.V(1);
                    fp1.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (ob0) obj, iV);
                    return t32.a;
                }
            };
        }
    }

    public static final void b(final float f2, final sa0 sa0Var, final tv0 tv0Var, final boolean z, final ha0 ha0Var, no1 no1Var, final jx0 jx0Var, final jo joVar, final jo joVar2, final fl flVar, ob0 ob0Var, final int i, final int i2) {
        int i3;
        no1 no1Var2;
        jo joVar3;
        int i4;
        ob0Var.X(985901935);
        if ((i & 6) == 0) {
            i3 = (ob0Var.c(f2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ob0Var.h(sa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ob0Var.f(tv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ob0Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ob0Var.h(ha0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            no1Var2 = no1Var;
            i3 |= ob0Var.f(no1Var2) ? 131072 : 65536;
        } else {
            no1Var2 = no1Var;
        }
        if ((1572864 & i) == 0) {
            i3 |= ob0Var.f(jx0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ob0Var.d(0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            joVar3 = joVar;
            i3 |= ob0Var.h(joVar3) ? 67108864 : 33554432;
        } else {
            joVar3 = joVar;
        }
        if ((i & 805306368) == 0) {
            i3 |= ob0Var.h(joVar2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ob0Var.f(flVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        boolean z2 = true;
        if (ob0Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            ob0Var.S();
            if ((i & 1) != 0 && !ob0Var.x()) {
                ob0Var.Q();
            }
            ob0Var.q();
            boolean z3 = (29360128 & i3) == 8388608;
            if ((((i4 & 14) ^ 6) <= 4 || !ob0Var.f(flVar)) && (i4 & 6) != 4) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objK = ob0Var.K();
            if (z4 || objK == kp.a) {
                objK = new hp1(f2, ha0Var, flVar);
                ob0Var.f0(objK);
            }
            hp1 hp1Var = (hp1) objK;
            hp1Var.a = ha0Var;
            hp1Var.d = sa0Var;
            hp1Var.c(f2);
            int i5 = ((i3 >> 3) & 1008) | ((i3 >> 6) & 57344);
            int i6 = i3 >> 9;
            c(hp1Var, tv0Var, z, null, jx0Var, joVar3, joVar2, ob0Var, i5 | (458752 & i6) | (i6 & 3670016));
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            final no1 no1Var3 = no1Var2;
            dc1VarR.d = new wa0() { // from class: vo1
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fp1.b(f2, sa0Var, tv0Var, z, ha0Var, no1Var3, jx0Var, joVar, joVar2, flVar, (ob0) obj, al.V(i | 1), al.V(i2));
                    return t32.a;
                }
            };
        }
    }

    public static final void c(hp1 hp1Var, tv0 tv0Var, boolean z, no1 no1Var, jx0 jx0Var, jo joVar, jo joVar2, ob0 ob0Var, int i) {
        int i2;
        no1 no1Var2;
        int i3;
        no1 no1VarD;
        ob0Var.X(409861960);
        if ((i & 6) == 0) {
            i2 = (ob0Var.h(hp1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.f(tv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ob0Var.f(jx0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ob0Var.h(joVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ob0Var.h(joVar2) ? 1048576 : 524288;
        }
        if (ob0Var.N(i2 & 1, (599187 & i2) != 599186)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                uo1 uo1Var = uo1.a;
                i3 = i2 & (-7169);
                no1VarD = uo1.d(ob0Var);
            } else {
                ob0Var.Q();
                i3 = i2 & (-7169);
                no1VarD = no1Var;
            }
            ob0Var.q();
            int i4 = i3 >> 3;
            d(tv0Var, hp1Var, z, jx0Var, joVar, joVar2, ob0Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            no1Var2 = no1VarD;
        } else {
            ob0Var.Q();
            no1Var2 = no1Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new pe0(hp1Var, tv0Var, z, no1Var2, jx0Var, joVar, joVar2, i);
        }
    }

    public static final void d(tv0 tv0Var, hp1 hp1Var, boolean z, jx0 jx0Var, jo joVar, jo joVar2, ob0 ob0Var, int i) {
        int i2;
        jo joVar3;
        hp1 hp1Var2;
        fy0 fy0Var;
        boolean z2;
        r41 r41Var;
        tv0 av1Var;
        jo joVar4 = joVar2;
        fl flVar = hp1Var.b;
        ob0Var.X(898172835);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(hp1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ob0Var.f(jx0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ob0Var.h(joVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ob0Var.h(joVar4) ? 131072 : 65536;
        }
        int i3 = i2;
        int i4 = 1;
        if (ob0Var.N(i3 & 1, (74899 & i3) != 74898)) {
            hp1Var.i = ob0Var.j(aq.n) == al0.f;
            r41 r41Var2 = hp1Var.c;
            k31 k31Var = hp1Var.m;
            int i5 = i3 >> 9;
            fy0 fy0VarQ = el.q(jx0Var, ob0Var, i5 & 14);
            Boolean bool = (Boolean) fy0VarQ.getValue();
            bool.getClass();
            hp1Var.j.setValue(bool);
            if (k31Var == k31.f && hp1Var.i) {
                fy0Var = fy0VarQ;
                z2 = true;
            } else {
                fy0Var = fy0VarQ;
                z2 = false;
            }
            qv0 qv0Var = qv0.a;
            if (z) {
                at atVar = new at(i4, jx0Var, hp1Var);
                e81 e81Var = bv1.a;
                r41Var = r41Var2;
                av1Var = new av1(hp1Var, jx0Var, atVar, 4);
            } else {
                r41Var = r41Var2;
                av1Var = qv0Var;
            }
            k31 k31Var2 = hp1Var.m;
            boolean zBooleanValue = ((Boolean) hp1Var.n.getValue()).booleanValue();
            boolean zH = ob0Var.h(hp1Var);
            Object objK = ob0Var.K();
            Object obj = kp.a;
            if (zH || objK == obj) {
                objK = new cp1(hp1Var, null);
                ob0Var.f0(objK);
            }
            tv0 tv0Var2 = av1Var;
            fy0 fy0Var2 = fy0Var;
            d10 d10Var = new d10(hp1Var, k31Var2, z, jx0Var, zBooleanValue, g10.a, (xa0) objK, z2);
            boolean z3 = z2;
            hp1Var2 = hp1Var;
            oo1 oo1Var = oo1.e;
            k31 k31Var3 = k31.e;
            tv0 tv0VarJ = k31Var == k31Var3 ? ko1.j(xi0.A(qv0Var, oo1Var)) : ko1.l(xi0.A(qv0Var, oo1Var));
            wf1 wf1Var = ((xf1) ob0Var.j(jf1.a)).a;
            ob0Var.W(-177303905);
            ob0Var.p(false);
            hx hxVar = (hx) ob0Var.j(aq.h);
            ud0 ud0Var = bi0.a;
            tv0 tv0VarC = tv0Var.c(nv0.a);
            float f2 = b;
            float f3 = a;
            float f4 = f3;
            if (k31Var != k31Var3) {
                f3 = f2;
            }
            if (k31Var == k31Var3) {
                f4 = f2;
            }
            tv0 tv0VarA = ol1.a(ko1.d(tv0VarC, f3, f4, 0.0f, 0.0f, 12), false, new se(z, hp1Var2));
            tv0 tv0Var3 = tv0VarJ;
            tv0 tv0VarO = nu0.o(ol1.a(tv0VarA.c(k31Var == k31Var3 ? q1.b : q1.a), true, new t00(r41Var.g(), new fl(flVar.a, flVar.b), 1)), z, jx0Var);
            float fG = r41Var.g();
            boolean zH2 = ob0Var.h(hp1Var2);
            Object objK2 = ob0Var.K();
            if (zH2 || objK2 == obj) {
                objK2 = new yo1(hp1Var2, 0);
                ob0Var.f0(objK2);
            }
            tv0 tv0VarC2 = c2.p(tv0VarO, new dp1(z, flVar, z3, (sa0) objK2, k31Var == k31Var3, fG, hp1Var2.a)).c(tv0Var2).c(d10Var);
            boolean zG = ob0Var.g(false) | ob0Var.f(fy0Var2) | ob0Var.h(hp1Var2);
            Object objK3 = ob0Var.K();
            if (zG || objK3 == obj) {
                objK3 = new bp1(hp1Var2, fy0Var2);
                ob0Var.f0(objK3);
            }
            uu0 uu0Var = (uu0) objK3;
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0VarC2);
            ep.c.getClass();
            ha0 ha0Var = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(ha0Var);
            } else {
                ob0Var.i0();
            }
            r9 r9Var = dp.f;
            xc.E(r9Var, ob0Var, uu0Var);
            r9 r9Var2 = dp.e;
            xc.E(r9Var2, ob0Var, b61VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            r9 r9Var3 = dp.g;
            xc.E(r9Var3, ob0Var, numValueOf);
            a4 a4Var = dp.h;
            xc.C(ob0Var, a4Var);
            r9 r9Var4 = dp.d;
            xc.E(r9Var4, ob0Var, tv0VarP);
            tv0 tv0VarC3 = tv0Var3.c(qv0Var);
            boolean zF = ob0Var.f(fy0Var2) | ob0Var.g(false) | ob0Var.f(hxVar) | ob0Var.h(hp1Var2);
            Object objK4 = ob0Var.K();
            if (zF || objK4 == obj) {
                objK4 = new yo1(hxVar, hp1Var2, fy0Var2);
                ob0Var.f0(objK4);
            }
            tv0 tv0VarY = pv.y(tv0VarC3, (sa0) objK4);
            uf ufVar = v20.f;
            uu0 uu0VarD = sg.d(ufVar, false);
            int iHashCode2 = Long.hashCode(ob0Var.T);
            b61 b61VarL2 = ob0Var.l();
            tv0 tv0VarP2 = bk.P(ob0Var, tv0VarY);
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(ha0Var);
            } else {
                ob0Var.i0();
            }
            xc.E(r9Var, ob0Var, uu0VarD);
            xc.E(r9Var2, ob0Var, b61VarL2);
            s91.q(iHashCode2, ob0Var, r9Var3, ob0Var, a4Var);
            xc.E(r9Var4, ob0Var, tv0VarP2);
            int i6 = (i3 >> 3) & 14;
            joVar3 = joVar;
            joVar3.f(hp1Var2, ob0Var, Integer.valueOf((i5 & 112) | i6));
            ob0Var.p(true);
            tv0 tv0VarA2 = xi0.A(qv0Var, oo1.f);
            uu0 uu0VarD2 = sg.d(ufVar, false);
            int iHashCode3 = Long.hashCode(ob0Var.T);
            b61 b61VarL3 = ob0Var.l();
            tv0 tv0VarP3 = bk.P(ob0Var, tv0VarA2);
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(ha0Var);
            } else {
                ob0Var.i0();
            }
            xc.E(r9Var, ob0Var, uu0VarD2);
            xc.E(r9Var2, ob0Var, b61VarL3);
            s91.q(iHashCode3, ob0Var, r9Var3, ob0Var, a4Var);
            xc.E(r9Var4, ob0Var, tv0VarP3);
            joVar4 = joVar2;
            joVar4.f(hp1Var2, ob0Var, Integer.valueOf(i6 | ((i3 >> 12) & 112)));
            ob0Var.p(true);
            ob0Var.p(true);
        } else {
            joVar3 = joVar;
            hp1Var2 = hp1Var;
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hs(tv0Var, hp1Var2, z, jx0Var, joVar3, joVar4, i);
        }
    }

    public static final void e(final jx0 jx0Var, final tv0 tv0Var, final no1 no1Var, final boolean z, final long j, ob0 ob0Var, final int i) {
        int i2;
        long jFloatToRawIntBits;
        ob0Var.X(2115331054);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(jx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.f(tv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.f(no1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ob0Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ob0Var.e(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ob0Var.g(false) ? 131072 : 65536;
        }
        int i3 = 1;
        if (ob0Var.N(i2 & 1, (74899 & i2) != 74898)) {
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (objK == l91Var) {
                objK = new mq1();
                ob0Var.f0(objK);
            }
            mq1 mq1Var = (mq1) objK;
            boolean z2 = (i2 & 14) == 4;
            Object objK2 = ob0Var.K();
            if (z2 || objK2 == l91Var) {
                objK2 = new ai(jx0Var, mq1Var, null, i3);
                ob0Var.f0(objK2);
            }
            wi0.i((wa0) objK2, ob0Var, jx0Var);
            if (mq1Var.isEmpty()) {
                jFloatToRawIntBits = j;
            } else {
                float fB = wz.b(j) / 2.0f;
                if ((2 & 1) != 0) {
                    fB = wz.b(j);
                }
                float fA = (2 & 2) != 0 ? wz.a(j) : 0.0f;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fA)) & 4294967295L) | (((long) Float.floatToRawIntBits(fB)) << 32);
            }
            j60 j60Var = ko1.a;
            tv0 tv0VarR = pv.r(ko1.f(tv0Var, wz.b(j), wz.a(j)), jx0Var);
            j81.a.getClass();
            tv0 tv0VarE = xk.E(tv0VarR, wi0.y);
            uu0 uu0VarD = sg.d(v20.j, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0VarE);
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
            qc1.b(ob0Var, xi0.p(ko1.f(qv0.a, wz.b(jFloatToRawIntBits), wz.a(jFloatToRawIntBits)), z ? no1Var.a : no1Var.f, qn1.b(u4.q0, ob0Var)));
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0() { // from class: xo1
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fp1.e(jx0Var, tv0Var, no1Var, z, j, (ob0) obj, al.V(i | 1));
                    return t32.a;
                }
            };
        }
    }

    public static final float f(float f2, float[] fArr, float f3, float f4) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f5);
            } else {
                float fAbs = Math.abs(xk.A(f3, f4, f5) - f2);
                if (1 <= length) {
                    while (true) {
                        float f6 = fArr[i];
                        float fAbs2 = Math.abs(xk.A(f3, f4, f6) - f2);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f5 = f6;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? xk.A(f3, f4, fValueOf.floatValue()) : f2;
    }
}
