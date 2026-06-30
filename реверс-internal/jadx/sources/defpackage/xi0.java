package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Trace;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class xi0 {
    public static final cm C;
    public static final float D;
    public static final cm E;
    public static final float F;
    public static final cm G;
    public static final float H;
    public static final cm I;
    public static final float J;
    public static final cm K;
    public static final cm L;
    public static final en1 M;
    public static final float N;
    public static final cm O;
    public static final float P;
    public static final cm Q;
    public static final float R;
    public static final float S;
    public static final float T;
    public static final en1 U;
    public static final float V;
    public static final cm W;
    public static final cm X;
    public static final float Y;
    public static final cm Z;
    public static final cm a0;
    public static final s30 b0;
    public static final gi1 c0;
    public static final gi1 d0;
    public static final gi1 e0;
    public static ye0 f0;
    public static final jo i;
    public static final jo j;
    public static final jo k;
    public static final jo l;
    public static final jo m;
    public static final oo x;
    public static final ya a = new ya(Float.POSITIVE_INFINITY);
    public static final za b = new za(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ab c = new ab(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final bb d = new bb(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ya e = new ya(Float.NEGATIVE_INFINITY);
    public static final za f = new za(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ab g = new ab(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final bb h = new bb(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final jo n = new jo(-2115169638, false, new no(5));
    public static final a81 o = new a81(null, new m71());
    public static final ef0 p = new ef0(false);
    public static final h72 q = new h72(0.31006f, 0.31616f);
    public static final h72 r = new h72(0.34567f, 0.3585f);
    public static final h72 s = new h72(0.32168f, 0.33767f);
    public static final h72 t = new h72(0.31271f, 0.32902f);
    public static final float[] u = {0.964212f, 1.0f, 0.825188f};
    public static final vm v = new vm();
    public static final mt w = new mt(22);
    public static final xf1 y = new xf1(new wf1());
    public static final Object z = new Object();
    public static final cm A = cm.p;
    public static final float B = 1.0f;

    static {
        int i2 = 2;
        byte b2 = 0;
        i = new jo(-2116026871, false, new pc(i2, b2));
        j = new jo(116947506, false, new pc(3, b2));
        int i3 = 4;
        k = new jo(1996474129, false, new pc(i3, b2));
        int i4 = 9;
        l = new jo(-1567520749, false, new pc(i4, b2));
        m = new jo(90021357, false, new no(i3));
        x = new oo(i2);
        cm cmVar = cm.i;
        C = cmVar;
        D = 0.38f;
        E = cmVar;
        F = 0.12f;
        G = cmVar;
        H = 0.38f;
        cm cmVar2 = cm.q;
        I = cmVar2;
        J = 0.38f;
        K = cmVar2;
        L = cmVar;
        en1 en1Var = en1.g;
        M = en1Var;
        N = 28.0f;
        O = cm.f;
        P = 24.0f;
        Q = cm.m;
        R = 40.0f;
        S = 32.0f;
        T = 2.0f;
        U = en1Var;
        V = 52.0f;
        cm cmVar3 = cm.l;
        W = cmVar3;
        X = cmVar3;
        Y = 16.0f;
        Z = cmVar2;
        a0 = cmVar2;
        b0 = new s30("NO_THREAD_ELEMENTS", 1);
        c0 = new gi1(i4);
        d0 = new gi1(10);
        e0 = new gi1(11);
    }

    public static final tv0 A(tv0 tv0Var, Object obj) {
        return tv0Var.c(new dl0(obj));
    }

    public static final tv0 B(tv0 tv0Var, c41 c41Var) {
        return tv0Var.c(new d41(c41Var));
    }

    public static final tv0 C(tv0 tv0Var, float f2) {
        return tv0Var.c(new a41(f2, f2, f2, f2));
    }

    public static final tv0 D(tv0 tv0Var, float f2, float f3) {
        return tv0Var.c(new a41(f2, f3, f2, f3));
    }

    public static tv0 E(tv0 tv0Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return D(tv0Var, f2, f3);
    }

    public static tv0 F(tv0 tv0Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return tv0Var.c(new a41(f2, 0.0f, f3, 0.0f));
    }

    public static final void G(lt ltVar, Object obj) {
        if (obj == b0) {
            return;
        }
        if (!(obj instanceof o02)) {
            Object objQ = ltVar.q(d0, null);
            objQ.getClass();
            Trace.endSection();
            return;
        }
        o02 o02Var = (o02) obj;
        p12[] p12VarArr = o02Var.c;
        int length = p12VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            p12VarArr[length].getClass();
            Trace.endSection();
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static void H(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static tv0 I(tv0 tv0Var, boolean z2, jx0 jx0Var, vf1 vf1Var, boolean z3, ha0 ha0Var) {
        tv0 tv0VarC;
        if (vf1Var != null) {
            tv0VarC = new rk1(z2, jx0Var, vf1Var, z3, ha0Var);
        } else if (vf1Var == null) {
            tv0VarC = new rk1(z2, jx0Var, null, z3, ha0Var);
        } else {
            qv0 qv0Var = qv0.a;
            tv0VarC = jx0Var != null ? mf0.a(qv0Var, jx0Var, vf1Var).c(new rk1(z2, jx0Var, null, z3, ha0Var)) : bk.q(qv0Var, new sk1(vf1Var, z2, z3, ha0Var));
        }
        return tv0Var.c(tv0VarC);
    }

    public static final Object J(lt ltVar) {
        Object objQ = ltVar.q(c0, 0);
        objQ.getClass();
        return objQ;
    }

    public static void K(String str) {
        pn pnVar = new pn(s91.l("lateinit property ", str, " has not been initialized"));
        H(pnVar, xi0.class.getName());
        throw pnVar;
    }

    public static final void L() {
        throw new UnsupportedOperationException();
    }

    public static final Object M(lt ltVar, Object obj) {
        if (obj == null) {
            obj = J(ltVar);
        }
        if (obj == 0) {
            return b0;
        }
        if (obj instanceof Integer) {
            return ltVar.q(e0, new o02(((Number) obj).intValue(), ltVar));
        }
        Trace.beginSection(null);
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(lt ltVar, Object obj, Object obj2, wa0 wa0Var, ks ksVar) throws Throwable {
        pj pjVar;
        Object objM;
        Object objH;
        if (ksVar instanceof pj) {
            pjVar = (pj) ksVar;
            int i2 = pjVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pjVar.l = i2 - Integer.MIN_VALUE;
            } else {
                pjVar = new pj(ksVar);
            }
        }
        Object obj3 = pjVar.k;
        int i3 = pjVar.l;
        if (i3 != 0) {
            if (i3 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = pjVar.j;
            lt ltVar2 = pjVar.i;
            try {
                xc.G(obj3);
                objM = obj4;
                ltVar = ltVar2;
                G(ltVar, objM);
                return obj3;
            } catch (Throwable th) {
                objM = obj4;
                ltVar = ltVar2;
                th = th;
                G(ltVar, objM);
                throw th;
            }
        }
        xc.G(obj3);
        objM = M(ltVar, obj2);
        try {
            pjVar.h = obj;
            pjVar.i = ltVar;
            pjVar.j = objM;
            pjVar.l = 1;
            hr1 hr1Var = new hr1(pjVar, ltVar);
            if (wa0Var == null) {
                objH = bl.X(wa0Var, obj, hr1Var);
            } else {
                s22.i(2, wa0Var);
                objH = wa0Var.h(obj, hr1Var);
            }
            obj3 = objH;
            Object obj5 = wt.e;
            if (obj3 == obj5) {
                return obj5;
            }
            G(ltVar, objM);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            G(ltVar, objM);
            throw th;
        }
    }

    public static h9 a(float f2) {
        return new h9(Float.valueOf(f2), c2.P, Float.valueOf(0.01f), 8);
    }

    public static final void b(String str, ob0 ob0Var, int i2) {
        ob0Var.X(-366462673);
        int i3 = (ob0Var.f(str) ? 4 : 2) | i2;
        byte b2 = 0;
        if (ob0Var.N(i3 & 1, (i3 & 3) != 2)) {
            vu1.a(null, fn1.a, ((ju0) ob0Var.j(mu0.b)).a.c, 0L, lk.d0(-2087195852, new td(str, b2, b2), ob0Var), ob0Var, 12582912, 121);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new td(str, i2);
        }
    }

    public static final void c(ArrayList arrayList, int i2, sa0 sa0Var, tv0 tv0Var, ob0 ob0Var, int i3) {
        int i4;
        sa0Var.getClass();
        ob0Var.X(-2034684122);
        if ((i3 & 6) == 0) {
            i4 = (ob0Var.h(arrayList) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= ob0Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= ob0Var.h(sa0Var) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if (ob0Var.N(i5 & 1, (i5 & 1171) != 1170)) {
            pd1.e(ko1.a, 0.0f, lk.d0(-1039407877, new hj(arrayList, i2, sa0Var), ob0Var), ob0Var, 384);
            tv0Var = qv0.a;
        } else {
            ob0Var.Q();
        }
        tv0 tv0Var2 = tv0Var;
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ij(arrayList, i2, sa0Var, tv0Var2, i3, 0);
        }
    }

    public static final lx d(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        v90 v90VarA = w90.a(f2);
        if (v90VarA == null) {
            v90VarA = new op0(f2);
        }
        return new lx(f3, f2, v90VarA);
    }

    public static final void e(a11 a11Var, b3 b3Var, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ob0Var.f(a11Var) : ob0Var.h(a11Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.f(b3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(joVar) ? 256 : 128;
        }
        boolean z2 = true;
        if (ob0Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !ob0Var.f(a11Var))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objK = ob0Var.K();
            if (z4 || objK == kp.a) {
                objK = new bd0(b3Var, a11Var);
                ob0Var.f0(objK);
            }
            l7.a((bd0) objK, null, new z81(false, dk1.e, false), joVar, ob0Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(a11Var, b3Var, joVar, i2, 0);
        }
    }

    public static final e41 f(float f2, float f3, float f4, float f5) {
        return new e41(f2, f3, f4, f5);
    }

    public static e41 g(float f2) {
        return new e41(0.0f, 0.0f, 0.0f, f2);
    }

    public static final void h(final a11 a11Var, final boolean z2, final ee1 ee1Var, final boolean z3, long j2, final float f2, final tv0 tv0Var, ob0 ob0Var, final int i2) {
        int i3;
        final long j3;
        int i4;
        long j4;
        final boolean z4;
        ob0Var.X(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ob0Var.f(a11Var) : ob0Var.h(a11Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.d(ee1Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var.g(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ob0Var.f(tv0Var) ? 1048576 : 524288;
        }
        if (ob0Var.N(i3 & 1, (533651 & i3) != 533650)) {
            ob0Var.S();
            if ((i2 & 1) == 0 || ob0Var.x()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                ob0Var.Q();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            ob0Var.q();
            ee1 ee1Var2 = ee1.f;
            ee1 ee1Var3 = ee1.e;
            if (z2) {
                zl1 zl1Var = hl1.a;
                z4 = (ee1Var == ee1Var3 && !z3) || (ee1Var == ee1Var2 && z3);
            } else {
                zl1 zl1Var2 = hl1.a;
                z4 = (ee1Var != ee1Var3 || z3) && !(ee1Var == ee1Var2 && z3);
            }
            rf rfVar = z4 ? u4.b : u4.a;
            int i5 = i4 & 14;
            boolean zG = (i5 == 4 || ((i4 & 8) != 0 && ob0Var.h(a11Var))) | ((i4 & 112) == 32) | ob0Var.g(z4);
            Object objK = ob0Var.K();
            if (zG || objK == kp.a) {
                objK = new sa0() { // from class: t7
                    @Override // defpackage.sa0
                    public final Object i(Object obj) {
                        am1 am1Var = (am1) obj;
                        long jA = a11Var.a();
                        am1Var.a(hl1.a, new gl1(z2 ? ad0.f : ad0.g, jA, z4 ? fl1.e : fl1.g, (9223372034707292159L & jA) != 9205357640488583168L));
                        return t32.a;
                    }
                };
                ob0Var.f0(objK);
            }
            final tv0 tv0VarA = ol1.a(tv0Var, false, (sa0) objK);
            final j62 j62Var = (j62) ob0Var.j(aq.t);
            long j5 = j4;
            rf rfVar2 = rfVar;
            j3 = j5;
            e(a11Var, rfVar2, lk.d0(1365123137, new wa0() { // from class: u7
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ob0 ob0Var2 = (ob0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ob0Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        pb1 pb1VarA = aq.t.a(j62Var);
                        final long j6 = j3;
                        final boolean z5 = z4;
                        final tv0 tv0Var2 = tv0VarA;
                        final a11 a11Var2 = a11Var;
                        lk.i(pb1VarA, lk.d0(1260045569, new wa0() { // from class: w7
                            @Override // defpackage.wa0
                            public final Object h(Object obj3, Object obj4) {
                                ob0 ob0Var3 = (ob0) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i6 = 1;
                                final int i7 = 0;
                                if (ob0Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j7 = j6;
                                    boolean z6 = z5;
                                    tv0 tv0Var3 = tv0Var2;
                                    final a11 a11Var3 = a11Var2;
                                    l91 l91Var = kp.a;
                                    if (j7 != 9205357640488583168L) {
                                        ob0Var3.W(3458246);
                                        zc zcVar = z6 ? u4.d : u4.c;
                                        tv0 tv0VarD = ko1.d(tv0Var3, wz.b(j7), wz.a(j7), 0.0f, 0.0f, 12);
                                        tg1 tg1VarA = sg1.a(zcVar, v20.o, ob0Var3, 0);
                                        int iHashCode = Long.hashCode(ob0Var3.T);
                                        b61 b61VarL = ob0Var3.l();
                                        tv0 tv0VarP = bk.P(ob0Var3, tv0VarD);
                                        ep.c.getClass();
                                        zp zpVar = dp.b;
                                        ob0Var3.Z();
                                        if (ob0Var3.S) {
                                            ob0Var3.k(zpVar);
                                        } else {
                                            ob0Var3.i0();
                                        }
                                        xc.E(dp.f, ob0Var3, tg1VarA);
                                        xc.E(dp.e, ob0Var3, b61VarL);
                                        xc.E(dp.g, ob0Var3, Integer.valueOf(iHashCode));
                                        xc.C(ob0Var3, dp.h);
                                        xc.E(dp.d, ob0Var3, tv0VarP);
                                        boolean zH = ob0Var3.h(a11Var3);
                                        Object objK2 = ob0Var3.K();
                                        if (zH || objK2 == l91Var) {
                                            objK2 = new ha0() { // from class: x7
                                                @Override // defpackage.ha0
                                                public final Object a() {
                                                    int i8 = i7;
                                                    a11 a11Var4 = a11Var3;
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & a11Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & a11Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            ob0Var3.f0(objK2);
                                        }
                                        xi0.i(qv0.a, (ha0) objK2, z6, ob0Var3, 6);
                                        ob0Var3.p(true);
                                        ob0Var3.p(false);
                                    } else {
                                        ob0Var3.W(4389176);
                                        boolean zH2 = ob0Var3.h(a11Var3);
                                        Object objK3 = ob0Var3.K();
                                        if (zH2 || objK3 == l91Var) {
                                            objK3 = new ha0() { // from class: x7
                                                @Override // defpackage.ha0
                                                public final Object a() {
                                                    int i8 = i6;
                                                    a11 a11Var4 = a11Var3;
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & a11Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & a11Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            ob0Var3.f0(objK3);
                                        }
                                        xi0.i(tv0Var3, (ha0) objK3, z6, ob0Var3, 0);
                                        ob0Var3.p(false);
                                    }
                                } else {
                                    ob0Var3.Q();
                                }
                                return t32.a;
                            }
                        }, ob0Var2), ob0Var2, 56);
                    } else {
                        ob0Var2.Q();
                    }
                    return t32.a;
                }
            }, ob0Var), ob0Var, i5 | 384);
        } else {
            ob0Var.Q();
            j3 = j2;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            final long j6 = j3;
            dc1VarR.d = new wa0() { // from class: v7
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xi0.h(a11Var, z2, ee1Var, z3, j6, f2, tv0Var, (ob0) obj, al.V(i2 | 1));
                    return t32.a;
                }
            };
        }
    }

    public static final void i(tv0 tv0Var, ha0 ha0Var, boolean z2, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (ob0Var.h(ha0Var) ? 32 : 16) | (ob0Var.g(z2) ? 256 : 128);
        int i5 = 0;
        if (ob0Var.N(i4 & 1, (i4 & 147) != 146)) {
            zl1 zl1Var = hl1.a;
            qc1.b(ob0Var, bk.q(ko1.f(tv0Var, 25.0f, 25.0f), new z7(i5, ha0Var, z2)));
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new y7(tv0Var, ha0Var, z2, i2);
        }
    }

    public static final void j(iq iqVar, wa0 wa0Var, ha0 ha0Var, ob0 ob0Var, int i2) {
        int i3;
        Object l6Var;
        fy0 fy0Var;
        fy0 fy0Var2;
        String str = iqVar.b;
        wa0Var.getClass();
        ha0Var.getClass();
        ob0Var.X(-1618137961);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(iqVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.h(wa0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(ha0Var) ? 256 : 128;
        }
        int i4 = i3;
        if (ob0Var.N(i4 & 1, (i4 & 147) != 146)) {
            boolean zF = ob0Var.f(str);
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (zF || objK == l91Var) {
                objK = xc.B(null);
                ob0Var.f0(objK);
            }
            fy0 fy0Var3 = (fy0) objK;
            boolean zF2 = ob0Var.f(str);
            Object objK2 = ob0Var.K();
            if (zF2 || objK2 == l91Var) {
                objK2 = xc.B(Boolean.FALSE);
                ob0Var.f0(objK2);
            }
            fy0 fy0Var4 = (fy0) objK2;
            boolean zH = ob0Var.h(wa0Var) | ((i4 & 14) == 4) | ob0Var.f(fy0Var3) | ob0Var.f(fy0Var4);
            Object objK3 = ob0Var.K();
            if (zH || objK3 == l91Var) {
                l6Var = new l6(wa0Var, iqVar, fy0Var3, fy0Var4, null, 1);
                fy0Var = fy0Var3;
                fy0Var2 = fy0Var4;
                ob0Var.f0(l6Var);
            } else {
                l6Var = objK3;
                fy0Var = fy0Var3;
                fy0Var2 = fy0Var4;
            }
            wi0.i((wa0) l6Var, ob0Var, str);
            t2.a(ha0Var, null, null, lk.d0(805242449, new vd(iqVar, fy0Var, fy0Var2, ha0Var, 1), ob0Var), ob0Var, ((i4 >> 6) & 14) | 3072, 6);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(iqVar, wa0Var, ha0Var, i2, 1);
        }
    }

    public static final void k(iq iqVar, wa0 wa0Var, tv0 tv0Var, ob0 ob0Var, int i2) {
        tv0 tv0Var2;
        Object m6Var;
        fy0 fy0Var;
        iqVar.getClass();
        String str = iqVar.b;
        wa0Var.getClass();
        ob0Var.X(-1188410034);
        int i3 = (ob0Var.f(iqVar) ? 4 : 2) | i2 | (ob0Var.h(wa0Var) ? 32 : 16) | 384;
        int i4 = 0;
        if (ob0Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean zF = ob0Var.f(str);
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            ks ksVar = null;
            if (zF || objK == l91Var) {
                objK = xc.B(null);
                ob0Var.f0(objK);
            }
            fy0 fy0Var2 = (fy0) objK;
            boolean zH = ob0Var.h(wa0Var) | ((i3 & 14) == 4) | ob0Var.f(fy0Var2);
            Object objK2 = ob0Var.K();
            if (zH || objK2 == l91Var) {
                fy0Var = fy0Var2;
                m6Var = new m6(wa0Var, iqVar, fy0Var, ksVar, 4);
                ob0Var.f0(m6Var);
            } else {
                m6Var = objK2;
                fy0Var = fy0Var2;
            }
            wi0.i((wa0) m6Var, ob0Var, str);
            tv0Var2 = qv0.a;
            tv0 tv0VarE = ko1.e(tv0Var2, 46.0f);
            ys1 ys1Var = mu0.b;
            vu1.a(tv0VarE, ((ju0) ob0Var.j(ys1Var)).c.b, ((ju0) ob0Var.j(ys1Var)).a.H, 0L, lk.d0(-415917399, new ud(i4, fy0Var), ob0Var), ob0Var, 12582912, 120);
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new o8(iqVar, wa0Var, tv0Var2, i2);
        }
    }

    public static final Bitmap l(File file, int i2) {
        Object oe1Var;
        BitmapFactory.Options options;
        int i3;
        try {
            options = new BitmapFactory.Options();
            i3 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } catch (Throwable th) {
            oe1Var = new oe1(th);
        }
        if (options.outWidth > 0 && options.outHeight > 0) {
            while (true) {
                if (options.outWidth / i3 <= i2 && options.outHeight / i3 <= i2) {
                    break;
                }
                i3 *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i3;
            oe1Var = BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
            return (Bitmap) (oe1Var instanceof oe1 ? null : oe1Var);
        }
        return null;
    }

    public static final boolean m(nl1 nl1Var) {
        zl1 zl1Var = vl1.s;
        zx0 zx0Var = nl1Var.e;
        Object objG = zx0Var.g(zl1Var);
        if (objG == null) {
            objG = null;
        }
        if (o(objG, v20.w)) {
            return false;
        }
        return zx0Var.b(ml1.g) || zx0Var.b(ml1.h);
    }

    public static boolean n(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean o(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final tv0 p(tv0 tv0Var, long j2, ym1 ym1Var) {
        return tv0Var.c(new ve(j2, ym1Var));
    }

    public static final float q(c41 c41Var, al0 al0Var) {
        return al0Var == al0.e ? c41Var.b(al0Var) : c41Var.a(al0Var);
    }

    public static final float r(c41 c41Var, al0 al0Var) {
        return al0Var == al0.e ? c41Var.a(al0Var) : c41Var.b(al0Var);
    }

    public static void s(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbN = s91.n("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
            sbN.append(i4);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        if (i2 <= i3) {
            return;
        }
        yc.p(s91.j("fromIndex: ", i2, " > toIndex: ", i3));
    }

    public static int t(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int u(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final cb v(cb cbVar) {
        cb cbVarC = cbVar.c();
        int iB = cbVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            cbVarC.e(i2, cbVar.a(i2));
        }
        return cbVarC;
    }

    public static final long w(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        long j2 = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j2 += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final f6 x(li liVar, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        f6 f6VarB = al.a;
        n3 n3VarD = al.b;
        ej ejVar = al.c;
        if (f6VarB == null || n3VarD == null) {
            f6VarB = el.b(iCeil, iCeil, 1);
            al.a = f6VarB;
            n3VarD = c2.d(f6VarB);
            al.b = n3VarD;
        } else {
            Bitmap bitmap = f6VarB.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
            }
        }
        f6 f6Var = f6VarB;
        n3 n3Var = n3VarD;
        if (ejVar == null) {
            ejVar = new ej();
            al.c = ejVar;
        }
        ej ejVar2 = ejVar;
        dj djVar = ejVar2.e;
        al0 layoutDirection = liVar.e.getLayoutDirection();
        Bitmap bitmap2 = f6Var.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        hx hxVar = djVar.a;
        al0 al0Var = djVar.b;
        cj cjVar = djVar.c;
        long j2 = djVar.d;
        djVar.a = liVar;
        djVar.b = layoutDirection;
        djVar.c = n3Var;
        djVar.d = jFloatToRawIntBits;
        n3Var.l();
        p10.e0(ejVar2, vl.b, 0L, ejVar2.d(), 58);
        p10.e0(ejVar2, lk.g(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), 120);
        p10.c0(ejVar2, lk.g(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 120);
        n3Var.i();
        djVar.a = hxVar;
        djVar.b = al0Var;
        djVar.c = cjVar;
        djVar.d = j2;
        return f6Var;
    }

    public static boolean y(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = y(file2) && z2;
        }
        return z2;
    }

    public static final Object z(pu0 pu0Var) {
        Object objI = pu0Var.i();
        el0 el0Var = objI instanceof el0 ? (el0) objI : null;
        if (el0Var != null) {
            return el0Var.s;
        }
        return null;
    }
}
