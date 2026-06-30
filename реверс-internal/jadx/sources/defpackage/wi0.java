package defpackage;

import android.R;
import android.graphics.Paint;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class wi0 {
    public static final cm A;
    public static final cm B;
    public static final cm C;
    public static final en1 D;
    public static final cm E;
    public static final cm F;
    public static final Object G;
    public static final StackTraceElement[] H;
    public static final d7 I;
    public static ye0 J = null;
    public static ye0 K = null;
    public static final float L = 64.0f;
    public static final float M = 64.0f;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final s30 e = new s30("RESUME_TOKEN", 1);
    public static final jo f = new jo(-1073490643, false, new no(3));
    public static final jo g = new jo(1648264273, false, new pc(8, 0));
    public static final int[] h = new int[0];
    public static final long[] i = new long[0];
    public static final Object[] j = new Object[0];
    public static final zy k = new zy();
    public static final cm l;
    public static final float m;
    public static final float n;
    public static final g32 o;
    public static final cm p;
    public static final float q;
    public static final cm r;
    public static final cm s;
    public static final en1 t;
    public static final cm u;
    public static final float v;
    public static final d7 w;
    public static final d7 x;
    public static final d7 y;
    public static final cm z;

    static {
        cm cmVar = cm.i;
        l = cmVar;
        m = 0.38f;
        n = 0.12f;
        o = g32.g;
        p = cm.l;
        q = 1.0f;
        r = cm.o;
        s = cm.h;
        t = en1.g;
        u = cmVar;
        v = 18.0f;
        w = new d7(1000);
        new d7(1007);
        x = new d7(1008);
        y = new d7(1002);
        z = cm.r;
        cm cmVar2 = cm.k;
        A = cmVar2;
        B = cmVar2;
        C = cmVar2;
        D = en1.h;
        E = cmVar2;
        F = cmVar2;
        G = new Object();
        H = new StackTraceElement[0];
        I = new d7(1022);
    }

    public static final boolean A(int i2, int i3, long j2) {
        int iJ = kr.j(j2);
        if (i2 > kr.h(j2) || iJ > i2) {
            return false;
        }
        return i3 <= kr.g(j2) && kr.i(j2) <= i3;
    }

    public static final tv0 B(tv0 tv0Var, ln0 ln0Var, dn0 dn0Var, k31 k31Var, boolean z2) {
        return tv0Var.c(new en0(ln0Var, dn0Var, k31Var, z2));
    }

    public static final boolean C(mq1 mq1Var, sa0 sa0Var) {
        int i2;
        f0 f0Var;
        Object objI;
        sp1 sp1VarJ;
        boolean zQ;
        do {
            synchronized (G) {
                ss1 ss1Var = mq1Var.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i2 = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            p61 p61VarF = f0Var.f();
            objI = sa0Var.i(p61VarF);
            f0 f0VarC = p61VarF.c();
            if (xi0.o(f0VarC, f0Var)) {
                break;
            }
            ss1 ss1Var3 = mq1Var.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = q((ss1) aq1.w(ss1Var3, mq1Var, sp1VarJ), i2, f0VarC, true);
            }
            aq1.n(sp1VarJ, mq1Var);
        } while (!zQ);
        return ((Boolean) objI).booleanValue();
    }

    public static final tv0 D(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new mr(sa0Var));
    }

    public static final tv0 E(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new y70(sa0Var));
    }

    public static xa a(int i2, float f2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new xa(c2.P, Float.valueOf(0.0f), new ya(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final tv0 tv0Var, final d02 d02Var, int i2, boolean z2, final int i3, int i4, ob0 ob0Var, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        final int i13;
        final boolean z4;
        final int i14;
        dc1 dc1VarR;
        c90 c90Var;
        boolean z5;
        ob0Var.X(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (ob0Var.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= ob0Var.f(tv0Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= ob0Var.f(d02Var) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i7 |= ob0Var.h(null) ? 2048 : 1024;
        }
        int i15 = i6 & 16;
        if (i15 != 0) {
            i7 |= 24576;
        } else {
            if ((i5 & 24576) == 0) {
                i8 = i2;
                i7 |= ob0Var.d(i8) ? 16384 : 8192;
            }
            i9 = i6 & 32;
            if (i9 == 0) {
                i7 |= 196608;
            } else {
                if ((196608 & i5) == 0) {
                    z3 = z2;
                    i7 |= ob0Var.g(z3) ? 131072 : 65536;
                }
                if ((1572864 & i5) == 0) {
                    i7 |= ob0Var.d(i3) ? 1048576 : 524288;
                }
                i10 = i6 & 128;
                if (i10 == 0) {
                    if ((12582912 & i5) == 0) {
                        i11 = i4;
                        i7 |= ob0Var.d(i11) ? 8388608 : 4194304;
                    }
                    i12 = i7 | 100663296;
                    if ((i6 & 512) == 0) {
                        i12 = i7 | 905969664;
                    } else if ((805306368 & i5) == 0) {
                        i12 |= (1073741824 & i5) == 0 ? ob0Var.f(null) : ob0Var.h(null) ? 536870912 : 268435456;
                    }
                    if (ob0Var.N(i12 & 1, (i12 & 306783379) == 306783378)) {
                        ob0Var.Q();
                        i13 = i8;
                        z4 = z3;
                        i14 = i11;
                    } else {
                        int i16 = i15 == 0 ? i8 : 1;
                        boolean z6 = i9 != 0 ? true : z3;
                        int i17 = i10 != 0 ? 1 : i11;
                        lk.q0(i17, i3);
                        if (ob0Var.j(ll1.a) != null) {
                            yc.d();
                            return;
                        }
                        ob0Var.W(357055103);
                        ob0Var.p(false);
                        c90 c90Var2 = (c90) ob0Var.j(aq.k);
                        Executor executor = (Executor) ob0Var.j(pf.a);
                        if (executor != null) {
                            int length = str.length();
                            if (Build.VERSION.SDK_INT < 28 || length < 8 || length >= 1000) {
                                c90Var = c90Var2;
                                z5 = false;
                                ob0Var.W(-1248455541);
                                ob0Var.p(false);
                                ob0Var.W(358076243);
                                ob0Var.p(z5);
                                tv0 tv0VarC = tv0Var.c(new zz1(str, d02Var, c90Var, i16, z6, i3, i17));
                                n5 n5Var = n5.e;
                                int iHashCode = Long.hashCode(ob0Var.T);
                                tv0 tv0VarP = bk.P(ob0Var, tv0VarC);
                                b61 b61VarL = ob0Var.l();
                                ep.c.getClass();
                                zp zpVar = dp.b;
                                ob0Var.Z();
                                if (ob0Var.S) {
                                    ob0Var.i0();
                                } else {
                                    ob0Var.k(zpVar);
                                }
                                xc.E(dp.f, ob0Var, n5Var);
                                xc.E(dp.e, ob0Var, b61VarL);
                                xc.C(ob0Var, dp.h);
                                xc.E(dp.d, ob0Var, tv0VarP);
                                xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
                                ob0Var.p(true);
                                i13 = i16;
                                z4 = z6;
                                i14 = i17;
                            } else {
                                if (pf.b == null) {
                                    pf.b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                                }
                                Boolean bool = pf.b;
                                bool.getClass();
                                if (bool.booleanValue()) {
                                    ob0Var.W(-1250263182);
                                    try {
                                        c90Var = c90Var2;
                                        boolean z7 = z6;
                                        try {
                                            z6 = z7;
                                            try {
                                                executor.execute(new of(d02Var, (al0) ob0Var.j(aq.n), str, (hx) ob0Var.j(aq.h), c90Var, z7));
                                            } catch (RejectedExecutionException unused) {
                                            }
                                        } catch (RejectedExecutionException unused2) {
                                            z6 = z7;
                                        }
                                    } catch (RejectedExecutionException unused3) {
                                        c90Var = c90Var2;
                                    }
                                    z5 = false;
                                    ob0Var.p(false);
                                }
                                ob0Var.W(358076243);
                                ob0Var.p(z5);
                                tv0 tv0VarC2 = tv0Var.c(new zz1(str, d02Var, c90Var, i16, z6, i3, i17));
                                n5 n5Var2 = n5.e;
                                int iHashCode2 = Long.hashCode(ob0Var.T);
                                tv0 tv0VarP2 = bk.P(ob0Var, tv0VarC2);
                                b61 b61VarL2 = ob0Var.l();
                                ep.c.getClass();
                                zp zpVar2 = dp.b;
                                ob0Var.Z();
                                if (ob0Var.S) {
                                }
                                xc.E(dp.f, ob0Var, n5Var2);
                                xc.E(dp.e, ob0Var, b61VarL2);
                                xc.C(ob0Var, dp.h);
                                xc.E(dp.d, ob0Var, tv0VarP2);
                                xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode2));
                                ob0Var.p(true);
                                i13 = i16;
                                z4 = z6;
                                i14 = i17;
                            }
                        }
                    }
                    dc1VarR = ob0Var.r();
                    if (dc1VarR == null) {
                        dc1VarR.d = new wa0() { // from class: nf
                            @Override // defpackage.wa0
                            public final Object h(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                wi0.b(str, tv0Var, d02Var, i13, z4, i3, i14, (ob0) obj, al.V(i5 | 1), i6);
                                return t32.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i7 |= 12582912;
                i11 = i4;
                i12 = i7 | 100663296;
                if ((i6 & 512) == 0) {
                }
                if (ob0Var.N(i12 & 1, (i12 & 306783379) == 306783378)) {
                }
                dc1VarR = ob0Var.r();
                if (dc1VarR == null) {
                }
            }
            z3 = z2;
            if ((1572864 & i5) == 0) {
            }
            i10 = i6 & 128;
            if (i10 == 0) {
            }
            i11 = i4;
            i12 = i7 | 100663296;
            if ((i6 & 512) == 0) {
            }
            if (ob0Var.N(i12 & 1, (i12 & 306783379) == 306783378)) {
            }
            dc1VarR = ob0Var.r();
            if (dc1VarR == null) {
            }
        }
        i8 = i2;
        i9 = i6 & 32;
        if (i9 == 0) {
        }
        z3 = z2;
        if ((1572864 & i5) == 0) {
        }
        i10 = i6 & 128;
        if (i10 == 0) {
        }
        i11 = i4;
        i12 = i7 | 100663296;
        if ((i6 & 512) == 0) {
        }
        if (ob0Var.N(i12 & 1, (i12 & 306783379) == 306783378)) {
        }
        dc1VarR = ob0Var.r();
        if (dc1VarR == null) {
        }
    }

    public static final void c(Object obj, sa0 sa0Var, ob0 ob0Var) {
        boolean zF = ob0Var.f(obj);
        Object objK = ob0Var.K();
        if (zF || objK == kp.a) {
            objK = new xy(sa0Var);
            ob0Var.f0(objK);
        }
    }

    public static final void d(Object obj, Object obj2, sa0 sa0Var, ob0 ob0Var) {
        boolean zF = ob0Var.f(obj) | ob0Var.f(obj2);
        Object objK = ob0Var.K();
        if (zF || objK == kp.a) {
            objK = new xy(sa0Var);
            ob0Var.f0(objK);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final ha0 ha0Var, final re0 re0Var, tv0 tv0Var, boolean z2, me0 me0Var, final jo joVar, ob0 ob0Var, final int i2, final int i3) {
        ha0 ha0Var2;
        int i4;
        tv0 tv0Var2;
        int i5;
        jo joVar2;
        final me0 me0Var2;
        final tv0 tv0Var3;
        final boolean z3;
        dc1 dc1VarR;
        int i6;
        int i7;
        tv0 tv0Var4;
        me0 me0Var3;
        boolean z4;
        ob0Var.X(-137266638);
        if ((i2 & 6) == 0) {
            ha0Var2 = ha0Var;
            i4 = (ob0Var.h(ha0Var2) ? 4 : 2) | i2;
        } else {
            ha0Var2 = ha0Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ob0Var.f(re0Var) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                tv0Var2 = tv0Var;
                i4 |= ob0Var.f(tv0Var2) ? 256 : 128;
            }
            int i9 = i4 | 3072;
            if ((i2 & 24576) == 0) {
                i9 = i4 | 11264;
            }
            i5 = i9 | 196608;
            if ((1572864 & i2) != 0) {
                joVar2 = joVar;
                i5 |= ob0Var.h(joVar2) ? 1048576 : 524288;
            } else {
                joVar2 = joVar;
            }
            if (ob0Var.N(i5 & 1, (599187 & i5) == 599186)) {
                ob0Var.Q();
                me0Var2 = me0Var;
                tv0Var3 = tv0Var2;
                z3 = z2;
            } else {
                ob0Var.S();
                if ((i2 & 1) == 0 || ob0Var.x()) {
                    tv0 tv0Var5 = i8 != 0 ? qv0.a : tv0Var2;
                    bm bmVar = ((ju0) ob0Var.j(mu0.b)).a;
                    me0 me0Var4 = bmVar.Z;
                    if (me0Var4 == null) {
                        i6 = 196608;
                        me0 me0Var5 = new me0(dm.b(bmVar, pv.m), dm.b(bmVar, pv.r), vl.b(pv.o, dm.b(bmVar, pv.n)), vl.b(pv.q, dm.b(bmVar, pv.p)));
                        bmVar.Z = me0Var5;
                        me0Var4 = me0Var5;
                    } else {
                        i6 = 196608;
                    }
                    tv0 tv0Var6 = tv0Var5;
                    i7 = i5 & (-57345);
                    tv0Var4 = tv0Var6;
                    me0Var3 = me0Var4;
                    z4 = true;
                } else {
                    ob0Var.Q();
                    i7 = i5 & (-57345);
                    z4 = z2;
                    i6 = 196608;
                    tv0Var4 = tv0Var2;
                    me0Var3 = me0Var;
                }
                ob0Var.q();
                int i10 = i7 >> 3;
                int i11 = (i7 & 14) | i6 | (i10 & 112) | (i10 & 896) | ((i7 << 6) & 7168);
                int i12 = i7 << 3;
                n(ha0Var2, tv0Var4, z4, re0Var, me0Var3, joVar2, ob0Var, (i12 & 29360128) | i11 | (3670016 & i12));
                tv0Var3 = tv0Var4;
                me0Var2 = me0Var3;
                z3 = z4;
            }
            dc1VarR = ob0Var.r();
            if (dc1VarR == null) {
                dc1VarR.d = new wa0() { // from class: ne0
                    @Override // defpackage.wa0
                    public final Object h(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wi0.e(ha0Var, re0Var, tv0Var3, z3, me0Var2, joVar, (ob0) obj, al.V(i2 | 1), i3);
                        return t32.a;
                    }
                };
                return;
            }
            return;
        }
        i4 |= 384;
        tv0Var2 = tv0Var;
        int i92 = i4 | 3072;
        if ((i2 & 24576) == 0) {
        }
        i5 = i92 | 196608;
        if ((1572864 & i2) != 0) {
        }
        if (ob0Var.N(i5 & 1, (599187 & i5) == 599186)) {
        }
        dc1VarR = ob0Var.r();
        if (dc1VarR == null) {
        }
    }

    public static final void f(final int i2, final jo joVar, final ha0 ha0Var, ob0 ob0Var, me0 me0Var, tv0 tv0Var, ym1 ym1Var, boolean z2) {
        final me0 me0Var2;
        final tv0 tv0Var2;
        final ym1 ym1Var2;
        final boolean z3;
        int i3;
        me0 me0Var3;
        int i4;
        tv0 tv0Var3;
        ym1 ym1Var3;
        me0 me0Var4;
        boolean z4;
        ob0Var.X(1413012038);
        int i5 = i2 | (ob0Var.h(ha0Var) ? 4 : 2) | 91568;
        if (ob0Var.N(i5 & 1, (599187 & i5) != 599186)) {
            ob0Var.S();
            if ((i2 & 1) == 0 || ob0Var.x()) {
                long j2 = ((vl) ob0Var.j(rr.a)).a;
                bm bmVar = ((ju0) ob0Var.j(mu0.b)).a;
                me0 me0Var5 = bmVar.Y;
                if (me0Var5 == null) {
                    long j3 = vl.f;
                    me0Var5 = new me0(j3, j2, j3, vl.b(0.38f, j2));
                    bmVar.Y = me0Var5;
                }
                long j4 = me0Var5.b;
                if (vl.c(j4, j2)) {
                    i3 = -465921;
                    me0Var3 = me0Var5;
                } else {
                    long jB = vl.b(0.38f, j2);
                    long j5 = me0Var5.a;
                    i3 = -465921;
                    long j6 = me0Var5.c;
                    if (j2 == 16) {
                        j2 = j4;
                    }
                    if (jB == 16) {
                        jB = me0Var5.d;
                    }
                    me0Var3 = new me0(j5, j2, j6, jB);
                }
                ym1 ym1VarB = qn1.b(pv.x, ob0Var);
                i4 = i5 & i3;
                tv0Var3 = qv0.a;
                ym1Var3 = ym1VarB;
                me0Var4 = me0Var3;
                z4 = true;
            } else {
                ob0Var.Q();
                i4 = i5 & (-465921);
                me0Var4 = me0Var;
                tv0Var3 = tv0Var;
                ym1Var3 = ym1Var;
                z4 = z2;
            }
            ob0Var.q();
            g(((i4 << 3) & 112) | 1769862, joVar, ha0Var, ob0Var, me0Var4, tv0Var3, ym1Var3, z4);
            z3 = z4;
            ym1Var2 = ym1Var3;
            tv0Var2 = tv0Var3;
            me0Var2 = me0Var4;
        } else {
            ob0Var.Q();
            me0Var2 = me0Var;
            tv0Var2 = tv0Var;
            ym1Var2 = ym1Var;
            z3 = z2;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(i2, joVar, ha0Var, me0Var2, tv0Var2, ym1Var2, z3) { // from class: qe0
                public final /* synthetic */ ha0 e;
                public final /* synthetic */ tv0 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ me0 h;
                public final /* synthetic */ ym1 i;
                public final /* synthetic */ jo j;

                {
                    this.e = ha0Var;
                    this.f = tv0Var2;
                    this.g = z3;
                    this.h = me0Var2;
                    this.i = ym1Var2;
                    this.j = joVar;
                }

                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wi0.f(al.V(1572865), this.j, this.e, (ob0) obj, this.h, this.f, this.i, this.g);
                    return t32.a;
                }
            };
        }
    }

    public static final void g(int i2, jo joVar, ha0 ha0Var, ob0 ob0Var, me0 me0Var, tv0 tv0Var, ym1 ym1Var, boolean z2) {
        int i3;
        ob0Var.X(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.h(ha0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var.f(ym1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ob0Var.f(me0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ob0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ob0Var.h(joVar) ? 1048576 : 524288;
        }
        if (ob0Var.N(i3 & 1, (599187 & i3) != 599186)) {
            ob0Var.W(976976045);
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new jx0();
                ob0Var.f0(objK);
            }
            jx0 jx0Var = (jx0) objK;
            ob0Var.p(false);
            ud0 ud0Var = bi0.a;
            tv0 tv0VarC = tv0Var.c(nv0.a);
            long jM = v20.m();
            j60 j60Var = ko1.a;
            tv0 tv0VarL = hk.l(s22.l(xi0.p(xk.h(ko1.f(tv0VarC, wz.b(jM), wz.a(jM)), ym1Var), z2 ? me0Var.a : me0Var.c, ym1Var), jx0Var, jf1.a(0.0f, ym1Var, 247), z2, new yf1(0), ha0Var, 8));
            uu0 uu0VarD = sg.d(v20.j, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0VarL);
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
            lk.i(rr.a.a(new vl(z2 ? me0Var.b : me0Var.d)), joVar, ob0Var, ((i3 >> 15) & 112) | 8);
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hs(i2, joVar, ha0Var, me0Var, tv0Var, ym1Var, z2);
        }
    }

    public static final void h(String str, sa0 sa0Var, tv0 tv0Var, String str2, ob0 ob0Var, int i2) {
        int i3;
        tv0 tv0Var2;
        String str3;
        sa0Var.getClass();
        ob0Var.X(-1338130792);
        if ((i2 & 6) == 0) {
            i3 = i2 | (ob0Var.f(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.h(sa0Var) ? 32 : 16;
        }
        int i4 = i3 | 224640;
        byte b2 = 0;
        if (ob0Var.N(i4 & 1, (74899 & i4) != 74898)) {
            j60 j60Var = ko1.a;
            ob0Var.W(1632567189);
            ob0Var.p(false);
            ys1 ys1Var = mu0.b;
            kg1 kg1Var = ((ju0) ob0Var.j(ys1Var)).c.d;
            long j2 = ((ju0) ob0Var.j(ys1Var)).a.H;
            long j3 = ((ju0) ob0Var.j(ys1Var)).a.G;
            long j4 = ((ju0) ob0Var.j(ys1Var)).a.G;
            long j5 = ((ju0) ob0Var.j(ys1Var)).a.y;
            long j6 = vl.f;
            af1.e(str, sa0Var, j60Var, false, null, lk.d0(-1938706285, new pc(21, b2), ob0Var), u4.h, null, null, null, new nk0(118), null, true, 0, 0, kg1Var, l91.l(j2, j3, j4, j5, j6, j6, j6, j6, ob0Var, 2147452687), ob0Var, (i4 & 14) | 113246208 | (i4 & 112), (i4 & 7168) | 12779520, 1920632);
            tv0Var2 = qv0.a;
            str3 = "Key";
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            str3 = str2;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fo(str, sa0Var, tv0Var2, str3, i2, 1);
        }
    }

    public static final void i(wa0 wa0Var, ob0 ob0Var, Object obj) {
        lt ltVar = ob0Var.R;
        boolean zF = ob0Var.f(obj);
        Object objK = ob0Var.K();
        if (zF || objK == kp.a) {
            objK = new uk0(ltVar, wa0Var);
            ob0Var.f0(objK);
        }
    }

    public static final void j(Object obj, Object obj2, wa0 wa0Var, ob0 ob0Var) {
        lt ltVar = ob0Var.R;
        boolean zF = ob0Var.f(obj) | ob0Var.f(obj2);
        Object objK = ob0Var.K();
        if (zF || objK == kp.a) {
            objK = new uk0(ltVar, wa0Var);
            ob0Var.f0(objK);
        }
    }

    public static final void k(l32 l32Var, sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3, sa0 sa0Var4, ha0 ha0Var, ha0 ha0Var2, tv0 tv0Var, ob0 ob0Var, int i2) {
        tv0 tv0Var2;
        boolean z2;
        l32 l32Var2 = l32Var;
        ob0 ob0Var2 = ob0Var;
        l32Var2.getClass();
        dr0 dr0Var = l32Var2.a;
        sa0Var.getClass();
        sa0Var2.getClass();
        sa0Var3.getClass();
        sa0Var4.getClass();
        ha0Var.getClass();
        ha0Var2.getClass();
        ob0Var2.X(401244565);
        int i3 = i2 | (ob0Var2.f(l32Var2) ? 4 : 2) | (ob0Var2.h(sa0Var) ? 32 : 16) | (ob0Var2.h(sa0Var2) ? 256 : 128) | (ob0Var2.h(sa0Var3) ? 2048 : 1024) | (ob0Var2.h(sa0Var4) ? 16384 : 8192) | (ob0Var2.h(ha0Var) ? 131072 : 65536) | (ob0Var2.h(ha0Var2) ? 1048576 : 524288) | 12582912;
        if (ob0Var2.N(i3 & 1, (4793491 & i3) != 4793490)) {
            j60 j60Var = ko1.c;
            uu0 uu0VarD = sg.d(v20.f, false);
            int iHashCode = Long.hashCode(ob0Var2.T);
            b61 b61VarL = ob0Var2.l();
            tv0 tv0VarP = bk.P(ob0Var2, j60Var);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var2.Z();
            if (ob0Var2.S) {
                ob0Var2.k(zpVar);
            } else {
                ob0Var2.i0();
            }
            r9 r9Var = dp.f;
            xc.E(r9Var, ob0Var2, uu0VarD);
            r9 r9Var2 = dp.e;
            xc.E(r9Var2, ob0Var2, b61VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            r9 r9Var3 = dp.g;
            xc.E(r9Var3, ob0Var2, numValueOf);
            a4 a4Var = dp.h;
            xc.C(ob0Var2, a4Var);
            r9 r9Var4 = dp.d;
            xc.E(r9Var4, ob0Var2, tv0VarP);
            tv0 tv0VarD = xi0.D(pv.H(j60Var, pv.B(ob0Var2)), 24.0f, 24.0f);
            l91 l91Var = pv.e;
            sf sfVar = v20.r;
            bn bnVarA = zm.a(l91Var, sfVar, ob0Var2, 54);
            int iHashCode2 = Long.hashCode(ob0Var2.T);
            b61 b61VarL2 = ob0Var2.l();
            tv0 tv0VarP2 = bk.P(ob0Var2, tv0VarD);
            ob0Var2.Z();
            if (ob0Var2.S) {
                ob0Var2.k(zpVar);
            } else {
                ob0Var2.i0();
            }
            xc.E(r9Var, ob0Var2, bnVarA);
            xc.E(r9Var2, ob0Var2, b61VarL2);
            s91.q(iHashCode2, ob0Var2, r9Var3, ob0Var2, a4Var);
            xc.E(r9Var4, ob0Var2, tv0VarP2);
            qv0 qv0Var = qv0.a;
            tv0 tv0VarI = ko1.i(qv0Var, 480.0f);
            j60 j60Var2 = ko1.a;
            tv0 tv0VarC = tv0VarI.c(j60Var2);
            bn bnVarA2 = zm.a(new cd(16.0f, new yc(0)), sfVar, ob0Var2, 54);
            int iHashCode3 = Long.hashCode(ob0Var2.T);
            b61 b61VarL3 = ob0Var2.l();
            tv0 tv0VarP3 = bk.P(ob0Var2, tv0VarC);
            ob0Var2.Z();
            if (ob0Var2.S) {
                ob0Var2.k(zpVar);
            } else {
                ob0Var2.i0();
            }
            xc.E(r9Var, ob0Var2, bnVarA2);
            xc.E(r9Var2, ob0Var2, b61VarL3);
            s91.q(iHashCode3, ob0Var2, r9Var3, ob0Var2, a4Var);
            xc.E(r9Var4, ob0Var2, tv0VarP3);
            ys1 ys1Var = mu0.b;
            mz1.b("Zenin", null, 0L, 0L, aa0.i, 0L, new dw1(3), 0L, 0, false, 0, 0, ((ju0) ob0Var2.j(ys1Var)).b.c, ob0Var, 1572870, 0, 129982);
            mz1.b(dr0Var.h, null, ((ju0) ob0Var.j(ys1Var)).a.a, 0L, null, uc1.p(3), new dw1(3), 0L, 0, false, 0, 0, ((ju0) ob0Var.j(ys1Var)).b.h, ob0Var, 100663296, 0, 129786);
            ob0 ob0Var3 = ob0Var;
            qc1.b(ob0Var3, ko1.b(qv0Var, 8.0f));
            l32Var2 = l32Var;
            h(l32Var2.b, sa0Var, null, null, ob0Var3, i3 & 112);
            if (dr0Var.m) {
                ob0Var3.W(-1258344222);
                bn bnVarA3 = zm.a(new cd(2.0f, new yc(0)), v20.q, ob0Var3, 6);
                int iHashCode4 = Long.hashCode(ob0Var3.T);
                b61 b61VarL4 = ob0Var3.l();
                tv0 tv0VarP4 = bk.P(ob0Var3, qv0Var);
                ob0Var3.Z();
                if (ob0Var3.S) {
                    ob0Var3.k(zpVar);
                } else {
                    ob0Var3.i0();
                }
                xc.E(r9Var, ob0Var3, bnVarA3);
                xc.E(r9Var2, ob0Var3, b61VarL4);
                s91.q(iHashCode4, ob0Var3, r9Var3, ob0Var3, a4Var);
                xc.E(r9Var4, ob0Var3, tv0VarP4);
                el.e("Overlay", "Hides the app on recordings and screenshots", l32Var2.c, sa0Var2, 0, null, false, ob0Var, ((i3 << 3) & 7168) | 221238);
                el.e("Safe mode", "Runs with reduced, ban-safe features", l32Var2.d, sa0Var3, 1, null, false, ob0Var, (i3 & 7168) | 221238);
                ob0Var3 = ob0Var;
                z2 = true;
                ob0Var3.p(true);
                ob0Var3.p(false);
            } else {
                z2 = true;
                ob0Var3.W(-1257489893);
                ob0Var3.p(false);
            }
            u4.b(l32Var2.e, sa0Var4, null, new fl(1.0f, dr0Var.p), ob0Var3, ((i3 >> 6) & 896) | 6);
            qc1.b(ob0Var3, ko1.b(qv0Var, 4.0f));
            boolean z3 = !l32Var2.f;
            float f2 = yh.a;
            c2.c(ha0Var, yh.c(ob0Var3), ko1.b(j60Var2, 64.0f), z3, null, null, null, lk.d0(-1441833993, new wi(5, l32Var2), ob0Var3), ob0Var, ((i3 >> 15) & 14) | 805306752, 496);
            ob0Var.p(z2);
            ob0Var.p(z2);
            e(ha0Var2, v20.l(ob0Var), xi0.C(nu0.j(v20.h), 12.0f), false, null, g, ob0Var, ((i3 >> 18) & 14) | 1572864, 56);
            ob0Var2 = ob0Var;
            ob0Var2.p(z2);
            tv0Var2 = qv0Var;
        } else {
            ob0Var2.Q();
            tv0Var2 = tv0Var;
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new lt0(l32Var2, sa0Var, sa0Var2, sa0Var3, sa0Var4, ha0Var, ha0Var2, tv0Var2, i2);
        }
    }

    public static final p6 l() {
        return new p6(new Paint(7));
    }

    public static final void m(ha0 ha0Var, ob0 ob0Var) {
        f31 f31Var = ob0Var.M.b.b;
        f31Var.b0(v21.c);
        al.O(f31Var, 0, ha0Var);
    }

    public static final void n(ha0 ha0Var, tv0 tv0Var, boolean z2, re0 re0Var, me0 me0Var, jo joVar, ob0 ob0Var, int i2) {
        ha0 ha0Var2;
        int i3;
        boolean z3;
        ob0Var.X(-1422942537);
        if ((i2 & 6) == 0) {
            ha0Var2 = ha0Var;
            i3 = (ob0Var.h(ha0Var2) ? 4 : 2) | i2;
        } else {
            ha0Var2 = ha0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.f(tv0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z3 = z2;
            i3 |= ob0Var.g(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var.f(re0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ob0Var.f(me0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ob0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ob0Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= ob0Var.h(joVar) ? 8388608 : 4194304;
        }
        if (ob0Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            ob0Var.W(446444132);
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new jx0();
                ob0Var.f0(objK);
            }
            jx0 jx0Var = (jx0) objK;
            ob0Var.p(false);
            ob0Var.W(-514014991);
            ym1 ym1VarR = re0Var.a;
            ym1 ym1Var = re0Var.b;
            if (ym1VarR != ym1Var) {
                p60 p60VarW = bl.W(jw0.f, ob0Var);
                boolean zBooleanValue = ((Boolean) lk.D(jx0Var, ob0Var, 0).getValue()).booleanValue();
                ob0Var.W(-508408412);
                ym1 ym1Var2 = zBooleanValue ? ym1Var : ym1VarR;
                if ((ym1VarR instanceof kg1) && (ym1Var instanceof kg1)) {
                    ob0Var.W(-1940046184);
                    ob0Var.U(1045797043, re0Var);
                    ym1Var2.getClass();
                    ym1VarR = u4.r((kg1) ym1Var2, p60VarW, ob0Var, 0);
                    ob0Var.p(false);
                    ob0Var.p(false);
                    ob0Var.p(false);
                } else {
                    ob0Var.W(-1939948162);
                    ob0Var.p(false);
                    ob0Var.p(false);
                    ym1VarR = ym1Var2;
                }
            }
            ob0Var.p(false);
            o(ha0Var2, tv0Var, z3, ym1VarR, me0Var, jx0Var, joVar, ob0Var, i3 & 29877246);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hs(ha0Var, tv0Var, z2, re0Var, me0Var, joVar, i2);
        }
    }

    public static final void o(ha0 ha0Var, tv0 tv0Var, boolean z2, ym1 ym1Var, me0 me0Var, jx0 jx0Var, jo joVar, ob0 ob0Var, int i2) {
        ha0 ha0Var2;
        int i3;
        ym1 ym1Var2;
        ob0Var.X(-171935091);
        if ((i2 & 6) == 0) {
            ha0Var2 = ha0Var;
            i3 = (ob0Var.h(ha0Var2) ? 4 : 2) | i2;
        } else {
            ha0Var2 = ha0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.f(tv0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            ym1Var2 = ym1Var;
            i3 |= ob0Var.f(ym1Var2) ? 2048 : 1024;
        } else {
            ym1Var2 = ym1Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ob0Var.f(me0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ob0Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ob0Var.f(jx0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= ob0Var.h(joVar) ? 8388608 : 4194304;
        }
        if (ob0Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new mt(8);
                ob0Var.f0(objK);
            }
            int i4 = i3 & 8078;
            int i5 = i3 << 9;
            vu1.b(ha0Var2, ol1.a(tv0Var, false, (sa0) objK), z2, ym1Var2, z2 ? me0Var.a : me0Var.c, z2 ? me0Var.b : me0Var.d, 0.0f, jx0Var, lk.d0(669231714, new oe0(joVar), ob0Var), ob0Var, i4 | (234881024 & i5) | (i5 & 1879048192), 192);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new pe0(ha0Var, tv0Var, z2, ym1Var, me0Var, jx0Var, joVar, i2);
        }
    }

    public static final void p(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            yc.o(s91.k("index (", i2, ") is out of bound of [0, ", i3, ")"));
        }
    }

    public static final boolean q(ss1 ss1Var, int i2, f0 f0Var, boolean z2) {
        boolean z3;
        synchronized (G) {
            try {
                int i3 = ss1Var.d;
                if (i3 == i2) {
                    ss1Var.c = f0Var;
                    z3 = true;
                    if (z2) {
                        ss1Var.e++;
                    }
                    ss1Var.d = i3 + 1;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public static final int r(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int s(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final Object t(xw xwVar, ha0 ha0Var, ls lsVar) {
        Object obj;
        c01 c01VarO;
        Object objB0;
        xz0 xz0Var;
        if (((sv0) xwVar).e.r) {
            sv0 sv0Var = (sv0) xwVar;
            if (!sv0Var.e.r) {
                ng0.b("visitAncestors called on an unattached node");
            }
            sv0 sv0Var2 = sv0Var.e.i;
            ql0 ql0VarP = bl.P(xwVar);
            loop0: while (true) {
                obj = null;
                if (ql0VarP == null) {
                    break;
                }
                if ((ql0VarP.I.f.h & 524288) != 0) {
                    while (sv0Var2 != null) {
                        if ((sv0Var2.g & 524288) != 0) {
                            sv0 sv0VarK = sv0Var2;
                            iy0 iy0Var = null;
                            while (sv0VarK != null) {
                                if (sv0VarK instanceof vg) {
                                    obj = sv0VarK;
                                    break loop0;
                                }
                                if ((sv0VarK.g & 524288) != 0 && (sv0VarK instanceof yw)) {
                                    int i2 = 0;
                                    for (sv0 sv0Var3 = ((yw) sv0VarK).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                        if ((sv0Var3.g & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                sv0VarK = sv0Var3;
                                            } else {
                                                if (iy0Var == null) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (sv0VarK != null) {
                                                    iy0Var.b(sv0VarK);
                                                    sv0VarK = null;
                                                }
                                                iy0Var.b(sv0Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                sv0VarK = bl.k(iy0Var);
                            }
                        }
                        sv0Var2 = sv0Var2.i;
                    }
                }
                ql0VarP = ql0VarP.u();
                sv0Var2 = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
            }
            vg vgVar = (vg) obj;
            if (vgVar != null && (objB0 = vgVar.b0((c01VarO = bl.O(xwVar)), new y3(2, ha0Var, c01VarO), lsVar)) == wt.e) {
                return objB0;
            }
        }
        return t32.a;
    }

    public static xa u(xa xaVar, float f2) {
        float f3 = ((ya) xaVar.g).a;
        return new xa(xaVar.e, Float.valueOf(f2), new ya(f3), xaVar.h, xaVar.i, xaVar.j);
    }

    public static final vt v(ob0 ob0Var) {
        return new md1(ob0Var.R);
    }

    public static void w(a5 a5Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        tl1 tl1Var;
        rl1 rl1Var;
        sa0 sa0Var;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse viewTranslationResponseQ = q4.q(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseQ != null && (value = viewTranslationResponseQ.getValue("android:text")) != null && (text = value.getText()) != null && (tl1Var = (tl1) a5Var.f().b((int) jKeyAt)) != null && (rl1Var = tl1Var.a) != null) {
                Object objG = rl1Var.d.e.g(ml1.l);
                if (objG == null) {
                    objG = null;
                }
                r0 r0Var = (r0) objG;
                if (r0Var != null && (sa0Var = (sa0) r0Var.b) != null) {
                }
            }
        }
    }

    public static final Paint x(p6 p6Var) {
        if (p6Var == null) {
            mg0.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + ad1.a(p6Var.getClass()).b());
        }
        return p6Var.a;
    }

    public static final ss1 y(mq1 mq1Var) {
        ss1 ss1Var = mq1Var.e;
        ss1Var.getClass();
        return (ss1) aq1.t(ss1Var, mq1Var);
    }

    public static final int z(mq1 mq1Var) {
        ss1 ss1Var = mq1Var.e;
        ss1Var.getClass();
        return ((ss1) aq1.h(ss1Var)).e;
    }
}
