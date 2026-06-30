package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ib1 {
    public static final gu a = kw0.d;

    public static final void a(final tv0 tv0Var, long j, final float f, long j2, int i, float f2, ob0 ob0Var, final int i2, final int i3) {
        final long j3;
        final int i4;
        final float f3;
        final long j4;
        long j5;
        int i5;
        float f4;
        final int i6;
        Object obj;
        final float f5;
        final long j6;
        final long j7;
        ob0Var.X(333154241);
        long jC = j;
        int i7 = i2 | (((i3 & 2) == 0 && ob0Var.e(jC)) ? 32 : 16) | 222208;
        if (ob0Var.N(i7 & 1, (74899 & i7) != 74898)) {
            ob0Var.S();
            if ((i2 & 1) == 0 || ob0Var.x()) {
                if ((i3 & 2) != 0) {
                    jC = dm.c(u4.f0, ob0Var);
                    i7 &= -113;
                }
                j5 = vl.f;
                i5 = i7 & (-7169);
                f4 = 4.0f;
                i6 = 1;
            } else {
                ob0Var.Q();
                if ((i3 & 2) != 0) {
                    i7 &= -113;
                }
                j5 = j2;
                i6 = i;
                i5 = i7 & (-7169);
                f4 = f2;
            }
            ob0Var.q();
            final kt1 kt1Var = new kt1(((hx) ob0Var.j(aq.h)).y(f), 0.0f, i6, 0, 26);
            Object objK = ob0Var.K();
            Object obj2 = kp.a;
            if (objK == obj2) {
                objK = new ig0();
                ob0Var.f0(objK);
            }
            ig0 ig0Var = (ig0) objK;
            ig0Var.a(ob0Var, 0);
            final gg0 gg0VarN = bl.n(ig0Var, 0.0f, 1080.0f, pv.s(pv.G(6000, 2, k20.b), 6), ob0Var);
            mt mtVar = new mt(23);
            pk0 pk0Var = new pk0();
            mtVar.i(pk0Var);
            final gg0 gg0VarN2 = bl.n(ig0Var, 0.0f, 360.0f, pv.s(new qk0(pk0Var), 6), ob0Var);
            pk0 pk0Var2 = new pk0();
            pk0Var2.a = 6000;
            float f6 = f4;
            pk0Var2.a(Float.valueOf(0.87f), 3000).b = a;
            pk0Var2.a(Float.valueOf(0.1f), 6000);
            final gg0 gg0VarN3 = bl.n(ig0Var, 0.1f, 0.87f, pv.s(new qk0(pk0Var2), 6), ob0Var);
            tv0 tv0VarE = ko1.e(ol1.a(tv0Var, true, new mt(24)), 40.0f);
            boolean zF = ob0Var.f(gg0VarN3) | ob0Var.f(gg0VarN) | ob0Var.f(gg0VarN2) | ob0Var.e(j5) | ob0Var.h(kt1Var) | ((((i5 & 112) ^ 48) > 32 && ob0Var.e(jC)) || (i5 & 48) == 32);
            Object objK2 = ob0Var.K();
            if (zF || objK2 == obj2) {
                f5 = f6;
                j6 = jC;
                j7 = j5;
                obj = new sa0() { // from class: gb1
                    @Override // defpackage.sa0
                    public final Object i(Object obj3) {
                        long j8 = j7;
                        kt1 kt1Var2 = kt1Var;
                        long j9 = j6;
                        p10 p10Var = (p10) obj3;
                        float fFloatValue = ((Number) gg0VarN3.getValue()).floatValue() * 360.0f;
                        int i8 = i6;
                        float f7 = f5;
                        if (i8 != 0 && Float.intBitsToFloat((int) (p10Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (p10Var.d() >> 32))) {
                            f7 += f;
                        }
                        float fV0 = (f7 / ((float) (((double) p10Var.v0(Float.intBitsToFloat((int) (p10Var.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) gg0VarN2.getValue()).floatValue() + ((Number) gg0VarN.getValue()).floatValue();
                        long jS = p10Var.S();
                        oc ocVarE = p10Var.E();
                        long jQ = ocVarE.q();
                        ocVarE.i().l();
                        try {
                            ((qt0) ocVarE.a).w(fFloatValue2, jS);
                            ib1.b(p10Var, Math.min(fFloatValue, fV0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fV0) * 2.0f), j8, kt1Var2);
                            ib1.b(p10Var, 0.0f, fFloatValue, j9, kt1Var2);
                            s91.r(ocVarE, jQ);
                            return t32.a;
                        } catch (Throwable th) {
                            s91.r(ocVarE, jQ);
                            throw th;
                        }
                    }
                };
                ob0Var.f0(obj);
            } else {
                j6 = jC;
                j7 = j5;
                obj = objK2;
                f5 = f6;
            }
            u4.a(tv0VarE, (sa0) obj, ob0Var, 0);
            i4 = i6;
            f3 = f5;
            j3 = j7;
            j4 = j6;
        } else {
            ob0Var.Q();
            j3 = j2;
            i4 = i;
            f3 = f2;
            j4 = jC;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(j4, f, j3, i4, f3, i2, i3) { // from class: hb1
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;
                public final /* synthetic */ long h;
                public final /* synthetic */ int i;
                public final /* synthetic */ float j;
                public final /* synthetic */ int k;

                {
                    this.k = i3;
                }

                @Override // defpackage.wa0
                public final Object h(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iV = al.V(391);
                    ib1.a(this.e, this.f, this.g, this.h, this.i, this.j, (ob0) obj3, iV, this.k);
                    return t32.a;
                }
            };
        }
    }

    public static final void b(p10 p10Var, float f, float f2, long j, kt1 kt1Var) {
        float f3 = kt1Var.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p10Var.d() >> 32)) - (2.0f * f3);
        p10Var.w0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), kt1Var);
    }
}
